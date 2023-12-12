package dev.yidafu.swc.dsl

import dev.yidafu.swc.types.*

/**
 * TsCallSignatureDeclaration#params: Array<TsFnParameter>
 * extension function for create Array<TsFnParameter> -> BindingIdentifierImpl
 */
fun TsCallSignatureDeclaration.bindingIdentifier(block: BindingIdentifier.() -> Unit): BindingIdentifier {
    return BindingIdentifierImpl().apply(block)
}

/**
 * TsCallSignatureDeclaration#params: Array<TsFnParameter>
 * extension function for create Array<TsFnParameter> -> ArrayPatternImpl
 */
fun TsCallSignatureDeclaration.arrayPattern(block: ArrayPattern.() -> Unit): ArrayPattern {
    return ArrayPatternImpl().apply(block)
}

/**
 * TsCallSignatureDeclaration#params: Array<TsFnParameter>
 * extension function for create Array<TsFnParameter> -> RestElementImpl
 */
fun TsCallSignatureDeclaration.restElement(block: RestElement.() -> Unit): RestElement {
    return RestElementImpl().apply(block)
}

/**
 * TsCallSignatureDeclaration#params: Array<TsFnParameter>
 * extension function for create Array<TsFnParameter> -> ObjectPatternImpl
 */
fun TsCallSignatureDeclaration.objectPattern(block: ObjectPattern.() -> Unit): ObjectPattern {
    return ObjectPatternImpl().apply(block)
}

/**
 * TsCallSignatureDeclaration#typeAnnotation: TsTypeAnnotation
 * extension function for create TsTypeAnnotation -> TsTypeAnnotationImpl
 */
fun TsCallSignatureDeclaration.tsTypeAnnotation(block: TsTypeAnnotation.() -> Unit): TsTypeAnnotation {
    return TsTypeAnnotationImpl().apply(block)
}

/**
 * TsCallSignatureDeclaration#typeParams: TsTypeParameterDeclaration
 * extension function for create TsTypeParameterDeclaration -> TsTypeParameterDeclarationImpl
 */
fun TsCallSignatureDeclaration.tsTypeParameterDeclaration(block: TsTypeParameterDeclaration.() -> Unit): TsTypeParameterDeclaration {
    return TsTypeParameterDeclarationImpl().apply(block)
}

fun TsCallSignatureDeclaration.span(block: Span.() -> Unit): Span {
    return Span().apply(block)
}
