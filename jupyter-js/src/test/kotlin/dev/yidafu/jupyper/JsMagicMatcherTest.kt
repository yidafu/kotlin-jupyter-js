package dev.yidafu.jupyper

import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.shouldBe
import io.kotest.matchers.string.shouldNotContain

class JsMagicMatcherTest : FunSpec({

//    describe("not match any js magic") {
    listOf(
        " var code = 1;",
        "%javascrip",
        "%jp",
        "%jsxx",
        "%%js",
        "abc%js",
        """ val foo ="string"; """,
        """
        USE {
            addCodePreprocessor(dev.yidafu.jupyter.JavaScriptMagicCodeProcessor(this.notebook));
        }
        """.trimIndent(),
    ).forEach {
        test("$it should return kotlin language type") {
            JsMagicMatcher(it).match() shouldBe LanguageType.Kotlin
        }
    }
    listOf(
        "%js\nvar code = 1;" to LanguageType.JS,
        " %javascript\n var code = 1;" to LanguageType.JS,
        "%jsx\nconst div = <Div></Div>" to LanguageType.JSX,
        "%ts\nvar code = 1;" to LanguageType.TS,
        " %typescript\n var code = 1;" to LanguageType.TS,
        " %tsx\nconst div = <Div></Div>" to LanguageType.TSX,
    ).forEach {
        test("\"${it.first}\" should match ${it.second}")
        val matcher = JsMagicMatcher(it.first)
        matcher.match() shouldBe it.second

        val str =
            listOf("%jsx", "%javascript", "%js", "%tsx", "%typescript", "%ts").fold(it.first) { s, k ->
                s.replace(k, "")
            }

        str shouldNotContain "%"
        matcher.cleanSourceCode.trim() shouldBe str.trim()
    }
//    }
})
