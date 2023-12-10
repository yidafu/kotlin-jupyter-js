package dev.yidafu.swc.dsl

import dev.yidafu.swc.types.*

/**
 * subtype of JSXAttrValue
 */
fun JSXAttrValue.stringLiteral(block: StringLiteral.() -> Unit): StringLiteral {
    return StringLiteralImpl().apply(block)
}

/**
 * subtype of JSXAttrValue
 */
fun JSXAttrValue.booleanLiteral(block: BooleanLiteral.() -> Unit): BooleanLiteral {
    return BooleanLiteralImpl().apply(block)
}

/**
 * subtype of JSXAttrValue
 */
fun JSXAttrValue.nullLiteral(block: NullLiteral.() -> Unit): NullLiteral {
    return NullLiteralImpl().apply(block)
}

/**
 * subtype of JSXAttrValue
 */
fun JSXAttrValue.numericLiteral(block: NumericLiteral.() -> Unit): NumericLiteral {
    return NumericLiteralImpl().apply(block)
}

/**
 * subtype of JSXAttrValue
 */
fun JSXAttrValue.bigIntLiteral(block: BigIntLiteral.() -> Unit): BigIntLiteral {
    return BigIntLiteralImpl().apply(block)
}

/**
 * subtype of JSXAttrValue
 */
fun JSXAttrValue.regExpLiteral(block: RegExpLiteral.() -> Unit): RegExpLiteral {
    return RegExpLiteralImpl().apply(block)
}

/**
 * subtype of JSXAttrValue
 */
fun JSXAttrValue.jSXText(block: JSXText.() -> Unit): JSXText {
    return JSXTextImpl().apply(block)
}

/**
 * subtype of JSXAttrValue
 */
fun JSXAttrValue.jSXExpressionContainer(block: JSXExpressionContainer.() -> Unit): JSXExpressionContainer {
    return JSXExpressionContainerImpl().apply(block)
}

/**
 * subtype of JSXAttrValue
 */
fun JSXAttrValue.jSXElement(block: JSXElement.() -> Unit): JSXElement {
    return JSXElementImpl().apply(block)
}

/**
 * subtype of JSXAttrValue
 */
fun JSXAttrValue.jSXFragment(block: JSXFragment.() -> Unit): JSXFragment {
    return JSXFragmentImpl().apply(block)
}
