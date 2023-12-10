package dev.yidafu.swc.dsl

import dev.yidafu.swc.types.*

/**
 * TaggedTemplateExpression#tag: Expression
 * extension function for create Expression -> ThisExpressionImpl
 */
fun TaggedTemplateExpression.thisExpression(block: ThisExpression.() -> Unit): ThisExpression {
    return ThisExpressionImpl().apply(block)
}

/**
 * TaggedTemplateExpression#tag: Expression
 * extension function for create Expression -> ArrayExpressionImpl
 */
fun TaggedTemplateExpression.arrayExpression(block: ArrayExpression.() -> Unit): ArrayExpression {
    return ArrayExpressionImpl().apply(block)
}

/**
 * TaggedTemplateExpression#tag: Expression
 * extension function for create Expression -> ObjectExpressionImpl
 */
fun TaggedTemplateExpression.objectExpression(block: ObjectExpression.() -> Unit): ObjectExpression {
    return ObjectExpressionImpl().apply(block)
}

/**
 * TaggedTemplateExpression#tag: Expression
 * extension function for create Expression -> FunctionExpressionImpl
 */
fun TaggedTemplateExpression.functionExpression(block: FunctionExpression.() -> Unit): FunctionExpression {
    return FunctionExpressionImpl().apply(block)
}

/**
 * TaggedTemplateExpression#tag: Expression
 * extension function for create Expression -> UnaryExpressionImpl
 */
fun TaggedTemplateExpression.unaryExpression(block: UnaryExpression.() -> Unit): UnaryExpression {
    return UnaryExpressionImpl().apply(block)
}

/**
 * TaggedTemplateExpression#tag: Expression
 * extension function for create Expression -> UpdateExpressionImpl
 */
fun TaggedTemplateExpression.updateExpression(block: UpdateExpression.() -> Unit): UpdateExpression {
    return UpdateExpressionImpl().apply(block)
}

/**
 * TaggedTemplateExpression#tag: Expression
 * extension function for create Expression -> BinaryExpressionImpl
 */
fun TaggedTemplateExpression.binaryExpression(block: BinaryExpression.() -> Unit): BinaryExpression {
    return BinaryExpressionImpl().apply(block)
}

/**
 * TaggedTemplateExpression#tag: Expression
 * extension function for create Expression -> AssignmentExpressionImpl
 */
fun TaggedTemplateExpression.assignmentExpression(block: AssignmentExpression.() -> Unit): AssignmentExpression {
    return AssignmentExpressionImpl().apply(block)
}

/**
 * TaggedTemplateExpression#tag: Expression
 * extension function for create Expression -> MemberExpressionImpl
 */
fun TaggedTemplateExpression.memberExpression(block: MemberExpression.() -> Unit): MemberExpression {
    return MemberExpressionImpl().apply(block)
}

/**
 * TaggedTemplateExpression#tag: Expression
 * extension function for create Expression -> SuperPropExpressionImpl
 */
fun TaggedTemplateExpression.superPropExpression(block: SuperPropExpression.() -> Unit): SuperPropExpression {
    return SuperPropExpressionImpl().apply(block)
}

/**
 * TaggedTemplateExpression#tag: Expression
 * extension function for create Expression -> ConditionalExpressionImpl
 */
fun TaggedTemplateExpression.conditionalExpression(block: ConditionalExpression.() -> Unit): ConditionalExpression {
    return ConditionalExpressionImpl().apply(block)
}

/**
 * TaggedTemplateExpression#tag: Expression
 * extension function for create Expression -> CallExpressionImpl
 */
fun TaggedTemplateExpression.callExpression(block: CallExpression.() -> Unit): CallExpression {
    return CallExpressionImpl().apply(block)
}

/**
 * TaggedTemplateExpression#tag: Expression
 * extension function for create Expression -> NewExpressionImpl
 */
fun TaggedTemplateExpression.newExpression(block: NewExpression.() -> Unit): NewExpression {
    return NewExpressionImpl().apply(block)
}

/**
 * TaggedTemplateExpression#tag: Expression
 * extension function for create Expression -> SequenceExpressionImpl
 */
fun TaggedTemplateExpression.sequenceExpression(block: SequenceExpression.() -> Unit): SequenceExpression {
    return SequenceExpressionImpl().apply(block)
}

/**
 * TaggedTemplateExpression#tag: Expression
 * extension function for create Expression -> IdentifierImpl
 */
fun TaggedTemplateExpression.identifier(block: Identifier.() -> Unit): Identifier {
    return IdentifierImpl().apply(block)
}

