package dev.yidafu.jupyter

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
     * Render to display result
     *
     * @param notebook Current notebook
     * @return Display result
     */
    override fun render(notebook: Notebook): DisplayResult {
        return htmlResult(jsCodeScriptModule)
    }
}
