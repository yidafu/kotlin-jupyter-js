package dev.yidafu.jupyter

import kotlinx.serialization.encodeToString
import kotlinx.serialization.json.Json

/**
 * global javascript variable store
 */
object JavaScriptVariableStore : MutableMap<String, String> by mutableMapOf()

val json =
    Json {
        encodeDefaults = true
    }

/**
 * export kotlin variable to javascript world
 */
inline fun <reified T : Any> jsExport(
    varName: String,
    variable: T,
) {
    val valueStr = json.encodeToString<T>(variable)

    JavaScriptVariableStore[varName] = valueStr
}
