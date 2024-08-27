package dev.yidafu.jupyter.processor

import dev.yidafu.jupyter.LanguageType
import io.kotest.core.spec.style.ShouldSpec
import io.kotest.matchers.string.shouldContain
import io.mockk.every
import io.mockk.mockkStatic
import java.io.File

class DefaultJavaScriptProcessorTest : ShouldSpec({

    should("recursive load local script") {
        val notebook = getMockNotebook()

        mockkStatic("kotlin.io.FilesKt__FileReadWriteKt")

        every { File("./local.js").readText() } returns
            """
                |import { bar } from './local-2.js';
                |console.log('local.js', bar);
                |const foo = "foo";
                |export { bar, foo };
            """.trimMargin()
        every { File("./local-2.js").readText() } returns
            """
            export const bar = "bar";
            """.trimIndent()
        val processor = DefaultJavaScriptProcessor(notebook)

        val result =
            processor.process(
                LanguageType.JS,
                """
                import { bar } from './local.js';
                console.log('main.js', bar);
                """.trimIndent(),
            )
        result.shouldContain("const global_Li9sb2NhbC5qcw = (function")
        result.shouldContain("const global_Li9sb2NhbC0yLmpz = (function")
        result.shouldContain("const inline_Li9sb2NhbC5qcw = global_Li9sb2NhbC5qcw;")
    }
})
