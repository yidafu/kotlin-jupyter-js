package dev.yidafu.swc.dsl

import dev.yidafu.swc.types.*

fun Config.options(block: Options.() -> Unit): Options {
    return Options().apply(block)
}

fun Config.envConfig(block: EnvConfig.() -> Unit): EnvConfig {
    return EnvConfig().apply(block)
}

fun Config.jscConfig(block: JscConfig.() -> Unit): JscConfig {
    return JscConfig().apply(block)
}

fun Config.es6Config(block: Es6Config.() -> Unit): Es6Config {
    return Es6Config().apply(block)
}

fun Config.commonJsConfig(block: CommonJsConfig.() -> Unit): CommonJsConfig {
    return CommonJsConfig().apply(block)
}

fun Config.umdConfig(block: UmdConfig.() -> Unit): UmdConfig {
    return UmdConfig().apply(block)
}

fun Config.amdConfig(block: AmdConfig.() -> Unit): AmdConfig {
    return AmdConfig().apply(block)
}

fun Config.nodeNextConfig(block: NodeNextConfig.() -> Unit): NodeNextConfig {
    return NodeNextConfig().apply(block)
}

fun Config.systemjsConfig(block: SystemjsConfig.() -> Unit): SystemjsConfig {
    return SystemjsConfig().apply(block)
}
