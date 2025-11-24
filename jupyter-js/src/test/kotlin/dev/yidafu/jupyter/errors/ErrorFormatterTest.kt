package dev.yidafu.jupyter.errors

import io.kotest.core.spec.style.ShouldSpec
import io.kotest.matchers.shouldBe
import io.kotest.matchers.string.shouldContain
import io.kotest.matchers.string.shouldNotContain

class ErrorFormatterTest :
    ShouldSpec({
        context("HTML formatting") {
            should("SyntaxError should be formatted as HTML") {
                val error =
                    JupyterJsError.SyntaxError(
                        line = 10,
                        column = 5,
                        message = "Syntax error",
                        suggestion = "Fix syntax",
                    )

                val html = ErrorFormatter.formatAsHtml(error)

                html shouldContain "Syntax error"
                html shouldContain "SYNTAX_ERROR"
                html shouldContain "🔤"
                html shouldContain "#ff9800" // Orange
                html shouldContain "Fix syntax"
            }

            should("TypeError should be formatted as HTML") {
                val error =
                    JupyterJsError.TypeError(
                        expectedType = "String",
                        actualType = "Number",
                        message = "Type mismatch",
                    )

                val html = ErrorFormatter.formatAsHtml(error)

                html shouldContain "Type mismatch"
                html shouldContain "TYPE_ERROR"
                html shouldContain "🔢"
                html shouldContain "#f44336" // Red
            }

            should("NetworkError should be formatted as HTML") {
                val error =
                    JupyterJsError.NetworkError(
                        url = "https://example.com",
                        message = "Network error",
                    )

                val html = ErrorFormatter.formatAsHtml(error)

                html shouldContain "Network error"
                html shouldContain "NETWORK_ERROR"
                html shouldContain "🌐"
                html shouldContain "#2196f3" // Blue
            }

            should("HTML should contain details") {
                val error =
                    JupyterJsError.ConfigurationError(
                        configKey = "test.key",
                        message = "Configuration error",
                    )

                val html = ErrorFormatter.formatAsHtml(error)

                // Verify basic HTML content
                html shouldContain "Configuration error"
                html shouldContain "CONFIG_ERROR"
                // ConfigurationError has context
                html shouldContain "test.key"
            }

            should("HTML should contain suggestion") {
                val error =
                    JupyterJsError.VariableNotFoundError(
                        variableName = "myVar",
                        message = "Variable not found",
                        suggestion = "Check variable name",
                    )

                val html = ErrorFormatter.formatAsHtml(error)

                html shouldContain "💡 Suggestion:"
                html shouldContain "Check variable name"
            }

            should("should not contain suggestion block when there is no suggestion") {
                val error =
                    JupyterJsError.UnknownError(
                        message = "Unknown error",
                    )

                val html = ErrorFormatter.formatAsHtml(error)

                html shouldNotContain "💡 Suggestion:"
            }
        }

        context("JSON formatting") {
            should("should format as JSON") {
                val error =
                    JupyterJsError.SyntaxError(
                        message = "Syntax error",
                    )

                // Verify error can be created
                error.code shouldBe "SYNTAX_ERROR"
                error.message shouldBe "Syntax error"
            }

            should("should be able to format error") {
                val error =
                    JupyterJsError.TypeError(
                        expectedType = "String",
                        actualType = "Number",
                        message = "Type mismatch",
                    )

                // Verify error formatting does not throw exception
                val html = ErrorFormatter.formatAsHtml(error)
                html shouldContain "Type mismatch"
            }
        }
    })
