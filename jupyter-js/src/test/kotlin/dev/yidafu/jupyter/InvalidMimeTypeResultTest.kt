package dev.yidafu.jupyter

import io.kotest.core.spec.style.ShouldSpec
import io.kotest.matchers.shouldBe
import io.kotest.matchers.string.shouldContain
import io.kotest.matchers.types.shouldBeInstanceOf

class InvalidMimeTypeResultTest :
    ShouldSpec({
        context("InvalidMimeTypeResult exception tests") {
            should("should create exception instance correctly") {
                val type = "application/json"
                val exception = InvalidMimeTypeResult(type)

                exception.shouldBeInstanceOf<InvalidMimeTypeResult>()
                exception.shouldBeInstanceOf<JupyterJsException>()
                exception.shouldBeInstanceOf<RuntimeException>()
            }

            should("exception message should contain the type parameter") {
                val type = "text/html"
                val exception = InvalidMimeTypeResult(type)

                exception.message shouldContain type
                exception.message shouldContain "Kotlin Jupyter MimeTypedResult"
                exception.message shouldContain "data can't be null"
            }

            should("exception message format should be correct") {
                val type = "image/png"
                val exception = InvalidMimeTypeResult(type)

                exception.message shouldBe "Kotlin Jupyter MimeTypedResult ($type) data can't be null"
            }

            should("should handle different MIME types") {
                val types = listOf("application/json", "text/html", "image/png", "text/plain")

                types.forEach { type ->
                    val exception = InvalidMimeTypeResult(type)
                    exception.message shouldContain type
                }
            }

            should("should handle empty string as type") {
                val exception = InvalidMimeTypeResult("")

                exception.message shouldContain ""
                exception.message shouldBe "Kotlin Jupyter MimeTypedResult () data can't be null"
            }
        }
    })

