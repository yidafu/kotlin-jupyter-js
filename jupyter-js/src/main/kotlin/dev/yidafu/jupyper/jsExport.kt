package dev.yidafu.jupyper

import kotlinx.serialization.encodeToString
import kotlinx.serialization.json.Json
import org.slf4j.Logger
import org.slf4j.LoggerFactory

/**
 * global javascript variable store
 */
object JavaScriptVariableStore : MutableMap<String, String> by mutableMapOf()


val log: Logger = LoggerFactory.getLogger("jsExport")
val json = Json {
    encodeDefaults = true
}

/**
 * export kotlin variable to javascript world
 */
inline fun <reified T: Any> jsExport(varName: String, variable: T) {
    val valueStr = json.encodeToString<T>(variable)
    log.info("Add variable to JavaScript {} ==> {}", varName, valueStr)

    JavaScriptVariableStore[varName] = valueStr
}