package dev.yidafu.swc.dsl

import dev.yidafu.swc.types.*

/**
 * TsImportEqualsDeclaration#moduleRef: TsModuleReference
 * extension function for create TsModuleReference -> IdentifierImpl
 */
fun TsImportEqualsDeclaration.identifier(block: Identifier.() -> Unit): Identifier {
    return IdentifierImpl().apply(block)
}

/**
 * TsImportEqualsDeclaration#moduleRef: TsModuleReference
 * extension function for create TsModuleReference -> TsQualifiedNameImpl
 */
fun TsImportEqualsDeclaration.tsQualifiedName(block: TsQualifiedName.() -> Unit): TsQualifiedName {
    return TsQualifiedNameImpl().apply(block)
}

/**
 * TsImportEqualsDeclaration#moduleRef: TsModuleReference
 * extension function for create TsModuleReference -> TsExternalModuleReferenceImpl
 */
fun TsImportEqualsDeclaration.tsExternalModuleReference(block: TsExternalModuleReference.() -> Unit): TsExternalModuleReference {
    return TsExternalModuleReferenceImpl().apply(block)
}

fun TsImportEqualsDeclaration.span(block: Span.() -> Unit): Span {
    return Span().apply(block)
}
