package dev.yidafu.swc.dsl

import dev.yidafu.swc.types.*

/**
 * TsArrayType#elemType: TsType
 * extension function for create TsType -> TsKeywordTypeImpl
 */
fun TsArrayType.tsKeywordType(block: TsKeywordType.() -> Unit): TsKeywordType {
    return TsKeywordTypeImpl().apply(block)
}

/**
 * TsArrayType#elemType: TsType
 * extension function for create TsType -> TsThisTypeImpl
 */
fun TsArrayType.tsThisType(block: TsThisType.() -> Unit): TsThisType {
    return TsThisTypeImpl().apply(block)
}

/**
 * TsArrayType#elemType: TsType
 * extension function for create TsType -> TsFunctionTypeImpl
 */
fun TsArrayType.tsFunctionType(block: TsFunctionType.() -> Unit): TsFunctionType {
    return TsFunctionTypeImpl().apply(block)
}

/**
 * TsArrayType#elemType: TsType
 * extension function for create TsType -> TsConstructorTypeImpl
 */
fun TsArrayType.tsConstructorType(block: TsConstructorType.() -> Unit): TsConstructorType {
    return TsConstructorTypeImpl().apply(block)
}

/**
 * TsArrayType#elemType: TsType
 * extension function for create TsType -> TsTypeReferenceImpl
 */
fun TsArrayType.tsTypeReference(block: TsTypeReference.() -> Unit): TsTypeReference {
    return TsTypeReferenceImpl().apply(block)
}

/**
 * TsArrayType#elemType: TsType
 * extension function for create TsType -> TsTypeQueryImpl
 */
fun TsArrayType.tsTypeQuery(block: TsTypeQuery.() -> Unit): TsTypeQuery {
    return TsTypeQueryImpl().apply(block)
}

/**
 * TsArrayType#elemType: TsType
 * extension function for create TsType -> TsTypeLiteralImpl
 */
fun TsArrayType.tsTypeLiteral(block: TsTypeLiteral.() -> Unit): TsTypeLiteral {
    return TsTypeLiteralImpl().apply(block)
}

/**
 * TsArrayType#elemType: TsType
 * extension function for create TsType -> TsTupleTypeImpl
 */
fun TsArrayType.tsTupleType(block: TsTupleType.() -> Unit): TsTupleType {
    return TsTupleTypeImpl().apply(block)
}

/**
 * TsArrayType#elemType: TsType
 * extension function for create TsType -> TsOptionalTypeImpl
 */
fun TsArrayType.tsOptionalType(block: TsOptionalType.() -> Unit): TsOptionalType {
    return TsOptionalTypeImpl().apply(block)
}

/**
 * TsArrayType#elemType: TsType
 * extension function for create TsType -> TsRestTypeImpl
 */
fun TsArrayType.tsRestType(block: TsRestType.() -> Unit): TsRestType {
    return TsRestTypeImpl().apply(block)
}

/**
 * TsArrayType#elemType: TsType
 * extension function for create TsType -> TsUnionTypeImpl
 */
fun TsArrayType.tsUnionType(block: TsUnionType.() -> Unit): TsUnionType {
    return TsUnionTypeImpl().apply(block)
}

/**
 * TsArrayType#elemType: TsType
 * extension function for create TsType -> TsIntersectionTypeImpl
 */
fun TsArrayType.tsIntersectionType(block: TsIntersectionType.() -> Unit): TsIntersectionType {
    return TsIntersectionTypeImpl().apply(block)
}

/**
 * TsArrayType#elemType: TsType
 * extension function for create TsType -> TsConditionalTypeImpl
 */
fun TsArrayType.tsConditionalType(block: TsConditionalType.() -> Unit): TsConditionalType {
    return TsConditionalTypeImpl().apply(block)
}

/**
 * TsArrayType#elemType: TsType
 * extension function for create TsType -> TsInferTypeImpl
 */
fun TsArrayType.tsInferType(block: TsInferType.() -> Unit): TsInferType {
    return TsInferTypeImpl().apply(block)
}

/**
 * TsArrayType#elemType: TsType
 * extension function for create TsType -> TsParenthesizedTypeImpl
 */
fun TsArrayType.tsParenthesizedType(block: TsParenthesizedType.() -> Unit): TsParenthesizedType {
    return TsParenthesizedTypeImpl().apply(block)
}

/**
 * TsArrayType#elemType: TsType
 * extension function for create TsType -> TsTypeOperatorImpl
 */
fun TsArrayType.tsTypeOperator(block: TsTypeOperator.() -> Unit): TsTypeOperator {
    return TsTypeOperatorImpl().apply(block)
}

/**
 * TsArrayType#elemType: TsType
 * extension function for create TsType -> TsIndexedAccessTypeImpl
 */
fun TsArrayType.tsIndexedAccessType(block: TsIndexedAccessType.() -> Unit): TsIndexedAccessType {
    return TsIndexedAccessTypeImpl().apply(block)
}

/**
 * TsArrayType#elemType: TsType
 * extension function for create TsType -> TsMappedTypeImpl
 */
fun TsArrayType.tsMappedType(block: TsMappedType.() -> Unit): TsMappedType {
    return TsMappedTypeImpl().apply(block)
}

/**
 * TsArrayType#elemType: TsType
 * extension function for create TsType -> TsLiteralTypeImpl
 */
fun TsArrayType.tsLiteralType(block: TsLiteralType.() -> Unit): TsLiteralType {
    return TsLiteralTypeImpl().apply(block)
}

/**
 * TsArrayType#elemType: TsType
 * extension function for create TsType -> TsTypePredicateImpl
 */
fun TsArrayType.tsTypePredicate(block: TsTypePredicate.() -> Unit): TsTypePredicate {
    return TsTypePredicateImpl().apply(block)
}

/**
 * TsArrayType#elemType: TsType
 * extension function for create TsType -> TsImportTypeImpl
 */
fun TsArrayType.tsImportType(block: TsImportType.() -> Unit): TsImportType {
    return TsImportTypeImpl().apply(block)
}

fun TsArrayType.span(block: Span.() -> Unit): Span {
    return Span().apply(block)
}
