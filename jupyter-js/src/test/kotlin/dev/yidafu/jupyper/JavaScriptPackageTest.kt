package dev.yidafu.jupyper

import io.kotest.core.spec.style.FunSpec
import kotlinx.serialization.encodeToString
import kotlinx.serialization.json.Json
import kotlin.test.assertEquals
import kotlin.test.assertNull

class JavaScriptPackageTest : FunSpec({
    test("JavaScriptPackage serialize") {
        val json = Json.encodeToString(JavaScriptPackage("source", listOf("extra1", "extra2")))
        assertEquals(json, """{"main":"source","extra":["extra1","extra2"]}""")
    }

    test("JavaScriptPackage deserialize") {
        val pkgs = Json.decodeFromString<List<JavaScriptPackage>>(
            """
                [
                  {"main":"source","extra":["extra1","extra2"]},
                  "string"
                ]
            """.trimIndent()
        )
        assertEquals(pkgs[0].mainSource, "source")
        assertEquals(pkgs[0].extraSources?.get(1), "extra2")
        assertNull(pkgs[1].extraSources)
        assertEquals(pkgs[1].mainSource, "string")
    }
})
