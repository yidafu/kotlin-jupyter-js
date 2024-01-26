package dev.yidafu.jupyper.processor

import dev.yidafu.jupyper.swc.forEachImportDeclaration
import dev.yidafu.jupyper.swc.getValue
import dev.yidafu.jupyper.swc.replace
import dev.yidafu.swc.dsl.*
import dev.yidafu.swc.emptySpan
import dev.yidafu.swc.types.*
import org.slf4j.LoggerFactory
import java.io.File
import java.net.URL
import kotlin.io.encoding.Base64
import kotlin.io.encoding.ExperimentalEncodingApi

/**
 * process inline code
 * + relative/absolute local js file
 * + remote js file
 *     ```js
 *     import { foo } from './local.js';
 *     console.log(foo);
 *     ```
 *     ```js
 *     // ./local.js
 *     export const foo 'bar';
 *     ```
 *
 *     transform to
 *
 *     ```js
 *     const localJsExports = (function (exports = {}) {
 *         const foo = "bar";
 *
 *         exports.foo = foo;
 *         return exports;
 *     })()
 *
 *     const foo = localJsExports.foo;
 *     ```
 */
class InlineImportSourceProcessor : JavaScriptProcessor {
    private val log = LoggerFactory.getLogger(InlineImportSourceProcessor::class.java)

    override fun process(
        program: Program,
        context: JavascriptProcessContext,
    ) {
        if (program is Module) {
            program.forEachImportDeclaration {
                val originSource = it.source?.value
                if (!originSource.isNullOrEmpty()) {
                    // relative path, absolute path
                    val inlineContext =
                        if (
                            originSource.startsWith(".") ||
                            originSource.startsWith("/")
                        ) {
                            val file = File(originSource)
                            log.info("read local js script ${file.absolutePath}")
                            file.readText()
                        } else {
                            // inline remote source
                            if (originSource.substringAfter("?").contains("inline")) {
                                log.info("fetch remote script $originSource")
                                URL(originSource).readText()
                            } else {
                                ""
                            }
                        }

                    log.info("inline js context {}", inlineContext)
                    if (inlineContext.isNotEmpty()) {
                        context.dependencyScope(originSource) {
                            val inlineProgram = context.processor.parseJsCode(inlineContext, context)
                            if (inlineProgram is Module) {
                                program.replace(it, toIIFE(url2VarName(originSource), inlineProgram))
                            }
                        }
                    }
                }
            }
        }
    }

    @OptIn(ExperimentalEncodingApi::class)
    fun url2VarName(url: String): String {
        return "inline_" + Base64.encode(url.toByteArray()).replace("=", "")
    }

    private fun toIIFE(
        varName: String,
        module: Module,
    ): VariableDeclaration {
        return createVariableDeclaration {
            span = emptySpan()
            kind = "const"
            declarations =
                arrayOf(
                    variableDeclarator {
                        span = emptySpan()
                        id =
                            identifier {
                                span = emptySpan()
                                value = varName
                            }
                        definite = false
                        init =
                            callExpression {
                                span = emptySpan()
                                callee =
                                    parenthesisExpression {
                                        span = emptySpan()
                                        expression =
                                            functionExpression {
                                                span = emptySpan()
                                                async = false
                                                generator = false
                                                params =
                                                    arrayOf(
                                                        param {
                                                            span = emptySpan()
                                                            decorators = emptyArray()
                                                            pat =
                                                                assignmentExpression {
                                                                    operator = "="
                                                                    span = emptySpan()
                                                                    left =
                                                                        identifier {
                                                                            span = emptySpan()
                                                                            value = "exports"
                                                                            optional = false
                                                                        }
                                                                    right =
                                                                        objectExpression {
                                                                            span = emptySpan()
                                                                            properties = emptyArray()
                                                                        }
                                                                }
                                                        },
                                                    )
                                                body =
                                                    blockStatement {
                                                        span = emptySpan()

                                                        stmts =
                                                            (
                                                                transformExport(
                                                                    module.body?.map { it as Statement }
                                                                        ?: emptyList(),
                                                                ) +
                                                                    listOf(
                                                                        returnStatement {
                                                                            span = emptySpan()
                                                                            argument =
                                                                                identifier {
                                                                                    span = emptySpan()
                                                                                    value = "exports"
                                                                                    optional = false
                                                                                }
                                                                        },
                                                                    )
                                                            ).toTypedArray()
                                                    }
                                            }
                                    }
                            }
                    },
                )
        }
    }

