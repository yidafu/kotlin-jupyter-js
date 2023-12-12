package dev.yidafu.swc.dsl

import dev.yidafu.swc.types.*

/**
 * subtype of TsTypeQueryExpr
 */
fun TsTypeQueryExpr.tsQualifiedName(block: TsQualifiedName.() -> Unit): TsQualifiedName {
    return TsQualifiedNameImpl().apply(block)
}

/**
 * subtype of TsTypeQueryExpr
 */
fun TsTypeQueryExpr.identifier(block: Identifier.() -> Unit): Identifier {
    return IdentifierImpl().apply(block)
}

/**
 * subtype of TsTypeQueryExpr
 */
fun TsTypeQueryExpr.tsImportType(block: TsImportType.() -> Unit): TsImportType {
    return TsImportTypeImpl().apply(block)
}
