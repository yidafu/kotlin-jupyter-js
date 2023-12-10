package dev.yidafu.swc.dsl

import dev.yidafu.swc.types.*

/**
 * ComputedPropName#expression: Expression
 * extension function for create Expression -> ThisExpressionImpl
 */
fun ComputedPropName.thisExpression(block: ThisExpression.() -> Unit): ThisExpression {
    return ThisExpressionImpl().apply(block)
}

/**
 * ComputedPropName#expression: Expression
 * extension function for create Expression -> ArrayExpressionImpl
 */
fun ComputedPropName.arrayExpression(block: ArrayExpression.() -> Unit): ArrayExpression {
    return ArrayExpressionImpl().apply(block)
}

/**
 * ComputedPropName#expression: Expression
 * extension function for create Expression -> ObjectExpressionImpl
 */
fun ComputedPropName.objectExpression(block: ObjectExpression.() -> Unit): ObjectExpression {
    return ObjectExpressionImpl().apply(block)
}

/**
 * ComputedPropName#expression: Expression
 * extension function for create Expression -> FunctionExpressionImpl
 */
fun ComputedPropName.functionExpression(block: FunctionExpression.() -> Unit): FunctionExpression {
    return FunctionExpressionImpl().apply(block)
}

/**
 * ComputedPropName#expression: Expression
 * extension function for create Expression -> UnaryExpressionImpl
 */
fun ComputedPropName.unaryExpression(block: UnaryExpression.() -> Unit): UnaryExpression {
    return UnaryExpressionImpl().apply(block)
}

/**
 * ComputedPropName#expression: Expression
 * extension function for create Expression -> UpdateExpressionImpl
 */
fun ComputedPropName.updateExpression(block: UpdateExpression.() -> Unit): UpdateExpression {
    return UpdateExpressionImpl().apply(block)
}

/**
 * ComputedPropName#expression: Expression
 * extension function for create Expression -> BinaryExpressionImpl
 */
fun ComputedPropName.binaryExpression(block: BinaryExpression.() -> Unit): BinaryExpression {
    return BinaryExpressionImpl().apply(block)
}

/**
 * ComputedPropName#expression: Expression
 * extension function for create Expression -> AssignmentExpressionImpl
 */
fun ComputedPropName.assignmentExpression(block: AssignmentExpression.() -> Unit): AssignmentExpression {
    return AssignmentExpressionImpl().apply(block)
}

/**
 * ComputedPropName#expression: Expression
 * extension function for create Expression -> MemberExpressionImpl
 */
fun ComputedPropName.memberExpression(block: MemberExpression.() -> Unit): MemberExpression {
    return MemberExpressionImpl().apply(block)
}

/**
 * ComputedPropName#expression: Expression
 * extension function for create Expression -> SuperPropExpressionImpl
 */
fun ComputedPropName.superPropExpression(block: SuperPropExpression.() -> Unit): SuperPropExpression {
    return SuperPropExpressionImpl().apply(block)
}

/**
 * ComputedPropName#expression: Expression
 * extension function for create Expression -> ConditionalExpressionImpl
 */
fun ComputedPropName.conditionalExpression(block: ConditionalExpression.() -> Unit): ConditionalExpression {
    return ConditionalExpressionImpl().apply(block)
}

/**
 * ComputedPropName#expression: Expression
 * extension function for create Expression -> CallExpressionImpl
 */
fun ComputedPropName.callExpression(block: CallExpression.() -> Unit): CallExpression {
    return CallExpressionImpl().apply(block)
}

/**
 * ComputedPropName#expression: Expression
 * extension function for create Expression -> NewExpressionImpl
 */
fun ComputedPropName.newExpression(block: NewExpression.() -> Unit): NewExpression {
    return NewExpressionImpl().apply(block)
}

/**
 * ComputedPropName#expression: Expression
 * extension function for create Expression -> SequenceExpressionImpl
 */
fun ComputedPropName.sequenceExpression(block: SequenceExpression.() -> Unit): SequenceExpression {
    return SequenceExpressionImpl().apply(block)
}

/**
 * ComputedPropName#expression: Expression
 * extension function for create Expression -> IdentifierImpl
 */
fun ComputedPropName.identifier(block: Identifier.() -> Unit): Identifier {
    return IdentifierImpl().apply(block)
}

