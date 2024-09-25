package dev.yidafu.jupyter

import org.jetbrains.kotlinx.jupyter.api.DisplayResult
import org.jetbrains.kotlinx.jupyter.api.Notebook
import org.jetbrains.kotlinx.jupyter.api.Renderable
import org.jetbrains.kotlinx.jupyter.api.htmlResult
import java.util.UUID

class JsxCodeResult(private val jsCode: String) : Renderable {
    private val uuid by lazy {
        UUID.randomUUID().toString()
    }
    private val pattern: Regex = """from\s+['"]react['"]""".toRegex()

    private val jsCodeScriptModule: String
        get() = """
<div id="$uuid" style="width:100%;min-height:100px"></div>
<script type="module">
function getCellRoot(width = "100%", height = "100px") {
    var cellRoot = document.getElementById("$uuid");
    cellRoot.style = `width: $\{width};height: $\{height}`
    return cellRoot;
}
import  { createRoot }  from "react-dom";
import React from "react";

$jsCode
const root = createRoot(getCellRoot());
root.render(React.createElement($JSX_DEFAULT_EXPORT_VARIABLE_NAME))
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
