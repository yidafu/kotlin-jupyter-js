package dev.yidafu.swc.dsl

import dev.yidafu.swc.types.*

/**
 * subtype of PropBase
 */
fun PropBase.keyValueProperty(block: KeyValueProperty.() -> Unit): KeyValueProperty {
    return KeyValuePropertyImpl().apply(block)
}

/**
 * subtype of PropBase
 */
fun PropBase.getterProperty(block: GetterProperty.() -> Unit): GetterProperty {
    return GetterPropertyImpl().apply(block)
}

/**
 * subtype of PropBase
 */
fun PropBase.setterProperty(block: SetterProperty.() -> Unit): SetterProperty {
    return SetterPropertyImpl().apply(block)
}

/**
 * subtype of PropBase
 */
fun PropBase.methodProperty(block: MethodProperty.() -> Unit): MethodProperty {
    return MethodPropertyImpl().apply(block)
}

/**
 * PropBase#key: PropertyName
 * extension function for create PropertyName -> IdentifierImpl
 */
fun PropBase.identifier(block: Identifier.() -> Unit): Identifier {
    return IdentifierImpl().apply(block)
}

/**
 * PropBase#key: PropertyName
 * extension function for create PropertyName -> StringLiteralImpl
 */
fun PropBase.stringLiteral(block: StringLiteral.() -> Unit): StringLiteral {
    return StringLiteralImpl().apply(block)
}

/**
 * PropBase#key: PropertyName
 * extension function for create PropertyName -> NumericLiteralImpl
 */
fun PropBase.numericLiteral(block: NumericLiteral.() -> Unit): NumericLiteral {
    return NumericLiteralImpl().apply(block)
}

/**
 * PropBase#key: PropertyName
 * extension function for create PropertyName -> ComputedPropNameImpl
 */
fun PropBase.computedPropName(block: ComputedPropName.() -> Unit): ComputedPropName {
    return ComputedPropNameImpl().apply(block)
}

/**
 * PropBase#key: PropertyName
 * extension function for create PropertyName -> BigIntLiteralImpl
 */
fun PropBase.bigIntLiteral(block: BigIntLiteral.() -> Unit): BigIntLiteral {
    return BigIntLiteralImpl().apply(block)
}