/**
 * ComputedPropName#expression: Expression
 * extension function for create Expression -> StringLiteralImpl
 */
fun ComputedPropName.stringLiteral(block: StringLiteral.() -> Unit): StringLiteral {
    return StringLiteralImpl().apply(block)
}

/**
 * ComputedPropName#expression: Expression
 * extension function for create Expression -> BooleanLiteralImpl
 */
fun ComputedPropName.booleanLiteral(block: BooleanLiteral.() -> Unit): BooleanLiteral {
    return BooleanLiteralImpl().apply(block)
}

/**
 * ComputedPropName#expression: Expression
 * extension function for create Expression -> NullLiteralImpl
 */
fun ComputedPropName.nullLiteral(block: NullLiteral.() -> Unit): NullLiteral {
    return NullLiteralImpl().apply(block)
}

/**
 * ComputedPropName#expression: Expression
 * extension function for create Expression -> NumericLiteralImpl
 */
fun ComputedPropName.numericLiteral(block: NumericLiteral.() -> Unit): NumericLiteral {
    return NumericLiteralImpl().apply(block)
}

/**
 * ComputedPropName#expression: Expression
 * extension function for create Expression -> BigIntLiteralImpl
 */
fun ComputedPropName.bigIntLiteral(block: BigIntLiteral.() -> Unit): BigIntLiteral {
    return BigIntLiteralImpl().apply(block)
}

/**
 * ComputedPropName#expression: Expression
 * extension function for create Expression -> RegExpLiteralImpl
 */
fun ComputedPropName.regExpLiteral(block: RegExpLiteral.() -> Unit): RegExpLiteral {
    return RegExpLiteralImpl().apply(block)
}

/**
 * ComputedPropName#expression: Expression
 * extension function for create Expression -> JSXTextImpl
 */
fun ComputedPropName.jSXText(block: JSXText.() -> Unit): JSXText {
    return JSXTextImpl().apply(block)
}

/**
 * ComputedPropName#expression: Expression
 * extension function for create Expression -> TemplateLiteralImpl
 */
fun ComputedPropName.templateLiteral(block: TemplateLiteral.() -> Unit): TemplateLiteral {
    return TemplateLiteralImpl().apply(block)
}

/**
 * ComputedPropName#expression: Expression
 * extension function for create Expression -> TaggedTemplateExpressionImpl
 */
fun ComputedPropName.taggedTemplateExpression(block: TaggedTemplateExpression.() -> Unit): TaggedTemplateExpression {
    return TaggedTemplateExpressionImpl().apply(block)
}

/**
 * ComputedPropName#expression: Expression
 * extension function for create Expression -> ArrowFunctionExpressionImpl
 */
fun ComputedPropName.arrowFunctionExpression(block: ArrowFunctionExpression.() -> Unit): ArrowFunctionExpression {
    return ArrowFunctionExpressionImpl().apply(block)
}

/**
 * ComputedPropName#expression: Expression
 * extension function for create Expression -> ClassExpressionImpl
 */
fun ComputedPropName.classExpression(block: ClassExpression.() -> Unit): ClassExpression {
    return ClassExpressionImpl().apply(block)
}

/**
 * ComputedPropName#expression: Expression
 * extension function for create Expression -> YieldExpressionImpl
 */
fun ComputedPropName.yieldExpression(block: YieldExpression.() -> Unit): YieldExpression {
    return YieldExpressionImpl().apply(block)
}

/**
 * ComputedPropName#expression: Expression
 * extension function for create Expression -> MetaPropertyImpl
 */
fun ComputedPropName.metaProperty(block: MetaProperty.() -> Unit): MetaProperty {
    return MetaPropertyImpl().apply(block)
}

/**
 * ComputedPropName#expression: Expression
 * extension function for create Expression -> AwaitExpressionImpl
 */
fun ComputedPropName.awaitExpression(block: AwaitExpression.() -> Unit): AwaitExpression {
    return AwaitExpressionImpl().apply(block)
}

/**
 * ComputedPropName#expression: Expression
 * extension function for create Expression -> ParenthesisExpressionImpl
 */
fun ComputedPropName.parenthesisExpression(block: ParenthesisExpression.() -> Unit): ParenthesisExpression {
    return ParenthesisExpressionImpl().apply(block)
}

