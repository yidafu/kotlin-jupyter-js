package dev.yidafu.swc.dsl

import dev.yidafu.swc.types.*

fun Argument.span(block: Span.() -> Unit): Span {
    return Span().apply(block)
}

/**
 * Argument#expression: Expression
 * extension function for create Expression -> ThisExpressionImpl
 */
fun Argument.thisExpression(block: ThisExpression.() -> Unit): ThisExpression {
    return ThisExpressionImpl().apply(block)
}

/**
 * Argument#expression: Expression
 * extension function for create Expression -> ArrayExpressionImpl
 */
fun Argument.arrayExpression(block: ArrayExpression.() -> Unit): ArrayExpression {
    return ArrayExpressionImpl().apply(block)
}

/**
 * Argument#expression: Expression
 * extension function for create Expression -> ObjectExpressionImpl
 */
fun Argument.objectExpression(block: ObjectExpression.() -> Unit): ObjectExpression {
    return ObjectExpressionImpl().apply(block)
}

/**
 * Argument#expression: Expression
 * extension function for create Expression -> FunctionExpressionImpl
 */
fun Argument.functionExpression(block: FunctionExpression.() -> Unit): FunctionExpression {
    return FunctionExpressionImpl().apply(block)
}

/**
 * Argument#expression: Expression
 * extension function for create Expression -> UnaryExpressionImpl
 */
fun Argument.unaryExpression(block: UnaryExpression.() -> Unit): UnaryExpression {
    return UnaryExpressionImpl().apply(block)
}

/**
 * Argument#expression: Expression
 * extension function for create Expression -> UpdateExpressionImpl
 */
fun Argument.updateExpression(block: UpdateExpression.() -> Unit): UpdateExpression {
    return UpdateExpressionImpl().apply(block)
}

/**
 * Argument#expression: Expression
 * extension function for create Expression -> BinaryExpressionImpl
 */
fun Argument.binaryExpression(block: BinaryExpression.() -> Unit): BinaryExpression {
    return BinaryExpressionImpl().apply(block)
}

/**
 * Argument#expression: Expression
 * extension function for create Expression -> AssignmentExpressionImpl
 */
fun Argument.assignmentExpression(block: AssignmentExpression.() -> Unit): AssignmentExpression {
    return AssignmentExpressionImpl().apply(block)
}

/**
 * Argument#expression: Expression
 * extension function for create Expression -> MemberExpressionImpl
 */
fun Argument.memberExpression(block: MemberExpression.() -> Unit): MemberExpression {
    return MemberExpressionImpl().apply(block)
}

/**
 * Argument#expression: Expression
 * extension function for create Expression -> SuperPropExpressionImpl
 */
fun Argument.superPropExpression(block: SuperPropExpression.() -> Unit): SuperPropExpression {
    return SuperPropExpressionImpl().apply(block)
}

/**
 * Argument#expression: Expression
 * extension function for create Expression -> ConditionalExpressionImpl
 */
fun Argument.conditionalExpression(block: ConditionalExpression.() -> Unit): ConditionalExpression {
    return ConditionalExpressionImpl().apply(block)
}

/**
 * Argument#expression: Expression
 * extension function for create Expression -> CallExpressionImpl
 */
fun Argument.callExpression(block: CallExpression.() -> Unit): CallExpression {
    return CallExpressionImpl().apply(block)
}

/**
 * Argument#expression: Expression
 * extension function for create Expression -> NewExpressionImpl
 */
fun Argument.newExpression(block: NewExpression.() -> Unit): NewExpression {
    return NewExpressionImpl().apply(block)
}

/**
 * Argument#expression: Expression
 * extension function for create Expression -> SequenceExpressionImpl
 */
fun Argument.sequenceExpression(block: SequenceExpression.() -> Unit): SequenceExpression {
    return SequenceExpressionImpl().apply(block)
}

/**
 * Argument#expression: Expression
 * extension function for create Expression -> IdentifierImpl
 */
