package dev.yidafu.swc.dsl

import dev.yidafu.swc.types.*

/**
 * TsConstructorType#params: Array<TsFnParameter>
 * extension function for create Array<TsFnParameter> -> BindingIdentifierImpl
 */
fun TsConstructorType.bindingIdentifier(block: BindingIdentifier.() -> Unit): BindingIdentifier {
    return BindingIdentifierImpl().apply(block)
}

/**
 * TsConstructorType#params: Array<TsFnParameter>
 * extension function for create Array<TsFnParameter> -> ArrayPatternImpl
 */
fun TsConstructorType.arrayPattern(block: ArrayPattern.() -> Unit): ArrayPattern {
    return ArrayPatternImpl().apply(block)
}

/**
 * TsConstructorType#params: Array<TsFnParameter>
 * extension function for create Array<TsFnParameter> -> RestElementImpl
 */
fun TsConstructorType.restElement(block: RestElement.() -> Unit): RestElement {
    return RestElementImpl().apply(block)
}

/**
 * TsConstructorType#params: Array<TsFnParameter>
 * extension function for create Array<TsFnParameter> -> ObjectPatternImpl
 */
fun TsConstructorType.objectPattern(block: ObjectPattern.() -> Unit): ObjectPattern {
    return ObjectPatternImpl().apply(block)
}

/**
 * TsConstructorType#typeParams: TsTypeParameterDeclaration
 * extension function for create TsTypeParameterDeclaration -> TsTypeParameterDeclarationImpl
 */
fun TsConstructorType.tsTypeParameterDeclaration(block: TsTypeParameterDeclaration.() -> Unit): TsTypeParameterDeclaration {
    return TsTypeParameterDeclarationImpl().apply(block)
}

/**
 * TsConstructorType#typeAnnotation: TsTypeAnnotation
 * extension function for create TsTypeAnnotation -> TsTypeAnnotationImpl
 */
fun TsConstructorType.tsTypeAnnotation(block: TsTypeAnnotation.() -> Unit): TsTypeAnnotation {
    return TsTypeAnnotationImpl().apply(block)
}

fun TsConstructorType.span(block: Span.() -> Unit): Span {
    return Span().apply(block)
}
