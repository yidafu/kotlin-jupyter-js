package dev.yidafu.swc.dsl

import dev.yidafu.swc.types.*

/**
 * JSXAttribute#name: JSXAttributeName
 * extension function for create JSXAttributeName -> IdentifierImpl
 */
fun JSXAttribute.identifier(block: Identifier.() -> Unit): Identifier {
    return IdentifierImpl().apply(block)
}

/**
 * JSXAttribute#name: JSXAttributeName
 * extension function for create JSXAttributeName -> JSXNamespacedNameImpl
 */
fun JSXAttribute.jSXNamespacedName(block: JSXNamespacedName.() -> Unit): JSXNamespacedName {
    return JSXNamespacedNameImpl().apply(block)
}

/**
 * JSXAttribute#value: JSXAttrValue
 * extension function for create JSXAttrValue -> StringLiteralImpl
 */
fun JSXAttribute.stringLiteral(block: StringLiteral.() -> Unit): StringLiteral {
    return StringLiteralImpl().apply(block)
}

/**
 * JSXAttribute#value: JSXAttrValue
 * extension function for create JSXAttrValue -> BooleanLiteralImpl
 */
fun JSXAttribute.booleanLiteral(block: BooleanLiteral.() -> Unit): BooleanLiteral {
    return BooleanLiteralImpl().apply(block)
}

/**
 * JSXAttribute#value: JSXAttrValue
 * extension function for create JSXAttrValue -> NullLiteralImpl
 */
fun JSXAttribute.nullLiteral(block: NullLiteral.() -> Unit): NullLiteral {
    return NullLiteralImpl().apply(block)
}

/**
 * JSXAttribute#value: JSXAttrValue
 * extension function for create JSXAttrValue -> NumericLiteralImpl
 */
fun JSXAttribute.numericLiteral(block: NumericLiteral.() -> Unit): NumericLiteral {
    return NumericLiteralImpl().apply(block)
}

/**
 * JSXAttribute#value: JSXAttrValue
 * extension function for create JSXAttrValue -> BigIntLiteralImpl
 */
fun JSXAttribute.bigIntLiteral(block: BigIntLiteral.() -> Unit): BigIntLiteral {
    return BigIntLiteralImpl().apply(block)
}

/**
 * JSXAttribute#value: JSXAttrValue
 * extension function for create JSXAttrValue -> RegExpLiteralImpl
 */
fun JSXAttribute.regExpLiteral(block: RegExpLiteral.() -> Unit): RegExpLiteral {
    return RegExpLiteralImpl().apply(block)
}

/**
 * JSXAttribute#value: JSXAttrValue
 * extension function for create JSXAttrValue -> JSXTextImpl
 */
fun JSXAttribute.jSXText(block: JSXText.() -> Unit): JSXText {
    return JSXTextImpl().apply(block)
}

/**
 * JSXAttribute#value: JSXAttrValue
 * extension function for create JSXAttrValue -> JSXExpressionContainerImpl
 */
fun JSXAttribute.jSXExpressionContainer(block: JSXExpressionContainer.() -> Unit): JSXExpressionContainer {
    return JSXExpressionContainerImpl().apply(block)
}

/**
 * JSXAttribute#value: JSXAttrValue
 * extension function for create JSXAttrValue -> JSXElementImpl
 */
fun JSXAttribute.jSXElement(block: JSXElement.() -> Unit): JSXElement {
    return JSXElementImpl().apply(block)
}

/**
 * JSXAttribute#value: JSXAttrValue
 * extension function for create JSXAttrValue -> JSXFragmentImpl
 */
fun JSXAttribute.jSXFragment(block: JSXFragment.() -> Unit): JSXFragment {
    return JSXFragmentImpl().apply(block)
}

fun JSXAttribute.span(block: Span.() -> Unit): Span {
    return Span().apply(block)
}
