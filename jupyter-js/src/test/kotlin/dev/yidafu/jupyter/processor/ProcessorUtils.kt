package dev.yidafu.jupyter.processor

import dev.yidafu.swc.SwcNative
import dev.yidafu.swc.generated.dsl.options
import dev.yidafu.swc.generated.Program
import dev.yidafu.swc.generated.dsl.esParseOptions

val compiler = SwcNative()

fun processTestScript(script: String): Program {
    return compiler.parseSync(script, esParseOptions { }, "test.js")
}

fun printTestProgram(porgram: Program): String {
    return compiler.printSync(
        porgram,
        options {
            filename = "test.js"
        },
    ).code
}
