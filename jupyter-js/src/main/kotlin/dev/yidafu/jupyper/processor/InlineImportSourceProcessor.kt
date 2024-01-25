package dev.yidafu.jupyper.processor

import dev.yidafu.jupyper.JsMagicMatcher
import dev.yidafu.jupyper.swc.forEachImportDeclaration
import dev.yidafu.jupyper.swc.replace
import dev.yidafu.swc.types.Module
import dev.yidafu.swc.types.Program
import org.slf4j.LoggerFactory
import java.io.File
import java.net.URL

/**
 * process inline code
 * + relative/absolute local js file
 * + remote js file
 *     ```js
 *     import { foo } from './local.js';
 *     console.log(foo);
 *     ```
 *     ```js
 *     // ./local.js
 *     export const foo 'bar';
 *     ```
 *
 *     transform to
 *
 *     ```js
 *     const localJsExports = (function (exports = {}) {
 *         const foo = "bar";
 *
 *         exports.foo = foo;
 *         return exports;
 *     })()
 *
 *     const foo = localJsExports.foo;
 *     ```
    */
class InlineImportSourceProcessor : JavaScriptProcessor {
    private val log = LoggerFactory.getLogger(InlineImportSourceProcessor::class.java)

    override fun process(program: Program, context: JavascriptProcessContext) {
        if (program is Module) {
            program.forEachImportDeclaration {
                val originSource = it.source?.value
                if (!originSource.isNullOrEmpty()) {
                    // relative path, absolute path
                    val inlineContext = if (
                        originSource.startsWith(".")
                        || originSource.startsWith("/")) {
                        val file = File(originSource)
                        log.info("local js file path ${file.absolutePath.toString()}")
                        file.readText()

                    }
                    // inline remote source
                    else if (originSource.substringAfter("?").contains("inline")) {
                        log.info("fetch remote script $originSource")
                        URL(originSource).readText()
                    } else {
                        ""
                    }
                    if (inlineContext.isNotEmpty()) {

                        val inlineProgram = context.processor.parseJsCode(inlineContext, context)
                        if (inlineProgram is Module) {
                            program.replace(it, *(inlineProgram.body ?: emptyArray()))
                        }
                    }
                }

            }
        }
    }
}