package dev.yidafu.swc

import dev.yidafu.swc.types.swcSerializersModule
import kotlinx.serialization.ExperimentalSerializationApi
import kotlinx.serialization.json.Json

@OptIn(ExperimentalSerializationApi::class)
val astJson =
    Json {
        encodeDefaults = true
        explicitNulls = false
        classDiscriminator = "type"
        serializersModule = swcSerializersModule
        // TODO: @swc/types seems incomplete
        ignoreUnknownKeys = true
    }

val configJson =
    Json {
        encodeDefaults = true
        explicitNulls = false
        classDiscriminator = "syntax"
        serializersModule = swcSerializersModule
    }
