package dev.yidafu.jupyter.processor

import dev.yidafu.jupyter.JavaScriptVariableStore
import dev.yidafu.swc.generated.Module
import io.kotest.core.spec.style.ShouldSpec
import io.kotest.matchers.shouldBe
import io.kotest.matchers.string.shouldContain
import io.mockk.*
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.JsonPrimitive
import kotlinx.serialization.json.buildJsonObject
import org.jetbrains.kotlinx.jupyter.api.*

/**
 * Mock Renderable implementation
 * Used for testing Renderable interface handling
 */
class MockRenderable : Renderable {
    override fun render(notebook: Notebook): DisplayResult =
        object : DisplayResult {
            override fun toJson(
                additionalMetadata: JsonObject,
                overrideId: String?,
            ): JsonObject =
                buildJsonObject {
                    put(
                        "data",
                        buildJsonObject {
                            put(MimeTypes.PLAIN_TEXT, JsonPrimitive("string"))
                        },
                    )
                }
        }
}

/**
 * Mock DisplayResult implementation that returns JSON MIME type
 * Used for testing JSON MIME type handling
 */
class MockDisplayResultWithJson : DisplayResult {
    override fun toJson(
        additionalMetadata: JsonObject,
        overrideId: String?,
    ): JsonObject =
        buildJsonObject {
            put(
                "data",
                buildJsonObject {
                    put(
                        MimeTypes.JSON,
                        buildJsonObject {
                            put("name", JsonPrimitive("test"))
                            put("value", JsonPrimitive(42))
                        },
                    )
                },
            )
        }
}

/**
 * Mock script instance object
 * Contains various types of test variables to simulate variable state in Jupyter Notebook
 */
object MockScriptInstance {
    /** HTML MIME type variable */
    val foo: MimeTypedResult = HTML("<div></div>")

    /** String type variable */
    val bar: String = "world"

    /** Renderable interface implementation */
    val renderable: Renderable = MockRenderable()

    /** Plain text result */
    val text = textResult("text")

    /** PNG image type variable, using base64 encoding of 1x1 transparent PNG image */
    val png =
        mimeResult(MimeTypes.PNG to "iVBORw0KGgoAAAANSUhEUgAAAAEAAAABCAYAAAAfFcSJAAAADUlEQVR42mNk+M9QDwADhgGAWjR9awAAAABJRU5ErkJggg==")

    /** JSON MIME type variable */
    val jsonResult: DisplayResult = MockDisplayResultWithJson()

    // ========== Basic Types ==========

    /** Integer type variable */
    val numberInt: Int = 42

    /** Double type variable */
    val numberDouble: Double = 3.14

    /** Boolean type variable */
    val booleanValue: Boolean = true

    // ========== Collection Types ==========

    /** List type variable */
    val listValue: List<String> = listOf("a", "b", "c")

    /** Map type variable */
    val mapValue: Map<String, Any> = mapOf("key1" to "value1", "key2" to 123)
}

/**
 * JupyterImportProcessor test class
 * Tests various functionalities of the @jupyter virtual package import processor
 */
