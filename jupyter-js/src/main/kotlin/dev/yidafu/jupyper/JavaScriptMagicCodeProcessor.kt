package dev.yidafu.jupyper

import org.jetbrains.kotlinx.jupyter.api.CodePreprocessor
import org.jetbrains.kotlinx.jupyter.api.KotlinKernelHost

class JavaScriptMagicCodeProcessor : CodePreprocessor {

    override fun accepts(code: String): Boolean {
        val len = code.length
        fun check(i: Int, char: Char): Boolean {
            return i < len && code[i] == char
        }
        fun isWhitespaceOrEnd(i: Int): Boolean {
            return if (i < len) {
                code[i] == ' ' || code[i] == '\n' || code[i] == '\t'
            } else {
                true
            }
//            return i + 1 >= len || code[i + 1] == ' '
        }
        for (i in 0..< len) {
            if (code[i] == '%' && check(i + 1, 'j')) {
                var index = i + 2
                if (check(index, 's')) {
                    return isWhitespaceOrEnd(index + 1)
                }
                if (check(index, 'a')) {
                    val isJavascriptMagic = listOf('v', 'a', 's', 'c', 'r', 'i', 'p', 't').all {
                        index += 1
                        check(index, it)
                    }
                    if (isJavascriptMagic) {
                        return isWhitespaceOrEnd(index + 1)
                    }
                }
                return false
            }
        }
        return false
    }

    /**
     * Performs code preprocessing
     */
    override fun process(code: String, host: KotlinKernelHost): CodePreprocessor.Result {
        val codeWithOutJs = if (code.contains("%js")) {
            println(code)
            code.replace("%js", "")
        } else {
            code
        }
        return CodePreprocessor.Result(codeWithOutJs, emptyList())
    }

    companion object {
        val JAVASCRIPT_MAGIC = arrayOf("%js", "%javascript")
    }
}
