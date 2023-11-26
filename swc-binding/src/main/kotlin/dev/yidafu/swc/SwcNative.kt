package dev.yidafu.swc

import java.util.Optional

class SwcNative {
    init {
        // TODO: load from resource dir
        System.loadLibrary("swc_binding")
    }

    external fun sayHello(input: String): String

    external fun parseSync(code: String, options: String, filename: String?): Optional<String>

    external fun parseFileSync(filepath: String, options: String): Optional<String>

    external fun transformSync(code: String, isModule: Boolean, options: String): Optional<String>

    external fun transformFileSync(filepath: String, isModule: Boolean, options: String): Optional<String>
}

var a = "".replace(Regex.fromLiteral(":\\s+(\\w+)?")) { it ->

    ": ${it.value}? = null"
}

var b = "var compress: dynamic /* dev.yidafu.swc.TerserCompressOptions? | Boolean? */"
    .replace(":\\s+(dynamic)\\s+\\/\\*([^\\*]+)\\*\\/".toRegex()) {
        val commonts = it.groups[1]?.value?.split("|") ?: emptyList()
        if (commonts.size == 2) {
            ": Union.U2<${commonts[0]}, ${commonts[1]}>"
        } else if (commonts.size == 3) {
            ": Union.U3<${commonts[0]}, ${commonts[1]}, ${commonts[2]}>"
        } else {
            ": Node? = null"
        }
    }
