package dev.yidafu.swc.dsl

import dev.yidafu.swc.types.*

/**
 * ExportDefaultSpecifier#exported: Identifier
 * extension function for create Identifier -> IdentifierImpl
 */
fun ExportDefaultSpecifier.identifier(block: Identifier.() -> Unit): Identifier {
    return IdentifierImpl().apply(block)
}

fun ExportDefaultSpecifier.span(block: Span.() -> Unit): Span {
    return Span().apply(block)
}
