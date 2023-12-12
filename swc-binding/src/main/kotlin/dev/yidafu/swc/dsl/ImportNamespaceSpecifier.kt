package dev.yidafu.swc.dsl

import dev.yidafu.swc.types.*

/**
 * ImportNamespaceSpecifier#local: Identifier
 * extension function for create Identifier -> IdentifierImpl
 */
fun ImportNamespaceSpecifier.identifier(block: Identifier.() -> Unit): Identifier {
    return IdentifierImpl().apply(block)
}

fun ImportNamespaceSpecifier.span(block: Span.() -> Unit): Span {
    return Span().apply(block)
}