fun Argument.identifier(block: Identifier.() -> Unit): Identifier {
    return IdentifierImpl().apply(block)
}

/**
 * Argument#expression: Expression
 * extension function for create Expression -> StringLiteralImpl
 */
fun Argument.stringLiteral(block: StringLiteral.() -> Unit): StringLiteral {
    return StringLiteralImpl().apply(block)
}

/**
 * Argument#expression: Expression
 * extension function for create Expression -> BooleanLiteralImpl
 */
fun Argument.booleanLiteral(block: BooleanLiteral.() -> Unit): BooleanLiteral {
    return BooleanLiteralImpl().apply(block)
}

/**
 * Argument#expression: Expression
 * extension function for create Expression -> NullLiteralImpl
 */
fun Argument.nullLiteral(block: NullLiteral.() -> Unit): NullLiteral {
    return NullLiteralImpl().apply(block)
}

/**
 * Argument#expression: Expression
 * extension function for create Expression -> NumericLiteralImpl
 */
fun Argument.numericLiteral(block: NumericLiteral.() -> Unit): NumericLiteral {
    return NumericLiteralImpl().apply(block)
}

/**
 * Argument#expression: Expression
 * extension function for create Expression -> BigIntLiteralImpl
 */
fun Argument.bigIntLiteral(block: BigIntLiteral.() -> Unit): BigIntLiteral {
    return BigIntLiteralImpl().apply(block)
}

/**
 * Argument#expression: Expression
 * extension function for create Expression -> RegExpLiteralImpl
 */
fun Argument.regExpLiteral(block: RegExpLiteral.() -> Unit): RegExpLiteral {
    return RegExpLiteralImpl().apply(block)
}

/**
 * Argument#expression: Expression
 * extension function for create Expression -> JSXTextImpl
 */
fun Argument.jSXText(block: JSXText.() -> Unit): JSXText {
    return JSXTextImpl().apply(block)
}

/**
 * Argument#expression: Expression
 * extension function for create Expression -> TemplateLiteralImpl
 */
fun Argument.templateLiteral(block: TemplateLiteral.() -> Unit): TemplateLiteral {
    return TemplateLiteralImpl().apply(block)
}

/**
 * Argument#expression: Expression
 * extension function for create Expression -> TaggedTemplateExpressionImpl
 */
fun Argument.taggedTemplateExpression(block: TaggedTemplateExpression.() -> Unit): TaggedTemplateExpression {
    return TaggedTemplateExpressionImpl().apply(block)
}

/**
 * Argument#expression: Expression
 * extension function for create Expression -> ArrowFunctionExpressionImpl
 */
fun Argument.arrowFunctionExpression(block: ArrowFunctionExpression.() -> Unit): ArrowFunctionExpression {
    return ArrowFunctionExpressionImpl().apply(block)
}

/**
 * Argument#expression: Expression
 * extension function for create Expression -> ClassExpressionImpl
 */
fun Argument.classExpression(block: ClassExpression.() -> Unit): ClassExpression {
    return ClassExpressionImpl().apply(block)
}

/**
 * Argument#expression: Expression
 * extension function for create Expression -> YieldExpressionImpl
 */
fun Argument.yieldExpression(block: YieldExpression.() -> Unit): YieldExpression {
    return YieldExpressionImpl().apply(block)
}

/**
 * Argument#expression: Expression
 * extension function for create Expression -> MetaPropertyImpl
 */
fun Argument.metaProperty(block: MetaProperty.() -> Unit): MetaProperty {
    return MetaPropertyImpl().apply(block)
}

/**
 * Argument#expression: Expression
 * extension function for create Expression -> AwaitExpressionImpl
 */
fun Argument.awaitExpression(block: AwaitExpression.() -> Unit): AwaitExpression {
    return AwaitExpressionImpl().apply(block)
}

/**
 * Argument#expression: Expression
 * extension function for create Expression -> ParenthesisExpressionImpl
 */
