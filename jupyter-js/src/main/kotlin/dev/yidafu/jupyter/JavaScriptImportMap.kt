package dev.yidafu.jupyter

import org.jetbrains.kotlinx.jupyter.api.DisplayResult
import org.jetbrains.kotlinx.jupyter.api.HTML
import org.jetbrains.kotlinx.jupyter.api.Notebook
import org.jetbrains.kotlinx.jupyter.api.Renderable

class JavaScriptImportMap(
    private val importmapPath: String = JAVASCRIPT_IMPORTMAP_FILE_NAME
) : Renderable{

    private fun getResourceFile(filepath: String): String {
        return JavaScriptImportMap::class.java.classLoader.getResource(filepath)?.readText() ?: ""
    }

    override fun render(notebook: Notebook): DisplayResult {
        val importmapJson = getResourceFile(importmapPath)
        return HTML("<script type='importmap'>$importmapJson</script>", )
    }
}