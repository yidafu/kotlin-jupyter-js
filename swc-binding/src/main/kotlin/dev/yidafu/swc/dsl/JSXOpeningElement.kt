package dev.yidafu.swc.dsl

import dev.yidafu.swc.types.*

/**
 * JSXOpeningElement#name: JSXElementName
 * extension function for create JSXElementName -> IdentifierImpl
 */
fun JSXOpeningElement.identifier(block: Identifier.() -> Unit): Identifier {
    return IdentifierImpl().apply(block)
}

/**
 * JSXOpeningElement#name: JSXElementName
 * extension function for create JSXElementName -> JSXMemberExpressionImpl
 */
fun JSXOpeningElement.jSXMemberExpression(block: JSXMemberExpression.() -> Unit): JSXMemberExpression {
    return JSXMemberExpressionImpl().apply(block)
}

/**
 * JSXOpeningElement#name: JSXElementName
 * extension function for create JSXElementName -> JSXNamespacedNameImpl
 */
fun JSXOpeningElement.jSXNamespacedName(block: JSXNamespacedName.() -> Unit): JSXNamespacedName {
    return JSXNamespacedNameImpl().apply(block)
}

/**
 * JSXOpeningElement#attributes: Array<JSXAttributeOrSpread>
 * extension function for create Array<JSXAttributeOrSpread> -> JSXAttributeImpl
 */
fun JSXOpeningElement.jSXAttribute(block: JSXAttribute.() -> Unit): JSXAttribute {
    return JSXAttributeImpl().apply(block)
}

/**
 * JSXOpeningElement#attributes: Array<JSXAttributeOrSpread>
 * extension function for create Array<JSXAttributeOrSpread> -> SpreadElementImpl
 */
fun JSXOpeningElement.spreadElement(block: SpreadElement.() -> Unit): SpreadElement {
    return SpreadElementImpl().apply(block)
}

/**
 * JSXOpeningElement#typeArguments: TsTypeParameterInstantiation
 * extension function for create TsTypeParameterInstantiation -> TsTypeParameterInstantiationImpl
 */
fun JSXOpeningElement.tsTypeParameterInstantiation(block: TsTypeParameterInstantiation.() -> Unit): TsTypeParameterInstantiation {
    return TsTypeParameterInstantiationImpl().apply(block)
}

fun JSXOpeningElement.span(block: Span.() -> Unit): Span {
    return Span().apply(block)
}
