package dev.yidafu.jupyter.errors

import dev.yidafu.jupyper.errors.JupyterJsError
import io.kotest.core.spec.style.ShouldSpec
import io.kotest.matchers.shouldBe

class JupyterJsErrorTest : ShouldSpec({
    context("SyntaxError") {
        should("should include line and column numbers when creating syntax error") {
            val error =
                JupyterJsError.SyntaxError(
                    line = 10,
                    column = 5,
                    source = "test.js",
                    message = "Syntax error",
                    suggestion = "Fix syntax",
                )

            error.code shouldBe "SYNTAX_ERROR"
            error.message shouldBe "Syntax error"
            error.suggestion shouldBe "Fix syntax"
            error.context["line"] shouldBe "10"
            error.context["column"] shouldBe "5"
            error.context["source"] shouldBe "test.js"
        }
    }

    context("TypeError") {
        should("should include expected type and actual type when creating type error") {
            val error =
                JupyterJsError.TypeError(
                    expectedType = "String",
                    actualType = "Number",
                    variableName = "myVar",
                    message = "Type mismatch",
                    suggestion = "Use correct type",
                )

            error.code shouldBe "TYPE_ERROR"
            error.context["expectedType"] shouldBe "String"
            error.context["actualType"] shouldBe "Number"
            error.context["variableName"] shouldBe "myVar"
        }
    }

    context("NetworkError") {
        should("should include URL and status code when creating network error") {
            val error =
                JupyterJsError.NetworkError(
                    url = "https://example.com",
                    statusCode = 404,
                    reason = "Not Found",
                    message = "Failed to load resource",
                    suggestion = "Check URL",
                )

            error.code shouldBe "NETWORK_ERROR"
            error.context["url"] shouldBe "https://example.com"
            error.context["statusCode"] shouldBe "404"
            error.context["reason"] shouldBe "Not Found"
        }
    }

    context("VariableNotFoundError") {
        should("should include available variables list when creating variable not found error") {
            val error =
                JupyterJsError.VariableNotFoundError(
                    variableName = "myVar",
                    availableVariables = listOf("foo", "bar", "baz"),
                    message = "Variable does not exist",
                    suggestion = "Check variable name",
                )

            error.code shouldBe "VARIABLE_NOT_FOUND"
            error.context["variableName"] shouldBe "myVar"
            error.context["availableVariables"] shouldBe "foo, bar, baz"
        }
    }

    context("ConfigurationError") {
        should("should include config key and value when creating configuration error") {
            val error =
                JupyterJsError.ConfigurationError(
                    configKey = "library.url",
                    configValue = "invalid",
                    message = "Invalid configuration",
                    suggestion = "Use valid configuration",
                )

            error.code shouldBe "CONFIG_ERROR"
            error.context["configKey"] shouldBe "library.url"
            error.context["configValue"] shouldBe "invalid"
        }
    }

    context("CompilationError") {
        should("should include language and details when creating compilation error") {
            val error =
                JupyterJsError.CompilationError(
                    language = "TypeScript",
                    details = "Type check failed",
                    message = "Compilation failed",
                    suggestion = "Fix code",
                )

            error.code shouldBe "COMPILATION_ERROR"
            error.context["language"] shouldBe "TypeScript"
            error.context["details"] shouldBe "Type check failed"
        }
    }

    context("UnknownError") {
        should("should include original exception information when creating unknown error") {
            val error =
                JupyterJsError.UnknownError(
                    originalException = "NullPointerException",
                    message = "Unknown error occurred",
                    suggestion = "Check logs",
                )

            error.code shouldBe "UNKNOWN_ERROR"
            error.context["originalException"] shouldBe "NullPointerException"
        }
    }
})
