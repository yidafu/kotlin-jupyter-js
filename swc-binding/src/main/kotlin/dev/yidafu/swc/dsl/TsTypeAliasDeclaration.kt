package dev.yidafu.swc.dsl

import dev.yidafu.swc.types.*

/**
 * TsTypeAliasDeclaration#id: Identifier
 * extension function for create Identifier -> IdentifierImpl
 */
fun TsTypeAliasDeclaration.identifier(block: Identifier.() -> Unit): Identifier {
    return IdentifierImpl().apply(block)
}

/**
 * TsTypeAliasDeclaration#typeParams: TsTypeParameterDeclaration
 * extension function for create TsTypeParameterDeclaration -> TsTypeParameterDeclarationImpl
 */
fun TsTypeAliasDeclaration.tsTypeParameterDeclaration(block: TsTypeParameterDeclaration.() -> Unit): TsTypeParameterDeclaration {
    return TsTypeParameterDeclarationImpl().apply(block)
}

/**
 * TsTypeAliasDeclaration#typeAnnotation: TsType
 * extension function for create TsType -> TsKeywordTypeImpl
 */
fun TsTypeAliasDeclaration.tsKeywordType(block: TsKeywordType.() -> Unit): TsKeywordType {
    return TsKeywordTypeImpl().apply(block)
}

/**
 * TsTypeAliasDeclaration#typeAnnotation: TsType
 * extension function for create TsType -> TsThisTypeImpl
 */
fun TsTypeAliasDeclaration.tsThisType(block: TsThisType.() -> Unit): TsThisType {
    return TsThisTypeImpl().apply(block)
}

/**
 * TsTypeAliasDeclaration#typeAnnotation: TsType
 * extension function for create TsType -> TsFunctionTypeImpl
 */
fun TsTypeAliasDeclaration.tsFunctionType(block: TsFunctionType.() -> Unit): TsFunctionType {
    return TsFunctionTypeImpl().apply(block)
}

/**
 * TsTypeAliasDeclaration#typeAnnotation: TsType
 * extension function for create TsType -> TsConstructorTypeImpl
 */
fun TsTypeAliasDeclaration.tsConstructorType(block: TsConstructorType.() -> Unit): TsConstructorType {
    return TsConstructorTypeImpl().apply(block)
}

/**
 * TsTypeAliasDeclaration#typeAnnotation: TsType
 * extension function for create TsType -> TsTypeReferenceImpl
 */
fun TsTypeAliasDeclaration.tsTypeReference(block: TsTypeReference.() -> Unit): TsTypeReference {
    return TsTypeReferenceImpl().apply(block)
}

/**
 * TsTypeAliasDeclaration#typeAnnotation: TsType
 * extension function for create TsType -> TsTypeQueryImpl
 */
fun TsTypeAliasDeclaration.tsTypeQuery(block: TsTypeQuery.() -> Unit): TsTypeQuery {
    return TsTypeQueryImpl().apply(block)
}

/**
 * TsTypeAliasDeclaration#typeAnnotation: TsType
 * extension function for create TsType -> TsTypeLiteralImpl
 */
fun TsTypeAliasDeclaration.tsTypeLiteral(block: TsTypeLiteral.() -> Unit): TsTypeLiteral {
    return TsTypeLiteralImpl().apply(block)
}

/**
 * TsTypeAliasDeclaration#typeAnnotation: TsType
 * extension function for create TsType -> TsArrayTypeImpl
 */
fun TsTypeAliasDeclaration.tsArrayType(block: TsArrayType.() -> Unit): TsArrayType {
    return TsArrayTypeImpl().apply(block)
}

/**
 * TsTypeAliasDeclaration#typeAnnotation: TsType
 * extension function for create TsType -> TsTupleTypeImpl
 */
fun TsTypeAliasDeclaration.tsTupleType(block: TsTupleType.() -> Unit): TsTupleType {
    return TsTupleTypeImpl().apply(block)
}

/**
 * TsTypeAliasDeclaration#typeAnnotation: TsType
 * extension function for create TsType -> TsOptionalTypeImpl
 */
fun TsTypeAliasDeclaration.tsOptionalType(block: TsOptionalType.() -> Unit): TsOptionalType {
    return TsOptionalTypeImpl().apply(block)
}

