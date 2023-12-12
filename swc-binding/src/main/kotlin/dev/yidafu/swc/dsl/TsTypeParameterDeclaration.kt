package dev.yidafu.swc.dsl

import dev.yidafu.swc.types.*

/**
 * TsTypeParameterDeclaration#parameters: Array<TsTypeParameter>
 * extension function for create Array<TsTypeParameter> -> TsTypeParameterImpl
 */
fun TsTypeParameterDeclaration.tsTypeParameter(block: TsTypeParameter.() -> Unit): TsTypeParameter {
    return TsTypeParameterImpl().apply(block)
}

fun TsTypeParameterDeclaration.span(block: Span.() -> Unit): Span {
    return Span().apply(block)
}
