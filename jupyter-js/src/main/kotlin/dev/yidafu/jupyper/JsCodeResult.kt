package dev.yidafu.jupyper

import kotlinx.serialization.Serializable
import org.jetbrains.kotlinx.jupyter.api.DisplayResult
import org.jetbrains.kotlinx.jupyter.api.Notebook
import org.jetbrains.kotlinx.jupyter.api.Renderable
import org.jetbrains.kotlinx.jupyter.api.htmlResult
import java.util.UUID

@Serializable
class JsCodeResult(private val jsCode: String) : Renderable {
    val uuid: String by lazy {
        UUID.randomUUID().toString()
    }
    private val jsCodeScriptModule: String
        get() = """
            <div id="$uuid"></div>
            <script type="module">
            function getCellRoot() { return document.getElementById("$uuid"); }
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
