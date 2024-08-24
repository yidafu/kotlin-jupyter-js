package dev.yidafu.jupyter.processor

import dev.yidafu.swc.types.Module
import io.kotest.core.spec.style.ShouldSpec
import io.kotest.matchers.shouldBe
import io.mockk.every
import io.mockk.mockk
import io.mockk.verify
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.JsonPrimitive
import kotlinx.serialization.json.buildJsonObject
import org.jetbrains.kotlinx.jupyter.api.*

class MockRenderable : Renderable {
    override fun render(notebook: Notebook): DisplayResult =
        object : DisplayResult {
            override fun toJson(
                additionalMetadata: JsonObject,
                overrideId: String?,
            ): JsonObject {
                return buildJsonObject {
                    put(
                        "data",
                        buildJsonObject {
                            put(MimeTypes.PLAIN_TEXT, JsonPrimitive("string"))
                        },
                    )
                }
            }
        }
}

object MockScriptInstance {
    val foo: MimeTypedResult = HTML("<div></div>")
    val bar: String = "world"
    val renderable: Renderable = MockRenderable()

    val text = textResult("text")
    val png = mimeResult(MimeTypes.PNG to "base")
}

class JupyterImportProcessorTest : ShouldSpec({

    context("JupyterImportProcessor") {
        should("process and replace import statements with Kotlin variables") {
            val notebookMock: Notebook = getMockNotebook()

            val contextMock: JavascriptProcessContext = mockk(relaxed = true)

            val program = processTestScript("import { foo, bar as renamedBar, renderable, text } from \"@jupyter\" ")

            val processor = JupyterImportProcessor(notebookMock)
            processor.process(program, contextMock)

            verify(exactly = 1) { contextMock.addKotlinValue("foo" to "\"<div></div>\"") }
            verify(exactly = 1) { contextMock.addKotlinValue("renamedBar" to "\"world\"") }
            verify(exactly = 1) { contextMock.addKotlinValue("renderable" to "\"string\"") }
            verify(exactly = 1) { contextMock.addKotlinValue("text" to "\"text\"") }

            if (program is Module) {
                program.body?.size shouldBe 0
            }
        }

        should("process and replace import statements with Kotlin variables, but imported variable not exist") {
            val notebookMock: Notebook = mockk(relaxed = true)
            val contextMock: JavascriptProcessContext = mockk(relaxed = true)
            every { notebookMock.variablesState } returns mapOf()

            val program = processTestScript("import { foo } from \"@jupyter\" ")
            val processor = JupyterImportProcessor(notebookMock)
            processor.process(program, contextMock)

            verify(exactly = 1) { contextMock.addKotlinValue("foo" to "null") }
        }
    }
})
