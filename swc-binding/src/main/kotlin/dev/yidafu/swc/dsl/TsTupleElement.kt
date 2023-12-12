package dev.yidafu.swc.dsl

import dev.yidafu.swc.types.*

/**
 * TsTupleElement#label: Pattern
 * extension function for create Pattern -> BindingIdentifierImpl
 */
fun TsTupleElement.bindingIdentifier(block: BindingIdentifier.() -> Unit): BindingIdentifier {
    return BindingIdentifierImpl().apply(block)
}

/**
 * TsTupleElement#label: Pattern
 * extension function for create Pattern -> ArrayPatternImpl
 */
fun TsTupleElement.arrayPattern(block: ArrayPattern.() -> Unit): ArrayPattern {
    return ArrayPatternImpl().apply(block)
}

/**
 * TsTupleElement#label: Pattern
 * extension function for create Pattern -> RestElementImpl
 */
fun TsTupleElement.restElement(block: RestElement.() -> Unit): RestElement {
    return RestElementImpl().apply(block)
}

/**
 * TsTupleElement#label: Pattern
 * extension function for create Pattern -> ObjectPatternImpl
 */
fun TsTupleElement.objectPattern(block: ObjectPattern.() -> Unit): ObjectPattern {
    return ObjectPatternImpl().apply(block)
}

/**
 * TsTupleElement#label: Pattern
 * extension function for create Pattern -> AssignmentPatternImpl
 */
fun TsTupleElement.assignmentPattern(block: AssignmentPattern.() -> Unit): AssignmentPattern {
    return AssignmentPatternImpl().apply(block)
}

/**
 * TsTupleElement#label: Pattern
 * extension function for create Pattern -> InvalidImpl
 */
fun TsTupleElement.invalid(block: Invalid.() -> Unit): Invalid {
    return InvalidImpl().apply(block)
}

/**
 * TsTupleElement#label: Pattern
 * extension function for create Pattern -> ThisExpressionImpl
 */
fun TsTupleElement.thisExpression(block: ThisExpression.() -> Unit): ThisExpression {
    return ThisExpressionImpl().apply(block)
}

/**
 * TsTupleElement#label: Pattern
 * extension function for create Pattern -> ArrayExpressionImpl
 */
fun TsTupleElement.arrayExpression(block: ArrayExpression.() -> Unit): ArrayExpression {
    return ArrayExpressionImpl().apply(block)
}

/**
 * TsTupleElement#label: Pattern
 * extension function for create Pattern -> ObjectExpressionImpl
 */
fun TsTupleElement.objectExpression(block: ObjectExpression.() -> Unit): ObjectExpression {
    return ObjectExpressionImpl().apply(block)
}

/**
 * TsTupleElement#label: Pattern
 * extension function for create Pattern -> FunctionExpressionImpl
 */
fun TsTupleElement.functionExpression(block: FunctionExpression.() -> Unit): FunctionExpression {
    return FunctionExpressionImpl().apply(block)
}

/**
 * TsTupleElement#label: Pattern
 * extension function for create Pattern -> UnaryExpressionImpl
 */
fun TsTupleElement.unaryExpression(block: UnaryExpression.() -> Unit): UnaryExpression {
    return UnaryExpressionImpl().apply(block)
}

/**
 * TsTupleElement#label: Pattern
 * extension function for create Pattern -> UpdateExpressionImpl
 */
fun TsTupleElement.updateExpression(block: UpdateExpression.() -> Unit): UpdateExpression {
    return UpdateExpressionImpl().apply(block)
}

/**
 * TsTupleElement#label: Pattern
 * extension function for create Pattern -> BinaryExpressionImpl
 */
fun TsTupleElement.binaryExpression(block: BinaryExpression.() -> Unit): BinaryExpression {
    return BinaryExpressionImpl().apply(block)
}

/**
 * TsTupleElement#label: Pattern
 * extension function for create Pattern -> AssignmentExpressionImpl
 */
fun TsTupleElement.assignmentExpression(block: AssignmentExpression.() -> Unit): AssignmentExpression {
    return AssignmentExpressionImpl().apply(block)
}

