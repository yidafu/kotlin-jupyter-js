package dev.yidafu.swc

import dev.yidafu.swc.types.*
import kotlinx.serialization.encodeToString

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

    external fun parseSync(code: String, options: String, filename: String?): String

    external fun parseFileSync(filepath: String, options: String): String

    fun parseSync(code: String, options: TsParserConfig, filename: String?): String {
        return parseSync(code, astJson.encodeToString(options), filename)
    }

    fun parseSync(code: String, options: EsParserConfig, filename: String?): String {
        return parseSync(code, astJson.encodeToString(options), filename)
    }

    fun parseFileSync(filepath: String, options: TsParserConfig): String {
        val res = parseFileSync(filepath, astJson.encodeToString(options))
        return res
    }
    fun parseFileSync(filepath: String, options: EsParserConfig): String {
        val res = parseFileSync(filepath, astJson.encodeToString(options))
        return res
    }


    external fun transformSync(code: String, isModule: Boolean, options: String): String

    external fun transformFileSync(filepath: String, isModule: Boolean, options: String): String

    fun transformSync(code: String, isModule: Boolean, options: Options): TransformOutput {
        val optionStr = astJson.encodeToString(options)
        println(optionStr)
        val res = transformSync(code, isModule, optionStr)
        return astJson.decodeFromString<TransformOutput>(res)
    }

    fun transformFileSync(filepath: String, isModule: Boolean, options: Options): TransformOutput {
        val res = transformFileSync(filepath, isModule, astJson.encodeToString(options))
        return astJson.decodeFromString<TransformOutput>(res)
    }

    external fun printSync(program: String, options: String): String

    fun printSync(program: Program, options: Options): TransformOutput {
        val pStr = astJson.encodeToString(program)
        println(pStr)
        val oStr = astJson.encodeToString(options)
        val res = printSync(pStr, oStr)
        return astJson.decodeFromString<TransformOutput>(res)
    }

    external fun minifySync(program: String, options: String): String

    fun minifySync(program: Program, options: Options): TransformOutput {
        val pStr = astJson.encodeToString(program)
        val oStr = astJson.encodeToString(options)
        val res = minifySync(pStr, oStr)
        return astJson.decodeFromString<TransformOutput>(res)
    }
}
