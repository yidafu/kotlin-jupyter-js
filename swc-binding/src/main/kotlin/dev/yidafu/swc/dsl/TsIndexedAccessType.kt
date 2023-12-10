package dev.yidafu.swc.dsl

import dev.yidafu.swc.types.*

/**
 * TsIndexedAccessType#indexType: TsType
 * extension function for create TsType -> TsKeywordTypeImpl
 */
fun TsIndexedAccessType.tsKeywordType(block: TsKeywordType.() -> Unit): TsKeywordType {
    return TsKeywordTypeImpl().apply(block)
}

/**
 * TsIndexedAccessType#indexType: TsType
 * extension function for create TsType -> TsThisTypeImpl
 */
fun TsIndexedAccessType.tsThisType(block: TsThisType.() -> Unit): TsThisType {
    return TsThisTypeImpl().apply(block)
}

/**
 * TsIndexedAccessType#indexType: TsType
 * extension function for create TsType -> TsFunctionTypeImpl
 */
fun TsIndexedAccessType.tsFunctionType(block: TsFunctionType.() -> Unit): TsFunctionType {
    return TsFunctionTypeImpl().apply(block)
}

/**
 * TsIndexedAccessType#indexType: TsType
 * extension function for create TsType -> TsConstructorTypeImpl
 */
fun TsIndexedAccessType.tsConstructorType(block: TsConstructorType.() -> Unit): TsConstructorType {
    return TsConstructorTypeImpl().apply(block)
}

/**
 * TsIndexedAccessType#indexType: TsType
 * extension function for create TsType -> TsTypeReferenceImpl
 */
fun TsIndexedAccessType.tsTypeReference(block: TsTypeReference.() -> Unit): TsTypeReference {
    return TsTypeReferenceImpl().apply(block)
}

/**
 * TsIndexedAccessType#indexType: TsType
 * extension function for create TsType -> TsTypeQueryImpl
 */
fun TsIndexedAccessType.tsTypeQuery(block: TsTypeQuery.() -> Unit): TsTypeQuery {
    return TsTypeQueryImpl().apply(block)
}

/**
 * TsIndexedAccessType#indexType: TsType
 * extension function for create TsType -> TsTypeLiteralImpl
 */
fun TsIndexedAccessType.tsTypeLiteral(block: TsTypeLiteral.() -> Unit): TsTypeLiteral {
    return TsTypeLiteralImpl().apply(block)
}

/**
 * TsIndexedAccessType#indexType: TsType
 * extension function for create TsType -> TsArrayTypeImpl
 */
fun TsIndexedAccessType.tsArrayType(block: TsArrayType.() -> Unit): TsArrayType {
    return TsArrayTypeImpl().apply(block)
}

/**
 * TsIndexedAccessType#indexType: TsType
 * extension function for create TsType -> TsTupleTypeImpl
 */
fun TsIndexedAccessType.tsTupleType(block: TsTupleType.() -> Unit): TsTupleType {
    return TsTupleTypeImpl().apply(block)
}

/**
 * TsIndexedAccessType#indexType: TsType
 * extension function for create TsType -> TsOptionalTypeImpl
 */
fun TsIndexedAccessType.tsOptionalType(block: TsOptionalType.() -> Unit): TsOptionalType {
    return TsOptionalTypeImpl().apply(block)
}

/**
 * TsIndexedAccessType#indexType: TsType
 * extension function for create TsType -> TsRestTypeImpl
 */
fun TsIndexedAccessType.tsRestType(block: TsRestType.() -> Unit): TsRestType {
    return TsRestTypeImpl().apply(block)
}

/**
 * TsIndexedAccessType#indexType: TsType
 * extension function for create TsType -> TsUnionTypeImpl
 */
fun TsIndexedAccessType.tsUnionType(block: TsUnionType.() -> Unit): TsUnionType {
    return TsUnionTypeImpl().apply(block)
}

/**
 * TsIndexedAccessType#indexType: TsType
 * extension function for create TsType -> TsIntersectionTypeImpl
 */
fun TsIndexedAccessType.tsIntersectionType(block: TsIntersectionType.() -> Unit): TsIntersectionType {
    return TsIntersectionTypeImpl().apply(block)
}

/**
 * TsIndexedAccessType#indexType: TsType
 * extension function for create TsType -> TsConditionalTypeImpl
 */
fun TsIndexedAccessType.tsConditionalType(block: TsConditionalType.() -> Unit): TsConditionalType {
    return TsConditionalTypeImpl().apply(block)
}

/**
 * TsIndexedAccessType#indexType: TsType
 * extension function for create TsType -> TsInferTypeImpl
 */
fun TsIndexedAccessType.tsInferType(block: TsInferType.() -> Unit): TsInferType {
    return TsInferTypeImpl().apply(block)
}

/**
 * TsIndexedAccessType#indexType: TsType
 * extension function for create TsType -> TsParenthesizedTypeImpl
 */
fun TsIndexedAccessType.tsParenthesizedType(block: TsParenthesizedType.() -> Unit): TsParenthesizedType {
    return TsParenthesizedTypeImpl().apply(block)
}

/**
 * TsIndexedAccessType#indexType: TsType
 * extension function for create TsType -> TsTypeOperatorImpl
 */
fun TsIndexedAccessType.tsTypeOperator(block: TsTypeOperator.() -> Unit): TsTypeOperator {
    return TsTypeOperatorImpl().apply(block)
}

/**
 * TsIndexedAccessType#indexType: TsType
 * extension function for create TsType -> TsMappedTypeImpl
 */
fun TsIndexedAccessType.tsMappedType(block: TsMappedType.() -> Unit): TsMappedType {
    return TsMappedTypeImpl().apply(block)
}

/**
 * TsIndexedAccessType#indexType: TsType
 * extension function for create TsType -> TsLiteralTypeImpl
 */
fun TsIndexedAccessType.tsLiteralType(block: TsLiteralType.() -> Unit): TsLiteralType {
    return TsLiteralTypeImpl().apply(block)
}

/**
 * TsIndexedAccessType#indexType: TsType
 * extension function for create TsType -> TsTypePredicateImpl
 */
fun TsIndexedAccessType.tsTypePredicate(block: TsTypePredicate.() -> Unit): TsTypePredicate {
    return TsTypePredicateImpl().apply(block)
}

/**
 * TsIndexedAccessType#indexType: TsType
 * extension function for create TsType -> TsImportTypeImpl
 */
fun TsIndexedAccessType.tsImportType(block: TsImportType.() -> Unit): TsImportType {
    return TsImportTypeImpl().apply(block)
}

fun TsIndexedAccessType.span(block: Span.() -> Unit): Span {
    return Span().apply(block)
}
