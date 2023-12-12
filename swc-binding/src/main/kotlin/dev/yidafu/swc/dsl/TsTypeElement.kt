package dev.yidafu.swc.dsl

import dev.yidafu.swc.types.*

/**
 * subtype of TsTypeElement
 */
fun TsTypeElement.tsCallSignatureDeclaration(block: TsCallSignatureDeclaration.() -> Unit): TsCallSignatureDeclaration {
    return TsCallSignatureDeclarationImpl().apply(block)
}

/**
 * subtype of TsTypeElement
 */
fun TsTypeElement.tsConstructSignatureDeclaration(block: TsConstructSignatureDeclaration.() -> Unit): TsConstructSignatureDeclaration {
    return TsConstructSignatureDeclarationImpl().apply(block)
}

/**
 * subtype of TsTypeElement
 */
fun TsTypeElement.tsPropertySignature(block: TsPropertySignature.() -> Unit): TsPropertySignature {
    return TsPropertySignatureImpl().apply(block)
}

/**
 * subtype of TsTypeElement
 */
fun TsTypeElement.tsGetterSignature(block: TsGetterSignature.() -> Unit): TsGetterSignature {
    return TsGetterSignatureImpl().apply(block)
}

/**
 * subtype of TsTypeElement
 */
fun TsTypeElement.tsSetterSignature(block: TsSetterSignature.() -> Unit): TsSetterSignature {
    return TsSetterSignatureImpl().apply(block)
}

/**
 * subtype of TsTypeElement
 */
fun TsTypeElement.tsMethodSignature(block: TsMethodSignature.() -> Unit): TsMethodSignature {
    return TsMethodSignatureImpl().apply(block)
}

/**
 * subtype of TsTypeElement
 */
fun TsTypeElement.tsIndexSignature(block: TsIndexSignature.() -> Unit): TsIndexSignature {
    return TsIndexSignatureImpl().apply(block)
}
