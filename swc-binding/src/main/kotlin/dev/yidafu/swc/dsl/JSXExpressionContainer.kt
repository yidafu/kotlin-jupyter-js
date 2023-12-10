package dev.yidafu.swc.dsl

import dev.yidafu.swc.types.*

/**
 * JSXExpressionContainer#expression: JSXExpression
 * extension function for create JSXExpression -> JSXEmptyExpressionImpl
 */
fun JSXExpressionContainer.jSXEmptyExpression(block: JSXEmptyExpression.() -> Unit): JSXEmptyExpression {
    return JSXEmptyExpressionImpl().apply(block)
}

/**
 * JSXExpressionContainer#expression: JSXExpression
 * extension function for create JSXExpression -> ThisExpressionImpl
 */
fun JSXExpressionContainer.thisExpression(block: ThisExpression.() -> Unit): ThisExpression {
    return ThisExpressionImpl().apply(block)
}

/**
 * JSXExpressionContainer#expression: JSXExpression
 * extension function for create JSXExpression -> ArrayExpressionImpl
 */
fun JSXExpressionContainer.arrayExpression(block: ArrayExpression.() -> Unit): ArrayExpression {
    return ArrayExpressionImpl().apply(block)
}

/**
 * JSXExpressionContainer#expression: JSXExpression
 * extension function for create JSXExpression -> ObjectExpressionImpl
 */
fun JSXExpressionContainer.objectExpression(block: ObjectExpression.() -> Unit): ObjectExpression {
    return ObjectExpressionImpl().apply(block)
}

/**
 * JSXExpressionContainer#expression: JSXExpression
 * extension function for create JSXExpression -> FunctionExpressionImpl
 */
fun JSXExpressionContainer.functionExpression(block: FunctionExpression.() -> Unit): FunctionExpression {
    return FunctionExpressionImpl().apply(block)
}

/**
 * JSXExpressionContainer#expression: JSXExpression
 * extension function for create JSXExpression -> UnaryExpressionImpl
 */
fun JSXExpressionContainer.unaryExpression(block: UnaryExpression.() -> Unit): UnaryExpression {
    return UnaryExpressionImpl().apply(block)
}

/**
 * JSXExpressionContainer#expression: JSXExpression
 * extension function for create JSXExpression -> UpdateExpressionImpl
 */
fun JSXExpressionContainer.updateExpression(block: UpdateExpression.() -> Unit): UpdateExpression {
    return UpdateExpressionImpl().apply(block)
}

/**
 * JSXExpressionContainer#expression: JSXExpression
 * extension function for create JSXExpression -> BinaryExpressionImpl
 */
fun JSXExpressionContainer.binaryExpression(block: BinaryExpression.() -> Unit): BinaryExpression {
    return BinaryExpressionImpl().apply(block)
}

/**
 * JSXExpressionContainer#expression: JSXExpression
 * extension function for create JSXExpression -> AssignmentExpressionImpl
 */
fun JSXExpressionContainer.assignmentExpression(block: AssignmentExpression.() -> Unit): AssignmentExpression {
    return AssignmentExpressionImpl().apply(block)
}

/**
 * JSXExpressionContainer#expression: JSXExpression
 * extension function for create JSXExpression -> MemberExpressionImpl
 */
fun JSXExpressionContainer.memberExpression(block: MemberExpression.() -> Unit): MemberExpression {
    return MemberExpressionImpl().apply(block)
}

/**
 * JSXExpressionContainer#expression: JSXExpression
 * extension function for create JSXExpression -> SuperPropExpressionImpl
 */
fun JSXExpressionContainer.superPropExpression(block: SuperPropExpression.() -> Unit): SuperPropExpression {
    return SuperPropExpressionImpl().apply(block)
}

/**
 * JSXExpressionContainer#expression: JSXExpression
 * extension function for create JSXExpression -> ConditionalExpressionImpl
 */
fun JSXExpressionContainer.conditionalExpression(block: ConditionalExpression.() -> Unit): ConditionalExpression {
    return ConditionalExpressionImpl().apply(block)
}

/**
 * JSXExpressionContainer#expression: JSXExpression
 * extension function for create JSXExpression -> CallExpressionImpl
 */
fun JSXExpressionContainer.callExpression(block: CallExpression.() -> Unit): CallExpression {
    return CallExpressionImpl().apply(block)
}

/**
 * JSXExpressionContainer#expression: JSXExpression
 * extension function for create JSXExpression -> NewExpressionImpl
 */
fun JSXExpressionContainer.newExpression(block: NewExpression.() -> Unit): NewExpression {
    return NewExpressionImpl().apply(block)
}

/**
 * JSXExpressionContainer#expression: JSXExpression
 * extension function for create JSXExpression -> SequenceExpressionImpl
 */
