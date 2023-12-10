package dev.yidafu.swc.dsl

import dev.yidafu.swc.types.*

/**
 * subtype of JSXObject
 */
fun JSXObject.jSXMemberExpression(block: JSXMemberExpression.() -> Unit): JSXMemberExpression {
    return JSXMemberExpressionImpl().apply(block)
}

/**
 * subtype of JSXObject
 */
fun JSXObject.identifier(block: Identifier.() -> Unit): Identifier {
    return IdentifierImpl().apply(block)
}
