package dev.yidafu.jupyter

/**
 * Checks if the character at the specified index in the source string matches the given character
 */
private inline fun check(
    source: String,
    i: Int,
    char: Char,
): Boolean = i < source.length && source[i] == char

/**
 * Checks if the character at the specified index in the source string is whitespace
 */
private inline fun isWhitespace(
    source: String,
    i: Int,
): Boolean =
    if (i < source.length) {
        source[i] == ' ' || source[i] == '\n' || source[i] == '\t'
    } else {
        false
    }

/**
 * JavaScript Magic command matcher
 *
 * Used to identify and parse Magic commands (e.g., %js, %ts, %jsx, %tsx) in code
 * Supports extracting Magic commands from code and obtaining clean source code
 *
 * @param source Source code containing Magic commands
 */
class JsMagicMatcher(
    private val source: String,
) {
    /**
     * Position interval for Magic command at the beginning of source code
     * Lazily computed to avoid repeated parsing
     * Returns null if no magic command found at the beginning
     */
    private val interval: IntRange? by lazy {
        jsMagicInterval(source)
    }

    /**
     * Clean source code after removing all Magic commands
     *
     * Example:
     * Input: `%js\nconsole.log("hello");`
     * Output: `console.log("hello");`
     */
    val cleanSourceCode: String by lazy {
        val magicInterval = interval ?: return@lazy source

        val indexList =
            listOf(0) +
                listOf(maxOf(0, magicInterval.first - 1), minOf(source.length, magicInterval.last + 1)) +
                listOf(source.length)

        val keepIntervalList =
            indexList
                .chunked(2)
                .filter { it.size == 2 && it[0] < it[1] && it[0] >= 0 && it[1] <= source.length }
                .map { it[0] until it[1] }
        sequence {
            keepIntervalList.forEach {
                it.forEach { i ->
                    if (i >= 0 && i < source.length) {
                        yield(source[i])
                    }
                }
            }
        }.joinToString("")
    }

    /**
     * Matches language type in code
     *
     * Only matches magic commands at the beginning of the code.
     *
     * @return Detected language type, returns Kotlin if no Magic commands found at the beginning
     */
    fun match(): LanguageType {
        val magicInterval = interval ?: return LanguageType.Kotlin
        // Ensure the interval is valid before slicing
        if (magicInterval.first < 0 || magicInterval.last >= source.length) {
            return LanguageType.Kotlin
        }
        return LanguageType.fromString(source.slice(magicInterval))
    }

    /**
     * Finds position interval of the first Magic command at the beginning of source code
     *
     * Only matches magic commands at the start of the code (after skipping leading whitespace).
     * Magic commands in the middle of code are ignored.
     * Returns immediately when the first magic command is found.
     *
     * Supported Magic commands:
     * - %js or %javascript
     * - %jsx
     * - %ts or %typescript
     * - %tsx
     *
     * @param source Source code
     * @return Position interval of the first Magic command, or null if not found
     */
    private fun jsMagicInterval(source: String): IntRange? {
        val len = source.length
        var index = 0

        // Skip leading whitespace
        while (isWhitespace(source, index)) {
            index += 1
        }

        // Only check for magic command at the beginning
        if (index >= len) {
            return null
        }

        if (source[index] == '%') {
            val start = index
            var tempIndex = index + 1

            if (check(source, tempIndex, 'j')) {
                tempIndex += 1
                if (check(source, tempIndex, 's')) {
                    tempIndex += 1
                    // tempIndex is now at position after 's'
                    if (check(source, tempIndex, 'x')) {
                        // %jsx
                        tempIndex += 1
                        if (isWhitespace(source, tempIndex) || tempIndex >= len) {
                            return start..<tempIndex
                        }
                    } else {
                        // %js
                        if (isWhitespace(source, tempIndex) || tempIndex >= len) {
                            return start..<tempIndex
                        }
                    }
                } else if (check(source, tempIndex, 'a')) {
                    // %javascript
                    tempIndex += 1
                    var isValid = true
                    var checkIndex = tempIndex
                    for (char in listOf('v', 'a', 's', 'c', 'r', 'i', 'p', 't')) {
                        if (!check(source, checkIndex, char)) {
                            isValid = false
                            break
                        }
                        checkIndex += 1
                    }
                    if (isValid && (isWhitespace(source, checkIndex) || checkIndex >= len)) {
                        return start..<checkIndex
                    }
                }
            } else if (check(source, tempIndex, 't')) {
                tempIndex += 1
                if (check(source, tempIndex, 's')) {
                    tempIndex += 1
                    // tempIndex is now at position after 's'
                    if (check(source, tempIndex, 'x')) {
                        // %tsx
                        tempIndex += 1
                        if (isWhitespace(source, tempIndex) || tempIndex >= len) {
                            return start..<tempIndex
                        }
                    } else {
                        // %ts
                        if (isWhitespace(source, tempIndex) || tempIndex >= len) {
                            return start..<tempIndex
                        }
                    }
                } else if (check(source, tempIndex, 'y')) {
                    // %typescript
                    tempIndex += 1
                    var isValid = true
                    var checkIndex = tempIndex
                    for (char in listOf('p', 'e', 's', 'c', 'r', 'i', 'p', 't')) {
                        if (!check(source, checkIndex, char)) {
                            isValid = false
                            break
                        }
                        checkIndex += 1
                    }
                    if (isValid && (isWhitespace(source, checkIndex) || checkIndex >= len)) {
                        return start..<checkIndex
                    }
                }
            }
        }

        return null
    }
}
