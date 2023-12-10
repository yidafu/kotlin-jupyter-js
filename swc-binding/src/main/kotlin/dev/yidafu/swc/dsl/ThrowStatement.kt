package dev.yidafu.swc.dsl

import dev.yidafu.swc.types.*

/**
 * ThrowStatement#argument: Expression
 * extension function for create Expression -> ThisExpressionImpl
 */
fun ThrowStatement.thisExpression(block: ThisExpression.() -> Unit): ThisExpression {
    return ThisExpressionImpl().apply(block)
}

/**
 * ThrowStatement#argument: Expression
 * extension function for create Expression -> ArrayExpressionImpl
 */
fun ThrowStatement.arrayExpression(block: ArrayExpression.() -> Unit): ArrayExpression {
    return ArrayExpressionImpl().apply(block)
}

/**
 * ThrowStatement#argument: Expression
 * extension function for create Expression -> ObjectExpressionImpl
 */
fun ThrowStatement.objectExpression(block: ObjectExpression.() -> Unit): ObjectExpression {
    return ObjectExpressionImpl().apply(block)
}

/**
 * ThrowStatement#argument: Expression
 * extension function for create Expression -> FunctionExpressionImpl
 */
fun ThrowStatement.functionExpression(block: FunctionExpression.() -> Unit): FunctionExpression {
    return FunctionExpressionImpl().apply(block)
}

/**
 * ThrowStatement#argument: Expression
 * extension function for create Expression -> UnaryExpressionImpl
 */
fun ThrowStatement.unaryExpression(block: UnaryExpression.() -> Unit): UnaryExpression {
    return UnaryExpressionImpl().apply(block)
}

/**
 * ThrowStatement#argument: Expression
 * extension function for create Expression -> UpdateExpressionImpl
 */
fun ThrowStatement.updateExpression(block: UpdateExpression.() -> Unit): UpdateExpression {
    return UpdateExpressionImpl().apply(block)
}

/**
 * ThrowStatement#argument: Expression
 * extension function for create Expression -> BinaryExpressionImpl
 */
fun ThrowStatement.binaryExpression(block: BinaryExpression.() -> Unit): BinaryExpression {
    return BinaryExpressionImpl().apply(block)
}

/**
 * ThrowStatement#argument: Expression
 * extension function for create Expression -> AssignmentExpressionImpl
 */
fun ThrowStatement.assignmentExpression(block: AssignmentExpression.() -> Unit): AssignmentExpression {
    return AssignmentExpressionImpl().apply(block)
}

/**
 * ThrowStatement#argument: Expression
 * extension function for create Expression -> MemberExpressionImpl
 */
fun ThrowStatement.memberExpression(block: MemberExpression.() -> Unit): MemberExpression {
    return MemberExpressionImpl().apply(block)
}

/**
 * ThrowStatement#argument: Expression
 * extension function for create Expression -> SuperPropExpressionImpl
 */
fun ThrowStatement.superPropExpression(block: SuperPropExpression.() -> Unit): SuperPropExpression {
    return SuperPropExpressionImpl().apply(block)
}

/**
 * ThrowStatement#argument: Expression
 * extension function for create Expression -> ConditionalExpressionImpl
 */
fun ThrowStatement.conditionalExpression(block: ConditionalExpression.() -> Unit): ConditionalExpression {
    return ConditionalExpressionImpl().apply(block)
}

/**
 * ThrowStatement#argument: Expression
 * extension function for create Expression -> CallExpressionImpl
 */
fun ThrowStatement.callExpression(block: CallExpression.() -> Unit): CallExpression {
    return CallExpressionImpl().apply(block)
}

/**
 * ThrowStatement#argument: Expression
 * extension function for create Expression -> NewExpressionImpl
 */
fun ThrowStatement.newExpression(block: NewExpression.() -> Unit): NewExpression {
    return NewExpressionImpl().apply(block)
}

/**
 * ThrowStatement#argument: Expression
 * extension function for create Expression -> SequenceExpressionImpl
 */
fun ThrowStatement.sequenceExpression(block: SequenceExpression.() -> Unit): SequenceExpression {
    return SequenceExpressionImpl().apply(block)
}

/**
 * ThrowStatement#argument: Expression
 * extension function for create Expression -> IdentifierImpl
 */
