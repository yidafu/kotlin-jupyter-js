package dev.yidafu.swc.dsl

import dev.yidafu.swc.types.*

/**
 * PrivateName#id: Identifier
 * extension function for create Identifier -> IdentifierImpl
 */
fun PrivateName.identifier(block: Identifier.() -> Unit): Identifier {
    return IdentifierImpl().apply(block)
}

fun PrivateName.span(block: Span.() -> Unit): Span {
    return Span().apply(block)
}
