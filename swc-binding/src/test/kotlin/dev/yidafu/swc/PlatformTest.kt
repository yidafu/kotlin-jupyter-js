package dev.yidafu.swc

import kotlin.test.Test
import kotlin.test.assertEquals

class PlatformTest {
    @Test
    fun `current is mac`() {
        assertEquals(DllLoader.Platform.current, DllLoader.Platform.Mac)
        DllLoader.Platform.Mac.isM1()
    }
}
