package dev.yidafu.swc.dsl

import dev.yidafu.swc.types.*

/**
 * JSXMemberExpression#property: Identifier
 * extension function for create Identifier -> IdentifierImpl
 */
fun JSXMemberExpression.identifier(block: Identifier.() -> Unit): Identifier {
    return IdentifierImpl().apply(block)
}
