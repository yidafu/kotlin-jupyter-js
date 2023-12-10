package dev.yidafu.swc.dsl

import dev.yidafu.swc.types.*

/**
 * TsExternalModuleReference#expression: StringLiteral
 * extension function for create StringLiteral -> StringLiteralImpl
 */
fun TsExternalModuleReference.stringLiteral(block: StringLiteral.() -> Unit): StringLiteral {
    return StringLiteralImpl().apply(block)
}

fun TsExternalModuleReference.span(block: Span.() -> Unit): Span {
    return Span().apply(block)
}
