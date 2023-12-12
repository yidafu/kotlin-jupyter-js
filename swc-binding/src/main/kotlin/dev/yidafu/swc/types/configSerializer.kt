package dev.yidafu.swc.types

import kotlinx.serialization.modules.SerializersModule
import kotlinx.serialization.modules.polymorphic
import kotlinx.serialization.modules.subclass

val configSerializer = SerializersModule {
    polymorphic(ParserConfig::class) {
        subclass(TsParserConfig::class)
        subclass(EsParserConfig::class)
    }
}
