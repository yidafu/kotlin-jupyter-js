package dev.yidafu.swc.dsl

import dev.yidafu.swc.types.*

/**
 * YieldExpression#argument: Expression
 * extension function for create Expression -> ThisExpressionImpl
 */
fun YieldExpression.thisExpression(block: ThisExpression.() -> Unit): ThisExpression {
    return ThisExpressionImpl().apply(block)
}

/**
 * YieldExpression#argument: Expression
 * extension function for create Expression -> ArrayExpressionImpl
 */
fun YieldExpression.arrayExpression(block: ArrayExpression.() -> Unit): ArrayExpression {
    return ArrayExpressionImpl().apply(block)
}

/**
 * YieldExpression#argument: Expression
 * extension function for create Expression -> ObjectExpressionImpl
 */
fun YieldExpression.objectExpression(block: ObjectExpression.() -> Unit): ObjectExpression {
    return ObjectExpressionImpl().apply(block)
}

/**
 * YieldExpression#argument: Expression
 * extension function for create Expression -> FunctionExpressionImpl
 */
fun YieldExpression.functionExpression(block: FunctionExpression.() -> Unit): FunctionExpression {
    return FunctionExpressionImpl().apply(block)
}

/**
 * YieldExpression#argument: Expression
 * extension function for create Expression -> UnaryExpressionImpl
 */
fun YieldExpression.unaryExpression(block: UnaryExpression.() -> Unit): UnaryExpression {
    return UnaryExpressionImpl().apply(block)
}

/**
 * YieldExpression#argument: Expression
 * extension function for create Expression -> UpdateExpressionImpl
 */
fun YieldExpression.updateExpression(block: UpdateExpression.() -> Unit): UpdateExpression {
    return UpdateExpressionImpl().apply(block)
}

/**
 * YieldExpression#argument: Expression
 * extension function for create Expression -> BinaryExpressionImpl
 */
fun YieldExpression.binaryExpression(block: BinaryExpression.() -> Unit): BinaryExpression {
    return BinaryExpressionImpl().apply(block)
}

/**
 * YieldExpression#argument: Expression
 * extension function for create Expression -> AssignmentExpressionImpl
 */
fun YieldExpression.assignmentExpression(block: AssignmentExpression.() -> Unit): AssignmentExpression {
    return AssignmentExpressionImpl().apply(block)
}

/**
 * YieldExpression#argument: Expression
 * extension function for create Expression -> MemberExpressionImpl
 */
fun YieldExpression.memberExpression(block: MemberExpression.() -> Unit): MemberExpression {
    return MemberExpressionImpl().apply(block)
}

/**
 * YieldExpression#argument: Expression
 * extension function for create Expression -> SuperPropExpressionImpl
 */
fun YieldExpression.superPropExpression(block: SuperPropExpression.() -> Unit): SuperPropExpression {
    return SuperPropExpressionImpl().apply(block)
}

/**
 * YieldExpression#argument: Expression
 * extension function for create Expression -> ConditionalExpressionImpl
 */
fun YieldExpression.conditionalExpression(block: ConditionalExpression.() -> Unit): ConditionalExpression {
    return ConditionalExpressionImpl().apply(block)
}

/**
 * YieldExpression#argument: Expression
 * extension function for create Expression -> CallExpressionImpl
 */
fun YieldExpression.callExpression(block: CallExpression.() -> Unit): CallExpression {
    return CallExpressionImpl().apply(block)
}

/**
 * YieldExpression#argument: Expression
 * extension function for create Expression -> NewExpressionImpl
 */
fun YieldExpression.newExpression(block: NewExpression.() -> Unit): NewExpression {
    return NewExpressionImpl().apply(block)
}

/**
 * YieldExpression#argument: Expression
 * extension function for create Expression -> SequenceExpressionImpl
 */
fun YieldExpression.sequenceExpression(block: SequenceExpression.() -> Unit): SequenceExpression {
    return SequenceExpressionImpl().apply(block)
}

/**
 * YieldExpression#argument: Expression
 * extension function for create Expression -> IdentifierImpl
 */
