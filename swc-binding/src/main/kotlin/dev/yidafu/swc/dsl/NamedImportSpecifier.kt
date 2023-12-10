package dev.yidafu.swc.dsl

import dev.yidafu.swc.types.*

/**
 * NamedImportSpecifier#imported: ModuleExportName
 * extension function for create ModuleExportName -> IdentifierImpl
 */
fun NamedImportSpecifier.identifier(block: Identifier.() -> Unit): Identifier {
    return IdentifierImpl().apply(block)
}

/**
 * NamedImportSpecifier#imported: ModuleExportName
 * extension function for create ModuleExportName -> StringLiteralImpl
 */
fun NamedImportSpecifier.stringLiteral(block: StringLiteral.() -> Unit): StringLiteral {
    return StringLiteralImpl().apply(block)
}

fun NamedImportSpecifier.span(block: Span.() -> Unit): Span {
    return Span().apply(block)
}
