package dev.yidafu.jupyter

import io.kotest.core.spec.style.ShouldSpec
import io.kotest.matchers.nulls.shouldNotBeNull
import io.kotest.matchers.shouldBe
import io.kotest.matchers.shouldNotBe
import io.kotest.matchers.string.shouldContain
import io.kotest.matchers.string.shouldMatch
import io.kotest.matchers.string.shouldNotBeEmpty
import io.kotest.matchers.string.shouldNotContain
import io.kotest.matchers.types.shouldBeInstanceOf
import io.mockk.mockkClass
import kotlinx.serialization.encodeToString
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.jsonObject
import kotlinx.serialization.json.jsonPrimitive
import org.jetbrains.kotlinx.jupyter.api.DisplayResult
import org.jetbrains.kotlinx.jupyter.api.MimeTypes
import org.jetbrains.kotlinx.jupyter.api.Notebook
import java.util.UUID

/**
 * Extract HTML content from DisplayResult
 * Helper function to get unescaped HTML from the JSON structure
 */
fun extractHtml(result: DisplayResult): String {
    val json = result.toJson(buildJsonObject {})
    val data = json["data"]?.jsonObject
    val html = data?.get(MimeTypes.HTML)?.jsonPrimitive?.content
    return html ?: ""
}

class JsCodeResultTest :
    ShouldSpec({
        val testJsCode = "console.log('Hello, World!')"
        val jsCodeResult = JsCodeResult(testJsCode)
        val notebook = mockkClass(Notebook::class)

        context("UUID generation") {
            should("generate a non-empty UUID") {
                jsCodeResult.uuid.shouldNotBeNull()
                jsCodeResult.uuid.shouldNotBeEmpty()
            }

            should("generate valid UUID format") {
                // UUID format: 8-4-4-4-12 hexadecimal characters
                jsCodeResult.uuid.shouldMatch(
                    Regex("^[0-9a-f]{8}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{12}$"),
                )
            }

            should("generate unique UUIDs for different instances") {
                val result1 = JsCodeResult("code1")
                val result2 = JsCodeResult("code2")
                result1.uuid shouldNotBe result2.uuid
            }

            should("generate same UUID on multiple accesses") {
                val result = JsCodeResult("test")
                val uuid1 = result.uuid
                val uuid2 = result.uuid
                uuid1 shouldBe uuid2
            }

            should("parse UUID correctly") {
                // Verify UUID can be parsed back
                val uuid = UUID.fromString(jsCodeResult.uuid)
                uuid.toString() shouldBe jsCodeResult.uuid
            }
        }

        context("HTML structure rendering") {
            should("include JS code in the script module") {
                val result = jsCodeResult.render(notebook)
                val html = extractHtml(result)
                html shouldContain testJsCode
                html shouldContain jsCodeResult.uuid
            }

            should("include div container with correct id") {
                val result = jsCodeResult.render(notebook)
                val html = extractHtml(result)
                html shouldContain """<div id="${jsCodeResult.uuid}""""
                html shouldContain """style="width:100%;min-height:100px""""
            }

            should("include script module tag") {
                val result = jsCodeResult.render(notebook)
                val html = extractHtml(result)
                html shouldContain """<script type="module">"""
                html shouldContain "</script>"
            }

            should("include getContainer function definition") {
                val result = jsCodeResult.render(notebook)
                val html = extractHtml(result)
                html shouldContain "function getContainer"
                html shouldContain "document.getElementById"
            }

            should("getContainer function has correct default parameters") {
                val result = jsCodeResult.render(notebook)
                val html = extractHtml(result)
                html shouldContain """width = "100%""""
                html shouldContain """height = "100px""""
            }
        }

        context("render method") {
            should("return DisplayResult instance") {
                val result = jsCodeResult.render(notebook)
                result.shouldBeInstanceOf<DisplayResult>()
            }

            should("return HTML result with correct structure") {
                val result = jsCodeResult.render(notebook)
                val json = result.toJson(buildJsonObject {})
                val jsonString = Json.encodeToString(json)
                jsonString shouldContain "text/html"
                jsonString shouldContain testJsCode
            }
        }

        context("different JS code content") {
            should("handle empty JS code") {
                val emptyResult = JsCodeResult("")
                val result = emptyResult.render(notebook)
                val html = extractHtml(result)
                html shouldContain emptyResult.uuid
                html shouldContain "<script type=\"module\">"
                html shouldContain "</script>"
            }

            should("handle JS code with special characters") {
                val specialCode = """console.log("Hello 'World' \"Test\"");"""
                val result = JsCodeResult(specialCode)
                val html = extractHtml(result.render(notebook))
                html shouldContain specialCode
            }

            should("handle JS code with newlines") {
                val multilineCode =
                    """
                    const x = 1;
                    const y = 2;
                    console.log(x + y);
                    """.trimIndent()
                val result = JsCodeResult(multilineCode)
                val html = extractHtml(result.render(notebook))
                html shouldContain multilineCode
            }

            should("handle JS code with template literals") {
                val templateCode = """const msg = `Hello ${"World"}`;"""
                val result = JsCodeResult(templateCode)
                val html = extractHtml(result.render(notebook))
                html shouldContain templateCode
            }

            should("handle JS code with imports") {
                val importCode =
                    """
                    import { foo } from "@jupyter";
                    console.log(foo);
                    """.trimIndent()
                val result = JsCodeResult(importCode)
                val html = extractHtml(result.render(notebook))
                html shouldContain importCode
            }

            should("handle JS code with comments") {
                val commentCode =
                    """
                    // This is a comment
                    const x = 1; /* multi-line comment */
                    """.trimIndent()
                val result = JsCodeResult(commentCode)
                val html = extractHtml(result.render(notebook))
                html shouldContain commentCode
            }
        }

        context("multiple instances") {
            should("each instance has unique container") {
                val result1 = JsCodeResult("code1")
                val result2 = JsCodeResult("code2")
                val html1 = extractHtml(result1.render(notebook))
                val html2 = extractHtml(result2.render(notebook))

                html1 shouldContain result1.uuid
                html2 shouldContain result2.uuid
                html1 shouldNotContain result2.uuid
                html2 shouldNotContain result1.uuid
            }

            should("each instance renders its own code") {
                val code1 = "const a = 1;"
                val code2 = "const b = 2;"
                val result1 = JsCodeResult(code1)
                val result2 = JsCodeResult(code2)

                val html1 = extractHtml(result1.render(notebook))
                val html2 = extractHtml(result2.render(notebook))

                html1 shouldContain code1
                html1 shouldNotContain code2
                html2 shouldContain code2
                html2 shouldNotContain code1
            }
        }

        context("HTML structure validation") {
            should("container div has correct styling") {
                val result = jsCodeResult.render(notebook)
                val html = extractHtml(result)
                // Check for width and min-height styles
                html shouldContain "width:100%"
                html shouldContain "min-height:100px"
            }

            should("getContainer function sets style correctly") {
                val result = jsCodeResult.render(notebook)
                val html = extractHtml(result)
                html shouldContain "cellRoot.style ="
                // Check for template literal syntax in JavaScript (backtick template string)
                html shouldContain "width:"
                html shouldContain "height:"
                // The template string uses backticks and ${} syntax
                html shouldContain "`"
            }
        }
    })
