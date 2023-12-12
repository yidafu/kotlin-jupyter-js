package dev.yidafu.jupyper

class JsMagicMatcher {
    enum class LanguageVersion {
        JS,
        JSX,
        TS,
        TSX,
        Other
    }

    fun match(code: String): LanguageVersion {
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
        }
        var index = 0
        while (index < code.length) {
            while (isWhitespaceOrEnd(index)) {
                index  += 1
            }
            if (index >= code.length) {
                return LanguageVersion.Other
            }
            if (code[index] == '%') {
                index += 1
                if (check(index, 'j')) {
                    index += 1
                    if (check(index, 's')) {
                        index += 1
                        if (check(index, 'x')) {
                            index += 1
                            if (isWhitespaceOrEnd(index)) {
                                return LanguageVersion.JSX
                            }
                        }
                        if (isWhitespaceOrEnd(index)) {
                            return LanguageVersion.JS
                        }
                    } else if (check(index, 'a')) {
                        val isJavascriptMagic = listOf('v', 'a', 's', 'c', 'r', 'i', 'p', 't').all {
                            index += 1
                            check(index, it)
                        }
                        if (isJavascriptMagic) {
                            if (isWhitespaceOrEnd(index + 1)) {
                                return LanguageVersion.JS
                            }
                        }
                    }
                } else   if (check(index, 't')) {
                    index += 1
                    if (check(index, 's')) {
                        index += 1
                        if (check(index, 'x')) {
                            index += 1

                            if (isWhitespaceOrEnd(index)) {
                                return LanguageVersion.TSX
                            }
                        }
                        if (isWhitespaceOrEnd(index)) {
                            return LanguageVersion.TS
                        }
                    } else if (check(index, 'y')) {
                        val isJavascriptMagic = listOf('p', 'e', 's', 'c', 'r', 'i', 'p', 't').all {
                            index += 1
                            check(index, it)
                        }
                        if (isJavascriptMagic) {
                            if (isWhitespaceOrEnd(index + 1)) {
                                return LanguageVersion.TS
                            }
                        }
                    }
                }

            }
            index += 1
            while (!isWhitespaceOrEnd(index)) {
                index  += 1
            }
        }

        return LanguageVersion.Other
    }
}