package dev.yidafu.jupyper

import kotlin.test.*

class JsMagicMatcherTest {
    fun shouldTrue(code: String) {
        assertNotEquals(
            JsMagicMatcher(code).match(),
            JsMagicMatcher.LanguageType.Kotlin,
        )
    }
    fun shouldFalse(code: String) {
        assertEquals(
            JsMagicMatcher(code).match(),
            JsMagicMatcher.LanguageType.Kotlin,
        )
    }

    @Test
    fun `match js magic word`() {
        assertEquals(JsMagicMatcher.LanguageType.formString("%js"), JsMagicMatcher.LanguageType.JS)

        listOf(
            "%js\nvar code = 1;",
            " %javascript\n var code = 1;",
            "%jsx\nconst div = <Div></Div>",
        ).forEach {
            shouldTrue(it)
        }

        listOf(
            " var code = 1;",
            "%javascrip",
            "%jp",
            "%jsxx",
            "%%js",
            "abc%js",
        ).forEach {
            shouldFalse(it)
        }
    }

    @Test
    fun `match ts magic word`() {
        listOf(
            "%ts\nvar code = 1;",
            " %typescript\n var code = 1;",
            " %tsx\nconst div = <Div></Div>",
        ).forEach {
            shouldTrue(it)
        }

        listOf(
            " var code = 1;",
            "%typescrip",
            "%txp",
            "%tsxx",
            "%%ts",
            "abc%ts",
        ).forEach {
            shouldFalse(it)
        }
    }

    @Test
    fun `remove js magic of source code`() {
        listOf(
            "%js\nconst foo = 1",
            "%jsx\nconst div = <Div></Div>",
            "%javascript\nconst foo = 1",
            "%ts\nconst n: number = 1",
            "%typescript\nconst n: number = 1",
            "%tsx\nconst div = <TDiv></TDiv>",
        ).forEach {
            val str = listOf("%jsx", "%javascript", "%js", "%tsx", "%typescript", "%ts").fold(it) { s, k ->
                s.replace(k, "")
            }
            assertEquals(JsMagicMatcher(it).cleanSourceCode, str)
        }
    }

    @Test
    fun `should return Kotlin`() {
        val matcher = JsMagicMatcher(
            """ val foo ="string"; """,
        )
        val type = matcher.match()
        assertEquals(type, JsMagicMatcher.LanguageType.Kotlin)
        assertEquals(matcher.cleanSourceCode, """ val foo ="string"; """)
    }

    @Test
    fun `kotlin USE statement should be Kotlin`() {
        val matcher = JsMagicMatcher(
            """
            USE {
                addCodePreprocessor(dev.yidafu.jupyper.JavaScriptMagicCodeProcessor(this.notebook));
            }
            """.trimIndent(),
        )

        val type = matcher.match()
        assertEquals(type, JsMagicMatcher.LanguageType.Kotlin)
    }
}
