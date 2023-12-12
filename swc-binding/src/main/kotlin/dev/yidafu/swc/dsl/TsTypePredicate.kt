package dev.yidafu.swc.dsl

import dev.yidafu.swc.types.*

/**
 * TsTypePredicate#paramName: TsThisTypeOrIdent
 * extension function for create TsThisTypeOrIdent -> TsThisTypeImpl
 */
fun TsTypePredicate.tsThisType(block: TsThisType.() -> Unit): TsThisType {
    return TsThisTypeImpl().apply(block)
}

/**
 * TsTypePredicate#paramName: TsThisTypeOrIdent
 * extension function for create TsThisTypeOrIdent -> IdentifierImpl
 */
fun TsTypePredicate.identifier(block: Identifier.() -> Unit): Identifier {
    return IdentifierImpl().apply(block)
}

/**
 * TsTypePredicate#typeAnnotation: TsTypeAnnotation
 * extension function for create TsTypeAnnotation -> TsTypeAnnotationImpl
 */
fun TsTypePredicate.tsTypeAnnotation(block: TsTypeAnnotation.() -> Unit): TsTypeAnnotation {
    return TsTypeAnnotationImpl().apply(block)
}

fun TsTypePredicate.span(block: Span.() -> Unit): Span {
    return Span().apply(block)
}