/**
 * TsTypeAliasDeclaration#typeAnnotation: TsType
 * extension function for create TsType -> TsRestTypeImpl
 */
fun TsTypeAliasDeclaration.tsRestType(block: TsRestType.() -> Unit): TsRestType {
    return TsRestTypeImpl().apply(block)
}

/**
 * TsTypeAliasDeclaration#typeAnnotation: TsType
 * extension function for create TsType -> TsUnionTypeImpl
 */
fun TsTypeAliasDeclaration.tsUnionType(block: TsUnionType.() -> Unit): TsUnionType {
    return TsUnionTypeImpl().apply(block)
}

/**
 * TsTypeAliasDeclaration#typeAnnotation: TsType
 * extension function for create TsType -> TsIntersectionTypeImpl
 */
fun TsTypeAliasDeclaration.tsIntersectionType(block: TsIntersectionType.() -> Unit): TsIntersectionType {
    return TsIntersectionTypeImpl().apply(block)
}

/**
 * TsTypeAliasDeclaration#typeAnnotation: TsType
 * extension function for create TsType -> TsConditionalTypeImpl
 */
fun TsTypeAliasDeclaration.tsConditionalType(block: TsConditionalType.() -> Unit): TsConditionalType {
    return TsConditionalTypeImpl().apply(block)
}

/**
 * TsTypeAliasDeclaration#typeAnnotation: TsType
 * extension function for create TsType -> TsInferTypeImpl
 */
fun TsTypeAliasDeclaration.tsInferType(block: TsInferType.() -> Unit): TsInferType {
    return TsInferTypeImpl().apply(block)
}

/**
 * TsTypeAliasDeclaration#typeAnnotation: TsType
 * extension function for create TsType -> TsParenthesizedTypeImpl
 */
fun TsTypeAliasDeclaration.tsParenthesizedType(block: TsParenthesizedType.() -> Unit): TsParenthesizedType {
    return TsParenthesizedTypeImpl().apply(block)
}

/**
 * TsTypeAliasDeclaration#typeAnnotation: TsType
 * extension function for create TsType -> TsTypeOperatorImpl
 */
fun TsTypeAliasDeclaration.tsTypeOperator(block: TsTypeOperator.() -> Unit): TsTypeOperator {
    return TsTypeOperatorImpl().apply(block)
}

/**
 * TsTypeAliasDeclaration#typeAnnotation: TsType
 * extension function for create TsType -> TsIndexedAccessTypeImpl
 */
fun TsTypeAliasDeclaration.tsIndexedAccessType(block: TsIndexedAccessType.() -> Unit): TsIndexedAccessType {
    return TsIndexedAccessTypeImpl().apply(block)
}

/**
 * TsTypeAliasDeclaration#typeAnnotation: TsType
 * extension function for create TsType -> TsMappedTypeImpl
 */
fun TsTypeAliasDeclaration.tsMappedType(block: TsMappedType.() -> Unit): TsMappedType {
    return TsMappedTypeImpl().apply(block)
}

/**
 * TsTypeAliasDeclaration#typeAnnotation: TsType
 * extension function for create TsType -> TsLiteralTypeImpl
 */
fun TsTypeAliasDeclaration.tsLiteralType(block: TsLiteralType.() -> Unit): TsLiteralType {
    return TsLiteralTypeImpl().apply(block)
}

/**
 * TsTypeAliasDeclaration#typeAnnotation: TsType
 * extension function for create TsType -> TsTypePredicateImpl
 */
fun TsTypeAliasDeclaration.tsTypePredicate(block: TsTypePredicate.() -> Unit): TsTypePredicate {
    return TsTypePredicateImpl().apply(block)
}

/**
 * TsTypeAliasDeclaration#typeAnnotation: TsType
 * extension function for create TsType -> TsImportTypeImpl
 */
fun TsTypeAliasDeclaration.tsImportType(block: TsImportType.() -> Unit): TsImportType {
    return TsImportTypeImpl().apply(block)
}

fun TsTypeAliasDeclaration.span(block: Span.() -> Unit): Span {
    return Span().apply(block)
}
