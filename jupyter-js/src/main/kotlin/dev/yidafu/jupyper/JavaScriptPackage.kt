package dev.yidafu.jupyper

import kotlinx.serialization.*
import kotlinx.serialization.builtins.ListSerializer
import kotlinx.serialization.builtins.serializer
import kotlinx.serialization.descriptors.*
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.encoding.encodeStructure
import kotlinx.serialization.json.*

@Serializable(JavaScriptPackageSerializer::class)
data class JavaScriptPackage(
    val mainSource: String,
    val extraSources: List<String>? = null
) {
    override fun toString(): String {
        return mainSource
    }
}
val importSourceDescriptor = PrimitiveSerialDescriptor("importSource", PrimitiveKind.STRING)

@OptIn(ExperimentalSerializationApi::class)
val extraSourcesDescriptor =
    listSerialDescriptor(PrimitiveSerialDescriptor("importSource", PrimitiveKind.STRING))

class JavaScriptPackageSerializer : KSerializer<JavaScriptPackage> {
    override val descriptor = buildClassSerialDescriptor(
        "JavaScriptPackage"
    ) {
        element<String>("main")
        element<List<String>>("extra")
    }

    override fun deserialize(decoder: Decoder): JavaScriptPackage {
        val jsonEncoder = decoder as JsonDecoder
        val obj = jsonEncoder.decodeJsonElement()
        return when (obj) {
            is JsonPrimitive -> {
                JavaScriptPackage(obj.content)
            }
            is JsonObject -> {
                val importSource = when (val default = obj["main"]) {
                    is JsonPrimitive -> default.content
                    else -> {
                        throw IllegalStateException("default filed must be string")
                    }
                }
                val extraSources = when (val extra = obj["extra"]) {
                    is JsonArray -> extra.map {
                        if (it is JsonPrimitive && it.isString) {
                            it.content
                        } else {
                            throw IllegalStateException("extra field must be Array<string>")
                        }
                    }
                    else -> {
                        throw IllegalStateException("extra field must be Array")
                    }
                }
                JavaScriptPackage(
                    importSource,
                    extraSources
                )
            }

            else -> {
                throw IllegalStateException("JavaScriptPackage must be string or object { importSource: string, extraSources: string[} }")
            }
        }
    }

    override fun serialize(encoder: Encoder, value: JavaScriptPackage) {
        if (value.extraSources.isNullOrEmpty()) {
            encoder.encodeString(value.mainSource)
        } else {
            encoder.encodeStructure(descriptor) {
                encodeStringElement(descriptor, 0, value.mainSource)
                encodeSerializableElement(descriptor, 1, ListSerializer(String.serializer()), value.extraSources)
            }
        }
    }
}
