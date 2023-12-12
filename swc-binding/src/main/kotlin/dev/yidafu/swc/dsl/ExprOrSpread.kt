package dev.yidafu.swc.dsl

import dev.yidafu.swc.types.*

fun ExprOrSpread.span(block: Span.() -> Unit): Span {
    return Span().apply(block)
}

/**
 * ExprOrSpread#expression: Expression
 * extension function for create Expression -> ThisExpressionImpl
 */
fun ExprOrSpread.thisExpression(block: ThisExpression.() -> Unit): ThisExpression {
    return ThisExpressionImpl().apply(block)
}

/**
 * ExprOrSpread#expression: Expression
 * extension function for create Expression -> ArrayExpressionImpl
 */
fun ExprOrSpread.arrayExpression(block: ArrayExpression.() -> Unit): ArrayExpression {
    return ArrayExpressionImpl().apply(block)
}

/**
 * ExprOrSpread#expression: Expression
 * extension function for create Expression -> ObjectExpressionImpl
 */
fun ExprOrSpread.objectExpression(block: ObjectExpression.() -> Unit): ObjectExpression {
    return ObjectExpressionImpl().apply(block)
}

/**
 * ExprOrSpread#expression: Expression
 * extension function for create Expression -> FunctionExpressionImpl
 */
fun ExprOrSpread.functionExpression(block: FunctionExpression.() -> Unit): FunctionExpression {
    return FunctionExpressionImpl().apply(block)
}

/**
 * ExprOrSpread#expression: Expression
 * extension function for create Expression -> UnaryExpressionImpl
 */
fun ExprOrSpread.unaryExpression(block: UnaryExpression.() -> Unit): UnaryExpression {
    return UnaryExpressionImpl().apply(block)
}

/**
 * ExprOrSpread#expression: Expression
 * extension function for create Expression -> UpdateExpressionImpl
 */
fun ExprOrSpread.updateExpression(block: UpdateExpression.() -> Unit): UpdateExpression {
    return UpdateExpressionImpl().apply(block)
}

/**
 * ExprOrSpread#expression: Expression
 * extension function for create Expression -> BinaryExpressionImpl
 */
fun ExprOrSpread.binaryExpression(block: BinaryExpression.() -> Unit): BinaryExpression {
    return BinaryExpressionImpl().apply(block)
}

/**
 * ExprOrSpread#expression: Expression
 * extension function for create Expression -> AssignmentExpressionImpl
 */
fun ExprOrSpread.assignmentExpression(block: AssignmentExpression.() -> Unit): AssignmentExpression {
    return AssignmentExpressionImpl().apply(block)
}

/**
 * ExprOrSpread#expression: Expression
 * extension function for create Expression -> MemberExpressionImpl
 */
fun ExprOrSpread.memberExpression(block: MemberExpression.() -> Unit): MemberExpression {
    return MemberExpressionImpl().apply(block)
}

/**
 * ExprOrSpread#expression: Expression
 * extension function for create Expression -> SuperPropExpressionImpl
 */
fun ExprOrSpread.superPropExpression(block: SuperPropExpression.() -> Unit): SuperPropExpression {
    return SuperPropExpressionImpl().apply(block)
}

/**
 * ExprOrSpread#expression: Expression
 * extension function for create Expression -> ConditionalExpressionImpl
 */
fun ExprOrSpread.conditionalExpression(block: ConditionalExpression.() -> Unit): ConditionalExpression {
    return ConditionalExpressionImpl().apply(block)
}

/**
 * ExprOrSpread#expression: Expression
 * extension function for create Expression -> CallExpressionImpl
 */
fun ExprOrSpread.callExpression(block: CallExpression.() -> Unit): CallExpression {
    return CallExpressionImpl().apply(block)
}

/**
 * ExprOrSpread#expression: Expression
 * extension function for create Expression -> NewExpressionImpl
 */
fun ExprOrSpread.newExpression(block: NewExpression.() -> Unit): NewExpression {
    return NewExpressionImpl().apply(block)
}

/**
 * ExprOrSpread#expression: Expression
 * extension function for create Expression -> SequenceExpressionImpl
 */
fun ExprOrSpread.sequenceExpression(block: SequenceExpression.() -> Unit): SequenceExpression {
    return SequenceExpressionImpl().apply(block)
}

