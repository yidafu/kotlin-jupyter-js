package dev.yidafu.jupyter.processor

import dev.yidafu.jupyter.*
import dev.yidafu.swc.generated.*
import kotlinx.serialization.encodeToString
import kotlinx.serialization.json.*
import org.jetbrains.kotlinx.jupyter.api.*
import org.slf4j.Logger
import org.slf4j.LoggerFactory

/**
 * Null result implementation
 *
 * Used to represent variables with no display content
 */
class NullResult : DisplayResult {
    /**
     * Converts display data to JSON object
     *
     * @param additionalMetadata Additional reply metadata
     * @param overrideId Override ID (unused)
     * @return Display JSON object
     */
    override fun toJson(
        additionalMetadata: JsonObject,
        overrideId: String?,
    ): JsonObject {
        return JSON(buildJsonObject {
            put("text/plain", JsonNull)
        }).toJson(buildJsonObject {})
    }
}

/**
 * Jupyter virtual package import processor
 *
 * Replaces `import { varName } from '@jupyter'` statements in JavaScript code
 * with variable declarations exported from Kotlin
 *
 * Transformation example:
 * ```js
 * import { foo } from '@jupyter';
 * ```
 * Transforms to:
 * ```js
 * const foo = "bar";  // Actual value from Kotlin variable
 * ```
 *
 * Variable source priority:
 * 1. Variables exported via jsExport() (JavaScriptVariableStore)
 * 2. Variables in Notebook variable state
 *
 * Supported variable types:
 * - Basic types (String, Number, Boolean)
 * - Types implementing DisplayResult interface
 * - Types implementing Renderable interface
 * - Other types serializable via toJsonElement()
 *
 * @param notebook Current Notebook instance for accessing variable state
 */
