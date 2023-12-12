package dev.yidafu.swc.dsl

import dev.yidafu.swc.types.*

/**
 * TsUnionType#types: Array<TsType>
 * extension function for create Array<TsType> -> TsKeywordTypeImpl
 */
fun TsUnionType.tsKeywordType(block: TsKeywordType.() -> Unit): TsKeywordType {
    return TsKeywordTypeImpl().apply(block)
}

/**
 * TsUnionType#types: Array<TsType>
 * extension function for create Array<TsType> -> TsThisTypeImpl
 */
fun TsUnionType.tsThisType(block: TsThisType.() -> Unit): TsThisType {
    return TsThisTypeImpl().apply(block)
}

/**
 * TsUnionType#types: Array<TsType>
 * extension function for create Array<TsType> -> TsFunctionTypeImpl
 */
fun TsUnionType.tsFunctionType(block: TsFunctionType.() -> Unit): TsFunctionType {
    return TsFunctionTypeImpl().apply(block)
}

/**
 * TsUnionType#types: Array<TsType>
 * extension function for create Array<TsType> -> TsConstructorTypeImpl
 */
fun TsUnionType.tsConstructorType(block: TsConstructorType.() -> Unit): TsConstructorType {
    return TsConstructorTypeImpl().apply(block)
}

/**
 * TsUnionType#types: Array<TsType>
 * extension function for create Array<TsType> -> TsTypeReferenceImpl
 */
fun TsUnionType.tsTypeReference(block: TsTypeReference.() -> Unit): TsTypeReference {
    return TsTypeReferenceImpl().apply(block)
}

/**
 * TsUnionType#types: Array<TsType>
 * extension function for create Array<TsType> -> TsTypeQueryImpl
 */
fun TsUnionType.tsTypeQuery(block: TsTypeQuery.() -> Unit): TsTypeQuery {
    return TsTypeQueryImpl().apply(block)
}

/**
 * TsUnionType#types: Array<TsType>
 * extension function for create Array<TsType> -> TsTypeLiteralImpl
 */
fun TsUnionType.tsTypeLiteral(block: TsTypeLiteral.() -> Unit): TsTypeLiteral {
    return TsTypeLiteralImpl().apply(block)
}

/**
 * TsUnionType#types: Array<TsType>
 * extension function for create Array<TsType> -> TsArrayTypeImpl
 */
fun TsUnionType.tsArrayType(block: TsArrayType.() -> Unit): TsArrayType {
    return TsArrayTypeImpl().apply(block)
}

/**
 * TsUnionType#types: Array<TsType>
 * extension function for create Array<TsType> -> TsTupleTypeImpl
 */
fun TsUnionType.tsTupleType(block: TsTupleType.() -> Unit): TsTupleType {
    return TsTupleTypeImpl().apply(block)
}

/**
 * TsUnionType#types: Array<TsType>
 * extension function for create Array<TsType> -> TsOptionalTypeImpl
 */
fun TsUnionType.tsOptionalType(block: TsOptionalType.() -> Unit): TsOptionalType {
    return TsOptionalTypeImpl().apply(block)
}

/**
 * TsUnionType#types: Array<TsType>
 * extension function for create Array<TsType> -> TsRestTypeImpl
 */
fun TsUnionType.tsRestType(block: TsRestType.() -> Unit): TsRestType {
    return TsRestTypeImpl().apply(block)
}

/**
 * TsUnionType#types: Array<TsType>
 * extension function for create Array<TsType> -> TsIntersectionTypeImpl
 */
fun TsUnionType.tsIntersectionType(block: TsIntersectionType.() -> Unit): TsIntersectionType {
    return TsIntersectionTypeImpl().apply(block)
}

/**
 * TsUnionType#types: Array<TsType>
 * extension function for create Array<TsType> -> TsConditionalTypeImpl
 */
fun TsUnionType.tsConditionalType(block: TsConditionalType.() -> Unit): TsConditionalType {
    return TsConditionalTypeImpl().apply(block)
}

/**
 * TsUnionType#types: Array<TsType>
 * extension function for create Array<TsType> -> TsInferTypeImpl
 */
fun TsUnionType.tsInferType(block: TsInferType.() -> Unit): TsInferType {
    return TsInferTypeImpl().apply(block)
}

/**
 * TsUnionType#types: Array<TsType>
 * extension function for create Array<TsType> -> TsParenthesizedTypeImpl
 */
fun TsUnionType.tsParenthesizedType(block: TsParenthesizedType.() -> Unit): TsParenthesizedType {
    return TsParenthesizedTypeImpl().apply(block)
}

/**
 * TsUnionType#types: Array<TsType>
 * extension function for create Array<TsType> -> TsTypeOperatorImpl
 */
fun TsUnionType.tsTypeOperator(block: TsTypeOperator.() -> Unit): TsTypeOperator {
    return TsTypeOperatorImpl().apply(block)
}

/**
 * TsUnionType#types: Array<TsType>
 * extension function for create Array<TsType> -> TsIndexedAccessTypeImpl
 */
fun TsUnionType.tsIndexedAccessType(block: TsIndexedAccessType.() -> Unit): TsIndexedAccessType {
    return TsIndexedAccessTypeImpl().apply(block)
}

/**
 * TsUnionType#types: Array<TsType>
 * extension function for create Array<TsType> -> TsMappedTypeImpl
 */
fun TsUnionType.tsMappedType(block: TsMappedType.() -> Unit): TsMappedType {
    return TsMappedTypeImpl().apply(block)
}

/**
 * TsUnionType#types: Array<TsType>
 * extension function for create Array<TsType> -> TsLiteralTypeImpl
 */
fun TsUnionType.tsLiteralType(block: TsLiteralType.() -> Unit): TsLiteralType {
    return TsLiteralTypeImpl().apply(block)
}

/**
 * TsUnionType#types: Array<TsType>
 * extension function for create Array<TsType> -> TsTypePredicateImpl
 */
fun TsUnionType.tsTypePredicate(block: TsTypePredicate.() -> Unit): TsTypePredicate {
    return TsTypePredicateImpl().apply(block)
}

/**
 * TsUnionType#types: Array<TsType>
 * extension function for create Array<TsType> -> TsImportTypeImpl
 */
fun TsUnionType.tsImportType(block: TsImportType.() -> Unit): TsImportType {
    return TsImportTypeImpl().apply(block)
}

fun TsUnionType.span(block: Span.() -> Unit): Span {
    return Span().apply(block)
}
