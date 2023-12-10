package dev.yidafu.swc.dsl

import dev.yidafu.swc.types.*

fun OptimizerConfig.globalPassOption(block: GlobalPassOption.() -> Unit): GlobalPassOption {
    return GlobalPassOption().apply(block)
}
