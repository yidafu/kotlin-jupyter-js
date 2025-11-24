@file:Suppress("ktlint:standard:no-wildcard-imports")

package dev.yidafu.jupyter.processor

import dev.yidafu.jupyter.LanguageType
import dev.yidafu.jupyter.swc.forEachImportDeclaration
import dev.yidafu.jupyter.swc.getValue
import dev.yidafu.jupyter.swc.replace
import dev.yidafu.swc.emptySpan
import dev.yidafu.swc.generated.*
import dev.yidafu.swc.generated.dsl.*
import kotlinx.serialization.Serializable
import org.slf4j.LoggerFactory
import java.io.File
import java.net.URI
import java.net.URL

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
//        val inlineSourceCache = mutableMapOf<String, VariableDeclaration>()
        if (program is Module) {
            program.forEachImportDeclaration { declaration ->
                val originSource = declaration.source?.value
                if (!originSource.isNullOrEmpty()) {
                    // Skip CDN URLs that don't have ?inline parameter
                    // These are library imports (e.g., react, lodash) that have been mapped by ImportSourceMappingProcessor
                    if (
                        (originSource.startsWith("http://") || originSource.startsWith("https://")) &&
                        !originSource.substringAfter("?").contains("inline")
                    ) {
                        // This is a CDN library import, skip inline processing
                        return@forEachImportDeclaration
                    }

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
                    log.debug("inline js context \n\n{}", inlineContext)
                    val langType = url2LanguageType(originSource)
                    if (inlineContext.isNotEmpty()) {
                        log.info("dependency scope $originSource")
                        context.dependencyScope<String>(originSource) {
                            val replacements = mutableListOf<Statement>()

                            val globalVarName = url2VarName(originSource)
                            val localVarName = url2VarName(originSource, false)

                            val varDeclaration = createImportStatement(localVarName, globalVarName)
                            replacements.add(varDeclaration)
                            if (!context.hasImport(globalVarName)) {
                                context.addImport(globalVarName)
                                val inlineProgram =
                                    when (langType) {
                                        LanguageType.JS -> context.processor.parseJsCode(inlineContext, context)

                                        LanguageType.TS -> context.processor.transformTsCode(inlineContext, context)

                                        LanguageType.JSX -> context.processor.transformJsxCode(inlineContext, context)

                                        LanguageType.TSX -> context.processor.transformTsxCode(inlineContext, context)

                                        // unreachable
                                        else -> throw IllegalStateException("Jupyter Js only support .js/.ts/.jsx/.tsx")
                                    }

                                val iife = toIIFE(globalVarName, inlineProgram as Module)
                                context.addGlobalImportStat(globalVarName, iife)
                            }

//                            if (inlineProgram is Module) {

                            val variableDeclarations =
                                declaration.specifiers?.mapNotNull { specifier ->
                                    when (specifier) {
                                        // import Foo from 'foo.js';
                                        is ImportDefaultSpecifier -> {
                                            createImportVariableDeclaration(
                                                specifier.local?.value!!,
                                                localVarName,
                                                "default",
                                            )
                                        }

                                        // import { foo } from 'foo.js';
                                        is NamedImportSpecifier -> {
                                            val variableName = specifier.local?.value!!
                                            createImportVariableDeclaration(
                                                variableName,
                                                localVarName,
                                                variableName,
                                            )
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
                                                    value = localVarName
                                                },
                                            )
                                        }

                                        else -> {
                                            null
                                        }
                                    }
                                } ?: emptyList()
                            replacements.addAll(variableDeclarations)
                            program.replace(declaration, *(replacements.toTypedArray()))
//                            }

                            globalVarName
                        }
                    }
                }
            }
        }
    }

    private fun url2LanguageType(url: String): LanguageType {
        val path = URI(url).path
        val lastDotIndex = path.lastIndexOf(".")
        if (lastDotIndex == -1) {
            // 没有文件扩展名，默认为 JavaScript
            return LanguageType.JS
        }
        val ext = path.substring(lastDotIndex)
        return when (ext) {
            ".mjs" -> LanguageType.JS
            ".js" -> LanguageType.JS
            ".jsx" -> LanguageType.JSX
            ".ts" -> LanguageType.TS
            ".tsx" -> LanguageType.TSX
            else -> LanguageType.Kotlin
        }
    }

    private fun createImportStatement(
        var1: String,
        var2: String,
    ): VariableDeclaration =
        createVariableDeclaration {
            span = emptySpan()
            kind = VariableDeclarationKind.CONST
            declarations =
                arrayOf(
                    variableDeclarator {
                        span = emptySpan()
                        id =
                            identifier {
                                span = emptySpan()
                                value = var1
                            }
                        definite = false
                        init =
                            identifier {
                                span = emptySpan()
                                value = var2
                            }
                    },
                )
        }

    private fun toIIFE(
        varName: String,
        module: Module,
    ): VariableDeclaration =
        createVariableDeclaration {
            span = emptySpan()
            kind = VariableDeclarationKind.CONST
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
                                                                    operator = AssignmentOperator.Assignment
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
                                                    fun createRightExpr(propName: String): MemberExpression =
                                                        createMemberExpression {
                                                            span = emptySpan()
                                                            `object` =
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

                                                        is RestElement -> {
                                                            // Rest element in object pattern, skip
                                                        }

                                                        else -> {
                                                            // Other pattern properties, skip
                                                        }
                                                    }
                                                }
                                            }
                                        }

                                        else -> {
                                            // Other patterns (ArrayPattern, AssignmentPattern, etc.), skip
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

                            // never reach case below, because TypeScript will transform to JavaScript at beginning
                            // is TsEnumDeclaration,
                            // is TsInterfaceDeclaration,
                            // is TsModuleDeclaration,
                            // is TsTypeAliasDeclaration,
                            // -> {
                            //     // TypeScript declarations, skip export assignment
                            // }

                            else -> {
                                // Other declaration types, skip
                            }
                        }
                    }
                }

                // export default function foo () { };
                is ExportDefaultDeclaration -> {
                    val defaultExpr = it.decl as Expression
                    newStats.add(createExportAssignmentExpression("default", defaultExpr))
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

                            is ExportDefaultSpecifier -> {
                                // Export default specifier, skip
                            }

                            is ExportNamespaceSpecifier -> {
                                // Export namespace specifier, skip
                            }

                            else -> {
                                // Other specifier types, skip
                            }
                        }
                    }
                }

                // never reach case below, because TypeScript will transform to JavaScript at beginning
                // is ExportAllDeclaration,
                // is ImportDeclaration,
                // is TsExportAssignment,
                // is TsImportEqualsDeclaration,
                // is TsNamespaceExportDeclaration,
                // -> {
                //     // Other export/import types, skip
                // }

                else -> {
                    // Other ModuleItem types that are not exports, skip
                }
            }
        }
        return newStats
    }

    private fun createImportVariableDeclaration(
        varName: String,
        jsObjName: String,
        propName: String,
    ): VariableDeclaration =
        createImportVariableDeclaration(
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

    private fun createImportVariableDeclaration(
        name: Identifier,
        jsObj: Identifier,
        prop: Identifier,
    ): VariableDeclaration =
        createImportVariableDeclaration(
            name,
            createMemberExpression {
                span = emptySpan()
                `object` = jsObj
                property = prop
            },
        )

    private fun createImportVariableDeclaration(
        varName: Identifier,
        initExpr: Expression,
    ): VariableDeclaration =
        createVariableDeclaration {
            span = emptySpan()
            kind = VariableDeclarationKind.CONST
            declarations =
                arrayOf(
                    variableDeclarator {
                        span = emptySpan()
                        id = varName
                        init = initExpr
                    },
                )
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
    ): ExpressionStatement =
        createExportAssignmentExpression(
            createIdentifier {
                span = emptySpan()
                value = leftName
                optional = false
            },
            expr,
        )

    private fun createExportAssignmentExpression(
        prop: Expression,
        expr: Expression,
    ): ExpressionStatement =
        createAssignmentExpression(
            createIdentifier {
                span = emptySpan()
                value = "exports"
                optional = false
            },
            prop,
            expr,
        )

    private fun createAssignmentExpression(
        jsObj: Expression,
        prop: Expression,
        rightExpr: Expression,
    ): ExpressionStatement =
        createExpressionStatement {
            span = emptySpan()
            expression =
                assignmentExpression {
                    span = emptySpan()
                    operator = AssignmentOperator.Assignment
                    left =
                        memberExpression {
                            span = emptySpan()
                            `object` = jsObj
                            property = prop as Node
                        }
                    right = rightExpr
                }
        }
}