/**
 * TsTupleElement#label: Pattern
 * extension function for create Pattern -> MemberExpressionImpl
 */
fun TsTupleElement.memberExpression(block: MemberExpression.() -> Unit): MemberExpression {
    return MemberExpressionImpl().apply(block)
}

/**
 * TsTupleElement#label: Pattern
 * extension function for create Pattern -> SuperPropExpressionImpl
 */
fun TsTupleElement.superPropExpression(block: SuperPropExpression.() -> Unit): SuperPropExpression {
    return SuperPropExpressionImpl().apply(block)
}

/**
 * TsTupleElement#label: Pattern
 * extension function for create Pattern -> ConditionalExpressionImpl
 */
fun TsTupleElement.conditionalExpression(block: ConditionalExpression.() -> Unit): ConditionalExpression {
    return ConditionalExpressionImpl().apply(block)
}

/**
 * TsTupleElement#label: Pattern
 * extension function for create Pattern -> CallExpressionImpl
 */
fun TsTupleElement.callExpression(block: CallExpression.() -> Unit): CallExpression {
    return CallExpressionImpl().apply(block)
}

/**
 * TsTupleElement#label: Pattern
 * extension function for create Pattern -> NewExpressionImpl
 */
fun TsTupleElement.newExpression(block: NewExpression.() -> Unit): NewExpression {
    return NewExpressionImpl().apply(block)
}

/**
 * TsTupleElement#label: Pattern
 * extension function for create Pattern -> SequenceExpressionImpl
 */
fun TsTupleElement.sequenceExpression(block: SequenceExpression.() -> Unit): SequenceExpression {
    return SequenceExpressionImpl().apply(block)
}

/**
 * TsTupleElement#label: Pattern
 * extension function for create Pattern -> IdentifierImpl
 */
fun TsTupleElement.identifier(block: Identifier.() -> Unit): Identifier {
    return IdentifierImpl().apply(block)
}

/**
 * TsTupleElement#label: Pattern
 * extension function for create Pattern -> StringLiteralImpl
 */
fun TsTupleElement.stringLiteral(block: StringLiteral.() -> Unit): StringLiteral {
    return StringLiteralImpl().apply(block)
}

/**
 * TsTupleElement#label: Pattern
 * extension function for create Pattern -> BooleanLiteralImpl
 */
fun TsTupleElement.booleanLiteral(block: BooleanLiteral.() -> Unit): BooleanLiteral {
    return BooleanLiteralImpl().apply(block)
}

/**
 * TsTupleElement#label: Pattern
 * extension function for create Pattern -> NullLiteralImpl
 */
fun TsTupleElement.nullLiteral(block: NullLiteral.() -> Unit): NullLiteral {
    return NullLiteralImpl().apply(block)
}

/**
 * TsTupleElement#label: Pattern
 * extension function for create Pattern -> NumericLiteralImpl
 */
fun TsTupleElement.numericLiteral(block: NumericLiteral.() -> Unit): NumericLiteral {
    return NumericLiteralImpl().apply(block)
}

/**
 * TsTupleElement#label: Pattern
 * extension function for create Pattern -> BigIntLiteralImpl
 */
fun TsTupleElement.bigIntLiteral(block: BigIntLiteral.() -> Unit): BigIntLiteral {
    return BigIntLiteralImpl().apply(block)
}

/**
 * TsTupleElement#label: Pattern
 * extension function for create Pattern -> RegExpLiteralImpl
 */
fun TsTupleElement.regExpLiteral(block: RegExpLiteral.() -> Unit): RegExpLiteral {
    return RegExpLiteralImpl().apply(block)
}

/**
 * TsTupleElement#label: Pattern
 * extension function for create Pattern -> JSXTextImpl
 */
fun TsTupleElement.jSXText(block: JSXText.() -> Unit): JSXText {
    return JSXTextImpl().apply(block)
}

/**
 * TsTupleElement#label: Pattern
 * extension function for create Pattern -> TemplateLiteralImpl
 */
fun TsTupleElement.templateLiteral(block: TemplateLiteral.() -> Unit): TemplateLiteral {
    return TemplateLiteralImpl().apply(block)
}

