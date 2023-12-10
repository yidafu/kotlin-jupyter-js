package dev.yidafu.swc.dsl

import dev.yidafu.swc.types.*

/**
 * subtype of JSXElementName
 */
fun JSXElementName.identifier(block: Identifier.() -> Unit): Identifier {
    return IdentifierImpl().apply(block)
}

/**
 * subtype of JSXElementName
 */
fun JSXElementName.jSXMemberExpression(block: JSXMemberExpression.() -> Unit): JSXMemberExpression {
    return JSXMemberExpressionImpl().apply(block)
}

/**
 * subtype of JSXElementName
 */
fun JSXElementName.jSXNamespacedName(block: JSXNamespacedName.() -> Unit): JSXNamespacedName {
    return JSXNamespacedNameImpl().apply(block)
}
