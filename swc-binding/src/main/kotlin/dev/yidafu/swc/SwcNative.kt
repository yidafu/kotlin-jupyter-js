package dev.yidafu.swc

import dev.yidafu.swc.types.* // ktlint-disable no-wildcard-imports
import kotlinx.serialization.encodeToString
import kotlin.jvm.Throws

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

    /**
     * external native method. recommend using `parseSync(code: String, options: ParserConfig, filename: String?): Program`
     *
     * [swc#parsesync](https://swc.rs/docs/usage/core#parsesync)
     *
     * you could use this method only when the overhead method was broken
     * @throws [RuntimeException]
     * @sample [dev.yidafu.swc.sample.parseSyncBasicUsage]
     * @throws [SwcAnyException]
     * @param [code] source code
     * @param [options] options json string. see [dev.yidafu.swc.types.ParserConfig].
     * @param [filename] js file name
     * @return ast tree json string
     */
    @Throws(RuntimeException::class)
    external fun parseSync(
        code: String,
        options: String,
        filename: String?,
    ): String

    /**
     * parse js code to AST Tree
     *
     * [swc#parsesync](https://swc.rs/docs/usage/core#parsesync)
     *
     * @sample dev.yidafu.swc.sample.parseSyncEsSample
     * @sample dev.yidafu.swc.sample.parseSyncTsSample
     * @sample dev.yidafu.swc.sample.parseSyncJsxSample
     * @throws [RuntimeException]
     * @param [code] source code
     * @param [options] parse option
     * @param [filename] source code filename
     * @return ast tree
     */
    @Throws(RuntimeException::class)
    fun parseSync(
        code: String,
        options: ParserConfig,
        filename: String?,
    ): Program {
        val optStr = configJson.encodeToString<ParserConfig>(options)
        val output = parseSync(code, optStr, filename)
        return astJson.decodeFromString<Program>(output)
    }

    /**
     * external native method. recommend using  `parseSync(filepath: String, options: ParserConfig): Program`
     *
     * [swc#parseFileSync](https://swc.rs/docs/usage/core#parsefilesync)
     *
     * you could use this method only when the overhead method was broken
     *
     * @throws [RuntimeException]
     * @sample [dev.yidafu.swc.sample.parseFileSyncBasicUsage]
     * @param filepath filepath to source code
     * @param [options] options json string. see [dev.yidafu.swc.types.ParserConfig].
     * @return ast tree json string
     */
    @Throws(RuntimeException::class)
    external fun parseFileSync(
        filepath: String,
        options: String,
    ): String

    /**
     * parse js file to AST Tree
     *
     * [swc#parseFileSync](https://swc.rs/docs/usage/core#parsefilesync)
     *
     * @throws [RuntimeException]
     * @sample dev.yidafu.swc.sample.parseFileSyncEsSample
     * @param [filepath] filepath to source code
     * @param [options] parse options
     * @return ast tree node
     */
    @Throws(RuntimeException::class)
    fun parseFileSync(
        filepath: String,
        options: ParserConfig,
    ): Program {
        val optStr = configJson.encodeToString<ParserConfig>(options)
        val output = parseFileSync(filepath, optStr)
        return astJson.decodeFromString<Program>(output)
    }

//    fun parseFileSync(
//        filepath: String,
//        options: EsParserConfig,
//    ): String {
//        val res = parseFileSync(filepath, configJson.encodeToString<ParserConfig>(options))
//        return res
//    }

    /**
     * @throws [RuntimeException]
     *
     */
    @Throws(RuntimeException::class)
    external fun transformSync(
        code: String,
        isModule: Boolean,
        options: String,
    ): String

    /**
     * @throws [RuntimeException]
     *
     */
    @Throws(RuntimeException::class)
    external fun transformFileSync(
        filepath: String,
        isModule: Boolean,
        options: String,
    ): String

    /**
     * @throws [RuntimeException]
     *
     */
    @Throws(RuntimeException::class)
    fun transformSync(
        code: String,
        isModule: Boolean,
        options: Options,
    ): TransformOutput {
        val optionStr = configJson.encodeToString(options)
        val res = transformSync(code, isModule, optionStr)
        return astJson.decodeFromString<TransformOutput>(res)
    }

    /**
     * @throws [RuntimeException]
     *
     */
    @Throws(RuntimeException::class)
    fun transformFileSync(
        filepath: String,
        isModule: Boolean,
        options: Options,
    ): TransformOutput {
        val res = transformFileSync(filepath, isModule, configJson.encodeToString(options))
        return astJson.decodeFromString<TransformOutput>(res)
    }

    /**
     * @throws [RuntimeException]
     *
     */
    @Throws(RuntimeException::class)
    external fun printSync(
        program: String,
        options: String,
    ): String

    /**
     * @throws [RuntimeException]
     *
     */
    @Throws(RuntimeException::class)
    fun printSync(
        program: Program,
        options: Options,
    ): TransformOutput {
        val pStr = astJson.encodeToString(program)
        val oStr = configJson.encodeToString(options)
        val res = printSync(pStr, oStr)
        return astJson.decodeFromString<TransformOutput>(res)
    }

    /**
     * @throws [RuntimeException]
     *
     */
    @Throws(RuntimeException::class)
    external fun minifySync(
        program: String,
        options: String,
    ): String

    /**
     * @throws [RuntimeException]
     *
     */
    @Throws(RuntimeException::class)
    fun minifySync(
        program: Program,
        options: Options,
    ): TransformOutput {
        val pStr = astJson.encodeToString(program)
        val oStr = configJson.encodeToString(options)
        val res = minifySync(pStr, oStr)
        return astJson.decodeFromString<TransformOutput>(res)
    }
}
