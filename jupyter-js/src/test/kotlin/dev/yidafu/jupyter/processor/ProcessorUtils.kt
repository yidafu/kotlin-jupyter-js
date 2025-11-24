package dev.yidafu.jupyter.processor

import dev.yidafu.swc.SwcNative
import dev.yidafu.swc.emptySpan
import dev.yidafu.swc.generated.Module
import dev.yidafu.swc.generated.Program
import dev.yidafu.swc.generated.VariableDeclaration
import dev.yidafu.swc.generated.dsl.esParseOptions
import dev.yidafu.swc.generated.dsl.options

val compiler = SwcNative()

fun processTestScript(script: String): Program = compiler.parseSync(script, esParseOptions { }, "test.js")

fun printTestProgram(porgram: Program): String =
    compiler
        .printSync(
            porgram,
            options {
                filename = "test.js"
            },
        ).code

fun printTestVariableDeclaration(declaration: VariableDeclaration): String {
    val module = Module()
    module.span = emptySpan()
    module.body = arrayOf(declaration)
    return printTestProgram(module)
}
