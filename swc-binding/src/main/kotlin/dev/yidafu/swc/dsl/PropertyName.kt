package dev.yidafu.swc.dsl

import dev.yidafu.swc.types.*

/**
 * subtype of PropertyName
 */
fun PropertyName.identifier(block: Identifier.() -> Unit): Identifier {
    return IdentifierImpl().apply(block)
}

/**
 * subtype of PropertyName
 */
fun PropertyName.stringLiteral(block: StringLiteral.() -> Unit): StringLiteral {
    return StringLiteralImpl().apply(block)
}

/**
 * subtype of PropertyName
 */
fun PropertyName.numericLiteral(block: NumericLiteral.() -> Unit): NumericLiteral {
    return NumericLiteralImpl().apply(block)
}

/**
 * subtype of PropertyName
 */
fun PropertyName.computedPropName(block: ComputedPropName.() -> Unit): ComputedPropName {
    return ComputedPropNameImpl().apply(block)
}

/**
 * subtype of PropertyName
 */
fun PropertyName.bigIntLiteral(block: BigIntLiteral.() -> Unit): BigIntLiteral {
    return BigIntLiteralImpl().apply(block)
}
