package dev.yidafu.swc.dsl

import dev.yidafu.swc.types.*

/**
 * UnaryExpression#argument: Expression
 * extension function for create Expression -> ThisExpressionImpl
 */
fun UnaryExpression.thisExpression(block: ThisExpression.() -> Unit): ThisExpression {
    return ThisExpressionImpl().apply(block)
}

/**
 * UnaryExpression#argument: Expression
 * extension function for create Expression -> ArrayExpressionImpl
 */
fun UnaryExpression.arrayExpression(block: ArrayExpression.() -> Unit): ArrayExpression {
    return ArrayExpressionImpl().apply(block)
}

/**
 * UnaryExpression#argument: Expression
 * extension function for create Expression -> ObjectExpressionImpl
 */
fun UnaryExpression.objectExpression(block: ObjectExpression.() -> Unit): ObjectExpression {
    return ObjectExpressionImpl().apply(block)
}

/**
 * UnaryExpression#argument: Expression
 * extension function for create Expression -> FunctionExpressionImpl
 */
fun UnaryExpression.functionExpression(block: FunctionExpression.() -> Unit): FunctionExpression {
    return FunctionExpressionImpl().apply(block)
}

/**
 * UnaryExpression#argument: Expression
 * extension function for create Expression -> UpdateExpressionImpl
 */
fun UnaryExpression.updateExpression(block: UpdateExpression.() -> Unit): UpdateExpression {
    return UpdateExpressionImpl().apply(block)
}

/**
 * UnaryExpression#argument: Expression
 * extension function for create Expression -> BinaryExpressionImpl
 */
fun UnaryExpression.binaryExpression(block: BinaryExpression.() -> Unit): BinaryExpression {
    return BinaryExpressionImpl().apply(block)
}

/**
 * UnaryExpression#argument: Expression
 * extension function for create Expression -> AssignmentExpressionImpl
 */
fun UnaryExpression.assignmentExpression(block: AssignmentExpression.() -> Unit): AssignmentExpression {
    return AssignmentExpressionImpl().apply(block)
}

/**
 * UnaryExpression#argument: Expression
 * extension function for create Expression -> MemberExpressionImpl
 */
fun UnaryExpression.memberExpression(block: MemberExpression.() -> Unit): MemberExpression {
    return MemberExpressionImpl().apply(block)
}

/**
 * UnaryExpression#argument: Expression
 * extension function for create Expression -> SuperPropExpressionImpl
 */
fun UnaryExpression.superPropExpression(block: SuperPropExpression.() -> Unit): SuperPropExpression {
    return SuperPropExpressionImpl().apply(block)
}

/**
 * UnaryExpression#argument: Expression
 * extension function for create Expression -> ConditionalExpressionImpl
 */
fun UnaryExpression.conditionalExpression(block: ConditionalExpression.() -> Unit): ConditionalExpression {
    return ConditionalExpressionImpl().apply(block)
}

/**
 * UnaryExpression#argument: Expression
 * extension function for create Expression -> CallExpressionImpl
 */
fun UnaryExpression.callExpression(block: CallExpression.() -> Unit): CallExpression {
    return CallExpressionImpl().apply(block)
}

/**
 * UnaryExpression#argument: Expression
 * extension function for create Expression -> NewExpressionImpl
 */
fun UnaryExpression.newExpression(block: NewExpression.() -> Unit): NewExpression {
    return NewExpressionImpl().apply(block)
}

/**
 * UnaryExpression#argument: Expression
 * extension function for create Expression -> SequenceExpressionImpl
 */
fun UnaryExpression.sequenceExpression(block: SequenceExpression.() -> Unit): SequenceExpression {
    return SequenceExpressionImpl().apply(block)
}

/**
 * UnaryExpression#argument: Expression
 * extension function for create Expression -> IdentifierImpl
 */
fun UnaryExpression.identifier(block: Identifier.() -> Unit): Identifier {
    return IdentifierImpl().apply(block)
}

/**
 * UnaryExpression#argument: Expression
 * extension function for create Expression -> StringLiteralImpl
 */
fun UnaryExpression.stringLiteral(block: StringLiteral.() -> Unit): StringLiteral {
    return StringLiteralImpl().apply(block)
}

