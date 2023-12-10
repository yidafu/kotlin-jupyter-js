package dev.yidafu.swc.dsl

import dev.yidafu.swc.types.*

/**
 * TsTypeAssertion#expression: Expression
 * extension function for create Expression -> ThisExpressionImpl
 */
fun TsTypeAssertion.thisExpression(block: ThisExpression.() -> Unit): ThisExpression {
    return ThisExpressionImpl().apply(block)
}

/**
 * TsTypeAssertion#expression: Expression
 * extension function for create Expression -> ArrayExpressionImpl
 */
fun TsTypeAssertion.arrayExpression(block: ArrayExpression.() -> Unit): ArrayExpression {
    return ArrayExpressionImpl().apply(block)
}

/**
 * TsTypeAssertion#expression: Expression
 * extension function for create Expression -> ObjectExpressionImpl
 */
fun TsTypeAssertion.objectExpression(block: ObjectExpression.() -> Unit): ObjectExpression {
    return ObjectExpressionImpl().apply(block)
}

/**
 * TsTypeAssertion#expression: Expression
 * extension function for create Expression -> FunctionExpressionImpl
 */
fun TsTypeAssertion.functionExpression(block: FunctionExpression.() -> Unit): FunctionExpression {
    return FunctionExpressionImpl().apply(block)
}

/**
 * TsTypeAssertion#expression: Expression
 * extension function for create Expression -> UnaryExpressionImpl
 */
fun TsTypeAssertion.unaryExpression(block: UnaryExpression.() -> Unit): UnaryExpression {
    return UnaryExpressionImpl().apply(block)
}

/**
 * TsTypeAssertion#expression: Expression
 * extension function for create Expression -> UpdateExpressionImpl
 */
fun TsTypeAssertion.updateExpression(block: UpdateExpression.() -> Unit): UpdateExpression {
    return UpdateExpressionImpl().apply(block)
}

/**
 * TsTypeAssertion#expression: Expression
 * extension function for create Expression -> BinaryExpressionImpl
 */
fun TsTypeAssertion.binaryExpression(block: BinaryExpression.() -> Unit): BinaryExpression {
    return BinaryExpressionImpl().apply(block)
}

/**
 * TsTypeAssertion#expression: Expression
 * extension function for create Expression -> AssignmentExpressionImpl
 */
fun TsTypeAssertion.assignmentExpression(block: AssignmentExpression.() -> Unit): AssignmentExpression {
    return AssignmentExpressionImpl().apply(block)
}

/**
 * TsTypeAssertion#expression: Expression
 * extension function for create Expression -> MemberExpressionImpl
 */
fun TsTypeAssertion.memberExpression(block: MemberExpression.() -> Unit): MemberExpression {
    return MemberExpressionImpl().apply(block)
}

/**
 * TsTypeAssertion#expression: Expression
 * extension function for create Expression -> SuperPropExpressionImpl
 */
fun TsTypeAssertion.superPropExpression(block: SuperPropExpression.() -> Unit): SuperPropExpression {
    return SuperPropExpressionImpl().apply(block)
}

/**
 * TsTypeAssertion#expression: Expression
 * extension function for create Expression -> ConditionalExpressionImpl
 */
fun TsTypeAssertion.conditionalExpression(block: ConditionalExpression.() -> Unit): ConditionalExpression {
    return ConditionalExpressionImpl().apply(block)
}

/**
 * TsTypeAssertion#expression: Expression
 * extension function for create Expression -> CallExpressionImpl
 */
fun TsTypeAssertion.callExpression(block: CallExpression.() -> Unit): CallExpression {
    return CallExpressionImpl().apply(block)
}

/**
 * TsTypeAssertion#expression: Expression
 * extension function for create Expression -> NewExpressionImpl
 */
fun TsTypeAssertion.newExpression(block: NewExpression.() -> Unit): NewExpression {
    return NewExpressionImpl().apply(block)
}

