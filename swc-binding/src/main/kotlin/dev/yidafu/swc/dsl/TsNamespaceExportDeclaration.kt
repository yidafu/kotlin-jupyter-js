package dev.yidafu.swc.dsl

import dev.yidafu.swc.types.*

/**
 * TsNamespaceExportDeclaration#id: Identifier
 * extension function for create Identifier -> IdentifierImpl
 */
fun TsNamespaceExportDeclaration.identifier(block: Identifier.() -> Unit): Identifier {
    return IdentifierImpl().apply(block)
}

fun TsNamespaceExportDeclaration.span(block: Span.() -> Unit): Span {
    return Span().apply(block)
}
