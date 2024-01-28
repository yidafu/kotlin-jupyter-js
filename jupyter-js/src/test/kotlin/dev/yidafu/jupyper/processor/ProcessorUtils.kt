package dev.yidafu.jupyper.processor

import dev.yidafu.swc.SwcNative
import dev.yidafu.swc.esParseOptions
import dev.yidafu.swc.types.Program


val compiler = SwcNative()
fun processTestScript(script: String): Program {
    return compiler.parseSync(script, esParseOptions {  }, "test.js")
}