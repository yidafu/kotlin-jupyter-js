package dev.yidafu.swc.dsl

import dev.yidafu.swc.types.*

/**
 * JSXElement#opening: JSXOpeningElement
 * extension function for create JSXOpeningElement -> JSXOpeningElementImpl
 */
fun JSXElement.jSXOpeningElement(block: JSXOpeningElement.() -> Unit): JSXOpeningElement {
    return JSXOpeningElementImpl().apply(block)
}

/**
 * JSXElement#children: Array<JSXElementChild>
 * extension function for create Array<JSXElementChild> -> JSXTextImpl
 */
fun JSXElement.jSXText(block: JSXText.() -> Unit): JSXText {
    return JSXTextImpl().apply(block)
}

/**
 * JSXElement#children: Array<JSXElementChild>
 * extension function for create Array<JSXElementChild> -> JSXExpressionContainerImpl
 */
fun JSXElement.jSXExpressionContainer(block: JSXExpressionContainer.() -> Unit): JSXExpressionContainer {
    return JSXExpressionContainerImpl().apply(block)
}

/**
 * JSXElement#children: Array<JSXElementChild>
 * extension function for create Array<JSXElementChild> -> JSXSpreadChildImpl
 */
fun JSXElement.jSXSpreadChild(block: JSXSpreadChild.() -> Unit): JSXSpreadChild {
    return JSXSpreadChildImpl().apply(block)
}

/**
 * JSXElement#children: Array<JSXElementChild>
 * extension function for create Array<JSXElementChild> -> JSXFragmentImpl
 */
fun JSXElement.jSXFragment(block: JSXFragment.() -> Unit): JSXFragment {
    return JSXFragmentImpl().apply(block)
}

/**
 * JSXElement#closing: JSXClosingElement
 * extension function for create JSXClosingElement -> JSXClosingElementImpl
 */
fun JSXElement.jSXClosingElement(block: JSXClosingElement.() -> Unit): JSXClosingElement {
    return JSXClosingElementImpl().apply(block)
}

fun JSXElement.span(block: Span.() -> Unit): Span {
    return Span().apply(block)
}
