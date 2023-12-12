package dev.yidafu.swc.dsl

import dev.yidafu.swc.types.*

/**
 * TsTypeQuery#exprName: TsTypeQueryExpr
 * extension function for create TsTypeQueryExpr -> TsQualifiedNameImpl
 */
fun TsTypeQuery.tsQualifiedName(block: TsQualifiedName.() -> Unit): TsQualifiedName {
    return TsQualifiedNameImpl().apply(block)
}

/**
 * TsTypeQuery#exprName: TsTypeQueryExpr
 * extension function for create TsTypeQueryExpr -> IdentifierImpl
 */
fun TsTypeQuery.identifier(block: Identifier.() -> Unit): Identifier {
    return IdentifierImpl().apply(block)
}

/**
 * TsTypeQuery#exprName: TsTypeQueryExpr
 * extension function for create TsTypeQueryExpr -> TsImportTypeImpl
 */
fun TsTypeQuery.tsImportType(block: TsImportType.() -> Unit): TsImportType {
    return TsImportTypeImpl().apply(block)
}

/**
 * TsTypeQuery#typeArguments: TsTypeParameterInstantiation
 * extension function for create TsTypeParameterInstantiation -> TsTypeParameterInstantiationImpl
 */
fun TsTypeQuery.tsTypeParameterInstantiation(block: TsTypeParameterInstantiation.() -> Unit): TsTypeParameterInstantiation {
    return TsTypeParameterInstantiationImpl().apply(block)
}

fun TsTypeQuery.span(block: Span.() -> Unit): Span {
    return Span().apply(block)
}
