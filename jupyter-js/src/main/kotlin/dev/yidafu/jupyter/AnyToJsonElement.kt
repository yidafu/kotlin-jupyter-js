package dev.yidafu.jupyter

import kotlinx.serialization.json.*

/**
 * covert basic type to JsonElement
 */
fun Any?.toJsonElement(): JsonElement =
    when (this) {
        null -> JsonNull
        is Map<*, *> -> toJsonElement()
        is Collection<*> -> toJsonElement()
        is ByteArray -> this.toList().toJsonElement()
        is CharArray -> this.toList().toJsonElement()
        is ShortArray -> this.toList().toJsonElement()
        is IntArray -> this.toList().toJsonElement()
        is LongArray -> this.toList().toJsonElement()
        is FloatArray -> this.toList().toJsonElement()
        is DoubleArray -> this.toList().toJsonElement()
        is BooleanArray -> this.toList().toJsonElement()
        is Array<*> -> toJsonElement()
        is Boolean -> JsonPrimitive(this)
        is Number -> JsonPrimitive(this)
        is String -> JsonPrimitive(this)
        is Enum<*> -> JsonPrimitive(this.toString())
        is Pair<*, *> -> JsonArray(listOf(this.first.toJsonElement(), this.second.toJsonElement()))
        is Triple<*, *, *> -> JsonArray(listOf(this.first.toJsonElement(), this.second.toJsonElement(), this.third.toJsonElement()))
        else -> {
            throw IllegalStateException(
                "Can't serialize class, you should implement org.jetbrains.kotlinx.jupyter.api.DisplayResult interface",
            )
        }
    }

/**
 * convert Map<*, *> to JsonObject
 */
fun Map<*, *>.toJsonElement(): JsonElement {
    val map = mutableMapOf<String, JsonElement>()
    this.forEach { (key, value) ->
        // JSON object key must be String
        map[key.toString()] = value.toJsonElement()
    }
    return JsonObject(map)
}

/**
 * convert Collection<*> to JsonArray
 */
fun Collection<*>.toJsonElement(): JsonElement {
    return JsonArray(this.map { it.toJsonElement() })
}

fun Array<*>.toJsonElement(): JsonElement {
    return JsonArray(this.map { it.toJsonElement() })
}
