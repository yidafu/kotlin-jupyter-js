package dev.yidafu.swc.dsl

import dev.yidafu.swc.types.*

fun JscConfig.tsParserConfig(block: TsParserConfig.() -> Unit): TsParserConfig {
    return TsParserConfig().apply(block)
}

fun JscConfig.esParserConfig(block: EsParserConfig.() -> Unit): EsParserConfig {
    return EsParserConfig().apply(block)
}

fun JscConfig.transformConfig(block: TransformConfig.() -> Unit): TransformConfig {
    return TransformConfig().apply(block)
}

fun JscConfig.jsMinifyOptions(block: JsMinifyOptions.() -> Unit): JsMinifyOptions {
    return JsMinifyOptions().apply(block)
}
