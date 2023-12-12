package dev.yidafu.swc.dsl

import dev.yidafu.swc.types.*

/**
 * TsTypeParameter#name: Identifier
 * extension function for create Identifier -> IdentifierImpl
 */
fun TsTypeParameter.identifier(block: Identifier.() -> Unit): Identifier {
    return IdentifierImpl().apply(block)
}

/**
 * TsTypeParameter#default: TsType
 * extension function for create TsType -> TsKeywordTypeImpl
 */
fun TsTypeParameter.tsKeywordType(block: TsKeywordType.() -> Unit): TsKeywordType {
    return TsKeywordTypeImpl().apply(block)
}

/**
 * TsTypeParameter#default: TsType
 * extension function for create TsType -> TsThisTypeImpl
 */
fun TsTypeParameter.tsThisType(block: TsThisType.() -> Unit): TsThisType {
    return TsThisTypeImpl().apply(block)
}

/**
 * TsTypeParameter#default: TsType
 * extension function for create TsType -> TsFunctionTypeImpl
 */
fun TsTypeParameter.tsFunctionType(block: TsFunctionType.() -> Unit): TsFunctionType {
    return TsFunctionTypeImpl().apply(block)
}

/**
 * TsTypeParameter#default: TsType
 * extension function for create TsType -> TsConstructorTypeImpl
 */
fun TsTypeParameter.tsConstructorType(block: TsConstructorType.() -> Unit): TsConstructorType {
    return TsConstructorTypeImpl().apply(block)
}

/**
 * TsTypeParameter#default: TsType
 * extension function for create TsType -> TsTypeReferenceImpl
 */
fun TsTypeParameter.tsTypeReference(block: TsTypeReference.() -> Unit): TsTypeReference {
    return TsTypeReferenceImpl().apply(block)
}

/**
 * TsTypeParameter#default: TsType
 * extension function for create TsType -> TsTypeQueryImpl
 */
fun TsTypeParameter.tsTypeQuery(block: TsTypeQuery.() -> Unit): TsTypeQuery {
    return TsTypeQueryImpl().apply(block)
}

/**
 * TsTypeParameter#default: TsType
 * extension function for create TsType -> TsTypeLiteralImpl
 */
fun TsTypeParameter.tsTypeLiteral(block: TsTypeLiteral.() -> Unit): TsTypeLiteral {
    return TsTypeLiteralImpl().apply(block)
}

/**
 * TsTypeParameter#default: TsType
 * extension function for create TsType -> TsArrayTypeImpl
 */
fun TsTypeParameter.tsArrayType(block: TsArrayType.() -> Unit): TsArrayType {
    return TsArrayTypeImpl().apply(block)
}

/**
 * TsTypeParameter#default: TsType
 * extension function for create TsType -> TsTupleTypeImpl
 */
fun TsTypeParameter.tsTupleType(block: TsTupleType.() -> Unit): TsTupleType {
    return TsTupleTypeImpl().apply(block)
}

/**
 * TsTypeParameter#default: TsType
 * extension function for create TsType -> TsOptionalTypeImpl
 */
fun TsTypeParameter.tsOptionalType(block: TsOptionalType.() -> Unit): TsOptionalType {
    return TsOptionalTypeImpl().apply(block)
}

/**
 * TsTypeParameter#default: TsType
 * extension function for create TsType -> TsRestTypeImpl
 */
fun TsTypeParameter.tsRestType(block: TsRestType.() -> Unit): TsRestType {
    return TsRestTypeImpl().apply(block)
}

/**
 * TsTypeParameter#default: TsType
 * extension function for create TsType -> TsUnionTypeImpl
 */
fun TsTypeParameter.tsUnionType(block: TsUnionType.() -> Unit): TsUnionType {
    return TsUnionTypeImpl().apply(block)
}

/**
 * TsTypeParameter#default: TsType
 * extension function for create TsType -> TsIntersectionTypeImpl
 */
fun TsTypeParameter.tsIntersectionType(block: TsIntersectionType.() -> Unit): TsIntersectionType {
    return TsIntersectionTypeImpl().apply(block)
}

/**
 * TsTypeParameter#default: TsType
 * extension function for create TsType -> TsConditionalTypeImpl
 */
fun TsTypeParameter.tsConditionalType(block: TsConditionalType.() -> Unit): TsConditionalType {
    return TsConditionalTypeImpl().apply(block)
}

/**
 * TsTypeParameter#default: TsType
 * extension function for create TsType -> TsInferTypeImpl
 */
fun TsTypeParameter.tsInferType(block: TsInferType.() -> Unit): TsInferType {
    return TsInferTypeImpl().apply(block)
}

/**
 * TsTypeParameter#default: TsType
 * extension function for create TsType -> TsParenthesizedTypeImpl
 */
fun TsTypeParameter.tsParenthesizedType(block: TsParenthesizedType.() -> Unit): TsParenthesizedType {
    return TsParenthesizedTypeImpl().apply(block)
}

/**
 * TsTypeParameter#default: TsType
 * extension function for create TsType -> TsTypeOperatorImpl
 */
fun TsTypeParameter.tsTypeOperator(block: TsTypeOperator.() -> Unit): TsTypeOperator {
    return TsTypeOperatorImpl().apply(block)
}

/**
 * TsTypeParameter#default: TsType
 * extension function for create TsType -> TsIndexedAccessTypeImpl
 */
fun TsTypeParameter.tsIndexedAccessType(block: TsIndexedAccessType.() -> Unit): TsIndexedAccessType {
    return TsIndexedAccessTypeImpl().apply(block)
}

/**
 * TsTypeParameter#default: TsType
 * extension function for create TsType -> TsMappedTypeImpl
 */
fun TsTypeParameter.tsMappedType(block: TsMappedType.() -> Unit): TsMappedType {
    return TsMappedTypeImpl().apply(block)
}

/**
 * TsTypeParameter#default: TsType
 * extension function for create TsType -> TsLiteralTypeImpl
 */
fun TsTypeParameter.tsLiteralType(block: TsLiteralType.() -> Unit): TsLiteralType {
    return TsLiteralTypeImpl().apply(block)
}

/**
 * TsTypeParameter#default: TsType
 * extension function for create TsType -> TsTypePredicateImpl
 */
fun TsTypeParameter.tsTypePredicate(block: TsTypePredicate.() -> Unit): TsTypePredicate {
    return TsTypePredicateImpl().apply(block)
}

/**
 * TsTypeParameter#default: TsType
 * extension function for create TsType -> TsImportTypeImpl
 */
fun TsTypeParameter.tsImportType(block: TsImportType.() -> Unit): TsImportType {
    return TsImportTypeImpl().apply(block)
}

fun TsTypeParameter.span(block: Span.() -> Unit): Span {
    return Span().apply(block)
}