/**
 * TsTupleElement#label: Pattern
 * extension function for create Pattern -> TaggedTemplateExpressionImpl
 */
fun TsTupleElement.taggedTemplateExpression(block: TaggedTemplateExpression.() -> Unit): TaggedTemplateExpression {
    return TaggedTemplateExpressionImpl().apply(block)
}

/**
 * TsTupleElement#label: Pattern
 * extension function for create Pattern -> ArrowFunctionExpressionImpl
 */
fun TsTupleElement.arrowFunctionExpression(block: ArrowFunctionExpression.() -> Unit): ArrowFunctionExpression {
    return ArrowFunctionExpressionImpl().apply(block)
}

/**
 * TsTupleElement#label: Pattern
 * extension function for create Pattern -> ClassExpressionImpl
 */
fun TsTupleElement.classExpression(block: ClassExpression.() -> Unit): ClassExpression {
    return ClassExpressionImpl().apply(block)
}

/**
 * TsTupleElement#label: Pattern
 * extension function for create Pattern -> YieldExpressionImpl
 */
fun TsTupleElement.yieldExpression(block: YieldExpression.() -> Unit): YieldExpression {
    return YieldExpressionImpl().apply(block)
}

/**
 * TsTupleElement#label: Pattern
 * extension function for create Pattern -> MetaPropertyImpl
 */
fun TsTupleElement.metaProperty(block: MetaProperty.() -> Unit): MetaProperty {
    return MetaPropertyImpl().apply(block)
}

/**
 * TsTupleElement#label: Pattern
 * extension function for create Pattern -> AwaitExpressionImpl
 */
fun TsTupleElement.awaitExpression(block: AwaitExpression.() -> Unit): AwaitExpression {
    return AwaitExpressionImpl().apply(block)
}

/**
 * TsTupleElement#label: Pattern
 * extension function for create Pattern -> ParenthesisExpressionImpl
 */
fun TsTupleElement.parenthesisExpression(block: ParenthesisExpression.() -> Unit): ParenthesisExpression {
    return ParenthesisExpressionImpl().apply(block)
}

/**
 * TsTupleElement#label: Pattern
 * extension function for create Pattern -> JSXMemberExpressionImpl
 */
fun TsTupleElement.jSXMemberExpression(block: JSXMemberExpression.() -> Unit): JSXMemberExpression {
    return JSXMemberExpressionImpl().apply(block)
}

/**
 * TsTupleElement#label: Pattern
 * extension function for create Pattern -> JSXNamespacedNameImpl
 */
fun TsTupleElement.jSXNamespacedName(block: JSXNamespacedName.() -> Unit): JSXNamespacedName {
    return JSXNamespacedNameImpl().apply(block)
}

/**
 * TsTupleElement#label: Pattern
 * extension function for create Pattern -> JSXEmptyExpressionImpl
 */
fun TsTupleElement.jSXEmptyExpression(block: JSXEmptyExpression.() -> Unit): JSXEmptyExpression {
    return JSXEmptyExpressionImpl().apply(block)
}

/**
 * TsTupleElement#label: Pattern
 * extension function for create Pattern -> JSXElementImpl
 */
fun TsTupleElement.jSXElement(block: JSXElement.() -> Unit): JSXElement {
    return JSXElementImpl().apply(block)
}

/**
 * TsTupleElement#label: Pattern
 * extension function for create Pattern -> JSXFragmentImpl
 */
fun TsTupleElement.jSXFragment(block: JSXFragment.() -> Unit): JSXFragment {
    return JSXFragmentImpl().apply(block)
}

/**
 * TsTupleElement#label: Pattern
 * extension function for create Pattern -> TsTypeAssertionImpl
 */
fun TsTupleElement.tsTypeAssertion(block: TsTypeAssertion.() -> Unit): TsTypeAssertion {
    return TsTypeAssertionImpl().apply(block)
}

/**
 * TsTupleElement#label: Pattern
 * extension function for create Pattern -> TsConstAssertionImpl
 */
fun TsTupleElement.tsConstAssertion(block: TsConstAssertion.() -> Unit): TsConstAssertion {
    return TsConstAssertionImpl().apply(block)
}

