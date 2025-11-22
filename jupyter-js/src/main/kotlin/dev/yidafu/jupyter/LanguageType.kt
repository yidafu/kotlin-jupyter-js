package dev.yidafu.jupyter

/**
 * Language type enumeration
 *
 * Represents language types supported in Jupyter Notebook
 */
enum class LanguageType {
    /** JavaScript code */
    JS,

    /** JSX code (React) */
    JSX,

    /** TypeScript code */
    TS,

    /** TSX code (TypeScript + React) */
    TSX,

    /** Kotlin code (default) */
    Kotlin,
    ;

    companion object {
        /**
         * Parses language type from Magic command string
         *
         * @param magic Magic command string (e.g., "%js", "%javascript", "%jsx", etc.)
         * @return Corresponding language type, returns Kotlin if unrecognized
         */
        fun fromString(magic: String): LanguageType =
            when (magic) {
                "%js", "%javascript" -> JS
                "%jsx" -> JSX
                "%ts", "%typescript" -> TS
                "%tsx" -> TSX
                else -> Kotlin // unreachable
            }
    }
}
