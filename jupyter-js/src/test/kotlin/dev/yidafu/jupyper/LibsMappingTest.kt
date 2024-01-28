package dev.yidafu.jupyper

import io.kotest.core.spec.style.FunSpec
import kotlin.test.assertNotNull

class LibsMappingTest : FunSpec({
    test("get esm url") {
        assertNotNull(LibsMapping["react"])
        assertNotNull(LibsMapping["react-dom"])
        assertNotNull(LibsMapping["echarts"])
    }
})
