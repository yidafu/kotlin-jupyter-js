package dev.yidafu.swc.dsl

import dev.yidafu.swc.types.*

/**
 * TsTypeReference#typeName: TsEntityName
 * extension function for create TsEntityName -> TsQualifiedNameImpl
 */
fun TsTypeReference.tsQualifiedName(block: TsQualifiedName.() -> Unit): TsQualifiedName {
    return TsQualifiedNameImpl().apply(block)
}

/**
 * TsTypeReference#typeName: TsEntityName
 * extension function for create TsEntityName -> IdentifierImpl
 */
fun TsTypeReference.identifier(block: Identifier.() -> Unit): Identifier {
    return IdentifierImpl().apply(block)
}

/**
 * TsTypeReference#typeParams: TsTypeParameterInstantiation
 * extension function for create TsTypeParameterInstantiation -> TsTypeParameterInstantiationImpl
 */
fun TsTypeReference.tsTypeParameterInstantiation(block: TsTypeParameterInstantiation.() -> Unit): TsTypeParameterInstantiation {
    return TsTypeParameterInstantiationImpl().apply(block)
}

fun TsTypeReference.span(block: Span.() -> Unit): Span {
    return Span().apply(block)
}