fun ThrowStatement.identifier(block: Identifier.() -> Unit): Identifier {
    return IdentifierImpl().apply(block)
}

/**
 * ThrowStatement#argument: Expression
 * extension function for create Expression -> StringLiteralImpl
 */
fun ThrowStatement.stringLiteral(block: StringLiteral.() -> Unit): StringLiteral {
    return StringLiteralImpl().apply(block)
}

/**
 * ThrowStatement#argument: Expression
 * extension function for create Expression -> BooleanLiteralImpl
 */
fun ThrowStatement.booleanLiteral(block: BooleanLiteral.() -> Unit): BooleanLiteral {
    return BooleanLiteralImpl().apply(block)
}

/**
 * ThrowStatement#argument: Expression
 * extension function for create Expression -> NullLiteralImpl
 */
fun ThrowStatement.nullLiteral(block: NullLiteral.() -> Unit): NullLiteral {
    return NullLiteralImpl().apply(block)
}

/**
 * ThrowStatement#argument: Expression
 * extension function for create Expression -> NumericLiteralImpl
 */
fun ThrowStatement.numericLiteral(block: NumericLiteral.() -> Unit): NumericLiteral {
    return NumericLiteralImpl().apply(block)
}

/**
 * ThrowStatement#argument: Expression
 * extension function for create Expression -> BigIntLiteralImpl
 */
fun ThrowStatement.bigIntLiteral(block: BigIntLiteral.() -> Unit): BigIntLiteral {
    return BigIntLiteralImpl().apply(block)
}

/**
 * ThrowStatement#argument: Expression
 * extension function for create Expression -> RegExpLiteralImpl
 */
fun ThrowStatement.regExpLiteral(block: RegExpLiteral.() -> Unit): RegExpLiteral {
    return RegExpLiteralImpl().apply(block)
}

/**
 * ThrowStatement#argument: Expression
 * extension function for create Expression -> JSXTextImpl
 */
fun ThrowStatement.jSXText(block: JSXText.() -> Unit): JSXText {
    return JSXTextImpl().apply(block)
}

/**
 * ThrowStatement#argument: Expression
 * extension function for create Expression -> TemplateLiteralImpl
 */
fun ThrowStatement.templateLiteral(block: TemplateLiteral.() -> Unit): TemplateLiteral {
    return TemplateLiteralImpl().apply(block)
}

/**
 * ThrowStatement#argument: Expression
 * extension function for create Expression -> TaggedTemplateExpressionImpl
 */
fun ThrowStatement.taggedTemplateExpression(block: TaggedTemplateExpression.() -> Unit): TaggedTemplateExpression {
    return TaggedTemplateExpressionImpl().apply(block)
}

/**
 * ThrowStatement#argument: Expression
 * extension function for create Expression -> ArrowFunctionExpressionImpl
 */
fun ThrowStatement.arrowFunctionExpression(block: ArrowFunctionExpression.() -> Unit): ArrowFunctionExpression {
    return ArrowFunctionExpressionImpl().apply(block)
}

/**
 * ThrowStatement#argument: Expression
 * extension function for create Expression -> ClassExpressionImpl
 */
fun ThrowStatement.classExpression(block: ClassExpression.() -> Unit): ClassExpression {
    return ClassExpressionImpl().apply(block)
}

/**
 * ThrowStatement#argument: Expression
 * extension function for create Expression -> YieldExpressionImpl
 */
fun ThrowStatement.yieldExpression(block: YieldExpression.() -> Unit): YieldExpression {
    return YieldExpressionImpl().apply(block)
}

/**
 * ThrowStatement#argument: Expression
 * extension function for create Expression -> MetaPropertyImpl
 */
fun ThrowStatement.metaProperty(block: MetaProperty.() -> Unit): MetaProperty {
    return MetaPropertyImpl().apply(block)
}

/**
 * ThrowStatement#argument: Expression
 * extension function for create Expression -> AwaitExpressionImpl
 */
fun ThrowStatement.awaitExpression(block: AwaitExpression.() -> Unit): AwaitExpression {
    return AwaitExpressionImpl().apply(block)
}

/**
 * ThrowStatement#argument: Expression
 * extension function for create Expression -> ParenthesisExpressionImpl
 */
