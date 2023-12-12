package dev.yidafu.swc.dsl

import dev.yidafu.swc.types.*

/**
 * TsConditionalType#falseType: TsType
 * extension function for create TsType -> TsKeywordTypeImpl
 */
fun TsConditionalType.tsKeywordType(block: TsKeywordType.() -> Unit): TsKeywordType {
    return TsKeywordTypeImpl().apply(block)
}

/**
 * TsConditionalType#falseType: TsType
 * extension function for create TsType -> TsThisTypeImpl
 */
fun TsConditionalType.tsThisType(block: TsThisType.() -> Unit): TsThisType {
    return TsThisTypeImpl().apply(block)
}

/**
 * TsConditionalType#falseType: TsType
 * extension function for create TsType -> TsFunctionTypeImpl
 */
fun TsConditionalType.tsFunctionType(block: TsFunctionType.() -> Unit): TsFunctionType {
    return TsFunctionTypeImpl().apply(block)
}

/**
 * TsConditionalType#falseType: TsType
 * extension function for create TsType -> TsConstructorTypeImpl
 */
fun TsConditionalType.tsConstructorType(block: TsConstructorType.() -> Unit): TsConstructorType {
    return TsConstructorTypeImpl().apply(block)
}

/**
 * TsConditionalType#falseType: TsType
 * extension function for create TsType -> TsTypeReferenceImpl
 */
fun TsConditionalType.tsTypeReference(block: TsTypeReference.() -> Unit): TsTypeReference {
    return TsTypeReferenceImpl().apply(block)
}

/**
 * TsConditionalType#falseType: TsType
 * extension function for create TsType -> TsTypeQueryImpl
 */
fun TsConditionalType.tsTypeQuery(block: TsTypeQuery.() -> Unit): TsTypeQuery {
    return TsTypeQueryImpl().apply(block)
}

/**
 * TsConditionalType#falseType: TsType
 * extension function for create TsType -> TsTypeLiteralImpl
 */
fun TsConditionalType.tsTypeLiteral(block: TsTypeLiteral.() -> Unit): TsTypeLiteral {
    return TsTypeLiteralImpl().apply(block)
}

/**
 * TsConditionalType#falseType: TsType
 * extension function for create TsType -> TsArrayTypeImpl
 */
fun TsConditionalType.tsArrayType(block: TsArrayType.() -> Unit): TsArrayType {
    return TsArrayTypeImpl().apply(block)
}

/**
 * TsConditionalType#falseType: TsType
 * extension function for create TsType -> TsTupleTypeImpl
 */
fun TsConditionalType.tsTupleType(block: TsTupleType.() -> Unit): TsTupleType {
    return TsTupleTypeImpl().apply(block)
}

/**
 * TsConditionalType#falseType: TsType
 * extension function for create TsType -> TsOptionalTypeImpl
 */
fun TsConditionalType.tsOptionalType(block: TsOptionalType.() -> Unit): TsOptionalType {
    return TsOptionalTypeImpl().apply(block)
}

/**
 * TsConditionalType#falseType: TsType
 * extension function for create TsType -> TsRestTypeImpl
 */
fun TsConditionalType.tsRestType(block: TsRestType.() -> Unit): TsRestType {
    return TsRestTypeImpl().apply(block)
}

/**
 * TsConditionalType#falseType: TsType
 * extension function for create TsType -> TsUnionTypeImpl
 */
fun TsConditionalType.tsUnionType(block: TsUnionType.() -> Unit): TsUnionType {
    return TsUnionTypeImpl().apply(block)
}

/**
 * TsConditionalType#falseType: TsType
 * extension function for create TsType -> TsIntersectionTypeImpl
 */
fun TsConditionalType.tsIntersectionType(block: TsIntersectionType.() -> Unit): TsIntersectionType {
    return TsIntersectionTypeImpl().apply(block)
}

/**
 * TsConditionalType#falseType: TsType
 * extension function for create TsType -> TsInferTypeImpl
 */
fun TsConditionalType.tsInferType(block: TsInferType.() -> Unit): TsInferType {
    return TsInferTypeImpl().apply(block)
}

/**
 * TsConditionalType#falseType: TsType
 * extension function for create TsType -> TsParenthesizedTypeImpl
 */
fun TsConditionalType.tsParenthesizedType(block: TsParenthesizedType.() -> Unit): TsParenthesizedType {
    return TsParenthesizedTypeImpl().apply(block)
}

/**
 * TsConditionalType#falseType: TsType
 * extension function for create TsType -> TsTypeOperatorImpl
 */
fun TsConditionalType.tsTypeOperator(block: TsTypeOperator.() -> Unit): TsTypeOperator {
    return TsTypeOperatorImpl().apply(block)
}

/**
 * TsConditionalType#falseType: TsType
 * extension function for create TsType -> TsIndexedAccessTypeImpl
 */
fun TsConditionalType.tsIndexedAccessType(block: TsIndexedAccessType.() -> Unit): TsIndexedAccessType {
    return TsIndexedAccessTypeImpl().apply(block)
}

/**
 * TsConditionalType#falseType: TsType
 * extension function for create TsType -> TsMappedTypeImpl
 */
fun TsConditionalType.tsMappedType(block: TsMappedType.() -> Unit): TsMappedType {
    return TsMappedTypeImpl().apply(block)
}

/**
 * TsConditionalType#falseType: TsType
 * extension function for create TsType -> TsLiteralTypeImpl
 */
fun TsConditionalType.tsLiteralType(block: TsLiteralType.() -> Unit): TsLiteralType {
    return TsLiteralTypeImpl().apply(block)
}

/**
 * TsConditionalType#falseType: TsType
 * extension function for create TsType -> TsTypePredicateImpl
 */
fun TsConditionalType.tsTypePredicate(block: TsTypePredicate.() -> Unit): TsTypePredicate {
    return TsTypePredicateImpl().apply(block)
}

/**
 * TsConditionalType#falseType: TsType
 * extension function for create TsType -> TsImportTypeImpl
 */
fun TsConditionalType.tsImportType(block: TsImportType.() -> Unit): TsImportType {
    return TsImportTypeImpl().apply(block)
}

fun TsConditionalType.span(block: Span.() -> Unit): Span {
    return Span().apply(block)
}
