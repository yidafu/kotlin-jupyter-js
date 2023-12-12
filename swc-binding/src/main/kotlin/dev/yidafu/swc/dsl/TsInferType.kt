package dev.yidafu.swc.dsl

import dev.yidafu.swc.types.*

/**
 * TsInferType#typeParam: TsTypeParameter
 * extension function for create TsTypeParameter -> TsTypeParameterImpl
 */
fun TsInferType.tsTypeParameter(block: TsTypeParameter.() -> Unit): TsTypeParameter {
    return TsTypeParameterImpl().apply(block)
}

fun TsInferType.span(block: Span.() -> Unit): Span {
    return Span().apply(block)
}