fun ThrowStatement.parenthesisExpression(block: ParenthesisExpression.() -> Unit): ParenthesisExpression {
    return ParenthesisExpressionImpl().apply(block)
}

/**
 * ThrowStatement#argument: Expression
 * extension function for create Expression -> JSXMemberExpressionImpl
 */
fun ThrowStatement.jSXMemberExpression(block: JSXMemberExpression.() -> Unit): JSXMemberExpression {
    return JSXMemberExpressionImpl().apply(block)
}

/**
 * ThrowStatement#argument: Expression
 * extension function for create Expression -> JSXNamespacedNameImpl
 */
fun ThrowStatement.jSXNamespacedName(block: JSXNamespacedName.() -> Unit): JSXNamespacedName {
    return JSXNamespacedNameImpl().apply(block)
}

/**
 * ThrowStatement#argument: Expression
 * extension function for create Expression -> JSXEmptyExpressionImpl
 */
fun ThrowStatement.jSXEmptyExpression(block: JSXEmptyExpression.() -> Unit): JSXEmptyExpression {
    return JSXEmptyExpressionImpl().apply(block)
}

/**
 * ThrowStatement#argument: Expression
 * extension function for create Expression -> JSXElementImpl
 */
fun ThrowStatement.jSXElement(block: JSXElement.() -> Unit): JSXElement {
    return JSXElementImpl().apply(block)
}

/**
 * ThrowStatement#argument: Expression
 * extension function for create Expression -> JSXFragmentImpl
 */
fun ThrowStatement.jSXFragment(block: JSXFragment.() -> Unit): JSXFragment {
    return JSXFragmentImpl().apply(block)
}

/**
 * ThrowStatement#argument: Expression
 * extension function for create Expression -> TsTypeAssertionImpl
 */
fun ThrowStatement.tsTypeAssertion(block: TsTypeAssertion.() -> Unit): TsTypeAssertion {
    return TsTypeAssertionImpl().apply(block)
}

/**
 * ThrowStatement#argument: Expression
 * extension function for create Expression -> TsConstAssertionImpl
 */
fun ThrowStatement.tsConstAssertion(block: TsConstAssertion.() -> Unit): TsConstAssertion {
    return TsConstAssertionImpl().apply(block)
}

/**
 * ThrowStatement#argument: Expression
 * extension function for create Expression -> TsNonNullExpressionImpl
 */
fun ThrowStatement.tsNonNullExpression(block: TsNonNullExpression.() -> Unit): TsNonNullExpression {
    return TsNonNullExpressionImpl().apply(block)
}

/**
 * ThrowStatement#argument: Expression
 * extension function for create Expression -> TsAsExpressionImpl
 */
fun ThrowStatement.tsAsExpression(block: TsAsExpression.() -> Unit): TsAsExpression {
    return TsAsExpressionImpl().apply(block)
}

/**
 * ThrowStatement#argument: Expression
 * extension function for create Expression -> TsSatisfiesExpressionImpl
 */
fun ThrowStatement.tsSatisfiesExpression(block: TsSatisfiesExpression.() -> Unit): TsSatisfiesExpression {
    return TsSatisfiesExpressionImpl().apply(block)
}

/**
 * ThrowStatement#argument: Expression
 * extension function for create Expression -> TsInstantiationImpl
 */
fun ThrowStatement.tsInstantiation(block: TsInstantiation.() -> Unit): TsInstantiation {
    return TsInstantiationImpl().apply(block)
}

/**
 * ThrowStatement#argument: Expression
 * extension function for create Expression -> PrivateNameImpl
 */
fun ThrowStatement.privateName(block: PrivateName.() -> Unit): PrivateName {
    return PrivateNameImpl().apply(block)
}

/**
 * ThrowStatement#argument: Expression
 * extension function for create Expression -> OptionalChainingExpressionImpl
 */
fun ThrowStatement.optionalChainingExpression(block: OptionalChainingExpression.() -> Unit): OptionalChainingExpression {
    return OptionalChainingExpressionImpl().apply(block)
}

/**
 * ThrowStatement#argument: Expression
 * extension function for create Expression -> InvalidImpl
 */
fun ThrowStatement.invalid(block: Invalid.() -> Unit): Invalid {
    return InvalidImpl().apply(block)
}

fun ThrowStatement.span(block: Span.() -> Unit): Span {
    return Span().apply(block)
}
