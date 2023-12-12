package dev.yidafu.swc.dsl

import dev.yidafu.swc.types.*

/**
 * FunctionExpression#identifier: Identifier
 * extension function for create Identifier -> IdentifierImpl
 */
fun FunctionExpression.identifier(block: Identifier.() -> Unit): Identifier {
    return IdentifierImpl().apply(block)
}

/**
 * FunctionExpression#params: Array<Param>
 * extension function for create Array<Param> -> ParamImpl
 */
fun FunctionExpression.param(block: Param.() -> Unit): Param {
    return ParamImpl().apply(block)
}

/**
 * FunctionExpression#body: BlockStatement
 * extension function for create BlockStatement -> BlockStatementImpl
 */
fun FunctionExpression.blockStatement(block: BlockStatement.() -> Unit): BlockStatement {
    return BlockStatementImpl().apply(block)
}

/**
 * FunctionExpression#typeParameters: TsTypeParameterDeclaration
 * extension function for create TsTypeParameterDeclaration -> TsTypeParameterDeclarationImpl
 */
fun FunctionExpression.tsTypeParameterDeclaration(block: TsTypeParameterDeclaration.() -> Unit): TsTypeParameterDeclaration {
    return TsTypeParameterDeclarationImpl().apply(block)
}

/**
 * FunctionExpression#returnType: TsTypeAnnotation
 * extension function for create TsTypeAnnotation -> TsTypeAnnotationImpl
 */
fun FunctionExpression.tsTypeAnnotation(block: TsTypeAnnotation.() -> Unit): TsTypeAnnotation {
    return TsTypeAnnotationImpl().apply(block)
}

fun FunctionExpression.span(block: Span.() -> Unit): Span {
    return Span().apply(block)
}

/**
 * FunctionExpression#decorators: Array<Decorator>
 * extension function for create Array<Decorator> -> DecoratorImpl
 */
fun FunctionExpression.decorator(block: Decorator.() -> Unit): Decorator {
    return DecoratorImpl().apply(block)
}
