package dev.yidafu.jupyper.processor

import dev.yidafu.jupyper.InvalidMimeTypeResult
import dev.yidafu.jupyper.JUPYTER_IMPORT_SPECIFIER_SOURCE_NAME
import dev.yidafu.jupyper.NotSupportMimeTypeException
import dev.yidafu.swc.types.* // ktlint-disable no-wildcard-imports
import kotlinx.serialization.Serializable
import kotlinx.serialization.encodeToString
import kotlinx.serialization.json.* // ktlint-disable no-wildcard-imports
import org.jetbrains.kotlinx.jupyter.api.* // ktlint-disable no-wildcard-imports
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import kotlin.reflect.full.hasAnnotation

class NullResult : DisplayResult {
    /**
     * Converts display data to JSON object for `display_data` response
     *
     * @param additionalMetadata Additional reply metadata
     * @return Display JSON
     */
    override fun toJson(additionalMetadata: JsonObject, overrideId: String?): JsonObject {
        return JSON(JsonNull).toJson()
    }
}

class JupyterImportProcessor(
    private val notebook: Notebook,
) : JavaScriptProcessor {
    private val log: Logger = LoggerFactory.getLogger(JupyterImportProcessor::class.java)

    /**
     * TODO:
     */
    override fun process(program: Program, context: JavascriptProcessContext) {
        if (program is Module) {
            program.body
                ?.filterIsInstance<ImportDeclaration>()
                ?.filter { it.source?.value == JUPYTER_IMPORT_SPECIFIER_SOURCE_NAME }
                ?.forEach { importDeclaration ->
                    val importVariables = importDeclaration.specifiers
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
                        val value = notebook.variablesState[it.first]?.value?.getOrNull() ?: NullResult()
                        val result: JsonObject = when (value) {
                            is DisplayResult -> {
                                value.toJson()
                            }
                            is Renderable -> {
                                value.render(notebook).toJson()
                            }
                            else -> {
                                if (value::class.hasAnnotation<Serializable>()) {
                                    JSON(Json.encodeToJsonElement(value)).toJson()
                                } else if (value is Array<*>) {
                                   if (value.isArrayOf<String>()) {
                                    JSON(Json.encodeToJsonElement(value as Array<String>)).toJson()
                                   } else if (value.isArrayOf<Long>()) {
                                       JSON(Json.encodeToJsonElement(value as Array<Long>)).toJson()
                                   } else if (value.isArrayOf<Float>()) {
                                       JSON(Json.encodeToJsonElement(value as Array<Float>)).toJson()
                                   } else if (value.isArrayOf<Int>()) {
                                       JSON(Json.encodeToJsonElement(value as Array<Int>)).toJson()
                                   } else if (value.isArrayOf<Byte>()) {
                                       JSON(Json.encodeToJsonElement(value as Array<Byte>)).toJson()
                                   } else if (value.isArrayOf<UInt>()) {
                                       JSON(Json.encodeToJsonElement(value as Array<UInt>)).toJson()
                                   } else if (value.isArrayOf<Boolean>()) {
                                       JSON(Json.encodeToJsonElement(value as Array<Boolean>)).toJson()
                                   } else {
                                       JSON(Json.encodeToJsonElement(value)).toJson()
                                   }
                                } else {
                                    textResult(value.toString()).toJson()
                                }
                            }
                        }
                        val data = result["data"] as JsonObject
                        val objKeys = data.keys
                        val jsValueString: String = when {
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
                                val pngObj: JsonElement = data[MimeTypes.PNG] as? JsonPrimitive ?: throw InvalidMimeTypeResult(MimeTypes.PNG)
                                Json.encodeToString(pngObj)
                            }
                            else -> throw NotSupportMimeTypeException(result.keys.joinToString(", "))
                        }
                        log.debug("import varabile ${it.second} from kotlin world, it't value: $jsValueString")
                        context.addKotlinValue(it.second to jsValueString)
                    }

                    log.debug("replace statement `import * from '@jupyter'` with actual variable declare")
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
