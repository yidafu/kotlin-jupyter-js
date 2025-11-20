package dev.yidafu.jupyter.processor

import dev.yidafu.jupyter.LibsMapping
import dev.yidafu.swc.generated.dsl.createImportDeclaration
import dev.yidafu.swc.generated.dsl.stringLiteral
import dev.yidafu.swc.emptySpan
import org.jetbrains.kotlin.backend.common.push

import dev.yidafu.swc.generated.*
import dev.yidafu.swc.generated.dsl.*

/**
 * Import source mapping processor
 *
 * Replaces library name imports (e.g., `import React from 'react'`) in JavaScript code
 * with actual CDN URLs (e.g., `import React from 'https://esm.sh/react@18.2.0'`)
 *
 * Mapping sources:
 * 1. Runtime configuration (ConfigManager, higher priority)
 * 2. Static configuration (libs-mapping.json)
 *
 * Transformation example:
 * ```js
 * import React from 'react';
 * ```
 * Transforms to:
 * ```js
 * import React from 'https://esm.sh/react@18.2.0';
 * ```
 *
 * If library configuration includes extra dependencies (extraSources), additional import statements are automatically added
 */
class ImportSourceMappingProcessor : JavaScriptProcessor {
    /**
     * Processes import statements in AST
     *
     * Processing flow:
     * 1. Iterate through all ImportDeclaration nodes
     * 2. Check if import source exists in library mapping table
     * 3. If mapping exists, replace with actual CDN URL
     * 4. If configuration includes extra dependencies, add additional import statements
     *
     * @param program AST program node
     * @param context JavaScript processing context
     */
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
                        if (jsPackage != null) {
                            moduleItem.source!!.value = jsPackage.mainSource
                            moduleItem.source!!.raw = "\"${jsPackage.mainSource}\""
                            if (!jsPackage.extraSources.isNullOrEmpty()) {
                                jsPackage.extraSources!!.forEach {
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
            }

            program.body = newBodyList.toTypedArray()
        }
    }
}