fun YieldExpression.identifier(block: Identifier.() -> Unit): Identifier {
    return IdentifierImpl().apply(block)
}

/**
 * YieldExpression#argument: Expression
 * extension function for create Expression -> StringLiteralImpl
 */
fun YieldExpression.stringLiteral(block: StringLiteral.() -> Unit): StringLiteral {
    return StringLiteralImpl().apply(block)
}

/**
 * YieldExpression#argument: Expression
 * extension function for create Expression -> BooleanLiteralImpl
 */
fun YieldExpression.booleanLiteral(block: BooleanLiteral.() -> Unit): BooleanLiteral {
    return BooleanLiteralImpl().apply(block)
}

/**
 * YieldExpression#argument: Expression
 * extension function for create Expression -> NullLiteralImpl
 */
fun YieldExpression.nullLiteral(block: NullLiteral.() -> Unit): NullLiteral {
    return NullLiteralImpl().apply(block)
}

/**
 * YieldExpression#argument: Expression
 * extension function for create Expression -> NumericLiteralImpl
 */
fun YieldExpression.numericLiteral(block: NumericLiteral.() -> Unit): NumericLiteral {
    return NumericLiteralImpl().apply(block)
}

/**
 * YieldExpression#argument: Expression
 * extension function for create Expression -> BigIntLiteralImpl
 */
fun YieldExpression.bigIntLiteral(block: BigIntLiteral.() -> Unit): BigIntLiteral {
    return BigIntLiteralImpl().apply(block)
}

/**
 * YieldExpression#argument: Expression
 * extension function for create Expression -> RegExpLiteralImpl
 */
fun YieldExpression.regExpLiteral(block: RegExpLiteral.() -> Unit): RegExpLiteral {
    return RegExpLiteralImpl().apply(block)
}

/**
 * YieldExpression#argument: Expression
 * extension function for create Expression -> JSXTextImpl
 */
fun YieldExpression.jSXText(block: JSXText.() -> Unit): JSXText {
    return JSXTextImpl().apply(block)
}

/**
 * YieldExpression#argument: Expression
 * extension function for create Expression -> TemplateLiteralImpl
 */
fun YieldExpression.templateLiteral(block: TemplateLiteral.() -> Unit): TemplateLiteral {
    return TemplateLiteralImpl().apply(block)
}

/**
 * YieldExpression#argument: Expression
 * extension function for create Expression -> TaggedTemplateExpressionImpl
 */
fun YieldExpression.taggedTemplateExpression(block: TaggedTemplateExpression.() -> Unit): TaggedTemplateExpression {
    return TaggedTemplateExpressionImpl().apply(block)
}

/**
 * YieldExpression#argument: Expression
 * extension function for create Expression -> ArrowFunctionExpressionImpl
 */
fun YieldExpression.arrowFunctionExpression(block: ArrowFunctionExpression.() -> Unit): ArrowFunctionExpression {
    return ArrowFunctionExpressionImpl().apply(block)
}

/**
 * YieldExpression#argument: Expression
 * extension function for create Expression -> ClassExpressionImpl
 */
fun YieldExpression.classExpression(block: ClassExpression.() -> Unit): ClassExpression {
    return ClassExpressionImpl().apply(block)
}

/**
 * YieldExpression#argument: Expression
 * extension function for create Expression -> MetaPropertyImpl
 */
fun YieldExpression.metaProperty(block: MetaProperty.() -> Unit): MetaProperty {
    return MetaPropertyImpl().apply(block)
}

/**
 * YieldExpression#argument: Expression
 * extension function for create Expression -> AwaitExpressionImpl
 */
fun YieldExpression.awaitExpression(block: AwaitExpression.() -> Unit): AwaitExpression {
    return AwaitExpressionImpl().apply(block)
}

/**
 * YieldExpression#argument: Expression
 * extension function for create Expression -> ParenthesisExpressionImpl
 */
fun YieldExpression.parenthesisExpression(block: ParenthesisExpression.() -> Unit): ParenthesisExpression {
    return ParenthesisExpressionImpl().apply(block)
}

