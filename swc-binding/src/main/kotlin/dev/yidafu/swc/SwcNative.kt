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

    external fun parseSync(
        code: String,
        options: String,
        filename: String?
    ): String

    external fun parseFileSync(
        filepath: String,
        options: String
    ): String

    fun parseSync(
        code: String,
        options: ParserConfig,
        filename: String?
    ): String {
        val optStr = configJson.encodeToString(options)
        return parseSync(code, optStr, filename)
    }

    fun parseFileSync(
        filepath: String,
        options: TsParserConfig
    ): String {
        val res = parseFileSync(filepath, configJson.encodeToString<ParserConfig>(options))
        return res
    }

    fun parseFileSync(
        filepath: String,
        options: EsParserConfig
    ): String {
        val res = parseFileSync(filepath, configJson.encodeToString<ParserConfig>(options))
        return res
    }

    external fun transformSync(
        code: String,
        isModule: Boolean,
        options: String
    ): String

    external fun transformFileSync(
        filepath: String,
        isModule: Boolean,
        options: String
    ): String

    fun transformSync(
        code: String,
        isModule: Boolean,
        options: Options
    ): TransformOutput {
        val optionStr = configJson.encodeToString(options)
        val res = transformSync(code, isModule, optionStr)
        return astJson.decodeFromString<TransformOutput>(res)
    }

    fun transformFileSync(
        filepath: String,
        isModule: Boolean,
        options: Options
    ): TransformOutput {
        val res = transformFileSync(filepath, isModule, configJson.encodeToString(options))
        return astJson.decodeFromString<TransformOutput>(res)
    }

    external fun printSync(
        program: String,
        options: String
    ): String

    fun printSync(
        program: Program,
        options: Options
    ): TransformOutput {
        val pStr = astJson.encodeToString(program)
        val oStr = configJson.encodeToString(options)
        val res = printSync(pStr, oStr)
        return astJson.decodeFromString<TransformOutput>(res)
    }

    external fun minifySync(
        program: String,
        options: String
    ): String

    fun minifySync(
        program: Program,
        options: Options
    ): TransformOutput {
        val pStr = astJson.encodeToString(program)
        val oStr = configJson.encodeToString(options)
        val res = minifySync(pStr, oStr)
        return astJson.decodeFromString<TransformOutput>(res)
    }
}
