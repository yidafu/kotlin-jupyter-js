package dev.yidafu.jupyter.processor

import dev.yidafu.swc.SwcNative
import dev.yidafu.swc.esParseOptions
import dev.yidafu.swc.options
import dev.yidafu.swc.generated.Program

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
