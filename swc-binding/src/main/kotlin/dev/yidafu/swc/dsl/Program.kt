package dev.yidafu.swc.dsl

import dev.yidafu.swc.types.*

/**
 * subtype of Program
 */
fun Program.module(block: Module.() -> Unit): Module {
    return ModuleImpl().apply(block)
}

/**
 * subtype of Program
 */
fun Program.script(block: Script.() -> Unit): Script {
    return ScriptImpl().apply(block)
}
