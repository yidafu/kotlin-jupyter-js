package dev.yidafu.swc.dsl

import dev.yidafu.swc.types.*

/**
 * ClassMethod#key: PropertyName
 * extension function for create PropertyName -> IdentifierImpl
 */
fun ClassMethod.identifier(block: Identifier.() -> Unit): Identifier {
    return IdentifierImpl().apply(block)
}

/**
 * ClassMethod#key: PropertyName
 * extension function for create PropertyName -> StringLiteralImpl
 */
fun ClassMethod.stringLiteral(block: StringLiteral.() -> Unit): StringLiteral {
    return StringLiteralImpl().apply(block)
}

/**
 * ClassMethod#key: PropertyName
 * extension function for create PropertyName -> NumericLiteralImpl
 */
fun ClassMethod.numericLiteral(block: NumericLiteral.() -> Unit): NumericLiteral {
    return NumericLiteralImpl().apply(block)
}

/**
 * ClassMethod#key: PropertyName
 * extension function for create PropertyName -> ComputedPropNameImpl
 */
fun ClassMethod.computedPropName(block: ComputedPropName.() -> Unit): ComputedPropName {
    return ComputedPropNameImpl().apply(block)
}

/**
 * ClassMethod#key: PropertyName
 * extension function for create PropertyName -> BigIntLiteralImpl
 */
fun ClassMethod.bigIntLiteral(block: BigIntLiteral.() -> Unit): BigIntLiteral {
    return BigIntLiteralImpl().apply(block)
}

/**
 * ClassMethod#function: Fn
 * extension function for create Fn -> FunctionDeclarationImpl
 */
fun ClassMethod.functionDeclaration(block: FunctionDeclaration.() -> Unit): FunctionDeclaration {
    return FunctionDeclarationImpl().apply(block)
}

/**
 * ClassMethod#function: Fn
 * extension function for create Fn -> FunctionExpressionImpl
 */
fun ClassMethod.functionExpression(block: FunctionExpression.() -> Unit): FunctionExpression {
    return FunctionExpressionImpl().apply(block)
}

/**
 * ClassMethod#function: Fn
 * extension function for create Fn -> MethodPropertyImpl
 */
fun ClassMethod.methodProperty(block: MethodProperty.() -> Unit): MethodProperty {
    return MethodPropertyImpl().apply(block)
}

fun ClassMethod.span(block: Span.() -> Unit): Span {
    return Span().apply(block)
}
