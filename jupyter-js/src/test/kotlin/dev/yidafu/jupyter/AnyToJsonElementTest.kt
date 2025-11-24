package dev.yidafu.jupyter

import dev.yidafu.jupyter.toJsonElement
import io.kotest.assertions.throwables.shouldThrow
import io.kotest.core.spec.style.ShouldSpec
import io.kotest.matchers.comparables.shouldBeGreaterThan
import io.kotest.matchers.shouldBe
import io.kotest.matchers.string.shouldContain
import io.kotest.matchers.types.shouldBeInstanceOf
import kotlinx.serialization.SerializationException
import kotlinx.serialization.json.JsonNull
import kotlinx.serialization.json.JsonPrimitive

enum class TestEnum {
    VALUE1,
    VALUE2,
}

class AnyToJsonElementTest :
    ShouldSpec({
        context("Basic type conversion") {
            should("null should be converted to JsonNull") {
                val result: Any? = null
                result.toJsonElement() shouldBe JsonNull
            }

            should("String should be converted to JsonPrimitive") {
                "hello".toJsonElement() shouldBe JsonPrimitive("hello")
            }

            should("Int should be converted to JsonPrimitive") {
                123.toJsonElement() shouldBe JsonPrimitive(123)
            }

            should("Double should be converted to JsonPrimitive") {
                123.45.toJsonElement() shouldBe JsonPrimitive(123.45)
            }

            should("Boolean true should be converted to JsonPrimitive") {
                true.toJsonElement() shouldBe JsonPrimitive(true)
            }

            should("Boolean false should be converted to JsonPrimitive") {
                false.toJsonElement() shouldBe JsonPrimitive(false)
            }
        }

        context("Array type conversion") {
            should("IntArray should be converted to JsonArray") {
                intArrayOf(1, 2, 3).toJsonElement().toString() shouldBe "[1,2,3]"
            }

            should("Array<String> should be converted to JsonArray") {
                arrayOf("a", "b", "c").toJsonElement().toString() shouldBe """["a","b","c"]"""
            }

            should("DoubleArray should be converted to JsonArray") {
                doubleArrayOf(1.1, 2.2, 3.3).toJsonElement().toString() shouldBe "[1.1,2.2,3.3]"
            }

            should("BooleanArray should be converted to JsonArray") {
                booleanArrayOf(true, false, true).toJsonElement().toString() shouldBe "[true,false,true]"
            }
        }

        context("Collection type conversion") {
            should("List<Int> should be converted to JsonArray") {
                listOf(1, 2, 3).toJsonElement().toString() shouldBe "[1,2,3]"
            }

            should("Set<String> should be converted to JsonArray") {
                setOf("a", "b", "c").toJsonElement().toString().length shouldBeGreaterThan 0
            }

            should("Empty collection should be converted to empty JsonArray") {
                emptyList<Int>().toJsonElement().toString() shouldBe "[]"
            }
        }

        context("Map type conversion") {
            should("Map<String, Int> should be converted to JsonObject") {
                val result = mapOf("a" to 1, "b" to 2).toJsonElement()
                result.toString() shouldContain "a"
                result.toString() shouldContain "b"
                result.toString() shouldContain "1"
                result.toString() shouldContain "2"
            }

            should("Nested Map should be converted correctly") {
                val result = mapOf("nested" to mapOf("key" to "value")).toJsonElement()
                result.toString() shouldContain "nested"
            }
        }

        context("Special type conversion") {
            should("Pair should be converted to two-element array") {
                (1 to "hello").toJsonElement().toString() shouldBe """[1,"hello"]"""
            }

            should("Triple should be converted to three-element array") {
                Triple(1, "hello", true).toJsonElement().toString() shouldBe """[1,"hello",true]"""
            }

            should("Enum should be converted to string") {
                TestEnum.VALUE1.toJsonElement() shouldBe JsonPrimitive("VALUE1")
            }
        }

        context("Nested structure conversion") {
            should("List<Map> should be converted correctly") {
                val data =
                    listOf(
                        mapOf("name" to "Alice", "age" to 30),
                        mapOf("name" to "Bob", "age" to 25),
                    )
                val result = data.toJsonElement()
                result.toString() shouldContain "Alice"
                result.toString() shouldContain "Bob"
            }

            should("Map<String, List<Int>> should be converted correctly") {
                val data =
                    mapOf(
                        "scores" to listOf(90, 85, 95),
                    )
                val result = data.toJsonElement()
                result.toString() shouldContain "scores"
                result.toString() shouldContain "90"
            }
        }

        context("Unsupported types") {
            should("Unsupported object types should throw exception") {
                class CustomClass(
                    val value: String,
                )
                shouldThrow<IllegalStateException> {
                    CustomClass("test").toJsonElement()
                }
            }

            should(
                "should throw IllegalStateException with correct message and SerializationException cause when Json.encodeToJsonElement fails",
            ) {
                // 创建一个没有 @Serializable 注解的类，确保会抛出 SerializationException
                class NonSerializableClass(
                    val name: String,
                    val age: Int,
                )

                val exception =
                    shouldThrow<IllegalStateException> {
                        NonSerializableClass("test", 123).toJsonElement()
                    }

                // 验证异常消息
                exception.message shouldContain "Can't serialize class"
                exception.message shouldContain "you should implement org.jetbrains.kotlinx.jupyter.api.DisplayResult interface"

                // 验证异常原因（cause）是 SerializationException（如果存在）
                if (exception.cause != null) {
                    exception.cause.shouldBeInstanceOf<SerializationException>()
                }
            }
        }
    })
