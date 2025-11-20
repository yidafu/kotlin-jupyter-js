package dev.yidafu.jupyter

import io.kotest.core.spec.style.ShouldSpec
import io.kotest.matchers.nulls.shouldNotBeNull
import io.kotest.matchers.string.shouldContain
import io.kotest.matchers.string.shouldNotBeEmpty
import io.mockk.mockkClass
import kotlinx.serialization.encodeToString
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.buildJsonObject
import org.jetbrains.kotlinx.jupyter.api.Notebook

class JsCodeResultTest : ShouldSpec({
    val testJsCode = "console.log('Hello, World!')"
    val jsCodeResult = JsCodeResult(testJsCode)

    context("when generating UUID and rendering") {
        should("generate a non-empty UUID") {
            jsCodeResult.uuid.shouldNotBeNull()
            jsCodeResult.uuid.shouldNotBeEmpty()
        }

        should("include JS code in the script module") {
            val notebook = mockkClass(Notebook::class)
            val result = jsCodeResult.render(notebook)
            val renderedHtml = Json.encodeToString(result.toJson(buildJsonObject {}))
            renderedHtml shouldContain testJsCode
            renderedHtml shouldContain jsCodeResult.uuid
        }
    }
})
