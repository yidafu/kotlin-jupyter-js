package dev.yidafu.jupyper

class JsMagicMatcher(private val source: String) {
    enum class LanguageType {
        JS,
        JSX,
        TS,
        TSX,
        Kotlin;

        companion object {
            fun formString(magic: String): LanguageType = when (magic) {
                "%js", "%javascript" -> JS
                "%jsx" -> JSX
                "%ts", "%typescript" -> TS
                "%tsx" -> TSX
                else -> Kotlin // unreachable
            }
        }
    }
    private val intervals by lazy {
        jsMagicIntervals(source)
    }

    val sourceWithoutJsMagic: String by lazy {
            val indexList = listOf(0) +
                    intervals.map { listOf(it.first, it.last + 1) }.flatten().toMutableList() +
                    listOf(source.length - 1)

            val keepIntervalList = indexList.chunked(2)
                .filter { it[0] != it[1] }
                .map { it[0]..it[1] }
            sequence {
                keepIntervalList.forEach {
                    it.forEach { i ->
                        yield(source[i])
                    }
                }
            }.joinToString("")
    }

    fun match(): LanguageType {
        if (intervals.isEmpty()) return LanguageType.Kotlin
        // last js magic will work
        intervals.last {
            println("[${source.slice(it)}]")
             return LanguageType.formString(source.slice(it))
        }
        return LanguageType.Kotlin
    }

    private fun jsMagicIntervals(source: String): List<IntRange> {
        val len = source.length
        fun check(i: Int, char: Char): Boolean {
            return i < len && source[i] == char
        }

        fun isWhitespaceOrEnd(i: Int): Boolean {
            return if (i < len) {
                source[i] == ' ' || source[i] == '\n' || source[i] == '\t'
            } else {
                true
            }
        }
        val intervals = mutableListOf<IntRange>()
        var index = 0
        while (index < source.length) {
            while (isWhitespaceOrEnd(index)) {
                index  += 1
            }
            if (index >= source.length) {
               break
            }
            if (source[index] == '%') {
                val start = index
                index += 1
                if (check(index, 'j')) {
                    index += 1
                    if (check(index, 's')) {
                        index += 1
                        if (check(index, 'x')) {
                            index += 1
                            if (isWhitespaceOrEnd(index)) {
                                intervals.add(start ..< index)
                            }
                        } else if (isWhitespaceOrEnd(index)) {
                            intervals.add(start..< index)
                        }
                    } else if (check(index, 'a')) {
                        val isJavascriptMagic = listOf('v', 'a', 's', 'c', 'r', 'i', 'p', 't').all {
                            index += 1
                            check(index, it)
                        }
                        if (isJavascriptMagic) {
                            if (isWhitespaceOrEnd(index + 1)) {
                                intervals.add(start .. index)
                            }
                        }
                    }
                } else if (check(index, 't')) {
                    index += 1
                    if (check(index, 's')) {
                        index += 1
                        if (check(index, 'x')) {
                            index += 1
                            if (isWhitespaceOrEnd(index)) {
                                intervals.add(start..< index)
                            }
                        } else if (isWhitespaceOrEnd(index)) {
                            intervals.add(start..< index)
                        }
                    } else if (check(index, 'y')) {
                        val isJavascriptMagic = listOf('p', 'e', 's', 'c', 'r', 'i', 'p', 't').all {
                            index += 1
                            check(index, it)
                        }
                        if (isJavascriptMagic) {
                            if (isWhitespaceOrEnd(index + 1)) {
                                intervals.add(start .. index)
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

        return intervals
    }
}