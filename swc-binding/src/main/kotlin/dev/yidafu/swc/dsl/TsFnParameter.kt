package dev.yidafu.swc.dsl

import dev.yidafu.swc.types.*

/**
 * subtype of TsFnParameter
 */
fun TsFnParameter.bindingIdentifier(block: BindingIdentifier.() -> Unit): BindingIdentifier {
    return BindingIdentifierImpl().apply(block)
}

/**
 * subtype of TsFnParameter
 */
fun TsFnParameter.arrayPattern(block: ArrayPattern.() -> Unit): ArrayPattern {
    return ArrayPatternImpl().apply(block)
}

/**
 * subtype of TsFnParameter
 */
fun TsFnParameter.restElement(block: RestElement.() -> Unit): RestElement {
    return RestElementImpl().apply(block)
}

/**
 * subtype of TsFnParameter
 */
fun TsFnParameter.objectPattern(block: ObjectPattern.() -> Unit): ObjectPattern {
    return ObjectPatternImpl().apply(block)
}
