package dev.yidafu.swc.dsl

import dev.yidafu.swc.types.*

/**
 * TsExpressionWithTypeArguments#expression: Expression
 * extension function for create Expression -> ThisExpressionImpl
 */
fun TsExpressionWithTypeArguments.thisExpression(block: ThisExpression.() -> Unit): ThisExpression {
    return ThisExpressionImpl().apply(block)
}

/**
 * TsExpressionWithTypeArguments#expression: Expression
 * extension function for create Expression -> ArrayExpressionImpl
 */
fun TsExpressionWithTypeArguments.arrayExpression(block: ArrayExpression.() -> Unit): ArrayExpression {
    return ArrayExpressionImpl().apply(block)
}

/**
 * TsExpressionWithTypeArguments#expression: Expression
 * extension function for create Expression -> ObjectExpressionImpl
 */
fun TsExpressionWithTypeArguments.objectExpression(block: ObjectExpression.() -> Unit): ObjectExpression {
    return ObjectExpressionImpl().apply(block)
}

/**
 * TsExpressionWithTypeArguments#expression: Expression
 * extension function for create Expression -> FunctionExpressionImpl
 */
fun TsExpressionWithTypeArguments.functionExpression(block: FunctionExpression.() -> Unit): FunctionExpression {
    return FunctionExpressionImpl().apply(block)
}

/**
 * TsExpressionWithTypeArguments#expression: Expression
 * extension function for create Expression -> UnaryExpressionImpl
 */
fun TsExpressionWithTypeArguments.unaryExpression(block: UnaryExpression.() -> Unit): UnaryExpression {
    return UnaryExpressionImpl().apply(block)
}

/**
 * TsExpressionWithTypeArguments#expression: Expression
 * extension function for create Expression -> UpdateExpressionImpl
 */
fun TsExpressionWithTypeArguments.updateExpression(block: UpdateExpression.() -> Unit): UpdateExpression {
    return UpdateExpressionImpl().apply(block)
}

/**
 * TsExpressionWithTypeArguments#expression: Expression
 * extension function for create Expression -> BinaryExpressionImpl
 */
fun TsExpressionWithTypeArguments.binaryExpression(block: BinaryExpression.() -> Unit): BinaryExpression {
    return BinaryExpressionImpl().apply(block)
}

/**
 * TsExpressionWithTypeArguments#expression: Expression
 * extension function for create Expression -> AssignmentExpressionImpl
 */
fun TsExpressionWithTypeArguments.assignmentExpression(block: AssignmentExpression.() -> Unit): AssignmentExpression {
    return AssignmentExpressionImpl().apply(block)
}

/**
 * TsExpressionWithTypeArguments#expression: Expression
 * extension function for create Expression -> MemberExpressionImpl
 */
fun TsExpressionWithTypeArguments.memberExpression(block: MemberExpression.() -> Unit): MemberExpression {
    return MemberExpressionImpl().apply(block)
}

/**
 * TsExpressionWithTypeArguments#expression: Expression
 * extension function for create Expression -> SuperPropExpressionImpl
 */
fun TsExpressionWithTypeArguments.superPropExpression(block: SuperPropExpression.() -> Unit): SuperPropExpression {
    return SuperPropExpressionImpl().apply(block)
}

/**
 * TsExpressionWithTypeArguments#expression: Expression
 * extension function for create Expression -> ConditionalExpressionImpl
 */
fun TsExpressionWithTypeArguments.conditionalExpression(block: ConditionalExpression.() -> Unit): ConditionalExpression {
    return ConditionalExpressionImpl().apply(block)
}

/**
 * TsExpressionWithTypeArguments#expression: Expression
 * extension function for create Expression -> CallExpressionImpl
 */
fun TsExpressionWithTypeArguments.callExpression(block: CallExpression.() -> Unit): CallExpression {
    return CallExpressionImpl().apply(block)
}

/**
 * TsExpressionWithTypeArguments#expression: Expression
 * extension function for create Expression -> NewExpressionImpl
 */
fun TsExpressionWithTypeArguments.newExpression(block: NewExpression.() -> Unit): NewExpression {
    return NewExpressionImpl().apply(block)
}

/**
 * TsExpressionWithTypeArguments#expression: Expression
 * extension function for create Expression -> SequenceExpressionImpl
 */
fun TsExpressionWithTypeArguments.sequenceExpression(block: SequenceExpression.() -> Unit): SequenceExpression {
    return SequenceExpressionImpl().apply(block)
}

/**
 * TsExpressionWithTypeArguments#expression: Expression
 * extension function for create Expression -> IdentifierImpl
 */
fun TsExpressionWithTypeArguments.identifier(block: Identifier.() -> Unit): Identifier {
    return IdentifierImpl().apply(block)
}

/**
 * TsExpressionWithTypeArguments#expression: Expression
 * extension function for create Expression -> StringLiteralImpl
 */
