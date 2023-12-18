package dev.yidafu.jupyper.processor

import dev.yidafu.jupyper.LibsMapping
import dev.yidafu.swc.dsl.stringLiteral
import dev.yidafu.swc.emptySpan
import dev.yidafu.swc.types.*
import org.jetbrains.kotlin.backend.common.push

class ImportSourceMappingProcessor : JavaScriptProcessor {

    override fun process(program: Program, context: JavascriptProcessContext) {
        if (program is Module) {

            val newBodyList = mutableListOf<ModuleItem>()
            program.body?.forEach{ moduleItem ->
                newBodyList.push(moduleItem)
                if (moduleItem is ImportDeclaration) {
                    val originSource = moduleItem.source?.value
                    if (!originSource.isNullOrEmpty() && LibsMapping.containsKey(originSource)) {
                        val jsPackage = LibsMapping[originSource]
                        moduleItem.source!!.value = jsPackage?.mainSource
                        moduleItem.source!!.raw = "\"${jsPackage}\""
                        if (!jsPackage?.extraSources.isNullOrEmpty()) {
                             jsPackage!!.extraSources!!.forEach {
                                newBodyList.push(ImportDeclarationImpl().apply {
                                    span = emptySpan()
                                    source = stringLiteral {
                                        span = emptySpan()
                                        value = it
                                        raw = "\"$it\""
                                    }
                                })
                            }
                        }
                    }
                }
            }

            program.body = newBodyList.toTypedArray()
        }
    }
}
