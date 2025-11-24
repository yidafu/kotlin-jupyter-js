@file:Suppress("ktlint:standard:no-wildcard-imports")

package dev.yidafu.jupyter.processor

import dev.yidafu.jupyter.JSX_DEFAULT_EXPORT_VARIABLE_NAME
import dev.yidafu.swc.emptySpan
import dev.yidafu.swc.generated.*
import dev.yidafu.swc.generated.dsl.*
import dev.yidafu.swc.generated.dsl.createVariableDeclaration
import dev.yidafu.swc.generated.dsl.identifier
import dev.yidafu.swc.generated.dsl.variableDeclarator
import org.slf4j.LoggerFactory

/**
 * process JSX default export to variable declaration
 *
 * for example:
 *
 * ```jsx
 *  export function App() {
 *      return <div />
 *  }
 * ```
 * will transform to
 *
 * ```js
 * const __JupyterCellDefaultExportVariable__ = App;
 * ```
 */
class DefaultExportProcessor : JavaScriptProcessor {
    override fun process(
        program: Program,
        context: JavascriptProcessContext,
    ) {
        if (program is Module) {
            program.body?.forEachIndexed { index, moduleItem ->
                if (moduleItem is ExportDefaultDeclaration) {
                    val decl = moduleItem.decl as Node as Expression
                    // Extract the identifier name if it's an identifier
                    val exportValue =
                        decl as? Identifier
                            ?: // For function expressions or other expressions, use the original expression
                            decl

                    replaceDefaultExportVariableDeclaration(program, index, exportValue)
                } else if (moduleItem is ExportDefaultExpression) {
                    val expr: Expression? = moduleItem.expression
                    if (expr != null) {
                        replaceDefaultExportVariableDeclaration(program, index, expr)
                    }
                }
//                else if (moduleItem is ExportDefaultSpecifier) {
//                        val identifier = moduleItem.exported
//                        if (identifier != null) {
//                            replaceDefaultExportVariableDeclaration(program, index, identifier)
//                        }
//                    }
            }
        }
    }

    fun replaceDefaultExportVariableDeclaration(
        program: Module,
        index: Int,
        initExpr: Expression,
    ) {
        val varDecl =
            createVariableDeclaration {
                span = emptySpan()
                kind = VariableDeclarationKind.CONST

                declarations =
                    arrayOf(
                        variableDeclarator {
                            id =
                                identifier {
                                    value = JSX_DEFAULT_EXPORT_VARIABLE_NAME
                                    optional = false
                                    span = emptySpan()
                                }
                            init = initExpr
                            span = emptySpan()
                        },
                    )
            }
        program.body!![index] = varDecl
    }
}
