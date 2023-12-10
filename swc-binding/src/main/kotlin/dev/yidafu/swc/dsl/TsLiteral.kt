package dev.yidafu.swc.dsl

import dev.yidafu.swc.types.*

/**
 * subtype of TsLiteral
 */
fun TsLiteral.numericLiteral(block: NumericLiteral.() -> Unit): NumericLiteral {
    return NumericLiteralImpl().apply(block)
}

/**
 * subtype of TsLiteral
 */
fun TsLiteral.stringLiteral(block: StringLiteral.() -> Unit): StringLiteral {
    return StringLiteralImpl().apply(block)
}

/**
 * subtype of TsLiteral
 */
fun TsLiteral.booleanLiteral(block: BooleanLiteral.() -> Unit): BooleanLiteral {
    return BooleanLiteralImpl().apply(block)
}

/**
 * subtype of TsLiteral
 */
fun TsLiteral.bigIntLiteral(block: BigIntLiteral.() -> Unit): BigIntLiteral {
    return BigIntLiteralImpl().apply(block)
}

/**
 * subtype of TsLiteral
 */
fun TsLiteral.tsTemplateLiteralType(block: TsTemplateLiteralType.() -> Unit): TsTemplateLiteralType {
    return TsTemplateLiteralTypeImpl().apply(block)
}