/**
 * TsTypeAssertion#expression: Expression
 * extension function for create Expression -> SequenceExpressionImpl
 */
fun TsTypeAssertion.sequenceExpression(block: SequenceExpression.() -> Unit): SequenceExpression {
    return SequenceExpressionImpl().apply(block)
}

/**
 * TsTypeAssertion#expression: Expression
 * extension function for create Expression -> IdentifierImpl
 */
fun TsTypeAssertion.identifier(block: Identifier.() -> Unit): Identifier {
    return IdentifierImpl().apply(block)
}

/**
 * TsTypeAssertion#expression: Expression
 * extension function for create Expression -> StringLiteralImpl
 */
fun TsTypeAssertion.stringLiteral(block: StringLiteral.() -> Unit): StringLiteral {
    return StringLiteralImpl().apply(block)
}

/**
 * TsTypeAssertion#expression: Expression
 * extension function for create Expression -> BooleanLiteralImpl
 */
fun TsTypeAssertion.booleanLiteral(block: BooleanLiteral.() -> Unit): BooleanLiteral {
    return BooleanLiteralImpl().apply(block)
}

/**
 * TsTypeAssertion#expression: Expression
 * extension function for create Expression -> NullLiteralImpl
 */
fun TsTypeAssertion.nullLiteral(block: NullLiteral.() -> Unit): NullLiteral {
    return NullLiteralImpl().apply(block)
}

/**
 * TsTypeAssertion#expression: Expression
 * extension function for create Expression -> NumericLiteralImpl
 */
fun TsTypeAssertion.numericLiteral(block: NumericLiteral.() -> Unit): NumericLiteral {
    return NumericLiteralImpl().apply(block)
}

/**
 * TsTypeAssertion#expression: Expression
 * extension function for create Expression -> BigIntLiteralImpl
 */
fun TsTypeAssertion.bigIntLiteral(block: BigIntLiteral.() -> Unit): BigIntLiteral {
    return BigIntLiteralImpl().apply(block)
}

/**
 * TsTypeAssertion#expression: Expression
 * extension function for create Expression -> RegExpLiteralImpl
 */
fun TsTypeAssertion.regExpLiteral(block: RegExpLiteral.() -> Unit): RegExpLiteral {
    return RegExpLiteralImpl().apply(block)
}

/**
 * TsTypeAssertion#expression: Expression
 * extension function for create Expression -> JSXTextImpl
 */
fun TsTypeAssertion.jSXText(block: JSXText.() -> Unit): JSXText {
    return JSXTextImpl().apply(block)
}

/**
 * TsTypeAssertion#expression: Expression
 * extension function for create Expression -> TemplateLiteralImpl
 */
fun TsTypeAssertion.templateLiteral(block: TemplateLiteral.() -> Unit): TemplateLiteral {
    return TemplateLiteralImpl().apply(block)
}

/**
 * TsTypeAssertion#expression: Expression
 * extension function for create Expression -> TaggedTemplateExpressionImpl
 */
fun TsTypeAssertion.taggedTemplateExpression(block: TaggedTemplateExpression.() -> Unit): TaggedTemplateExpression {
    return TaggedTemplateExpressionImpl().apply(block)
}

/**
 * TsTypeAssertion#expression: Expression
 * extension function for create Expression -> ArrowFunctionExpressionImpl
 */
fun TsTypeAssertion.arrowFunctionExpression(block: ArrowFunctionExpression.() -> Unit): ArrowFunctionExpression {
    return ArrowFunctionExpressionImpl().apply(block)
}

/**
 * TsTypeAssertion#expression: Expression
 * extension function for create Expression -> ClassExpressionImpl
 */
fun TsTypeAssertion.classExpression(block: ClassExpression.() -> Unit): ClassExpression {
    return ClassExpressionImpl().apply(block)
}

/**
 * TsTypeAssertion#expression: Expression
 * extension function for create Expression -> YieldExpressionImpl
 */
