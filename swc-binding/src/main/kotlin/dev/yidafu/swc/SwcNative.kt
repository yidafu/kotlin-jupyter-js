package dev.yidafu.swc

import dev.yidafu.swc.types.ParseOptions
import kotlinx.serialization.ExperimentalSerializationApi
import kotlinx.serialization.encodeToString
import kotlinx.serialization.json.Json

class SwcNative {
    init {
        // TODO: load from resource dir
        System.loadLibrary("swc_binding")
//        System.load("/Users/dovyih/gitlab/kotlin-notebook-js/swc-binding/target/debug/libswc_binding.dylib")
    }

    @OptIn(ExperimentalSerializationApi::class)
    private val json = Json {
        encodeDefaults = true
        explicitNulls = false
    }

    external fun sayHello(input: String): String

    external fun parseSync(code: String, options: String, filename: String?): String

    external fun parseFileSync(filepath: String, options: String): String

    external fun transformSync(code: String, isModule: Boolean, options: String): String

    external fun transformFileSync(filepath: String, isModule: Boolean, options: String): String

    fun transformSync(code: String, isModule: Boolean, options: ParseOptions): String {
        val optionStr =  json.encodeToString(options)
        println(optionStr)
        return transformSync(code,isModule, optionStr)
    }

    fun transformFileSync(filepath: String, isModule: Boolean, options: ParseOptions): String {
        return transformFileSync(filepath, isModule, json.encodeToString(options))
    }
}
