package dev.yidafu.jupyter.errors

import dev.yidafu.jupyper.errors.ErrorFactory
import dev.yidafu.jupyper.errors.JupyterJsError
import io.kotest.core.spec.style.ShouldSpec
import io.kotest.matchers.nulls.shouldNotBeNull
import io.kotest.matchers.shouldBe
import io.kotest.matchers.string.shouldContain
import io.kotest.matchers.types.shouldBeInstanceOf
import java.io.FileNotFoundException
import java.net.ConnectException
import java.net.SocketTimeoutException
import java.net.UnknownHostException

class ErrorFactoryTest : ShouldSpec({
    context("Exception type conversion") {
        should("UnknownHostException should be converted to NetworkError") {
            val exception = UnknownHostException("example.com")
            val error = ErrorFactory.fromException(exception, mapOf("url" to "https://example.com"))

            error.shouldBeInstanceOf<JupyterJsError.NetworkError>()
            error.message shouldContain "Cannot resolve hostname"
            error.suggestion.shouldNotBeNull()
        }

        should("SocketTimeoutException should be converted to NetworkError") {
            val exception = SocketTimeoutException("Connection timeout")
            val error = ErrorFactory.fromException(exception, mapOf("url" to "https://example.com"))

            error.shouldBeInstanceOf<JupyterJsError.NetworkError>()
            error.message shouldContain "Network request timeout"
        }

        should("ConnectException should be converted to NetworkError") {
            val exception = ConnectException("Connection refused")
            val error = ErrorFactory.fromException(exception, mapOf("url" to "https://example.com"))

            error.shouldBeInstanceOf<JupyterJsError.NetworkError>()
            error.message shouldContain "Connection refused"
        }

        should("FileNotFoundException should be converted to ConfigurationError") {
            val exception = FileNotFoundException("/path/to/file")
            val error = ErrorFactory.fromException(exception)

            error.shouldBeInstanceOf<JupyterJsError.ConfigurationError>()
            error.message shouldContain "File not found"
        }

        should("IllegalStateException(serialize) should be converted to TypeError") {
            val exception = IllegalStateException("Cannot serialize custom class")
            val error = ErrorFactory.fromException(exception)

            error.shouldBeInstanceOf<JupyterJsError.TypeError>()
            error.message shouldContain "Variable serialization failed"
        }

        should("IllegalStateException(circular) should be converted to ConfigurationError") {
            val exception = IllegalStateException("circular dependency detected")
            val error = ErrorFactory.fromException(exception)

            error.shouldBeInstanceOf<JupyterJsError.ConfigurationError>()
            error.message shouldContain "Circular dependency detected"
        }

        should("IllegalArgumentException should be converted to ConfigurationError") {
            val exception = IllegalArgumentException("Invalid argument")
            val error = ErrorFactory.fromException(exception)

            error.shouldBeInstanceOf<JupyterJsError.ConfigurationError>()
            error.message shouldContain "Invalid argument"
        }

        should("Other exceptions should be converted to UnknownError") {
            val exception = RuntimeException("Something went wrong")
            val error = ErrorFactory.fromException(exception)

            error.shouldBeInstanceOf<JupyterJsError.UnknownError>()
        }
    }

    context("Context information passing") {
        should("should correctly pass custom context") {
            val exception = UnknownHostException("example.com")
            val context =
                mapOf(
                    "url" to "https://test.com",
                    "method" to "GET",
                    "timeout" to "5000",
                )
            val error = ErrorFactory.fromException(exception, context)

            error.context["url"] shouldBe "https://test.com"
        }
    }

    context("Syntax error creation") {
        should("should be able to create syntax error") {
            val error =
                ErrorFactory.createSyntaxError(
                    message = "Syntax error",
                    line = 10,
                    column = 5,
                    source = "test.js",
                    suggestion = "Fix syntax",
                )

            error.shouldBeInstanceOf<JupyterJsError.SyntaxError>()
            error.line shouldBe 10
            error.column shouldBe 5
            error.source shouldBe "test.js"
        }
    }
})