class JupyterImportProcessorTest :
    ShouldSpec({

        context("JupyterImportProcessor") {
            /**
             * Test processing and replacing import statements with Kotlin variables
             * Verifies handling of HTML, String, Renderable, and text types
             */
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

            /**
             * Test handling non-existent variables
             * When imported variable does not exist, should return null
             */
            should("process and replace import statements with Kotlin variables, but imported variable not exist") {
                val notebookMock: Notebook = mockk(relaxed = true)
                val contextMock: JavascriptProcessContext = mockk(relaxed = true)
                every { notebookMock.variablesState } returns mapOf()

                val program = processTestScript("import { foo } from \"@jupyter\" ")
                val processor = JupyterImportProcessor(notebookMock)
                processor.process(program, contextMock)

                verify(exactly = 1) { contextMock.addKotlinValue("foo" to "null") }
            }

            /**
             * Test processing PNG MIME type
             * Verifies that PNG image base64 encoding is correctly passed
             */
            should("process PNG MIME type") {
                val notebookMock: Notebook = getMockNotebook()
                val contextMock: JavascriptProcessContext = mockk(relaxed = true)

                val program = processTestScript("import { png } from \"@jupyter\" ")
                val processor = JupyterImportProcessor(notebookMock)
                processor.process(program, contextMock)

                verify(exactly = 1) {
                    contextMock.addKotlinValue(
                        "png" to "\"iVBORw0KGgoAAAANSUhEUgAAAAEAAAABCAYAAAAfFcSJAAAADUlEQVR42mNk+M9QDwADhgGAWjR9awAAAABJRU5ErkJggg==\"",
                    )
                }
            }

            /**
             * Test processing JSON MIME type
             * Verifies JSON object serialization and passing
             */
            should("process JSON MIME type") {
                val notebookMock: Notebook = getMockNotebook()
                val contextMock: JavascriptProcessContext = mockk(relaxed = true)

                val program = processTestScript("import { jsonResult } from \"@jupyter\" ")
                val processor = JupyterImportProcessor(notebookMock)
                processor.process(program, contextMock)

                val slot = slot<Pair<String, String>>()
                verify(exactly = 1) { contextMock.addKotlinValue(capture(slot)) }
                val (_, value) = slot.captured
                value shouldContain "\"name\":\"test\""
                value shouldContain "\"value\":42"
            }

            /**
             * Test processing basic number type (Int)
             * Verifies integer serialization and passing
             */
            should("process basic number types (Int)") {
                val notebookMock: Notebook = getMockNotebook()
                val contextMock: JavascriptProcessContext = mockk(relaxed = true)

                val program = processTestScript("import { numberInt } from \"@jupyter\" ")
                val processor = JupyterImportProcessor(notebookMock)
                processor.process(program, contextMock)

                verify(exactly = 1) { contextMock.addKotlinValue("numberInt" to "42") }
            }

            /**
             * Test processing basic number type (Double)
             * Verifies floating-point number serialization and passing
             */
            should("process basic number types (Double)") {
                val notebookMock: Notebook = getMockNotebook()
                val contextMock: JavascriptProcessContext = mockk(relaxed = true)

                val program = processTestScript("import { numberDouble } from \"@jupyter\" ")
                val processor = JupyterImportProcessor(notebookMock)
                processor.process(program, contextMock)

                verify(exactly = 1) { contextMock.addKotlinValue("numberDouble" to "3.14") }
            }

            /**
             * Test processing boolean type
             * Verifies boolean value serialization and passing
             */
            should("process boolean type") {
                val notebookMock: Notebook = getMockNotebook()
                val contextMock: JavascriptProcessContext = mockk(relaxed = true)

                val program = processTestScript("import { booleanValue } from \"@jupyter\" ")
                val processor = JupyterImportProcessor(notebookMock)
                processor.process(program, contextMock)

                verify(exactly = 1) { contextMock.addKotlinValue("booleanValue" to "true") }
            }

            /**
             * Test processing List type
             * Verifies list serialization and passing
             */
            should("process List type") {
                val notebookMock: Notebook = getMockNotebook()
                val contextMock: JavascriptProcessContext = mockk(relaxed = true)

                val program = processTestScript("import { listValue } from \"@jupyter\" ")
                val processor = JupyterImportProcessor(notebookMock)
                processor.process(program, contextMock)

                val slot = slot<Pair<String, String>>()
                verify(exactly = 1) { contextMock.addKotlinValue(capture(slot)) }
                val (_, value) = slot.captured
                value shouldContain "\"a\""
                value shouldContain "\"b\""
                value shouldContain "\"c\""
            }

            /**
             * Test processing Map type
             * Verifies Map serialization and passing
             */
            should("process Map type") {
                val notebookMock: Notebook = getMockNotebook()
                val contextMock: JavascriptProcessContext = mockk(relaxed = true)

                val program = processTestScript("import { mapValue } from \"@jupyter\" ")
                val processor = JupyterImportProcessor(notebookMock)
                processor.process(program, contextMock)

                val slot = slot<Pair<String, String>>()
                verify(exactly = 1) { contextMock.addKotlinValue(capture(slot)) }
                val (_, value) = slot.captured
                value shouldContain "\"key1\":\"value1\""
                value shouldContain "\"key2\":123"
            }

            /**
             * Test jsExport priority
             * Verifies that jsExport values take precedence over notebook variable state values
             */
            should("prioritize jsExport over notebook variables") {
                val notebookMock: Notebook = getMockNotebook()
                val contextMock: JavascriptProcessContext = mockk(relaxed = true)

                // Set jsExport value
                JavaScriptVariableStore["bar"] = "\"exported_value\""

                val program = processTestScript("import { bar } from \"@jupyter\" ")
                val processor = JupyterImportProcessor(notebookMock)
                processor.process(program, contextMock)

                // Should use jsExport value, not the value from notebook
                verify(exactly = 1) { contextMock.addKotlinValue("bar" to "\"exported_value\"") }

                // Cleanup
                JavaScriptVariableStore.clear()
            }

            /**
             * Test handling multiple imports in one statement
             * Verifies that multiple variables of different types can be imported simultaneously
             */
            should("handle multiple imports in one statement") {
                val notebookMock: Notebook = getMockNotebook()
                val contextMock: JavascriptProcessContext = mockk(relaxed = true)

                val program = processTestScript("import { foo, bar, text, numberInt, booleanValue } from \"@jupyter\" ")
                val processor = JupyterImportProcessor(notebookMock)
                processor.process(program, contextMock)

                verify(exactly = 1) { contextMock.addKotlinValue("foo" to "\"<div></div>\"") }
                verify(exactly = 1) { contextMock.addKotlinValue("bar" to "\"world\"") }
                verify(exactly = 1) { contextMock.addKotlinValue("text" to "\"text\"") }
                verify(exactly = 1) { contextMock.addKotlinValue("numberInt" to "42") }
                verify(exactly = 1) { contextMock.addKotlinValue("booleanValue" to "true") }

                if (program is Module) {
                    program.body?.size shouldBe 0
                }
            }
        }
    })
