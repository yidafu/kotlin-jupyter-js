package dev.yidafu.jupyper

import dev.yidafu.jupyper.processor.DefaultExportProcessor
import dev.yidafu.jupyper.processor.JupyterImportProcessor
import dev.yidafu.swc.SwcNative
import dev.yidafu.swc.dsl.jscConfig
import dev.yidafu.swc.esParseOptions
import dev.yidafu.swc.options
import dev.yidafu.swc.tsParseOptions
import dev.yidafu.swc.types.Program
import org.jetbrains.kotlinx.jupyter.api.CodePreprocessor
import org.jetbrains.kotlinx.jupyter.api.KotlinKernelHost
import org.jetbrains.kotlinx.jupyter.api.Notebook
import org.slf4j.LoggerFactory

class JavaScriptMagicCodeProcessor(
    private val notebook: Notebook,
    ) : CodePreprocessor {
    val log = LoggerFactory.getLogger(JavaScriptMagicCodeProcessor::class.java)

    val swcCompiler: SwcNative = SwcNative()
    override fun accepts(code: String): Boolean {
        val matcher = JsMagicMatcher(code)
        return matcher.match() !== JsMagicMatcher.LanguageType.Kotlin
    }
    private val jsParseOpt
        get() = esParseOptions {
            target = "es2020"
            comments = false
            topLevelAwait = true
            nullishCoalescing = true
        }
    private val jsxParseOpt
        get() = esParseOptions {
            jsx = true
            target = "es2020"
            comments = false
            topLevelAwait = true
            nullishCoalescing = true
        }
    private val jsPrintOpt
        get() = options {
            jsc = jscConfig {
                target = "es2020"
                parser = jsParseOpt
            }
        }
    private val tsParseOpt
        get() = tsParseOptions {
            target = "es2020"
            comments = false
        }
    private val tsPrintOpt
        get() = options {
            jsc = jscConfig {
                target = "es2020"
                parser = tsParseOpt
            }
        }

    private val tsxParseOpt
        get() = tsParseOptions {
            target = "es2020"
            comments = false
            tsx = true
        }

    private fun executeJsProcessor(program: Program) {
        JupyterImportProcessor(notebook).process(program)
    }

    private fun executeJsxProcessor(program: Program) {
        JupyterImportProcessor(notebook).process(program)
        DefaultExportProcessor().process(program)
    }

    private fun executeJsProcessor(source: String): String {
        val program = swcCompiler.parseSync(
            source,
            jsParseOpt,
            "jupyter-cell.js",
        )

        executeJsProcessor(program)

        val output = swcCompiler.printSync(
            program,
            jsPrintOpt,
        )
        return "dev.yidafu.jupyper.JsCodeResult(\"\"\" ${output.code} \"\"\")"
    }

    private fun processTsCode(source: String): String {
        val transformOutput = swcCompiler.transformSync(
            source,
            true,
            options {
                jsc = jscConfig {
                    parser = tsParseOpt
                }
            },
        )

        val program = swcCompiler.parseSync(
            transformOutput.code,
            tsParseOpt,
            "jupyter-cell-js.js",
        )

        executeJsProcessor(program)

        val output = swcCompiler.printSync(program, tsPrintOpt)

        return "dev.yidafu.jupyper.JsCodeResult(\"\"\" ${output.code} \"\"\")"
    }

    private fun processJsxCode(source: String): String {
        val transformOutput = swcCompiler.transformSync(
            source,
            false,
            options {
                    jsc = jscConfig {
                        parser = jsxParseOpt
                    }
            },
        )

        val program = swcCompiler.parseSync(
            transformOutput.code,
            jsxParseOpt,
            "jupyter-cell-jsx.js",
        )

        executeJsxProcessor(program)

        val output = swcCompiler.printSync(program, jsPrintOpt)

        return "dev.yidafu.jupyper.JsxCodeResult(\"\"\" ${output.code} \"\"\")"
    }

    private fun processTsxCode(source: String): String {
        val transformOutput = swcCompiler.transformSync(
            source,
            true,
            options {
                jsc = jscConfig {
                    parser = tsxParseOpt
                }
            },
        )

        val program = swcCompiler.parseSync(
            transformOutput.code,
            tsxParseOpt,
            "jupyter-cell-tsx.js",
        )

        executeJsxProcessor(program)

        val output = swcCompiler.printSync(program, tsPrintOpt)

        return "dev.yidafu.jupyper.JsxCodeResult(\"\"\" ${output.code} \"\"\")"
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
            when (lang) {
                JsMagicMatcher.LanguageType.JS -> executeJsProcessor(codeWithOutJs)
                JsMagicMatcher.LanguageType.TS -> processTsCode(codeWithOutJs)
                JsMagicMatcher.LanguageType.JSX -> processJsxCode(codeWithOutJs)
                JsMagicMatcher.LanguageType.TSX -> processTsxCode(codeWithOutJs)
                JsMagicMatcher.LanguageType.Kotlin -> codeWithOutJs
            }
        } catch (e: Exception) {
            log.error("process js code fail", e)
            "org.jetbrains.kotlinx.jupyter.api.HTML(\"\"\"<code>${e.message}</code>\"\"\")"
        }

        return CodePreprocessor.Result(outputCode)
    }
}
