package dev.yidafu.swc.dsl

import dev.yidafu.swc.types.*

/**
 * MethodProperty#key: PropertyName
 * extension function for create PropertyName -> IdentifierImpl
 */
fun MethodProperty.identifier(block: Identifier.() -> Unit): Identifier {
    return IdentifierImpl().apply(block)
}

/**
 * MethodProperty#key: PropertyName
 * extension function for create PropertyName -> StringLiteralImpl
 */
fun MethodProperty.stringLiteral(block: StringLiteral.() -> Unit): StringLiteral {
    return StringLiteralImpl().apply(block)
}

/**
 * MethodProperty#key: PropertyName
 * extension function for create PropertyName -> NumericLiteralImpl
 */
fun MethodProperty.numericLiteral(block: NumericLiteral.() -> Unit): NumericLiteral {
    return NumericLiteralImpl().apply(block)
}

/**
 * MethodProperty#key: PropertyName
 * extension function for create PropertyName -> ComputedPropNameImpl
 */
fun MethodProperty.computedPropName(block: ComputedPropName.() -> Unit): ComputedPropName {
    return ComputedPropNameImpl().apply(block)
}

/**
 * MethodProperty#key: PropertyName
 * extension function for create PropertyName -> BigIntLiteralImpl
 */
fun MethodProperty.bigIntLiteral(block: BigIntLiteral.() -> Unit): BigIntLiteral {
    return BigIntLiteralImpl().apply(block)
}

/**
 * MethodProperty#params: Array<Param>
 * extension function for create Array<Param> -> ParamImpl
 */
fun MethodProperty.param(block: Param.() -> Unit): Param {
    return ParamImpl().apply(block)
}

/**
 * MethodProperty#body: BlockStatement
 * extension function for create BlockStatement -> BlockStatementImpl
 */
fun MethodProperty.blockStatement(block: BlockStatement.() -> Unit): BlockStatement {
    return BlockStatementImpl().apply(block)
}

/**
 * MethodProperty#typeParameters: TsTypeParameterDeclaration
 * extension function for create TsTypeParameterDeclaration -> TsTypeParameterDeclarationImpl
 */
fun MethodProperty.tsTypeParameterDeclaration(block: TsTypeParameterDeclaration.() -> Unit): TsTypeParameterDeclaration {
    return TsTypeParameterDeclarationImpl().apply(block)
}

/**
 * MethodProperty#returnType: TsTypeAnnotation
 * extension function for create TsTypeAnnotation -> TsTypeAnnotationImpl
 */
fun MethodProperty.tsTypeAnnotation(block: TsTypeAnnotation.() -> Unit): TsTypeAnnotation {
    return TsTypeAnnotationImpl().apply(block)
}

fun MethodProperty.span(block: Span.() -> Unit): Span {
    return Span().apply(block)
}

/**
 * MethodProperty#decorators: Array<Decorator>
 * extension function for create Array<Decorator> -> DecoratorImpl
 */
fun MethodProperty.decorator(block: Decorator.() -> Unit): Decorator {
    return DecoratorImpl().apply(block)
}
