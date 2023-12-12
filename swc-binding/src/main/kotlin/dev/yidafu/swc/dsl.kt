package dev.yidafu.swc

import dev.yidafu.swc.types.*

fun module(block: Module.() -> Unit): Module {
    return ModuleImpl().apply(block)
}

fun options(block: Options.() -> Unit): Options {
    return Options().apply(block)
}

fun tsParseOptions(block: TsParserConfig.() -> Unit): TsParserConfig {
    return TsParserConfig().apply(block)
}

fun esParseOptions(block: EsParserConfig.() -> Unit): EsParserConfig {
    return EsParserConfig().apply(block)
}
