package dev.yidafu.jupyper

import io.kotest.assertions.throwables.shouldThrow
import io.kotest.core.spec.style.ShouldSpec
import io.kotest.matchers.equals.shouldBeEqual
import io.kotest.matchers.shouldBe
import kotlinx.serialization.decodeFromString
import kotlinx.serialization.encodeToString
import kotlinx.serialization.json.Json

class JavaScriptPackageSerializationTest : ShouldSpec({
    val simplePackage = JavaScriptPackage("main.js")
    val complexPackage =
        JavaScriptPackage(
            "main.js",
            listOf("extra1.js", "extra2.js"),
        )

    context("JavaScriptPackage serialization") {
        should("correctly serialize a simple package with only mainSource") {
            val serialized = Json.encodeToString(simplePackage)
            serialized shouldBe "\"main.js\""
        }

        should("incorrectly serialize a simple package when mainSource isn't string") {
            shouldThrow<IllegalStateException> {
                Json.decodeFromString<JavaScriptPackage>("1234")
            }
        }

        should("correctly deserialize a simple package from JSON") {
            val json = """ "main.js" """.trim()
            val deserialized = Json.decodeFromString<JavaScriptPackage>(json)
            deserialized shouldBeEqual simplePackage
        }

        should("correctly serialize a complex package with extraSources") {
            val serialized = Json.encodeToString(complexPackage)
            serialized.shouldBeEqual("""{"main":"main.js","extra":["extra1.js","extra2.js"]}""")
        }

        should("correctly deserialize a complex package from JSON") {
            val json = """{"main": "main.js", "extra": ["extra1.js", "extra2.js"]}"""
            val deserialized = Json.decodeFromString<JavaScriptPackage>(json)
            deserialized shouldBe complexPackage
        }

        should("incorrectly deserialize a complex package from from JSON when main field isn't string") {
            val json = """{"main": 1234, "extra": ["extra1.js", "extra2.js"]}"""
            shouldThrow<IllegalStateException> {
                Json.decodeFromString<JavaScriptPackage>(json)
            }
        }

        should("incorrectly deserialize a complex package from from JSON when main field is array") {
            val json = """{"main": [1234], "extra": ["extra1.js", "extra2.js"]}"""
            shouldThrow<IllegalStateException> {
                Json.decodeFromString<JavaScriptPackage>(json)
            }
        }

        should("incorrectly deserialize a complex package from from JSON when extra field must be array") {
            val json = """{"main": "main.js", "extra": "extra"}"""
            shouldThrow<IllegalStateException> {
                Json.decodeFromString<JavaScriptPackage>(json)
            }
        }

        should("incorrectly deserialize a complex package from from JSON when extra field isn't string array") {
            val json = """{"main": "main.js", "extra": [123, 456]}"""
            shouldThrow<IllegalStateException> {
                Json.decodeFromString<JavaScriptPackage>(json)
            }
        }

        should("incorrectly deserialize a complex package from from JSON when it not { main: string, extra: {} }") {
            val json = """ ["main.js", ["extra1.js", "extra2.js"] ]"""
            shouldThrow<IllegalStateException> {
                Json.decodeFromString<JavaScriptPackage>(json)
            }
        }
    }
})
