package dev.yidafu.jupyper

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

    private val reactImportStatement: String
        get() {
            val isReactImported = pattern.containsMatchIn(jsCode)
            return if (isReactImported) {
                ""
            } else {
                """import React from "${LibsMapping["react"]}";"""
            }
        }

    private val jsCodeScriptModule: String
        get() = """
<div id="$uuid"></div>
<script type="module">
function getCellRoot() { return document.getElementById("$uuid"); }
import  { createRoot }  from "${LibsMapping["react-dom"]}";
$reactImportStatement

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
