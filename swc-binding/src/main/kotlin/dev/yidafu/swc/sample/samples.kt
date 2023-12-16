package dev.yidafu.swc.sample

import dev.yidafu.swc.SwcNative

fun parseSyncBasicUsage() {
    SwcNative().parseSync(
        """
          const foo = "bar";
          console.log(foo);
          """,
        """{"syntax":"ecmascript"}""",
        "temp.js",
    )
}
