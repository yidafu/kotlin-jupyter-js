package dev.yidafu.swc.dsl

import dev.yidafu.swc.types.*

/**
 * PrivateMethod#key: PrivateName
 * extension function for create PrivateName -> PrivateNameImpl
 */
fun PrivateMethod.privateName(block: PrivateName.() -> Unit): PrivateName {
    return PrivateNameImpl().apply(block)
}

/**
 * PrivateMethod#function: Fn
 * extension function for create Fn -> FunctionDeclarationImpl
 */
fun PrivateMethod.functionDeclaration(block: FunctionDeclaration.() -> Unit): FunctionDeclaration {
    return FunctionDeclarationImpl().apply(block)
}

/**
 * PrivateMethod#function: Fn
 * extension function for create Fn -> FunctionExpressionImpl
 */
fun PrivateMethod.functionExpression(block: FunctionExpression.() -> Unit): FunctionExpression {
    return FunctionExpressionImpl().apply(block)
}

/**
 * PrivateMethod#function: Fn
 * extension function for create Fn -> MethodPropertyImpl
 */
fun PrivateMethod.methodProperty(block: MethodProperty.() -> Unit): MethodProperty {
    return MethodPropertyImpl().apply(block)
}

fun PrivateMethod.span(block: Span.() -> Unit): Span {
    return Span().apply(block)
}
