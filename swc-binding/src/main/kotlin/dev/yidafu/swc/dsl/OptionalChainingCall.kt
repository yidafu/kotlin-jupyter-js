package dev.yidafu.swc.dsl

import dev.yidafu.swc.types.*

/**
 * OptionalChainingCall#callee: Expression
 * extension function for create Expression -> ThisExpressionImpl
 */
fun OptionalChainingCall.thisExpression(block: ThisExpression.() -> Unit): ThisExpression {
    return ThisExpressionImpl().apply(block)
}

/**
 * OptionalChainingCall#callee: Expression
 * extension function for create Expression -> ArrayExpressionImpl
 */
fun OptionalChainingCall.arrayExpression(block: ArrayExpression.() -> Unit): ArrayExpression {
    return ArrayExpressionImpl().apply(block)
}

/**
 * OptionalChainingCall#callee: Expression
 * extension function for create Expression -> ObjectExpressionImpl
 */
fun OptionalChainingCall.objectExpression(block: ObjectExpression.() -> Unit): ObjectExpression {
    return ObjectExpressionImpl().apply(block)
}

/**
 * OptionalChainingCall#callee: Expression
 * extension function for create Expression -> FunctionExpressionImpl
 */
fun OptionalChainingCall.functionExpression(block: FunctionExpression.() -> Unit): FunctionExpression {
    return FunctionExpressionImpl().apply(block)
}

/**
 * OptionalChainingCall#callee: Expression
 * extension function for create Expression -> UnaryExpressionImpl
 */
fun OptionalChainingCall.unaryExpression(block: UnaryExpression.() -> Unit): UnaryExpression {
    return UnaryExpressionImpl().apply(block)
}

/**
 * OptionalChainingCall#callee: Expression
 * extension function for create Expression -> UpdateExpressionImpl
 */
fun OptionalChainingCall.updateExpression(block: UpdateExpression.() -> Unit): UpdateExpression {
    return UpdateExpressionImpl().apply(block)
}

/**
 * OptionalChainingCall#callee: Expression
 * extension function for create Expression -> BinaryExpressionImpl
 */
fun OptionalChainingCall.binaryExpression(block: BinaryExpression.() -> Unit): BinaryExpression {
    return BinaryExpressionImpl().apply(block)
}

/**
 * OptionalChainingCall#callee: Expression
 * extension function for create Expression -> AssignmentExpressionImpl
 */
fun OptionalChainingCall.assignmentExpression(block: AssignmentExpression.() -> Unit): AssignmentExpression {
    return AssignmentExpressionImpl().apply(block)
}

/**
 * OptionalChainingCall#callee: Expression
 * extension function for create Expression -> MemberExpressionImpl
 */
fun OptionalChainingCall.memberExpression(block: MemberExpression.() -> Unit): MemberExpression {
    return MemberExpressionImpl().apply(block)
}

/**
 * OptionalChainingCall#callee: Expression
 * extension function for create Expression -> SuperPropExpressionImpl
 */
fun OptionalChainingCall.superPropExpression(block: SuperPropExpression.() -> Unit): SuperPropExpression {
    return SuperPropExpressionImpl().apply(block)
}

/**
 * OptionalChainingCall#callee: Expression
 * extension function for create Expression -> ConditionalExpressionImpl
 */
fun OptionalChainingCall.conditionalExpression(block: ConditionalExpression.() -> Unit): ConditionalExpression {
    return ConditionalExpressionImpl().apply(block)
}

/**
 * OptionalChainingCall#callee: Expression
 * extension function for create Expression -> CallExpressionImpl
 */
fun OptionalChainingCall.callExpression(block: CallExpression.() -> Unit): CallExpression {
    return CallExpressionImpl().apply(block)
}

/**
 * OptionalChainingCall#callee: Expression
 * extension function for create Expression -> NewExpressionImpl
 */
fun OptionalChainingCall.newExpression(block: NewExpression.() -> Unit): NewExpression {
    return NewExpressionImpl().apply(block)
}

/**
 * OptionalChainingCall#callee: Expression
 * extension function for create Expression -> SequenceExpressionImpl
 */
fun OptionalChainingCall.sequenceExpression(block: SequenceExpression.() -> Unit): SequenceExpression {
    return SequenceExpressionImpl().apply(block)
}

/**
 * OptionalChainingCall#callee: Expression
 * extension function for create Expression -> IdentifierImpl
 */
fun OptionalChainingCall.identifier(block: Identifier.() -> Unit): Identifier {
    return IdentifierImpl().apply(block)
}

/**
 * OptionalChainingCall#callee: Expression
 * extension function for create Expression -> StringLiteralImpl
 */
