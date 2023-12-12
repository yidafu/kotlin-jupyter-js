package dev.yidafu.swc.dsl

import dev.yidafu.swc.types.*

/**
 * subtype of ObjectPatternProperty
 */
fun ObjectPatternProperty.keyValuePatternProperty(block: KeyValuePatternProperty.() -> Unit): KeyValuePatternProperty {
    return KeyValuePatternPropertyImpl().apply(block)
}

/**
 * subtype of ObjectPatternProperty
 */
fun ObjectPatternProperty.assignmentPatternProperty(block: AssignmentPatternProperty.() -> Unit): AssignmentPatternProperty {
    return AssignmentPatternPropertyImpl().apply(block)
}

/**
 * subtype of ObjectPatternProperty
 */
fun ObjectPatternProperty.restElement(block: RestElement.() -> Unit): RestElement {
    return RestElementImpl().apply(block)
}
