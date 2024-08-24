package dev.yidafu.jupyter.processor

import dev.yidafu.jupyter.LanguageType
import dev.yidafu.swc.SwcNative
import dev.yidafu.swc.booleanable.BooleanableString
import dev.yidafu.swc.dsl.jscConfig
import dev.yidafu.swc.esParseOptions
import dev.yidafu.swc.options
import dev.yidafu.swc.tsParseOptions
import dev.yidafu.swc.types.Program
import org.jetbrains.kotlinx.jupyter.api.Notebook
import org.slf4j.LoggerFactory

class DefaultJavaScriptProcessor(private val notebook: Notebook) {
    private val log = LoggerFactory.getLogger(DefaultJavaScriptProcessor::class.java)

    private val swcCompiler: SwcNative = SwcNative()

    private val jsParseOpt
        get() =
            esParseOptions {
                target = "es2020"
                comments = false
                topLevelAwait = true
                nullishCoalescing = true
            }
    private val jsxParseOpt
        get() =
            esParseOptions {
                jsx = true
                target = "es2020"
                comments = false
                topLevelAwait = true
                nullishCoalescing = true
            }
    private val jsPrintOpt
        get() =
            options {
                jsc =
                    jscConfig {
                        target = "es2020"
                        parser = jsParseOpt
                    }
            }
    private val tsParseOpt
        get() =
            tsParseOptions {
                target = "es2020"
                comments = false
            }
    private val tsPrintOpt
        get() =
            options {
                jsc =
                    jscConfig {
                        target = "es2020"
                        parser = tsParseOpt
                    }
            }

    private val tsxParseOpt
        get() =
            tsParseOptions {
                target = "es2020"
                comments = false
                tsx = true
            }

    private fun executeJsCodeProcessor(
        program: Program,
        context: JavascriptProcessContext,
    ): JavascriptProcessContext {
        JupyterImportProcessor(notebook).process(program, context)
        ImportSourceMappingProcessor().process(program, context)
        InlineImportSourceProcessor().process(program, context)
        return context
    }

    private fun executeJsxProcessor(
        program: Program,
        context: JavascriptProcessContext,
    ): JavascriptProcessContext {
        executeJsCodeProcessor(program, context)
        DefaultExportProcessor().process(program, context)

        return context
    }

    fun parseJsCode(
        source: String,
        context: JavascriptProcessContext,
    ): Program {
        val program =
            swcCompiler.parseSync(
                source,
                jsParseOpt,
                "jupyter-cell.js",
            )

        executeJsCodeProcessor(program, context)
        return program
    }

    private fun processJsCode(
        source: String,
        context: JavascriptProcessContext,
    ): String {
        val program = parseJsCode(source, context)

        val output =
            swcCompiler.printSync(
                program,
                jsPrintOpt,
            )
        return "dev.yidafu.jupyter.JsCodeResult(\"\"\" $context\n ${output.code} \"\"\")"
    }

    internal fun transformTsCode(
        source: String,
        context: JavascriptProcessContext,
    ): Program {
        val transformOutput =
            swcCompiler.transformSync(
                source,
                false,
                options {
                    jsc =
                        jscConfig {
                            parser = tsParseOpt
                        }
                },
            )

        val program =
            swcCompiler.parseSync(
                transformOutput.code,
                tsParseOpt,
                "jupyter-cell-js.js",
            )

        executeJsCodeProcessor(program, context)

        return program
    }

    private fun processTsCode(
        source: String,
        context: JavascriptProcessContext,
    ): String {
        val program = transformTsCode(source, context)
        val output = swcCompiler.printSync(program, tsPrintOpt)

        return "dev.yidafu.jupyter.JsCodeResult(\"\"\" $context\n ${output.code} \"\"\")"
    }

    internal fun transformJsxCode(
        source: String,
        context: JavascriptProcessContext,
    ): Program {
        val transformOutput =
            swcCompiler.transformSync(
                source,
                false,
                options {
                    jsc =
                        jscConfig {
                            parser = jsxParseOpt
                        }
                    isModule = BooleanableString.ofTrue()
                },
            )

        val program =
            swcCompiler.parseSync(
                transformOutput.code,
                jsxParseOpt,
                "jupyter-cell-jsx.js",
            )

        executeJsxProcessor(program, context)
        return program
    }

    private fun processJsxCode(
        source: String,
        context: JavascriptProcessContext,
    ): String {
        val program = transformJsxCode(source, context)

        executeJsxProcessor(program, context)

        val output = swcCompiler.printSync(program, jsPrintOpt)

        return "dev.yidafu.jupyter.JsxCodeResult(\"\"\" $context\n ${output.code} \"\"\")"
    }

    fun transformTsxCode(
        source: String,
        context: JavascriptProcessContext,
    ): Program {
        val transformOutput =
            swcCompiler.transformSync(
                source,
                false,
                options {
                    jsc =
                        jscConfig {
                            parser = tsxParseOpt
                        }
                },
            )

        val program =
            swcCompiler.parseSync(
                transformOutput.code,
                tsxParseOpt,
                "jupyter-cell-tsx.js",
            )
        return program
    }

    private fun processTsxCode(
        source: String,
        context: JavascriptProcessContext,
    ): String {
        val program = transformTsxCode(source, context)

        executeJsxProcessor(program, context)

        val output = swcCompiler.printSync(program, tsPrintOpt)

        return "dev.yidafu.jupyter.JsxCodeResult(\"\"\" $context\n ${output.code} \"\"\")"
    }

    fun process(
        langType: LanguageType,
        sourceCode: String,
    ): String {
        val context = JavascriptProcessContext(this)
        val result =
            context.dependencyScope("jupyter-cell.js") {
                when (langType) {
                    LanguageType.JS -> processJsCode(sourceCode, context)
                    LanguageType.TS -> processTsCode(sourceCode, context)
                    LanguageType.JSX -> processJsxCode(sourceCode, context)
                    LanguageType.TSX -> processTsxCode(sourceCode, context)
                    LanguageType.Kotlin -> sourceCode
                }
            }
        // escaping javascript template ${ }
        // https://stackoverflow.com/a/32994616
        val output = result.replace("\${", "\${'$'}{")
        log.debug("javascript output code:\n{}", output)
        return output
    }
}
