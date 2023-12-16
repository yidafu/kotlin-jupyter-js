package dev.yidafu.jupyper.processor

import dev.yidafu.swc.types.Program

interface JavaScriptProcessor {
    fun process(program: Program)
}
