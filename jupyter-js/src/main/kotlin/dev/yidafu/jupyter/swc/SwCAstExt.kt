@file:Suppress("ktlint:standard:no-wildcard-imports")

package dev.yidafu.jupyter.swc

import dev.yidafu.swc.generated.*

fun Module.forEachImportDeclaration(block: (importDeclaration: ImportDeclaration) -> Unit) {
    val bodyAlt = body ?: emptyArray()

    bodyAlt.forEach { moduleItem ->
        if (moduleItem is ImportDeclaration) {
            block(moduleItem)
        }
    }
}

// fun Module.forEachExportDeclaration(block: (importDeclaration: ExportDeclaration) -> Unit) {
//    val bodyAlt = body ?: emptyArray()
//
//    bodyAlt.forEach { moduleItem ->
//        if (moduleItem is ExportDeclaration) {
//            block(moduleItem)
//        }
//    }
// }

// fun Module.remove(sourceItem: ModuleItem) {
//    val newBody = mutableListOf<ModuleItem>()
//    body?.forEach {
//        if (it == sourceItem) {
//            newBody.add(it)
//        }
//    }
//
//    body = newBody.toTypedArray()
// }

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

// fun Module.appendAfter(
//    item: ModuleItem,
//    vararg appendItem: ModuleItem,
// ) {
//    val newBody = mutableListOf<ModuleItem>()
//    body?.forEach {
//        newBody.add(it)
//        if (it == item) {
//            appendItem.forEach { i ->
//                newBody.add(i)
//            }
//        }
//    }
//    body = newBody.toTypedArray()
// }

fun ModuleExportName?.getValue(): String? {
    if (this is Identifier) {
        return value
    }
    if (this is StringLiteral) {
        return value
    }
    return null
}

fun Program.addFirst(list: List<ModuleItem>) {
    if (this is Module) {
        val newBody = mutableListOf<ModuleItem>()
        newBody.addAll(list)
        body?.forEach {
            newBody.add(it)
        }
        body = newBody.toTypedArray()
    }
}