/**
 * ExprOrSpread#expression: Expression
 * extension function for create Expression -> IdentifierImpl
 */
fun ExprOrSpread.identifier(block: Identifier.() -> Unit): Identifier {
    return IdentifierImpl().apply(block)
}

/**
 * ExprOrSpread#expression: Expression
 * extension function for create Expression -> StringLiteralImpl
 */
fun ExprOrSpread.stringLiteral(block: StringLiteral.() -> Unit): StringLiteral {
    return StringLiteralImpl().apply(block)
}

/**
 * ExprOrSpread#expression: Expression
 * extension function for create Expression -> BooleanLiteralImpl
 */
fun ExprOrSpread.booleanLiteral(block: BooleanLiteral.() -> Unit): BooleanLiteral {
    return BooleanLiteralImpl().apply(block)
}

/**
 * ExprOrSpread#expression: Expression
 * extension function for create Expression -> NullLiteralImpl
 */
fun ExprOrSpread.nullLiteral(block: NullLiteral.() -> Unit): NullLiteral {
    return NullLiteralImpl().apply(block)
}

/**
 * ExprOrSpread#expression: Expression
 * extension function for create Expression -> NumericLiteralImpl
 */
fun ExprOrSpread.numericLiteral(block: NumericLiteral.() -> Unit): NumericLiteral {
    return NumericLiteralImpl().apply(block)
}

/**
 * ExprOrSpread#expression: Expression
 * extension function for create Expression -> BigIntLiteralImpl
 */
fun ExprOrSpread.bigIntLiteral(block: BigIntLiteral.() -> Unit): BigIntLiteral {
    return BigIntLiteralImpl().apply(block)
}

/**
 * ExprOrSpread#expression: Expression
 * extension function for create Expression -> RegExpLiteralImpl
 */
fun ExprOrSpread.regExpLiteral(block: RegExpLiteral.() -> Unit): RegExpLiteral {
    return RegExpLiteralImpl().apply(block)
}

/**
 * ExprOrSpread#expression: Expression
 * extension function for create Expression -> JSXTextImpl
 */
fun ExprOrSpread.jSXText(block: JSXText.() -> Unit): JSXText {
    return JSXTextImpl().apply(block)
}

/**
 * ExprOrSpread#expression: Expression
 * extension function for create Expression -> TemplateLiteralImpl
 */
fun ExprOrSpread.templateLiteral(block: TemplateLiteral.() -> Unit): TemplateLiteral {
    return TemplateLiteralImpl().apply(block)
}

/**
 * ExprOrSpread#expression: Expression
 * extension function for create Expression -> TaggedTemplateExpressionImpl
 */
fun ExprOrSpread.taggedTemplateExpression(block: TaggedTemplateExpression.() -> Unit): TaggedTemplateExpression {
    return TaggedTemplateExpressionImpl().apply(block)
}

/**
 * ExprOrSpread#expression: Expression
 * extension function for create Expression -> ArrowFunctionExpressionImpl
 */
fun ExprOrSpread.arrowFunctionExpression(block: ArrowFunctionExpression.() -> Unit): ArrowFunctionExpression {
    return ArrowFunctionExpressionImpl().apply(block)
}

/**
 * ExprOrSpread#expression: Expression
 * extension function for create Expression -> ClassExpressionImpl
 */
fun ExprOrSpread.classExpression(block: ClassExpression.() -> Unit): ClassExpression {
    return ClassExpressionImpl().apply(block)
}

/**
 * ExprOrSpread#expression: Expression
 * extension function for create Expression -> YieldExpressionImpl
 */
fun ExprOrSpread.yieldExpression(block: YieldExpression.() -> Unit): YieldExpression {
    return YieldExpressionImpl().apply(block)
}

/**
 * ExprOrSpread#expression: Expression
 * extension function for create Expression -> MetaPropertyImpl
 */
fun ExprOrSpread.metaProperty(block: MetaProperty.() -> Unit): MetaProperty {
    return MetaPropertyImpl().apply(block)
}

/**
 * ExprOrSpread#expression: Expression
 * extension function for create Expression -> AwaitExpressionImpl
 */
fun ExprOrSpread.awaitExpression(block: AwaitExpression.() -> Unit): AwaitExpression {
    return AwaitExpressionImpl().apply(block)
}

/**
 * ExprOrSpread#expression: Expression
 * extension function for create Expression -> ParenthesisExpressionImpl
 */
