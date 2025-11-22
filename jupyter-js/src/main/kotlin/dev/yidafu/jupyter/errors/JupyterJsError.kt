package dev.yidafu.jupyter.errors

/**
 * Structured error type system
 */
sealed class JupyterJsError(
    val code: String,
    open val message: String,
    open val suggestion: String? = null,
    val context: Map<String, String> = emptyMap(),
) {
    /**
     * Syntax error
     */
    data class SyntaxError(
        val line: Int? = null,
        val column: Int? = null,
        val source: String? = null,
        override val message: String,
        override val suggestion: String? = null,
    ) : JupyterJsError(
            code = "SYNTAX_ERROR",
            message = message,
            suggestion = suggestion,
            context =
                buildMap {
                    line?.let { put("line", it.toString()) }
                    column?.let { put("column", it.toString()) }
                    source?.let { put("source", it) }
                },
        )

    /**
     * Type error
     */
    data class TypeError(
        val expectedType: String,
        val actualType: String,
        val variableName: String? = null,
        override val message: String,
        override val suggestion: String? = null,
    ) : JupyterJsError(
            code = "TYPE_ERROR",
            message = message,
            suggestion = suggestion,
            context =
                mapOf(
                    "expectedType" to expectedType,
                    "actualType" to actualType,
                    "variableName" to (variableName ?: "unknown"),
                ),
        )

    /**
     * Network error
     */
    data class NetworkError(
        val url: String,
        val statusCode: Int? = null,
        val reason: String? = null,
        override val message: String,
        override val suggestion: String? = null,
    ) : JupyterJsError(
            code = "NETWORK_ERROR",
            message = message,
            suggestion = suggestion,
            context =
                buildMap {
                    put("url", url)
                    statusCode?.let { put("statusCode", it.toString()) }
                    reason?.let { put("reason", it) }
                },
        )

    /**
     * Variable not found error
     */
    data class VariableNotFoundError(
        val variableName: String,
        val availableVariables: List<String> = emptyList(),
        override val message: String,
        override val suggestion: String? = null,
    ) : JupyterJsError(
            code = "VARIABLE_NOT_FOUND",
            message = message,
            suggestion = suggestion,
            context =
                mapOf(
                    "variableName" to variableName,
                    "availableVariables" to availableVariables.joinToString(", "),
                ),
        )

    /**
     * Configuration error
     */
    data class ConfigurationError(
        val configKey: String,
        val configValue: String? = null,
        override val message: String,
        override val suggestion: String? = null,
    ) : JupyterJsError(
            code = "CONFIG_ERROR",
            message = message,
            suggestion = suggestion,
            context =
                buildMap {
                    put("configKey", configKey)
                    configValue?.let { put("configValue", it) }
                },
        )

    /**
     * Compilation error
     */
    data class CompilationError(
        val language: String,
        val details: String? = null,
        override val message: String,
        override val suggestion: String? = null,
    ) : JupyterJsError(
            code = "COMPILATION_ERROR",
            message = message,
            suggestion = suggestion,
            context =
                buildMap {
                    put("language", language)
                    details?.let { put("details", it) }
                },
        )

    /**
     * Unknown error
     */
    data class UnknownError(
        val originalException: String? = null,
        override val message: String,
        override val suggestion: String? = null,
    ) : JupyterJsError(
            code = "UNKNOWN_ERROR",
            message = message,
            suggestion = suggestion,
            context =
                buildMap {
                    originalException?.let { put("originalException", it) }
                },
        )
}
