package dev.yidafu.swc.dsl

import dev.yidafu.swc.types.*

/**
 * TsAsExpression#expression: Expression
 * extension function for create Expression -> ThisExpressionImpl
 */
fun TsAsExpression.thisExpression(block: ThisExpression.() -> Unit): ThisExpression {
    return ThisExpressionImpl().apply(block)
}

/**
 * TsAsExpression#expression: Expression
 * extension function for create Expression -> ArrayExpressionImpl
 */
fun TsAsExpression.arrayExpression(block: ArrayExpression.() -> Unit): ArrayExpression {
    return ArrayExpressionImpl().apply(block)
}

/**
 * TsAsExpression#expression: Expression
 * extension function for create Expression -> ObjectExpressionImpl
 */
fun TsAsExpression.objectExpression(block: ObjectExpression.() -> Unit): ObjectExpression {
    return ObjectExpressionImpl().apply(block)
}

/**
 * TsAsExpression#expression: Expression
 * extension function for create Expression -> FunctionExpressionImpl
 */
fun TsAsExpression.functionExpression(block: FunctionExpression.() -> Unit): FunctionExpression {
    return FunctionExpressionImpl().apply(block)
}

/**
 * TsAsExpression#expression: Expression
 * extension function for create Expression -> UnaryExpressionImpl
 */
fun TsAsExpression.unaryExpression(block: UnaryExpression.() -> Unit): UnaryExpression {
    return UnaryExpressionImpl().apply(block)
}

/**
 * TsAsExpression#expression: Expression
 * extension function for create Expression -> UpdateExpressionImpl
 */
fun TsAsExpression.updateExpression(block: UpdateExpression.() -> Unit): UpdateExpression {
    return UpdateExpressionImpl().apply(block)
}

/**
 * TsAsExpression#expression: Expression
 * extension function for create Expression -> BinaryExpressionImpl
 */
fun TsAsExpression.binaryExpression(block: BinaryExpression.() -> Unit): BinaryExpression {
    return BinaryExpressionImpl().apply(block)
}

/**
 * TsAsExpression#expression: Expression
 * extension function for create Expression -> AssignmentExpressionImpl
 */
fun TsAsExpression.assignmentExpression(block: AssignmentExpression.() -> Unit): AssignmentExpression {
    return AssignmentExpressionImpl().apply(block)
}

/**
 * TsAsExpression#expression: Expression
 * extension function for create Expression -> MemberExpressionImpl
 */
fun TsAsExpression.memberExpression(block: MemberExpression.() -> Unit): MemberExpression {
    return MemberExpressionImpl().apply(block)
}

/**
 * TsAsExpression#expression: Expression
 * extension function for create Expression -> SuperPropExpressionImpl
 */
fun TsAsExpression.superPropExpression(block: SuperPropExpression.() -> Unit): SuperPropExpression {
    return SuperPropExpressionImpl().apply(block)
}

/**
 * TsAsExpression#expression: Expression
 * extension function for create Expression -> ConditionalExpressionImpl
 */
fun TsAsExpression.conditionalExpression(block: ConditionalExpression.() -> Unit): ConditionalExpression {
    return ConditionalExpressionImpl().apply(block)
}

/**
 * TsAsExpression#expression: Expression
 * extension function for create Expression -> CallExpressionImpl
 */
fun TsAsExpression.callExpression(block: CallExpression.() -> Unit): CallExpression {
    return CallExpressionImpl().apply(block)
}

/**
 * TsAsExpression#expression: Expression
 * extension function for create Expression -> NewExpressionImpl
 */
fun TsAsExpression.newExpression(block: NewExpression.() -> Unit): NewExpression {
    return NewExpressionImpl().apply(block)
}

/**
 * TsAsExpression#expression: Expression
 * extension function for create Expression -> SequenceExpressionImpl
 */
fun TsAsExpression.sequenceExpression(block: SequenceExpression.() -> Unit): SequenceExpression {
    return SequenceExpressionImpl().apply(block)
}

/**
 * TsAsExpression#expression: Expression
 * extension function for create Expression -> IdentifierImpl
 */
fun TsAsExpression.identifier(block: Identifier.() -> Unit): Identifier {
    return IdentifierImpl().apply(block)
}

/**
 * TsAsExpression#expression: Expression
 * extension function for create Expression -> StringLiteralImpl
 */
fun TsAsExpression.stringLiteral(block: StringLiteral.() -> Unit): StringLiteral {
    return StringLiteralImpl().apply(block)
}

/**
 * TsAsExpression#expression: Expression
 * extension function for create Expression -> BooleanLiteralImpl
 */
fun TsAsExpression.booleanLiteral(block: BooleanLiteral.() -> Unit): BooleanLiteral {
    return BooleanLiteralImpl().apply(block)
}

