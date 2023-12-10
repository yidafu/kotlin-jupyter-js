package dev.yidafu.swc.dsl

import dev.yidafu.swc.types.*

/**
 * TsSatisfiesExpression#expression: Expression
 * extension function for create Expression -> ThisExpressionImpl
 */
fun TsSatisfiesExpression.thisExpression(block: ThisExpression.() -> Unit): ThisExpression {
    return ThisExpressionImpl().apply(block)
}

/**
 * TsSatisfiesExpression#expression: Expression
 * extension function for create Expression -> ArrayExpressionImpl
 */
fun TsSatisfiesExpression.arrayExpression(block: ArrayExpression.() -> Unit): ArrayExpression {
    return ArrayExpressionImpl().apply(block)
}

/**
 * TsSatisfiesExpression#expression: Expression
 * extension function for create Expression -> ObjectExpressionImpl
 */
fun TsSatisfiesExpression.objectExpression(block: ObjectExpression.() -> Unit): ObjectExpression {
    return ObjectExpressionImpl().apply(block)
}

/**
 * TsSatisfiesExpression#expression: Expression
 * extension function for create Expression -> FunctionExpressionImpl
 */
fun TsSatisfiesExpression.functionExpression(block: FunctionExpression.() -> Unit): FunctionExpression {
    return FunctionExpressionImpl().apply(block)
}

/**
 * TsSatisfiesExpression#expression: Expression
 * extension function for create Expression -> UnaryExpressionImpl
 */
fun TsSatisfiesExpression.unaryExpression(block: UnaryExpression.() -> Unit): UnaryExpression {
    return UnaryExpressionImpl().apply(block)
}

/**
 * TsSatisfiesExpression#expression: Expression
 * extension function for create Expression -> UpdateExpressionImpl
 */
fun TsSatisfiesExpression.updateExpression(block: UpdateExpression.() -> Unit): UpdateExpression {
    return UpdateExpressionImpl().apply(block)
}

/**
 * TsSatisfiesExpression#expression: Expression
 * extension function for create Expression -> BinaryExpressionImpl
 */
fun TsSatisfiesExpression.binaryExpression(block: BinaryExpression.() -> Unit): BinaryExpression {
    return BinaryExpressionImpl().apply(block)
}

/**
 * TsSatisfiesExpression#expression: Expression
 * extension function for create Expression -> AssignmentExpressionImpl
 */
fun TsSatisfiesExpression.assignmentExpression(block: AssignmentExpression.() -> Unit): AssignmentExpression {
    return AssignmentExpressionImpl().apply(block)
}

/**
 * TsSatisfiesExpression#expression: Expression
 * extension function for create Expression -> MemberExpressionImpl
 */
fun TsSatisfiesExpression.memberExpression(block: MemberExpression.() -> Unit): MemberExpression {
    return MemberExpressionImpl().apply(block)
}

/**
 * TsSatisfiesExpression#expression: Expression
 * extension function for create Expression -> SuperPropExpressionImpl
 */
fun TsSatisfiesExpression.superPropExpression(block: SuperPropExpression.() -> Unit): SuperPropExpression {
    return SuperPropExpressionImpl().apply(block)
}

/**
 * TsSatisfiesExpression#expression: Expression
 * extension function for create Expression -> ConditionalExpressionImpl
 */
fun TsSatisfiesExpression.conditionalExpression(block: ConditionalExpression.() -> Unit): ConditionalExpression {
    return ConditionalExpressionImpl().apply(block)
}

/**
 * TsSatisfiesExpression#expression: Expression
 * extension function for create Expression -> CallExpressionImpl
 */
fun TsSatisfiesExpression.callExpression(block: CallExpression.() -> Unit): CallExpression {
    return CallExpressionImpl().apply(block)
}

/**
 * TsSatisfiesExpression#expression: Expression
 * extension function for create Expression -> NewExpressionImpl
 */
fun TsSatisfiesExpression.newExpression(block: NewExpression.() -> Unit): NewExpression {
    return NewExpressionImpl().apply(block)
}

