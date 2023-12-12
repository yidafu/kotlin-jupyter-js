package dev.yidafu.swc.dsl

import dev.yidafu.swc.types.*

/**
 * TsInterfaceBody#body: Array<TsTypeElement>
 * extension function for create Array<TsTypeElement> -> TsCallSignatureDeclarationImpl
 */
fun TsInterfaceBody.tsCallSignatureDeclaration(block: TsCallSignatureDeclaration.() -> Unit): TsCallSignatureDeclaration {
    return TsCallSignatureDeclarationImpl().apply(block)
}

/**
 * TsInterfaceBody#body: Array<TsTypeElement>
 * extension function for create Array<TsTypeElement> -> TsConstructSignatureDeclarationImpl
 */
fun TsInterfaceBody.tsConstructSignatureDeclaration(block: TsConstructSignatureDeclaration.() -> Unit): TsConstructSignatureDeclaration {
    return TsConstructSignatureDeclarationImpl().apply(block)
}

/**
 * TsInterfaceBody#body: Array<TsTypeElement>
 * extension function for create Array<TsTypeElement> -> TsPropertySignatureImpl
 */
fun TsInterfaceBody.tsPropertySignature(block: TsPropertySignature.() -> Unit): TsPropertySignature {
    return TsPropertySignatureImpl().apply(block)
}

/**
 * TsInterfaceBody#body: Array<TsTypeElement>
 * extension function for create Array<TsTypeElement> -> TsGetterSignatureImpl
 */
fun TsInterfaceBody.tsGetterSignature(block: TsGetterSignature.() -> Unit): TsGetterSignature {
    return TsGetterSignatureImpl().apply(block)
}

/**
 * TsInterfaceBody#body: Array<TsTypeElement>
 * extension function for create Array<TsTypeElement> -> TsSetterSignatureImpl
 */
fun TsInterfaceBody.tsSetterSignature(block: TsSetterSignature.() -> Unit): TsSetterSignature {
    return TsSetterSignatureImpl().apply(block)
}

/**
 * TsInterfaceBody#body: Array<TsTypeElement>
 * extension function for create Array<TsTypeElement> -> TsMethodSignatureImpl
 */
fun TsInterfaceBody.tsMethodSignature(block: TsMethodSignature.() -> Unit): TsMethodSignature {
    return TsMethodSignatureImpl().apply(block)
}

/**
 * TsInterfaceBody#body: Array<TsTypeElement>
 * extension function for create Array<TsTypeElement> -> TsIndexSignatureImpl
 */
fun TsInterfaceBody.tsIndexSignature(block: TsIndexSignature.() -> Unit): TsIndexSignature {
    return TsIndexSignatureImpl().apply(block)
}

fun TsInterfaceBody.span(block: Span.() -> Unit): Span {
    return Span().apply(block)
}