/**
 * TsTupleElement#label: Pattern
 * extension function for create Pattern -> TsNonNullExpressionImpl
 */
fun TsTupleElement.tsNonNullExpression(block: TsNonNullExpression.() -> Unit): TsNonNullExpression {
    return TsNonNullExpressionImpl().apply(block)
}

/**
 * TsTupleElement#label: Pattern
 * extension function for create Pattern -> TsAsExpressionImpl
 */
fun TsTupleElement.tsAsExpression(block: TsAsExpression.() -> Unit): TsAsExpression {
    return TsAsExpressionImpl().apply(block)
}

/**
 * TsTupleElement#label: Pattern
 * extension function for create Pattern -> TsSatisfiesExpressionImpl
 */
fun TsTupleElement.tsSatisfiesExpression(block: TsSatisfiesExpression.() -> Unit): TsSatisfiesExpression {
    return TsSatisfiesExpressionImpl().apply(block)
}

/**
 * TsTupleElement#label: Pattern
 * extension function for create Pattern -> TsInstantiationImpl
 */
fun TsTupleElement.tsInstantiation(block: TsInstantiation.() -> Unit): TsInstantiation {
    return TsInstantiationImpl().apply(block)
}

/**
 * TsTupleElement#label: Pattern
 * extension function for create Pattern -> PrivateNameImpl
 */
fun TsTupleElement.privateName(block: PrivateName.() -> Unit): PrivateName {
    return PrivateNameImpl().apply(block)
}

/**
 * TsTupleElement#label: Pattern
 * extension function for create Pattern -> OptionalChainingExpressionImpl
 */
fun TsTupleElement.optionalChainingExpression(block: OptionalChainingExpression.() -> Unit): OptionalChainingExpression {
    return OptionalChainingExpressionImpl().apply(block)
}

/**
 * TsTupleElement#ty: TsType
 * extension function for create TsType -> TsKeywordTypeImpl
 */
fun TsTupleElement.tsKeywordType(block: TsKeywordType.() -> Unit): TsKeywordType {
    return TsKeywordTypeImpl().apply(block)
}

/**
 * TsTupleElement#ty: TsType
 * extension function for create TsType -> TsThisTypeImpl
 */
fun TsTupleElement.tsThisType(block: TsThisType.() -> Unit): TsThisType {
    return TsThisTypeImpl().apply(block)
}

/**
 * TsTupleElement#ty: TsType
 * extension function for create TsType -> TsFunctionTypeImpl
 */
fun TsTupleElement.tsFunctionType(block: TsFunctionType.() -> Unit): TsFunctionType {
    return TsFunctionTypeImpl().apply(block)
}

/**
 * TsTupleElement#ty: TsType
 * extension function for create TsType -> TsConstructorTypeImpl
 */
fun TsTupleElement.tsConstructorType(block: TsConstructorType.() -> Unit): TsConstructorType {
    return TsConstructorTypeImpl().apply(block)
}

/**
 * TsTupleElement#ty: TsType
 * extension function for create TsType -> TsTypeReferenceImpl
 */
fun TsTupleElement.tsTypeReference(block: TsTypeReference.() -> Unit): TsTypeReference {
    return TsTypeReferenceImpl().apply(block)
}

/**
 * TsTupleElement#ty: TsType
 * extension function for create TsType -> TsTypeQueryImpl
 */
fun TsTupleElement.tsTypeQuery(block: TsTypeQuery.() -> Unit): TsTypeQuery {
    return TsTypeQueryImpl().apply(block)
}

/**
 * TsTupleElement#ty: TsType
 * extension function for create TsType -> TsTypeLiteralImpl
 */
fun TsTupleElement.tsTypeLiteral(block: TsTypeLiteral.() -> Unit): TsTypeLiteral {
    return TsTypeLiteralImpl().apply(block)
}

/**
 * TsTupleElement#ty: TsType
 * extension function for create TsType -> TsArrayTypeImpl
 */
fun TsTupleElement.tsArrayType(block: TsArrayType.() -> Unit): TsArrayType {
    return TsArrayTypeImpl().apply(block)
}

