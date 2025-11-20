package dev.yidafu.jupyper

import dev.yidafu.jupyper.errors.ErrorFactory
import dev.yidafu.jupyper.errors.ErrorFormatter
import dev.yidafu.jupyper.processor.DefaultJavaScriptProcessor
import org.jetbrains.kotlinx.jupyter.api.CodePreprocessor
import org.jetbrains.kotlinx.jupyter.api.KotlinKernelHost
import org.jetbrains.kotlinx.jupyter.api.Notebook
import org.slf4j.Logger
import org.slf4j.LoggerFactory

/**
 * JavaScript Magic code preprocessor
 *
 * Handles JavaScript/TypeScript/JSX/TSX Magic commands (e.g., %js, %ts, %jsx, %tsx) in Jupyter Notebook
 * Converts code after Magic commands into Kotlin code that can be executed in Jupyter
 *
 * @param notebook Current Notebook instance for accessing variable state and context
 */
class JavaScriptMagicCodeProcessor(
    private val notebook: Notebook,
) : CodePreprocessor {
    private val log: Logger = LoggerFactory.getLogger(JavaScriptMagicCodeProcessor::class.java)

    /**
     * Checks if code contains JavaScript Magic commands
     *
     * @param code Code to check
     * @return true if code contains JavaScript Magic commands, false otherwise
     */
    override fun accepts(code: String): Boolean {
        val matcher = JsMagicMatcher(code)
        return matcher.match() !== LanguageType.Kotlin
    }

    /**
     * Processes code containing JavaScript Magic commands
     *
     * 1. Identifies Magic command type (JS/TS/JSX/TSX) in code
     * 2. Removes Magic commands to get clean source code
     * 3. Processes code using JavaScriptProcessor
     * 4. Converts processed code to Kotlin code (returns JsCodeResult or JsxCodeResult)
     * 5. Returns formatted error information if processing fails
     *
     * @param code Original code containing Magic commands
     * @param host Kotlin Kernel host instance
     * @return Processed code result
     */
    override fun process(
        code: String,
        host: KotlinKernelHost,
    ): CodePreprocessor.Result {
        val matcher = JsMagicMatcher(code)
        val lang = matcher.match()
        log.info("process $lang")

        val codeWithOutJs = matcher.cleanSourceCode
        val outputCode =
            try {
                DefaultJavaScriptProcessor(notebook).process(lang, codeWithOutJs)
            } catch (e: Exception) {
                log.error("process js code fail", e)
                val error =
                    ErrorFactory.fromException(
                        e,
                        mapOf(
                            "language" to lang.toString(),
                            "codeLength" to codeWithOutJs.length.toString(),
                        ),
                    )
                val errorHtml = ErrorFormatter.formatAsHtml(error)
                "org.jetbrains.kotlinx.jupyter.api.HTML(\"\"\"$errorHtml\"\"\")"
            }

        return CodePreprocessor.Result(outputCode)
    }
}