fun JSXExpressionContainer.sequenceExpression(block: SequenceExpression.() -> Unit): SequenceExpression {
    return SequenceExpressionImpl().apply(block)
}

/**
 * JSXExpressionContainer#expression: JSXExpression
 * extension function for create JSXExpression -> IdentifierImpl
 */
fun JSXExpressionContainer.identifier(block: Identifier.() -> Unit): Identifier {
    return IdentifierImpl().apply(block)
}

/**
 * JSXExpressionContainer#expression: JSXExpression
 * extension function for create JSXExpression -> StringLiteralImpl
 */
fun JSXExpressionContainer.stringLiteral(block: StringLiteral.() -> Unit): StringLiteral {
    return StringLiteralImpl().apply(block)
}

/**
 * JSXExpressionContainer#expression: JSXExpression
 * extension function for create JSXExpression -> BooleanLiteralImpl
 */
fun JSXExpressionContainer.booleanLiteral(block: BooleanLiteral.() -> Unit): BooleanLiteral {
    return BooleanLiteralImpl().apply(block)
}

/**
 * JSXExpressionContainer#expression: JSXExpression
 * extension function for create JSXExpression -> NullLiteralImpl
 */
fun JSXExpressionContainer.nullLiteral(block: NullLiteral.() -> Unit): NullLiteral {
    return NullLiteralImpl().apply(block)
}

/**
 * JSXExpressionContainer#expression: JSXExpression
 * extension function for create JSXExpression -> NumericLiteralImpl
 */
fun JSXExpressionContainer.numericLiteral(block: NumericLiteral.() -> Unit): NumericLiteral {
    return NumericLiteralImpl().apply(block)
}

/**
 * JSXExpressionContainer#expression: JSXExpression
 * extension function for create JSXExpression -> BigIntLiteralImpl
 */
fun JSXExpressionContainer.bigIntLiteral(block: BigIntLiteral.() -> Unit): BigIntLiteral {
    return BigIntLiteralImpl().apply(block)
}

/**
 * JSXExpressionContainer#expression: JSXExpression
 * extension function for create JSXExpression -> RegExpLiteralImpl
 */
fun JSXExpressionContainer.regExpLiteral(block: RegExpLiteral.() -> Unit): RegExpLiteral {
    return RegExpLiteralImpl().apply(block)
}

/**
 * JSXExpressionContainer#expression: JSXExpression
 * extension function for create JSXExpression -> JSXTextImpl
 */
fun JSXExpressionContainer.jSXText(block: JSXText.() -> Unit): JSXText {
    return JSXTextImpl().apply(block)
}

/**
 * JSXExpressionContainer#expression: JSXExpression
 * extension function for create JSXExpression -> TemplateLiteralImpl
 */
fun JSXExpressionContainer.templateLiteral(block: TemplateLiteral.() -> Unit): TemplateLiteral {
    return TemplateLiteralImpl().apply(block)
}

/**
 * JSXExpressionContainer#expression: JSXExpression
 * extension function for create JSXExpression -> TaggedTemplateExpressionImpl
 */
fun JSXExpressionContainer.taggedTemplateExpression(block: TaggedTemplateExpression.() -> Unit): TaggedTemplateExpression {
    return TaggedTemplateExpressionImpl().apply(block)
}

/**
 * JSXExpressionContainer#expression: JSXExpression
 * extension function for create JSXExpression -> ArrowFunctionExpressionImpl
 */
fun JSXExpressionContainer.arrowFunctionExpression(block: ArrowFunctionExpression.() -> Unit): ArrowFunctionExpression {
    return ArrowFunctionExpressionImpl().apply(block)
}

/**
 * JSXExpressionContainer#expression: JSXExpression
 * extension function for create JSXExpression -> ClassExpressionImpl
 */
fun JSXExpressionContainer.classExpression(block: ClassExpression.() -> Unit): ClassExpression {
    return ClassExpressionImpl().apply(block)
}

/**
 * JSXExpressionContainer#expression: JSXExpression
 * extension function for create JSXExpression -> YieldExpressionImpl
 */
fun JSXExpressionContainer.yieldExpression(block: YieldExpression.() -> Unit): YieldExpression {
    return YieldExpressionImpl().apply(block)
}

/**
 * JSXExpressionContainer#expression: JSXExpression
 * extension function for create JSXExpression -> MetaPropertyImpl
 */
fun JSXExpressionContainer.metaProperty(block: MetaProperty.() -> Unit): MetaProperty {
    return MetaPropertyImpl().apply(block)
}

/**
 * JSXExpressionContainer#expression: JSXExpression
 * extension function for create JSXExpression -> AwaitExpressionImpl
 */
