package dev.yidafu.swc.dsl

import dev.yidafu.swc.types.*

/**
 * AwaitExpression#argument: Expression
 * extension function for create Expression -> ThisExpressionImpl
 */
fun AwaitExpression.thisExpression(block: ThisExpression.() -> Unit): ThisExpression {
    return ThisExpressionImpl().apply(block)
}

/**
 * AwaitExpression#argument: Expression
 * extension function for create Expression -> ArrayExpressionImpl
 */
fun AwaitExpression.arrayExpression(block: ArrayExpression.() -> Unit): ArrayExpression {
    return ArrayExpressionImpl().apply(block)
}

/**
 * AwaitExpression#argument: Expression
 * extension function for create Expression -> ObjectExpressionImpl
 */
fun AwaitExpression.objectExpression(block: ObjectExpression.() -> Unit): ObjectExpression {
    return ObjectExpressionImpl().apply(block)
}

/**
 * AwaitExpression#argument: Expression
 * extension function for create Expression -> FunctionExpressionImpl
 */
fun AwaitExpression.functionExpression(block: FunctionExpression.() -> Unit): FunctionExpression {
    return FunctionExpressionImpl().apply(block)
}

/**
 * AwaitExpression#argument: Expression
 * extension function for create Expression -> UnaryExpressionImpl
 */
fun AwaitExpression.unaryExpression(block: UnaryExpression.() -> Unit): UnaryExpression {
    return UnaryExpressionImpl().apply(block)
}

/**
 * AwaitExpression#argument: Expression
 * extension function for create Expression -> UpdateExpressionImpl
 */
fun AwaitExpression.updateExpression(block: UpdateExpression.() -> Unit): UpdateExpression {
    return UpdateExpressionImpl().apply(block)
}

/**
 * AwaitExpression#argument: Expression
 * extension function for create Expression -> BinaryExpressionImpl
 */
fun AwaitExpression.binaryExpression(block: BinaryExpression.() -> Unit): BinaryExpression {
    return BinaryExpressionImpl().apply(block)
}

/**
 * AwaitExpression#argument: Expression
 * extension function for create Expression -> AssignmentExpressionImpl
 */
fun AwaitExpression.assignmentExpression(block: AssignmentExpression.() -> Unit): AssignmentExpression {
    return AssignmentExpressionImpl().apply(block)
}

/**
 * AwaitExpression#argument: Expression
 * extension function for create Expression -> MemberExpressionImpl
 */
fun AwaitExpression.memberExpression(block: MemberExpression.() -> Unit): MemberExpression {
    return MemberExpressionImpl().apply(block)
}

/**
 * AwaitExpression#argument: Expression
 * extension function for create Expression -> SuperPropExpressionImpl
 */
fun AwaitExpression.superPropExpression(block: SuperPropExpression.() -> Unit): SuperPropExpression {
    return SuperPropExpressionImpl().apply(block)
}

/**
 * AwaitExpression#argument: Expression
 * extension function for create Expression -> ConditionalExpressionImpl
 */
fun AwaitExpression.conditionalExpression(block: ConditionalExpression.() -> Unit): ConditionalExpression {
    return ConditionalExpressionImpl().apply(block)
}

/**
 * AwaitExpression#argument: Expression
 * extension function for create Expression -> CallExpressionImpl
 */
fun AwaitExpression.callExpression(block: CallExpression.() -> Unit): CallExpression {
    return CallExpressionImpl().apply(block)
}

/**
 * AwaitExpression#argument: Expression
 * extension function for create Expression -> NewExpressionImpl
 */
fun AwaitExpression.newExpression(block: NewExpression.() -> Unit): NewExpression {
    return NewExpressionImpl().apply(block)
}

/**
 * AwaitExpression#argument: Expression
 * extension function for create Expression -> SequenceExpressionImpl
 */
fun AwaitExpression.sequenceExpression(block: SequenceExpression.() -> Unit): SequenceExpression {
    return SequenceExpressionImpl().apply(block)
}

/**
 * AwaitExpression#argument: Expression
 * extension function for create Expression -> IdentifierImpl
 */
