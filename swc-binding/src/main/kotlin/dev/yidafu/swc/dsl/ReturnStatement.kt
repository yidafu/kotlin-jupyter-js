package dev.yidafu.swc.dsl

import dev.yidafu.swc.types.*

/**
 * ReturnStatement#argument: Expression
 * extension function for create Expression -> ThisExpressionImpl
 */
fun ReturnStatement.thisExpression(block: ThisExpression.() -> Unit): ThisExpression {
    return ThisExpressionImpl().apply(block)
}

/**
 * ReturnStatement#argument: Expression
 * extension function for create Expression -> ArrayExpressionImpl
 */
fun ReturnStatement.arrayExpression(block: ArrayExpression.() -> Unit): ArrayExpression {
    return ArrayExpressionImpl().apply(block)
}

/**
 * ReturnStatement#argument: Expression
 * extension function for create Expression -> ObjectExpressionImpl
 */
fun ReturnStatement.objectExpression(block: ObjectExpression.() -> Unit): ObjectExpression {
    return ObjectExpressionImpl().apply(block)
}

/**
 * ReturnStatement#argument: Expression
 * extension function for create Expression -> FunctionExpressionImpl
 */
fun ReturnStatement.functionExpression(block: FunctionExpression.() -> Unit): FunctionExpression {
    return FunctionExpressionImpl().apply(block)
}

/**
 * ReturnStatement#argument: Expression
 * extension function for create Expression -> UnaryExpressionImpl
 */
fun ReturnStatement.unaryExpression(block: UnaryExpression.() -> Unit): UnaryExpression {
    return UnaryExpressionImpl().apply(block)
}

/**
 * ReturnStatement#argument: Expression
 * extension function for create Expression -> UpdateExpressionImpl
 */
fun ReturnStatement.updateExpression(block: UpdateExpression.() -> Unit): UpdateExpression {
    return UpdateExpressionImpl().apply(block)
}

/**
 * ReturnStatement#argument: Expression
 * extension function for create Expression -> BinaryExpressionImpl
 */
fun ReturnStatement.binaryExpression(block: BinaryExpression.() -> Unit): BinaryExpression {
    return BinaryExpressionImpl().apply(block)
}

/**
 * ReturnStatement#argument: Expression
 * extension function for create Expression -> AssignmentExpressionImpl
 */
fun ReturnStatement.assignmentExpression(block: AssignmentExpression.() -> Unit): AssignmentExpression {
    return AssignmentExpressionImpl().apply(block)
}

/**
 * ReturnStatement#argument: Expression
 * extension function for create Expression -> MemberExpressionImpl
 */
fun ReturnStatement.memberExpression(block: MemberExpression.() -> Unit): MemberExpression {
    return MemberExpressionImpl().apply(block)
}

/**
 * ReturnStatement#argument: Expression
 * extension function for create Expression -> SuperPropExpressionImpl
 */
fun ReturnStatement.superPropExpression(block: SuperPropExpression.() -> Unit): SuperPropExpression {
    return SuperPropExpressionImpl().apply(block)
}

/**
 * ReturnStatement#argument: Expression
 * extension function for create Expression -> ConditionalExpressionImpl
 */
fun ReturnStatement.conditionalExpression(block: ConditionalExpression.() -> Unit): ConditionalExpression {
    return ConditionalExpressionImpl().apply(block)
}

/**
 * ReturnStatement#argument: Expression
 * extension function for create Expression -> CallExpressionImpl
 */
fun ReturnStatement.callExpression(block: CallExpression.() -> Unit): CallExpression {
    return CallExpressionImpl().apply(block)
}

/**
 * ReturnStatement#argument: Expression
 * extension function for create Expression -> NewExpressionImpl
 */
fun ReturnStatement.newExpression(block: NewExpression.() -> Unit): NewExpression {
    return NewExpressionImpl().apply(block)
}

/**
 * ReturnStatement#argument: Expression
 * extension function for create Expression -> SequenceExpressionImpl
 */
fun ReturnStatement.sequenceExpression(block: SequenceExpression.() -> Unit): SequenceExpression {
    return SequenceExpressionImpl().apply(block)
}

/**
 * ReturnStatement#argument: Expression
 * extension function for create Expression -> IdentifierImpl
 */
