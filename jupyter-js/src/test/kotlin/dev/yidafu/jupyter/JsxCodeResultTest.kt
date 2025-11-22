package dev.yidafu.jupyter

import dev.yidafu.jupyter.libmapping.LibsMapping
import io.kotest.core.spec.style.ShouldSpec
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
import org.jetbrains.kotlinx.jupyter.api.DisplayResult
import org.jetbrains.kotlinx.jupyter.api.Notebook
import java.util.UUID

class JsxCodeResultTest :
    ShouldSpec({
        val testJsxCode =
            """
            const ${JSX_DEFAULT_EXPORT_VARIABLE_NAME} = () => {
                return React.createElement('div', null, 'Hello, World!');
            };
            """.trimIndent()
        val jsxCodeResult = JsxCodeResult(testJsxCode)
        val notebook = mockkClass(Notebook::class)

        context("UUID generation") {
            should("generate a valid UUID in HTML") {
                val result = jsxCodeResult.render(notebook)
                val html = extractHtml(result)
                // Extract UUID from HTML
                val uuidPattern = Regex("""id="([0-9a-f]{8}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{12})"""")
                val match = uuidPattern.find(html)
                match.shouldNotBe(null)
                val uuid = match!!.groupValues[1]
                uuid.shouldNotBeEmpty()
                // Verify UUID format
                uuid.shouldMatch(
                    Regex("^[0-9a-f]{8}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{12}$"),
                )
                // Verify UUID can be parsed
                UUID.fromString(uuid).toString() shouldBe uuid
            }

            should("generate unique UUIDs for different instances") {
                val result1 = JsxCodeResult("const ${JSX_DEFAULT_EXPORT_VARIABLE_NAME} = () => null;")
                val result2 = JsxCodeResult("const ${JSX_DEFAULT_EXPORT_VARIABLE_NAME} = () => null;")
                val html1 = extractHtml(result1.render(notebook))
                val html2 = extractHtml(result2.render(notebook))

                val uuidPattern = Regex("""id="([0-9a-f]{8}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{12})"""")
                val uuid1 = uuidPattern.find(html1)!!.groupValues[1]
                val uuid2 = uuidPattern.find(html2)!!.groupValues[1]

                uuid1 shouldNotBe uuid2
            }
        }

        context("HTML structure rendering") {
            should("include JSX code in the script module") {
                val result = jsxCodeResult.render(notebook)
                val html = extractHtml(result)
                // Check for key parts of the code instead of exact match (due to potential formatting)
                html shouldContain JSX_DEFAULT_EXPORT_VARIABLE_NAME
                html shouldContain "React.createElement"
                html shouldContain "Hello, World!"
            }

            should("include div container with correct id and style") {
                val result = jsxCodeResult.render(notebook)
                val html = extractHtml(result)
                html shouldContain """<div id="""
                html shouldContain """style="width:100%;min-height:100px""""
            }

            should("include script module tag") {
                val result = jsxCodeResult.render(notebook)
                val html = extractHtml(result)
                html shouldContain """<script type="module">"""
                html shouldContain "</script>"
            }

            should("include getContainer function definition") {
                val result = jsxCodeResult.render(notebook)
                val html = extractHtml(result)
                html shouldContain "function getContainer"
                html shouldContain "document.getElementById"
            }

            should("getContainer function has correct default parameters") {
                val result = jsxCodeResult.render(notebook)
                val html = extractHtml(result)
                html shouldContain """width = "100%""""
                html shouldContain """height = "100px""""
            }
        }

        context("React import detection") {
            should("include React import when React is not imported") {
                val codeWithoutReact =
                    """
                    const ${JSX_DEFAULT_EXPORT_VARIABLE_NAME} = () => {
                        return React.createElement('div', null, 'Hello');
                    };
                    """.trimIndent()
                val result = JsxCodeResult(codeWithoutReact)
                val html = extractHtml(result.render(notebook))
                html shouldContain """import React from"""
                html shouldContain LibsMapping.default["react"]!!.mainSource
            }

            should("not include React import when React is already imported") {
                val codeWithReact =
                    """
                    import React from "react";
                    const ${JSX_DEFAULT_EXPORT_VARIABLE_NAME} = () => {
                        return React.createElement('div', null, 'Hello');
                    };
                    """.trimIndent()
                val result = JsxCodeResult(codeWithReact)
                val html = extractHtml(result.render(notebook))
                // Should not contain the auto-generated React import (check for LibsMapping URL)
                val reactUrl = LibsMapping.default["react"]!!.mainSource
                html shouldNotContain """import React from "$reactUrl";"""
                // But should contain the user's import
                html shouldContain """import React from "react""""
            }

            should("detect React import with single quotes") {
                val codeWithReact =
                    """
                    import React from 'react';
                    const ${JSX_DEFAULT_EXPORT_VARIABLE_NAME} = () => null;
                    """.trimIndent()
                val result = JsxCodeResult(codeWithReact)
                val html = extractHtml(result.render(notebook))
                html shouldNotContain """import React from "${LibsMapping.default["react"]}";"""
            }

            should("detect React import with whitespace") {
                val codeWithReact =
                    """
                    import React from  "react"  ;
                    const ${JSX_DEFAULT_EXPORT_VARIABLE_NAME} = () => null;
                    """.trimIndent()
                val result = JsxCodeResult(codeWithReact)
                val html = extractHtml(result.render(notebook))
                html shouldNotContain """import React from "${LibsMapping.default["react"]}";"""
            }
        }

        context("ReactDOM import") {
            should("include ReactDOM createRoot import") {
                val result = jsxCodeResult.render(notebook)
                val html = extractHtml(result)
                html shouldContain """import  { createRoot }  from"""
                html shouldContain LibsMapping.default["react-dom"]!!.mainSource
            }
        }

        context("React Root creation and rendering") {
            should("include createRoot call") {
                val result = jsxCodeResult.render(notebook)
                val html = extractHtml(result)
                html shouldContain "const root = createRoot(getContainer());"
            }

            should("include root.render call with React.createElement") {
                val result = jsxCodeResult.render(notebook)
                val html = extractHtml(result)
                html shouldContain "root.render(React.createElement("
                html shouldContain JSX_DEFAULT_EXPORT_VARIABLE_NAME
            }

            should("render default export variable correctly") {
                val result = jsxCodeResult.render(notebook)
                val html = extractHtml(result)
                html shouldContain "React.createElement(${JSX_DEFAULT_EXPORT_VARIABLE_NAME})"
            }
        }

        context("render method") {
            should("return DisplayResult instance") {
                val result = jsxCodeResult.render(notebook)
                result.shouldBeInstanceOf<DisplayResult>()
            }

            should("return HTML result with correct structure") {
                val result = jsxCodeResult.render(notebook)
                val json = result.toJson(buildJsonObject {})
                val jsonString = Json.encodeToString(json)
                jsonString shouldContain "text/html"
                // Check for key parts instead of exact match
                jsonString shouldContain JSX_DEFAULT_EXPORT_VARIABLE_NAME
                jsonString shouldContain "React.createElement"
            }
        }

        context("different JSX code content") {
            should("handle empty JSX code") {
                val emptyCode = "const ${JSX_DEFAULT_EXPORT_VARIABLE_NAME} = () => null;"
                val emptyResult = JsxCodeResult(emptyCode)
                val result = emptyResult.render(notebook)
                val html = extractHtml(result)
                html shouldContain JSX_DEFAULT_EXPORT_VARIABLE_NAME
                html shouldContain "() => null"
                html shouldContain "<script type=\"module\">"
                html shouldContain "</script>"
            }

            should("handle JSX code with special characters") {
                val specialCode =
                    """
                    const ${JSX_DEFAULT_EXPORT_VARIABLE_NAME} = () => {
                        return React.createElement('div', null, "Hello 'World' \"Test\"");
                    };
                    """.trimIndent()
                val result = JsxCodeResult(specialCode)
                val html = extractHtml(result.render(notebook))
                html shouldContain JSX_DEFAULT_EXPORT_VARIABLE_NAME
                html shouldContain "Hello 'World'"
                html shouldContain "Test"
            }

            should("handle JSX code with newlines") {
                val multilineCode =
                    """
                    const ${JSX_DEFAULT_EXPORT_VARIABLE_NAME} = () => {
                        const x = 1;
                        const y = 2;
                        return React.createElement('div', null, x + y);
                    };
                    """.trimIndent()
                val result = JsxCodeResult(multilineCode)
                val html = extractHtml(result.render(notebook))
                html shouldContain JSX_DEFAULT_EXPORT_VARIABLE_NAME
                html shouldContain "const x = 1"
                html shouldContain "const y = 2"
                html shouldContain "x + y"
            }

            should("handle JSX code with template literals") {
                val templateCode =
                    """
                    const ${JSX_DEFAULT_EXPORT_VARIABLE_NAME} = () => {
                        const msg = `Hello World`;
                        return React.createElement('div', null, msg);
                    };
                    """.trimIndent()
                val result = JsxCodeResult(templateCode)
                val html = extractHtml(result.render(notebook))
                html shouldContain JSX_DEFAULT_EXPORT_VARIABLE_NAME
                html shouldContain "`Hello World`"
                html shouldContain "const msg"
            }

            should("handle JSX code with comments") {
                val commentCode =
                    """
                    // This is a comment
                    const ${JSX_DEFAULT_EXPORT_VARIABLE_NAME} = () => {
                        /* multi-line comment */
                        return React.createElement('div', null, 'Hello');
                    };
                    """.trimIndent()
                val result = JsxCodeResult(commentCode)
                val html = extractHtml(result.render(notebook))
                html shouldContain JSX_DEFAULT_EXPORT_VARIABLE_NAME
                html shouldContain "// This is a comment"
                html shouldContain "/* multi-line comment */"
            }

            should("handle JSX code with hooks") {
                val hooksCode =
                    """
                    import React, { useState } from 'react';
                    const ${JSX_DEFAULT_EXPORT_VARIABLE_NAME} = () => {
                        const [count, setCount] = useState(0);
                        return React.createElement('div', null, count);
                    };
                    """.trimIndent()
                val result = JsxCodeResult(hooksCode)
                val html = extractHtml(result.render(notebook))
                html shouldContain JSX_DEFAULT_EXPORT_VARIABLE_NAME
                html shouldContain "useState"
                html shouldContain "import React"
                // Should not add duplicate React import (check for LibsMapping URL)
                val reactUrl = LibsMapping.default["react"]!!.mainSource
                val autoImportPattern = """import React from "$reactUrl""""
                html shouldNotContain autoImportPattern
            }
        }

        context("multiple instances") {
            should("each instance has unique container") {
                val code1 = "const ${JSX_DEFAULT_EXPORT_VARIABLE_NAME} = () => null;"
                val code2 = "const ${JSX_DEFAULT_EXPORT_VARIABLE_NAME} = () => null;"
                val result1 = JsxCodeResult(code1)
                val result2 = JsxCodeResult(code2)
                val html1 = extractHtml(result1.render(notebook))
                val html2 = extractHtml(result2.render(notebook))

                val uuidPattern = Regex("""id="([0-9a-f]{8}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{12})"""")
                val uuid1 = uuidPattern.find(html1)!!.groupValues[1]
                val uuid2 = uuidPattern.find(html2)!!.groupValues[1]

                html1 shouldContain uuid1
                html2 shouldContain uuid2
                html1 shouldNotContain uuid2
                html2 shouldNotContain uuid1
            }

            should("each instance renders its own code") {
                val code1 = "const ${JSX_DEFAULT_EXPORT_VARIABLE_NAME} = () => React.createElement('div', null, 'A');"
                val code2 = "const ${JSX_DEFAULT_EXPORT_VARIABLE_NAME} = () => React.createElement('div', null, 'B');"
                val result1 = JsxCodeResult(code1)
                val result2 = JsxCodeResult(code2)

                val html1 = extractHtml(result1.render(notebook))
                val html2 = extractHtml(result2.render(notebook))

                html1 shouldContain "'A'"
                html1 shouldNotContain "'B'"
                html2 shouldContain "'B'"
                html2 shouldNotContain "'A'"
            }
        }

        context("HTML structure validation") {
            should("container div has correct styling") {
                val result = jsxCodeResult.render(notebook)
                val html = extractHtml(result)
                html shouldContain "width:100%"
                html shouldContain "min-height:100px"
            }

            should("getContainer function sets style correctly") {
                val result = jsxCodeResult.render(notebook)
                val html = extractHtml(result)
                html shouldContain "cellRoot.style ="
                html shouldContain "width:"
                html shouldContain "height:"
                html shouldContain "`"
            }

            should("complete rendering flow is present") {
                val result = jsxCodeResult.render(notebook)
                val html = extractHtml(result)
                // Check all required parts are present
                html shouldContain "function getContainer"
                html shouldContain "import"
                html shouldContain "createRoot"
                html shouldContain "const root = createRoot"
                html shouldContain "root.render"
                html shouldContain "React.createElement"
                html shouldContain JSX_DEFAULT_EXPORT_VARIABLE_NAME
            }
        }

        context("integration with LibsMapping") {
            should("use correct React CDN URL from LibsMapping") {
                val result = jsxCodeResult.render(notebook)
                val html = extractHtml(result)
                val reactUrl = LibsMapping.default["react"]!!.mainSource
                html shouldContain reactUrl
            }

            should("use correct ReactDOM CDN URL from LibsMapping") {
                val result = jsxCodeResult.render(notebook)
                val html = extractHtml(result)
                val reactDomUrl = LibsMapping.default["react-dom"]!!.mainSource
                html shouldContain reactDomUrl
            }
        }
    })