/**
 * YieldExpression#argument: Expression
 * extension function for create Expression -> JSXMemberExpressionImpl
 */
fun YieldExpression.jSXMemberExpression(block: JSXMemberExpression.() -> Unit): JSXMemberExpression {
    return JSXMemberExpressionImpl().apply(block)
}

/**
 * YieldExpression#argument: Expression
 * extension function for create Expression -> JSXNamespacedNameImpl
 */
fun YieldExpression.jSXNamespacedName(block: JSXNamespacedName.() -> Unit): JSXNamespacedName {
    return JSXNamespacedNameImpl().apply(block)
}

/**
 * YieldExpression#argument: Expression
 * extension function for create Expression -> JSXEmptyExpressionImpl
 */
fun YieldExpression.jSXEmptyExpression(block: JSXEmptyExpression.() -> Unit): JSXEmptyExpression {
    return JSXEmptyExpressionImpl().apply(block)
}

/**
 * YieldExpression#argument: Expression
 * extension function for create Expression -> JSXElementImpl
 */
fun YieldExpression.jSXElement(block: JSXElement.() -> Unit): JSXElement {
    return JSXElementImpl().apply(block)
}

/**
 * YieldExpression#argument: Expression
 * extension function for create Expression -> JSXFragmentImpl
 */
fun YieldExpression.jSXFragment(block: JSXFragment.() -> Unit): JSXFragment {
    return JSXFragmentImpl().apply(block)
}

/**
 * YieldExpression#argument: Expression
 * extension function for create Expression -> TsTypeAssertionImpl
 */
fun YieldExpression.tsTypeAssertion(block: TsTypeAssertion.() -> Unit): TsTypeAssertion {
    return TsTypeAssertionImpl().apply(block)
}

/**
 * YieldExpression#argument: Expression
 * extension function for create Expression -> TsConstAssertionImpl
 */
fun YieldExpression.tsConstAssertion(block: TsConstAssertion.() -> Unit): TsConstAssertion {
    return TsConstAssertionImpl().apply(block)
}

/**
 * YieldExpression#argument: Expression
 * extension function for create Expression -> TsNonNullExpressionImpl
 */
fun YieldExpression.tsNonNullExpression(block: TsNonNullExpression.() -> Unit): TsNonNullExpression {
    return TsNonNullExpressionImpl().apply(block)
}

/**
 * YieldExpression#argument: Expression
 * extension function for create Expression -> TsAsExpressionImpl
 */
fun YieldExpression.tsAsExpression(block: TsAsExpression.() -> Unit): TsAsExpression {
    return TsAsExpressionImpl().apply(block)
}

/**
 * YieldExpression#argument: Expression
 * extension function for create Expression -> TsSatisfiesExpressionImpl
 */
fun YieldExpression.tsSatisfiesExpression(block: TsSatisfiesExpression.() -> Unit): TsSatisfiesExpression {
    return TsSatisfiesExpressionImpl().apply(block)
}

/**
 * YieldExpression#argument: Expression
 * extension function for create Expression -> TsInstantiationImpl
 */
fun YieldExpression.tsInstantiation(block: TsInstantiation.() -> Unit): TsInstantiation {
    return TsInstantiationImpl().apply(block)
}

/**
 * YieldExpression#argument: Expression
 * extension function for create Expression -> PrivateNameImpl
 */
fun YieldExpression.privateName(block: PrivateName.() -> Unit): PrivateName {
    return PrivateNameImpl().apply(block)
}

/**
 * YieldExpression#argument: Expression
 * extension function for create Expression -> OptionalChainingExpressionImpl
 */
fun YieldExpression.optionalChainingExpression(block: OptionalChainingExpression.() -> Unit): OptionalChainingExpression {
    return OptionalChainingExpressionImpl().apply(block)
}

/**
 * YieldExpression#argument: Expression
 * extension function for create Expression -> InvalidImpl
 */
fun YieldExpression.invalid(block: Invalid.() -> Unit): Invalid {
    return InvalidImpl().apply(block)
}

fun YieldExpression.span(block: Span.() -> Unit): Span {
    return Span().apply(block)
}
