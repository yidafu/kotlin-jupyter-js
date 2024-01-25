package dev.yidafu.jupyper.swc

import dev.yidafu.swc.types.ImportDeclaration
import dev.yidafu.swc.types.Module
import dev.yidafu.swc.types.ModuleItem

fun Module.forEachImportDeclaration(block: (importDeclaration: ImportDeclaration) -> Unit) {
    val bodyAlt = body ?: emptyArray()

    bodyAlt.forEach{ moduleItem ->
        if (moduleItem is ImportDeclaration) {
            block(moduleItem)
        }
    }
}

fun Module.replace(sourceItem: ModuleItem, vararg targetItems: ModuleItem) {
    val newBody = mutableListOf<ModuleItem>()
    body?.forEach {
        if (it == sourceItem) {
            targetItems.forEach {t ->
                newBody.add(t)
            }
        } else {
            newBody.add(it)
        }
    }

    body = newBody.toTypedArray()
}