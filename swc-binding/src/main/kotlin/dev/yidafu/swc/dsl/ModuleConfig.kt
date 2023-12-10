package dev.yidafu.swc.dsl

import dev.yidafu.swc.types.*

fun ModuleConfig.es6Config(block: Es6Config.() -> Unit): Es6Config {
    return Es6Config().apply(block)
}

fun ModuleConfig.commonJsConfig(block: CommonJsConfig.() -> Unit): CommonJsConfig {
    return CommonJsConfig().apply(block)
}

fun ModuleConfig.umdConfig(block: UmdConfig.() -> Unit): UmdConfig {
    return UmdConfig().apply(block)
}

fun ModuleConfig.amdConfig(block: AmdConfig.() -> Unit): AmdConfig {
    return AmdConfig().apply(block)
}

fun ModuleConfig.nodeNextConfig(block: NodeNextConfig.() -> Unit): NodeNextConfig {
    return NodeNextConfig().apply(block)
}

fun ModuleConfig.systemjsConfig(block: SystemjsConfig.() -> Unit): SystemjsConfig {
    return SystemjsConfig().apply(block)
}
