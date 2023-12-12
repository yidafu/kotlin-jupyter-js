package dev.yidafu.swc.dsl

import dev.yidafu.swc.types.*

/**
 * ExportNamespaceSpecifier#name: ModuleExportName
 * extension function for create ModuleExportName -> IdentifierImpl
 */
fun ExportNamespaceSpecifier.identifier(block: Identifier.() -> Unit): Identifier {
    return IdentifierImpl().apply(block)
}

/**
 * ExportNamespaceSpecifier#name: ModuleExportName
 * extension function for create ModuleExportName -> StringLiteralImpl
 */
fun ExportNamespaceSpecifier.stringLiteral(block: StringLiteral.() -> Unit): StringLiteral {
    return StringLiteralImpl().apply(block)
}

fun ExportNamespaceSpecifier.span(block: Span.() -> Unit): Span {
    return Span().apply(block)
}