/**
 * TsSatisfiesExpression#expression: Expression
 * extension function for create Expression -> SequenceExpressionImpl
 */
fun TsSatisfiesExpression.sequenceExpression(block: SequenceExpression.() -> Unit): SequenceExpression {
    return SequenceExpressionImpl().apply(block)
}

/**
 * TsSatisfiesExpression#expression: Expression
 * extension function for create Expression -> IdentifierImpl
 */
fun TsSatisfiesExpression.identifier(block: Identifier.() -> Unit): Identifier {
    return IdentifierImpl().apply(block)
}

/**
 * TsSatisfiesExpression#expression: Expression
 * extension function for create Expression -> StringLiteralImpl
 */
fun TsSatisfiesExpression.stringLiteral(block: StringLiteral.() -> Unit): StringLiteral {
    return StringLiteralImpl().apply(block)
}

/**
 * TsSatisfiesExpression#expression: Expression
 * extension function for create Expression -> BooleanLiteralImpl
 */
fun TsSatisfiesExpression.booleanLiteral(block: BooleanLiteral.() -> Unit): BooleanLiteral {
    return BooleanLiteralImpl().apply(block)
}

/**
 * TsSatisfiesExpression#expression: Expression
 * extension function for create Expression -> NullLiteralImpl
 */
fun TsSatisfiesExpression.nullLiteral(block: NullLiteral.() -> Unit): NullLiteral {
    return NullLiteralImpl().apply(block)
}

/**
 * TsSatisfiesExpression#expression: Expression
 * extension function for create Expression -> NumericLiteralImpl
 */
fun TsSatisfiesExpression.numericLiteral(block: NumericLiteral.() -> Unit): NumericLiteral {
    return NumericLiteralImpl().apply(block)
}

/**
 * TsSatisfiesExpression#expression: Expression
 * extension function for create Expression -> BigIntLiteralImpl
 */
fun TsSatisfiesExpression.bigIntLiteral(block: BigIntLiteral.() -> Unit): BigIntLiteral {
    return BigIntLiteralImpl().apply(block)
}

/**
 * TsSatisfiesExpression#expression: Expression
 * extension function for create Expression -> RegExpLiteralImpl
 */
fun TsSatisfiesExpression.regExpLiteral(block: RegExpLiteral.() -> Unit): RegExpLiteral {
    return RegExpLiteralImpl().apply(block)
}

/**
 * TsSatisfiesExpression#expression: Expression
 * extension function for create Expression -> JSXTextImpl
 */
fun TsSatisfiesExpression.jSXText(block: JSXText.() -> Unit): JSXText {
    return JSXTextImpl().apply(block)
}

/**
 * TsSatisfiesExpression#expression: Expression
 * extension function for create Expression -> TemplateLiteralImpl
 */
fun TsSatisfiesExpression.templateLiteral(block: TemplateLiteral.() -> Unit): TemplateLiteral {
    return TemplateLiteralImpl().apply(block)
}

/**
 * TsSatisfiesExpression#expression: Expression
 * extension function for create Expression -> TaggedTemplateExpressionImpl
 */
fun TsSatisfiesExpression.taggedTemplateExpression(block: TaggedTemplateExpression.() -> Unit): TaggedTemplateExpression {
    return TaggedTemplateExpressionImpl().apply(block)
}

/**
 * TsSatisfiesExpression#expression: Expression
 * extension function for create Expression -> ArrowFunctionExpressionImpl
 */
fun TsSatisfiesExpression.arrowFunctionExpression(block: ArrowFunctionExpression.() -> Unit): ArrowFunctionExpression {
    return ArrowFunctionExpressionImpl().apply(block)
}

/**
 * TsSatisfiesExpression#expression: Expression
 * extension function for create Expression -> ClassExpressionImpl
 */
fun TsSatisfiesExpression.classExpression(block: ClassExpression.() -> Unit): ClassExpression {
    return ClassExpressionImpl().apply(block)
}

/**
 * TsSatisfiesExpression#expression: Expression
 * extension function for create Expression -> YieldExpressionImpl
 */
