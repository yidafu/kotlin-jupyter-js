package dev.yidafu.swc

import dev.yidafu.swc.dsl.jscConfig
import dev.yidafu.swc.types.Module
import dev.yidafu.swc.types.Options
import dev.yidafu.swc.types.ParserConfig
import kotlinx.serialization.decodeFromString
import kotlinx.serialization.json.Json

fun main() {
    val n = SwcNative()
    // println(n.sayHello("kotlin"))
    val res = n.transformSync(
        """
        import x from './test.js';
        class Foo { }

        class Bar extends Foo { }
        """.trimIndent(),
        true,
        Options().apply {
            jsc = jscConfig {
                parser = ParserConfig().apply {
                    syntax = "typescript"
                }
            }
        }
    )
    println("transform result ==> \n\t$res")

    val ast = n.parseSync("""
                import x from './test.js';
                class Foo { }

                class Bar extends Foo { }
    """.trimIndent(), ParserConfig().apply {
        syntax = "typescript"
    }, "")
    println(ast)
    Json.decodeFromString<Module>(ast)
}
