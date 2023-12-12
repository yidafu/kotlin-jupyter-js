package dev.yidafu.swc.dsl

import dev.yidafu.swc.types.*

/**
 * ExportAllDeclaration#source: StringLiteral
 * extension function for create StringLiteral -> StringLiteralImpl
 */
fun ExportAllDeclaration.stringLiteral(block: StringLiteral.() -> Unit): StringLiteral {
    return StringLiteralImpl().apply(block)
}

/**
 * ExportAllDeclaration#asserts: ObjectExpression
 * extension function for create ObjectExpression -> ObjectExpressionImpl
 */
fun ExportAllDeclaration.objectExpression(block: ObjectExpression.() -> Unit): ObjectExpression {
    return ObjectExpressionImpl().apply(block)
}

fun ExportAllDeclaration.span(block: Span.() -> Unit): Span {
    return Span().apply(block)
}