fun TsExpressionWithTypeArguments.stringLiteral(block: StringLiteral.() -> Unit): StringLiteral {
    return StringLiteralImpl().apply(block)
}

/**
 * TsExpressionWithTypeArguments#expression: Expression
 * extension function for create Expression -> BooleanLiteralImpl
 */
fun TsExpressionWithTypeArguments.booleanLiteral(block: BooleanLiteral.() -> Unit): BooleanLiteral {
    return BooleanLiteralImpl().apply(block)
}

/**
 * TsExpressionWithTypeArguments#expression: Expression
 * extension function for create Expression -> NullLiteralImpl
 */
fun TsExpressionWithTypeArguments.nullLiteral(block: NullLiteral.() -> Unit): NullLiteral {
    return NullLiteralImpl().apply(block)
}

/**
 * TsExpressionWithTypeArguments#expression: Expression
 * extension function for create Expression -> NumericLiteralImpl
 */
fun TsExpressionWithTypeArguments.numericLiteral(block: NumericLiteral.() -> Unit): NumericLiteral {
    return NumericLiteralImpl().apply(block)
}

/**
 * TsExpressionWithTypeArguments#expression: Expression
 * extension function for create Expression -> BigIntLiteralImpl
 */
fun TsExpressionWithTypeArguments.bigIntLiteral(block: BigIntLiteral.() -> Unit): BigIntLiteral {
    return BigIntLiteralImpl().apply(block)
}

/**
 * TsExpressionWithTypeArguments#expression: Expression
 * extension function for create Expression -> RegExpLiteralImpl
 */
fun TsExpressionWithTypeArguments.regExpLiteral(block: RegExpLiteral.() -> Unit): RegExpLiteral {
    return RegExpLiteralImpl().apply(block)
}

/**
 * TsExpressionWithTypeArguments#expression: Expression
 * extension function for create Expression -> JSXTextImpl
 */
fun TsExpressionWithTypeArguments.jSXText(block: JSXText.() -> Unit): JSXText {
    return JSXTextImpl().apply(block)
}

/**
 * TsExpressionWithTypeArguments#expression: Expression
 * extension function for create Expression -> TemplateLiteralImpl
 */
fun TsExpressionWithTypeArguments.templateLiteral(block: TemplateLiteral.() -> Unit): TemplateLiteral {
    return TemplateLiteralImpl().apply(block)
}

/**
 * TsExpressionWithTypeArguments#expression: Expression
 * extension function for create Expression -> TaggedTemplateExpressionImpl
 */
fun TsExpressionWithTypeArguments.taggedTemplateExpression(block: TaggedTemplateExpression.() -> Unit): TaggedTemplateExpression {
    return TaggedTemplateExpressionImpl().apply(block)
}

/**
 * TsExpressionWithTypeArguments#expression: Expression
 * extension function for create Expression -> ArrowFunctionExpressionImpl
 */
fun TsExpressionWithTypeArguments.arrowFunctionExpression(block: ArrowFunctionExpression.() -> Unit): ArrowFunctionExpression {
    return ArrowFunctionExpressionImpl().apply(block)
}

/**
 * TsExpressionWithTypeArguments#expression: Expression
 * extension function for create Expression -> ClassExpressionImpl
 */
fun TsExpressionWithTypeArguments.classExpression(block: ClassExpression.() -> Unit): ClassExpression {
    return ClassExpressionImpl().apply(block)
}

/**
 * TsExpressionWithTypeArguments#expression: Expression
 * extension function for create Expression -> YieldExpressionImpl
 */
fun TsExpressionWithTypeArguments.yieldExpression(block: YieldExpression.() -> Unit): YieldExpression {
    return YieldExpressionImpl().apply(block)
}

/**
 * TsExpressionWithTypeArguments#expression: Expression
 * extension function for create Expression -> MetaPropertyImpl
 */
fun TsExpressionWithTypeArguments.metaProperty(block: MetaProperty.() -> Unit): MetaProperty {
    return MetaPropertyImpl().apply(block)
}

/**
 * TsExpressionWithTypeArguments#expression: Expression
 * extension function for create Expression -> AwaitExpressionImpl
 */
fun TsExpressionWithTypeArguments.awaitExpression(block: AwaitExpression.() -> Unit): AwaitExpression {
    return AwaitExpressionImpl().apply(block)
}

/**
 * TsExpressionWithTypeArguments#expression: Expression
 * extension function for create Expression -> ParenthesisExpressionImpl
 */
fun TsExpressionWithTypeArguments.parenthesisExpression(block: ParenthesisExpression.() -> Unit): ParenthesisExpression {
    return ParenthesisExpressionImpl().apply(block)
}

/**
 * TsExpressionWithTypeArguments#expression: Expression
 * extension function for create Expression -> JSXMemberExpressionImpl
 */
fun TsExpressionWithTypeArguments.jSXMemberExpression(block: JSXMemberExpression.() -> Unit): JSXMemberExpression {
    return JSXMemberExpressionImpl().apply(block)
}

