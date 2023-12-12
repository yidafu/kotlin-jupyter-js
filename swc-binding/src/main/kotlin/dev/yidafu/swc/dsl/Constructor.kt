package dev.yidafu.swc.dsl

import dev.yidafu.swc.types.*

/**
 * Constructor#key: PropertyName
 * extension function for create PropertyName -> IdentifierImpl
 */
fun Constructor.identifier(block: Identifier.() -> Unit): Identifier {
    return IdentifierImpl().apply(block)
}

/**
 * Constructor#key: PropertyName
 * extension function for create PropertyName -> StringLiteralImpl
 */
fun Constructor.stringLiteral(block: StringLiteral.() -> Unit): StringLiteral {
    return StringLiteralImpl().apply(block)
}

/**
 * Constructor#key: PropertyName
 * extension function for create PropertyName -> NumericLiteralImpl
 */
fun Constructor.numericLiteral(block: NumericLiteral.() -> Unit): NumericLiteral {
    return NumericLiteralImpl().apply(block)
}

/**
 * Constructor#key: PropertyName
 * extension function for create PropertyName -> ComputedPropNameImpl
 */
fun Constructor.computedPropName(block: ComputedPropName.() -> Unit): ComputedPropName {
    return ComputedPropNameImpl().apply(block)
}

/**
 * Constructor#key: PropertyName
 * extension function for create PropertyName -> BigIntLiteralImpl
 */
fun Constructor.bigIntLiteral(block: BigIntLiteral.() -> Unit): BigIntLiteral {
    return BigIntLiteralImpl().apply(block)
}

/**
 * Constructor#params: Array<Union.U2<TsParameterProperty, Param>>
 * extension function for create Array<Union.U2<TsParameterProperty, Param>> -> TsParameterPropertyImpl
 */
fun Constructor.tsParameterProperty(block: TsParameterProperty.() -> Unit): TsParameterProperty {
    return TsParameterPropertyImpl().apply(block)
}

/**
 * Constructor#params: Array<Union.U2<TsParameterProperty, Param>>
 * extension function for create Array<Union.U2<TsParameterProperty, Param>> -> ParamImpl
 */
fun Constructor.param(block: Param.() -> Unit): Param {
    return ParamImpl().apply(block)
}

/**
 * Constructor#body: BlockStatement
 * extension function for create BlockStatement -> BlockStatementImpl
 */
fun Constructor.blockStatement(block: BlockStatement.() -> Unit): BlockStatement {
    return BlockStatementImpl().apply(block)
}

fun Constructor.span(block: Span.() -> Unit): Span {
    return Span().apply(block)
}
