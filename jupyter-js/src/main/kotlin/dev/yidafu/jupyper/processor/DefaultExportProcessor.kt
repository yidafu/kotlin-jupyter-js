package dev.yidafu.jupyper.processor

import dev.yidafu.jupyper.JSX_DEFAULT_EXPORT_VARIABLE_NAME
import dev.yidafu.swc.dsl.identifier
import dev.yidafu.swc.dsl.variableDeclarator
import dev.yidafu.swc.emptySpan
import dev.yidafu.swc.types.* // ktlint-disable no-wildcard-imports

class DefaultExportProcessor : JavaScriptProcessor {
    override fun process(program: Program) {
        if (program is Module) {
            program.body?.forEachIndexed { index, moduleItem ->
                if (moduleItem is ExportDefaultDeclaration) {
                    val decl = moduleItem.decl as Node as Expression
                    val varDecl = VariableDeclarationImpl().apply {
                        span = emptySpan()
                        kind = "const"

                        declarations = arrayOf(
                            variableDeclarator {
                                id = identifier {
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
