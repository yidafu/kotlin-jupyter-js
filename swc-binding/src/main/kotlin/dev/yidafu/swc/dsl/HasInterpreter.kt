package dev.yidafu.swc.dsl

import dev.yidafu.swc.types.*

/**
 * subtype of HasInterpreter
 */
fun HasInterpreter.module(block: Module.() -> Unit): Module {
    return ModuleImpl().apply(block)
}

/**
 * subtype of HasInterpreter
 */
fun HasInterpreter.script(block: Script.() -> Unit): Script {
    return ScriptImpl().apply(block)
}
