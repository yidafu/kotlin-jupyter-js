package dev.yidafu.swc.dsl

import dev.yidafu.swc.types.*

/**
 * NewExpression#callee: Expression
 * extension function for create Expression -> ThisExpressionImpl
 */
fun NewExpression.thisExpression(block: ThisExpression.() -> Unit): ThisExpression {
    return ThisExpressionImpl().apply(block)
}

/**
 * NewExpression#callee: Expression
 * extension function for create Expression -> ArrayExpressionImpl
 */
fun NewExpression.arrayExpression(block: ArrayExpression.() -> Unit): ArrayExpression {
    return ArrayExpressionImpl().apply(block)
}

/**
 * NewExpression#callee: Expression
 * extension function for create Expression -> ObjectExpressionImpl
 */
fun NewExpression.objectExpression(block: ObjectExpression.() -> Unit): ObjectExpression {
    return ObjectExpressionImpl().apply(block)
}

/**
 * NewExpression#callee: Expression
 * extension function for create Expression -> FunctionExpressionImpl
 */
fun NewExpression.functionExpression(block: FunctionExpression.() -> Unit): FunctionExpression {
    return FunctionExpressionImpl().apply(block)
}

/**
 * NewExpression#callee: Expression
 * extension function for create Expression -> UnaryExpressionImpl
 */
fun NewExpression.unaryExpression(block: UnaryExpression.() -> Unit): UnaryExpression {
    return UnaryExpressionImpl().apply(block)
}

/**
 * NewExpression#callee: Expression
 * extension function for create Expression -> UpdateExpressionImpl
 */
fun NewExpression.updateExpression(block: UpdateExpression.() -> Unit): UpdateExpression {
    return UpdateExpressionImpl().apply(block)
}

/**
 * NewExpression#callee: Expression
 * extension function for create Expression -> BinaryExpressionImpl
 */
fun NewExpression.binaryExpression(block: BinaryExpression.() -> Unit): BinaryExpression {
    return BinaryExpressionImpl().apply(block)
}

/**
 * NewExpression#callee: Expression
 * extension function for create Expression -> AssignmentExpressionImpl
 */
fun NewExpression.assignmentExpression(block: AssignmentExpression.() -> Unit): AssignmentExpression {
    return AssignmentExpressionImpl().apply(block)
}

/**
 * NewExpression#callee: Expression
 * extension function for create Expression -> MemberExpressionImpl
 */
fun NewExpression.memberExpression(block: MemberExpression.() -> Unit): MemberExpression {
    return MemberExpressionImpl().apply(block)
}

/**
 * NewExpression#callee: Expression
 * extension function for create Expression -> SuperPropExpressionImpl
 */
fun NewExpression.superPropExpression(block: SuperPropExpression.() -> Unit): SuperPropExpression {
    return SuperPropExpressionImpl().apply(block)
}

/**
 * NewExpression#callee: Expression
 * extension function for create Expression -> ConditionalExpressionImpl
 */
fun NewExpression.conditionalExpression(block: ConditionalExpression.() -> Unit): ConditionalExpression {
    return ConditionalExpressionImpl().apply(block)
}

/**
 * NewExpression#callee: Expression
 * extension function for create Expression -> CallExpressionImpl
 */
fun NewExpression.callExpression(block: CallExpression.() -> Unit): CallExpression {
    return CallExpressionImpl().apply(block)
}

/**
 * NewExpression#callee: Expression
 * extension function for create Expression -> SequenceExpressionImpl
 */
fun NewExpression.sequenceExpression(block: SequenceExpression.() -> Unit): SequenceExpression {
    return SequenceExpressionImpl().apply(block)
}

/**
 * NewExpression#callee: Expression
 * extension function for create Expression -> IdentifierImpl
 */
fun NewExpression.identifier(block: Identifier.() -> Unit): Identifier {
    return IdentifierImpl().apply(block)
}

/**
 * NewExpression#callee: Expression
 * extension function for create Expression -> StringLiteralImpl
 */
fun NewExpression.stringLiteral(block: StringLiteral.() -> Unit): StringLiteral {
    return StringLiteralImpl().apply(block)
}

