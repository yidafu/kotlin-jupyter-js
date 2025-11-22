@file:Suppress("ktlint:standard:no-wildcard-imports")

package dev.yidafu.jupyter.processor

import dev.yidafu.jupyter.LanguageType
import dev.yidafu.jupyter.swc.addFirst
import dev.yidafu.swc.SwcJson
import dev.yidafu.swc.SwcNative
import dev.yidafu.swc.generated.*
import dev.yidafu.swc.generated.dsl.*
import org.jetbrains.kotlin.backend.common.phaser.transform
import org.jetbrains.kotlinx.jupyter.api.Notebook
import org.slf4j.LoggerFactory

/**
 * Default JavaScript processor
 *
 * Handles compilation and transformation of JavaScript/TypeScript/JSX/TSX code
 * Uses SWC (Speedy Web Compiler) for code parsing, transformation, and generation
 *
 * Processing flow:
 * 1. Parse source code into AST (Abstract Syntax Tree)
 * 2. Apply various processors (import processing, dependency mapping, etc.)
 * 3. Convert processed AST to JavaScript code
 * 4. Wrap as Kotlin code (returns JsCodeResult or JsxCodeResult)
 *
 * @param notebook Current Notebook instance for accessing variable state
 */
class DefaultJavaScriptProcessor(
    private val notebook: Notebook,
) {
    private val log = LoggerFactory.getLogger(DefaultJavaScriptProcessor::class.java)

    /**
     * SWC compiler instance
     * Used for parsing and transforming JavaScript/TypeScript code
     */
    private val swcCompiler: SwcNative = SwcNative()

    /**
     * JavaScript parse options
     * Configured for ES2020 target with top-level await and nullish coalescing operator support
     */
    private val jsParseOpt
        get() =
            esParseOptions {
                target = JscTarget.ES2020
                comments = false
                topLevelAwait = true
                nullishCoalescing = true
            }

    /**
     * JSX parse options
     * Configured for ES2020 target with JSX syntax support enabled
     */
    private val jsxParseOpt
        get() =
            esParseOptions {
                jsx = true
                target = JscTarget.ES2020
                comments = false
                topLevelAwait = true
                nullishCoalescing = true
            }

    /**
     * JavaScript print options
     * Used to convert AST to JavaScript code
     */
    private val jsPrintOpt
        get() =
            options {
                jsc =
                    jscConfig {
                        target = JscTarget.ES2020
                    }
            }

    /**
     * TypeScript parse options
     * Configured for ES2020 target with TypeScript syntax support
     */
    private val tsParseOpt
        get() =
            tsParseOptions {
                target = JscTarget.ES2020
                script = false
                comments = false
            }

    /**
     * TypeScript print options
     * Used to convert TypeScript AST to JavaScript code
     */
    private val tsPrintOpt
        get() =
            options {
                jsc =
                    jscConfig {
                        target = JscTarget.ES2020
                    }
            }

    /**
     * TSX parse options
     * Configured for ES2020 target with TypeScript + JSX syntax support
     */
    private val tsxParseOpt
        get() =
            tsParseOptions {
                target = JscTarget.ES2020
                comments = false
                script = false
                tsx = true
            }

    /**
     * Executes processor chain for JavaScript code
     *
     * Executes in order:
     * 1. JupyterImportProcessor: Processes @jupyter virtual package imports
     * 2. ImportSourceMappingProcessor: Maps library names to CDN URLs
     * 3. InlineImportSourceProcessor: Processes inline import sources
     *
     * @param program AST program node
     * @param context JavaScript processing context
     * @return Processed context
     */
    private fun executeJsCodeProcessor(
        program: Program,
        context: JavascriptProcessContext,
    ): JavascriptProcessContext {
        JupyterImportProcessor(notebook).process(program, context)
        ImportSourceMappingProcessor().process(program, context)
        InlineImportSourceProcessor().process(program, context)
        return context
    }

    /**
     * Executes processor chain for JSX code
     *
     * First executes JavaScript processor chain, then:
     * - DefaultExportProcessor: Processes default exports for React component rendering
     *
     * @param program AST program node
     * @param context JavaScript processing context
     * @return Processed context
     */
    private fun executeJsxProcessor(
        program: Program,
        context: JavascriptProcessContext,
    ): JavascriptProcessContext {
        executeJsCodeProcessor(program, context)
        DefaultExportProcessor().process(program, context)

        return context
    }

    /**
     * Parses JavaScript code into AST
     *
     * @param source JavaScript source code
     * @param context JavaScript processing context
     * @return Parsed AST program node
     */
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

    /**
     * Processes JavaScript code
     *
     * Complete flow:
     * 1. Parse to AST
     * 2. Apply processor chain
     * 3. Convert to JavaScript code
     * 4. Wrap as JsCodeResult
     *
     * @param source JavaScript source code
     * @param context JavaScript processing context
     * @return Wrapped Kotlin code string
     */
    private fun processJsCode(
        source: String,
        context: JavascriptProcessContext,
    ): String {
        val program: Program = parseJsCode(source, context)
        log.warn("processJsCode ${context.globalImports.size}")
        program.addFirst(context.globalImports)
        val output =
            swcCompiler.printSync(
                program,
                jsPrintOpt,
            )
        return "dev.yidafu.jupyter.JsCodeResult(\"\"\" $context\n ${output.code} \"\"\")"
    }

    /**
     * Transforms TypeScript code
     *
     * First uses SWC to convert TypeScript to JavaScript, then parses to AST
     *
     * @param source TypeScript source code
     * @param context JavaScript processing context
     * @return Transformed AST program node
     */
    internal fun transformTsCode(
        source: String,
        context: JavascriptProcessContext,
    ): Program {
        // 1. transform code ts javascript
        val transformOutput =
            swcCompiler.transformSync(
                source,
                options {
                    jsc =
                        jscConfig {
                            parser = tsParseOpt
                            tsxParseOpt
                        }
                },
            )

        // 2. parse code to AST Tree
        // transformSync 已将 TypeScript 转换为 JavaScript，所以使用 esParseOptions 解析
        val program =
            swcCompiler.parseSync(
                transformOutput.code,
                esParseOptions {
                    target = JscTarget.ES2020
                    comments = false
                    topLevelAwait = true
                    nullishCoalescing = true
                },
                "jupyter-cell-js.js",
            )

        // 3. modify AST Tree
        executeJsCodeProcessor(program, context)

        return program
    }

    /**
     * Processes TypeScript code
     *
     * @param source TypeScript source code
     * @param context JavaScript processing context
     * @return Wrapped Kotlin code string
     */
    private fun processTsCode(
        source: String,
        context: JavascriptProcessContext,
    ): String {
        val program = transformTsCode(source, context)
        program.addFirst(context.globalImports)

        // transformTsCode 已将 TypeScript 转换为 JavaScript，所以使用 jsPrintOpt
        val output = swcCompiler.printSync(program, jsPrintOpt)

        return "dev.yidafu.jupyter.JsCodeResult(\"\"\" $context\n ${output.code} \"\"\")"
    }

    /**
     * Transforms JSX code
     *
     * First uses SWC to convert JSX to JavaScript, then parses to AST
     *
     * @param source JSX source code
     * @param context JavaScript processing context
     * @return Transformed AST program node
     */
    internal fun transformJsxCode(
        source: String,
        context: JavascriptProcessContext,
    ): Program {
        val transformOutput =
            swcCompiler.transformSync(
                source,
                options {
                    jsc =
                        jscConfig {
                            parser = jsxParseOpt
                        }
                },
            )

        // transformSync 已将 JSX 转换为 JavaScript，所以使用 esParseOptions 解析
        val program =
            swcCompiler.parseSync(
                transformOutput.code,
                esParseOptions {
                    target = JscTarget.ES2020
                    comments = false
                    topLevelAwait = true
                    nullishCoalescing = true
                },
                "jupyter-cell-jsx.js",
            )

        // 注意：processor 在 processJsxCode 中调用，不在这里调用
        return program
    }

    /**
     * Processes JSX code
     *
     * @param source JSX source code
     * @param context JavaScript processing context
     * @return Wrapped Kotlin code string (returns JsxCodeResult)
     */
    private fun processJsxCode(
        source: String,
        context: JavascriptProcessContext,
    ): String {
        val program = transformJsxCode(source, context)

        executeJsxProcessor(program, context)
        program.addFirst(context.globalImports)
        val output =
            try {
                swcCompiler.printSync(program, jsPrintOpt)
            } catch (e: Exception) {
                log.error("printSync failed for JSX code", e)
                throw e
            }

        return "dev.yidafu.jupyter.JsxCodeResult(\"\"\" $context\n ${output.code} \"\"\")"
    }

    /**
     * Transforms TSX code
     *
     * First uses SWC to convert TSX to JavaScript, then parses to AST
     *
     * @param source TSX source code
     * @param context JavaScript processing context
     * @return Transformed AST program node
     */
    fun transformTsxCode(
        source: String,
        context: JavascriptProcessContext,
    ): Program {
        val transformOutput =
            swcCompiler.transformSync(
                source,
                options {
                    jsc =
                        jscConfig {
                            parser = tsxParseOpt
                            target = JscTarget.ES2020
                            transform =
                                transformConfig {
                                }
                        }
                },
            )

        // transformSync 已将 TSX 转换为 JavaScript，所以使用 esParseOptions 解析
        val program =
            swcCompiler.parseSync(
                transformOutput.code,
                esParseOptions {
                    target = JscTarget.ES2020
                    comments = false
                    topLevelAwait = true
                    nullishCoalescing = true
                },
                "jupyter-cell-tsx.js",
            )

        return program
    }

    /**
     * Processes TSX code
     *
     * @param source TSX source code
     * @param context JavaScript processing context
     * @return Wrapped Kotlin code string (returns JsxCodeResult)
     */
    private fun processTsxCode(
        source: String,
        context: JavascriptProcessContext,
    ): String {
        val program = transformTsxCode(source, context)

        executeJsxProcessor(program, context)
        program.addFirst(context.globalImports)

        // transformTsxCode 已将 TSX 转换为 JavaScript，所以使用 jsPrintOpt
        val output = swcCompiler.printSync(program, jsPrintOpt)

        return "dev.yidafu.jupyter.JsxCodeResult(\"\"\" $context\n ${output.code} \"\"\")"
    }

    /**
     * Processes code based on language type
     *
     * This is the main entry method that calls appropriate processing method based on language type
     *
     * @param langType Language type (JS/TS/JSX/TSX/Kotlin)
     * @param sourceCode Source code
     * @return Processed Kotlin code string
     */
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
        val output = result?.replace($$"${", $$"${'$'}{") ?: ""
        log.debug("javascript output code:\n{}", output)
        return output
    }
}
