package dev.yidafu.swc.dsl

import dev.yidafu.swc.types.*

/**
 * subtype of ImportSpecifier
 */
fun ImportSpecifier.namedImportSpecifier(block: NamedImportSpecifier.() -> Unit): NamedImportSpecifier {
    return NamedImportSpecifierImpl().apply(block)
}

/**
 * subtype of ImportSpecifier
 */
fun ImportSpecifier.importDefaultSpecifier(block: ImportDefaultSpecifier.() -> Unit): ImportDefaultSpecifier {
    return ImportDefaultSpecifierImpl().apply(block)
}

/**
 * subtype of ImportSpecifier
 */
fun ImportSpecifier.importNamespaceSpecifier(block: ImportNamespaceSpecifier.() -> Unit): ImportNamespaceSpecifier {
    return ImportNamespaceSpecifierImpl().apply(block)
}