    /**
     * https://developer.mozilla.org/zh-CN/docs/Web/JavaScript/Reference/Statements/export
     */
    private fun transformExport(stats: List<Statement>): List<Statement> {
        val newStats = mutableListOf<Statement>()
        stats.forEach {
            when (it) {
                // export const var1 = "foo";
                is ExportDeclaration -> {
                    val declaration = it.declaration
                    if (declaration != null) {
                        newStats.add(declaration)
                        when (declaration) {
                            is VariableDeclaration -> {
                                declaration.declarations?.forEach { desc ->
                                    when (val id = desc.id) {
                                        is Identifier -> {
                                            id.value?.let { iName ->
                                                newStats.add(createExportAssignmentExpression(iName, iName))
                                            }
                                        }
                                        is ObjectPattern -> {
                                            val i = desc.init
                                            if (i is Identifier) {
                                                val objName = i.value
                                                id.properties?.forEach { prop ->
                                                    fun createRightExpr(propName: String): MemberExpression {
                                                        return createMemberExpression {
                                                            span = emptySpan()
                                                            jsObject =
                                                                identifier {
                                                                    span = emptySpan()
                                                                    value = objName
                                                                    optional = false
                                                                }
                                                            property =
                                                                identifier {
                                                                    span = emptySpan()
                                                                    value = propName
                                                                    optional = false
                                                                }
                                                        }
                                                    }
                                                    when (prop) {
                                                        is AssignmentPatternProperty -> {
                                                            val propName = prop.key?.value
                                                            if (propName != null) {
                                                                newStats.add(
                                                                    createExportAssignmentExpression(
                                                                        propName,
                                                                        createRightExpr(propName),
                                                                    ),
                                                                )
                                                            }
                                                        }
                                                        is KeyValuePatternProperty -> {
                                                            val propName = prop.key.getValue()!!
                                                            newStats.add(
                                                                createExportAssignmentExpression(
                                                                    propName,
                                                                    createRightExpr(propName),
                                                                ),
                                                            )
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }

                            is FunctionDeclaration -> {
                                declaration.identifier?.value?.let { iName ->
                                    newStats.add(createExportAssignmentExpression(iName, iName))
                                }
                            }

                            is ClassDeclaration -> {
                                declaration.identifier?.value?.let { iName ->
                                    newStats.add(createExportAssignmentExpression(iName, iName))
                                }
                            }
                        }
                    }
                }
                // export default function foo () { };
                is ExportDefaultDeclaration -> {
                    val defaultExpr = it.decl as Expression
                    createExportAssignmentExpression("default", defaultExpr)
                }
                // export deafult "expression";
                is ExportDefaultExpression -> {
                    if (it.expression != null) {
                        newStats.add(createExportAssignmentExpression("default", it.expression!!))
                    }
                }
                // export { foo, bar as "name", baz as name2 }
                is ExportNamedDeclaration -> {
                    it.specifiers?.forEach { specifier ->
                        when (specifier) {
                            is NamedExportSpecifier -> {
                                val orig = specifier.orig.getValue()
                                val exported = specifier.exported.getValue() ?: orig
//                                    newStats.add(createExportAssignment(exported!!, orig!!))
                            }
                        }
                    }
                }

                else -> {
                    newStats.add(it)
                }
            }
        }
        return newStats
    }

    fun createExportAssignmentExpression(
        leftName: String,
        rightName: String,
    ): ExpressionStatement {
        val expr: Expression =
            createIdentifier {
                span = emptySpan()
                value = rightName
                optional = false
            }
        return createExportAssignmentExpression(leftName, expr)
    }

    fun createExportAssignmentExpression(
        leftName: String,
        rightExpr: Expression,
    ): ExpressionStatement {
        return createExpressionStatement {
            span = emptySpan()
            expression =
                assignmentExpression {
                    span = emptySpan()
                    operator = "="
                    left =
                        memberExpression {
                            span = emptySpan()
                            jsObject =
                                identifier {
                                    span = emptySpan()
                                    value = "exports"
                                    optional = false
                                }
                            property =
                                identifier {
                                    span = emptySpan()
                                    value = leftName
                                    optional = false
                                }
                        }
                    right = rightExpr
                }
        }
    }
}
