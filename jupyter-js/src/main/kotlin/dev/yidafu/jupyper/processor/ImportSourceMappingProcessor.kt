package dev.yidafu.jupyper.processor

import dev.yidafu.jupyper.LibsMapping
import dev.yidafu.swc.types.ImportDeclaration
import dev.yidafu.swc.types.Module
import dev.yidafu.swc.types.Program

class ImportSourceMappingProcessor : JavaScriptProcessor {

    override fun process(program: Program, context: JavascriptProcessContext) {
        if (program is Module) {
            program.body?.filterIsInstance<ImportDeclaration>()?.forEach {
                val source = it.source?.value
                if (!source.isNullOrEmpty() && LibsMapping.containsKey(source)) {
                    val esmUrl = LibsMapping[source]
                    it.source!!.value = esmUrl
                    it.source!!.raw = "\"${esmUrl}\""
                }
            }
        }
    }
}
