package dev.yidafu.swc.dsl

import dev.yidafu.swc.types.*

/**
 * subtype of TsType
 */
fun TsType.tsKeywordType(block: TsKeywordType.() -> Unit): TsKeywordType {
    return TsKeywordTypeImpl().apply(block)
}

/**
 * subtype of TsType
 */
fun TsType.tsThisType(block: TsThisType.() -> Unit): TsThisType {
    return TsThisTypeImpl().apply(block)
}

/**
 * subtype of TsType
 */
fun TsType.tsFunctionType(block: TsFunctionType.() -> Unit): TsFunctionType {
    return TsFunctionTypeImpl().apply(block)
}

/**
 * subtype of TsType
 */
fun TsType.tsConstructorType(block: TsConstructorType.() -> Unit): TsConstructorType {
    return TsConstructorTypeImpl().apply(block)
}

/**
 * subtype of TsType
 */
fun TsType.tsTypeReference(block: TsTypeReference.() -> Unit): TsTypeReference {
    return TsTypeReferenceImpl().apply(block)
}

/**
 * subtype of TsType
 */
fun TsType.tsTypeQuery(block: TsTypeQuery.() -> Unit): TsTypeQuery {
    return TsTypeQueryImpl().apply(block)
}

/**
 * subtype of TsType
 */
fun TsType.tsTypeLiteral(block: TsTypeLiteral.() -> Unit): TsTypeLiteral {
    return TsTypeLiteralImpl().apply(block)
}

/**
 * subtype of TsType
 */
fun TsType.tsArrayType(block: TsArrayType.() -> Unit): TsArrayType {
    return TsArrayTypeImpl().apply(block)
}

/**
 * subtype of TsType
 */
fun TsType.tsTupleType(block: TsTupleType.() -> Unit): TsTupleType {
    return TsTupleTypeImpl().apply(block)
}

/**
 * subtype of TsType
 */
fun TsType.tsOptionalType(block: TsOptionalType.() -> Unit): TsOptionalType {
    return TsOptionalTypeImpl().apply(block)
}

/**
 * subtype of TsType
 */
fun TsType.tsRestType(block: TsRestType.() -> Unit): TsRestType {
    return TsRestTypeImpl().apply(block)
}

/**
 * subtype of TsType
 */
fun TsType.tsUnionType(block: TsUnionType.() -> Unit): TsUnionType {
    return TsUnionTypeImpl().apply(block)
}

/**
 * subtype of TsType
 */
fun TsType.tsIntersectionType(block: TsIntersectionType.() -> Unit): TsIntersectionType {
    return TsIntersectionTypeImpl().apply(block)
}

/**
 * subtype of TsType
 */
fun TsType.tsConditionalType(block: TsConditionalType.() -> Unit): TsConditionalType {
    return TsConditionalTypeImpl().apply(block)
}

/**
 * subtype of TsType
 */
fun TsType.tsInferType(block: TsInferType.() -> Unit): TsInferType {
    return TsInferTypeImpl().apply(block)
}

/**
 * subtype of TsType
 */
fun TsType.tsParenthesizedType(block: TsParenthesizedType.() -> Unit): TsParenthesizedType {
    return TsParenthesizedTypeImpl().apply(block)
}

/**
 * subtype of TsType
 */
fun TsType.tsTypeOperator(block: TsTypeOperator.() -> Unit): TsTypeOperator {
    return TsTypeOperatorImpl().apply(block)
}

/**
 * subtype of TsType
 */
fun TsType.tsIndexedAccessType(block: TsIndexedAccessType.() -> Unit): TsIndexedAccessType {
    return TsIndexedAccessTypeImpl().apply(block)
}

/**
 * subtype of TsType
 */
fun TsType.tsMappedType(block: TsMappedType.() -> Unit): TsMappedType {
    return TsMappedTypeImpl().apply(block)
}

/**
 * subtype of TsType
 */
fun TsType.tsLiteralType(block: TsLiteralType.() -> Unit): TsLiteralType {
    return TsLiteralTypeImpl().apply(block)
}

/**
 * subtype of TsType
 */
fun TsType.tsTypePredicate(block: TsTypePredicate.() -> Unit): TsTypePredicate {
    return TsTypePredicateImpl().apply(block)
}

/**
 * subtype of TsType
 */
fun TsType.tsImportType(block: TsImportType.() -> Unit): TsImportType {
    return TsImportTypeImpl().apply(block)
}
