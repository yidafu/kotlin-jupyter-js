package dev.yidafu.swc.dsl

import dev.yidafu.swc.types.*

/**
 * ObjectPattern#properties: Array<ObjectPatternProperty>
 * extension function for create Array<ObjectPatternProperty> -> KeyValuePatternPropertyImpl
 */
fun ObjectPattern.keyValuePatternProperty(block: KeyValuePatternProperty.() -> Unit): KeyValuePatternProperty {
    return KeyValuePatternPropertyImpl().apply(block)
}

/**
 * ObjectPattern#properties: Array<ObjectPatternProperty>
 * extension function for create Array<ObjectPatternProperty> -> AssignmentPatternPropertyImpl
 */
fun ObjectPattern.assignmentPatternProperty(block: AssignmentPatternProperty.() -> Unit): AssignmentPatternProperty {
    return AssignmentPatternPropertyImpl().apply(block)
}

/**
 * ObjectPattern#properties: Array<ObjectPatternProperty>
 * extension function for create Array<ObjectPatternProperty> -> RestElementImpl
 */
fun ObjectPattern.restElement(block: RestElement.() -> Unit): RestElement {
    return RestElementImpl().apply(block)
}

/**
 * ObjectPattern#typeAnnotation: TsTypeAnnotation
 * extension function for create TsTypeAnnotation -> TsTypeAnnotationImpl
 */
fun ObjectPattern.tsTypeAnnotation(block: TsTypeAnnotation.() -> Unit): TsTypeAnnotation {
    return TsTypeAnnotationImpl().apply(block)
}

fun ObjectPattern.span(block: Span.() -> Unit): Span {
    return Span().apply(block)
}