/**
 * ComputedPropName#expression: Expression
 * extension function for create Expression -> JSXMemberExpressionImpl
 */
fun ComputedPropName.jSXMemberExpression(block: JSXMemberExpression.() -> Unit): JSXMemberExpression {
    return JSXMemberExpressionImpl().apply(block)
}

/**
 * ComputedPropName#expression: Expression
 * extension function for create Expression -> JSXNamespacedNameImpl
 */
fun ComputedPropName.jSXNamespacedName(block: JSXNamespacedName.() -> Unit): JSXNamespacedName {
    return JSXNamespacedNameImpl().apply(block)
}

/**
 * ComputedPropName#expression: Expression
 * extension function for create Expression -> JSXEmptyExpressionImpl
 */
fun ComputedPropName.jSXEmptyExpression(block: JSXEmptyExpression.() -> Unit): JSXEmptyExpression {
    return JSXEmptyExpressionImpl().apply(block)
}

/**
 * ComputedPropName#expression: Expression
 * extension function for create Expression -> JSXElementImpl
 */
fun ComputedPropName.jSXElement(block: JSXElement.() -> Unit): JSXElement {
    return JSXElementImpl().apply(block)
}

/**
 * ComputedPropName#expression: Expression
 * extension function for create Expression -> JSXFragmentImpl
 */
fun ComputedPropName.jSXFragment(block: JSXFragment.() -> Unit): JSXFragment {
    return JSXFragmentImpl().apply(block)
}

/**
 * ComputedPropName#expression: Expression
 * extension function for create Expression -> TsTypeAssertionImpl
 */
fun ComputedPropName.tsTypeAssertion(block: TsTypeAssertion.() -> Unit): TsTypeAssertion {
    return TsTypeAssertionImpl().apply(block)
}

/**
 * ComputedPropName#expression: Expression
 * extension function for create Expression -> TsConstAssertionImpl
 */
fun ComputedPropName.tsConstAssertion(block: TsConstAssertion.() -> Unit): TsConstAssertion {
    return TsConstAssertionImpl().apply(block)
}

/**
 * ComputedPropName#expression: Expression
 * extension function for create Expression -> TsNonNullExpressionImpl
 */
fun ComputedPropName.tsNonNullExpression(block: TsNonNullExpression.() -> Unit): TsNonNullExpression {
    return TsNonNullExpressionImpl().apply(block)
}

/**
 * ComputedPropName#expression: Expression
 * extension function for create Expression -> TsAsExpressionImpl
 */
fun ComputedPropName.tsAsExpression(block: TsAsExpression.() -> Unit): TsAsExpression {
    return TsAsExpressionImpl().apply(block)
}

/**
 * ComputedPropName#expression: Expression
 * extension function for create Expression -> TsSatisfiesExpressionImpl
 */
fun ComputedPropName.tsSatisfiesExpression(block: TsSatisfiesExpression.() -> Unit): TsSatisfiesExpression {
    return TsSatisfiesExpressionImpl().apply(block)
}

/**
 * ComputedPropName#expression: Expression
 * extension function for create Expression -> TsInstantiationImpl
 */
fun ComputedPropName.tsInstantiation(block: TsInstantiation.() -> Unit): TsInstantiation {
    return TsInstantiationImpl().apply(block)
}

/**
 * ComputedPropName#expression: Expression
 * extension function for create Expression -> PrivateNameImpl
 */
fun ComputedPropName.privateName(block: PrivateName.() -> Unit): PrivateName {
    return PrivateNameImpl().apply(block)
}

/**
 * ComputedPropName#expression: Expression
 * extension function for create Expression -> OptionalChainingExpressionImpl
 */
fun ComputedPropName.optionalChainingExpression(block: OptionalChainingExpression.() -> Unit): OptionalChainingExpression {
    return OptionalChainingExpressionImpl().apply(block)
}

/**
 * ComputedPropName#expression: Expression
 * extension function for create Expression -> InvalidImpl
 */
fun ComputedPropName.invalid(block: Invalid.() -> Unit): Invalid {
    return InvalidImpl().apply(block)
}

fun ComputedPropName.span(block: Span.() -> Unit): Span {
    return Span().apply(block)
}
