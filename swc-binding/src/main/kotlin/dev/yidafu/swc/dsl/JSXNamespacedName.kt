package dev.yidafu.swc.dsl

import dev.yidafu.swc.types.*

/**
 * JSXNamespacedName#name: Identifier
 * extension function for create Identifier -> IdentifierImpl
 */
fun JSXNamespacedName.identifier(block: Identifier.() -> Unit): Identifier {
    return IdentifierImpl().apply(block)
}
