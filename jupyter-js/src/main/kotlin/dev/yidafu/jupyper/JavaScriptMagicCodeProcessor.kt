package dev.yidafu.jupyper

import dev.yidafu.jupyper.processor.DefaultJavaScriptProcessor
import org.jetbrains.kotlinx.jupyter.api.CodePreprocessor
import org.jetbrains.kotlinx.jupyter.api.KotlinKernelHost
import org.jetbrains.kotlinx.jupyter.api.Notebook
import org.slf4j.Logger
import org.slf4j.LoggerFactory

class JavaScriptMagicCodeProcessor(
    private val notebook: Notebook
) : CodePreprocessor {
    private val log: Logger = LoggerFactory.getLogger(JavaScriptMagicCodeProcessor::class.java)

    override fun accepts(code: String): Boolean {
        val matcher = JsMagicMatcher(code)
        return matcher.match() !== JsMagicMatcher.LanguageType.Kotlin
    }

    /**
     * Performs code preprocessing
     */
    override fun process(code: String, host: KotlinKernelHost): CodePreprocessor.Result {
        val matcher = JsMagicMatcher(code)
        val lang = matcher.match()
        log.info("process $lang")

        val codeWithOutJs = matcher.cleanSourceCode
        val outputCode = try {
            DefaultJavaScriptProcessor(notebook).process(lang, codeWithOutJs)
        } catch (e: Exception) {
            log.error("process js code fail", e)
            "org.jetbrains.kotlinx.jupyter.api.HTML(\"\"\"<code>${e.message}</code>\"\"\")"
        }

        return CodePreprocessor.Result(outputCode)
    }
}