/**
 * TaggedTemplateExpression#tag: Expression
 * extension function for create Expression -> StringLiteralImpl
 */
fun TaggedTemplateExpression.stringLiteral(block: StringLiteral.() -> Unit): StringLiteral {
    return StringLiteralImpl().apply(block)
}

/**
 * TaggedTemplateExpression#tag: Expression
 * extension function for create Expression -> BooleanLiteralImpl
 */
fun TaggedTemplateExpression.booleanLiteral(block: BooleanLiteral.() -> Unit): BooleanLiteral {
    return BooleanLiteralImpl().apply(block)
}

/**
 * TaggedTemplateExpression#tag: Expression
 * extension function for create Expression -> NullLiteralImpl
 */
fun TaggedTemplateExpression.nullLiteral(block: NullLiteral.() -> Unit): NullLiteral {
    return NullLiteralImpl().apply(block)
}

/**
 * TaggedTemplateExpression#tag: Expression
 * extension function for create Expression -> NumericLiteralImpl
 */
fun TaggedTemplateExpression.numericLiteral(block: NumericLiteral.() -> Unit): NumericLiteral {
    return NumericLiteralImpl().apply(block)
}

/**
 * TaggedTemplateExpression#tag: Expression
 * extension function for create Expression -> BigIntLiteralImpl
 */
fun TaggedTemplateExpression.bigIntLiteral(block: BigIntLiteral.() -> Unit): BigIntLiteral {
    return BigIntLiteralImpl().apply(block)
}

/**
 * TaggedTemplateExpression#tag: Expression
 * extension function for create Expression -> RegExpLiteralImpl
 */
fun TaggedTemplateExpression.regExpLiteral(block: RegExpLiteral.() -> Unit): RegExpLiteral {
    return RegExpLiteralImpl().apply(block)
}

/**
 * TaggedTemplateExpression#tag: Expression
 * extension function for create Expression -> JSXTextImpl
 */
fun TaggedTemplateExpression.jSXText(block: JSXText.() -> Unit): JSXText {
    return JSXTextImpl().apply(block)
}

/**
 * TaggedTemplateExpression#template: TemplateLiteral
 * extension function for create TemplateLiteral -> TemplateLiteralImpl
 */
fun TaggedTemplateExpression.templateLiteral(block: TemplateLiteral.() -> Unit): TemplateLiteral {
    return TemplateLiteralImpl().apply(block)
}

/**
 * TaggedTemplateExpression#tag: Expression
 * extension function for create Expression -> ArrowFunctionExpressionImpl
 */
fun TaggedTemplateExpression.arrowFunctionExpression(block: ArrowFunctionExpression.() -> Unit): ArrowFunctionExpression {
    return ArrowFunctionExpressionImpl().apply(block)
}

/**
 * TaggedTemplateExpression#tag: Expression
 * extension function for create Expression -> ClassExpressionImpl
 */
fun TaggedTemplateExpression.classExpression(block: ClassExpression.() -> Unit): ClassExpression {
    return ClassExpressionImpl().apply(block)
}

/**
 * TaggedTemplateExpression#tag: Expression
 * extension function for create Expression -> YieldExpressionImpl
 */
fun TaggedTemplateExpression.yieldExpression(block: YieldExpression.() -> Unit): YieldExpression {
    return YieldExpressionImpl().apply(block)
}

/**
 * TaggedTemplateExpression#tag: Expression
 * extension function for create Expression -> MetaPropertyImpl
 */
fun TaggedTemplateExpression.metaProperty(block: MetaProperty.() -> Unit): MetaProperty {
    return MetaPropertyImpl().apply(block)
}

/**
 * TaggedTemplateExpression#tag: Expression
 * extension function for create Expression -> AwaitExpressionImpl
 */
fun TaggedTemplateExpression.awaitExpression(block: AwaitExpression.() -> Unit): AwaitExpression {
    return AwaitExpressionImpl().apply(block)
}

/**
 * TaggedTemplateExpression#tag: Expression
 * extension function for create Expression -> ParenthesisExpressionImpl
 */
fun TaggedTemplateExpression.parenthesisExpression(block: ParenthesisExpression.() -> Unit): ParenthesisExpression {
    return ParenthesisExpressionImpl().apply(block)
}

/**
 * TaggedTemplateExpression#tag: Expression
 * extension function for create Expression -> JSXMemberExpressionImpl
 */
fun TaggedTemplateExpression.jSXMemberExpression(block: JSXMemberExpression.() -> Unit): JSXMemberExpression {
    return JSXMemberExpressionImpl().apply(block)
}

