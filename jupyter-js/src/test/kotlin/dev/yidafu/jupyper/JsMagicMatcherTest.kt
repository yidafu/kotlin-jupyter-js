package dev.yidafu.jupyper

import kotlin.test.*

class JsMagicMatcherTest {
    fun shouldTrue(code: String) {
        assertNotEquals(
            JsMagicMatcher().match(code),
            JsMagicMatcher.LanguageVersion.Other
        )
    }
    fun shouldFalse(code: String) {
        assertEquals(
            JsMagicMatcher().match(code),
            JsMagicMatcher.LanguageVersion.Other
        )
    }
    @Test
    fun `match js magic word`() {
        listOf(
//            "%js\nvar code = 1;",
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
}