/**
 * NewExpression#callee: Expression
 * extension function for create Expression -> BooleanLiteralImpl
 */
fun NewExpression.booleanLiteral(block: BooleanLiteral.() -> Unit): BooleanLiteral {
    return BooleanLiteralImpl().apply(block)
}

/**
 * NewExpression#callee: Expression
 * extension function for create Expression -> NullLiteralImpl
 */
fun NewExpression.nullLiteral(block: NullLiteral.() -> Unit): NullLiteral {
    return NullLiteralImpl().apply(block)
}

/**
 * NewExpression#callee: Expression
 * extension function for create Expression -> NumericLiteralImpl
 */
fun NewExpression.numericLiteral(block: NumericLiteral.() -> Unit): NumericLiteral {
    return NumericLiteralImpl().apply(block)
}

/**
 * NewExpression#callee: Expression
 * extension function for create Expression -> BigIntLiteralImpl
 */
fun NewExpression.bigIntLiteral(block: BigIntLiteral.() -> Unit): BigIntLiteral {
    return BigIntLiteralImpl().apply(block)
}

/**
 * NewExpression#callee: Expression
 * extension function for create Expression -> RegExpLiteralImpl
 */
fun NewExpression.regExpLiteral(block: RegExpLiteral.() -> Unit): RegExpLiteral {
    return RegExpLiteralImpl().apply(block)
}

/**
 * NewExpression#callee: Expression
 * extension function for create Expression -> JSXTextImpl
 */
fun NewExpression.jSXText(block: JSXText.() -> Unit): JSXText {
    return JSXTextImpl().apply(block)
}

/**
 * NewExpression#callee: Expression
 * extension function for create Expression -> TemplateLiteralImpl
 */
fun NewExpression.templateLiteral(block: TemplateLiteral.() -> Unit): TemplateLiteral {
    return TemplateLiteralImpl().apply(block)
}

/**
 * NewExpression#callee: Expression
 * extension function for create Expression -> TaggedTemplateExpressionImpl
 */
fun NewExpression.taggedTemplateExpression(block: TaggedTemplateExpression.() -> Unit): TaggedTemplateExpression {
    return TaggedTemplateExpressionImpl().apply(block)
}

/**
 * NewExpression#callee: Expression
 * extension function for create Expression -> ArrowFunctionExpressionImpl
 */
fun NewExpression.arrowFunctionExpression(block: ArrowFunctionExpression.() -> Unit): ArrowFunctionExpression {
    return ArrowFunctionExpressionImpl().apply(block)
}

/**
 * NewExpression#callee: Expression
 * extension function for create Expression -> ClassExpressionImpl
 */
fun NewExpression.classExpression(block: ClassExpression.() -> Unit): ClassExpression {
    return ClassExpressionImpl().apply(block)
}

/**
 * NewExpression#callee: Expression
 * extension function for create Expression -> YieldExpressionImpl
 */
fun NewExpression.yieldExpression(block: YieldExpression.() -> Unit): YieldExpression {
    return YieldExpressionImpl().apply(block)
}

/**
 * NewExpression#callee: Expression
 * extension function for create Expression -> MetaPropertyImpl
 */
fun NewExpression.metaProperty(block: MetaProperty.() -> Unit): MetaProperty {
    return MetaPropertyImpl().apply(block)
}

/**
 * NewExpression#callee: Expression
 * extension function for create Expression -> AwaitExpressionImpl
 */
fun NewExpression.awaitExpression(block: AwaitExpression.() -> Unit): AwaitExpression {
    return AwaitExpressionImpl().apply(block)
}

/**
 * NewExpression#callee: Expression
 * extension function for create Expression -> ParenthesisExpressionImpl
 */
fun NewExpression.parenthesisExpression(block: ParenthesisExpression.() -> Unit): ParenthesisExpression {
    return ParenthesisExpressionImpl().apply(block)
}

/**
 * NewExpression#callee: Expression
 * extension function for create Expression -> JSXMemberExpressionImpl
 */
fun NewExpression.jSXMemberExpression(block: JSXMemberExpression.() -> Unit): JSXMemberExpression {
    return JSXMemberExpressionImpl().apply(block)
}

/**
 * NewExpression#callee: Expression
 * extension function for create Expression -> JSXNamespacedNameImpl
 */
