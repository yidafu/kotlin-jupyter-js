package dev.yidafu.swc.dsl

import dev.yidafu.swc.types.*

/**
 * BinaryExpression#right: Expression
 * extension function for create Expression -> ThisExpressionImpl
 */
fun BinaryExpression.thisExpression(block: ThisExpression.() -> Unit): ThisExpression {
    return ThisExpressionImpl().apply(block)
}

/**
 * BinaryExpression#right: Expression
 * extension function for create Expression -> ArrayExpressionImpl
 */
fun BinaryExpression.arrayExpression(block: ArrayExpression.() -> Unit): ArrayExpression {
    return ArrayExpressionImpl().apply(block)
}

/**
 * BinaryExpression#right: Expression
 * extension function for create Expression -> ObjectExpressionImpl
 */
fun BinaryExpression.objectExpression(block: ObjectExpression.() -> Unit): ObjectExpression {
    return ObjectExpressionImpl().apply(block)
}

/**
 * BinaryExpression#right: Expression
 * extension function for create Expression -> FunctionExpressionImpl
 */
fun BinaryExpression.functionExpression(block: FunctionExpression.() -> Unit): FunctionExpression {
    return FunctionExpressionImpl().apply(block)
}

/**
 * BinaryExpression#right: Expression
 * extension function for create Expression -> UnaryExpressionImpl
 */
fun BinaryExpression.unaryExpression(block: UnaryExpression.() -> Unit): UnaryExpression {
    return UnaryExpressionImpl().apply(block)
}

/**
 * BinaryExpression#right: Expression
 * extension function for create Expression -> UpdateExpressionImpl
 */
fun BinaryExpression.updateExpression(block: UpdateExpression.() -> Unit): UpdateExpression {
    return UpdateExpressionImpl().apply(block)
}

/**
 * BinaryExpression#right: Expression
 * extension function for create Expression -> AssignmentExpressionImpl
 */
fun BinaryExpression.assignmentExpression(block: AssignmentExpression.() -> Unit): AssignmentExpression {
    return AssignmentExpressionImpl().apply(block)
}

/**
 * BinaryExpression#right: Expression
 * extension function for create Expression -> MemberExpressionImpl
 */
fun BinaryExpression.memberExpression(block: MemberExpression.() -> Unit): MemberExpression {
    return MemberExpressionImpl().apply(block)
}

/**
 * BinaryExpression#right: Expression
 * extension function for create Expression -> SuperPropExpressionImpl
 */
fun BinaryExpression.superPropExpression(block: SuperPropExpression.() -> Unit): SuperPropExpression {
    return SuperPropExpressionImpl().apply(block)
}

/**
 * BinaryExpression#right: Expression
 * extension function for create Expression -> ConditionalExpressionImpl
 */
fun BinaryExpression.conditionalExpression(block: ConditionalExpression.() -> Unit): ConditionalExpression {
    return ConditionalExpressionImpl().apply(block)
}

/**
 * BinaryExpression#right: Expression
 * extension function for create Expression -> CallExpressionImpl
 */
fun BinaryExpression.callExpression(block: CallExpression.() -> Unit): CallExpression {
    return CallExpressionImpl().apply(block)
}

/**
 * BinaryExpression#right: Expression
 * extension function for create Expression -> NewExpressionImpl
 */
fun BinaryExpression.newExpression(block: NewExpression.() -> Unit): NewExpression {
    return NewExpressionImpl().apply(block)
}

/**
 * BinaryExpression#right: Expression
 * extension function for create Expression -> SequenceExpressionImpl
 */
fun BinaryExpression.sequenceExpression(block: SequenceExpression.() -> Unit): SequenceExpression {
    return SequenceExpressionImpl().apply(block)
}

/**
 * BinaryExpression#right: Expression
 * extension function for create Expression -> IdentifierImpl
 */
fun BinaryExpression.identifier(block: Identifier.() -> Unit): Identifier {
    return IdentifierImpl().apply(block)
}

/**
 * BinaryExpression#right: Expression
 * extension function for create Expression -> StringLiteralImpl
 */