fun ExprOrSpread.parenthesisExpression(block: ParenthesisExpression.() -> Unit): ParenthesisExpression {
    return ParenthesisExpressionImpl().apply(block)
}

/**
 * ExprOrSpread#expression: Expression
 * extension function for create Expression -> JSXMemberExpressionImpl
 */
fun ExprOrSpread.jSXMemberExpression(block: JSXMemberExpression.() -> Unit): JSXMemberExpression {
    return JSXMemberExpressionImpl().apply(block)
}

/**
 * ExprOrSpread#expression: Expression
 * extension function for create Expression -> JSXNamespacedNameImpl
 */
fun ExprOrSpread.jSXNamespacedName(block: JSXNamespacedName.() -> Unit): JSXNamespacedName {
    return JSXNamespacedNameImpl().apply(block)
}

/**
 * ExprOrSpread#expression: Expression
 * extension function for create Expression -> JSXEmptyExpressionImpl
 */
fun ExprOrSpread.jSXEmptyExpression(block: JSXEmptyExpression.() -> Unit): JSXEmptyExpression {
    return JSXEmptyExpressionImpl().apply(block)
}

/**
 * ExprOrSpread#expression: Expression
 * extension function for create Expression -> JSXElementImpl
 */
fun ExprOrSpread.jSXElement(block: JSXElement.() -> Unit): JSXElement {
    return JSXElementImpl().apply(block)
}

/**
 * ExprOrSpread#expression: Expression
 * extension function for create Expression -> JSXFragmentImpl
 */
fun ExprOrSpread.jSXFragment(block: JSXFragment.() -> Unit): JSXFragment {
    return JSXFragmentImpl().apply(block)
}

/**
 * ExprOrSpread#expression: Expression
 * extension function for create Expression -> TsTypeAssertionImpl
 */
fun ExprOrSpread.tsTypeAssertion(block: TsTypeAssertion.() -> Unit): TsTypeAssertion {
    return TsTypeAssertionImpl().apply(block)
}

/**
 * ExprOrSpread#expression: Expression
 * extension function for create Expression -> TsConstAssertionImpl
 */
fun ExprOrSpread.tsConstAssertion(block: TsConstAssertion.() -> Unit): TsConstAssertion {
    return TsConstAssertionImpl().apply(block)
}

/**
 * ExprOrSpread#expression: Expression
 * extension function for create Expression -> TsNonNullExpressionImpl
 */
fun ExprOrSpread.tsNonNullExpression(block: TsNonNullExpression.() -> Unit): TsNonNullExpression {
    return TsNonNullExpressionImpl().apply(block)
}

/**
 * ExprOrSpread#expression: Expression
 * extension function for create Expression -> TsAsExpressionImpl
 */
fun ExprOrSpread.tsAsExpression(block: TsAsExpression.() -> Unit): TsAsExpression {
    return TsAsExpressionImpl().apply(block)
}

/**
 * ExprOrSpread#expression: Expression
 * extension function for create Expression -> TsSatisfiesExpressionImpl
 */
fun ExprOrSpread.tsSatisfiesExpression(block: TsSatisfiesExpression.() -> Unit): TsSatisfiesExpression {
    return TsSatisfiesExpressionImpl().apply(block)
}

/**
 * ExprOrSpread#expression: Expression
 * extension function for create Expression -> TsInstantiationImpl
 */
fun ExprOrSpread.tsInstantiation(block: TsInstantiation.() -> Unit): TsInstantiation {
    return TsInstantiationImpl().apply(block)
}

/**
 * ExprOrSpread#expression: Expression
 * extension function for create Expression -> PrivateNameImpl
 */
fun ExprOrSpread.privateName(block: PrivateName.() -> Unit): PrivateName {
    return PrivateNameImpl().apply(block)
}

/**
 * ExprOrSpread#expression: Expression
 * extension function for create Expression -> OptionalChainingExpressionImpl
 */
fun ExprOrSpread.optionalChainingExpression(block: OptionalChainingExpression.() -> Unit): OptionalChainingExpression {
    return OptionalChainingExpressionImpl().apply(block)
}

/**
 * ExprOrSpread#expression: Expression
 * extension function for create Expression -> InvalidImpl
 */
fun ExprOrSpread.invalid(block: Invalid.() -> Unit): Invalid {
    return InvalidImpl().apply(block)
}