fun ReturnStatement.identifier(block: Identifier.() -> Unit): Identifier {
    return IdentifierImpl().apply(block)
}

/**
 * ReturnStatement#argument: Expression
 * extension function for create Expression -> StringLiteralImpl
 */
fun ReturnStatement.stringLiteral(block: StringLiteral.() -> Unit): StringLiteral {
    return StringLiteralImpl().apply(block)
}

/**
 * ReturnStatement#argument: Expression
 * extension function for create Expression -> BooleanLiteralImpl
 */
fun ReturnStatement.booleanLiteral(block: BooleanLiteral.() -> Unit): BooleanLiteral {
    return BooleanLiteralImpl().apply(block)
}

/**
 * ReturnStatement#argument: Expression
 * extension function for create Expression -> NullLiteralImpl
 */
fun ReturnStatement.nullLiteral(block: NullLiteral.() -> Unit): NullLiteral {
    return NullLiteralImpl().apply(block)
}

/**
 * ReturnStatement#argument: Expression
 * extension function for create Expression -> NumericLiteralImpl
 */
fun ReturnStatement.numericLiteral(block: NumericLiteral.() -> Unit): NumericLiteral {
    return NumericLiteralImpl().apply(block)
}

/**
 * ReturnStatement#argument: Expression
 * extension function for create Expression -> BigIntLiteralImpl
 */
fun ReturnStatement.bigIntLiteral(block: BigIntLiteral.() -> Unit): BigIntLiteral {
    return BigIntLiteralImpl().apply(block)
}

/**
 * ReturnStatement#argument: Expression
 * extension function for create Expression -> RegExpLiteralImpl
 */
fun ReturnStatement.regExpLiteral(block: RegExpLiteral.() -> Unit): RegExpLiteral {
    return RegExpLiteralImpl().apply(block)
}

/**
 * ReturnStatement#argument: Expression
 * extension function for create Expression -> JSXTextImpl
 */
fun ReturnStatement.jSXText(block: JSXText.() -> Unit): JSXText {
    return JSXTextImpl().apply(block)
}

/**
 * ReturnStatement#argument: Expression
 * extension function for create Expression -> TemplateLiteralImpl
 */
fun ReturnStatement.templateLiteral(block: TemplateLiteral.() -> Unit): TemplateLiteral {
    return TemplateLiteralImpl().apply(block)
}

/**
 * ReturnStatement#argument: Expression
 * extension function for create Expression -> TaggedTemplateExpressionImpl
 */
fun ReturnStatement.taggedTemplateExpression(block: TaggedTemplateExpression.() -> Unit): TaggedTemplateExpression {
    return TaggedTemplateExpressionImpl().apply(block)
}

/**
 * ReturnStatement#argument: Expression
 * extension function for create Expression -> ArrowFunctionExpressionImpl
 */
fun ReturnStatement.arrowFunctionExpression(block: ArrowFunctionExpression.() -> Unit): ArrowFunctionExpression {
    return ArrowFunctionExpressionImpl().apply(block)
}

/**
 * ReturnStatement#argument: Expression
 * extension function for create Expression -> ClassExpressionImpl
 */
fun ReturnStatement.classExpression(block: ClassExpression.() -> Unit): ClassExpression {
    return ClassExpressionImpl().apply(block)
}

/**
 * ReturnStatement#argument: Expression
 * extension function for create Expression -> YieldExpressionImpl
 */
fun ReturnStatement.yieldExpression(block: YieldExpression.() -> Unit): YieldExpression {
    return YieldExpressionImpl().apply(block)
}

/**
 * ReturnStatement#argument: Expression
 * extension function for create Expression -> MetaPropertyImpl
 */
fun ReturnStatement.metaProperty(block: MetaProperty.() -> Unit): MetaProperty {
    return MetaPropertyImpl().apply(block)
}

/**
 * ReturnStatement#argument: Expression
 * extension function for create Expression -> AwaitExpressionImpl
 */
fun ReturnStatement.awaitExpression(block: AwaitExpression.() -> Unit): AwaitExpression {
    return AwaitExpressionImpl().apply(block)
}

/**
 * ReturnStatement#argument: Expression
 * extension function for create Expression -> ParenthesisExpressionImpl
 */
