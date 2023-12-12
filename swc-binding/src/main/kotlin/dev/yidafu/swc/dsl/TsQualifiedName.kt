package dev.yidafu.swc.dsl

import dev.yidafu.swc.types.*

/**
 * TsQualifiedName#right: Identifier
 * extension function for create Identifier -> IdentifierImpl
 */
fun TsQualifiedName.identifier(block: Identifier.() -> Unit): Identifier {
    return IdentifierImpl().apply(block)
}
