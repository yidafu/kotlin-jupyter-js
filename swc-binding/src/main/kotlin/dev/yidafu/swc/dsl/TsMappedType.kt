package dev.yidafu.swc.dsl

import dev.yidafu.swc.types.*

/**
 * TsMappedType#typeParam: TsTypeParameter
 * extension function for create TsTypeParameter -> TsTypeParameterImpl
 */
fun TsMappedType.tsTypeParameter(block: TsTypeParameter.() -> Unit): TsTypeParameter {
    return TsTypeParameterImpl().apply(block)
}

/**
 * TsMappedType#typeAnnotation: TsType
 * extension function for create TsType -> TsKeywordTypeImpl
 */
fun TsMappedType.tsKeywordType(block: TsKeywordType.() -> Unit): TsKeywordType {
    return TsKeywordTypeImpl().apply(block)
}

/**
 * TsMappedType#typeAnnotation: TsType
 * extension function for create TsType -> TsThisTypeImpl
 */
fun TsMappedType.tsThisType(block: TsThisType.() -> Unit): TsThisType {
    return TsThisTypeImpl().apply(block)
}

/**
 * TsMappedType#typeAnnotation: TsType
 * extension function for create TsType -> TsFunctionTypeImpl
 */
fun TsMappedType.tsFunctionType(block: TsFunctionType.() -> Unit): TsFunctionType {
    return TsFunctionTypeImpl().apply(block)
}

/**
 * TsMappedType#typeAnnotation: TsType
 * extension function for create TsType -> TsConstructorTypeImpl
 */
fun TsMappedType.tsConstructorType(block: TsConstructorType.() -> Unit): TsConstructorType {
    return TsConstructorTypeImpl().apply(block)
}

/**
 * TsMappedType#typeAnnotation: TsType
 * extension function for create TsType -> TsTypeReferenceImpl
 */
fun TsMappedType.tsTypeReference(block: TsTypeReference.() -> Unit): TsTypeReference {
    return TsTypeReferenceImpl().apply(block)
}

/**
 * TsMappedType#typeAnnotation: TsType
 * extension function for create TsType -> TsTypeQueryImpl
 */
fun TsMappedType.tsTypeQuery(block: TsTypeQuery.() -> Unit): TsTypeQuery {
    return TsTypeQueryImpl().apply(block)
}

/**
 * TsMappedType#typeAnnotation: TsType
 * extension function for create TsType -> TsTypeLiteralImpl
 */
fun TsMappedType.tsTypeLiteral(block: TsTypeLiteral.() -> Unit): TsTypeLiteral {
    return TsTypeLiteralImpl().apply(block)
}

/**
 * TsMappedType#typeAnnotation: TsType
 * extension function for create TsType -> TsArrayTypeImpl
 */
fun TsMappedType.tsArrayType(block: TsArrayType.() -> Unit): TsArrayType {
    return TsArrayTypeImpl().apply(block)
}

/**
 * TsMappedType#typeAnnotation: TsType
 * extension function for create TsType -> TsTupleTypeImpl
 */
fun TsMappedType.tsTupleType(block: TsTupleType.() -> Unit): TsTupleType {
    return TsTupleTypeImpl().apply(block)
}

/**
 * TsMappedType#typeAnnotation: TsType
 * extension function for create TsType -> TsOptionalTypeImpl
 */
fun TsMappedType.tsOptionalType(block: TsOptionalType.() -> Unit): TsOptionalType {
    return TsOptionalTypeImpl().apply(block)
}

/**
 * TsMappedType#typeAnnotation: TsType
 * extension function for create TsType -> TsRestTypeImpl
 */
fun TsMappedType.tsRestType(block: TsRestType.() -> Unit): TsRestType {
    return TsRestTypeImpl().apply(block)
}

/**
 * TsMappedType#typeAnnotation: TsType
 * extension function for create TsType -> TsUnionTypeImpl
 */
fun TsMappedType.tsUnionType(block: TsUnionType.() -> Unit): TsUnionType {
    return TsUnionTypeImpl().apply(block)
}

/**
 * TsMappedType#typeAnnotation: TsType
 * extension function for create TsType -> TsIntersectionTypeImpl
 */
fun TsMappedType.tsIntersectionType(block: TsIntersectionType.() -> Unit): TsIntersectionType {
    return TsIntersectionTypeImpl().apply(block)
}

/**
 * TsMappedType#typeAnnotation: TsType
 * extension function for create TsType -> TsConditionalTypeImpl
 */
fun TsMappedType.tsConditionalType(block: TsConditionalType.() -> Unit): TsConditionalType {
    return TsConditionalTypeImpl().apply(block)
}

/**
 * TsMappedType#typeAnnotation: TsType
 * extension function for create TsType -> TsInferTypeImpl
 */
fun TsMappedType.tsInferType(block: TsInferType.() -> Unit): TsInferType {
    return TsInferTypeImpl().apply(block)
}

/**
 * TsMappedType#typeAnnotation: TsType
 * extension function for create TsType -> TsParenthesizedTypeImpl
 */
fun TsMappedType.tsParenthesizedType(block: TsParenthesizedType.() -> Unit): TsParenthesizedType {
    return TsParenthesizedTypeImpl().apply(block)
}

/**
 * TsMappedType#typeAnnotation: TsType
 * extension function for create TsType -> TsTypeOperatorImpl
 */
fun TsMappedType.tsTypeOperator(block: TsTypeOperator.() -> Unit): TsTypeOperator {
    return TsTypeOperatorImpl().apply(block)
}

/**
 * TsMappedType#typeAnnotation: TsType
 * extension function for create TsType -> TsIndexedAccessTypeImpl
 */
fun TsMappedType.tsIndexedAccessType(block: TsIndexedAccessType.() -> Unit): TsIndexedAccessType {
    return TsIndexedAccessTypeImpl().apply(block)
}

/**
 * TsMappedType#typeAnnotation: TsType
 * extension function for create TsType -> TsLiteralTypeImpl
 */
fun TsMappedType.tsLiteralType(block: TsLiteralType.() -> Unit): TsLiteralType {
    return TsLiteralTypeImpl().apply(block)
}

/**
 * TsMappedType#typeAnnotation: TsType
 * extension function for create TsType -> TsTypePredicateImpl
 */
fun TsMappedType.tsTypePredicate(block: TsTypePredicate.() -> Unit): TsTypePredicate {
    return TsTypePredicateImpl().apply(block)
}

/**
 * TsMappedType#typeAnnotation: TsType
 * extension function for create TsType -> TsImportTypeImpl
 */
fun TsMappedType.tsImportType(block: TsImportType.() -> Unit): TsImportType {
    return TsImportTypeImpl().apply(block)
}

fun TsMappedType.span(block: Span.() -> Unit): Span {
    return Span().apply(block)
}
