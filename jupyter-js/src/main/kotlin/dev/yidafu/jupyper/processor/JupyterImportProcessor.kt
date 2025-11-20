package dev.yidafu.jupyper.processor

import dev.yidafu.jupyper.*
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

                    importVariables.forEach {
                        // jsExport has higher priority
                        val jsValueString: String =
                            if (JavaScriptVariableStore.containsKey(it.first)) {
                                // Values from jsExport are already JSON-encoded strings, use them directly
                                JavaScriptVariableStore[it.first] ?: "null"
                            } else {
                                val result: JsonObject =
                                    when (
                                        val value = notebook.variablesState[it.first]?.value?.getOrNull() ?: NullResult()
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
                                // First check if result itself contains text/plain (for basic types)
                                if (result.containsKey("text/plain")) {
                                    val textObj = result["text/plain"] as? JsonElement
                                    when {
                                        textObj == null || textObj is JsonNull -> "null"
                                        textObj is JsonPrimitive -> {
                                            // For JsonPrimitive strings, return JSON-encoded string (with quotes)
                                            // so it can be used as a JavaScript string literal
                                            Json.encodeToString(textObj)
                                        }
                                        else -> Json.encodeToString(textObj)
                                    }
                                } else {
                                    val data = result["data"] as? JsonObject
                                    if (data != null && data.containsKey("text/plain")) {
                                        // Check if data contains text/plain directly
                                        val textObj = data["text/plain"] as? JsonElement
                                        when {
                                            textObj == null || textObj is JsonNull -> "null"
                                            textObj is JsonPrimitive -> {
                                                Json.encodeToString(textObj)
                                            }
                                            else -> Json.encodeToString(textObj)
                                        }
                                    } else if (data == null) {
                                        // If data field doesn't exist and result doesn't contain text/plain,
                                        // return the entire result as JSON string
                                        // This handles cases where JSON function returns a different structure
                                        Json.encodeToString(result)
                                    } else {
                                        val objKeys = data.keys
                                        when {
                                        objKeys.contains(MimeTypes.JSON) -> {
                                            val jsonObj: JsonElement = data[MimeTypes.JSON] ?: throw InvalidMimeTypeResult(MimeTypes.JSON)
                                            Json.encodeToString(jsonObj)
                                        }
                                        objKeys.contains(MimeTypes.PLAIN_TEXT) -> {
                                            val textObj: JsonElement = data[MimeTypes.PLAIN_TEXT] ?: throw InvalidMimeTypeResult(MimeTypes.PLAIN_TEXT)
                                            when {
                                                textObj is JsonNull -> "null"
                                                textObj is JsonPrimitive -> {
                                                    // Return JSON-encoded string (with quotes) so it can be used in JS
                                                    Json.encodeToString(textObj)
                                                }
                                                else -> Json.encodeToString(textObj)
                                            }
                                        }
                                        // Also check for "text/plain" key directly in data (for basic types)
                                        objKeys.contains("text/plain") -> {
                                            val textObj: JsonElement = data["text/plain"] ?: throw InvalidMimeTypeResult("text/plain")
                                            when {
                                                textObj is JsonNull -> "null"
                                                textObj is JsonPrimitive -> {
                                                    // Return JSON-encoded string (with quotes) so it can be used in JS
                                                    Json.encodeToString(textObj)
                                                }
                                                else -> Json.encodeToString(textObj)
                                            }
                                        }
                                        objKeys.contains(MimeTypes.HTML) -> {
                                            val htmlObj: JsonElement = data[MimeTypes.HTML] ?: throw InvalidMimeTypeResult(MimeTypes.HTML)
                                            // Return JSON-encoded string (with quotes) so it can be used in JS
                                            Json.encodeToString(htmlObj)
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
                                                        Json.encodeToString(pngObj)
                                                    }
                                                }
                                                else -> Json.encodeToString(pngObj)
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
                                                        Json.encodeToString(textObj)
                                                    }
                                                    else -> Json.encodeToString(textObj)
                                                }
                                            } else if (result.containsKey("text/plain")) {
                                                // Check if result itself contains text/plain
                                                val textObj = result["text/plain"] as? JsonElement
                                                when {
                                                    textObj == null || textObj is JsonNull -> "null"
                                                    textObj is JsonPrimitive -> {
                                                        Json.encodeToString(textObj)
                                                    }
                                                    else -> Json.encodeToString(textObj)
                                                }
                                            } else {
                                                throw NotSupportMimeTypeException(result.keys.joinToString(", "))
                                            }
                                        }
                                    }
                                    }
                                }
                            }

                        log.debug("import variable ${it.second} from kotlin world, it't value: $jsValueString")
                        context.addKotlinValue(it.second to jsValueString)
                    }

//                    log.debug("replace statement `import * from '@jupyter'` with actual variable declare")
                }

            // remove `import * from '@jupyter';`
            // replace imported variable after printSync called. just for performance
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
