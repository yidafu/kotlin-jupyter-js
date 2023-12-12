package dev.yidafu.swc.dsl

import dev.yidafu.swc.types.*

/**
 * BreakStatement#label: Identifier
 * extension function for create Identifier -> IdentifierImpl
 */
fun BreakStatement.identifier(block: Identifier.() -> Unit): Identifier {
    return IdentifierImpl().apply(block)
}

fun BreakStatement.span(block: Span.() -> Unit): Span {
    return Span().apply(block)
}
