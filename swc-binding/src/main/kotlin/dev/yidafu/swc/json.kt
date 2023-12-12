package dev.yidafu.swc

import dev.yidafu.swc.types.configSerializer
import dev.yidafu.swc.types.swcSerializersModule
import kotlinx.serialization.ExperimentalSerializationApi
import kotlinx.serialization.json.Json

@OptIn(ExperimentalSerializationApi::class)
val astJson = Json {
    classDiscriminator = "type"
    serializersModule = swcSerializersModule
    // TODO: @swc/types seems incomplete
    ignoreUnknownKeys = true
}

val configJson = Json {
    classDiscriminator = "syntax"
    serializersModule = configSerializer
}
