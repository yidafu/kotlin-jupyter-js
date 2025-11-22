package dev.yidafu.jupyter.errors

import java.io.FileNotFoundException
import java.net.ConnectException
import java.net.SocketTimeoutException
import java.net.UnknownHostException

/**
 * Error factory for creating structured JupyterJsError from exceptions
 */
object ErrorFactory {
    /**
     * Create JupyterJsError from exception
     */
    fun fromException(
        exception: Throwable,
        context: Map<String, String> = emptyMap(),
    ): JupyterJsError =
        when (exception) {
            is JupyterJsError -> {
                exception
            }

            is UnknownHostException -> {
                JupyterJsError.NetworkError(
                    url = context["url"] ?: "unknown",
                    message = "Cannot resolve hostname: ${exception.message}",
                    suggestion = "Please check network connection and URL",
                )
            }

            is SocketTimeoutException -> {
                JupyterJsError.NetworkError(
                    url = context["url"] ?: "unknown",
                    message = "Network request timeout: ${exception.message}",
                    suggestion = "Please check network connection or try again later",
                )
            }

            is ConnectException -> {
                JupyterJsError.NetworkError(
                    url = context["url"] ?: "unknown",
                    message = "Connection refused: ${exception.message}",
                    suggestion = "Please check if the server is running",
                )
            }

            is FileNotFoundException -> {
                JupyterJsError.ConfigurationError(
                    configKey = "file",
                    configValue = exception.message,
                    message = "File not found: ${exception.message}",
                    suggestion = "Please check if the file path is correct",
                )
            }

            is IllegalStateException -> {
                val message = exception.message ?: "Unknown state error"
                when {
                    message.contains("serialize") -> {
                        JupyterJsError.TypeError(
                            expectedType = "Serializable type",
                            actualType = "Unknown type",
                            message = "Variable serialization failed: $message",
                            suggestion = "Please ensure the variable implements DisplayResult interface or use basic types",
                        )
                    }

                    message.contains("circular dependency") -> {
                        JupyterJsError.ConfigurationError(
                            configKey = "dependency",
                            message = "Circular dependency detected: $message",
                            suggestion = "Please check if imported modules have circular references",
                        )
                    }

                    else -> {
                        JupyterJsError.UnknownError(
                            originalException = message,
                            message = "State error: $message",
                            suggestion = "Please check if the code logic is correct",
                        )
                    }
                }
            }

            is IllegalArgumentException -> {
                JupyterJsError.ConfigurationError(
                    configKey = "argument",
                    message = "Invalid argument: ${exception.message}",
                    suggestion = "Please check if the provided arguments meet the requirements",
                )
            }

            else -> {
                JupyterJsError.UnknownError(
                    originalException = exception.javaClass.simpleName,
                    message = "Unhandled error: ${exception.message ?: "Unknown error"}",
                    suggestion = "Please check detailed error information or contact the developer",
                )
            }
        }

    /**
     * Create syntax error
     */
    fun createSyntaxError(
        message: String,
        line: Int? = null,
        column: Int? = null,
        source: String? = null,
        suggestion: String? = null,
    ): JupyterJsError.SyntaxError =
        JupyterJsError.SyntaxError(
            line = line,
            column = column,
            source = source,
            message = message,
            suggestion = suggestion,
        )

    /**
     * Create type error
     */
    fun createTypeError(
        expectedType: String,
        actualType: String,
        variableName: String? = null,
        message: String? = null,
        suggestion: String? = null,
    ): JupyterJsError.TypeError =
        JupyterJsError.TypeError(
            expectedType = expectedType,
            actualType = actualType,
            variableName = variableName,
            message = message ?: "Type mismatch: expected $expectedType, got $actualType",
            suggestion = suggestion,
        )

    /**
     * Create network error
     */
    fun createNetworkError(
        url: String,
        statusCode: Int? = null,
        reason: String? = null,
        message: String? = null,
        suggestion: String? = null,
    ): JupyterJsError.NetworkError =
        JupyterJsError.NetworkError(
            url = url,
            statusCode = statusCode,
            reason = reason,
            message = message ?: "Network request failed: $url",
            suggestion = suggestion,
        )

    /**
     * Create variable not found error
     */
    fun createVariableNotFoundError(
        variableName: String,
        availableVariables: List<String> = emptyList(),
        message: String? = null,
        suggestion: String? = null,
    ): JupyterJsError.VariableNotFoundError {
        val suggestionText =
            suggestion ?: if (availableVariables.isNotEmpty()) {
                "Available variables: ${availableVariables.take(5).joinToString(", ")}${if (availableVariables.size > 5) "..." else ""}"
            } else {
                "Please ensure the variable is properly defined"
            }

        return JupyterJsError.VariableNotFoundError(
            variableName = variableName,
            availableVariables = availableVariables,
            message = message ?: "Variable '$variableName' not found",
            suggestion = suggestionText,
        )
    }

    /**
     * Create compilation error
     */
    fun createCompilationError(
        language: String,
        details: String? = null,
        message: String? = null,
        suggestion: String? = null,
    ): JupyterJsError.CompilationError =
        JupyterJsError.CompilationError(
            language = language,
            details = details,
            message = message ?: "$language compilation failed",
            suggestion = suggestion ?: "Please check if the $language syntax is correct",
        )
}
