package dev.yidafu.swc.booleanable

import kotlinx.serialization.Serializable
import kotlinx.serialization.encodeToString
import kotlinx.serialization.json.Json
import kotlinx.serialization.modules.SerializersModule
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertTrue

@Serializable
data class StringOrBoolean(
    @Serializable(BooleanableStringSerializer::class)
    val value: BooleanableString
)

@Serializable
data class BooleanableProps(
    @Serializable(BooleanableStringSerializer::class)
    val str: BooleanableString,

    @Serializable(BooleanableFloatSerializer::class)
    val f: BooleanableFloat,

    @Serializable(BooleanableArrayStringSerializer::class)
    var arr: BooleanableArrayString
)
val format =
    Json {
        serializersModule =
            SerializersModule {
//        polymorphic(MayBoolean::class) {
//            subclass(MayBoolean.Bool::class)
//            subclass(MayBoolean.Value::class)
//        }
            }
    }

class BooleanableTest {
    @Test
    fun `encode value which may be string or boolean`() {
        assertEquals(
            format.encodeToString(StringOrBoolean(Booleanable.ofValue("str"))),
            "{\"value\":\"str\"}"
        )

        assertEquals(
            format.encodeToString(StringOrBoolean(Booleanable.ofTrue())),
            "{\"value\":true}"
        )

        assertEquals(
            format.encodeToString(StringOrBoolean(Booleanable.ofFalse())),
            "{\"value\":false}"
        )
    }

    @Test
    fun `decode value which may be string or boolean`() {
        val b1: StringOrBoolean = format.decodeFromString("""{"value":true}""")
        assertTrue(b1.value.isTrue())
        val b2: StringOrBoolean = format.decodeFromString("""{"value":false}""")
        assertTrue(b2.value.isFalse())

        val b3: StringOrBoolean = format.decodeFromString("""{"value":"str"}""")

        assertEquals(
            b3.value.value,
            "str"
        )
    }

    @Test
    fun `decode booleanable value`() {
        val arr: BooleanableProps = format.decodeFromString("""{"str":"string","f":1.23,"arr":["foo","bar"]}""")
        assertEquals(arr.str.value, "string")
        assertEquals(arr.f.value, 1.23f)
        assertEquals(arr.arr.value?.get(0), "foo")
    }
}
