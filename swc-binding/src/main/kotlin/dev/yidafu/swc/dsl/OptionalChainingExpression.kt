package dev.yidafu.swc.dsl

import dev.yidafu.swc.types.*

fun OptionalChainingExpression.span(block: Span.() -> Unit): Span {
    return Span().apply(block)
}

/**
 * OptionalChainingExpression#base: Union.U2<MemberExpression, OptionalChainingCall>
 * extension function for create Union.U2<MemberExpression, OptionalChainingCall> -> MemberExpressionImpl
 */
fun OptionalChainingExpression.memberExpression(block: MemberExpression.() -> Unit): MemberExpression {
    return MemberExpressionImpl().apply(block)
}

/**
 * OptionalChainingExpression#base: Union.U2<MemberExpression, OptionalChainingCall>
 * extension function for create Union.U2<MemberExpression, OptionalChainingCall> -> OptionalChainingCallImpl
 */
fun OptionalChainingExpression.optionalChainingCall(block: OptionalChainingCall.() -> Unit): OptionalChainingCall {
    return OptionalChainingCallImpl().apply(block)
}