/**
 * TaggedTemplateExpression#tag: Expression
 * extension function for create Expression -> JSXNamespacedNameImpl
 */
fun TaggedTemplateExpression.jSXNamespacedName(block: JSXNamespacedName.() -> Unit): JSXNamespacedName {
    return JSXNamespacedNameImpl().apply(block)
}

/**
 * TaggedTemplateExpression#tag: Expression
 * extension function for create Expression -> JSXEmptyExpressionImpl
 */
fun TaggedTemplateExpression.jSXEmptyExpression(block: JSXEmptyExpression.() -> Unit): JSXEmptyExpression {
    return JSXEmptyExpressionImpl().apply(block)
}

/**
 * TaggedTemplateExpression#tag: Expression
 * extension function for create Expression -> JSXElementImpl
 */
fun TaggedTemplateExpression.jSXElement(block: JSXElement.() -> Unit): JSXElement {
    return JSXElementImpl().apply(block)
}

/**
 * TaggedTemplateExpression#tag: Expression
 * extension function for create Expression -> JSXFragmentImpl
 */
fun TaggedTemplateExpression.jSXFragment(block: JSXFragment.() -> Unit): JSXFragment {
    return JSXFragmentImpl().apply(block)
}

/**
 * TaggedTemplateExpression#tag: Expression
 * extension function for create Expression -> TsTypeAssertionImpl
 */
fun TaggedTemplateExpression.tsTypeAssertion(block: TsTypeAssertion.() -> Unit): TsTypeAssertion {
    return TsTypeAssertionImpl().apply(block)
}

/**
 * TaggedTemplateExpression#tag: Expression
 * extension function for create Expression -> TsConstAssertionImpl
 */
fun TaggedTemplateExpression.tsConstAssertion(block: TsConstAssertion.() -> Unit): TsConstAssertion {
    return TsConstAssertionImpl().apply(block)
}

/**
 * TaggedTemplateExpression#tag: Expression
 * extension function for create Expression -> TsNonNullExpressionImpl
 */
fun TaggedTemplateExpression.tsNonNullExpression(block: TsNonNullExpression.() -> Unit): TsNonNullExpression {
    return TsNonNullExpressionImpl().apply(block)
}

/**
 * TaggedTemplateExpression#tag: Expression
 * extension function for create Expression -> TsAsExpressionImpl
 */
fun TaggedTemplateExpression.tsAsExpression(block: TsAsExpression.() -> Unit): TsAsExpression {
    return TsAsExpressionImpl().apply(block)
}

/**
 * TaggedTemplateExpression#tag: Expression
 * extension function for create Expression -> TsSatisfiesExpressionImpl
 */
fun TaggedTemplateExpression.tsSatisfiesExpression(block: TsSatisfiesExpression.() -> Unit): TsSatisfiesExpression {
    return TsSatisfiesExpressionImpl().apply(block)
}

/**
 * TaggedTemplateExpression#tag: Expression
 * extension function for create Expression -> TsInstantiationImpl
 */
fun TaggedTemplateExpression.tsInstantiation(block: TsInstantiation.() -> Unit): TsInstantiation {
    return TsInstantiationImpl().apply(block)
}

/**
 * TaggedTemplateExpression#tag: Expression
 * extension function for create Expression -> PrivateNameImpl
 */
fun TaggedTemplateExpression.privateName(block: PrivateName.() -> Unit): PrivateName {
    return PrivateNameImpl().apply(block)
}

/**
 * TaggedTemplateExpression#tag: Expression
 * extension function for create Expression -> OptionalChainingExpressionImpl
 */
fun TaggedTemplateExpression.optionalChainingExpression(block: OptionalChainingExpression.() -> Unit): OptionalChainingExpression {
    return OptionalChainingExpressionImpl().apply(block)
}

/**
 * TaggedTemplateExpression#tag: Expression
 * extension function for create Expression -> InvalidImpl
 */
fun TaggedTemplateExpression.invalid(block: Invalid.() -> Unit): Invalid {
    return InvalidImpl().apply(block)
}

/**
 * TaggedTemplateExpression#typeParameters: TsTypeParameterInstantiation
 * extension function for create TsTypeParameterInstantiation -> TsTypeParameterInstantiationImpl
 */
fun TaggedTemplateExpression.tsTypeParameterInstantiation(block: TsTypeParameterInstantiation.() -> Unit): TsTypeParameterInstantiation {
    return TsTypeParameterInstantiationImpl().apply(block)
}

fun TaggedTemplateExpression.span(block: Span.() -> Unit): Span {
    return Span().apply(block)
}
