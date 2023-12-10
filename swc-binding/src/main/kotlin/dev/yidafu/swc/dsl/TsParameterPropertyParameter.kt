package dev.yidafu.swc.dsl

import dev.yidafu.swc.types.*

/**
 * subtype of TsParameterPropertyParameter
 */
fun TsParameterPropertyParameter.bindingIdentifier(block: BindingIdentifier.() -> Unit): BindingIdentifier {
    return BindingIdentifierImpl().apply(block)
}

/**
 * subtype of TsParameterPropertyParameter
 */
fun TsParameterPropertyParameter.assignmentPattern(block: AssignmentPattern.() -> Unit): AssignmentPattern {
    return AssignmentPatternImpl().apply(block)
}