fun ReturnStatement.parenthesisExpression(block: ParenthesisExpression.() -> Unit): ParenthesisExpression {
    return ParenthesisExpressionImpl().apply(block)
}

/**
 * ReturnStatement#argument: Expression
 * extension function for create Expression -> JSXMemberExpressionImpl
 */
fun ReturnStatement.jSXMemberExpression(block: JSXMemberExpression.() -> Unit): JSXMemberExpression {
    return JSXMemberExpressionImpl().apply(block)
}

/**
 * ReturnStatement#argument: Expression
 * extension function for create Expression -> JSXNamespacedNameImpl
 */
fun ReturnStatement.jSXNamespacedName(block: JSXNamespacedName.() -> Unit): JSXNamespacedName {
    return JSXNamespacedNameImpl().apply(block)
}

/**
 * ReturnStatement#argument: Expression
 * extension function for create Expression -> JSXEmptyExpressionImpl
 */
fun ReturnStatement.jSXEmptyExpression(block: JSXEmptyExpression.() -> Unit): JSXEmptyExpression {
    return JSXEmptyExpressionImpl().apply(block)
}

/**
 * ReturnStatement#argument: Expression
 * extension function for create Expression -> JSXElementImpl
 */
fun ReturnStatement.jSXElement(block: JSXElement.() -> Unit): JSXElement {
    return JSXElementImpl().apply(block)
}

/**
 * ReturnStatement#argument: Expression
 * extension function for create Expression -> JSXFragmentImpl
 */
fun ReturnStatement.jSXFragment(block: JSXFragment.() -> Unit): JSXFragment {
    return JSXFragmentImpl().apply(block)
}

/**
 * ReturnStatement#argument: Expression
 * extension function for create Expression -> TsTypeAssertionImpl
 */
fun ReturnStatement.tsTypeAssertion(block: TsTypeAssertion.() -> Unit): TsTypeAssertion {
    return TsTypeAssertionImpl().apply(block)
}

/**
 * ReturnStatement#argument: Expression
 * extension function for create Expression -> TsConstAssertionImpl
 */
fun ReturnStatement.tsConstAssertion(block: TsConstAssertion.() -> Unit): TsConstAssertion {
    return TsConstAssertionImpl().apply(block)
}

/**
 * ReturnStatement#argument: Expression
 * extension function for create Expression -> TsNonNullExpressionImpl
 */
fun ReturnStatement.tsNonNullExpression(block: TsNonNullExpression.() -> Unit): TsNonNullExpression {
    return TsNonNullExpressionImpl().apply(block)
}

/**
 * ReturnStatement#argument: Expression
 * extension function for create Expression -> TsAsExpressionImpl
 */
fun ReturnStatement.tsAsExpression(block: TsAsExpression.() -> Unit): TsAsExpression {
    return TsAsExpressionImpl().apply(block)
}

/**
 * ReturnStatement#argument: Expression
 * extension function for create Expression -> TsSatisfiesExpressionImpl
 */
fun ReturnStatement.tsSatisfiesExpression(block: TsSatisfiesExpression.() -> Unit): TsSatisfiesExpression {
    return TsSatisfiesExpressionImpl().apply(block)
}

/**
 * ReturnStatement#argument: Expression
 * extension function for create Expression -> TsInstantiationImpl
 */
fun ReturnStatement.tsInstantiation(block: TsInstantiation.() -> Unit): TsInstantiation {
    return TsInstantiationImpl().apply(block)
}

/**
 * ReturnStatement#argument: Expression
 * extension function for create Expression -> PrivateNameImpl
 */
fun ReturnStatement.privateName(block: PrivateName.() -> Unit): PrivateName {
    return PrivateNameImpl().apply(block)
}

/**
 * ReturnStatement#argument: Expression
 * extension function for create Expression -> OptionalChainingExpressionImpl
 */
fun ReturnStatement.optionalChainingExpression(block: OptionalChainingExpression.() -> Unit): OptionalChainingExpression {
    return OptionalChainingExpressionImpl().apply(block)
}

/**
 * ReturnStatement#argument: Expression
 * extension function for create Expression -> InvalidImpl
 */
fun ReturnStatement.invalid(block: Invalid.() -> Unit): Invalid {
    return InvalidImpl().apply(block)
}

fun ReturnStatement.span(block: Span.() -> Unit): Span {
    return Span().apply(block)
}