fun JSXExpressionContainer.awaitExpression(block: AwaitExpression.() -> Unit): AwaitExpression {
    return AwaitExpressionImpl().apply(block)
}

/**
 * JSXExpressionContainer#expression: JSXExpression
 * extension function for create JSXExpression -> ParenthesisExpressionImpl
 */
fun JSXExpressionContainer.parenthesisExpression(block: ParenthesisExpression.() -> Unit): ParenthesisExpression {
    return ParenthesisExpressionImpl().apply(block)
}

/**
 * JSXExpressionContainer#expression: JSXExpression
 * extension function for create JSXExpression -> JSXMemberExpressionImpl
 */
fun JSXExpressionContainer.jSXMemberExpression(block: JSXMemberExpression.() -> Unit): JSXMemberExpression {
    return JSXMemberExpressionImpl().apply(block)
}

/**
 * JSXExpressionContainer#expression: JSXExpression
 * extension function for create JSXExpression -> JSXNamespacedNameImpl
 */
fun JSXExpressionContainer.jSXNamespacedName(block: JSXNamespacedName.() -> Unit): JSXNamespacedName {
    return JSXNamespacedNameImpl().apply(block)
}

/**
 * JSXExpressionContainer#expression: JSXExpression
 * extension function for create JSXExpression -> JSXElementImpl
 */
fun JSXExpressionContainer.jSXElement(block: JSXElement.() -> Unit): JSXElement {
    return JSXElementImpl().apply(block)
}

/**
 * JSXExpressionContainer#expression: JSXExpression
 * extension function for create JSXExpression -> JSXFragmentImpl
 */
fun JSXExpressionContainer.jSXFragment(block: JSXFragment.() -> Unit): JSXFragment {
    return JSXFragmentImpl().apply(block)
}

/**
 * JSXExpressionContainer#expression: JSXExpression
 * extension function for create JSXExpression -> TsTypeAssertionImpl
 */
fun JSXExpressionContainer.tsTypeAssertion(block: TsTypeAssertion.() -> Unit): TsTypeAssertion {
    return TsTypeAssertionImpl().apply(block)
}

/**
 * JSXExpressionContainer#expression: JSXExpression
 * extension function for create JSXExpression -> TsConstAssertionImpl
 */
fun JSXExpressionContainer.tsConstAssertion(block: TsConstAssertion.() -> Unit): TsConstAssertion {
    return TsConstAssertionImpl().apply(block)
}

/**
 * JSXExpressionContainer#expression: JSXExpression
 * extension function for create JSXExpression -> TsNonNullExpressionImpl
 */
fun JSXExpressionContainer.tsNonNullExpression(block: TsNonNullExpression.() -> Unit): TsNonNullExpression {
    return TsNonNullExpressionImpl().apply(block)
}

/**
 * JSXExpressionContainer#expression: JSXExpression
 * extension function for create JSXExpression -> TsAsExpressionImpl
 */
fun JSXExpressionContainer.tsAsExpression(block: TsAsExpression.() -> Unit): TsAsExpression {
    return TsAsExpressionImpl().apply(block)
}

/**
 * JSXExpressionContainer#expression: JSXExpression
 * extension function for create JSXExpression -> TsSatisfiesExpressionImpl
 */
fun JSXExpressionContainer.tsSatisfiesExpression(block: TsSatisfiesExpression.() -> Unit): TsSatisfiesExpression {
    return TsSatisfiesExpressionImpl().apply(block)
}

/**
 * JSXExpressionContainer#expression: JSXExpression
 * extension function for create JSXExpression -> TsInstantiationImpl
 */
fun JSXExpressionContainer.tsInstantiation(block: TsInstantiation.() -> Unit): TsInstantiation {
    return TsInstantiationImpl().apply(block)
}

/**
 * JSXExpressionContainer#expression: JSXExpression
 * extension function for create JSXExpression -> PrivateNameImpl
 */
fun JSXExpressionContainer.privateName(block: PrivateName.() -> Unit): PrivateName {
    return PrivateNameImpl().apply(block)
}

/**
 * JSXExpressionContainer#expression: JSXExpression
 * extension function for create JSXExpression -> OptionalChainingExpressionImpl
 */
fun JSXExpressionContainer.optionalChainingExpression(block: OptionalChainingExpression.() -> Unit): OptionalChainingExpression {
    return OptionalChainingExpressionImpl().apply(block)
}

/**
 * JSXExpressionContainer#expression: JSXExpression
 * extension function for create JSXExpression -> InvalidImpl
 */
fun JSXExpressionContainer.invalid(block: Invalid.() -> Unit): Invalid {
    return InvalidImpl().apply(block)
}

fun JSXExpressionContainer.span(block: Span.() -> Unit): Span {
    return Span().apply(block)
}
