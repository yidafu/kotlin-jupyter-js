package dev.yidafu.swc.dsl

import dev.yidafu.swc.types.*

/**
 * subtype of JSXElementChild
 */
fun JSXElementChild.jSXText(block: JSXText.() -> Unit): JSXText {
    return JSXTextImpl().apply(block)
}

/**
 * subtype of JSXElementChild
 */
fun JSXElementChild.jSXExpressionContainer(block: JSXExpressionContainer.() -> Unit): JSXExpressionContainer {
    return JSXExpressionContainerImpl().apply(block)
}

/**
 * subtype of JSXElementChild
 */
fun JSXElementChild.jSXSpreadChild(block: JSXSpreadChild.() -> Unit): JSXSpreadChild {
    return JSXSpreadChildImpl().apply(block)
}

/**
 * subtype of JSXElementChild
 */
fun JSXElementChild.jSXElement(block: JSXElement.() -> Unit): JSXElement {
    return JSXElementImpl().apply(block)
}

/**
 * subtype of JSXElementChild
 */
fun JSXElementChild.jSXFragment(block: JSXFragment.() -> Unit): JSXFragment {
    return JSXFragmentImpl().apply(block)
}
