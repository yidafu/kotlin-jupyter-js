package dev.yidafu.swc.dsl

import dev.yidafu.swc.types.*

/**
 * TsFunctionType#params: Array<TsFnParameter>
 * extension function for create Array<TsFnParameter> -> BindingIdentifierImpl
 */
fun TsFunctionType.bindingIdentifier(block: BindingIdentifier.() -> Unit): BindingIdentifier {
    return BindingIdentifierImpl().apply(block)
}

/**
 * TsFunctionType#params: Array<TsFnParameter>
 * extension function for create Array<TsFnParameter> -> ArrayPatternImpl
 */
fun TsFunctionType.arrayPattern(block: ArrayPattern.() -> Unit): ArrayPattern {
    return ArrayPatternImpl().apply(block)
}

/**
 * TsFunctionType#params: Array<TsFnParameter>
 * extension function for create Array<TsFnParameter> -> RestElementImpl
 */
fun TsFunctionType.restElement(block: RestElement.() -> Unit): RestElement {
    return RestElementImpl().apply(block)
}

/**
 * TsFunctionType#params: Array<TsFnParameter>
 * extension function for create Array<TsFnParameter> -> ObjectPatternImpl
 */
fun TsFunctionType.objectPattern(block: ObjectPattern.() -> Unit): ObjectPattern {
    return ObjectPatternImpl().apply(block)
}

/**
 * TsFunctionType#typeParams: TsTypeParameterDeclaration
 * extension function for create TsTypeParameterDeclaration -> TsTypeParameterDeclarationImpl
 */
fun TsFunctionType.tsTypeParameterDeclaration(block: TsTypeParameterDeclaration.() -> Unit): TsTypeParameterDeclaration {
    return TsTypeParameterDeclarationImpl().apply(block)
}

/**
 * TsFunctionType#typeAnnotation: TsTypeAnnotation
 * extension function for create TsTypeAnnotation -> TsTypeAnnotationImpl
 */
fun TsFunctionType.tsTypeAnnotation(block: TsTypeAnnotation.() -> Unit): TsTypeAnnotation {
    return TsTypeAnnotationImpl().apply(block)
}

fun TsFunctionType.span(block: Span.() -> Unit): Span {
    return Span().apply(block)
}
