package dev.yidafu.swc // ktlint-disable filename

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
        ""
    )
    println("transform result ==>")
    println(res)
}