fun TsSatisfiesExpression.yieldExpression(block: YieldExpression.() -> Unit): YieldExpression {
    return YieldExpressionImpl().apply(block)
}

/**
 * TsSatisfiesExpression#expression: Expression
 * extension function for create Expression -> MetaPropertyImpl
 */
fun TsSatisfiesExpression.metaProperty(block: MetaProperty.() -> Unit): MetaProperty {
    return MetaPropertyImpl().apply(block)
}

/**
 * TsSatisfiesExpression#expression: Expression
 * extension function for create Expression -> AwaitExpressionImpl
 */
fun TsSatisfiesExpression.awaitExpression(block: AwaitExpression.() -> Unit): AwaitExpression {
    return AwaitExpressionImpl().apply(block)
}

/**
 * TsSatisfiesExpression#expression: Expression
 * extension function for create Expression -> ParenthesisExpressionImpl
 */
fun TsSatisfiesExpression.parenthesisExpression(block: ParenthesisExpression.() -> Unit): ParenthesisExpression {
    return ParenthesisExpressionImpl().apply(block)
}

/**
 * TsSatisfiesExpression#expression: Expression
 * extension function for create Expression -> JSXMemberExpressionImpl
 */
fun TsSatisfiesExpression.jSXMemberExpression(block: JSXMemberExpression.() -> Unit): JSXMemberExpression {
    return JSXMemberExpressionImpl().apply(block)
}

/**
 * TsSatisfiesExpression#expression: Expression
 * extension function for create Expression -> JSXNamespacedNameImpl
 */
fun TsSatisfiesExpression.jSXNamespacedName(block: JSXNamespacedName.() -> Unit): JSXNamespacedName {
    return JSXNamespacedNameImpl().apply(block)
}

/**
 * TsSatisfiesExpression#expression: Expression
 * extension function for create Expression -> JSXEmptyExpressionImpl
 */
fun TsSatisfiesExpression.jSXEmptyExpression(block: JSXEmptyExpression.() -> Unit): JSXEmptyExpression {
    return JSXEmptyExpressionImpl().apply(block)
}

/**
 * TsSatisfiesExpression#expression: Expression
 * extension function for create Expression -> JSXElementImpl
 */
fun TsSatisfiesExpression.jSXElement(block: JSXElement.() -> Unit): JSXElement {
    return JSXElementImpl().apply(block)
}

/**
 * TsSatisfiesExpression#expression: Expression
 * extension function for create Expression -> JSXFragmentImpl
 */
fun TsSatisfiesExpression.jSXFragment(block: JSXFragment.() -> Unit): JSXFragment {
    return JSXFragmentImpl().apply(block)
}

/**
 * TsSatisfiesExpression#expression: Expression
 * extension function for create Expression -> TsTypeAssertionImpl
 */
fun TsSatisfiesExpression.tsTypeAssertion(block: TsTypeAssertion.() -> Unit): TsTypeAssertion {
    return TsTypeAssertionImpl().apply(block)
}

/**
 * TsSatisfiesExpression#expression: Expression
 * extension function for create Expression -> TsConstAssertionImpl
 */
fun TsSatisfiesExpression.tsConstAssertion(block: TsConstAssertion.() -> Unit): TsConstAssertion {
    return TsConstAssertionImpl().apply(block)
}

/**
 * TsSatisfiesExpression#expression: Expression
 * extension function for create Expression -> TsNonNullExpressionImpl
 */
fun TsSatisfiesExpression.tsNonNullExpression(block: TsNonNullExpression.() -> Unit): TsNonNullExpression {
    return TsNonNullExpressionImpl().apply(block)
}

/**
 * TsSatisfiesExpression#expression: Expression
 * extension function for create Expression -> TsAsExpressionImpl
 */
fun TsSatisfiesExpression.tsAsExpression(block: TsAsExpression.() -> Unit): TsAsExpression {
    return TsAsExpressionImpl().apply(block)
}

/**
 * TsSatisfiesExpression#expression: Expression
 * extension function for create Expression -> TsInstantiationImpl
 */
