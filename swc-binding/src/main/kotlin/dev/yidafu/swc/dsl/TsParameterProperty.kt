package dev.yidafu.swc.dsl

import dev.yidafu.swc.types.*

/**
 * TsParameterProperty#param: TsParameterPropertyParameter
 * extension function for create TsParameterPropertyParameter -> BindingIdentifierImpl
 */
fun TsParameterProperty.bindingIdentifier(block: BindingIdentifier.() -> Unit): BindingIdentifier {
    return BindingIdentifierImpl().apply(block)
}

/**
 * TsParameterProperty#param: TsParameterPropertyParameter
 * extension function for create TsParameterPropertyParameter -> AssignmentPatternImpl
 */
fun TsParameterProperty.assignmentPattern(block: AssignmentPattern.() -> Unit): AssignmentPattern {
    return AssignmentPatternImpl().apply(block)
}

fun TsParameterProperty.span(block: Span.() -> Unit): Span {
    return Span().apply(block)
}

/**
 * TsParameterProperty#decorators: Array<Decorator>
 * extension function for create Array<Decorator> -> DecoratorImpl
 */
fun TsParameterProperty.decorator(block: Decorator.() -> Unit): Decorator {
    return DecoratorImpl().apply(block)
}