class JupyterImportProcessor(
    private val notebook: Notebook,
) : JavaScriptProcessor {
    private val log: Logger = LoggerFactory.getLogger(JupyterImportProcessor::class.java)
    
    // Compact JSON encoder (no pretty printing) for generating JavaScript code
    private val compactJson = kotlinx.serialization.json.Json {
        prettyPrint = false
        ignoreUnknownKeys = true
    }
    
    /**
     * Helper function to create compact JSON string from result containing text/plain
     */
    private fun createCompactJsonString(result: JsonObject): String {
        return if (result.containsKey("text/plain")) {
            val textObj = result["text/plain"] as? JsonElement
            when {
                textObj == null || textObj is JsonNull -> "{\"text/plain\":null}"
                textObj is JsonPrimitive -> {
                    if (textObj.isString) {
                        val escapedValue = textObj.content.replace("\\", "\\\\").replace("\"", "\\\"")
                        "{\"text/plain\":\"$escapedValue\"}"
                    } else {
                        "{\"text/plain\":${compactJson.encodeToString(textObj)}}"
                    }
                }
                else -> {
                    // For complex types, manually construct compact JSON
                    // This should not happen for simple text/plain cases, but handle it anyway
                    val textObj = result["text/plain"] as? JsonElement
                    when {
                        textObj == null || textObj is JsonNull -> "{\"text/plain\":null}"
                        textObj is JsonPrimitive -> {
                            if (textObj.isString) {
                                val escapedValue = textObj.content.replace("\\", "\\\\").replace("\"", "\\\"")
                                "{\"text/plain\":\"$escapedValue\"}"
                            } else {
                                "{\"text/plain\":${compactJson.encodeToString(textObj)}}"
                            }
                        }
                        else -> {
                            // Fallback: use compact JSON encoder and remove formatting
                            compactJson.encodeToString(result).replace("\n", "").replace(Regex("\\s+"), " ").trim()
                        }
                    }
                }
            }
        } else {
            // For results without text/plain, use compact JSON encoder and remove formatting
            compactJson.encodeToString(result).replace("\n", "").replace(Regex("\\s+"), " ").trim()
        }
    }

    /**
     * Processes @jupyter import statements in AST
     *
     * Processing flow:
     * 1. Find all `import ... from '@jupyter'` statements
     * 2. Get variable values from Kotlin variable store or Notebook variable state
     * 3. Serialize variable values to JSON strings
     * 4. Add to context, will be converted to const declarations later
     * 5. Remove original import statements from AST
     *
     * @param program AST program node
     * @param context JavaScript processing context
     */
    override fun process(
        program: Program,
        context: JavascriptProcessContext,
    ) {
        if (program is Module) {
            program.body
                ?.filterIsInstance<ImportDeclaration>()
                ?.filter { it.source?.value == JUPYTER_IMPORT_SPECIFIER_SOURCE_NAME }
                ?.forEach { importDeclaration ->
                    val importVariables =
                        importDeclaration.specifiers
                            ?.filterIsInstance<NamedImportSpecifier>()
                            ?.map { specifier ->
                                val varName = specifier.local?.value ?: ""
                                if (specifier.imported == null) {
                                    varName to varName
                                } else {
                                    val importName = (specifier.imported as? Identifier)?.value ?: ""
                                    importName to varName
                                }
                            }?.toTypedArray() ?: emptyArray()

                    importVariables.forEach { pair ->
                        // jsExport has higher priority
                        val jsValueString: String =
                            if (JavaScriptVariableStore.containsKey(pair.first)) {
                                // Values from jsExport are already JSON-encoded strings, use them directly
                                JavaScriptVariableStore[pair.first] ?: "null"
                            } else {
                                val result: JsonObject =
                                    when (
                                        val value =
                                            notebook.variablesState[pair.first]?.value?.getOrNull() ?: NullResult()
                                    ) {
                                        is DisplayResult -> {
                                            value.toJson(buildJsonObject {})
                                        }

                                        is Renderable -> {
                                            value.render(notebook).toJson(buildJsonObject {})
                                        }

                                        else -> {
                                            JSON(buildJsonObject {
                                                put("text/plain", value.toJsonElement())
                                            }).toJson(buildJsonObject {})
                                        }
                                    }
                                log.debug("Variable ${pair.first} result structure: ${compactJson.encodeToString(result)}")
                                val data = result["data"] as? JsonObject
                                // Check if data field exists and contains text/plain
                                if (data != null && data.containsKey("text/plain")) {
                                    val textObj = data["text/plain"] as? JsonElement
                                    when {
                                        textObj == null || textObj is JsonNull -> "null"
                                        textObj is JsonPrimitive -> {
                                            compactJson.encodeToString(textObj)
                                        }

                                        else -> compactJson.encodeToString(textObj)
                                    }
                                } else if (data == null) {
                                    // If data field doesn't exist, check if result contains text/plain
                                    // This handles cases where JSON function returns a structure like {"text/plain": "value"}
                                    if (result.containsKey("text/plain")) {
                                        val textObj = result["text/plain"] as? JsonElement
                                        when {
                                            textObj == null || textObj is JsonNull -> "{\"text/plain\":null}"
                                            textObj is JsonPrimitive -> {
                                                if (textObj.isString) {
                                                    // For String type, return compact JSON object format
                                                    // Manually construct to ensure compact format
                                                    val escapedValue = textObj.content.replace("\\", "\\\\").replace("\"", "\\\"")
                                                    "{\"text/plain\":\"$escapedValue\"}"
                                                } else {
                                                    createCompactJsonString(result)
                                                }
                                            }
                                            else -> createCompactJsonString(result)
                                        }
                                    } else {
                                        // Return the entire result as JSON string (compact format)
                                        createCompactJsonString(result)
                                    }
                                } else if (result.containsKey("text/plain")) {
                                    // If result itself contains text/plain (for basic types from JSON function)
                                    val textObj = result["text/plain"] as? JsonElement
                                    when {
                                        textObj == null || textObj is JsonNull -> "null"
                                        textObj is JsonPrimitive -> {
                                            // For JsonPrimitive strings, return JSON-encoded string (with quotes)
                                            // so it can be used as a JavaScript string literal
                                            compactJson.encodeToString(textObj)
                                        }

                                        else -> compactJson.encodeToString(textObj)
                                    }
                                } else {
                                    val objKeys = data.keys
                                    when {
                                        objKeys.contains(MimeTypes.JSON) -> {
                                            val jsonObj: JsonElement =
                                                data[MimeTypes.JSON] ?: throw InvalidMimeTypeResult(MimeTypes.JSON)
                                            compactJson.encodeToString(jsonObj)
                                        }

                                        objKeys.contains(MimeTypes.PLAIN_TEXT) -> {
                                            val textObj: JsonElement = data[MimeTypes.PLAIN_TEXT]
                                                ?: throw InvalidMimeTypeResult(MimeTypes.PLAIN_TEXT)
                                            when {
                                                textObj is JsonNull -> "null"
                                                textObj is JsonPrimitive -> {
                                                    // Return JSON-encoded string (with quotes) so it can be used in JS
                                                    compactJson.encodeToString(textObj)
                                                }

                                                else -> compactJson.encodeToString(textObj)
                                            }
                                        }
                                        // Also check for "text/plain" key directly in data (for basic types)
                                        objKeys.contains("text/plain") -> {
                                            val textObj: JsonElement =
                                                data["text/plain"] ?: throw InvalidMimeTypeResult("text/plain")
                                            when {
                                                textObj is JsonNull -> "null"
                                                textObj is JsonPrimitive -> {
                                                    // Return JSON-encoded string (with quotes) so it can be used in JS
                                                    compactJson.encodeToString(textObj)
                                                }

                                                else -> compactJson.encodeToString(textObj)
                                            }
                                        }

                                        objKeys.contains(MimeTypes.HTML) -> {
                                            val htmlObj: JsonElement =
                                                data[MimeTypes.HTML] ?: throw InvalidMimeTypeResult(MimeTypes.HTML)
                                            // Return JSON-encoded string (with quotes) so it can be used in JS
                                            compactJson.encodeToString(htmlObj)
                                        }

                                        objKeys.contains(MimeTypes.PNG) -> {
                                            val pngObj: JsonElement =
                                                data[MimeTypes.PNG] as? JsonPrimitive ?: throw InvalidMimeTypeResult(
                                                    MimeTypes.PNG,
                                                )
                                            when (pngObj) {
                                                is JsonPrimitive -> {
                                                    if (pngObj.isString) {
                                                        pngObj.content
                                                    } else {
                                                        compactJson.encodeToString(pngObj)
                                                    }
                                                }

                                                else -> compactJson.encodeToString(pngObj)
                                            }
                                        }

                                        else -> {
                                            // If data doesn't contain any supported MIME type, check if data itself contains text/plain
                                            // This handles cases where JSON function returns a structure with data field containing text/plain
                                            if (objKeys.contains("text/plain")) {
                                                val textObj = data["text/plain"] as? JsonElement
                                                when {
                                                    textObj == null || textObj is JsonNull -> "null"
                                                    textObj is JsonPrimitive -> {
                                                        compactJson.encodeToString(textObj)
                                                    }

                                                    else -> compactJson.encodeToString(textObj)
                                                }
                                            } else if (result.containsKey("text/plain")) {
                                                // Check if result itself contains text/plain
                                                val textObj = result["text/plain"] as? JsonElement
                                                when {
                                                    textObj == null || textObj is JsonNull -> "{\"text/plain\":null}"
                                                    textObj is JsonPrimitive -> {
                                                        if (textObj.isString) {
                                                            // For String type, return compact JSON object format
                                                            val escapedValue = textObj.content.replace("\\", "\\\\").replace("\"", "\\\"")
                                                            "{\"text/plain\":\"$escapedValue\"}"
                                                        } else {
                                                            "{\"text/plain\":${compactJson.encodeToString(textObj)}}"
                                                        }
                                                    }
                                                    else -> {
                                                        // For complex types, use helper function to create compact JSON
                                                        createCompactJsonString(result)
                                                    }
                                                }
                                            } else {
                                                throw NotSupportMimeTypeException(result.keys.joinToString(", "))
                                            }
                                        }
                                    }
                                }
                            }
                        log.debug("import variable ${pair.second} from kotlin world, it's value: $jsValueString")
                        context.addKotlinValue(pair.second to jsValueString)
                    }

                }

//                    log.debug("replace statement `import * from '@jupyter'` with actual variable declare")
        }

        // remove `import * from '@jupyter';`
        // replace imported variable after printSync called. just for performance
        if (program is Module) {
        program.body = program.body
            ?.filter {
                !(
                        it is ImportDeclaration &&
                                it.source?.value == JUPYTER_IMPORT_SPECIFIER_SOURCE_NAME
                        )
            }
            ?.toTypedArray() ?: emptyArray<ModuleItem>()
        }

    }

}
