package dev.yidafu.swc.dsl

import dev.yidafu.swc.types.*

/**
 * subtype of Literal
 */
fun Literal.stringLiteral(block: StringLiteral.() -> Unit): StringLiteral {
    return StringLiteralImpl().apply(block)
}

/**
 * subtype of Literal
 */
fun Literal.booleanLiteral(block: BooleanLiteral.() -> Unit): BooleanLiteral {
    return BooleanLiteralImpl().apply(block)
}

/**
 * subtype of Literal
 */
fun Literal.nullLiteral(block: NullLiteral.() -> Unit): NullLiteral {
    return NullLiteralImpl().apply(block)
}

/**
 * subtype of Literal
 */
fun Literal.numericLiteral(block: NumericLiteral.() -> Unit): NumericLiteral {
    return NumericLiteralImpl().apply(block)
}

/**
 * subtype of Literal
 */
fun Literal.bigIntLiteral(block: BigIntLiteral.() -> Unit): BigIntLiteral {
    return BigIntLiteralImpl().apply(block)
}

/**
 * subtype of Literal
 */
fun Literal.regExpLiteral(block: RegExpLiteral.() -> Unit): RegExpLiteral {
    return RegExpLiteralImpl().apply(block)
}

/**
 * subtype of Literal
 */
fun Literal.jSXText(block: JSXText.() -> Unit): JSXText {
    return JSXTextImpl().apply(block)
}
