package dev.yidafu.jupyter

import kotlinx.serialization.encodeToString
import kotlinx.serialization.json.Json

/**
 * JavaScript variable store
 *
 * Global storage for variables exported from Kotlin to JavaScript
 * Key is variable name, value is serialized JSON string
 */
object JavaScriptVariableStore : MutableMap<String, String> by mutableMapOf()

/**
 * JSON serialization configuration
 * Enables default value encoding to ensure all fields are serialized
 */
val json =
    Json {
        encodeDefaults = true
    }

/**
 * Exports Kotlin variable to JavaScript environment
 *
 * This function serializes Kotlin variables to JSON strings and stores them in JavaScriptVariableStore
 * In JavaScript code, they can be imported using `import { varName } from '@jupyter'`
 *
 * Supported types:
 * - Basic types (String, Number, Boolean)
 * - Types implementing kotlinx.serialization.Serializable
 * - Types implementing toJsonElement() extension method
 *
 * @param varName Variable name to use in JavaScript
 * @param variable Kotlin variable to export
 *
 * @throws kotlinx.serialization.SerializationException if type cannot be serialized and doesn't implement toJsonElement()
 *
 * Usage example:
 * ```kotlin
 * val data = mapOf("name" to "John", "age" to 30)
 * jsExport("userData", data)
 * ```
 *
 * Usage in JavaScript:
 * ```javascript
 * import { userData } from '@jupyter';
 * console.log(userData.name); // "John"
 * ```
 */
inline fun <reified T : Any> jsExport(
    varName: String,
    variable: T,
) {
    val valueStr = try {
        json.encodeToString<T>(variable)
    } catch (e: kotlinx.serialization.SerializationException) {
        // If the type is not serializable, use the toJsonElement method
        variable.toJsonElement().toString()
    }

    JavaScriptVariableStore[varName] = valueStr
}