/**
 * UnaryExpression#argument: Expression
 * extension function for create Expression -> BooleanLiteralImpl
 */
fun UnaryExpression.booleanLiteral(block: BooleanLiteral.() -> Unit): BooleanLiteral {
    return BooleanLiteralImpl().apply(block)
}

/**
 * UnaryExpression#argument: Expression
 * extension function for create Expression -> NullLiteralImpl
 */
fun UnaryExpression.nullLiteral(block: NullLiteral.() -> Unit): NullLiteral {
    return NullLiteralImpl().apply(block)
}

/**
 * UnaryExpression#argument: Expression
 * extension function for create Expression -> NumericLiteralImpl
 */
fun UnaryExpression.numericLiteral(block: NumericLiteral.() -> Unit): NumericLiteral {
    return NumericLiteralImpl().apply(block)
}

/**
 * UnaryExpression#argument: Expression
 * extension function for create Expression -> BigIntLiteralImpl
 */
fun UnaryExpression.bigIntLiteral(block: BigIntLiteral.() -> Unit): BigIntLiteral {
    return BigIntLiteralImpl().apply(block)
}

/**
 * UnaryExpression#argument: Expression
 * extension function for create Expression -> RegExpLiteralImpl
 */
fun UnaryExpression.regExpLiteral(block: RegExpLiteral.() -> Unit): RegExpLiteral {
    return RegExpLiteralImpl().apply(block)
}

/**
 * UnaryExpression#argument: Expression
 * extension function for create Expression -> JSXTextImpl
 */
fun UnaryExpression.jSXText(block: JSXText.() -> Unit): JSXText {
    return JSXTextImpl().apply(block)
}

/**
 * UnaryExpression#argument: Expression
 * extension function for create Expression -> TemplateLiteralImpl
 */
fun UnaryExpression.templateLiteral(block: TemplateLiteral.() -> Unit): TemplateLiteral {
    return TemplateLiteralImpl().apply(block)
}

/**
 * UnaryExpression#argument: Expression
 * extension function for create Expression -> TaggedTemplateExpressionImpl
 */
fun UnaryExpression.taggedTemplateExpression(block: TaggedTemplateExpression.() -> Unit): TaggedTemplateExpression {
    return TaggedTemplateExpressionImpl().apply(block)
}

/**
 * UnaryExpression#argument: Expression
 * extension function for create Expression -> ArrowFunctionExpressionImpl
 */
fun UnaryExpression.arrowFunctionExpression(block: ArrowFunctionExpression.() -> Unit): ArrowFunctionExpression {
    return ArrowFunctionExpressionImpl().apply(block)
}

/**
 * UnaryExpression#argument: Expression
 * extension function for create Expression -> ClassExpressionImpl
 */
fun UnaryExpression.classExpression(block: ClassExpression.() -> Unit): ClassExpression {
    return ClassExpressionImpl().apply(block)
}

/**
 * UnaryExpression#argument: Expression
 * extension function for create Expression -> YieldExpressionImpl
 */
fun UnaryExpression.yieldExpression(block: YieldExpression.() -> Unit): YieldExpression {
    return YieldExpressionImpl().apply(block)
}

/**
 * UnaryExpression#argument: Expression
 * extension function for create Expression -> MetaPropertyImpl
 */
fun UnaryExpression.metaProperty(block: MetaProperty.() -> Unit): MetaProperty {
    return MetaPropertyImpl().apply(block)
}

/**
 * UnaryExpression#argument: Expression
 * extension function for create Expression -> AwaitExpressionImpl
 */
fun UnaryExpression.awaitExpression(block: AwaitExpression.() -> Unit): AwaitExpression {
    return AwaitExpressionImpl().apply(block)
}

/**
 * UnaryExpression#argument: Expression
 * extension function for create Expression -> ParenthesisExpressionImpl
 */
fun UnaryExpression.parenthesisExpression(block: ParenthesisExpression.() -> Unit): ParenthesisExpression {
    return ParenthesisExpressionImpl().apply(block)
}

