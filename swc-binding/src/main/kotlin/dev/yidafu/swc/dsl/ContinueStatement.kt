package dev.yidafu.swc.dsl

import dev.yidafu.swc.types.*

/**
 * ContinueStatement#label: Identifier
 * extension function for create Identifier -> IdentifierImpl
 */
fun ContinueStatement.identifier(block: Identifier.() -> Unit): Identifier {
    return IdentifierImpl().apply(block)
}

fun ContinueStatement.span(block: Span.() -> Unit): Span {
    return Span().apply(block)
}
