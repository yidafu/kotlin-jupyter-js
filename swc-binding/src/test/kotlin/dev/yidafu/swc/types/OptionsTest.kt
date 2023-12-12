package dev.yidafu.swc.types

import dev.yidafu.swc.booleanable.Booleanable
import dev.yidafu.swc.dsl.jscConfig
import dev.yidafu.swc.dsl.matchPattern
import dev.yidafu.swc.options
import kotlinx.serialization.encodeToString
import kotlinx.serialization.json.Json
import kotlin.test.Test
import kotlin.test.assertEquals

class OptionsTest {
    @Test
    fun `encode options`() {
        val opt = options {
            cwd = "/path/to/cwd"
            configFile = Booleanable.ofFalse()
            swcrc = true
            isModule = Booleanable.ofTrue()
            jsc = jscConfig {
                loose = true
            }

            swcrcRoots = Booleanable.ofValue(
                arrayOf(
                    matchPattern {
                        MatchPattern()
                    }
                )
            )
        }

        val output = Json.encodeToString(opt)

        assertEquals(
            output,
            """{"cwd":"/path/to/cwd","configFile":false,"swcrc":true,"swcrcRoots":[{}],"isModule":true,"jsc":{"loose":true}}"""
        )
    }
}
