package dev.yidafu.swc.dsl

import dev.yidafu.swc.types.*

/**
 * subtype of ClassMethodBase
 */
fun ClassMethodBase.classMethod(block: ClassMethod.() -> Unit): ClassMethod {
    return ClassMethodImpl().apply(block)
}

/**
 * subtype of ClassMethodBase
 */
fun ClassMethodBase.privateMethod(block: PrivateMethod.() -> Unit): PrivateMethod {
    return PrivateMethodImpl().apply(block)
}

/**
 * ClassMethodBase#function: Fn
 * extension function for create Fn -> FunctionDeclarationImpl
 */
fun ClassMethodBase.functionDeclaration(block: FunctionDeclaration.() -> Unit): FunctionDeclaration {
    return FunctionDeclarationImpl().apply(block)
}

/**
 * ClassMethodBase#function: Fn
 * extension function for create Fn -> FunctionExpressionImpl
 */
fun ClassMethodBase.functionExpression(block: FunctionExpression.() -> Unit): FunctionExpression {
    return FunctionExpressionImpl().apply(block)
}

/**
 * ClassMethodBase#function: Fn
 * extension function for create Fn -> MethodPropertyImpl
 */
fun ClassMethodBase.methodProperty(block: MethodProperty.() -> Unit): MethodProperty {
    return MethodPropertyImpl().apply(block)
}

fun ClassMethodBase.span(block: Span.() -> Unit): Span {
    return Span().apply(block)
}
