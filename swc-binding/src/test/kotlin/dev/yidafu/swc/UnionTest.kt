package dev.yidafu.swc

import dev.yidafu.swc.types.Union
import kotlinx.serialization.decodeFromString
import kotlinx.serialization.encodeToString
import kotlinx.serialization.json.Json
import kotlin.test.Test

typealias T2 = Union.U2<String, Number>
class UnionTest {
    @Test
    fun `encode Union type`() {
        val u1 = T2.ofA("AAA")
        println(Json.encodeToString(u1))

        val u2 = T2.ofB(123)
        val s2 = Json.encodeToString(u2)
        println(s2)
        Json.decodeFromString<T2>(s2)
    }
}
