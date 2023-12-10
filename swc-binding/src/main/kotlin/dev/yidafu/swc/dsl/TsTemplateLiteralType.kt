package dev.yidafu.swc.dsl

import dev.yidafu.swc.types.*

/**
 * TsTemplateLiteralType#types: Array<TsType>
 * extension function for create Array<TsType> -> TsKeywordTypeImpl
 */
fun TsTemplateLiteralType.tsKeywordType(block: TsKeywordType.() -> Unit): TsKeywordType {
    return TsKeywordTypeImpl().apply(block)
}

/**
 * TsTemplateLiteralType#types: Array<TsType>
 * extension function for create Array<TsType> -> TsThisTypeImpl
 */
fun TsTemplateLiteralType.tsThisType(block: TsThisType.() -> Unit): TsThisType {
    return TsThisTypeImpl().apply(block)
}

/**
 * TsTemplateLiteralType#types: Array<TsType>
 * extension function for create Array<TsType> -> TsFunctionTypeImpl
 */
fun TsTemplateLiteralType.tsFunctionType(block: TsFunctionType.() -> Unit): TsFunctionType {
    return TsFunctionTypeImpl().apply(block)
}

/**
 * TsTemplateLiteralType#types: Array<TsType>
 * extension function for create Array<TsType> -> TsConstructorTypeImpl
 */
fun TsTemplateLiteralType.tsConstructorType(block: TsConstructorType.() -> Unit): TsConstructorType {
    return TsConstructorTypeImpl().apply(block)
}

/**
 * TsTemplateLiteralType#types: Array<TsType>
 * extension function for create Array<TsType> -> TsTypeReferenceImpl
 */
fun TsTemplateLiteralType.tsTypeReference(block: TsTypeReference.() -> Unit): TsTypeReference {
    return TsTypeReferenceImpl().apply(block)
}

/**
 * TsTemplateLiteralType#types: Array<TsType>
 * extension function for create Array<TsType> -> TsTypeQueryImpl
 */
fun TsTemplateLiteralType.tsTypeQuery(block: TsTypeQuery.() -> Unit): TsTypeQuery {
    return TsTypeQueryImpl().apply(block)
}

/**
 * TsTemplateLiteralType#types: Array<TsType>
 * extension function for create Array<TsType> -> TsTypeLiteralImpl
 */
fun TsTemplateLiteralType.tsTypeLiteral(block: TsTypeLiteral.() -> Unit): TsTypeLiteral {
    return TsTypeLiteralImpl().apply(block)
}

/**
 * TsTemplateLiteralType#types: Array<TsType>
 * extension function for create Array<TsType> -> TsArrayTypeImpl
 */
fun TsTemplateLiteralType.tsArrayType(block: TsArrayType.() -> Unit): TsArrayType {
    return TsArrayTypeImpl().apply(block)
}

/**
 * TsTemplateLiteralType#types: Array<TsType>
 * extension function for create Array<TsType> -> TsTupleTypeImpl
 */
fun TsTemplateLiteralType.tsTupleType(block: TsTupleType.() -> Unit): TsTupleType {
    return TsTupleTypeImpl().apply(block)
}

/**
 * TsTemplateLiteralType#types: Array<TsType>
 * extension function for create Array<TsType> -> TsOptionalTypeImpl
 */
fun TsTemplateLiteralType.tsOptionalType(block: TsOptionalType.() -> Unit): TsOptionalType {
    return TsOptionalTypeImpl().apply(block)
}

/**
 * TsTemplateLiteralType#types: Array<TsType>
 * extension function for create Array<TsType> -> TsRestTypeImpl
 */
fun TsTemplateLiteralType.tsRestType(block: TsRestType.() -> Unit): TsRestType {
    return TsRestTypeImpl().apply(block)
}

/**
 * TsTemplateLiteralType#types: Array<TsType>
 * extension function for create Array<TsType> -> TsUnionTypeImpl
 */
