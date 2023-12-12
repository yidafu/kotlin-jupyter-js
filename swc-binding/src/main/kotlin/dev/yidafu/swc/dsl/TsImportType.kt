package dev.yidafu.swc.dsl

import dev.yidafu.swc.types.*

/**
 * TsImportType#argument: StringLiteral
 * extension function for create StringLiteral -> StringLiteralImpl
 */
fun TsImportType.stringLiteral(block: StringLiteral.() -> Unit): StringLiteral {
    return StringLiteralImpl().apply(block)
}

/**
 * TsImportType#qualifier: TsEntityName
 * extension function for create TsEntityName -> TsQualifiedNameImpl
 */
fun TsImportType.tsQualifiedName(block: TsQualifiedName.() -> Unit): TsQualifiedName {
    return TsQualifiedNameImpl().apply(block)
}

/**
 * TsImportType#qualifier: TsEntityName
 * extension function for create TsEntityName -> IdentifierImpl
 */
fun TsImportType.identifier(block: Identifier.() -> Unit): Identifier {
    return IdentifierImpl().apply(block)
}

/**
 * TsImportType#typeArguments: TsTypeParameterInstantiation
 * extension function for create TsTypeParameterInstantiation -> TsTypeParameterInstantiationImpl
 */
fun TsImportType.tsTypeParameterInstantiation(block: TsTypeParameterInstantiation.() -> Unit): TsTypeParameterInstantiation {
    return TsTypeParameterInstantiationImpl().apply(block)
}

fun TsImportType.span(block: Span.() -> Unit): Span {
    return Span().apply(block)
}
