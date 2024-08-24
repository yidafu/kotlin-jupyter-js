package dev.yidafu.jupyter

enum class LanguageType {
    JS,
    JSX,
    TS,
    TSX,
    Kotlin,
    ;

    companion object {
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