/**
 * TsAsExpression#expression: Expression
 * extension function for create Expression -> NullLiteralImpl
 */
fun TsAsExpression.nullLiteral(block: NullLiteral.() -> Unit): NullLiteral {
    return NullLiteralImpl().apply(block)
}

/**
 * TsAsExpression#expression: Expression
 * extension function for create Expression -> NumericLiteralImpl
 */
fun TsAsExpression.numericLiteral(block: NumericLiteral.() -> Unit): NumericLiteral {
    return NumericLiteralImpl().apply(block)
}

/**
 * TsAsExpression#expression: Expression
 * extension function for create Expression -> BigIntLiteralImpl
 */
fun TsAsExpression.bigIntLiteral(block: BigIntLiteral.() -> Unit): BigIntLiteral {
    return BigIntLiteralImpl().apply(block)
}

/**
 * TsAsExpression#expression: Expression
 * extension function for create Expression -> RegExpLiteralImpl
 */
fun TsAsExpression.regExpLiteral(block: RegExpLiteral.() -> Unit): RegExpLiteral {
    return RegExpLiteralImpl().apply(block)
}

/**
 * TsAsExpression#expression: Expression
 * extension function for create Expression -> JSXTextImpl
 */
fun TsAsExpression.jSXText(block: JSXText.() -> Unit): JSXText {
    return JSXTextImpl().apply(block)
}

/**
 * TsAsExpression#expression: Expression
 * extension function for create Expression -> TemplateLiteralImpl
 */
fun TsAsExpression.templateLiteral(block: TemplateLiteral.() -> Unit): TemplateLiteral {
    return TemplateLiteralImpl().apply(block)
}

/**
 * TsAsExpression#expression: Expression
 * extension function for create Expression -> TaggedTemplateExpressionImpl
 */
fun TsAsExpression.taggedTemplateExpression(block: TaggedTemplateExpression.() -> Unit): TaggedTemplateExpression {
    return TaggedTemplateExpressionImpl().apply(block)
}

/**
 * TsAsExpression#expression: Expression
 * extension function for create Expression -> ArrowFunctionExpressionImpl
 */
fun TsAsExpression.arrowFunctionExpression(block: ArrowFunctionExpression.() -> Unit): ArrowFunctionExpression {
    return ArrowFunctionExpressionImpl().apply(block)
}

/**
 * TsAsExpression#expression: Expression
 * extension function for create Expression -> ClassExpressionImpl
 */
fun TsAsExpression.classExpression(block: ClassExpression.() -> Unit): ClassExpression {
    return ClassExpressionImpl().apply(block)
}

/**
 * TsAsExpression#expression: Expression
 * extension function for create Expression -> YieldExpressionImpl
 */
fun TsAsExpression.yieldExpression(block: YieldExpression.() -> Unit): YieldExpression {
    return YieldExpressionImpl().apply(block)
}

/**
 * TsAsExpression#expression: Expression
 * extension function for create Expression -> MetaPropertyImpl
 */
fun TsAsExpression.metaProperty(block: MetaProperty.() -> Unit): MetaProperty {
    return MetaPropertyImpl().apply(block)
}

/**
 * TsAsExpression#expression: Expression
 * extension function for create Expression -> AwaitExpressionImpl
 */
fun TsAsExpression.awaitExpression(block: AwaitExpression.() -> Unit): AwaitExpression {
    return AwaitExpressionImpl().apply(block)
}

/**
 * TsAsExpression#expression: Expression
 * extension function for create Expression -> ParenthesisExpressionImpl
 */
fun TsAsExpression.parenthesisExpression(block: ParenthesisExpression.() -> Unit): ParenthesisExpression {
    return ParenthesisExpressionImpl().apply(block)
}

/**
 * TsAsExpression#expression: Expression
 * extension function for create Expression -> JSXMemberExpressionImpl
 */
fun TsAsExpression.jSXMemberExpression(block: JSXMemberExpression.() -> Unit): JSXMemberExpression {
    return JSXMemberExpressionImpl().apply(block)
}

/**
 * TsAsExpression#expression: Expression
 * extension function for create Expression -> JSXNamespacedNameImpl
 */
fun TsAsExpression.jSXNamespacedName(block: JSXNamespacedName.() -> Unit): JSXNamespacedName {
    return JSXNamespacedNameImpl().apply(block)
}

/**
 * TsAsExpression#expression: Expression
 * extension function for create Expression -> JSXEmptyExpressionImpl
 */
fun TsAsExpression.jSXEmptyExpression(block: JSXEmptyExpression.() -> Unit): JSXEmptyExpression {
    return JSXEmptyExpressionImpl().apply(block)
}

/**
 * TsAsExpression#expression: Expression
 * extension function for create Expression -> JSXElementImpl
 */
