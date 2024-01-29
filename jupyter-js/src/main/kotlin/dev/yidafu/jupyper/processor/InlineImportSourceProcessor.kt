package dev.yidafu.jupyper.processor

import dev.yidafu.jupyper.LanguageType
import dev.yidafu.jupyper.swc.forEachImportDeclaration
import dev.yidafu.jupyper.swc.getValue
import dev.yidafu.jupyper.swc.replace
import dev.yidafu.swc.dsl.*
import dev.yidafu.swc.emptySpan
import dev.yidafu.swc.types.*
import org.slf4j.LoggerFactory
import java.io.File
import java.net.URI
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
        val inlineSourceCache = mutableMapOf<String, VariableDeclaration>()
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
                                // readText is inline function, can't mock
                                URL(originSource).readBytes().toString(Charsets.UTF_8)
                            } else {
                                ""
                            }
                        }
//                    log.debug("inline js context {}", inlineContext)
                    val langType = url2LanguageType(originSource)
                    if (inlineContext.isNotEmpty()) {
                        context.dependencyScope(originSource) {
                            val inlineProgram =
                                when (langType) {
                                    LanguageType.JS -> context.processor.parseJsCode(inlineContext, context)
                                    LanguageType.TS -> context.processor.transformTsCode(inlineContext, context)
                                    LanguageType.JSX -> context.processor.transformJsxCode(inlineContext, context)
                                    LanguageType.TSX -> context.processor.transformTsxCode(inlineContext, context)
                                    // unreachable
                                    else -> throw IllegalStateException("Jupyter Js only support .js/.ts/.jsx/.tsx")
                                }

                            val varName = url2VarName(originSource)
                            if (inlineProgram is Module) {
                                val replacements = mutableListOf<Statement>()
                                if (!inlineSourceCache.containsKey(varName)) {
                                    val iife = toIIFE(varName, inlineProgram)
                                    inlineSourceCache[varName] = iife
                                    replacements.add(iife)
                                }

                                val variableDeclarations =
                                    it.specifiers?.mapNotNull { specifier ->
                                        when (specifier) {
                                            // import Foo from 'foo.js';
                                            is ImportDefaultSpecifier -> {
                                                createImportVariableDeclaration(
                                                    specifier.local?.value!!,
                                                    varName,
                                                    "default",
                                                )
                                            }
                                            // import { foo } from 'foo.js';
                                            is NamedImportSpecifier -> {
                                                val variableName = specifier.local?.value!!
                                                createImportVariableDeclaration(variableName, varName, variableName)
                                            }
                                            // import * as foo from 'foo.js'
                                            is ImportNamespaceSpecifier -> {
                                                createImportVariableDeclaration(
                                                    createIdentifier {
                                                        span = emptySpan()
                                                        value = specifier.local?.value!!
                                                        optional = false
                                                    },
                                                    createIdentifier {
                                                        span = emptySpan()
                                                        value = varName
                                                    },
                                                )
                                            }

                                            else -> null
                                        }
                                    } ?: emptyList()
                                replacements.addAll(variableDeclarations)
                                program.replace(it, *(replacements.toTypedArray()))
                            }
                        }
                    }
                }
            }
        }
    }

    private fun url2LanguageType(url: String): LanguageType {
        val path = URI(url).path
        val ext = path.substring(path.lastIndexOf("."))
        return when (ext) {
            ".mjs" -> LanguageType.JS
            ".js" -> LanguageType.JS
            ".jsx" -> LanguageType.JSX
            ".ts" -> LanguageType.TS
            ".tsx" -> LanguageType.TSX
            else -> LanguageType.Kotlin
        }
    }

    @OptIn(ExperimentalEncodingApi::class)
    private fun url2VarName(url: String): String {
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
                                                        val newStats =
                                                            module.body?.filterIsInstance<Statement>()
                                                                ?: emptyList()
                                                        val exportStats =
                                                            transformExport(
                                                                module.body?.filter { it !is Statement } ?: emptyList(),
                                                            )
                                                        val returnStat =
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
                                                        stmts = (newStats + exportStats + returnStat).toTypedArray()
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
    private fun transformExport(stats: List<ModuleItem>): List<Statement> {
        val newStats = mutableListOf<Statement>()
        stats.forEach {
            when (it) {
                // export const var1 = "foo";
                // export const { a, b: c } = o;
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
                                                            val key = prop.key
                                                            val value = prop.value
                                                            val expr =
                                                                if (value is Identifier) {
                                                                    createExportAssignmentExpression(
                                                                        value,
                                                                        value,
                                                                    )
                                                                } else {
                                                                    null
                                                                }
                                                            expr?.let { e -> newStats.add(e) }
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
                // export default "expression";
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
                                newStats.add(createExportAssignmentExpression(exported!!, orig!!))
                            }
                        }
                    }
                }
            }
        }
        return newStats
    }

    private fun createImportVariableDeclaration(
        varName: String,
        jsObjName: String,
        propName: String,
    ): VariableDeclaration {
        return createImportVariableDeclaration(
            createIdentifier {
                span = emptySpan()
                value = varName
                optional = false
            },
            createIdentifier {
                span = emptySpan()
                value = jsObjName
                optional = false
            },
            createIdentifier {
                span = emptySpan()
                value = propName
                optional = false
            },
        )
    }

    private fun createImportVariableDeclaration(
        name: Identifier,
        jsObj: Identifier,
        prop: Identifier,
    ): VariableDeclaration {
        return createImportVariableDeclaration(
            name,
            createMemberExpression {
                span = emptySpan()
                jsObject = jsObj
                property = prop
            },
        )
    }

    private fun createImportVariableDeclaration(
        varName: Identifier,
        initExpr: Expression,
    ): VariableDeclaration {
        return createVariableDeclaration {
            span = emptySpan()
            kind = "const"
            declarations =
                arrayOf(
                    variableDeclarator {
                        span = emptySpan()
                        id = varName
                        init = initExpr
                    },
                )
        }
    }

    private fun createExportAssignmentExpression(
        leftName: String,
        rightName: String,
    ): ExpressionStatement {
        val expr: Expression =
            createIdentifier {
                span = emptySpan()
                value = rightName
                optional = false
            }
        return createExportAssignmentExpression(
            createIdentifier {
                span = emptySpan()
                value = leftName
                optional = false
            },
            expr,
        )
    }

    private fun createExportAssignmentExpression(
        leftName: String,
        expr: Expression,
    ): ExpressionStatement {
        return createExportAssignmentExpression(
            createIdentifier {
                span = emptySpan()
                value = leftName
                optional = false
            },
            expr,
        )
    }

    private fun createExportAssignmentExpression(
        prop: MemberExpressionProperty,
        expr: Expression,
    ): ExpressionStatement {
        return createAssignmentExpression(
            createIdentifier {
                span = emptySpan()
                value = "exports"
                optional = false
            },
            prop,
            expr,
        )
    }

    private fun createAssignmentExpression(
        jsObj: Expression,
        prop: MemberExpressionProperty,
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
                            jsObject = jsObj
                            property = prop
                        }
                    right = rightExpr
                }
        }
    }
}