fun OptionalChainingCall.stringLiteral(block: StringLiteral.() -> Unit): StringLiteral {
    return StringLiteralImpl().apply(block)
}

/**
 * OptionalChainingCall#callee: Expression
 * extension function for create Expression -> BooleanLiteralImpl
 */
fun OptionalChainingCall.booleanLiteral(block: BooleanLiteral.() -> Unit): BooleanLiteral {
    return BooleanLiteralImpl().apply(block)
}

/**
 * OptionalChainingCall#callee: Expression
 * extension function for create Expression -> NullLiteralImpl
 */
fun OptionalChainingCall.nullLiteral(block: NullLiteral.() -> Unit): NullLiteral {
    return NullLiteralImpl().apply(block)
}

/**
 * OptionalChainingCall#callee: Expression
 * extension function for create Expression -> NumericLiteralImpl
 */
fun OptionalChainingCall.numericLiteral(block: NumericLiteral.() -> Unit): NumericLiteral {
    return NumericLiteralImpl().apply(block)
}

/**
 * OptionalChainingCall#callee: Expression
 * extension function for create Expression -> BigIntLiteralImpl
 */
fun OptionalChainingCall.bigIntLiteral(block: BigIntLiteral.() -> Unit): BigIntLiteral {
    return BigIntLiteralImpl().apply(block)
}

/**
 * OptionalChainingCall#callee: Expression
 * extension function for create Expression -> RegExpLiteralImpl
 */
fun OptionalChainingCall.regExpLiteral(block: RegExpLiteral.() -> Unit): RegExpLiteral {
    return RegExpLiteralImpl().apply(block)
}

/**
 * OptionalChainingCall#callee: Expression
 * extension function for create Expression -> JSXTextImpl
 */
fun OptionalChainingCall.jSXText(block: JSXText.() -> Unit): JSXText {
    return JSXTextImpl().apply(block)
}

/**
 * OptionalChainingCall#callee: Expression
 * extension function for create Expression -> TemplateLiteralImpl
 */
fun OptionalChainingCall.templateLiteral(block: TemplateLiteral.() -> Unit): TemplateLiteral {
    return TemplateLiteralImpl().apply(block)
}

/**
 * OptionalChainingCall#callee: Expression
 * extension function for create Expression -> TaggedTemplateExpressionImpl
 */
fun OptionalChainingCall.taggedTemplateExpression(block: TaggedTemplateExpression.() -> Unit): TaggedTemplateExpression {
    return TaggedTemplateExpressionImpl().apply(block)
}

/**
 * OptionalChainingCall#callee: Expression
 * extension function for create Expression -> ArrowFunctionExpressionImpl
 */
fun OptionalChainingCall.arrowFunctionExpression(block: ArrowFunctionExpression.() -> Unit): ArrowFunctionExpression {
    return ArrowFunctionExpressionImpl().apply(block)
}

/**
 * OptionalChainingCall#callee: Expression
 * extension function for create Expression -> ClassExpressionImpl
 */
fun OptionalChainingCall.classExpression(block: ClassExpression.() -> Unit): ClassExpression {
    return ClassExpressionImpl().apply(block)
}

/**
 * OptionalChainingCall#callee: Expression
 * extension function for create Expression -> YieldExpressionImpl
 */
fun OptionalChainingCall.yieldExpression(block: YieldExpression.() -> Unit): YieldExpression {
    return YieldExpressionImpl().apply(block)
}

/**
 * OptionalChainingCall#callee: Expression
 * extension function for create Expression -> MetaPropertyImpl
 */
fun OptionalChainingCall.metaProperty(block: MetaProperty.() -> Unit): MetaProperty {
    return MetaPropertyImpl().apply(block)
}

/**
 * OptionalChainingCall#callee: Expression
 * extension function for create Expression -> AwaitExpressionImpl
 */
fun OptionalChainingCall.awaitExpression(block: AwaitExpression.() -> Unit): AwaitExpression {
    return AwaitExpressionImpl().apply(block)
}

/**
 * OptionalChainingCall#callee: Expression
 * extension function for create Expression -> ParenthesisExpressionImpl
 */
fun OptionalChainingCall.parenthesisExpression(block: ParenthesisExpression.() -> Unit): ParenthesisExpression {
    return ParenthesisExpressionImpl().apply(block)
}

/**
 * OptionalChainingCall#callee: Expression
 * extension function for create Expression -> JSXMemberExpressionImpl
 */
fun OptionalChainingCall.jSXMemberExpression(block: JSXMemberExpression.() -> Unit): JSXMemberExpression {
    return JSXMemberExpressionImpl().apply(block)
}

