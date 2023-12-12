package dev.yidafu.swc.dsl

import dev.yidafu.swc.types.*

/**
 * FunctionDeclaration#identifier: Identifier
 * extension function for create Identifier -> IdentifierImpl
 */
fun FunctionDeclaration.identifier(block: Identifier.() -> Unit): Identifier {
    return IdentifierImpl().apply(block)
}

/**
 * FunctionDeclaration#params: Array<Param>
 * extension function for create Array<Param> -> ParamImpl
 */
fun FunctionDeclaration.param(block: Param.() -> Unit): Param {
    return ParamImpl().apply(block)
}

/**
 * FunctionDeclaration#body: BlockStatement
 * extension function for create BlockStatement -> BlockStatementImpl
 */
fun FunctionDeclaration.blockStatement(block: BlockStatement.() -> Unit): BlockStatement {
    return BlockStatementImpl().apply(block)
}

/**
 * FunctionDeclaration#typeParameters: TsTypeParameterDeclaration
 * extension function for create TsTypeParameterDeclaration -> TsTypeParameterDeclarationImpl
 */
fun FunctionDeclaration.tsTypeParameterDeclaration(block: TsTypeParameterDeclaration.() -> Unit): TsTypeParameterDeclaration {
    return TsTypeParameterDeclarationImpl().apply(block)
}

/**
 * FunctionDeclaration#returnType: TsTypeAnnotation
 * extension function for create TsTypeAnnotation -> TsTypeAnnotationImpl
 */
fun FunctionDeclaration.tsTypeAnnotation(block: TsTypeAnnotation.() -> Unit): TsTypeAnnotation {
    return TsTypeAnnotationImpl().apply(block)
}

fun FunctionDeclaration.span(block: Span.() -> Unit): Span {
    return Span().apply(block)
}

/**
 * FunctionDeclaration#decorators: Array<Decorator>
 * extension function for create Array<Decorator> -> DecoratorImpl
 */
fun FunctionDeclaration.decorator(block: Decorator.() -> Unit): Decorator {
    return DecoratorImpl().apply(block)
}
