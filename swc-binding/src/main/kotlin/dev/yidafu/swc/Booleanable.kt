package dev.yidafu.swc.booleanable

import dev.yidafu.swc.types.MatchPattern
import dev.yidafu.swc.types.TerserCompressOptions
import dev.yidafu.swc.types.TerserMangleOptions
import kotlinx.serialization.*
import kotlinx.serialization.builtins.ArraySerializer
import kotlinx.serialization.builtins.serializer
import kotlinx.serialization.descriptors.*
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.*

/**
 * https://github.com/Kotlin/kotlinx.serialization/issues/1175
 */
open class BooleanableSerializer<T : Any>(
    private val serializer: KSerializer<T>,
    override val descriptor: SerialDescriptor = serializer.descriptor
) : KSerializer<Booleanable<T>> {

    override fun deserialize(decoder: Decoder): Booleanable<T> {
        val input = decoder as JsonDecoder
        val tree: JsonElement = input.decodeJsonElement()

        return if (tree is JsonPrimitive) {
            if (tree is JsonNull) {
                Booleanable.ofBool<Any>(false) as Booleanable<T>
            } else if (tree.content == "true" || tree.content == "false") {
                Booleanable.ofBool<Any>(tree.content == "true") as Booleanable<T>
            } else {
                val value = input.json.decodeFromJsonElement(serializer, tree)
                Booleanable(value, null)
            }
        } else {
            val value = input.json.decodeFromJsonElement(serializer, tree)
            Booleanable(value, null)
        }
    }

    override fun serialize(
        encoder: Encoder,
        value: Booleanable<T>
    ) {
        value.onValue {
            serializer.serialize(encoder, it)
        }.onBool {
            encoder.encodeBoolean(it)
        }
    }
}

@Serializable(BooleanableSerializer::class)
data class Booleanable<T : Any>(
//    val klass: KClass<T>,
    val value: T?,
    private var bool: Boolean? = null
) {
    fun hasValue(): Boolean {
        return value == null
    }

    fun isTrue(): Boolean {
        return bool == true
    }

    fun isFalse(): Boolean {
        return bool == false
    }

    fun onValue(block: (value: T) -> Unit): Booleanable<T> {
        if (value != null) {
            block(value)
        }
        return this
    }

    fun onBool(block: (value: Boolean) -> Unit): Booleanable<T> {
        val b = this.bool
        if (b != null) {
            block(b)
        }
        return this
    }
    companion object {
        inline fun <reified T : Any> ofBool(bool: Boolean): Booleanable<T> {
            return Booleanable(null, bool)
        }

        inline fun <reified T : Any> ofFalse(): Booleanable<T> {
            return Booleanable(null, false)
        }

        inline fun <reified T : Any> ofTrue(): Booleanable<T> {
            return Booleanable(null, true)
        }

        inline fun <reified T : Any> ofValue(value: T): Booleanable<T> {
            return Booleanable(value, null)
        }
    }
}

@OptIn(InternalSerializationApi::class)
object BooleanableStringSerializer : BooleanableSerializer<String>(
    String::class.serializer()
//    String::class.serializer().descriptor
)

@OptIn(InternalSerializationApi::class)
object BooleanableFloatSerializer : BooleanableSerializer<Float>(
    Float::class.serializer()
)

@OptIn(InternalSerializationApi::class)
object BooleanableIntSerializer : BooleanableSerializer<Int>(
    Int::class.serializer()
)

@OptIn(ExperimentalSerializationApi::class)
object BooleanableArrayStringSerializer : BooleanableSerializer<Array<String>>(
    ArraySerializer(String::class, String.serializer())
)

@OptIn(InternalSerializationApi::class)
object BooleanableTerserCompressOptionsSerializer : BooleanableSerializer<TerserCompressOptions>(
    TerserCompressOptions::class.serializer()
)

@OptIn(InternalSerializationApi::class)
object BooleanableTerserMangleOptionsSerializer : BooleanableSerializer<TerserMangleOptions>(
    TerserMangleOptions::class.serializer()
)

@OptIn(ExperimentalSerializationApi::class)
object BooleanableArrayMatchPatternSerializer : BooleanableSerializer<Array<MatchPattern>>(
    ArraySerializer(MatchPattern::class, MatchPattern.serializer())
)

typealias BooleanableString = Booleanable<String>
typealias BooleanableFloat = Booleanable<Float>
typealias BooleanableInt = Booleanable<Int>
typealias BooleanableArrayString = Booleanable<Array<String>>
typealias BooleanableTerserCompressOptions = Booleanable<TerserCompressOptions>
typealias BooleanableTerserMangleOptions = Booleanable<TerserMangleOptions>
typealias BooleanableArrayMatchPattern = Booleanable<Array<MatchPattern>>
