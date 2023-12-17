package dev.yidafu.jupyper

import org.junit.Test
import kotlin.test.assertNotNull

class LibsMappingTest {
    @Test
    fun `get esm url`() {
        assertNotNull(LibsMapping["react"])
        assertNotNull(LibsMapping["react-dom"])
        assertNotNull(LibsMapping["echarts"])
    }
}
