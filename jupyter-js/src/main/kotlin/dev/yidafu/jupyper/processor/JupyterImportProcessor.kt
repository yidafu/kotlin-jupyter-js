package dev.yidafu.jupyper.processor

import dev.yidafu.jupyper.*
import dev.yidafu.swc.types.*
import kotlinx.serialization.encodeToString
import kotlinx.serialization.json.*
import org.jetbrains.kotlinx.jupyter.api.*
import org.slf4j.Logger
import org.slf4j.LoggerFactory

class NullResult : DisplayResult {
    /**
     * Converts display data to JSON object for `display_data` response
     *
     * @param additionalMetadata Additional reply metadata
     * @return Display JSON
     */
    override fun toJson(
        additionalMetadata: JsonObject,
        overrideId: String?,
    ): JsonObject {
        return JSON(JsonNull).toJson()
    }
}

/**
 * replace virtual package (`@jupyter`) with kotlin variables
 *
 * ```js
 * import { foo } from '@jupyter';
 * ```
 * will transform to
 *
 * ```js
 * const foo = "bar";
 * ```
 *
 * `foo` must be basic type or implement DisplayResult interface
 */
class JupyterImportProcessor(
    private val notebook: Notebook,
) : JavaScriptProcessor {
    private val log: Logger = LoggerFactory.getLogger(JupyterImportProcessor::class.java)

    /**
     * TODO:
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
                                val result: JsonObject =
                                    when (
                                        val value = notebook.variablesState[it.first]?.value?.getOrNull() ?: NullResult()
                                    ) {
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
                                        Json.encodeToString(jsonObj)
                                    }
                                    objKeys.contains(MimeTypes.PLAIN_TEXT) -> {
                                        val textObj: JsonElement = data[MimeTypes.PLAIN_TEXT] ?: throw InvalidMimeTypeResult(MimeTypes.JSON)
                                        Json.encodeToString(textObj)
                                    }
                                    objKeys.contains(MimeTypes.HTML) -> {
                                        val htmlObj: JsonElement = data[MimeTypes.HTML] ?: throw InvalidMimeTypeResult(MimeTypes.HTML)
                                        Json.encodeToString(htmlObj)
                                    }
                                    objKeys.contains(MimeTypes.PNG) -> {
                                        val pngObj: JsonElement =
                                            data[MimeTypes.PNG] as? JsonPrimitive ?: throw InvalidMimeTypeResult(
                                                MimeTypes.PNG,
                                            )
                                        Json.encodeToString(pngObj)
                                    }
                                    else -> throw NotSupportMimeTypeException(result.keys.joinToString(", "))
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
