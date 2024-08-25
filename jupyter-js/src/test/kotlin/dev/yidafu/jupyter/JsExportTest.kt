package dev.yidafu.jupyter

import io.kotest.core.spec.style.ShouldSpec
import io.kotest.matchers.shouldBe


class JsExportTest : ShouldSpec({
    should("export kotlin variable to js world") {
        jsExport("num", 1234)
        JavaScriptVariableStore["num"] shouldBe "1234"

        jsExport("str", "str")
        JavaScriptVariableStore["str"] shouldBe "\"str\""

        jsExport("map", mapOf("str" to "str"))
        JavaScriptVariableStore["map"] shouldBe "{\"str\":\"str\"}"

        jsExport("arr", arrayOf("1", "2", "3"))
        JavaScriptVariableStore["arr"] shouldBe "[\"1\",\"2\",\"3\"]"
    }
})