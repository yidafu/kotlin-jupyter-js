package dev.yidafu.jupyper

class JsMagicMatcher(private val source: String) {

    private val intervals by lazy {
        jsMagicIntervals(source)
    }

    /**
     * code without js magics
     */
    val cleanSourceCode: String by lazy {
            val indexList = listOf(0) +
                    intervals.map { listOf(maxOf(0, it.first - 1), minOf(source.length, it.last + 1)) }.flatten().toMutableList() +
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
             return LanguageType.formString(source.slice(it))
        }
        return LanguageType.Kotlin
    }

    private fun jsMagicIntervals(source: String): List<IntRange> {
        val len = source.length
        fun check(i: Int, char: Char): Boolean {
            return i < len && source[i] == char
        }

        fun isWhitespace(i: Int): Boolean {
            return if (i < len) {
                source[i] == ' ' || source[i] == '\n' || source[i] == '\t'
            } else {
                false
            }
        }

        val intervals = mutableListOf<IntRange>()
        var index = 0
        fun eof(): Boolean {
            return index >= len
        }
        while (index < source.length) {
            while (isWhitespace(index)) {
                index += 1
            }
            if (eof()) {
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
                            if (isWhitespace(index)) {
                                intervals.add(start ..< index)
                            }
                        } else if (isWhitespace(index)) {
                            intervals.add(start..< index)
                        }
                    } else if (check(index, 'a')) {
                        val isJavascriptMagic = listOf('v', 'a', 's', 'c', 'r', 'i', 'p', 't').all {
                            index += 1
                            check(index, it)
                        }
                        if (isJavascriptMagic) {
                            if (isWhitespace(index + 1)) {
                                intervals.add(start..index)
                            }
                        }
                    }
                } else if (check(index, 't')) {
                    index += 1
                    if (check(index, 's')) {
                        index += 1
                        if (check(index, 'x')) {
                            index += 1
                            if (isWhitespace(index)) {
                                intervals.add(start..< index)
                            }
                        } else if (isWhitespace(index)) {
                            intervals.add(start..< index)
                        }
                    } else if (check(index, 'y')) {
                        val isTypescriptMagic = listOf('p', 'e', 's', 'c', 'r', 'i', 'p', 't').all {
                            index += 1
                            check(index, it)
                        }
                        if (isTypescriptMagic) {
                            if (isWhitespace(index + 1)) {
                                intervals.add(start..index)
                            }
                        }
                    }
                }
            }
            index += 1
            while (!(isWhitespace(index) || eof())) {
                index += 1
            }
        }

        return intervals
    }
}
