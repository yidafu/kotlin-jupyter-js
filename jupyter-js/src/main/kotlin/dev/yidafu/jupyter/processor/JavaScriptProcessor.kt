package dev.yidafu.jupyter.processor

import dev.yidafu.swc.types.Program

interface JavaScriptProcessor {
    fun process(
        program: Program,
        context: JavascriptProcessContext,
    )
}
