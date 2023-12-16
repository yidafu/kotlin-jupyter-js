package dev.yidafu.jupyper.processor

import dev.yidafu.jupyper.InvalidMimeTypeResult
import dev.yidafu.jupyper.NotSupportMimeTypeException
import dev.yidafu.swc.dsl.identifier
import dev.yidafu.swc.dsl.stringLiteral
import dev.yidafu.swc.dsl.variableDeclarator
import dev.yidafu.swc.emptySpan
import dev.yidafu.swc.types.* // ktlint-disable no-wildcard-imports
import kotlinx.serialization.encodeToString
import kotlinx.serialization.json.* // ktlint-disable no-wildcard-imports
import org.jetbrains.kotlinx.jupyter.api.* // ktlint-disable no-wildcard-imports
import org.slf4j.Logger
import org.slf4j.LoggerFactory

class EmptyResult : DisplayResult {
    /**
     * Converts display data to JSON object for `display_data` response
     *
     * @param additionalMetadata Additional reply metadata
     * @return Display JSON
     */
    override fun toJson(additionalMetadata: JsonObject, overrideId: String?): JsonObject {
        return JSON(buildJsonObject { }).toJson()
    }
}

class JupyterImportProcessor(
    private val notebook: Notebook,
) : JavaScriptProcessor {
    private val log: Logger = LoggerFactory.getLogger(JupyterImportProcessor::class.java)

    /**
     * TODO: replace imported variable after printSync called. just for performance
     */
    override fun process(program: Program) {
        if (program is Module) {
            program.body?.indexOfFirst { it is ImportDeclaration && it.source?.value == "@jupyter" }?.let { index ->
                val importDeclaration = program.body?.get(index)
                // TODO: handle multiple `import * from "@jupyter"`
                val importVariables = (importDeclaration as ImportDeclaration).specifiers
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

                val jsImportValueList = importVariables.map {
                    val value = notebook.variablesState[it.first]?.value?.getOrNull() ?: EmptyResult()
                    val result: JsonObject = when (value) {
                        is DisplayResult -> {
                            value.toJson()
                        }
                        is Renderable -> {
                            value.render(notebook).toJson()
                        }
                        else -> {
                            textResult(value.toString()).toJson()
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
                    it.second to jsValueString
                }
                val varDecl = VariableDeclarationImpl().apply {
                    kind = "const"
                    span = emptySpan()
                    declarations = jsImportValueList.map {
                        variableDeclarator {
                            id = identifier {
                                value = it.first
                                optional = false
                                span = emptySpan()
                            }
                            init = stringLiteral {
                                value = it.second
                                raw = it.second
                                span = emptySpan()
                            }
                            span = emptySpan()
                        }
                    }.toTypedArray()
                }
                log.debug("replace statement `import * from '@jupyter'` with actual variable declare")
                program.body!![index] = varDecl
            }
        }
    }
}
