package dev.yidafu.swc.dsl

import dev.yidafu.swc.types.*

fun TransformConfig.reactConfig(block: ReactConfig.() -> Unit): ReactConfig {
    return ReactConfig().apply(block)
}

fun TransformConfig.constModulesConfig(block: ConstModulesConfig.() -> Unit): ConstModulesConfig {
    return ConstModulesConfig().apply(block)
}

fun TransformConfig.optimizerConfig(block: OptimizerConfig.() -> Unit): OptimizerConfig {
    return OptimizerConfig().apply(block)
}
