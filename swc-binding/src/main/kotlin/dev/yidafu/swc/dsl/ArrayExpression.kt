package dev.yidafu.swc.dsl

import dev.yidafu.swc.types.*

fun ArrayExpression.exprOrSpread(block: ExprOrSpread.() -> Unit): ExprOrSpread {
    return ExprOrSpread().apply(block)
}

fun ArrayExpression.span(block: Span.() -> Unit): Span {
    return Span().apply(block)
}
