package dev.yidafu.swc.dsl

import dev.yidafu.swc.types.*

/**
 * subtype of PatternBase
 */
fun PatternBase.bindingIdentifier(block: BindingIdentifier.() -> Unit): BindingIdentifier {
    return BindingIdentifierImpl().apply(block)
}

/**
 * subtype of PatternBase
 */
fun PatternBase.arrayPattern(block: ArrayPattern.() -> Unit): ArrayPattern {
    return ArrayPatternImpl().apply(block)
}

/**
 * subtype of PatternBase
 */
fun PatternBase.objectPattern(block: ObjectPattern.() -> Unit): ObjectPattern {
    return ObjectPatternImpl().apply(block)
}

/**
 * subtype of PatternBase
 */
fun PatternBase.assignmentPattern(block: AssignmentPattern.() -> Unit): AssignmentPattern {
    return AssignmentPatternImpl().apply(block)
}

/**
 * subtype of PatternBase
 */
fun PatternBase.restElement(block: RestElement.() -> Unit): RestElement {
    return RestElementImpl().apply(block)
}

/**
 * PatternBase#typeAnnotation: TsTypeAnnotation
 * extension function for create TsTypeAnnotation -> TsTypeAnnotationImpl
 */
fun PatternBase.tsTypeAnnotation(block: TsTypeAnnotation.() -> Unit): TsTypeAnnotation {
    return TsTypeAnnotationImpl().apply(block)
}

fun PatternBase.span(block: Span.() -> Unit): Span {
    return Span().apply(block)
}
