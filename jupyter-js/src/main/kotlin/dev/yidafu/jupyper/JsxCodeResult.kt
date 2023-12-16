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
    private val jsCodeScriptModule: String
        get() = """
            <div id="$uuid"></div>
            <script type="module">
            function getCellRoot() { return document.getElementById("$uuid"); }
            import  { createRoot }  from "https://esm.sh/react-dom@18.2.0/client";
            import React from "https://esm.sh/react@18.2.0";

            $jsCode
            const root = createRoot(getCellRoot());
            root.render(React.createElement($JSX_DEFAULT_EXPORT_VARIABLE_NAME))
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