fun TsTemplateLiteralType.tsUnionType(block: TsUnionType.() -> Unit): TsUnionType {
    return TsUnionTypeImpl().apply(block)
}

/**
 * TsTemplateLiteralType#types: Array<TsType>
 * extension function for create Array<TsType> -> TsIntersectionTypeImpl
 */
fun TsTemplateLiteralType.tsIntersectionType(block: TsIntersectionType.() -> Unit): TsIntersectionType {
    return TsIntersectionTypeImpl().apply(block)
}

/**
 * TsTemplateLiteralType#types: Array<TsType>
 * extension function for create Array<TsType> -> TsConditionalTypeImpl
 */
fun TsTemplateLiteralType.tsConditionalType(block: TsConditionalType.() -> Unit): TsConditionalType {
    return TsConditionalTypeImpl().apply(block)
}

/**
 * TsTemplateLiteralType#types: Array<TsType>
 * extension function for create Array<TsType> -> TsInferTypeImpl
 */
fun TsTemplateLiteralType.tsInferType(block: TsInferType.() -> Unit): TsInferType {
    return TsInferTypeImpl().apply(block)
}

/**
 * TsTemplateLiteralType#types: Array<TsType>
 * extension function for create Array<TsType> -> TsParenthesizedTypeImpl
 */
fun TsTemplateLiteralType.tsParenthesizedType(block: TsParenthesizedType.() -> Unit): TsParenthesizedType {
    return TsParenthesizedTypeImpl().apply(block)
}

/**
 * TsTemplateLiteralType#types: Array<TsType>
 * extension function for create Array<TsType> -> TsTypeOperatorImpl
 */
fun TsTemplateLiteralType.tsTypeOperator(block: TsTypeOperator.() -> Unit): TsTypeOperator {
    return TsTypeOperatorImpl().apply(block)
}

/**
 * TsTemplateLiteralType#types: Array<TsType>
 * extension function for create Array<TsType> -> TsIndexedAccessTypeImpl
 */
fun TsTemplateLiteralType.tsIndexedAccessType(block: TsIndexedAccessType.() -> Unit): TsIndexedAccessType {
    return TsIndexedAccessTypeImpl().apply(block)
}

/**
 * TsTemplateLiteralType#types: Array<TsType>
 * extension function for create Array<TsType> -> TsMappedTypeImpl
 */
fun TsTemplateLiteralType.tsMappedType(block: TsMappedType.() -> Unit): TsMappedType {
    return TsMappedTypeImpl().apply(block)
}

/**
 * TsTemplateLiteralType#types: Array<TsType>
 * extension function for create Array<TsType> -> TsLiteralTypeImpl
 */
fun TsTemplateLiteralType.tsLiteralType(block: TsLiteralType.() -> Unit): TsLiteralType {
    return TsLiteralTypeImpl().apply(block)
}

/**
 * TsTemplateLiteralType#types: Array<TsType>
 * extension function for create Array<TsType> -> TsTypePredicateImpl
 */
fun TsTemplateLiteralType.tsTypePredicate(block: TsTypePredicate.() -> Unit): TsTypePredicate {
    return TsTypePredicateImpl().apply(block)
}

/**
 * TsTemplateLiteralType#types: Array<TsType>
 * extension function for create Array<TsType> -> TsImportTypeImpl
 */
fun TsTemplateLiteralType.tsImportType(block: TsImportType.() -> Unit): TsImportType {
    return TsImportTypeImpl().apply(block)
}

/**
 * TsTemplateLiteralType#quasis: Array<TemplateElement>
 * extension function for create Array<TemplateElement> -> TemplateElementImpl
 */
fun TsTemplateLiteralType.templateElement(block: TemplateElement.() -> Unit): TemplateElement {
    return TemplateElementImpl().apply(block)
}

fun TsTemplateLiteralType.span(block: Span.() -> Unit): Span {
    return Span().apply(block)
}
