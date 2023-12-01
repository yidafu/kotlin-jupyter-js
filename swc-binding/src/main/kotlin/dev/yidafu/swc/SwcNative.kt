package dev.yidafu.swc

import dev.yidafu.swc.types.Options
import dev.yidafu.swc.types.ParserConfig
import kotlinx.serialization.ExperimentalSerializationApi
import kotlinx.serialization.encodeToString
import kotlinx.serialization.json.Json

class SwcNative {
    init {
        try {
            // 加载 DLL 文件
            System.loadLibrary("swc_binding")
        } catch (e: UnsatisfiedLinkError) {
            val dllPath = DllLoader.copyDll2Temp("swc_binding")
            System.load(dllPath)
        }
    }

    @OptIn(ExperimentalSerializationApi::class)
    private val json = Json {
        encodeDefaults = true
        explicitNulls = false
    }

    external fun parseSync(code: String, options: String, filename: String?): String

    external fun parseFileSync(filepath: String, options: String): String

    fun parseSync(code: String, options: ParserConfig, filename: String?): String {
        return parseSync(code, json.encodeToString(options), filename)
    }

    fun parseFileSync(filepath: String, options: ParserConfig): String {
        return parseFileSync(filepath, json.encodeToString(options))
    }

    external fun transformSync(code: String, isModule: Boolean, options: String): String

    external fun transformFileSync(filepath: String, isModule: Boolean, options: String): String

    fun transformSync(code: String, isModule: Boolean, options: Options): String {
        val optionStr = json.encodeToString(options)
        println(optionStr)
        return transformSync(code, isModule, optionStr)
    }

    fun transformFileSync(filepath: String, isModule: Boolean, options: Options): String {
        println(json.encodeToString(options))
        return transformFileSync(filepath, isModule, json.encodeToString(options))
    }
}
