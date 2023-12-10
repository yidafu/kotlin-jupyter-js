package dev.yidafu.swc.dsl

import dev.yidafu.swc.types.*

/**
 * subtype of TsEntityName
 */
fun TsEntityName.tsQualifiedName(block: TsQualifiedName.() -> Unit): TsQualifiedName {
    return TsQualifiedNameImpl().apply(block)
}

/**
 * subtype of TsEntityName
 */
fun TsEntityName.identifier(block: Identifier.() -> Unit): Identifier {
    return IdentifierImpl().apply(block)
}
