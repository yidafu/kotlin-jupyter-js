package dev.yidafu.swc.dsl

import dev.yidafu.swc.types.*

/**
 * BindingIdentifier#typeAnnotation: TsTypeAnnotation
 * extension function for create TsTypeAnnotation -> TsTypeAnnotationImpl
 */
fun BindingIdentifier.tsTypeAnnotation(block: TsTypeAnnotation.() -> Unit): TsTypeAnnotation {
    return TsTypeAnnotationImpl().apply(block)
}

fun BindingIdentifier.span(block: Span.() -> Unit): Span {
    return Span().apply(block)
}
