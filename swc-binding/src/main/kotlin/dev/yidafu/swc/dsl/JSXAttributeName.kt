package dev.yidafu.swc.dsl

import dev.yidafu.swc.types.*

/**
 * subtype of JSXAttributeName
 */
fun JSXAttributeName.identifier(block: Identifier.() -> Unit): Identifier {
    return IdentifierImpl().apply(block)
}

/**
 * subtype of JSXAttributeName
 */
fun JSXAttributeName.jSXNamespacedName(block: JSXNamespacedName.() -> Unit): JSXNamespacedName {
    return JSXNamespacedNameImpl().apply(block)
}
