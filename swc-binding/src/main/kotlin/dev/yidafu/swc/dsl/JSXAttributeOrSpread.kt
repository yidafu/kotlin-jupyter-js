package dev.yidafu.swc.dsl

import dev.yidafu.swc.types.*

/**
 * subtype of JSXAttributeOrSpread
 */
fun JSXAttributeOrSpread.jSXAttribute(block: JSXAttribute.() -> Unit): JSXAttribute {
    return JSXAttributeImpl().apply(block)
}

/**
 * subtype of JSXAttributeOrSpread
 */
fun JSXAttributeOrSpread.spreadElement(block: SpreadElement.() -> Unit): SpreadElement {
    return SpreadElementImpl().apply(block)
}
