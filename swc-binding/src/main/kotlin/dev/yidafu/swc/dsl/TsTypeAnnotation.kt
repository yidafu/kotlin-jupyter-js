package dev.yidafu.swc.dsl

import dev.yidafu.swc.types.*

/**
 * TsTypeAnnotation#typeAnnotation: TsType
 * extension function for create TsType -> TsKeywordTypeImpl
 */
fun TsTypeAnnotation.tsKeywordType(block: TsKeywordType.() -> Unit): TsKeywordType {
    return TsKeywordTypeImpl().apply(block)
}

/**
 * TsTypeAnnotation#typeAnnotation: TsType
 * extension function for create TsType -> TsThisTypeImpl
 */
fun TsTypeAnnotation.tsThisType(block: TsThisType.() -> Unit): TsThisType {
    return TsThisTypeImpl().apply(block)
}

/**
 * TsTypeAnnotation#typeAnnotation: TsType
 * extension function for create TsType -> TsFunctionTypeImpl
 */
fun TsTypeAnnotation.tsFunctionType(block: TsFunctionType.() -> Unit): TsFunctionType {
    return TsFunctionTypeImpl().apply(block)
}

/**
 * TsTypeAnnotation#typeAnnotation: TsType
 * extension function for create TsType -> TsConstructorTypeImpl
 */
fun TsTypeAnnotation.tsConstructorType(block: TsConstructorType.() -> Unit): TsConstructorType {
    return TsConstructorTypeImpl().apply(block)
}

/**
 * TsTypeAnnotation#typeAnnotation: TsType
 * extension function for create TsType -> TsTypeReferenceImpl
 */
fun TsTypeAnnotation.tsTypeReference(block: TsTypeReference.() -> Unit): TsTypeReference {
    return TsTypeReferenceImpl().apply(block)
}

/**
 * TsTypeAnnotation#typeAnnotation: TsType
 * extension function for create TsType -> TsTypeQueryImpl
 */
fun TsTypeAnnotation.tsTypeQuery(block: TsTypeQuery.() -> Unit): TsTypeQuery {
    return TsTypeQueryImpl().apply(block)
}

/**
 * TsTypeAnnotation#typeAnnotation: TsType
 * extension function for create TsType -> TsTypeLiteralImpl
 */
fun TsTypeAnnotation.tsTypeLiteral(block: TsTypeLiteral.() -> Unit): TsTypeLiteral {
    return TsTypeLiteralImpl().apply(block)
}

/**
 * TsTypeAnnotation#typeAnnotation: TsType
 * extension function for create TsType -> TsArrayTypeImpl
 */
fun TsTypeAnnotation.tsArrayType(block: TsArrayType.() -> Unit): TsArrayType {
    return TsArrayTypeImpl().apply(block)
}

/**
 * TsTypeAnnotation#typeAnnotation: TsType
 * extension function for create TsType -> TsTupleTypeImpl
 */
fun TsTypeAnnotation.tsTupleType(block: TsTupleType.() -> Unit): TsTupleType {
    return TsTupleTypeImpl().apply(block)
}

/**
 * TsTypeAnnotation#typeAnnotation: TsType
 * extension function for create TsType -> TsOptionalTypeImpl
 */
fun TsTypeAnnotation.tsOptionalType(block: TsOptionalType.() -> Unit): TsOptionalType {
    return TsOptionalTypeImpl().apply(block)
}

/**
 * TsTypeAnnotation#typeAnnotation: TsType
 * extension function for create TsType -> TsRestTypeImpl
 */
fun TsTypeAnnotation.tsRestType(block: TsRestType.() -> Unit): TsRestType {
    return TsRestTypeImpl().apply(block)
}

/**
 * TsTypeAnnotation#typeAnnotation: TsType
 * extension function for create TsType -> TsUnionTypeImpl
 */
fun TsTypeAnnotation.tsUnionType(block: TsUnionType.() -> Unit): TsUnionType {
    return TsUnionTypeImpl().apply(block)
}

/**
 * TsTypeAnnotation#typeAnnotation: TsType
 * extension function for create TsType -> TsIntersectionTypeImpl
 */
fun TsTypeAnnotation.tsIntersectionType(block: TsIntersectionType.() -> Unit): TsIntersectionType {
    return TsIntersectionTypeImpl().apply(block)
}

/**
 * TsTypeAnnotation#typeAnnotation: TsType
 * extension function for create TsType -> TsConditionalTypeImpl
 */
fun TsTypeAnnotation.tsConditionalType(block: TsConditionalType.() -> Unit): TsConditionalType {
    return TsConditionalTypeImpl().apply(block)
}

/**
 * TsTypeAnnotation#typeAnnotation: TsType
 * extension function for create TsType -> TsInferTypeImpl
 */
fun TsTypeAnnotation.tsInferType(block: TsInferType.() -> Unit): TsInferType {
    return TsInferTypeImpl().apply(block)
}

/**
 * TsTypeAnnotation#typeAnnotation: TsType
 * extension function for create TsType -> TsParenthesizedTypeImpl
 */
fun TsTypeAnnotation.tsParenthesizedType(block: TsParenthesizedType.() -> Unit): TsParenthesizedType {
    return TsParenthesizedTypeImpl().apply(block)
}

/**
 * TsTypeAnnotation#typeAnnotation: TsType
 * extension function for create TsType -> TsTypeOperatorImpl
 */
fun TsTypeAnnotation.tsTypeOperator(block: TsTypeOperator.() -> Unit): TsTypeOperator {
    return TsTypeOperatorImpl().apply(block)
}

/**
 * TsTypeAnnotation#typeAnnotation: TsType
 * extension function for create TsType -> TsIndexedAccessTypeImpl
 */
fun TsTypeAnnotation.tsIndexedAccessType(block: TsIndexedAccessType.() -> Unit): TsIndexedAccessType {
    return TsIndexedAccessTypeImpl().apply(block)
}

/**
 * TsTypeAnnotation#typeAnnotation: TsType
 * extension function for create TsType -> TsMappedTypeImpl
 */
fun TsTypeAnnotation.tsMappedType(block: TsMappedType.() -> Unit): TsMappedType {
    return TsMappedTypeImpl().apply(block)
}

/**
 * TsTypeAnnotation#typeAnnotation: TsType
 * extension function for create TsType -> TsLiteralTypeImpl
 */
fun TsTypeAnnotation.tsLiteralType(block: TsLiteralType.() -> Unit): TsLiteralType {
    return TsLiteralTypeImpl().apply(block)
}

/**
 * TsTypeAnnotation#typeAnnotation: TsType
 * extension function for create TsType -> TsTypePredicateImpl
 */
fun TsTypeAnnotation.tsTypePredicate(block: TsTypePredicate.() -> Unit): TsTypePredicate {
    return TsTypePredicateImpl().apply(block)
}

/**
 * TsTypeAnnotation#typeAnnotation: TsType
 * extension function for create TsType -> TsImportTypeImpl
 */
fun TsTypeAnnotation.tsImportType(block: TsImportType.() -> Unit): TsImportType {
    return TsImportTypeImpl().apply(block)
}

fun TsTypeAnnotation.span(block: Span.() -> Unit): Span {
    return Span().apply(block)
}