fun Argument.parenthesisExpression(block: ParenthesisExpression.() -> Unit): ParenthesisExpression {
    return ParenthesisExpressionImpl().apply(block)
}

/**
 * Argument#expression: Expression
 * extension function for create Expression -> JSXMemberExpressionImpl
 */
fun Argument.jSXMemberExpression(block: JSXMemberExpression.() -> Unit): JSXMemberExpression {
    return JSXMemberExpressionImpl().apply(block)
}

/**
 * Argument#expression: Expression
 * extension function for create Expression -> JSXNamespacedNameImpl
 */
fun Argument.jSXNamespacedName(block: JSXNamespacedName.() -> Unit): JSXNamespacedName {
    return JSXNamespacedNameImpl().apply(block)
}

/**
 * Argument#expression: Expression
 * extension function for create Expression -> JSXEmptyExpressionImpl
 */
fun Argument.jSXEmptyExpression(block: JSXEmptyExpression.() -> Unit): JSXEmptyExpression {
    return JSXEmptyExpressionImpl().apply(block)
}

/**
 * Argument#expression: Expression
 * extension function for create Expression -> JSXElementImpl
 */
fun Argument.jSXElement(block: JSXElement.() -> Unit): JSXElement {
    return JSXElementImpl().apply(block)
}

/**
 * Argument#expression: Expression
 * extension function for create Expression -> JSXFragmentImpl
 */
fun Argument.jSXFragment(block: JSXFragment.() -> Unit): JSXFragment {
    return JSXFragmentImpl().apply(block)
}

/**
 * Argument#expression: Expression
 * extension function for create Expression -> TsTypeAssertionImpl
 */
fun Argument.tsTypeAssertion(block: TsTypeAssertion.() -> Unit): TsTypeAssertion {
    return TsTypeAssertionImpl().apply(block)
}

/**
 * Argument#expression: Expression
 * extension function for create Expression -> TsConstAssertionImpl
 */
fun Argument.tsConstAssertion(block: TsConstAssertion.() -> Unit): TsConstAssertion {
    return TsConstAssertionImpl().apply(block)
}

/**
 * Argument#expression: Expression
 * extension function for create Expression -> TsNonNullExpressionImpl
 */
fun Argument.tsNonNullExpression(block: TsNonNullExpression.() -> Unit): TsNonNullExpression {
    return TsNonNullExpressionImpl().apply(block)
}

/**
 * Argument#expression: Expression
 * extension function for create Expression -> TsAsExpressionImpl
 */
fun Argument.tsAsExpression(block: TsAsExpression.() -> Unit): TsAsExpression {
    return TsAsExpressionImpl().apply(block)
}

/**
 * Argument#expression: Expression
 * extension function for create Expression -> TsSatisfiesExpressionImpl
 */
fun Argument.tsSatisfiesExpression(block: TsSatisfiesExpression.() -> Unit): TsSatisfiesExpression {
    return TsSatisfiesExpressionImpl().apply(block)
}

/**
 * Argument#expression: Expression
 * extension function for create Expression -> TsInstantiationImpl
 */
fun Argument.tsInstantiation(block: TsInstantiation.() -> Unit): TsInstantiation {
    return TsInstantiationImpl().apply(block)
}

/**
 * Argument#expression: Expression
 * extension function for create Expression -> PrivateNameImpl
 */
fun Argument.privateName(block: PrivateName.() -> Unit): PrivateName {
    return PrivateNameImpl().apply(block)
}

/**
 * Argument#expression: Expression
 * extension function for create Expression -> OptionalChainingExpressionImpl
 */
fun Argument.optionalChainingExpression(block: OptionalChainingExpression.() -> Unit): OptionalChainingExpression {
    return OptionalChainingExpressionImpl().apply(block)
}

/**
 * Argument#expression: Expression
 * extension function for create Expression -> InvalidImpl
 */
fun Argument.invalid(block: Invalid.() -> Unit): Invalid {
    return InvalidImpl().apply(block)
}