fun TsSatisfiesExpression.tsInstantiation(block: TsInstantiation.() -> Unit): TsInstantiation {
    return TsInstantiationImpl().apply(block)
}

/**
 * TsSatisfiesExpression#expression: Expression
 * extension function for create Expression -> PrivateNameImpl
 */
fun TsSatisfiesExpression.privateName(block: PrivateName.() -> Unit): PrivateName {
    return PrivateNameImpl().apply(block)
}

/**
 * TsSatisfiesExpression#expression: Expression
 * extension function for create Expression -> OptionalChainingExpressionImpl
 */
fun TsSatisfiesExpression.optionalChainingExpression(block: OptionalChainingExpression.() -> Unit): OptionalChainingExpression {
    return OptionalChainingExpressionImpl().apply(block)
}

/**
 * TsSatisfiesExpression#expression: Expression
 * extension function for create Expression -> InvalidImpl
 */
fun TsSatisfiesExpression.invalid(block: Invalid.() -> Unit): Invalid {
    return InvalidImpl().apply(block)
}

/**
 * TsSatisfiesExpression#typeAnnotation: TsType
 * extension function for create TsType -> TsKeywordTypeImpl
 */
fun TsSatisfiesExpression.tsKeywordType(block: TsKeywordType.() -> Unit): TsKeywordType {
    return TsKeywordTypeImpl().apply(block)
}

/**
 * TsSatisfiesExpression#typeAnnotation: TsType
 * extension function for create TsType -> TsThisTypeImpl
 */
fun TsSatisfiesExpression.tsThisType(block: TsThisType.() -> Unit): TsThisType {
    return TsThisTypeImpl().apply(block)
}

/**
 * TsSatisfiesExpression#typeAnnotation: TsType
 * extension function for create TsType -> TsFunctionTypeImpl
 */
fun TsSatisfiesExpression.tsFunctionType(block: TsFunctionType.() -> Unit): TsFunctionType {
    return TsFunctionTypeImpl().apply(block)
}

/**
 * TsSatisfiesExpression#typeAnnotation: TsType
 * extension function for create TsType -> TsConstructorTypeImpl
 */
fun TsSatisfiesExpression.tsConstructorType(block: TsConstructorType.() -> Unit): TsConstructorType {
    return TsConstructorTypeImpl().apply(block)
}

/**
 * TsSatisfiesExpression#typeAnnotation: TsType
 * extension function for create TsType -> TsTypeReferenceImpl
 */
fun TsSatisfiesExpression.tsTypeReference(block: TsTypeReference.() -> Unit): TsTypeReference {
    return TsTypeReferenceImpl().apply(block)
}

/**
 * TsSatisfiesExpression#typeAnnotation: TsType
 * extension function for create TsType -> TsTypeQueryImpl
 */
fun TsSatisfiesExpression.tsTypeQuery(block: TsTypeQuery.() -> Unit): TsTypeQuery {
    return TsTypeQueryImpl().apply(block)
}

/**
 * TsSatisfiesExpression#typeAnnotation: TsType
 * extension function for create TsType -> TsTypeLiteralImpl
 */
fun TsSatisfiesExpression.tsTypeLiteral(block: TsTypeLiteral.() -> Unit): TsTypeLiteral {
    return TsTypeLiteralImpl().apply(block)
}

/**
 * TsSatisfiesExpression#typeAnnotation: TsType
 * extension function for create TsType -> TsArrayTypeImpl
 */
fun TsSatisfiesExpression.tsArrayType(block: TsArrayType.() -> Unit): TsArrayType {
    return TsArrayTypeImpl().apply(block)
}

/**
 * TsSatisfiesExpression#typeAnnotation: TsType
 * extension function for create TsType -> TsTupleTypeImpl
 */
fun TsSatisfiesExpression.tsTupleType(block: TsTupleType.() -> Unit): TsTupleType {
    return TsTupleTypeImpl().apply(block)
}

/**
 * TsSatisfiesExpression#typeAnnotation: TsType
 * extension function for create TsType -> TsOptionalTypeImpl
 */