fun NewExpression.jSXNamespacedName(block: JSXNamespacedName.() -> Unit): JSXNamespacedName {
    return JSXNamespacedNameImpl().apply(block)
}

/**
 * NewExpression#callee: Expression
 * extension function for create Expression -> JSXEmptyExpressionImpl
 */
fun NewExpression.jSXEmptyExpression(block: JSXEmptyExpression.() -> Unit): JSXEmptyExpression {
    return JSXEmptyExpressionImpl().apply(block)
}

/**
 * NewExpression#callee: Expression
 * extension function for create Expression -> JSXElementImpl
 */
fun NewExpression.jSXElement(block: JSXElement.() -> Unit): JSXElement {
    return JSXElementImpl().apply(block)
}

/**
 * NewExpression#callee: Expression
 * extension function for create Expression -> JSXFragmentImpl
 */
fun NewExpression.jSXFragment(block: JSXFragment.() -> Unit): JSXFragment {
    return JSXFragmentImpl().apply(block)
}

/**
 * NewExpression#callee: Expression
 * extension function for create Expression -> TsTypeAssertionImpl
 */
fun NewExpression.tsTypeAssertion(block: TsTypeAssertion.() -> Unit): TsTypeAssertion {
    return TsTypeAssertionImpl().apply(block)
}

/**
 * NewExpression#callee: Expression
 * extension function for create Expression -> TsConstAssertionImpl
 */
fun NewExpression.tsConstAssertion(block: TsConstAssertion.() -> Unit): TsConstAssertion {
    return TsConstAssertionImpl().apply(block)
}

/**
 * NewExpression#callee: Expression
 * extension function for create Expression -> TsNonNullExpressionImpl
 */
fun NewExpression.tsNonNullExpression(block: TsNonNullExpression.() -> Unit): TsNonNullExpression {
    return TsNonNullExpressionImpl().apply(block)
}

/**
 * NewExpression#callee: Expression
 * extension function for create Expression -> TsAsExpressionImpl
 */
fun NewExpression.tsAsExpression(block: TsAsExpression.() -> Unit): TsAsExpression {
    return TsAsExpressionImpl().apply(block)
}

/**
 * NewExpression#callee: Expression
 * extension function for create Expression -> TsSatisfiesExpressionImpl
 */
fun NewExpression.tsSatisfiesExpression(block: TsSatisfiesExpression.() -> Unit): TsSatisfiesExpression {
    return TsSatisfiesExpressionImpl().apply(block)
}

/**
 * NewExpression#callee: Expression
 * extension function for create Expression -> TsInstantiationImpl
 */
fun NewExpression.tsInstantiation(block: TsInstantiation.() -> Unit): TsInstantiation {
    return TsInstantiationImpl().apply(block)
}

/**
 * NewExpression#callee: Expression
 * extension function for create Expression -> PrivateNameImpl
 */
fun NewExpression.privateName(block: PrivateName.() -> Unit): PrivateName {
    return PrivateNameImpl().apply(block)
}

/**
 * NewExpression#callee: Expression
 * extension function for create Expression -> OptionalChainingExpressionImpl
 */
fun NewExpression.optionalChainingExpression(block: OptionalChainingExpression.() -> Unit): OptionalChainingExpression {
    return OptionalChainingExpressionImpl().apply(block)
}

/**
 * NewExpression#callee: Expression
 * extension function for create Expression -> InvalidImpl
 */
fun NewExpression.invalid(block: Invalid.() -> Unit): Invalid {
    return InvalidImpl().apply(block)
}

fun NewExpression.argument(block: Argument.() -> Unit): Argument {
    return Argument().apply(block)
}

/**
 * NewExpression#typeArguments: TsTypeParameterInstantiation
 * extension function for create TsTypeParameterInstantiation -> TsTypeParameterInstantiationImpl
 */
fun NewExpression.tsTypeParameterInstantiation(block: TsTypeParameterInstantiation.() -> Unit): TsTypeParameterInstantiation {
    return TsTypeParameterInstantiationImpl().apply(block)
}

fun NewExpression.span(block: Span.() -> Unit): Span {
    return Span().apply(block)
}
