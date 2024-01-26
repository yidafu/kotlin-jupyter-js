package dev.yidafu.jupyper.swc

import dev.yidafu.swc.types.*

fun Module.forEachImportDeclaration(block: (importDeclaration: ImportDeclaration) -> Unit) {
    val bodyAlt = body ?: emptyArray()

    bodyAlt.forEach { moduleItem ->
        if (moduleItem is ImportDeclaration) {
            block(moduleItem)
        }
    }
}

fun Module.forEachExportDeclaration(block: (importDeclaration: ExportDeclaration) -> Unit) {
    val bodyAlt = body ?: emptyArray()

    bodyAlt.forEach { moduleItem ->
        if (moduleItem is ExportDeclaration) {
            block(moduleItem)
        }
    }
}

fun Module.replace(
    sourceItem: ModuleItem,
    vararg targetItems: ModuleItem,
) {
    val newBody = mutableListOf<ModuleItem>()
    body?.forEach {
        if (it == sourceItem) {
            targetItems.forEach { t ->
                newBody.add(t)
            }
        } else {
            newBody.add(it)
        }
    }

    body = newBody.toTypedArray()
}

fun Module.appendAfter(item: ModuleItem, vararg appendItem: ModuleItem) {
    val newBody = mutableListOf<ModuleItem>()
    body?.forEach {
        newBody.add(it)
        if (it == item) {
            appendItem.forEach {i ->
                newBody.add(i)
            }
        }
    }
    body = newBody.toTypedArray()
}

fun ModuleExportName?.getValue(): String? {
    if (this is Identifier) {
        return value
    }
    if (this is StringLiteral) {
        return value
    }
    return null
}

