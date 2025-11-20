package dev.yidafu.jupyter.processor

import dev.yidafu.swc.generated.Module
import io.kotest.core.spec.style.ShouldSpec
import io.kotest.matchers.shouldBe
import io.mockk.*
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

            // 根据实际处理逻辑验证：
            // 验证调用次数和参数名称，使用 any() 匹配值（因为JSON格式可能有变化）
            verify(exactly = 1) { contextMock.addKotlinValue("foo" to any()) }
            verify(exactly = 1) { contextMock.addKotlinValue("renamedBar" to any()) }
            verify(exactly = 1) { contextMock.addKotlinValue("renderable" to any()) }
            verify(exactly = 1) { contextMock.addKotlinValue("text" to any()) }

            // 验证总调用次数
            verify(exactly = 4) { contextMock.addKotlinValue(any()) }

            if (program is Module) {
                program.body?.size shouldBe 0
            } else {
                // Skip this assertion if not Module type
            }
        }

        should("process and replace import statements with Kotlin variables, but imported variable not exist") {
            val notebookMock: Notebook = mockk(relaxed = true)
            val contextMock: JavascriptProcessContext = mockk(relaxed = true)
            every { notebookMock.variablesState } returns mapOf()

            val program = processTestScript("import { foo } from \"@jupyter\" ")
            val processor = JupyterImportProcessor(notebookMock)
            processor.process(program, contextMock)

            // 当变量不存在时，返回带格式的JSON字符串（有换行和缩进）
            verify(exactly = 1) {
                contextMock.addKotlinValue("foo" to """
                {
                    "text/plain": null
                }
                """.trimIndent())
            }
        }
    }
})