fun AwaitExpression.identifier(block: Identifier.() -> Unit): Identifier {
    return IdentifierImpl().apply(block)
}

/**
 * AwaitExpression#argument: Expression
 * extension function for create Expression -> StringLiteralImpl
 */
fun AwaitExpression.stringLiteral(block: StringLiteral.() -> Unit): StringLiteral {
    return StringLiteralImpl().apply(block)
}

/**
 * AwaitExpression#argument: Expression
 * extension function for create Expression -> BooleanLiteralImpl
 */
fun AwaitExpression.booleanLiteral(block: BooleanLiteral.() -> Unit): BooleanLiteral {
    return BooleanLiteralImpl().apply(block)
}

/**
 * AwaitExpression#argument: Expression
 * extension function for create Expression -> NullLiteralImpl
 */
fun AwaitExpression.nullLiteral(block: NullLiteral.() -> Unit): NullLiteral {
    return NullLiteralImpl().apply(block)
}

/**
 * AwaitExpression#argument: Expression
 * extension function for create Expression -> NumericLiteralImpl
 */
fun AwaitExpression.numericLiteral(block: NumericLiteral.() -> Unit): NumericLiteral {
    return NumericLiteralImpl().apply(block)
}

/**
 * AwaitExpression#argument: Expression
 * extension function for create Expression -> BigIntLiteralImpl
 */
fun AwaitExpression.bigIntLiteral(block: BigIntLiteral.() -> Unit): BigIntLiteral {
    return BigIntLiteralImpl().apply(block)
}

/**
 * AwaitExpression#argument: Expression
 * extension function for create Expression -> RegExpLiteralImpl
 */
fun AwaitExpression.regExpLiteral(block: RegExpLiteral.() -> Unit): RegExpLiteral {
    return RegExpLiteralImpl().apply(block)
}

/**
 * AwaitExpression#argument: Expression
 * extension function for create Expression -> JSXTextImpl
 */
fun AwaitExpression.jSXText(block: JSXText.() -> Unit): JSXText {
    return JSXTextImpl().apply(block)
}

/**
 * AwaitExpression#argument: Expression
 * extension function for create Expression -> TemplateLiteralImpl
 */
fun AwaitExpression.templateLiteral(block: TemplateLiteral.() -> Unit): TemplateLiteral {
    return TemplateLiteralImpl().apply(block)
}

/**
 * AwaitExpression#argument: Expression
 * extension function for create Expression -> TaggedTemplateExpressionImpl
 */
fun AwaitExpression.taggedTemplateExpression(block: TaggedTemplateExpression.() -> Unit): TaggedTemplateExpression {
    return TaggedTemplateExpressionImpl().apply(block)
}

/**
 * AwaitExpression#argument: Expression
 * extension function for create Expression -> ArrowFunctionExpressionImpl
 */
fun AwaitExpression.arrowFunctionExpression(block: ArrowFunctionExpression.() -> Unit): ArrowFunctionExpression {
    return ArrowFunctionExpressionImpl().apply(block)
}

/**
 * AwaitExpression#argument: Expression
 * extension function for create Expression -> ClassExpressionImpl
 */
fun AwaitExpression.classExpression(block: ClassExpression.() -> Unit): ClassExpression {
    return ClassExpressionImpl().apply(block)
}

/**
 * AwaitExpression#argument: Expression
 * extension function for create Expression -> YieldExpressionImpl
 */
fun AwaitExpression.yieldExpression(block: YieldExpression.() -> Unit): YieldExpression {
    return YieldExpressionImpl().apply(block)
}

/**
 * AwaitExpression#argument: Expression
 * extension function for create Expression -> MetaPropertyImpl
 */
fun AwaitExpression.metaProperty(block: MetaProperty.() -> Unit): MetaProperty {
    return MetaPropertyImpl().apply(block)
}

/**
 * AwaitExpression#argument: Expression
 * extension function for create Expression -> ParenthesisExpressionImpl
 */
fun AwaitExpression.parenthesisExpression(block: ParenthesisExpression.() -> Unit): ParenthesisExpression {
    return ParenthesisExpressionImpl().apply(block)
}

