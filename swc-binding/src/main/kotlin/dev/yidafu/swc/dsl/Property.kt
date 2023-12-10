package dev.yidafu.swc.dsl

import dev.yidafu.swc.types.*

/**
 * subtype of Property
 */
fun Property.identifier(block: Identifier.() -> Unit): Identifier {
    return IdentifierImpl().apply(block)
}

/**
 * subtype of Property
 */
fun Property.keyValueProperty(block: KeyValueProperty.() -> Unit): KeyValueProperty {
    return KeyValuePropertyImpl().apply(block)
}

/**
 * subtype of Property
 */
fun Property.assignmentProperty(block: AssignmentProperty.() -> Unit): AssignmentProperty {
    return AssignmentPropertyImpl().apply(block)
}

/**
 * subtype of Property
 */
fun Property.getterProperty(block: GetterProperty.() -> Unit): GetterProperty {
    return GetterPropertyImpl().apply(block)
}

/**
 * subtype of Property
 */
fun Property.setterProperty(block: SetterProperty.() -> Unit): SetterProperty {
    return SetterPropertyImpl().apply(block)
}

/**
 * subtype of Property
 */
fun Property.methodProperty(block: MethodProperty.() -> Unit): MethodProperty {
    return MethodPropertyImpl().apply(block)
}
