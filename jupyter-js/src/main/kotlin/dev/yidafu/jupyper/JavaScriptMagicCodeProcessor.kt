package dev.yidafu.jupyper

import org.slf4j.LoggerFactory
import dev.yidafu.swc.SwcNative
import dev.yidafu.swc.dsl.esParserConfig
import dev.yidafu.swc.dsl.jscConfig
import dev.yidafu.swc.dsl.tsParserConfig
import dev.yidafu.swc.options
import org.jetbrains.kotlinx.jupyter.api.CodePreprocessor
import org.jetbrains.kotlinx.jupyter.api.HTML
import org.jetbrains.kotlinx.jupyter.api.KotlinKernelHost

class JavaScriptMagicCodeProcessor : CodePreprocessor {
    val log = LoggerFactory.getLogger(JavaScriptMagicCodeProcessor::class.java)

    val swcCompiler: SwcNative = SwcNative()
    override fun accepts(code: String): Boolean {
        val matcher = JsMagicMatcher(code)
        return matcher.match() !== JsMagicMatcher.LanguageType.Kotlin
    }

    fun processJsCode(source: String): String {
        val output = swcCompiler.transformSync(source, false, options {
            jsc = jscConfig {
                target = "es2020"
                parser = esParserConfig { }
            }
        })
        return "dev.yidafu.jupyper.JsCodeResult(\"\"\"${output.code}\"\"\")"
    }

    fun processTsCode(source: String): String {
        val output = swcCompiler.transformSync(source, false, options {
            jsc = jscConfig {
                target = "es2020"
                parser = tsParserConfig { }
            }
        })
        return "dev.yidafu.jupyper.JsCodeResult(\"\"\"${output.code}\"\"\")"
    }

    fun processJsxCode(source: String): String {
        val output = swcCompiler.transformSync(source, false, options {

            jsc = jscConfig {
                target = "es2020"
                parser = esParserConfig {
                    jsx = true
                }
            }
        })
        return "dev.yidafu.jupyper.JsxCodeResult(\"\"\"${output.code}\"\"\")"
    }

    fun processTsxCode(source: String): String {
        val output = swcCompiler.transformSync(source, false, options {
            jsc = jscConfig {
                target = "es2020"
                parser = tsParserConfig {
                    tsx = true
                }
            }
        })
        return "dev.yidafu.jupyper.JsxCodeResult(\"\"\"${output.code}\"\"\")"
    }
    /**
     * Performs code preprocessing
     */
    override fun process(code: String, host: KotlinKernelHost): CodePreprocessor.Result {
        val matcher = JsMagicMatcher(code)
        val lang = matcher.match()
        log.info("process $lang")

        val codeWithOutJs = matcher.sourceWithoutJsMagic
        val outputCode = try {
            when(lang) {
                JsMagicMatcher.LanguageType.JS -> processJsCode(codeWithOutJs)
                JsMagicMatcher.LanguageType.JSX -> processJsxCode(codeWithOutJs)
                JsMagicMatcher.LanguageType.TS -> processTsCode(codeWithOutJs)
                JsMagicMatcher.LanguageType.TSX -> processTsxCode(codeWithOutJs)
                JsMagicMatcher.LanguageType.Kotlin -> codeWithOutJs
            }
        } catch (e: Exception) {
            println(e)
            log.error("process js code fail", e)
            """
            org.jetbrains.kotlinx.jupyter.api.HTML("<code>${e.message}</code>")    
            """.trimIndent()
        }

        return CodePreprocessor.Result(outputCode)
    }
}
