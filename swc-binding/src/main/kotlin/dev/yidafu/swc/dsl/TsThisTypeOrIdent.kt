package dev.yidafu.swc.dsl

import dev.yidafu.swc.types.*

/**
 * subtype of TsThisTypeOrIdent
 */
fun TsThisTypeOrIdent.tsThisType(block: TsThisType.() -> Unit): TsThisType {
    return TsThisTypeImpl().apply(block)
}

/**
 * subtype of TsThisTypeOrIdent
 */
fun TsThisTypeOrIdent.identifier(block: Identifier.() -> Unit): Identifier {
    return IdentifierImpl().apply(block)
}