fun TsTypeAssertion.yieldExpression(block: YieldExpression.() -> Unit): YieldExpression {
    return YieldExpressionImpl().apply(block)
}

/**
 * TsTypeAssertion#expression: Expression
 * extension function for create Expression -> MetaPropertyImpl
 */
fun TsTypeAssertion.metaProperty(block: MetaProperty.() -> Unit): MetaProperty {
    return MetaPropertyImpl().apply(block)
}

/**
 * TsTypeAssertion#expression: Expression
 * extension function for create Expression -> AwaitExpressionImpl
 */
fun TsTypeAssertion.awaitExpression(block: AwaitExpression.() -> Unit): AwaitExpression {
    return AwaitExpressionImpl().apply(block)
}

/**
 * TsTypeAssertion#expression: Expression
 * extension function for create Expression -> ParenthesisExpressionImpl
 */
fun TsTypeAssertion.parenthesisExpression(block: ParenthesisExpression.() -> Unit): ParenthesisExpression {
    return ParenthesisExpressionImpl().apply(block)
}

/**
 * TsTypeAssertion#expression: Expression
 * extension function for create Expression -> JSXMemberExpressionImpl
 */
fun TsTypeAssertion.jSXMemberExpression(block: JSXMemberExpression.() -> Unit): JSXMemberExpression {
    return JSXMemberExpressionImpl().apply(block)
}

/**
 * TsTypeAssertion#expression: Expression
 * extension function for create Expression -> JSXNamespacedNameImpl
 */
fun TsTypeAssertion.jSXNamespacedName(block: JSXNamespacedName.() -> Unit): JSXNamespacedName {
    return JSXNamespacedNameImpl().apply(block)
}

/**
 * TsTypeAssertion#expression: Expression
 * extension function for create Expression -> JSXEmptyExpressionImpl
 */
fun TsTypeAssertion.jSXEmptyExpression(block: JSXEmptyExpression.() -> Unit): JSXEmptyExpression {
    return JSXEmptyExpressionImpl().apply(block)
}

/**
 * TsTypeAssertion#expression: Expression
 * extension function for create Expression -> JSXElementImpl
 */
fun TsTypeAssertion.jSXElement(block: JSXElement.() -> Unit): JSXElement {
    return JSXElementImpl().apply(block)
}

/**
 * TsTypeAssertion#expression: Expression
 * extension function for create Expression -> JSXFragmentImpl
 */
fun TsTypeAssertion.jSXFragment(block: JSXFragment.() -> Unit): JSXFragment {
    return JSXFragmentImpl().apply(block)
}

/**
 * TsTypeAssertion#expression: Expression
 * extension function for create Expression -> TsConstAssertionImpl
 */
fun TsTypeAssertion.tsConstAssertion(block: TsConstAssertion.() -> Unit): TsConstAssertion {
    return TsConstAssertionImpl().apply(block)
}

/**
 * TsTypeAssertion#expression: Expression
 * extension function for create Expression -> TsNonNullExpressionImpl
 */
fun TsTypeAssertion.tsNonNullExpression(block: TsNonNullExpression.() -> Unit): TsNonNullExpression {
    return TsNonNullExpressionImpl().apply(block)
}

/**
 * TsTypeAssertion#expression: Expression
 * extension function for create Expression -> TsAsExpressionImpl
 */
fun TsTypeAssertion.tsAsExpression(block: TsAsExpression.() -> Unit): TsAsExpression {
    return TsAsExpressionImpl().apply(block)
}

/**
 * TsTypeAssertion#expression: Expression
 * extension function for create Expression -> TsSatisfiesExpressionImpl
 */
fun TsTypeAssertion.tsSatisfiesExpression(block: TsSatisfiesExpression.() -> Unit): TsSatisfiesExpression {
    return TsSatisfiesExpressionImpl().apply(block)
}

/**
 * TsTypeAssertion#expression: Expression
 * extension function for create Expression -> TsInstantiationImpl
 */
