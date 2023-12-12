package dev.yidafu.swc.dsl

import dev.yidafu.swc.types.*

fun BaseModuleConfig.es6Config(block: Es6Config.() -> Unit): Es6Config {
    return Es6Config().apply(block)
}

fun BaseModuleConfig.nodeNextConfig(block: NodeNextConfig.() -> Unit): NodeNextConfig {
    return NodeNextConfig().apply(block)
}

fun BaseModuleConfig.commonJsConfig(block: CommonJsConfig.() -> Unit): CommonJsConfig {
    return CommonJsConfig().apply(block)
}

fun BaseModuleConfig.umdConfig(block: UmdConfig.() -> Unit): UmdConfig {
    return UmdConfig().apply(block)
}

fun BaseModuleConfig.amdConfig(block: AmdConfig.() -> Unit): AmdConfig {
    return AmdConfig().apply(block)
}