/**
 * TsExpressionWithTypeArguments#expression: Expression
 * extension function for create Expression -> JSXNamespacedNameImpl
 */
fun TsExpressionWithTypeArguments.jSXNamespacedName(block: JSXNamespacedName.() -> Unit): JSXNamespacedName {
    return JSXNamespacedNameImpl().apply(block)
}

/**
 * TsExpressionWithTypeArguments#expression: Expression
 * extension function for create Expression -> JSXEmptyExpressionImpl
 */
fun TsExpressionWithTypeArguments.jSXEmptyExpression(block: JSXEmptyExpression.() -> Unit): JSXEmptyExpression {
    return JSXEmptyExpressionImpl().apply(block)
}

/**
 * TsExpressionWithTypeArguments#expression: Expression
 * extension function for create Expression -> JSXElementImpl
 */
fun TsExpressionWithTypeArguments.jSXElement(block: JSXElement.() -> Unit): JSXElement {
    return JSXElementImpl().apply(block)
}

/**
 * TsExpressionWithTypeArguments#expression: Expression
 * extension function for create Expression -> JSXFragmentImpl
 */
fun TsExpressionWithTypeArguments.jSXFragment(block: JSXFragment.() -> Unit): JSXFragment {
    return JSXFragmentImpl().apply(block)
}

/**
 * TsExpressionWithTypeArguments#expression: Expression
 * extension function for create Expression -> TsTypeAssertionImpl
 */
fun TsExpressionWithTypeArguments.tsTypeAssertion(block: TsTypeAssertion.() -> Unit): TsTypeAssertion {
    return TsTypeAssertionImpl().apply(block)
}

/**
 * TsExpressionWithTypeArguments#expression: Expression
 * extension function for create Expression -> TsConstAssertionImpl
 */
fun TsExpressionWithTypeArguments.tsConstAssertion(block: TsConstAssertion.() -> Unit): TsConstAssertion {
    return TsConstAssertionImpl().apply(block)
}

/**
 * TsExpressionWithTypeArguments#expression: Expression
 * extension function for create Expression -> TsNonNullExpressionImpl
 */
fun TsExpressionWithTypeArguments.tsNonNullExpression(block: TsNonNullExpression.() -> Unit): TsNonNullExpression {
    return TsNonNullExpressionImpl().apply(block)
}

/**
 * TsExpressionWithTypeArguments#expression: Expression
 * extension function for create Expression -> TsAsExpressionImpl
 */
fun TsExpressionWithTypeArguments.tsAsExpression(block: TsAsExpression.() -> Unit): TsAsExpression {
    return TsAsExpressionImpl().apply(block)
}

/**
 * TsExpressionWithTypeArguments#expression: Expression
 * extension function for create Expression -> TsSatisfiesExpressionImpl
 */
fun TsExpressionWithTypeArguments.tsSatisfiesExpression(block: TsSatisfiesExpression.() -> Unit): TsSatisfiesExpression {
    return TsSatisfiesExpressionImpl().apply(block)
}

/**
 * TsExpressionWithTypeArguments#expression: Expression
 * extension function for create Expression -> TsInstantiationImpl
 */
fun TsExpressionWithTypeArguments.tsInstantiation(block: TsInstantiation.() -> Unit): TsInstantiation {
    return TsInstantiationImpl().apply(block)
}

/**
 * TsExpressionWithTypeArguments#expression: Expression
 * extension function for create Expression -> PrivateNameImpl
 */
fun TsExpressionWithTypeArguments.privateName(block: PrivateName.() -> Unit): PrivateName {
    return PrivateNameImpl().apply(block)
}

/**
 * TsExpressionWithTypeArguments#expression: Expression
 * extension function for create Expression -> OptionalChainingExpressionImpl
 */
fun TsExpressionWithTypeArguments.optionalChainingExpression(block: OptionalChainingExpression.() -> Unit): OptionalChainingExpression {
    return OptionalChainingExpressionImpl().apply(block)
}

/**
 * TsExpressionWithTypeArguments#expression: Expression
 * extension function for create Expression -> InvalidImpl
 */
fun TsExpressionWithTypeArguments.invalid(block: Invalid.() -> Unit): Invalid {
    return InvalidImpl().apply(block)
}

/**
 * TsExpressionWithTypeArguments#typeArguments: TsTypeParameterInstantiation
 * extension function for create TsTypeParameterInstantiation -> TsTypeParameterInstantiationImpl
 */
fun TsExpressionWithTypeArguments.tsTypeParameterInstantiation(
    block: TsTypeParameterInstantiation.() -> Unit
): TsTypeParameterInstantiation {
    return TsTypeParameterInstantiationImpl().apply(block)
}

fun TsExpressionWithTypeArguments.span(block: Span.() -> Unit): Span {
    return Span().apply(block)
}
