package dev.yidafu.jupyper

import org.jetbrains.kotlinx.jupyter.api.DisplayResult
import org.jetbrains.kotlinx.jupyter.api.Notebook
import org.jetbrains.kotlinx.jupyter.api.Renderable
import org.jetbrains.kotlinx.jupyter.api.htmlResult

class JsxCodeResult(private val jsCode: String) : Renderable {
    private val jsCodeScriptModule: String
        get() = """
            <script type="module">
            $jsCode
            </script>
        """.trimIndent()
    /**
     * Render to display result
     *
     * @param notebook Current notebook
     * @return Display result
     */
    override fun render(notebook: Notebook): DisplayResult {
        return htmlResult(jsCodeScriptModule)
    }
}