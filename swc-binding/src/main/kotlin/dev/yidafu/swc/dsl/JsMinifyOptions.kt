package dev.yidafu.swc.dsl

import dev.yidafu.swc.types.*

fun JsMinifyOptions.jsFormatOptions(block: JsFormatOptions.() -> Unit): JsFormatOptions {
    return JsFormatOptions().apply(block)
}