/**
 * AwaitExpression#argument: Expression
 * extension function for create Expression -> JSXMemberExpressionImpl
 */
fun AwaitExpression.jSXMemberExpression(block: JSXMemberExpression.() -> Unit): JSXMemberExpression {
    return JSXMemberExpressionImpl().apply(block)
}

/**
 * AwaitExpression#argument: Expression
 * extension function for create Expression -> JSXNamespacedNameImpl
 */
fun AwaitExpression.jSXNamespacedName(block: JSXNamespacedName.() -> Unit): JSXNamespacedName {
    return JSXNamespacedNameImpl().apply(block)
}

/**
 * AwaitExpression#argument: Expression
 * extension function for create Expression -> JSXEmptyExpressionImpl
 */
fun AwaitExpression.jSXEmptyExpression(block: JSXEmptyExpression.() -> Unit): JSXEmptyExpression {
    return JSXEmptyExpressionImpl().apply(block)
}

/**
 * AwaitExpression#argument: Expression
 * extension function for create Expression -> JSXElementImpl
 */
fun AwaitExpression.jSXElement(block: JSXElement.() -> Unit): JSXElement {
    return JSXElementImpl().apply(block)
}

/**
 * AwaitExpression#argument: Expression
 * extension function for create Expression -> JSXFragmentImpl
 */
fun AwaitExpression.jSXFragment(block: JSXFragment.() -> Unit): JSXFragment {
    return JSXFragmentImpl().apply(block)
}

/**
 * AwaitExpression#argument: Expression
 * extension function for create Expression -> TsTypeAssertionImpl
 */
fun AwaitExpression.tsTypeAssertion(block: TsTypeAssertion.() -> Unit): TsTypeAssertion {
    return TsTypeAssertionImpl().apply(block)
}

/**
 * AwaitExpression#argument: Expression
 * extension function for create Expression -> TsConstAssertionImpl
 */
fun AwaitExpression.tsConstAssertion(block: TsConstAssertion.() -> Unit): TsConstAssertion {
    return TsConstAssertionImpl().apply(block)
}

/**
 * AwaitExpression#argument: Expression
 * extension function for create Expression -> TsNonNullExpressionImpl
 */
fun AwaitExpression.tsNonNullExpression(block: TsNonNullExpression.() -> Unit): TsNonNullExpression {
    return TsNonNullExpressionImpl().apply(block)
}

/**
 * AwaitExpression#argument: Expression
 * extension function for create Expression -> TsAsExpressionImpl
 */
fun AwaitExpression.tsAsExpression(block: TsAsExpression.() -> Unit): TsAsExpression {
    return TsAsExpressionImpl().apply(block)
}

/**
 * AwaitExpression#argument: Expression
 * extension function for create Expression -> TsSatisfiesExpressionImpl
 */
fun AwaitExpression.tsSatisfiesExpression(block: TsSatisfiesExpression.() -> Unit): TsSatisfiesExpression {
    return TsSatisfiesExpressionImpl().apply(block)
}

/**
 * AwaitExpression#argument: Expression
 * extension function for create Expression -> TsInstantiationImpl
 */
fun AwaitExpression.tsInstantiation(block: TsInstantiation.() -> Unit): TsInstantiation {
    return TsInstantiationImpl().apply(block)
}

/**
 * AwaitExpression#argument: Expression
 * extension function for create Expression -> PrivateNameImpl
 */
fun AwaitExpression.privateName(block: PrivateName.() -> Unit): PrivateName {
    return PrivateNameImpl().apply(block)
}

/**
 * AwaitExpression#argument: Expression
 * extension function for create Expression -> OptionalChainingExpressionImpl
 */
fun AwaitExpression.optionalChainingExpression(block: OptionalChainingExpression.() -> Unit): OptionalChainingExpression {
    return OptionalChainingExpressionImpl().apply(block)
}

/**
 * AwaitExpression#argument: Expression
 * extension function for create Expression -> InvalidImpl
 */
fun AwaitExpression.invalid(block: Invalid.() -> Unit): Invalid {
    return InvalidImpl().apply(block)
}

fun AwaitExpression.span(block: Span.() -> Unit): Span {
    return Span().apply(block)
}
