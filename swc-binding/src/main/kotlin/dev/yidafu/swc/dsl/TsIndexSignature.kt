package dev.yidafu.swc.dsl

import dev.yidafu.swc.types.*

/**
 * TsIndexSignature#params: Array<TsFnParameter>
 * extension function for create Array<TsFnParameter> -> BindingIdentifierImpl
 */
fun TsIndexSignature.bindingIdentifier(block: BindingIdentifier.() -> Unit): BindingIdentifier {
    return BindingIdentifierImpl().apply(block)
}

/**
 * TsIndexSignature#params: Array<TsFnParameter>
 * extension function for create Array<TsFnParameter> -> ArrayPatternImpl
 */
fun TsIndexSignature.arrayPattern(block: ArrayPattern.() -> Unit): ArrayPattern {
    return ArrayPatternImpl().apply(block)
}

/**
 * TsIndexSignature#params: Array<TsFnParameter>
 * extension function for create Array<TsFnParameter> -> RestElementImpl
 */
fun TsIndexSignature.restElement(block: RestElement.() -> Unit): RestElement {
    return RestElementImpl().apply(block)
}

/**
 * TsIndexSignature#params: Array<TsFnParameter>
 * extension function for create Array<TsFnParameter> -> ObjectPatternImpl
 */
fun TsIndexSignature.objectPattern(block: ObjectPattern.() -> Unit): ObjectPattern {
    return ObjectPatternImpl().apply(block)
}

/**
 * TsIndexSignature#typeAnnotation: TsTypeAnnotation
 * extension function for create TsTypeAnnotation -> TsTypeAnnotationImpl
 */
fun TsIndexSignature.tsTypeAnnotation(block: TsTypeAnnotation.() -> Unit): TsTypeAnnotation {
    return TsTypeAnnotationImpl().apply(block)
}

fun TsIndexSignature.span(block: Span.() -> Unit): Span {
    return Span().apply(block)
}
