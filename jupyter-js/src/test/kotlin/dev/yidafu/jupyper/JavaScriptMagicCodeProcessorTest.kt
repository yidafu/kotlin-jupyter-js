package dev.yidafu.jupyper

import io.kotest.core.spec.style.FunSpec
import io.mockk.mockkClass
import org.jetbrains.kotlinx.jupyter.api.Notebook
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class JavaScriptMagicCodeProcessorTest : FunSpec({
    test("if code contains %js") {
        val notebook = mockkClass(Notebook::class)

        fun shouldTrue(code: String) {
            assertTrue(
                JavaScriptMagicCodeProcessor(notebook).accepts(code),
            )
        }

        fun shouldFalse(code: String) {
            assertFalse(
                JavaScriptMagicCodeProcessor(notebook).accepts(code),
            )
        }
        shouldTrue(
            """
            %js
            var code = 1;
            """.trimIndent(),
        )
        shouldTrue(
            """
            %javascript
            var code = 1;
            """.trimIndent(),
        )
        shouldFalse(
            """
            var code = 1;
            """.trimIndent(),
        )
        shouldFalse("%javascrip")
        shouldFalse("%jp")
        shouldFalse("%jsx")
    }
})
