package dev.yidafu.swc.dsl

import dev.yidafu.swc.types.*

/**
 * TsTypeLiteral#members: Array<TsTypeElement>
 * extension function for create Array<TsTypeElement> -> TsCallSignatureDeclarationImpl
 */
fun TsTypeLiteral.tsCallSignatureDeclaration(block: TsCallSignatureDeclaration.() -> Unit): TsCallSignatureDeclaration {
    return TsCallSignatureDeclarationImpl().apply(block)
}

/**
 * TsTypeLiteral#members: Array<TsTypeElement>
 * extension function for create Array<TsTypeElement> -> TsConstructSignatureDeclarationImpl
 */
fun TsTypeLiteral.tsConstructSignatureDeclaration(block: TsConstructSignatureDeclaration.() -> Unit): TsConstructSignatureDeclaration {
    return TsConstructSignatureDeclarationImpl().apply(block)
}

/**
 * TsTypeLiteral#members: Array<TsTypeElement>
 * extension function for create Array<TsTypeElement> -> TsPropertySignatureImpl
 */
fun TsTypeLiteral.tsPropertySignature(block: TsPropertySignature.() -> Unit): TsPropertySignature {
    return TsPropertySignatureImpl().apply(block)
}

/**
 * TsTypeLiteral#members: Array<TsTypeElement>
 * extension function for create Array<TsTypeElement> -> TsGetterSignatureImpl
 */
fun TsTypeLiteral.tsGetterSignature(block: TsGetterSignature.() -> Unit): TsGetterSignature {
    return TsGetterSignatureImpl().apply(block)
}

/**
 * TsTypeLiteral#members: Array<TsTypeElement>
 * extension function for create Array<TsTypeElement> -> TsSetterSignatureImpl
 */
fun TsTypeLiteral.tsSetterSignature(block: TsSetterSignature.() -> Unit): TsSetterSignature {
    return TsSetterSignatureImpl().apply(block)
}

/**
 * TsTypeLiteral#members: Array<TsTypeElement>
 * extension function for create Array<TsTypeElement> -> TsMethodSignatureImpl
 */
fun TsTypeLiteral.tsMethodSignature(block: TsMethodSignature.() -> Unit): TsMethodSignature {
    return TsMethodSignatureImpl().apply(block)
}

/**
 * TsTypeLiteral#members: Array<TsTypeElement>
 * extension function for create Array<TsTypeElement> -> TsIndexSignatureImpl
 */
fun TsTypeLiteral.tsIndexSignature(block: TsIndexSignature.() -> Unit): TsIndexSignature {
    return TsIndexSignatureImpl().apply(block)
}

fun TsTypeLiteral.span(block: Span.() -> Unit): Span {
    return Span().apply(block)
}
