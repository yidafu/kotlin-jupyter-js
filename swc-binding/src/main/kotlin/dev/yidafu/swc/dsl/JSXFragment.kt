package dev.yidafu.swc.dsl

import dev.yidafu.swc.types.*

/**
 * JSXFragment#opening: JSXOpeningFragment
 * extension function for create JSXOpeningFragment -> JSXOpeningFragmentImpl
 */
fun JSXFragment.jSXOpeningFragment(block: JSXOpeningFragment.() -> Unit): JSXOpeningFragment {
    return JSXOpeningFragmentImpl().apply(block)
}

/**
 * JSXFragment#children: Array<JSXElementChild>
 * extension function for create Array<JSXElementChild> -> JSXTextImpl
 */
fun JSXFragment.jSXText(block: JSXText.() -> Unit): JSXText {
    return JSXTextImpl().apply(block)
}

/**
 * JSXFragment#children: Array<JSXElementChild>
 * extension function for create Array<JSXElementChild> -> JSXExpressionContainerImpl
 */
fun JSXFragment.jSXExpressionContainer(block: JSXExpressionContainer.() -> Unit): JSXExpressionContainer {
    return JSXExpressionContainerImpl().apply(block)
}

/**
 * JSXFragment#children: Array<JSXElementChild>
 * extension function for create Array<JSXElementChild> -> JSXSpreadChildImpl
 */
fun JSXFragment.jSXSpreadChild(block: JSXSpreadChild.() -> Unit): JSXSpreadChild {
    return JSXSpreadChildImpl().apply(block)
}

/**
 * JSXFragment#children: Array<JSXElementChild>
 * extension function for create Array<JSXElementChild> -> JSXElementImpl
 */
fun JSXFragment.jSXElement(block: JSXElement.() -> Unit): JSXElement {
    return JSXElementImpl().apply(block)
}

/**
 * JSXFragment#closing: JSXClosingFragment
 * extension function for create JSXClosingFragment -> JSXClosingFragmentImpl
 */
fun JSXFragment.jSXClosingFragment(block: JSXClosingFragment.() -> Unit): JSXClosingFragment {
    return JSXClosingFragmentImpl().apply(block)
}

fun JSXFragment.span(block: Span.() -> Unit): Span {
    return Span().apply(block)
}