/**
 * UnaryExpression#argument: Expression
 * extension function for create Expression -> JSXMemberExpressionImpl
 */
fun UnaryExpression.jSXMemberExpression(block: JSXMemberExpression.() -> Unit): JSXMemberExpression {
    return JSXMemberExpressionImpl().apply(block)
}

/**
 * UnaryExpression#argument: Expression
 * extension function for create Expression -> JSXNamespacedNameImpl
 */
fun UnaryExpression.jSXNamespacedName(block: JSXNamespacedName.() -> Unit): JSXNamespacedName {
    return JSXNamespacedNameImpl().apply(block)
}

/**
 * UnaryExpression#argument: Expression
 * extension function for create Expression -> JSXEmptyExpressionImpl
 */
fun UnaryExpression.jSXEmptyExpression(block: JSXEmptyExpression.() -> Unit): JSXEmptyExpression {
    return JSXEmptyExpressionImpl().apply(block)
}

/**
 * UnaryExpression#argument: Expression
 * extension function for create Expression -> JSXElementImpl
 */
fun UnaryExpression.jSXElement(block: JSXElement.() -> Unit): JSXElement {
    return JSXElementImpl().apply(block)
}

/**
 * UnaryExpression#argument: Expression
 * extension function for create Expression -> JSXFragmentImpl
 */
fun UnaryExpression.jSXFragment(block: JSXFragment.() -> Unit): JSXFragment {
    return JSXFragmentImpl().apply(block)
}

/**
 * UnaryExpression#argument: Expression
 * extension function for create Expression -> TsTypeAssertionImpl
 */
fun UnaryExpression.tsTypeAssertion(block: TsTypeAssertion.() -> Unit): TsTypeAssertion {
    return TsTypeAssertionImpl().apply(block)
}

/**
 * UnaryExpression#argument: Expression
 * extension function for create Expression -> TsConstAssertionImpl
 */
fun UnaryExpression.tsConstAssertion(block: TsConstAssertion.() -> Unit): TsConstAssertion {
    return TsConstAssertionImpl().apply(block)
}

/**
 * UnaryExpression#argument: Expression
 * extension function for create Expression -> TsNonNullExpressionImpl
 */
fun UnaryExpression.tsNonNullExpression(block: TsNonNullExpression.() -> Unit): TsNonNullExpression {
    return TsNonNullExpressionImpl().apply(block)
}

/**
 * UnaryExpression#argument: Expression
 * extension function for create Expression -> TsAsExpressionImpl
 */
fun UnaryExpression.tsAsExpression(block: TsAsExpression.() -> Unit): TsAsExpression {
    return TsAsExpressionImpl().apply(block)
}

/**
 * UnaryExpression#argument: Expression
 * extension function for create Expression -> TsSatisfiesExpressionImpl
 */
fun UnaryExpression.tsSatisfiesExpression(block: TsSatisfiesExpression.() -> Unit): TsSatisfiesExpression {
    return TsSatisfiesExpressionImpl().apply(block)
}

/**
 * UnaryExpression#argument: Expression
 * extension function for create Expression -> TsInstantiationImpl
 */
fun UnaryExpression.tsInstantiation(block: TsInstantiation.() -> Unit): TsInstantiation {
    return TsInstantiationImpl().apply(block)
}

/**
 * UnaryExpression#argument: Expression
 * extension function for create Expression -> PrivateNameImpl
 */
fun UnaryExpression.privateName(block: PrivateName.() -> Unit): PrivateName {
    return PrivateNameImpl().apply(block)
}

/**
 * UnaryExpression#argument: Expression
 * extension function for create Expression -> OptionalChainingExpressionImpl
 */
fun UnaryExpression.optionalChainingExpression(block: OptionalChainingExpression.() -> Unit): OptionalChainingExpression {
    return OptionalChainingExpressionImpl().apply(block)
}

/**
 * UnaryExpression#argument: Expression
 * extension function for create Expression -> InvalidImpl
 */
fun UnaryExpression.invalid(block: Invalid.() -> Unit): Invalid {
    return InvalidImpl().apply(block)
}

fun UnaryExpression.span(block: Span.() -> Unit): Span {
    return Span().apply(block)
}