fun TsTypeAssertion.tsInstantiation(block: TsInstantiation.() -> Unit): TsInstantiation {
    return TsInstantiationImpl().apply(block)
}

/**
 * TsTypeAssertion#expression: Expression
 * extension function for create Expression -> PrivateNameImpl
 */
fun TsTypeAssertion.privateName(block: PrivateName.() -> Unit): PrivateName {
    return PrivateNameImpl().apply(block)
}

/**
 * TsTypeAssertion#expression: Expression
 * extension function for create Expression -> OptionalChainingExpressionImpl
 */
fun TsTypeAssertion.optionalChainingExpression(block: OptionalChainingExpression.() -> Unit): OptionalChainingExpression {
    return OptionalChainingExpressionImpl().apply(block)
}

/**
 * TsTypeAssertion#expression: Expression
 * extension function for create Expression -> InvalidImpl
 */
fun TsTypeAssertion.invalid(block: Invalid.() -> Unit): Invalid {
    return InvalidImpl().apply(block)
}

/**
 * TsTypeAssertion#typeAnnotation: TsType
 * extension function for create TsType -> TsKeywordTypeImpl
 */
fun TsTypeAssertion.tsKeywordType(block: TsKeywordType.() -> Unit): TsKeywordType {
    return TsKeywordTypeImpl().apply(block)
}

/**
 * TsTypeAssertion#typeAnnotation: TsType
 * extension function for create TsType -> TsThisTypeImpl
 */
fun TsTypeAssertion.tsThisType(block: TsThisType.() -> Unit): TsThisType {
    return TsThisTypeImpl().apply(block)
}

/**
 * TsTypeAssertion#typeAnnotation: TsType
 * extension function for create TsType -> TsFunctionTypeImpl
 */
fun TsTypeAssertion.tsFunctionType(block: TsFunctionType.() -> Unit): TsFunctionType {
    return TsFunctionTypeImpl().apply(block)
}

/**
 * TsTypeAssertion#typeAnnotation: TsType
 * extension function for create TsType -> TsConstructorTypeImpl
 */
fun TsTypeAssertion.tsConstructorType(block: TsConstructorType.() -> Unit): TsConstructorType {
    return TsConstructorTypeImpl().apply(block)
}

/**
 * TsTypeAssertion#typeAnnotation: TsType
 * extension function for create TsType -> TsTypeReferenceImpl
 */
fun TsTypeAssertion.tsTypeReference(block: TsTypeReference.() -> Unit): TsTypeReference {
    return TsTypeReferenceImpl().apply(block)
}

/**
 * TsTypeAssertion#typeAnnotation: TsType
 * extension function for create TsType -> TsTypeQueryImpl
 */
fun TsTypeAssertion.tsTypeQuery(block: TsTypeQuery.() -> Unit): TsTypeQuery {
    return TsTypeQueryImpl().apply(block)
}

/**
 * TsTypeAssertion#typeAnnotation: TsType
 * extension function for create TsType -> TsTypeLiteralImpl
 */
fun TsTypeAssertion.tsTypeLiteral(block: TsTypeLiteral.() -> Unit): TsTypeLiteral {
    return TsTypeLiteralImpl().apply(block)
}

/**
 * TsTypeAssertion#typeAnnotation: TsType
 * extension function for create TsType -> TsArrayTypeImpl
 */
fun TsTypeAssertion.tsArrayType(block: TsArrayType.() -> Unit): TsArrayType {
    return TsArrayTypeImpl().apply(block)
}

/**
 * TsTypeAssertion#typeAnnotation: TsType
 * extension function for create TsType -> TsTupleTypeImpl
 */
fun TsTypeAssertion.tsTupleType(block: TsTupleType.() -> Unit): TsTupleType {
    return TsTupleTypeImpl().apply(block)
}

/**
 * TsTypeAssertion#typeAnnotation: TsType
 * extension function for create TsType -> TsOptionalTypeImpl
 */
