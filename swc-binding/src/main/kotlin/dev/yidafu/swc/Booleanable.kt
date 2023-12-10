package dev.yidafu.swc.booleanable

import dev.yidafu.swc.types.MatchPattern
import dev.yidafu.swc.types.TerserCompressOptions
import dev.yidafu.swc.types.TerserMangleOptions
import kotlinx.serialization.*
import kotlinx.serialization.descriptors.*
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.*
import kotlin.reflect.KClass

/**
 * https://github.com/Kotlin/kotlinx.serialization/issues/1175
 */
open class BooleanableSerializer<T : Any>(val baseClass: KClass<T>) : KSerializer<Booleanable<T>> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("Booleanable<${baseClass.simpleName}>", PrimitiveKind.STRING)

    @OptIn(InternalSerializationApi::class)
    override fun deserialize(decoder: Decoder): Booleanable<T> {
        val input = decoder as JsonDecoder
        val tree: JsonElement = input.decodeJsonElement()
        val actualSerializer = baseClass::class.serializer() as KSerializer<T>
        val value = input.json.decodeFromJsonElement(actualSerializer, tree)
        return Booleanable(baseClass, value, null)
    }

    @OptIn(InternalSerializationApi::class, ExperimentalSerializationApi::class)
    override fun serialize(
        encoder: Encoder,
        value: Booleanable<T>,
    ) {
        value.value?.let {
            it::class.serializerOrNull()?.let { serializer ->
                @Suppress("UNCHECKED_CAST")
                (serializer as KSerializer<T>).serialize(encoder, it)
            } ?: encoder.encodeNull()
        } ?: encoder.encodeNull()
    }
}

@Serializable(BooleanableSerializer::class)
data class Booleanable<T : Any>(
    val klass: KClass<T>,
    val value: T?,
    private var bool: Boolean? = null,
) {
    companion object {
        inline fun <reified T : Any> ofBool(bool: Boolean): Booleanable<T> {
            return Booleanable(T::class, null, bool)
        }

        inline fun <reified T : Any> ofFalse(): Booleanable<T> {
            return Booleanable(T::class, null, false)
        }

        inline fun <reified T : Any> ofTrue(): Booleanable<T> {
            return Booleanable(T::class, null, true)
        }

        inline fun <reified T : Any> ofValue(value: T): Booleanable<T> {
            return Booleanable(T::class, value, null)
        }
    }
}

object BooleanableStringSerializer : BooleanableSerializer<String>(String::class)

object BooleanableFloatSerializer : BooleanableSerializer<Float>(Float::class)

object BooleanableArrayStringSerializer : BooleanableSerializer<Array<String>>(Array<String>::class)

object BooleanableTerserCompressOptionsSerializer : BooleanableSerializer<TerserCompressOptions>(TerserCompressOptions::class)

object BooleanableTerserMangleOptionsSerializer : BooleanableSerializer<TerserMangleOptions>(TerserMangleOptions::class)

object BooleanableArrayMatchPatternSerializer : BooleanableSerializer<MatchPattern>(MatchPattern::class)

typealias BooleanableString = Booleanable<String>
typealias BooleanableFloat = Booleanable<Float>
typealias BooleanableArrayString = Booleanable<Array<String>>
typealias BooleanableTerserCompressOptions = Booleanable<TerserCompressOptions>
typealias BooleanableTerserMangleOptions = Booleanable<TerserMangleOptions>
typealias BooleanableArrayMatchPattern = Booleanable<Array<MatchPattern>>
