package dev.yidafu.swc.dsl

import dev.yidafu.swc.types.*

fun Options.callerOptions(block: CallerOptions.() -> Unit): CallerOptions {
    return CallerOptions().apply(block)
}

fun Options.matchPattern(block: MatchPattern.() -> Unit): MatchPattern {
    return MatchPattern().apply(block)
}

fun Options.plugin(block: Plugin.() -> Unit): Plugin {
    return Plugin().apply(block)
}

fun Options.envConfig(block: EnvConfig.() -> Unit): EnvConfig {
    return EnvConfig().apply(block)
}

fun Options.jscConfig(block: JscConfig.() -> Unit): JscConfig {
    return JscConfig().apply(block)
}

fun Options.es6Config(block: Es6Config.() -> Unit): Es6Config {
    return Es6Config().apply(block)
}

fun Options.commonJsConfig(block: CommonJsConfig.() -> Unit): CommonJsConfig {
    return CommonJsConfig().apply(block)
}

fun Options.umdConfig(block: UmdConfig.() -> Unit): UmdConfig {
    return UmdConfig().apply(block)
}

fun Options.amdConfig(block: AmdConfig.() -> Unit): AmdConfig {
    return AmdConfig().apply(block)
}

fun Options.nodeNextConfig(block: NodeNextConfig.() -> Unit): NodeNextConfig {
    return NodeNextConfig().apply(block)
}

fun Options.systemjsConfig(block: SystemjsConfig.() -> Unit): SystemjsConfig {
    return SystemjsConfig().apply(block)
}
