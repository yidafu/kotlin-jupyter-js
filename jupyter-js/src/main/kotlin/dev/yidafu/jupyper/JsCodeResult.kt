package dev.yidafu.jupyper

import kotlinx.serialization.Serializable
import org.jetbrains.kotlinx.jupyter.api.DisplayResult
import org.jetbrains.kotlinx.jupyter.api.Notebook
import org.jetbrains.kotlinx.jupyter.api.Renderable
import org.jetbrains.kotlinx.jupyter.api.htmlResult
import java.util.UUID

/**
 * JavaScript code execution result
 *
 * Wraps and renders JavaScript code execution results
 * Wraps JavaScript code in HTML and executes it in browser via script tag
 *
 * @param jsCode JavaScript code to execute (imports and dependencies already processed)
 */
@Serializable
class JsCodeResult(private val jsCode: String) : Renderable {
    /**
     * Unique identifier
     * Used to create unique container element in HTML, avoiding conflicts between multiple cells
     */
    val uuid: String by lazy {
        UUID.randomUUID().toString()
    }

    /**
     * Generates complete HTML module code
     *
     * Contains:
     * 1. A div container for JavaScript code output
     * 2. A script module containing:
     *    - getCellRoot() function: Gets root element of current cell with customizable width/height
     *    - User-written JavaScript code
     */
    private val jsCodeScriptModule: String
        get() = """
<div id="$uuid" style="width:100%;min-height:100px"></div>
<script type="module">
function getCellRoot(width = "100%", height = "100px") {
    var cellRoot = document.getElementById("$uuid");
    cellRoot.style = `width: ${'$'}{width};height: ${'$'}{height}`
    return cellRoot;
}
$jsCode
</script>
"""

    /**
     * Renders as display result
     *
     * Wraps JavaScript code in HTML format for display in Jupyter Notebook
     *
     * @param notebook Current Notebook instance
     * @return HTML formatted display result
     */
    override fun render(notebook: Notebook): DisplayResult {
        return htmlResult(jsCodeScriptModule)
    }
}
