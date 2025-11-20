package dev.yidafu.jupyter

import org.jetbrains.kotlinx.jupyter.api.libraries.JupyterIntegration
import org.jetbrains.kotlinx.jupyter.repl.result.EvalResultEx
import org.jetbrains.kotlinx.jupyter.testkit.JupyterReplTestCase

/**
 * Jupyter test utility class
 *
 * Provides helper methods and extension functions for Jupyter testing
 */

/**
 * Execute code and return result
 *
 * This is a convenience wrapper function for execEx that returns the rendered value
 *
 * @param code Code to execute
 * @return Execution result (rendered value)
 */
fun JupyterReplTestCase.exec(code: String): Any? {
    val result = this.execEx(code)
    return if (result is EvalResultEx.Success) {
        result.renderedValue
    } else {
        null
    }
}

/**
 * Execute test code block in library context
 *
 * This method is used to initialize Jupyter library and execute test code in tests.
 * It initializes the library through USE block, then executes the test code block.
 *
 * Usage:
 * ```kotlin
 * withLibrary(KotlinKernelJsMagicSupport()) {
 *     val result = exec("%js console.log('Hello')")
 *     // Execute test assertions
 * }
 * ```
 *
 * @param library JupyterIntegration instance to initialize
 * @param block Test code block to execute in library context, receives JupyterReplTestCase as receiver
 */
inline fun <T : JupyterIntegration> JupyterReplTestCase.withLibrary(
    library: T,
    block: JupyterReplTestCase.() -> Unit,
) {
    // Initialize library through USE block
    // Library initialization logic is defined in JupyterIntegration.onLoaded()
    // Use addCodePreprocessor to register code preprocessors
        this.execEx(
        """
        USE {
            addCodePreprocessor(dev.yidafu.jupyter.JavaScriptMagicCodeProcessor(this.notebook));
        }
        """.trimIndent(),
    )

    try {
        // Execute test code block, this refers to JupyterReplTestCase instance
        // In the code block, methods like exec, execEx can be accessed
        block()
    } finally {
        // Optional: cleanup operations (if needed)
        // Note: JupyterReplTestCase creates a new REPL instance after each test
        // So manual cleanup is usually not needed
    }
}

