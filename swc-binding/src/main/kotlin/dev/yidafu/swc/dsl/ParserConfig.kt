package dev.yidafu.swc.dsl

import dev.yidafu.swc.types.*

fun ParserConfig.tsParserConfig(block: TsParserConfig.() -> Unit): TsParserConfig {
    return TsParserConfig().apply(block)
}

fun ParserConfig.esParserConfig(block: EsParserConfig.() -> Unit): EsParserConfig {
    return EsParserConfig().apply(block)
}
