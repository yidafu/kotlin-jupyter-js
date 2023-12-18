package dev.yidafu.jupyper

import kotlinx.serialization.encodeToString
import kotlinx.serialization.json.Json
import org.junit.Test
import kotlin.test.assertEquals
import kotlin.test.assertNull


class JavaScriptPackageTest {
    @Test
    fun `JavaScriptPackage serialize`() {
         val json = Json.encodeToString(JavaScriptPackage("source", listOf("extra1", "extra2")))
        assertEquals(json, """{"main":"source","extra":["extra1","extra2"]}""")
    }
    @Test
    fun `JavaScriptPackage deserialize`() {
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
}