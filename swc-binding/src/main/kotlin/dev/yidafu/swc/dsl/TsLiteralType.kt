package dev.yidafu.swc.dsl

import dev.yidafu.swc.types.*

/**
 * TsLiteralType#literal: TsLiteral
 * extension function for create TsLiteral -> NumericLiteralImpl
 */
fun TsLiteralType.numericLiteral(block: NumericLiteral.() -> Unit): NumericLiteral {
    return NumericLiteralImpl().apply(block)
}

/**
 * TsLiteralType#literal: TsLiteral
 * extension function for create TsLiteral -> StringLiteralImpl
 */
fun TsLiteralType.stringLiteral(block: StringLiteral.() -> Unit): StringLiteral {
    return StringLiteralImpl().apply(block)
}

/**
 * TsLiteralType#literal: TsLiteral
 * extension function for create TsLiteral -> BooleanLiteralImpl
 */
fun TsLiteralType.booleanLiteral(block: BooleanLiteral.() -> Unit): BooleanLiteral {
    return BooleanLiteralImpl().apply(block)
}

/**
 * TsLiteralType#literal: TsLiteral
 * extension function for create TsLiteral -> BigIntLiteralImpl
 */
fun TsLiteralType.bigIntLiteral(block: BigIntLiteral.() -> Unit): BigIntLiteral {
    return BigIntLiteralImpl().apply(block)
}

/**
 * TsLiteralType#literal: TsLiteral
 * extension function for create TsLiteral -> TsTemplateLiteralTypeImpl
 */
fun TsLiteralType.tsTemplateLiteralType(block: TsTemplateLiteralType.() -> Unit): TsTemplateLiteralType {
    return TsTemplateLiteralTypeImpl().apply(block)
}

fun TsLiteralType.span(block: Span.() -> Unit): Span {
    return Span().apply(block)
}
