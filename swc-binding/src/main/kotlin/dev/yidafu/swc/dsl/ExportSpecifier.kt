package dev.yidafu.swc.dsl

import dev.yidafu.swc.types.*

/**
 * subtype of ExportSpecifier
 */
fun ExportSpecifier.exportNamespaceSpecifier(block: ExportNamespaceSpecifier.() -> Unit): ExportNamespaceSpecifier {
    return ExportNamespaceSpecifierImpl().apply(block)
}

/**
 * subtype of ExportSpecifier
 */
fun ExportSpecifier.exportDefaultSpecifier(block: ExportDefaultSpecifier.() -> Unit): ExportDefaultSpecifier {
    return ExportDefaultSpecifierImpl().apply(block)
}

/**
 * subtype of ExportSpecifier
 */
fun ExportSpecifier.namedExportSpecifier(block: NamedExportSpecifier.() -> Unit): NamedExportSpecifier {
    return NamedExportSpecifierImpl().apply(block)
}
