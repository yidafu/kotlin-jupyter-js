package dev.yidafu.jupyter.processor


import dev.yidafu.swc.generated.*
import dev.yidafu.swc.generated.dsl.*

/**
 * JavaScript processor interface
 *
 * Base interface for all JavaScript code processors
 * Processors execute in order, transforming and modifying AST
 *
 * Implementations:
 * - JupyterImportProcessor: Processes @jupyter virtual package imports
 * - ImportSourceMappingProcessor: Maps library names to CDN URLs
 * - InlineImportSourceProcessor: Processes inline import sources
 * - DefaultExportProcessor: Processes default exports (for JSX)
 */
interface JavaScriptProcessor {
    /**
     * Processes AST program node
     *
     * @param program AST program node, will be modified
     * @param context JavaScript processing context for storing information during processing
     */
    fun process(
        program: Program,
        context: JavascriptProcessContext,
    )
}