fun TsTypeAssertion.tsOptionalType(block: TsOptionalType.() -> Unit): TsOptionalType {
    return TsOptionalTypeImpl().apply(block)
}

/**
 * TsTypeAssertion#typeAnnotation: TsType
 * extension function for create TsType -> TsRestTypeImpl
 */
fun TsTypeAssertion.tsRestType(block: TsRestType.() -> Unit): TsRestType {
    return TsRestTypeImpl().apply(block)
}

/**
 * TsTypeAssertion#typeAnnotation: TsType
 * extension function for create TsType -> TsUnionTypeImpl
 */
fun TsTypeAssertion.tsUnionType(block: TsUnionType.() -> Unit): TsUnionType {
    return TsUnionTypeImpl().apply(block)
}

/**
 * TsTypeAssertion#typeAnnotation: TsType
 * extension function for create TsType -> TsIntersectionTypeImpl
 */
fun TsTypeAssertion.tsIntersectionType(block: TsIntersectionType.() -> Unit): TsIntersectionType {
    return TsIntersectionTypeImpl().apply(block)
}

/**
 * TsTypeAssertion#typeAnnotation: TsType
 * extension function for create TsType -> TsConditionalTypeImpl
 */
fun TsTypeAssertion.tsConditionalType(block: TsConditionalType.() -> Unit): TsConditionalType {
    return TsConditionalTypeImpl().apply(block)
}

/**
 * TsTypeAssertion#typeAnnotation: TsType
 * extension function for create TsType -> TsInferTypeImpl
 */
fun TsTypeAssertion.tsInferType(block: TsInferType.() -> Unit): TsInferType {
    return TsInferTypeImpl().apply(block)
}

/**
 * TsTypeAssertion#typeAnnotation: TsType
 * extension function for create TsType -> TsParenthesizedTypeImpl
 */
fun TsTypeAssertion.tsParenthesizedType(block: TsParenthesizedType.() -> Unit): TsParenthesizedType {
    return TsParenthesizedTypeImpl().apply(block)
}

/**
 * TsTypeAssertion#typeAnnotation: TsType
 * extension function for create TsType -> TsTypeOperatorImpl
 */
fun TsTypeAssertion.tsTypeOperator(block: TsTypeOperator.() -> Unit): TsTypeOperator {
    return TsTypeOperatorImpl().apply(block)
}

/**
 * TsTypeAssertion#typeAnnotation: TsType
 * extension function for create TsType -> TsIndexedAccessTypeImpl
 */
fun TsTypeAssertion.tsIndexedAccessType(block: TsIndexedAccessType.() -> Unit): TsIndexedAccessType {
    return TsIndexedAccessTypeImpl().apply(block)
}

/**
 * TsTypeAssertion#typeAnnotation: TsType
 * extension function for create TsType -> TsMappedTypeImpl
 */
fun TsTypeAssertion.tsMappedType(block: TsMappedType.() -> Unit): TsMappedType {
    return TsMappedTypeImpl().apply(block)
}

/**
 * TsTypeAssertion#typeAnnotation: TsType
 * extension function for create TsType -> TsLiteralTypeImpl
 */
fun TsTypeAssertion.tsLiteralType(block: TsLiteralType.() -> Unit): TsLiteralType {
    return TsLiteralTypeImpl().apply(block)
}

/**
 * TsTypeAssertion#typeAnnotation: TsType
 * extension function for create TsType -> TsTypePredicateImpl
 */
fun TsTypeAssertion.tsTypePredicate(block: TsTypePredicate.() -> Unit): TsTypePredicate {
    return TsTypePredicateImpl().apply(block)
}

/**
 * TsTypeAssertion#typeAnnotation: TsType
 * extension function for create TsType -> TsImportTypeImpl
 */
fun TsTypeAssertion.tsImportType(block: TsImportType.() -> Unit): TsImportType {
    return TsImportTypeImpl().apply(block)
}

fun TsTypeAssertion.span(block: Span.() -> Unit): Span {
    return Span().apply(block)
}