fun TsAsExpression.jSXElement(block: JSXElement.() -> Unit): JSXElement {
    return JSXElementImpl().apply(block)
}

/**
 * TsAsExpression#expression: Expression
 * extension function for create Expression -> JSXFragmentImpl
 */
fun TsAsExpression.jSXFragment(block: JSXFragment.() -> Unit): JSXFragment {
    return JSXFragmentImpl().apply(block)
}

/**
 * TsAsExpression#expression: Expression
 * extension function for create Expression -> TsTypeAssertionImpl
 */
fun TsAsExpression.tsTypeAssertion(block: TsTypeAssertion.() -> Unit): TsTypeAssertion {
    return TsTypeAssertionImpl().apply(block)
}

/**
 * TsAsExpression#expression: Expression
 * extension function for create Expression -> TsConstAssertionImpl
 */
fun TsAsExpression.tsConstAssertion(block: TsConstAssertion.() -> Unit): TsConstAssertion {
    return TsConstAssertionImpl().apply(block)
}

/**
 * TsAsExpression#expression: Expression
 * extension function for create Expression -> TsNonNullExpressionImpl
 */
fun TsAsExpression.tsNonNullExpression(block: TsNonNullExpression.() -> Unit): TsNonNullExpression {
    return TsNonNullExpressionImpl().apply(block)
}

/**
 * TsAsExpression#expression: Expression
 * extension function for create Expression -> TsSatisfiesExpressionImpl
 */
fun TsAsExpression.tsSatisfiesExpression(block: TsSatisfiesExpression.() -> Unit): TsSatisfiesExpression {
    return TsSatisfiesExpressionImpl().apply(block)
}

/**
 * TsAsExpression#expression: Expression
 * extension function for create Expression -> TsInstantiationImpl
 */
fun TsAsExpression.tsInstantiation(block: TsInstantiation.() -> Unit): TsInstantiation {
    return TsInstantiationImpl().apply(block)
}

/**
 * TsAsExpression#expression: Expression
 * extension function for create Expression -> PrivateNameImpl
 */
fun TsAsExpression.privateName(block: PrivateName.() -> Unit): PrivateName {
    return PrivateNameImpl().apply(block)
}

/**
 * TsAsExpression#expression: Expression
 * extension function for create Expression -> OptionalChainingExpressionImpl
 */
fun TsAsExpression.optionalChainingExpression(block: OptionalChainingExpression.() -> Unit): OptionalChainingExpression {
    return OptionalChainingExpressionImpl().apply(block)
}

/**
 * TsAsExpression#expression: Expression
 * extension function for create Expression -> InvalidImpl
 */
fun TsAsExpression.invalid(block: Invalid.() -> Unit): Invalid {
    return InvalidImpl().apply(block)
}

/**
 * TsAsExpression#typeAnnotation: TsType
 * extension function for create TsType -> TsKeywordTypeImpl
 */
fun TsAsExpression.tsKeywordType(block: TsKeywordType.() -> Unit): TsKeywordType {
    return TsKeywordTypeImpl().apply(block)
}

/**
 * TsAsExpression#typeAnnotation: TsType
 * extension function for create TsType -> TsThisTypeImpl
 */
fun TsAsExpression.tsThisType(block: TsThisType.() -> Unit): TsThisType {
    return TsThisTypeImpl().apply(block)
}

/**
 * TsAsExpression#typeAnnotation: TsType
 * extension function for create TsType -> TsFunctionTypeImpl
 */
fun TsAsExpression.tsFunctionType(block: TsFunctionType.() -> Unit): TsFunctionType {
    return TsFunctionTypeImpl().apply(block)
}

/**
 * TsAsExpression#typeAnnotation: TsType
 * extension function for create TsType -> TsConstructorTypeImpl
 */
fun TsAsExpression.tsConstructorType(block: TsConstructorType.() -> Unit): TsConstructorType {
    return TsConstructorTypeImpl().apply(block)
}

/**
 * TsAsExpression#typeAnnotation: TsType
 * extension function for create TsType -> TsTypeReferenceImpl
 */
fun TsAsExpression.tsTypeReference(block: TsTypeReference.() -> Unit): TsTypeReference {
    return TsTypeReferenceImpl().apply(block)
}

/**
 * TsAsExpression#typeAnnotation: TsType
 * extension function for create TsType -> TsTypeQueryImpl
 */
fun TsAsExpression.tsTypeQuery(block: TsTypeQuery.() -> Unit): TsTypeQuery {
    return TsTypeQueryImpl().apply(block)
}

/**
 * TsAsExpression#typeAnnotation: TsType
 * extension function for create TsType -> TsTypeLiteralImpl
 */
