package dev.yidafu.swc

// import dev.yidafu.swc.types.optionModule
import dev.yidafu.swc.types.swcSerializersModule
import kotlinx.serialization.ExperimentalSerializationApi
import kotlinx.serialization.json.Json

@OptIn(ExperimentalSerializationApi::class)
val astJson = Json {
    encodeDefaults = true
    explicitNulls = false
    classDiscriminator = "type"
    serializersModule = swcSerializersModule
}
