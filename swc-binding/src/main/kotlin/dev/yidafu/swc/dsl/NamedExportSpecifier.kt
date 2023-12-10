package dev.yidafu.swc.dsl

import dev.yidafu.swc.types.*

/**
 * NamedExportSpecifier#exported: ModuleExportName
 * extension function for create ModuleExportName -> IdentifierImpl
 */
fun NamedExportSpecifier.identifier(block: Identifier.() -> Unit): Identifier {
    return IdentifierImpl().apply(block)
}

/**
 * NamedExportSpecifier#exported: ModuleExportName
 * extension function for create ModuleExportName -> StringLiteralImpl
 */
fun NamedExportSpecifier.stringLiteral(block: StringLiteral.() -> Unit): StringLiteral {
    return StringLiteralImpl().apply(block)
}

fun NamedExportSpecifier.span(block: Span.() -> Unit): Span {
    return Span().apply(block)
}
