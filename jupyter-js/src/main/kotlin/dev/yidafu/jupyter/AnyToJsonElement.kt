package dev.yidafu.jupyter

import kotlinx.serialization.SerializationException
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonArray
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonNull
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.JsonPrimitive
import kotlinx.serialization.json.encodeToJsonElement

/**
 * Converts basic types to JsonElement
 *
 * Recursively converts Kotlin types to JSON elements for serialization
 * Supports: null, Map, Collection, Arrays, primitives, Enum, Pair, Triple
 * Throws IllegalStateException for unsupported types
 */
fun Any?.toJsonElement(): JsonElement =
    when (this) {
        null -> {
            JsonNull
        }

        is Map<*, *> -> {
            toJsonElement()
        }

        is Collection<*> -> {
            toJsonElement()
        }

        is ByteArray -> {
            this.toList().toJsonElement()
        }

        is CharArray -> {
            this.toList().toJsonElement()
        }

        is ShortArray -> {
            this.toList().toJsonElement()
        }

        is IntArray -> {
            this.toList().toJsonElement()
        }

        is LongArray -> {
            this.toList().toJsonElement()
        }

        is FloatArray -> {
            this.toList().toJsonElement()
        }

        is DoubleArray -> {
            this.toList().toJsonElement()
        }

        is BooleanArray -> {
            this.toList().toJsonElement()
        }

        is Array<*> -> {
            toJsonElement()
        }

        is Boolean -> {
            JsonPrimitive(this)
        }

        is Number -> {
            JsonPrimitive(this)
        }

        is String -> {
            JsonPrimitive(this)
        }

        is Enum<*> -> {
            JsonPrimitive(this.toString())
        }

        is Pair<*, *> -> {
            JsonArray(listOf(this.first.toJsonElement(), this.second.toJsonElement()))
        }

        is Triple<*, *, *> -> {
            JsonArray(listOf(this.first.toJsonElement(), this.second.toJsonElement(), this.third.toJsonElement()))
        }

        else -> {
            throw IllegalStateException(
                "Can't serialize class, you should implement org.jetbrains.kotlinx.jupyter.api.DisplayResult interface",
            )
        }
    }

/**
 * Converts Map<*, *> to JsonObject
 *
 * Converts all map entries to JSON object properties
 * Keys are converted to strings (JSON requirement)
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
 * Converts Collection<*> to JsonArray
 *
 * Converts all collection elements to JSON array elements
 */
fun Collection<*>.toJsonElement(): JsonElement = JsonArray(this.map { it.toJsonElement() })

/**
 * Converts Array<*> to JsonArray
 *
 * Converts all array elements to JSON array elements
 */
fun Array<*>.toJsonElement(): JsonElement = JsonArray(this.map { it.toJsonElement() })
