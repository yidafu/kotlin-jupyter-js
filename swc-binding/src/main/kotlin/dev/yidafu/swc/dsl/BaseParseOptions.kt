package dev.yidafu.swc.dsl

import dev.yidafu.swc.types.*

fun BaseParseOptions.tsParserConfig(block: TsParserConfig.() -> Unit): TsParserConfig {
    return TsParserConfig().apply(block)
}

fun BaseParseOptions.esParserConfig(block: EsParserConfig.() -> Unit): EsParserConfig {
    return EsParserConfig().apply(block)
}
