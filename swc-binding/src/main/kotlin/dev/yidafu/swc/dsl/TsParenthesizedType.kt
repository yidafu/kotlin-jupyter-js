package dev.yidafu.swc.dsl

import dev.yidafu.swc.types.*

/**
 * TsParenthesizedType#typeAnnotation: TsType
 * extension function for create TsType -> TsKeywordTypeImpl
 */
fun TsParenthesizedType.tsKeywordType(block: TsKeywordType.() -> Unit): TsKeywordType {
    return TsKeywordTypeImpl().apply(block)
}

/**
 * TsParenthesizedType#typeAnnotation: TsType
 * extension function for create TsType -> TsThisTypeImpl
 */
fun TsParenthesizedType.tsThisType(block: TsThisType.() -> Unit): TsThisType {
    return TsThisTypeImpl().apply(block)
}

/**
 * TsParenthesizedType#typeAnnotation: TsType
 * extension function for create TsType -> TsFunctionTypeImpl
 */
fun TsParenthesizedType.tsFunctionType(block: TsFunctionType.() -> Unit): TsFunctionType {
    return TsFunctionTypeImpl().apply(block)
}

/**
 * TsParenthesizedType#typeAnnotation: TsType
 * extension function for create TsType -> TsConstructorTypeImpl
 */
fun TsParenthesizedType.tsConstructorType(block: TsConstructorType.() -> Unit): TsConstructorType {
    return TsConstructorTypeImpl().apply(block)
}

/**
 * TsParenthesizedType#typeAnnotation: TsType
 * extension function for create TsType -> TsTypeReferenceImpl
 */
fun TsParenthesizedType.tsTypeReference(block: TsTypeReference.() -> Unit): TsTypeReference {
    return TsTypeReferenceImpl().apply(block)
}

/**
 * TsParenthesizedType#typeAnnotation: TsType
 * extension function for create TsType -> TsTypeQueryImpl
 */
fun TsParenthesizedType.tsTypeQuery(block: TsTypeQuery.() -> Unit): TsTypeQuery {
    return TsTypeQueryImpl().apply(block)
}

/**
 * TsParenthesizedType#typeAnnotation: TsType
 * extension function for create TsType -> TsTypeLiteralImpl
 */
fun TsParenthesizedType.tsTypeLiteral(block: TsTypeLiteral.() -> Unit): TsTypeLiteral {
    return TsTypeLiteralImpl().apply(block)
}

/**
 * TsParenthesizedType#typeAnnotation: TsType
 * extension function for create TsType -> TsArrayTypeImpl
 */
fun TsParenthesizedType.tsArrayType(block: TsArrayType.() -> Unit): TsArrayType {
    return TsArrayTypeImpl().apply(block)
}

/**
 * TsParenthesizedType#typeAnnotation: TsType
 * extension function for create TsType -> TsTupleTypeImpl
 */
fun TsParenthesizedType.tsTupleType(block: TsTupleType.() -> Unit): TsTupleType {
    return TsTupleTypeImpl().apply(block)
}

/**
 * TsParenthesizedType#typeAnnotation: TsType
 * extension function for create TsType -> TsOptionalTypeImpl
 */
fun TsParenthesizedType.tsOptionalType(block: TsOptionalType.() -> Unit): TsOptionalType {
    return TsOptionalTypeImpl().apply(block)
}

/**
 * TsParenthesizedType#typeAnnotation: TsType
 * extension function for create TsType -> TsRestTypeImpl
 */
fun TsParenthesizedType.tsRestType(block: TsRestType.() -> Unit): TsRestType {
    return TsRestTypeImpl().apply(block)
}

/**
 * TsParenthesizedType#typeAnnotation: TsType
 * extension function for create TsType -> TsUnionTypeImpl
 */
fun TsParenthesizedType.tsUnionType(block: TsUnionType.() -> Unit): TsUnionType {
    return TsUnionTypeImpl().apply(block)
}

/**
 * TsParenthesizedType#typeAnnotation: TsType
 * extension function for create TsType -> TsIntersectionTypeImpl
 */
fun TsParenthesizedType.tsIntersectionType(block: TsIntersectionType.() -> Unit): TsIntersectionType {
    return TsIntersectionTypeImpl().apply(block)
}

/**
 * TsParenthesizedType#typeAnnotation: TsType
 * extension function for create TsType -> TsConditionalTypeImpl
 */
fun TsParenthesizedType.tsConditionalType(block: TsConditionalType.() -> Unit): TsConditionalType {
    return TsConditionalTypeImpl().apply(block)
}

/**
 * TsParenthesizedType#typeAnnotation: TsType
 * extension function for create TsType -> TsInferTypeImpl
 */
fun TsParenthesizedType.tsInferType(block: TsInferType.() -> Unit): TsInferType {
    return TsInferTypeImpl().apply(block)
}

/**
 * TsParenthesizedType#typeAnnotation: TsType
 * extension function for create TsType -> TsTypeOperatorImpl
 */
fun TsParenthesizedType.tsTypeOperator(block: TsTypeOperator.() -> Unit): TsTypeOperator {
    return TsTypeOperatorImpl().apply(block)
}

/**
 * TsParenthesizedType#typeAnnotation: TsType
 * extension function for create TsType -> TsIndexedAccessTypeImpl
 */
fun TsParenthesizedType.tsIndexedAccessType(block: TsIndexedAccessType.() -> Unit): TsIndexedAccessType {
    return TsIndexedAccessTypeImpl().apply(block)
}

/**
 * TsParenthesizedType#typeAnnotation: TsType
 * extension function for create TsType -> TsMappedTypeImpl
 */
fun TsParenthesizedType.tsMappedType(block: TsMappedType.() -> Unit): TsMappedType {
    return TsMappedTypeImpl().apply(block)
}

/**
 * TsParenthesizedType#typeAnnotation: TsType
 * extension function for create TsType -> TsLiteralTypeImpl
 */
fun TsParenthesizedType.tsLiteralType(block: TsLiteralType.() -> Unit): TsLiteralType {
    return TsLiteralTypeImpl().apply(block)
}

/**
 * TsParenthesizedType#typeAnnotation: TsType
 * extension function for create TsType -> TsTypePredicateImpl
 */
fun TsParenthesizedType.tsTypePredicate(block: TsTypePredicate.() -> Unit): TsTypePredicate {
    return TsTypePredicateImpl().apply(block)
}

/**
 * TsParenthesizedType#typeAnnotation: TsType
 * extension function for create TsType -> TsImportTypeImpl
 */
fun TsParenthesizedType.tsImportType(block: TsImportType.() -> Unit): TsImportType {
    return TsImportTypeImpl().apply(block)
}

fun TsParenthesizedType.span(block: Span.() -> Unit): Span {
    return Span().apply(block)
}
