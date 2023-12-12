package dev.yidafu.swc.dsl

import dev.yidafu.swc.types.*

/**
 * JSXClosingElement#name: JSXElementName
 * extension function for create JSXElementName -> IdentifierImpl
 */
fun JSXClosingElement.identifier(block: Identifier.() -> Unit): Identifier {
    return IdentifierImpl().apply(block)
}

/**
 * JSXClosingElement#name: JSXElementName
 * extension function for create JSXElementName -> JSXMemberExpressionImpl
 */
fun JSXClosingElement.jSXMemberExpression(block: JSXMemberExpression.() -> Unit): JSXMemberExpression {
    return JSXMemberExpressionImpl().apply(block)
}

/**
 * JSXClosingElement#name: JSXElementName
 * extension function for create JSXElementName -> JSXNamespacedNameImpl
 */
fun JSXClosingElement.jSXNamespacedName(block: JSXNamespacedName.() -> Unit): JSXNamespacedName {
    return JSXNamespacedNameImpl().apply(block)
}

fun JSXClosingElement.span(block: Span.() -> Unit): Span {
    return Span().apply(block)
}
