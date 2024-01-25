package dev.yidafu.jupyper.processor

import dev.yidafu.jupyper.swc.forEachImportDeclaration
import dev.yidafu.jupyper.swc.replace
import dev.yidafu.swc.dsl.*
import dev.yidafu.swc.emptySpan
import dev.yidafu.swc.types.*
import org.slf4j.LoggerFactory
import java.io.File
import java.net.URL
import kotlin.io.encoding.Base64
import kotlin.io.encoding.ExperimentalEncodingApi

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

                    log.info("inline js context {}", inlineContext)
                    if (inlineContext.isNotEmpty()) {

                        val inlineProgram = context.processor.parseJsCode(inlineContext, context)
                        if (inlineProgram is Module) {
                            program.replace(it, toIIFE(url2VarName(originSource), inlineProgram))
                        }
                    }
                }

            }
        }
    }

    @OptIn(ExperimentalEncodingApi::class)
    fun url2VarName(url: String): String {
        return "inline_" + Base64.encode(url.toByteArray()).replace("=", "")
    }

    private fun toIIFE(varName: String, module: Module): VariableDeclaration {
        return  createVariableDeclaration {
            span = emptySpan()
            kind = "const"
            declarations = arrayOf(
                variableDeclarator {
                    span = emptySpan()
                    id = identifier {
                        span = emptySpan()
                        value = varName
                    }
                    definite = false
                    init = callExpression {
                        span = emptySpan()
                        callee = parenthesisExpression {
                            span = emptySpan()
                            expression = functionExpression {
                                span = emptySpan()
                                async = false
                                generator = false
                                params = arrayOf(
                                    param {
                                        span = emptySpan()
                                        decorators = emptyArray()
                                        pat = assignmentExpression {
                                            operator = "="
                                            span = emptySpan()
                                            left = identifier {
                                                span = emptySpan()
                                                value = "exports"
                                                optional = false
                                            }
                                            right = objectExpression {
                                                span = emptySpan()
                                                properties = emptyArray()
                                            }
                                        }
                                    }
                                )
                                body = blockStatement {
                                    span = emptySpan()

                                    stmts = (
                                        (module.body?.map { it as Statement } ?: emptyList())
                                            + listOf(returnStatement {
                                                span = emptySpan()
                                                argument = identifier {
                                                    span = emptySpan()
                                                    value = "exports"
                                                    optional = false
                                                }
                                            }
                                        )
                                    ).toTypedArray()
                                }
                            }
                        }
                    }
                }
            )
        }
    }
}