fun TsAsExpression.tsTypeLiteral(block: TsTypeLiteral.() -> Unit): TsTypeLiteral {
    return TsTypeLiteralImpl().apply(block)
}

/**
 * TsAsExpression#typeAnnotation: TsType
 * extension function for create TsType -> TsArrayTypeImpl
 */
fun TsAsExpression.tsArrayType(block: TsArrayType.() -> Unit): TsArrayType {
    return TsArrayTypeImpl().apply(block)
}

/**
 * TsAsExpression#typeAnnotation: TsType
 * extension function for create TsType -> TsTupleTypeImpl
 */
fun TsAsExpression.tsTupleType(block: TsTupleType.() -> Unit): TsTupleType {
    return TsTupleTypeImpl().apply(block)
}

/**
 * TsAsExpression#typeAnnotation: TsType
 * extension function for create TsType -> TsOptionalTypeImpl
 */
fun TsAsExpression.tsOptionalType(block: TsOptionalType.() -> Unit): TsOptionalType {
    return TsOptionalTypeImpl().apply(block)
}

/**
 * TsAsExpression#typeAnnotation: TsType
 * extension function for create TsType -> TsRestTypeImpl
 */
fun TsAsExpression.tsRestType(block: TsRestType.() -> Unit): TsRestType {
    return TsRestTypeImpl().apply(block)
}

/**
 * TsAsExpression#typeAnnotation: TsType
 * extension function for create TsType -> TsUnionTypeImpl
 */
fun TsAsExpression.tsUnionType(block: TsUnionType.() -> Unit): TsUnionType {
    return TsUnionTypeImpl().apply(block)
}

/**
 * TsAsExpression#typeAnnotation: TsType
 * extension function for create TsType -> TsIntersectionTypeImpl
 */
fun TsAsExpression.tsIntersectionType(block: TsIntersectionType.() -> Unit): TsIntersectionType {
    return TsIntersectionTypeImpl().apply(block)
}

/**
 * TsAsExpression#typeAnnotation: TsType
 * extension function for create TsType -> TsConditionalTypeImpl
 */
fun TsAsExpression.tsConditionalType(block: TsConditionalType.() -> Unit): TsConditionalType {
    return TsConditionalTypeImpl().apply(block)
}

/**
 * TsAsExpression#typeAnnotation: TsType
 * extension function for create TsType -> TsInferTypeImpl
 */
fun TsAsExpression.tsInferType(block: TsInferType.() -> Unit): TsInferType {
    return TsInferTypeImpl().apply(block)
}

/**
 * TsAsExpression#typeAnnotation: TsType
 * extension function for create TsType -> TsParenthesizedTypeImpl
 */
fun TsAsExpression.tsParenthesizedType(block: TsParenthesizedType.() -> Unit): TsParenthesizedType {
    return TsParenthesizedTypeImpl().apply(block)
}

/**
 * TsAsExpression#typeAnnotation: TsType
 * extension function for create TsType -> TsTypeOperatorImpl
 */
fun TsAsExpression.tsTypeOperator(block: TsTypeOperator.() -> Unit): TsTypeOperator {
    return TsTypeOperatorImpl().apply(block)
}

/**
 * TsAsExpression#typeAnnotation: TsType
 * extension function for create TsType -> TsIndexedAccessTypeImpl
 */
fun TsAsExpression.tsIndexedAccessType(block: TsIndexedAccessType.() -> Unit): TsIndexedAccessType {
    return TsIndexedAccessTypeImpl().apply(block)
}

/**
 * TsAsExpression#typeAnnotation: TsType
 * extension function for create TsType -> TsMappedTypeImpl
 */
fun TsAsExpression.tsMappedType(block: TsMappedType.() -> Unit): TsMappedType {
    return TsMappedTypeImpl().apply(block)
}

/**
 * TsAsExpression#typeAnnotation: TsType
 * extension function for create TsType -> TsLiteralTypeImpl
 */
fun TsAsExpression.tsLiteralType(block: TsLiteralType.() -> Unit): TsLiteralType {
    return TsLiteralTypeImpl().apply(block)
}

/**
 * TsAsExpression#typeAnnotation: TsType
 * extension function for create TsType -> TsTypePredicateImpl
 */
fun TsAsExpression.tsTypePredicate(block: TsTypePredicate.() -> Unit): TsTypePredicate {
    return TsTypePredicateImpl().apply(block)
}

/**
 * TsAsExpression#typeAnnotation: TsType
 * extension function for create TsType -> TsImportTypeImpl
 */
fun TsAsExpression.tsImportType(block: TsImportType.() -> Unit): TsImportType {
    return TsImportTypeImpl().apply(block)
}

fun TsAsExpression.span(block: Span.() -> Unit): Span {
    return Span().apply(block)
}
