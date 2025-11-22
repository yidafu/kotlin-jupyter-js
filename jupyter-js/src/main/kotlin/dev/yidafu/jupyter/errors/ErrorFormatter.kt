package dev.yidafu.jupyter.errors

import kotlinx.serialization.json.Json

/**
 * Error formatter that generates user-friendly HTML error messages
 */
object ErrorFormatter {
    private val json = Json { prettyPrint = true }

    /**
     * Convert error to HTML format
     */
    fun formatAsHtml(error: JupyterJsError): String {
        val errorType = getErrorTypeDisplayName(error)
        val errorIcon = getErrorIcon(error)
        val errorColor = getErrorColor(error)

        return """
                                                                                                                    <div style="
                                                                                                                        border: 1px solid $errorColor;
                                                                                                                        border-radius: 8px;
                                                                                                                        padding: 16px;
                                                                                                                        margin: 8px 0;
                                                                                                                        background: linear-gradient(135deg, ${errorColor}15, ${errorColor}05);
                                                                                                                        font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
                                                                                                                    ">
                                                                                                                        <div style="display: flex; align-items: center; margin-bottom: 12px;">
                                                                                                                            <span style="font-size: 20px; margin-right: 8px;">$errorIcon</span>
                                                                                                                            <h3 style="margin: 0; color: $errorColor; font-size: 16px;">
                                                                                                                                $errorType
                                                                                                                            </h3>
                                                                                                                            <span style="
                                                                                                                                margin-left: auto; 
                                                                                                                                background: $errorColor; 
                                                                                                                                color: white; 
                                                                                                                                padding: 2px 8px; 
                                                                                                                                border-radius: 12px; 
                                                                                                                                font-size: 12px; 
                                                                                                                                font-weight: bold;
                                                                                                                            ">
                                                                                                                                ${error.code}
                                                                                                                            </span>
                                                                                                                        </div>
                                                                                                                        
                                                                                                                        <div style="
                                                                                                                            background: #f8f9fa; 
                                                                                                                            border-left: 4px solid $errorColor; 
                                                                                                                            padding: 12px; 
                                                                                                                            margin: 8px 0; 
                                                                                                                            border-radius: 0 4px 4px 0;
                                                                                                                        ">
                                                                                                                            <p style="margin: 0; font-weight: 500; color: #333;">
                                                                                                                                ${error.message}
                                                                                                                            </p>
                                                                                                                        </div>
                                                                                                                        
                                                                                                                        ${if (error.suggestion != null) {
            """
                <div style="
                    background: #e3f2fd; 
                    border: 1px solid #2196f3; 
                    border-radius: 4px; 
                    padding: 12px; 
                    margin: 8px 0;
                ">
                    <strong style="color: #1976d2;">💡 Suggestion:</strong>
                    <p style="margin: 4px 0 0 0; color: #333;">
                        ${error.suggestion}
                    </p>
                </div>
                """
        } else {
            ""
        }}
                                                                                                                        
                                                                                                                        ${if (error.context
                .isNotEmpty()
        ) {
            """
                <details style="margin-top: 12px;">
                    <summary style="
                        cursor: pointer; 
                        font-weight: 500; 
                        color: #666; 
                        padding: 4px 0;
                    ">
                        🔍 Details
                    </summary>
                    <pre style="
                        background: #f5f5f5; 
                        padding: 8px; 
                        border-radius: 4px; 
                        margin: 8px 0 0 0; 
                        font-size: 12px; 
                        overflow-x: auto;
                    ">${formatContext(error.context)}</pre>
                </details>
                """
        } else {
            ""
        }}
                                                                                                                    </div>
            """.trimIndent()
    }

    /**
     * Convert error to JSON format (for debugging)
     */
    fun formatAsJson(error: JupyterJsError): String = json.encodeToString(error)

    private fun getErrorTypeDisplayName(error: JupyterJsError): String =
        when (error) {
            is JupyterJsError.SyntaxError -> "Syntax Error"
            is JupyterJsError.TypeError -> "Type Error"
            is JupyterJsError.NetworkError -> "Network Error"
            is JupyterJsError.VariableNotFoundError -> "Variable Not Found"
            is JupyterJsError.ConfigurationError -> "Configuration Error"
            is JupyterJsError.CompilationError -> "Compilation Error"
            is JupyterJsError.UnknownError -> "Unknown Error"
        }

    private fun getErrorIcon(error: JupyterJsError): String =
        when (error) {
            is JupyterJsError.SyntaxError -> "🔤"
            is JupyterJsError.TypeError -> "🔢"
            is JupyterJsError.NetworkError -> "🌐"
            is JupyterJsError.VariableNotFoundError -> "❓"
            is JupyterJsError.ConfigurationError -> "⚙️"
            is JupyterJsError.CompilationError -> "🔨"
            is JupyterJsError.UnknownError -> "❌"
        }

    private fun getErrorColor(error: JupyterJsError): String =
        when (error) {
            is JupyterJsError.SyntaxError -> "#ff9800"

            // Orange
            is JupyterJsError.TypeError -> "#f44336"

            // Red
            is JupyterJsError.NetworkError -> "#2196f3"

            // Blue
            is JupyterJsError.VariableNotFoundError -> "#9c27b0"

            // Purple
            is JupyterJsError.ConfigurationError -> "#607d8b"

            // Blue-gray
            is JupyterJsError.CompilationError -> "#ff5722"

            // Deep orange
            is JupyterJsError.UnknownError -> "#795548" // Brown
        }

    private fun formatContext(context: Map<String, String>): String =
        context.entries.joinToString("\n") { (key, value) ->
            "$key: $value"
        }
}
