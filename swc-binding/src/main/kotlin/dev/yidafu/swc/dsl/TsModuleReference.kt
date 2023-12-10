package dev.yidafu.swc.dsl

import dev.yidafu.swc.types.*

/**
 * subtype of TsModuleReference
 */
fun TsModuleReference.tsQualifiedName(block: TsQualifiedName.() -> Unit): TsQualifiedName {
    return TsQualifiedNameImpl().apply(block)
}

/**
 * subtype of TsModuleReference
 */
fun TsModuleReference.identifier(block: Identifier.() -> Unit): Identifier {
    return IdentifierImpl().apply(block)
}

/**
 * subtype of TsModuleReference
 */
fun TsModuleReference.tsExternalModuleReference(block: TsExternalModuleReference.() -> Unit): TsExternalModuleReference {
    return TsExternalModuleReferenceImpl().apply(block)
}