fun BinaryExpression.stringLiteral(block: StringLiteral.() -> Unit): StringLiteral {
    return StringLiteralImpl().apply(block)
}

/**
 * BinaryExpression#right: Expression
 * extension function for create Expression -> BooleanLiteralImpl
 */
fun BinaryExpression.booleanLiteral(block: BooleanLiteral.() -> Unit): BooleanLiteral {
    return BooleanLiteralImpl().apply(block)
}

/**
 * BinaryExpression#right: Expression
 * extension function for create Expression -> NullLiteralImpl
 */
fun BinaryExpression.nullLiteral(block: NullLiteral.() -> Unit): NullLiteral {
    return NullLiteralImpl().apply(block)
}

/**
 * BinaryExpression#right: Expression
 * extension function for create Expression -> NumericLiteralImpl
 */
fun BinaryExpression.numericLiteral(block: NumericLiteral.() -> Unit): NumericLiteral {
    return NumericLiteralImpl().apply(block)
}

/**
 * BinaryExpression#right: Expression
 * extension function for create Expression -> BigIntLiteralImpl
 */
fun BinaryExpression.bigIntLiteral(block: BigIntLiteral.() -> Unit): BigIntLiteral {
    return BigIntLiteralImpl().apply(block)
}

/**
 * BinaryExpression#right: Expression
 * extension function for create Expression -> RegExpLiteralImpl
 */
fun BinaryExpression.regExpLiteral(block: RegExpLiteral.() -> Unit): RegExpLiteral {
    return RegExpLiteralImpl().apply(block)
}

/**
 * BinaryExpression#right: Expression
 * extension function for create Expression -> JSXTextImpl
 */
fun BinaryExpression.jSXText(block: JSXText.() -> Unit): JSXText {
    return JSXTextImpl().apply(block)
}

/**
 * BinaryExpression#right: Expression
 * extension function for create Expression -> TemplateLiteralImpl
 */
fun BinaryExpression.templateLiteral(block: TemplateLiteral.() -> Unit): TemplateLiteral {
    return TemplateLiteralImpl().apply(block)
}

/**
 * BinaryExpression#right: Expression
 * extension function for create Expression -> TaggedTemplateExpressionImpl
 */
fun BinaryExpression.taggedTemplateExpression(block: TaggedTemplateExpression.() -> Unit): TaggedTemplateExpression {
    return TaggedTemplateExpressionImpl().apply(block)
}

/**
 * BinaryExpression#right: Expression
 * extension function for create Expression -> ArrowFunctionExpressionImpl
 */
fun BinaryExpression.arrowFunctionExpression(block: ArrowFunctionExpression.() -> Unit): ArrowFunctionExpression {
    return ArrowFunctionExpressionImpl().apply(block)
}

/**
 * BinaryExpression#right: Expression
 * extension function for create Expression -> ClassExpressionImpl
 */
fun BinaryExpression.classExpression(block: ClassExpression.() -> Unit): ClassExpression {
    return ClassExpressionImpl().apply(block)
}

/**
 * BinaryExpression#right: Expression
 * extension function for create Expression -> YieldExpressionImpl
 */
fun BinaryExpression.yieldExpression(block: YieldExpression.() -> Unit): YieldExpression {
    return YieldExpressionImpl().apply(block)
}

/**
 * BinaryExpression#right: Expression
 * extension function for create Expression -> MetaPropertyImpl
 */
fun BinaryExpression.metaProperty(block: MetaProperty.() -> Unit): MetaProperty {
    return MetaPropertyImpl().apply(block)
}

/**
 * BinaryExpression#right: Expression
 * extension function for create Expression -> AwaitExpressionImpl
 */
fun BinaryExpression.awaitExpression(block: AwaitExpression.() -> Unit): AwaitExpression {
    return AwaitExpressionImpl().apply(block)
}

/**
 * BinaryExpression#right: Expression
 * extension function for create Expression -> ParenthesisExpressionImpl
 */
fun BinaryExpression.parenthesisExpression(block: ParenthesisExpression.() -> Unit): ParenthesisExpression {
    return ParenthesisExpressionImpl().apply(block)
}

