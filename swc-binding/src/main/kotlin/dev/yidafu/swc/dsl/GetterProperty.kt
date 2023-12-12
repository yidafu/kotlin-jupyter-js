package dev.yidafu.swc.dsl

import dev.yidafu.swc.types.*

/**
 * GetterProperty#typeAnnotation: TsTypeAnnotation
 * extension function for create TsTypeAnnotation -> TsTypeAnnotationImpl
 */
fun GetterProperty.tsTypeAnnotation(block: TsTypeAnnotation.() -> Unit): TsTypeAnnotation {
    return TsTypeAnnotationImpl().apply(block)
}

/**
 * GetterProperty#body: BlockStatement
 * extension function for create BlockStatement -> BlockStatementImpl
 */
fun GetterProperty.blockStatement(block: BlockStatement.() -> Unit): BlockStatement {
    return BlockStatementImpl().apply(block)
}

/**
 * GetterProperty#key: PropertyName
 * extension function for create PropertyName -> IdentifierImpl
 */
fun GetterProperty.identifier(block: Identifier.() -> Unit): Identifier {
    return IdentifierImpl().apply(block)
}

/**
 * GetterProperty#key: PropertyName
 * extension function for create PropertyName -> StringLiteralImpl
 */
fun GetterProperty.stringLiteral(block: StringLiteral.() -> Unit): StringLiteral {
    return StringLiteralImpl().apply(block)
}

/**
 * GetterProperty#key: PropertyName
 * extension function for create PropertyName -> NumericLiteralImpl
 */
fun GetterProperty.numericLiteral(block: NumericLiteral.() -> Unit): NumericLiteral {
    return NumericLiteralImpl().apply(block)
}

/**
 * GetterProperty#key: PropertyName
 * extension function for create PropertyName -> ComputedPropNameImpl
 */
fun GetterProperty.computedPropName(block: ComputedPropName.() -> Unit): ComputedPropName {
    return ComputedPropNameImpl().apply(block)
}

/**
 * GetterProperty#key: PropertyName
 * extension function for create PropertyName -> BigIntLiteralImpl
 */
fun GetterProperty.bigIntLiteral(block: BigIntLiteral.() -> Unit): BigIntLiteral {
    return BigIntLiteralImpl().apply(block)
}

fun GetterProperty.span(block: Span.() -> Unit): Span {
    return Span().apply(block)
}
