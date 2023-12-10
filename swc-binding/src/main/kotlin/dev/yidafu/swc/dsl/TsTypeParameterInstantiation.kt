package dev.yidafu.swc.dsl

import dev.yidafu.swc.types.*

/**
 * TsTypeParameterInstantiation#params: Array<TsType>
 * extension function for create Array<TsType> -> TsKeywordTypeImpl
 */
fun TsTypeParameterInstantiation.tsKeywordType(block: TsKeywordType.() -> Unit): TsKeywordType {
    return TsKeywordTypeImpl().apply(block)
}

/**
 * TsTypeParameterInstantiation#params: Array<TsType>
 * extension function for create Array<TsType> -> TsThisTypeImpl
 */
fun TsTypeParameterInstantiation.tsThisType(block: TsThisType.() -> Unit): TsThisType {
    return TsThisTypeImpl().apply(block)
}

/**
 * TsTypeParameterInstantiation#params: Array<TsType>
 * extension function for create Array<TsType> -> TsFunctionTypeImpl
 */
fun TsTypeParameterInstantiation.tsFunctionType(block: TsFunctionType.() -> Unit): TsFunctionType {
    return TsFunctionTypeImpl().apply(block)
}

/**
 * TsTypeParameterInstantiation#params: Array<TsType>
 * extension function for create Array<TsType> -> TsConstructorTypeImpl
 */
fun TsTypeParameterInstantiation.tsConstructorType(block: TsConstructorType.() -> Unit): TsConstructorType {
    return TsConstructorTypeImpl().apply(block)
}

/**
 * TsTypeParameterInstantiation#params: Array<TsType>
 * extension function for create Array<TsType> -> TsTypeReferenceImpl
 */
fun TsTypeParameterInstantiation.tsTypeReference(block: TsTypeReference.() -> Unit): TsTypeReference {
    return TsTypeReferenceImpl().apply(block)
}

/**
 * TsTypeParameterInstantiation#params: Array<TsType>
 * extension function for create Array<TsType> -> TsTypeQueryImpl
 */
fun TsTypeParameterInstantiation.tsTypeQuery(block: TsTypeQuery.() -> Unit): TsTypeQuery {
    return TsTypeQueryImpl().apply(block)
}

/**
 * TsTypeParameterInstantiation#params: Array<TsType>
 * extension function for create Array<TsType> -> TsTypeLiteralImpl
 */
fun TsTypeParameterInstantiation.tsTypeLiteral(block: TsTypeLiteral.() -> Unit): TsTypeLiteral {
    return TsTypeLiteralImpl().apply(block)
}

/**
 * TsTypeParameterInstantiation#params: Array<TsType>
 * extension function for create Array<TsType> -> TsArrayTypeImpl
 */
fun TsTypeParameterInstantiation.tsArrayType(block: TsArrayType.() -> Unit): TsArrayType {
    return TsArrayTypeImpl().apply(block)
}

/**
 * TsTypeParameterInstantiation#params: Array<TsType>
 * extension function for create Array<TsType> -> TsTupleTypeImpl
 */
fun TsTypeParameterInstantiation.tsTupleType(block: TsTupleType.() -> Unit): TsTupleType {
    return TsTupleTypeImpl().apply(block)
}

/**
 * TsTypeParameterInstantiation#params: Array<TsType>
 * extension function for create Array<TsType> -> TsOptionalTypeImpl
 */
fun TsTypeParameterInstantiation.tsOptionalType(block: TsOptionalType.() -> Unit): TsOptionalType {
    return TsOptionalTypeImpl().apply(block)
}

/**
 * TsTypeParameterInstantiation#params: Array<TsType>
 * extension function for create Array<TsType> -> TsRestTypeImpl
 */
fun TsTypeParameterInstantiation.tsRestType(block: TsRestType.() -> Unit): TsRestType {
    return TsRestTypeImpl().apply(block)
}

/**
 * TsTypeParameterInstantiation#params: Array<TsType>
 * extension function for create Array<TsType> -> TsUnionTypeImpl
 */
fun TsTypeParameterInstantiation.tsUnionType(block: TsUnionType.() -> Unit): TsUnionType {
    return TsUnionTypeImpl().apply(block)
}

/**
 * TsTypeParameterInstantiation#params: Array<TsType>
 * extension function for create Array<TsType> -> TsIntersectionTypeImpl
 */
fun TsTypeParameterInstantiation.tsIntersectionType(block: TsIntersectionType.() -> Unit): TsIntersectionType {
    return TsIntersectionTypeImpl().apply(block)
}

/**
 * TsTypeParameterInstantiation#params: Array<TsType>
 * extension function for create Array<TsType> -> TsConditionalTypeImpl
 */
fun TsTypeParameterInstantiation.tsConditionalType(block: TsConditionalType.() -> Unit): TsConditionalType {
    return TsConditionalTypeImpl().apply(block)
}

/**
 * TsTypeParameterInstantiation#params: Array<TsType>
 * extension function for create Array<TsType> -> TsInferTypeImpl
 */
fun TsTypeParameterInstantiation.tsInferType(block: TsInferType.() -> Unit): TsInferType {
    return TsInferTypeImpl().apply(block)
}

/**
 * TsTypeParameterInstantiation#params: Array<TsType>
 * extension function for create Array<TsType> -> TsParenthesizedTypeImpl
 */
fun TsTypeParameterInstantiation.tsParenthesizedType(block: TsParenthesizedType.() -> Unit): TsParenthesizedType {
    return TsParenthesizedTypeImpl().apply(block)
}

/**
 * TsTypeParameterInstantiation#params: Array<TsType>
 * extension function for create Array<TsType> -> TsTypeOperatorImpl
 */
fun TsTypeParameterInstantiation.tsTypeOperator(block: TsTypeOperator.() -> Unit): TsTypeOperator {
    return TsTypeOperatorImpl().apply(block)
}

/**
 * TsTypeParameterInstantiation#params: Array<TsType>
 * extension function for create Array<TsType> -> TsIndexedAccessTypeImpl
 */
fun TsTypeParameterInstantiation.tsIndexedAccessType(block: TsIndexedAccessType.() -> Unit): TsIndexedAccessType {
    return TsIndexedAccessTypeImpl().apply(block)
}

/**
 * TsTypeParameterInstantiation#params: Array<TsType>
 * extension function for create Array<TsType> -> TsMappedTypeImpl
 */
fun TsTypeParameterInstantiation.tsMappedType(block: TsMappedType.() -> Unit): TsMappedType {
    return TsMappedTypeImpl().apply(block)
}

/**
 * TsTypeParameterInstantiation#params: Array<TsType>
 * extension function for create Array<TsType> -> TsLiteralTypeImpl
 */
fun TsTypeParameterInstantiation.tsLiteralType(block: TsLiteralType.() -> Unit): TsLiteralType {
    return TsLiteralTypeImpl().apply(block)
}

/**
 * TsTypeParameterInstantiation#params: Array<TsType>
 * extension function for create Array<TsType> -> TsTypePredicateImpl
 */
fun TsTypeParameterInstantiation.tsTypePredicate(block: TsTypePredicate.() -> Unit): TsTypePredicate {
    return TsTypePredicateImpl().apply(block)
}

/**
 * TsTypeParameterInstantiation#params: Array<TsType>
 * extension function for create Array<TsType> -> TsImportTypeImpl
 */
fun TsTypeParameterInstantiation.tsImportType(block: TsImportType.() -> Unit): TsImportType {
    return TsImportTypeImpl().apply(block)
}

fun TsTypeParameterInstantiation.span(block: Span.() -> Unit): Span {
    return Span().apply(block)
}
