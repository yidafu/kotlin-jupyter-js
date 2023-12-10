package dev.yidafu.swc.dsl

import dev.yidafu.swc.types.*

/**
 * subtype of Fn
 */
fun Fn.functionDeclaration(block: FunctionDeclaration.() -> Unit): FunctionDeclaration {
    return FunctionDeclarationImpl().apply(block)
}

/**
 * subtype of Fn
 */
fun Fn.functionExpression(block: FunctionExpression.() -> Unit): FunctionExpression {
    return FunctionExpressionImpl().apply(block)
}

/**
 * subtype of Fn
 */
fun Fn.methodProperty(block: MethodProperty.() -> Unit): MethodProperty {
    return MethodPropertyImpl().apply(block)
}

/**
 * Fn#params: Array<Param>
 * extension function for create Array<Param> -> ParamImpl
 */
fun Fn.param(block: Param.() -> Unit): Param {
    return ParamImpl().apply(block)
}

/**
 * Fn#body: BlockStatement
 * extension function for create BlockStatement -> BlockStatementImpl
 */
fun Fn.blockStatement(block: BlockStatement.() -> Unit): BlockStatement {
    return BlockStatementImpl().apply(block)
}

/**
 * Fn#typeParameters: TsTypeParameterDeclaration
 * extension function for create TsTypeParameterDeclaration -> TsTypeParameterDeclarationImpl
 */
fun Fn.tsTypeParameterDeclaration(block: TsTypeParameterDeclaration.() -> Unit): TsTypeParameterDeclaration {
    return TsTypeParameterDeclarationImpl().apply(block)
}

/**
 * Fn#returnType: TsTypeAnnotation
 * extension function for create TsTypeAnnotation -> TsTypeAnnotationImpl
 */
fun Fn.tsTypeAnnotation(block: TsTypeAnnotation.() -> Unit): TsTypeAnnotation {
    return TsTypeAnnotationImpl().apply(block)
}

fun Fn.span(block: Span.() -> Unit): Span {
    return Span().apply(block)
}

/**
 * Fn#decorators: Array<Decorator>
 * extension function for create Array<Decorator> -> DecoratorImpl
 */
fun Fn.decorator(block: Decorator.() -> Unit): Decorator {
    return DecoratorImpl().apply(block)
}
