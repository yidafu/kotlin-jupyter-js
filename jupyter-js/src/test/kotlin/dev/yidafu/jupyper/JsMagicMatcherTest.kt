package dev.yidafu.jupyper

import io.kotest.core.spec.style.FunSpec
import kotlin.test.*

class JsMagicMatcherTest : FunSpec( {
     fun shouldTrue(code: String) {
        assertNotEquals(
            JsMagicMatcher(code).match(),
            LanguageType.Kotlin
        )
    }
     fun shouldFalse(code: String) {
        assertEquals(
            JsMagicMatcher(code).match(),
            LanguageType.Kotlin
        )
    }

    test("match js magic word") {
        assertEquals(LanguageType.formString("%js"), LanguageType.JS)

        listOf(
            "%js\nvar code = 1;",
            " %javascript\n var code = 1;",
            "%jsx\nconst div = <Div></Div>"
        ).forEach {
            shouldTrue(it)
        }

        listOf(
            " var code = 1;",
            "%javascrip",
            "%jp",
            "%jsxx",
            "%%js",
            "abc%js"
        ).forEach {
            shouldFalse(it)
        }
    }

    test("match ts magic word") {
        listOf(
            "%ts\nvar code = 1;",
            " %typescript\n var code = 1;",
            " %tsx\nconst div = <Div></Div>"
        ).forEach {
            shouldTrue(it)
        }

        listOf(
            " var code = 1;",
            "%typescrip",
            "%txp",
            "%tsxx",
            "%%ts",
            "abc%ts"
        ).forEach {
            shouldFalse(it)
        }
    }

    test("remove js magic of source code") {
        listOf(
            "%js\nconst foo = 1",
            "%jsx\nconst div = <Div></Div>",
            "%javascript\nconst foo = 1",
            "%ts\nconst n: number = 1",
            "%typescript\nconst n: number = 1",
            "%tsx\nconst div = <TDiv></TDiv>"
        ).forEach {
            val str = listOf("%jsx", "%javascript", "%js", "%tsx", "%typescript", "%ts").fold(it) { s, k ->
                s.replace(k, "")
            }
            val matcher = JsMagicMatcher(it)

            assertTrue(!matcher.cleanSourceCode.contains("%"))
            assertEquals(matcher.cleanSourceCode, str)
        }
    }

    test("should return Kotlin") {
        val matcher = JsMagicMatcher(
            """ val foo ="string"; """
        )
        val type = matcher.match()
        assertEquals(type, LanguageType.Kotlin)
        assertEquals(matcher.cleanSourceCode, """ val foo ="string"; """)

    }

    test("kotlin USE statement should be Kotlin") {
        val matcher = JsMagicMatcher(
            """
            USE {
                addCodePreprocessor(dev.yidafu.jupyper.JavaScriptMagicCodeProcessor(this.notebook));
            }
            """.trimIndent()
        )

        val type = matcher.match()
        assertEquals(type, LanguageType.Kotlin)
    }

    test("get clean code") {

        val matcher = JsMagicMatcher(
            """
            %js

            import * as d3 from "d3";
            """.trimIndent()
        )

        assertEquals(matcher.match(), LanguageType.JS)
        assertTrue(!matcher.cleanSourceCode.contains("%"))
    }
})
