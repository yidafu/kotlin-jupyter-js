package dev.yidafu.swc.dsl

import dev.yidafu.swc.types.*

/**
 * SuperPropExpression#obj: Super
 * extension function for create Super -> SuperImpl
 */
fun SuperPropExpression.jsSuper(block: Super.() -> Unit): Super {
    return SuperImpl().apply(block)
}

/**
 * SuperPropExpression#property: Union.U2<Identifier, ComputedPropName>
 * extension function for create Union.U2<Identifier, ComputedPropName> -> IdentifierImpl
 */
fun SuperPropExpression.identifier(block: Identifier.() -> Unit): Identifier {
    return IdentifierImpl().apply(block)
}

/**
 * SuperPropExpression#property: Union.U2<Identifier, ComputedPropName>
 * extension function for create Union.U2<Identifier, ComputedPropName> -> ComputedPropNameImpl
 */
fun SuperPropExpression.computedPropName(block: ComputedPropName.() -> Unit): ComputedPropName {
    return ComputedPropNameImpl().apply(block)
}

fun SuperPropExpression.span(block: Span.() -> Unit): Span {
    return Span().apply(block)
}
