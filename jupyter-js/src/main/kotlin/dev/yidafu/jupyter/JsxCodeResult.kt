package dev.yidafu.jupyter

import dev.yidafu.jupyter.JSX_DEFAULT_EXPORT_VARIABLE_NAME
import dev.yidafu.jupyter.libmapping.LibsMapping
import org.jetbrains.kotlinx.jupyter.api.DisplayResult
import org.jetbrains.kotlinx.jupyter.api.Notebook
import org.jetbrains.kotlinx.jupyter.api.Renderable
import org.jetbrains.kotlinx.jupyter.api.htmlResult
import java.util.UUID

/**
 * JSX code execution result
 *
 * Wraps and renders JSX/TSX code execution results
 * Automatically configures React environment, including:
 * 1. Importing React and ReactDOM
 * 2. Creating React Root
 * 3. Rendering default exported component
 *
 * @param jsCode JSX/TSX code to execute (already converted to JavaScript)
 */
class JsxCodeResult(
    private val jsCode: String,
) : Renderable {
    /**
     * Unique identifier
     * Used to create unique container element in HTML
     */
    private val uuid by lazy {
        UUID.randomUUID().toString()
    }

    /**
     * Detects if React is already imported in code
     * Used to avoid duplicate imports
     */
    private val pattern: Regex = """from\s+['"]react['"]""".toRegex()

    /**
     * React import statement
     * Returns empty string if React is already imported in code, otherwise returns import statement
     */
    private val reactImportStatement: String
        get() {
            val isReactImported = pattern.containsMatchIn(jsCode)
            return if (isReactImported) {
                ""
            } else {
                """import React from "${LibsMapping.default["react"]}";"""
            }
        }

    /**
     * Generates complete HTML module code
     *
     * Contains:
     * 1. A div container for React component rendering
     * 2. A script module containing:
     *    - getContainer() function: Gets container element of current cell
     *    - React and ReactDOM imports
     *    - User-written JSX code
     *    - React Root creation and component rendering logic
     *
     * Note: Code must have a default exported component variable (JSX_DEFAULT_EXPORT_VARIABLE_NAME)
     */
    private val jsCodeScriptModule: String
        get() =
            buildString {
                append("""<div id="$uuid" style="width:100%;min-height:100px"></div>""")
                append("""<script type="module">""")
                append(
                    $$"""
function getContainer(width = "100%", height = "100px") {
    var cellRoot = document.getElementById("$${uuid}");
    cellRoot.style = `width: ${width};height: ${height}`
    return cellRoot;
}
""",
                )
                append("""import  { createRoot }  from "${LibsMapping.default["react-dom"]}";""")
                append("\n")
                append(reactImportStatement)
                append("\n\n")
                append(jsCode)
                append("\n")
                append("const root = createRoot(getContainer());\n")
                append("root.render(React.createElement(${JSX_DEFAULT_EXPORT_VARIABLE_NAME}))")
                append("</script>")
            }

    /**
     * Renders as display result
     *
     * Wraps JSX code in HTML format for display in Jupyter Notebook
     * React component will be rendered into specified container
     *
     * @param notebook Current Notebook instance
     * @return HTML formatted display result
     */
    override fun render(notebook: Notebook): DisplayResult = htmlResult(jsCodeScriptModule)
}
