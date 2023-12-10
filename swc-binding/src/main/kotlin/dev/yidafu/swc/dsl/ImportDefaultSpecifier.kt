package dev.yidafu.swc.dsl

import dev.yidafu.swc.types.*

/**
 * ImportDefaultSpecifier#local: Identifier
 * extension function for create Identifier -> IdentifierImpl
 */
fun ImportDefaultSpecifier.identifier(block: Identifier.() -> Unit): Identifier {
    return IdentifierImpl().apply(block)
}

fun ImportDefaultSpecifier.span(block: Span.() -> Unit): Span {
    return Span().apply(block)
}
