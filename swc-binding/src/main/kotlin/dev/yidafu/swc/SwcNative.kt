package dev.yidafu.swc

import dev.yidafu.swc.types.Node
import dev.yidafu.swc.types.Options
import dev.yidafu.swc.types.ParserConfig
import dev.yidafu.swc.types.Program
import kotlinx.serialization.ExperimentalSerializationApi
import kotlinx.serialization.encodeToString
import kotlinx.serialization.json.Json

class SwcNative {
    init {
        try {
            // 加载 DLL 文件
            System.loadLibrary("swc_jni")
        } catch (e: UnsatisfiedLinkError) {
            val dllPath = DllLoader.copyDll2Temp("swc_jni")
            System.load(dllPath)
        }
    }

    @OptIn(ExperimentalSerializationApi::class)
    private val json = Json {
        encodeDefaults = true
        explicitNulls = false
        classDiscriminator = "type"
    }

    external fun parseSync(code: String, options: String, filename: String?): String

    external fun parseFileSync(filepath: String, options: String): String

    fun parseSync(code: String, options: ParserConfig, filename: String?): String {
        return parseSync(code, json.encodeToString(options), filename)
    }

    fun parseFileSync(filepath: String, options: ParserConfig): String {
        val res = parseFileSync(filepath, json.encodeToString(options))
        return res
    }

    external fun transformSync(code: String, isModule: Boolean, options: String): String

    external fun transformFileSync(filepath: String, isModule: Boolean, options: String): String

    fun transformSync(code: String, isModule: Boolean, options: Options): TransformOutput {
        val optionStr = json.encodeToString(options)

        val res = transformSync(code, isModule, optionStr)
        return Json.decodeFromString<TransformOutput>(res)
    }

    fun transformFileSync(filepath: String, isModule: Boolean, options: Options): TransformOutput {
        val res = transformFileSync(filepath, isModule, json.encodeToString(options))
        return Json.decodeFromString<TransformOutput>(res)
    }

    external fun printSync(program: String, options: String): String

    fun printSync(program: Program, options: Options) : TransformOutput {
        val pStr = Json.encodeToString<Program>(program)
        println(pStr)
        val oStr =Json.encodeToString(options)
        val res = printSync(pStr, oStr)
        return Json.decodeFromString<TransformOutput>(res)
    }

    external fun minifySync(program: String, options: String): String

    fun minifySync(program: Program, options: Options) : TransformOutput {
        val pStr = Json.encodeToString(program)
        val oStr =Json.encodeToString(options)
        val res = minifySync(pStr, oStr)
        return Json.decodeFromString<TransformOutput>(res)
    }
}
