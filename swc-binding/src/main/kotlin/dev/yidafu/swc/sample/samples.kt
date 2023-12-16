package dev.yidafu.swc.sample // ktlint-disable filename

import dev.yidafu.swc.SwcNative
import dev.yidafu.swc.esParseOptions
import dev.yidafu.swc.tsParseOptions

fun parseSyncBasicUsage() {
    SwcNative().parseSync(
        """
          const foo = "bar";
          console.log(foo);
          """,
        """{"syntax":"ecmascript"}""",
        "temp.js"
    )
}

fun parseFileSyncBasicUsage() {
    SwcNative().parseFileSync(
        "path/to/js/code.js",
        """{"syntax":"ecmascript"}"""
    )
}

fun parseSyncEsSample() {
    SwcNative().parseSync(
        """
          const foo = "bar";
          console.log(foo);
        """.trimIndent(),
        esParseOptions {
            target = "es5"
        },
        "temp.js"
    )
}

fun parseSyncJsxSample() {
    SwcNative().parseSync(
        """
          function App() {
            return <div>App</div>
          }
        """.trimIndent(),
        esParseOptions {
            jsx = true
            target = "es5"
        },
        "temp.js"
    )
}
fun parseSyncTsSample() {
    SwcNative().parseSync(
        """
          const foo: string = "bar";
          console.log(foo);
        """.trimIndent(),
        tsParseOptions {
            target = "es5"
        },
        "temp.js"
    )
}

fun parseFileSyncEsSample() {
    SwcNative().parseFileSync(
        "path/to/js/code.js",
        esParseOptions {
            target = "es5"
        }
    )
}
