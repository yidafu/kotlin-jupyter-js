package dev.yidafu.swc

import dev.yidafu.swc.types.ParserConfig

fun main() {
    val n = SwcNative()
    println(n.sayHello("kotlin"))
    val res = n.transformSync(
        """
        import x from './test.js';
        class Foo { }

        class Bar extends Foo { }
        """.trimIndent(),
        true,
        ParserConfig()
    )
    println("transform result ==>")
    println(res)
}