/**
 * TsTupleElement#ty: TsType
 * extension function for create TsType -> TsTupleTypeImpl
 */
fun TsTupleElement.tsTupleType(block: TsTupleType.() -> Unit): TsTupleType {
    return TsTupleTypeImpl().apply(block)
}

/**
 * TsTupleElement#ty: TsType
 * extension function for create TsType -> TsOptionalTypeImpl
 */
fun TsTupleElement.tsOptionalType(block: TsOptionalType.() -> Unit): TsOptionalType {
    return TsOptionalTypeImpl().apply(block)
}

/**
 * TsTupleElement#ty: TsType
 * extension function for create TsType -> TsRestTypeImpl
 */
fun TsTupleElement.tsRestType(block: TsRestType.() -> Unit): TsRestType {
    return TsRestTypeImpl().apply(block)
}

/**
 * TsTupleElement#ty: TsType
 * extension function for create TsType -> TsUnionTypeImpl
 */
fun TsTupleElement.tsUnionType(block: TsUnionType.() -> Unit): TsUnionType {
    return TsUnionTypeImpl().apply(block)
}

/**
 * TsTupleElement#ty: TsType
 * extension function for create TsType -> TsIntersectionTypeImpl
 */
fun TsTupleElement.tsIntersectionType(block: TsIntersectionType.() -> Unit): TsIntersectionType {
    return TsIntersectionTypeImpl().apply(block)
}

/**
 * TsTupleElement#ty: TsType
 * extension function for create TsType -> TsConditionalTypeImpl
 */
fun TsTupleElement.tsConditionalType(block: TsConditionalType.() -> Unit): TsConditionalType {
    return TsConditionalTypeImpl().apply(block)
}

/**
 * TsTupleElement#ty: TsType
 * extension function for create TsType -> TsInferTypeImpl
 */
fun TsTupleElement.tsInferType(block: TsInferType.() -> Unit): TsInferType {
    return TsInferTypeImpl().apply(block)
}

/**
 * TsTupleElement#ty: TsType
 * extension function for create TsType -> TsParenthesizedTypeImpl
 */
fun TsTupleElement.tsParenthesizedType(block: TsParenthesizedType.() -> Unit): TsParenthesizedType {
    return TsParenthesizedTypeImpl().apply(block)
}

/**
 * TsTupleElement#ty: TsType
 * extension function for create TsType -> TsTypeOperatorImpl
 */
fun TsTupleElement.tsTypeOperator(block: TsTypeOperator.() -> Unit): TsTypeOperator {
    return TsTypeOperatorImpl().apply(block)
}

/**
 * TsTupleElement#ty: TsType
 * extension function for create TsType -> TsIndexedAccessTypeImpl
 */
fun TsTupleElement.tsIndexedAccessType(block: TsIndexedAccessType.() -> Unit): TsIndexedAccessType {
    return TsIndexedAccessTypeImpl().apply(block)
}

/**
 * TsTupleElement#ty: TsType
 * extension function for create TsType -> TsMappedTypeImpl
 */
fun TsTupleElement.tsMappedType(block: TsMappedType.() -> Unit): TsMappedType {
    return TsMappedTypeImpl().apply(block)
}

/**
 * TsTupleElement#ty: TsType
 * extension function for create TsType -> TsLiteralTypeImpl
 */
fun TsTupleElement.tsLiteralType(block: TsLiteralType.() -> Unit): TsLiteralType {
    return TsLiteralTypeImpl().apply(block)
}

/**
 * TsTupleElement#ty: TsType
 * extension function for create TsType -> TsTypePredicateImpl
 */
fun TsTupleElement.tsTypePredicate(block: TsTypePredicate.() -> Unit): TsTypePredicate {
    return TsTypePredicateImpl().apply(block)
}

/**
 * TsTupleElement#ty: TsType
 * extension function for create TsType -> TsImportTypeImpl
 */
fun TsTupleElement.tsImportType(block: TsImportType.() -> Unit): TsImportType {
    return TsImportTypeImpl().apply(block)
}

fun TsTupleElement.span(block: Span.() -> Unit): Span {
    return Span().apply(block)
}