/**
 * OptionalChainingCall#callee: Expression
 * extension function for create Expression -> JSXNamespacedNameImpl
 */
fun OptionalChainingCall.jSXNamespacedName(block: JSXNamespacedName.() -> Unit): JSXNamespacedName {
    return JSXNamespacedNameImpl().apply(block)
}

/**
 * OptionalChainingCall#callee: Expression
 * extension function for create Expression -> JSXEmptyExpressionImpl
 */
fun OptionalChainingCall.jSXEmptyExpression(block: JSXEmptyExpression.() -> Unit): JSXEmptyExpression {
    return JSXEmptyExpressionImpl().apply(block)
}

/**
 * OptionalChainingCall#callee: Expression
 * extension function for create Expression -> JSXElementImpl
 */
fun OptionalChainingCall.jSXElement(block: JSXElement.() -> Unit): JSXElement {
    return JSXElementImpl().apply(block)
}

/**
 * OptionalChainingCall#callee: Expression
 * extension function for create Expression -> JSXFragmentImpl
 */
fun OptionalChainingCall.jSXFragment(block: JSXFragment.() -> Unit): JSXFragment {
    return JSXFragmentImpl().apply(block)
}

/**
 * OptionalChainingCall#callee: Expression
 * extension function for create Expression -> TsTypeAssertionImpl
 */
fun OptionalChainingCall.tsTypeAssertion(block: TsTypeAssertion.() -> Unit): TsTypeAssertion {
    return TsTypeAssertionImpl().apply(block)
}

/**
 * OptionalChainingCall#callee: Expression
 * extension function for create Expression -> TsConstAssertionImpl
 */
fun OptionalChainingCall.tsConstAssertion(block: TsConstAssertion.() -> Unit): TsConstAssertion {
    return TsConstAssertionImpl().apply(block)
}

/**
 * OptionalChainingCall#callee: Expression
 * extension function for create Expression -> TsNonNullExpressionImpl
 */
fun OptionalChainingCall.tsNonNullExpression(block: TsNonNullExpression.() -> Unit): TsNonNullExpression {
    return TsNonNullExpressionImpl().apply(block)
}

/**
 * OptionalChainingCall#callee: Expression
 * extension function for create Expression -> TsAsExpressionImpl
 */
fun OptionalChainingCall.tsAsExpression(block: TsAsExpression.() -> Unit): TsAsExpression {
    return TsAsExpressionImpl().apply(block)
}

/**
 * OptionalChainingCall#callee: Expression
 * extension function for create Expression -> TsSatisfiesExpressionImpl
 */
fun OptionalChainingCall.tsSatisfiesExpression(block: TsSatisfiesExpression.() -> Unit): TsSatisfiesExpression {
    return TsSatisfiesExpressionImpl().apply(block)
}

/**
 * OptionalChainingCall#callee: Expression
 * extension function for create Expression -> TsInstantiationImpl
 */
fun OptionalChainingCall.tsInstantiation(block: TsInstantiation.() -> Unit): TsInstantiation {
    return TsInstantiationImpl().apply(block)
}

/**
 * OptionalChainingCall#callee: Expression
 * extension function for create Expression -> PrivateNameImpl
 */
fun OptionalChainingCall.privateName(block: PrivateName.() -> Unit): PrivateName {
    return PrivateNameImpl().apply(block)
}

/**
 * OptionalChainingCall#callee: Expression
 * extension function for create Expression -> OptionalChainingExpressionImpl
 */
fun OptionalChainingCall.optionalChainingExpression(block: OptionalChainingExpression.() -> Unit): OptionalChainingExpression {
    return OptionalChainingExpressionImpl().apply(block)
}

/**
 * OptionalChainingCall#callee: Expression
 * extension function for create Expression -> InvalidImpl
 */
fun OptionalChainingCall.invalid(block: Invalid.() -> Unit): Invalid {
    return InvalidImpl().apply(block)
}

fun OptionalChainingCall.exprOrSpread(block: ExprOrSpread.() -> Unit): ExprOrSpread {
    return ExprOrSpread().apply(block)
}

/**
 * OptionalChainingCall#typeArguments: TsTypeParameterInstantiation
 * extension function for create TsTypeParameterInstantiation -> TsTypeParameterInstantiationImpl
 */
fun OptionalChainingCall.tsTypeParameterInstantiation(block: TsTypeParameterInstantiation.() -> Unit): TsTypeParameterInstantiation {
    return TsTypeParameterInstantiationImpl().apply(block)
}

fun OptionalChainingCall.span(block: Span.() -> Unit): Span {
    return Span().apply(block)
}
