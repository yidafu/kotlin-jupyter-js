@file:Suppress("ktlint:standard:no-wildcard-imports")

package dev.yidafu.jupyper.processor

import dev.yidafu.jupyper.JSX_DEFAULT_EXPORT_VARIABLE_NAME
import dev.yidafu.swc.emptySpan
import dev.yidafu.swc.generated.*
import dev.yidafu.swc.generated.dsl.*

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
 * const __JupyterCellDefaultExportVariable__ = function App() {
 *      return <div />
 * }
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
                                        init = decl
                                        span = emptySpan()
                                    },
                                )
                        }
                    program.body!![index] = varDecl
                }
            }
        }
    }

}