/**
 * BinaryExpression#right: Expression
 * extension function for create Expression -> JSXMemberExpressionImpl
 */
fun BinaryExpression.jSXMemberExpression(block: JSXMemberExpression.() -> Unit): JSXMemberExpression {
    return JSXMemberExpressionImpl().apply(block)
}

/**
 * BinaryExpression#right: Expression
 * extension function for create Expression -> JSXNamespacedNameImpl
 */
fun BinaryExpression.jSXNamespacedName(block: JSXNamespacedName.() -> Unit): JSXNamespacedName {
    return JSXNamespacedNameImpl().apply(block)
}

/**
 * BinaryExpression#right: Expression
 * extension function for create Expression -> JSXEmptyExpressionImpl
 */
fun BinaryExpression.jSXEmptyExpression(block: JSXEmptyExpression.() -> Unit): JSXEmptyExpression {
    return JSXEmptyExpressionImpl().apply(block)
}

/**
 * BinaryExpression#right: Expression
 * extension function for create Expression -> JSXElementImpl
 */
fun BinaryExpression.jSXElement(block: JSXElement.() -> Unit): JSXElement {
    return JSXElementImpl().apply(block)
}

/**
 * BinaryExpression#right: Expression
 * extension function for create Expression -> JSXFragmentImpl
 */
fun BinaryExpression.jSXFragment(block: JSXFragment.() -> Unit): JSXFragment {
    return JSXFragmentImpl().apply(block)
}

/**
 * BinaryExpression#right: Expression
 * extension function for create Expression -> TsTypeAssertionImpl
 */
fun BinaryExpression.tsTypeAssertion(block: TsTypeAssertion.() -> Unit): TsTypeAssertion {
    return TsTypeAssertionImpl().apply(block)
}

/**
 * BinaryExpression#right: Expression
 * extension function for create Expression -> TsConstAssertionImpl
 */
fun BinaryExpression.tsConstAssertion(block: TsConstAssertion.() -> Unit): TsConstAssertion {
    return TsConstAssertionImpl().apply(block)
}

/**
 * BinaryExpression#right: Expression
 * extension function for create Expression -> TsNonNullExpressionImpl
 */
fun BinaryExpression.tsNonNullExpression(block: TsNonNullExpression.() -> Unit): TsNonNullExpression {
    return TsNonNullExpressionImpl().apply(block)
}

/**
 * BinaryExpression#right: Expression
 * extension function for create Expression -> TsAsExpressionImpl
 */
fun BinaryExpression.tsAsExpression(block: TsAsExpression.() -> Unit): TsAsExpression {
    return TsAsExpressionImpl().apply(block)
}

/**
 * BinaryExpression#right: Expression
 * extension function for create Expression -> TsSatisfiesExpressionImpl
 */
fun BinaryExpression.tsSatisfiesExpression(block: TsSatisfiesExpression.() -> Unit): TsSatisfiesExpression {
    return TsSatisfiesExpressionImpl().apply(block)
}

/**
 * BinaryExpression#right: Expression
 * extension function for create Expression -> TsInstantiationImpl
 */
fun BinaryExpression.tsInstantiation(block: TsInstantiation.() -> Unit): TsInstantiation {
    return TsInstantiationImpl().apply(block)
}

/**
 * BinaryExpression#right: Expression
 * extension function for create Expression -> PrivateNameImpl
 */
fun BinaryExpression.privateName(block: PrivateName.() -> Unit): PrivateName {
    return PrivateNameImpl().apply(block)
}

/**
 * BinaryExpression#right: Expression
 * extension function for create Expression -> OptionalChainingExpressionImpl
 */
fun BinaryExpression.optionalChainingExpression(block: OptionalChainingExpression.() -> Unit): OptionalChainingExpression {
    return OptionalChainingExpressionImpl().apply(block)
}

/**
 * BinaryExpression#right: Expression
 * extension function for create Expression -> InvalidImpl
 */
fun BinaryExpression.invalid(block: Invalid.() -> Unit): Invalid {
    return InvalidImpl().apply(block)
}

fun BinaryExpression.span(block: Span.() -> Unit): Span {
    return Span().apply(block)
}
