package dev.yidafu.swc.dsl

import dev.yidafu.swc.types.*

/**
 * TsIntersectionType#types: Array<TsType>
 * extension function for create Array<TsType> -> TsKeywordTypeImpl
 */
fun TsIntersectionType.tsKeywordType(block: TsKeywordType.() -> Unit): TsKeywordType {
    return TsKeywordTypeImpl().apply(block)
}

/**
 * TsIntersectionType#types: Array<TsType>
 * extension function for create Array<TsType> -> TsThisTypeImpl
 */
fun TsIntersectionType.tsThisType(block: TsThisType.() -> Unit): TsThisType {
    return TsThisTypeImpl().apply(block)
}

/**
 * TsIntersectionType#types: Array<TsType>
 * extension function for create Array<TsType> -> TsFunctionTypeImpl
 */
fun TsIntersectionType.tsFunctionType(block: TsFunctionType.() -> Unit): TsFunctionType {
    return TsFunctionTypeImpl().apply(block)
}

/**
 * TsIntersectionType#types: Array<TsType>
 * extension function for create Array<TsType> -> TsConstructorTypeImpl
 */
fun TsIntersectionType.tsConstructorType(block: TsConstructorType.() -> Unit): TsConstructorType {
    return TsConstructorTypeImpl().apply(block)
}

/**
 * TsIntersectionType#types: Array<TsType>
 * extension function for create Array<TsType> -> TsTypeReferenceImpl
 */
fun TsIntersectionType.tsTypeReference(block: TsTypeReference.() -> Unit): TsTypeReference {
    return TsTypeReferenceImpl().apply(block)
}

/**
 * TsIntersectionType#types: Array<TsType>
 * extension function for create Array<TsType> -> TsTypeQueryImpl
 */
fun TsIntersectionType.tsTypeQuery(block: TsTypeQuery.() -> Unit): TsTypeQuery {
    return TsTypeQueryImpl().apply(block)
}

/**
 * TsIntersectionType#types: Array<TsType>
 * extension function for create Array<TsType> -> TsTypeLiteralImpl
 */
fun TsIntersectionType.tsTypeLiteral(block: TsTypeLiteral.() -> Unit): TsTypeLiteral {
    return TsTypeLiteralImpl().apply(block)
}

/**
 * TsIntersectionType#types: Array<TsType>
 * extension function for create Array<TsType> -> TsArrayTypeImpl
 */
fun TsIntersectionType.tsArrayType(block: TsArrayType.() -> Unit): TsArrayType {
    return TsArrayTypeImpl().apply(block)
}

/**
 * TsIntersectionType#types: Array<TsType>
 * extension function for create Array<TsType> -> TsTupleTypeImpl
 */
fun TsIntersectionType.tsTupleType(block: TsTupleType.() -> Unit): TsTupleType {
    return TsTupleTypeImpl().apply(block)
}

/**
 * TsIntersectionType#types: Array<TsType>
 * extension function for create Array<TsType> -> TsOptionalTypeImpl
 */
fun TsIntersectionType.tsOptionalType(block: TsOptionalType.() -> Unit): TsOptionalType {
    return TsOptionalTypeImpl().apply(block)
}

/**
 * TsIntersectionType#types: Array<TsType>
 * extension function for create Array<TsType> -> TsRestTypeImpl
 */
fun TsIntersectionType.tsRestType(block: TsRestType.() -> Unit): TsRestType {
    return TsRestTypeImpl().apply(block)
}

/**
 * TsIntersectionType#types: Array<TsType>
 * extension function for create Array<TsType> -> TsUnionTypeImpl
 */
fun TsIntersectionType.tsUnionType(block: TsUnionType.() -> Unit): TsUnionType {
    return TsUnionTypeImpl().apply(block)
}

/**
 * TsIntersectionType#types: Array<TsType>
 * extension function for create Array<TsType> -> TsConditionalTypeImpl
 */
fun TsIntersectionType.tsConditionalType(block: TsConditionalType.() -> Unit): TsConditionalType {
    return TsConditionalTypeImpl().apply(block)
}

/**
 * TsIntersectionType#types: Array<TsType>
 * extension function for create Array<TsType> -> TsInferTypeImpl
 */
fun TsIntersectionType.tsInferType(block: TsInferType.() -> Unit): TsInferType {
    return TsInferTypeImpl().apply(block)
}

/**
 * TsIntersectionType#types: Array<TsType>
 * extension function for create Array<TsType> -> TsParenthesizedTypeImpl
 */
fun TsIntersectionType.tsParenthesizedType(block: TsParenthesizedType.() -> Unit): TsParenthesizedType {
    return TsParenthesizedTypeImpl().apply(block)
}

/**
 * TsIntersectionType#types: Array<TsType>
 * extension function for create Array<TsType> -> TsTypeOperatorImpl
 */
fun TsIntersectionType.tsTypeOperator(block: TsTypeOperator.() -> Unit): TsTypeOperator {
    return TsTypeOperatorImpl().apply(block)
}

/**
 * TsIntersectionType#types: Array<TsType>
 * extension function for create Array<TsType> -> TsIndexedAccessTypeImpl
 */
fun TsIntersectionType.tsIndexedAccessType(block: TsIndexedAccessType.() -> Unit): TsIndexedAccessType {
    return TsIndexedAccessTypeImpl().apply(block)
}

/**
 * TsIntersectionType#types: Array<TsType>
 * extension function for create Array<TsType> -> TsMappedTypeImpl
 */
fun TsIntersectionType.tsMappedType(block: TsMappedType.() -> Unit): TsMappedType {
    return TsMappedTypeImpl().apply(block)
}

/**
 * TsIntersectionType#types: Array<TsType>
 * extension function for create Array<TsType> -> TsLiteralTypeImpl
 */
fun TsIntersectionType.tsLiteralType(block: TsLiteralType.() -> Unit): TsLiteralType {
    return TsLiteralTypeImpl().apply(block)
}

/**
 * TsIntersectionType#types: Array<TsType>
 * extension function for create Array<TsType> -> TsTypePredicateImpl
 */
fun TsIntersectionType.tsTypePredicate(block: TsTypePredicate.() -> Unit): TsTypePredicate {
    return TsTypePredicateImpl().apply(block)
}

/**
 * TsIntersectionType#types: Array<TsType>
 * extension function for create Array<TsType> -> TsImportTypeImpl
 */
fun TsIntersectionType.tsImportType(block: TsImportType.() -> Unit): TsImportType {
    return TsImportTypeImpl().apply(block)
}

fun TsIntersectionType.span(block: Span.() -> Unit): Span {
    return Span().apply(block)
}
