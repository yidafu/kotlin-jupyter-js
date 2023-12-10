package dev.yidafu.swc.dsl

import dev.yidafu.swc.types.*

/**
 * ObjectExpression#properties: Array<Union.U2<SpreadElement, Property>>
 * extension function for create Array<Union.U2<SpreadElement, Property>> -> SpreadElementImpl
 */
fun ObjectExpression.spreadElement(block: SpreadElement.() -> Unit): SpreadElement {
    return SpreadElementImpl().apply(block)
}

/**
 * ObjectExpression#properties: Array<Union.U2<SpreadElement, Property>>
 * extension function for create Array<Union.U2<SpreadElement, Property>> -> IdentifierImpl
 */
fun ObjectExpression.identifier(block: Identifier.() -> Unit): Identifier {
    return IdentifierImpl().apply(block)
}

/**
 * ObjectExpression#properties: Array<Union.U2<SpreadElement, Property>>
 * extension function for create Array<Union.U2<SpreadElement, Property>> -> KeyValuePropertyImpl
 */
fun ObjectExpression.keyValueProperty(block: KeyValueProperty.() -> Unit): KeyValueProperty {
    return KeyValuePropertyImpl().apply(block)
}

/**
 * ObjectExpression#properties: Array<Union.U2<SpreadElement, Property>>
 * extension function for create Array<Union.U2<SpreadElement, Property>> -> AssignmentPropertyImpl
 */
fun ObjectExpression.assignmentProperty(block: AssignmentProperty.() -> Unit): AssignmentProperty {
    return AssignmentPropertyImpl().apply(block)
}

/**
 * ObjectExpression#properties: Array<Union.U2<SpreadElement, Property>>
 * extension function for create Array<Union.U2<SpreadElement, Property>> -> GetterPropertyImpl
 */
fun ObjectExpression.getterProperty(block: GetterProperty.() -> Unit): GetterProperty {
    return GetterPropertyImpl().apply(block)
}

/**
 * ObjectExpression#properties: Array<Union.U2<SpreadElement, Property>>
 * extension function for create Array<Union.U2<SpreadElement, Property>> -> SetterPropertyImpl
 */
fun ObjectExpression.setterProperty(block: SetterProperty.() -> Unit): SetterProperty {
    return SetterPropertyImpl().apply(block)
}

/**
 * ObjectExpression#properties: Array<Union.U2<SpreadElement, Property>>
 * extension function for create Array<Union.U2<SpreadElement, Property>> -> MethodPropertyImpl
 */
fun ObjectExpression.methodProperty(block: MethodProperty.() -> Unit): MethodProperty {
    return MethodPropertyImpl().apply(block)
}

fun ObjectExpression.span(block: Span.() -> Unit): Span {
    return Span().apply(block)
}
