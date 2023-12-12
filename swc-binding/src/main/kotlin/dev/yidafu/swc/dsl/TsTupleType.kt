package dev.yidafu.swc.dsl

import dev.yidafu.swc.types.*

/**
 * TsTupleType#elemTypes: Array<TsTupleElement>
 * extension function for create Array<TsTupleElement> -> TsTupleElementImpl
 */
fun TsTupleType.tsTupleElement(block: TsTupleElement.() -> Unit): TsTupleElement {
    return TsTupleElementImpl().apply(block)
}

fun TsTupleType.span(block: Span.() -> Unit): Span {
    return Span().apply(block)
}