fun TsSatisfiesExpression.tsOptionalType(block: TsOptionalType.() -> Unit): TsOptionalType {
    return TsOptionalTypeImpl().apply(block)
}

/**
 * TsSatisfiesExpression#typeAnnotation: TsType
 * extension function for create TsType -> TsRestTypeImpl
 */
fun TsSatisfiesExpression.tsRestType(block: TsRestType.() -> Unit): TsRestType {
    return TsRestTypeImpl().apply(block)
}

/**
 * TsSatisfiesExpression#typeAnnotation: TsType
 * extension function for create TsType -> TsUnionTypeImpl
 */
fun TsSatisfiesExpression.tsUnionType(block: TsUnionType.() -> Unit): TsUnionType {
    return TsUnionTypeImpl().apply(block)
}

/**
 * TsSatisfiesExpression#typeAnnotation: TsType
 * extension function for create TsType -> TsIntersectionTypeImpl
 */
fun TsSatisfiesExpression.tsIntersectionType(block: TsIntersectionType.() -> Unit): TsIntersectionType {
    return TsIntersectionTypeImpl().apply(block)
}

/**
 * TsSatisfiesExpression#typeAnnotation: TsType
 * extension function for create TsType -> TsConditionalTypeImpl
 */
fun TsSatisfiesExpression.tsConditionalType(block: TsConditionalType.() -> Unit): TsConditionalType {
    return TsConditionalTypeImpl().apply(block)
}

/**
 * TsSatisfiesExpression#typeAnnotation: TsType
 * extension function for create TsType -> TsInferTypeImpl
 */
fun TsSatisfiesExpression.tsInferType(block: TsInferType.() -> Unit): TsInferType {
    return TsInferTypeImpl().apply(block)
}

/**
 * TsSatisfiesExpression#typeAnnotation: TsType
 * extension function for create TsType -> TsParenthesizedTypeImpl
 */
fun TsSatisfiesExpression.tsParenthesizedType(block: TsParenthesizedType.() -> Unit): TsParenthesizedType {
    return TsParenthesizedTypeImpl().apply(block)
}

/**
 * TsSatisfiesExpression#typeAnnotation: TsType
 * extension function for create TsType -> TsTypeOperatorImpl
 */
fun TsSatisfiesExpression.tsTypeOperator(block: TsTypeOperator.() -> Unit): TsTypeOperator {
    return TsTypeOperatorImpl().apply(block)
}

/**
 * TsSatisfiesExpression#typeAnnotation: TsType
 * extension function for create TsType -> TsIndexedAccessTypeImpl
 */
fun TsSatisfiesExpression.tsIndexedAccessType(block: TsIndexedAccessType.() -> Unit): TsIndexedAccessType {
    return TsIndexedAccessTypeImpl().apply(block)
}

/**
 * TsSatisfiesExpression#typeAnnotation: TsType
 * extension function for create TsType -> TsMappedTypeImpl
 */
fun TsSatisfiesExpression.tsMappedType(block: TsMappedType.() -> Unit): TsMappedType {
    return TsMappedTypeImpl().apply(block)
}

/**
 * TsSatisfiesExpression#typeAnnotation: TsType
 * extension function for create TsType -> TsLiteralTypeImpl
 */
fun TsSatisfiesExpression.tsLiteralType(block: TsLiteralType.() -> Unit): TsLiteralType {
    return TsLiteralTypeImpl().apply(block)
}

/**
 * TsSatisfiesExpression#typeAnnotation: TsType
 * extension function for create TsType -> TsTypePredicateImpl
 */
fun TsSatisfiesExpression.tsTypePredicate(block: TsTypePredicate.() -> Unit): TsTypePredicate {
    return TsTypePredicateImpl().apply(block)
}

/**
 * TsSatisfiesExpression#typeAnnotation: TsType
 * extension function for create TsType -> TsImportTypeImpl
 */
fun TsSatisfiesExpression.tsImportType(block: TsImportType.() -> Unit): TsImportType {
    return TsImportTypeImpl().apply(block)
}

fun TsSatisfiesExpression.span(block: Span.() -> Unit): Span {
    return Span().apply(block)
}
