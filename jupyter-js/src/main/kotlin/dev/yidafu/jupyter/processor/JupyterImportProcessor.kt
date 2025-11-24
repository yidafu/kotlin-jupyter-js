@file:Suppress("ktlint:standard:no-wildcard-imports")

package dev.yidafu.jupyter.processor

import dev.yidafu.jupyter.InvalidMimeTypeResult
import dev.yidafu.jupyter.JUPYTER_IMPORT_SPECIFIER_SOURCE_NAME
import dev.yidafu.jupyter.JavaScriptVariableStore
import dev.yidafu.jupyter.NotSupportMimeTypeException
import dev.yidafu.jupyter.toJsonElement
import dev.yidafu.swc.generated.Identifier
import dev.yidafu.swc.generated.ImportDeclaration
import dev.yidafu.swc.generated.Module
import dev.yidafu.swc.generated.ModuleItem
import dev.yidafu.swc.generated.NamedImportSpecifier
import dev.yidafu.swc.generated.Program
import kotlinx.serialization.encodeToString
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonNull
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.JsonPrimitive
import kotlinx.serialization.json.buildJsonObject
import org.jetbrains.kotlinx.jupyter.api.DisplayResult
import org.jetbrains.kotlinx.jupyter.api.JSON
import org.jetbrains.kotlinx.jupyter.api.MimeTypes
import org.jetbrains.kotlinx.jupyter.api.Notebook
import org.jetbrains.kotlinx.jupyter.api.Renderable
import org.slf4j.Logger
import org.slf4j.LoggerFactory

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
    private val compactJson =
        kotlinx.serialization.json.Json {
            prettyPrint = false
            ignoreUnknownKeys = true
        }

    // Pretty JSON encoder (with formatting) for test compatibility
    private val prettyJson =
        kotlinx.serialization.json.Json {
            prettyPrint = true
            ignoreUnknownKeys = true
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

                    importVariables.forEach {
                        // jsExport has higher priority
                        val jsValueString: String =
                            if (JavaScriptVariableStore.containsKey(it.first)) {
                                JavaScriptVariableStore[it.first] ?: "null"
                            } else {
                                val value = notebook.variablesState[it.first]?.value?.getOrNull()
                                if (value == null) {
                                    "null"
                                } else {
                                    val result: JsonObject =
                                        when (value) {
                                            is DisplayResult -> {
                                                value.toJson()
                                            }

                                            is Renderable -> {
                                                value.render(notebook).toJson()
                                            }

                                            else -> {
                                                JSON(value.toJsonElement()).toJson()
                                            }
                                        }
                                    val data = result["data"] as JsonObject
                                    val objKeys = data.keys
                                    when {
                                        objKeys.contains(MimeTypes.JSON) -> {
                                            val jsonObj: JsonElement = data[MimeTypes.JSON] ?: throw InvalidMimeTypeResult(MimeTypes.JSON)
                                            jsonObj.toString()
                                        }

                                        objKeys.contains(MimeTypes.PLAIN_TEXT) -> {
                                            val textObj: JsonElement =
                                                data[MimeTypes.PLAIN_TEXT] ?: throw InvalidMimeTypeResult(MimeTypes.JSON)
                                            textObj.toString()
                                        }

                                        objKeys.contains(MimeTypes.HTML) -> {
                                            val htmlObj: JsonElement = data[MimeTypes.HTML] ?: throw InvalidMimeTypeResult(MimeTypes.HTML)
                                            htmlObj.toString()
                                        }

                                        objKeys.contains(MimeTypes.PNG) -> {
                                            val pngObj: JsonElement =
                                                data[MimeTypes.PNG] as? JsonPrimitive ?: throw InvalidMimeTypeResult(
                                                    MimeTypes.PNG,
                                                )
                                            pngObj.toString()
                                        }

                                        else -> {
                                            throw NotSupportMimeTypeException(result.keys.joinToString(", "))
                                        }
                                    }
                                }
                            }

                        log.debug("import variable ${it.second} from kotlin world, it's value: $jsValueString")
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
                }?.toTypedArray() ?: emptyArray<ModuleItem>()
        }
    }
}
