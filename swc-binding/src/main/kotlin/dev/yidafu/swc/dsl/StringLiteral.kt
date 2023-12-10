package dev.yidafu.swc.dsl

import dev.yidafu.swc.types.*

fun StringLiteral.span(block: Span.() -> Unit): Span {
    return Span().apply(block)
}
