package dev.yidafu.jupyper.processor

import dev.yidafu.swc.SwcNative
import dev.yidafu.swc.generated.*
import dev.yidafu.swc.generated.dsl.*

val compiler = SwcNative()

fun processTestScript(script: String): Program {
    return compiler.parseSync(script, esParseOptions { }, "test.js")
}
