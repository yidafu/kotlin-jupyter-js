package dev.yidafu.jupyter.processor

import dev.yidafu.jupyter.LibsMapping
import dev.yidafu.swc.dsl.createImportDeclaration
import dev.yidafu.swc.dsl.stringLiteral
import dev.yidafu.swc.emptySpan
import dev.yidafu.swc.types.*
import org.jetbrains.kotlin.backend.common.push

/**
 * replace packages in `libs-mapping.json` with ESM url
 *
 * ```js
 * import React from 'react';
 * ```
 *
 * will transform to
 *
 * ```js
 * import React from 'https://esm.sh/react@18.2.0';
 * ```
 */
class ImportSourceMappingProcessor : JavaScriptProcessor {
    override fun process(
        program: Program,
        context: JavascriptProcessContext,
    ) {
        if (program is Module) {
            val newBodyList = mutableListOf<ModuleItem>()
            program.body?.forEach { moduleItem ->
                newBodyList.push(moduleItem)
                if (moduleItem is ImportDeclaration) {
                    val originSource = moduleItem.source?.value
                    if (!originSource.isNullOrEmpty() && LibsMapping.default.containsKey(originSource)) {
                        val jsPackage = LibsMapping.default[originSource]
                        moduleItem.source!!.value = jsPackage?.mainSource
                        moduleItem.source!!.raw = "\"${jsPackage}\""
                        if (!jsPackage?.extraSources.isNullOrEmpty()) {
                            jsPackage!!.extraSources!!.forEach {
                                newBodyList.push(
                                    createImportDeclaration {
                                        span = emptySpan()
                                        source =
                                            stringLiteral {
                                                span = emptySpan()
                                                value = it
                                                raw = "\"$it\""
                                            }
                                    },
                                )
                            }
                        }
                    }
                }
            }

            program.body = newBodyList.toTypedArray()
        }
    }
}
