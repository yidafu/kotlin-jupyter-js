package dev.yidafu.swc

import dev.yidafu.swc.dsl.jscConfig
import dev.yidafu.swc.types.Options
import dev.yidafu.swc.types.ParseOptions
import dev.yidafu.swc.types.ParserConfig
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertNotNull

class SwcNativeTest {
    @Test
    fun `parse js code to ast str`() {
        val ast = SwcNative().parseSync(
            "function add(a, b) {return a + b;}; add(1,2)",
            ParseOptions().apply { syntax = "typescript" },
            "temp.js"
        )
        assertNotNull(ast) { "ast string can't be null "}
    }

    @Test
    fun `parse js file to ast str`() {
        val ast = SwcNative().parseFileSync(
            SwcNativeTest::class.java.classLoader.getResource("test.js").file,
            ParseOptions().apply { syntax = "typescript" }
        )
        assertNotNull(ast) { "ast string can't be null "}
    }


    @Test
    fun `transform js code to ast str`() {
        val ast = SwcNative().transformSync(
            "function add(a, b) {return a + b;}; add(1,2)",

            true,
            Options().apply {
                jsc  = jscConfig {
                    parser = ParserConfig().apply {
                        syntax = "typescript"
                    }
                }
            }
        )
        assertNotNull(ast) { "transform result can't be null "}
    }

    @Test
    fun `transform js file to ast str`() {
        val ast = SwcNative().transformFileSync(
            SwcNativeTest::class.java.classLoader.getResource("test.js").file,
    false,
            Options().apply {
                jsc  = jscConfig {
                    parser = ParserConfig().apply {
                        syntax = "ecmascript"
                    }
                }
            }
        )
        assertNotNull(ast) { "transform result can't be null "}
    }

    @Test
    fun `transform ts file to ast str`() {
        val ast = SwcNative().transformFileSync(
            SwcNativeTest::class.java.classLoader.getResource("test.ts").file,
            false,
            Options().apply {
                jsc  = jscConfig {
                    parser = ParserConfig().apply {
                        syntax = "typescript"
                    }
                }
            }
        )

        assertEquals(ast.trim(), """
            function add(a, b) {
                return a + b;
            }
            add(1, 2);
        """.trimIndent())
    }

//    @Test
//    fun `transform ast json file to ast str`() {
//        val ast = SwcNative().transformFileSync(
//            SwcNativeTest::class.java.classLoader.getResource("ast.json").readText(),
//            true,
////            Options().apply {
////                jsc  = jscConfig {
////                    parser = ParserConfig().apply {
////                        syntax = "ecmascript"
////                    }
////                }
////            }
//            Options()
//        )
//        assertNotNull(ast) { "transform result can't be null "}
//    }
}
