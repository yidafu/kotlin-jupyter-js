package dev.yidafu.swc.dsl

import dev.yidafu.swc.types.*

/**
 * JSXSpreadChild#expression: Expression
 * extension function for create Expression -> ThisExpressionImpl
 */
fun JSXSpreadChild.thisExpression(block: ThisExpression.() -> Unit): ThisExpression {
    return ThisExpressionImpl().apply(block)
}

/**
 * JSXSpreadChild#expression: Expression
 * extension function for create Expression -> ArrayExpressionImpl
 */
fun JSXSpreadChild.arrayExpression(block: ArrayExpression.() -> Unit): ArrayExpression {
    return ArrayExpressionImpl().apply(block)
}

/**
 * JSXSpreadChild#expression: Expression
 * extension function for create Expression -> ObjectExpressionImpl
 */
fun JSXSpreadChild.objectExpression(block: ObjectExpression.() -> Unit): ObjectExpression {
    return ObjectExpressionImpl().apply(block)
}

/**
 * JSXSpreadChild#expression: Expression
 * extension function for create Expression -> FunctionExpressionImpl
 */
fun JSXSpreadChild.functionExpression(block: FunctionExpression.() -> Unit): FunctionExpression {
    return FunctionExpressionImpl().apply(block)
}

/**
 * JSXSpreadChild#expression: Expression
 * extension function for create Expression -> UnaryExpressionImpl
 */
fun JSXSpreadChild.unaryExpression(block: UnaryExpression.() -> Unit): UnaryExpression {
    return UnaryExpressionImpl().apply(block)
}

/**
 * JSXSpreadChild#expression: Expression
 * extension function for create Expression -> UpdateExpressionImpl
 */
fun JSXSpreadChild.updateExpression(block: UpdateExpression.() -> Unit): UpdateExpression {
    return UpdateExpressionImpl().apply(block)
}

/**
 * JSXSpreadChild#expression: Expression
 * extension function for create Expression -> BinaryExpressionImpl
 */
fun JSXSpreadChild.binaryExpression(block: BinaryExpression.() -> Unit): BinaryExpression {
    return BinaryExpressionImpl().apply(block)
}

/**
 * JSXSpreadChild#expression: Expression
 * extension function for create Expression -> AssignmentExpressionImpl
 */
fun JSXSpreadChild.assignmentExpression(block: AssignmentExpression.() -> Unit): AssignmentExpression {
    return AssignmentExpressionImpl().apply(block)
}

/**
 * JSXSpreadChild#expression: Expression
 * extension function for create Expression -> MemberExpressionImpl
 */
fun JSXSpreadChild.memberExpression(block: MemberExpression.() -> Unit): MemberExpression {
    return MemberExpressionImpl().apply(block)
}

/**
 * JSXSpreadChild#expression: Expression
 * extension function for create Expression -> SuperPropExpressionImpl
 */
fun JSXSpreadChild.superPropExpression(block: SuperPropExpression.() -> Unit): SuperPropExpression {
    return SuperPropExpressionImpl().apply(block)
}

/**
 * JSXSpreadChild#expression: Expression
 * extension function for create Expression -> ConditionalExpressionImpl
 */
fun JSXSpreadChild.conditionalExpression(block: ConditionalExpression.() -> Unit): ConditionalExpression {
    return ConditionalExpressionImpl().apply(block)
}

/**
 * JSXSpreadChild#expression: Expression
 * extension function for create Expression -> CallExpressionImpl
 */
fun JSXSpreadChild.callExpression(block: CallExpression.() -> Unit): CallExpression {
    return CallExpressionImpl().apply(block)
}

/**
 * JSXSpreadChild#expression: Expression
 * extension function for create Expression -> NewExpressionImpl
 */
fun JSXSpreadChild.newExpression(block: NewExpression.() -> Unit): NewExpression {
    return NewExpressionImpl().apply(block)
}

/**
 * JSXSpreadChild#expression: Expression
 * extension function for create Expression -> SequenceExpressionImpl
 */
fun JSXSpreadChild.sequenceExpression(block: SequenceExpression.() -> Unit): SequenceExpression {
    return SequenceExpressionImpl().apply(block)
}

/**
 * JSXSpreadChild#expression: Expression
 * extension function for create Expression -> IdentifierImpl
 */
fun JSXSpreadChild.identifier(block: Identifier.() -> Unit): Identifier {
    return IdentifierImpl().apply(block)
}

/**
 * JSXSpreadChild#expression: Expression
 * extension function for create Expression -> StringLiteralImpl
 */
fun JSXSpreadChild.stringLiteral(block: StringLiteral.() -> Unit): StringLiteral {
    return StringLiteralImpl().apply(block)
}

/**
 * JSXSpreadChild#expression: Expression
 * extension function for create Expression -> BooleanLiteralImpl
 */
fun JSXSpreadChild.booleanLiteral(block: BooleanLiteral.() -> Unit): BooleanLiteral {
    return BooleanLiteralImpl().apply(block)
}

/**
 * JSXSpreadChild#expression: Expression
 * extension function for create Expression -> NullLiteralImpl
 */
fun JSXSpreadChild.nullLiteral(block: NullLiteral.() -> Unit): NullLiteral {
    return NullLiteralImpl().apply(block)
}

/**
 * JSXSpreadChild#expression: Expression
 * extension function for create Expression -> NumericLiteralImpl
 */
fun JSXSpreadChild.numericLiteral(block: NumericLiteral.() -> Unit): NumericLiteral {
    return NumericLiteralImpl().apply(block)
}

/**
 * JSXSpreadChild#expression: Expression
 * extension function for create Expression -> BigIntLiteralImpl
 */
fun JSXSpreadChild.bigIntLiteral(block: BigIntLiteral.() -> Unit): BigIntLiteral {
    return BigIntLiteralImpl().apply(block)
}

/**
 * JSXSpreadChild#expression: Expression
 * extension function for create Expression -> RegExpLiteralImpl
 */
fun JSXSpreadChild.regExpLiteral(block: RegExpLiteral.() -> Unit): RegExpLiteral {
    return RegExpLiteralImpl().apply(block)
}

/**
 * JSXSpreadChild#expression: Expression
 * extension function for create Expression -> JSXTextImpl
 */
fun JSXSpreadChild.jSXText(block: JSXText.() -> Unit): JSXText {
    return JSXTextImpl().apply(block)
}

/**
 * JSXSpreadChild#expression: Expression
 * extension function for create Expression -> TemplateLiteralImpl
 */
fun JSXSpreadChild.templateLiteral(block: TemplateLiteral.() -> Unit): TemplateLiteral {
    return TemplateLiteralImpl().apply(block)
}

/**
 * JSXSpreadChild#expression: Expression
 * extension function for create Expression -> TaggedTemplateExpressionImpl
 */
fun JSXSpreadChild.taggedTemplateExpression(block: TaggedTemplateExpression.() -> Unit): TaggedTemplateExpression {
    return TaggedTemplateExpressionImpl().apply(block)
}

/**
 * JSXSpreadChild#expression: Expression
 * extension function for create Expression -> ArrowFunctionExpressionImpl
 */
fun JSXSpreadChild.arrowFunctionExpression(block: ArrowFunctionExpression.() -> Unit): ArrowFunctionExpression {
    return ArrowFunctionExpressionImpl().apply(block)
}

/**
 * JSXSpreadChild#expression: Expression
 * extension function for create Expression -> ClassExpressionImpl
 */
fun JSXSpreadChild.classExpression(block: ClassExpression.() -> Unit): ClassExpression {
    return ClassExpressionImpl().apply(block)
}

/**
 * JSXSpreadChild#expression: Expression
 * extension function for create Expression -> YieldExpressionImpl
 */
fun JSXSpreadChild.yieldExpression(block: YieldExpression.() -> Unit): YieldExpression {
    return YieldExpressionImpl().apply(block)
}

/**
 * JSXSpreadChild#expression: Expression
 * extension function for create Expression -> MetaPropertyImpl
 */
fun JSXSpreadChild.metaProperty(block: MetaProperty.() -> Unit): MetaProperty {
    return MetaPropertyImpl().apply(block)
}

/**
 * JSXSpreadChild#expression: Expression
 * extension function for create Expression -> AwaitExpressionImpl
 */
fun JSXSpreadChild.awaitExpression(block: AwaitExpression.() -> Unit): AwaitExpression {
    return AwaitExpressionImpl().apply(block)
}

/**
 * JSXSpreadChild#expression: Expression
 * extension function for create Expression -> ParenthesisExpressionImpl
 */
fun JSXSpreadChild.parenthesisExpression(block: ParenthesisExpression.() -> Unit): ParenthesisExpression {
    return ParenthesisExpressionImpl().apply(block)
}

/**
 * JSXSpreadChild#expression: Expression
 * extension function for create Expression -> JSXMemberExpressionImpl
 */
fun JSXSpreadChild.jSXMemberExpression(block: JSXMemberExpression.() -> Unit): JSXMemberExpression {
    return JSXMemberExpressionImpl().apply(block)
}

/**
 * JSXSpreadChild#expression: Expression
 * extension function for create Expression -> JSXNamespacedNameImpl
 */
fun JSXSpreadChild.jSXNamespacedName(block: JSXNamespacedName.() -> Unit): JSXNamespacedName {
    return JSXNamespacedNameImpl().apply(block)
}

/**
 * JSXSpreadChild#expression: Expression
 * extension function for create Expression -> JSXEmptyExpressionImpl
 */
fun JSXSpreadChild.jSXEmptyExpression(block: JSXEmptyExpression.() -> Unit): JSXEmptyExpression {
    return JSXEmptyExpressionImpl().apply(block)
}

/**
 * JSXSpreadChild#expression: Expression
 * extension function for create Expression -> JSXElementImpl
 */
fun JSXSpreadChild.jSXElement(block: JSXElement.() -> Unit): JSXElement {
    return JSXElementImpl().apply(block)
}

/**
 * JSXSpreadChild#expression: Expression
 * extension function for create Expression -> JSXFragmentImpl
 */
fun JSXSpreadChild.jSXFragment(block: JSXFragment.() -> Unit): JSXFragment {
    return JSXFragmentImpl().apply(block)
}

/**
 * JSXSpreadChild#expression: Expression
 * extension function for create Expression -> TsTypeAssertionImpl
 */
fun JSXSpreadChild.tsTypeAssertion(block: TsTypeAssertion.() -> Unit): TsTypeAssertion {
    return TsTypeAssertionImpl().apply(block)
}

/**
 * JSXSpreadChild#expression: Expression
 * extension function for create Expression -> TsConstAssertionImpl
 */
fun JSXSpreadChild.tsConstAssertion(block: TsConstAssertion.() -> Unit): TsConstAssertion {
    return TsConstAssertionImpl().apply(block)
}

/**
 * JSXSpreadChild#expression: Expression
 * extension function for create Expression -> TsNonNullExpressionImpl
 */
fun JSXSpreadChild.tsNonNullExpression(block: TsNonNullExpression.() -> Unit): TsNonNullExpression {
    return TsNonNullExpressionImpl().apply(block)
}

/**
 * JSXSpreadChild#expression: Expression
 * extension function for create Expression -> TsAsExpressionImpl
 */
fun JSXSpreadChild.tsAsExpression(block: TsAsExpression.() -> Unit): TsAsExpression {
    return TsAsExpressionImpl().apply(block)
}

/**
 * JSXSpreadChild#expression: Expression
 * extension function for create Expression -> TsSatisfiesExpressionImpl
 */
fun JSXSpreadChild.tsSatisfiesExpression(block: TsSatisfiesExpression.() -> Unit): TsSatisfiesExpression {
    return TsSatisfiesExpressionImpl().apply(block)
}

/**
 * JSXSpreadChild#expression: Expression
 * extension function for create Expression -> TsInstantiationImpl
 */
fun JSXSpreadChild.tsInstantiation(block: TsInstantiation.() -> Unit): TsInstantiation {
    return TsInstantiationImpl().apply(block)
}

/**
 * JSXSpreadChild#expression: Expression
 * extension function for create Expression -> PrivateNameImpl
 */
fun JSXSpreadChild.privateName(block: PrivateName.() -> Unit): PrivateName {
    return PrivateNameImpl().apply(block)
}

/**
 * JSXSpreadChild#expression: Expression
 * extension function for create Expression -> OptionalChainingExpressionImpl
 */
fun JSXSpreadChild.optionalChainingExpression(block: OptionalChainingExpression.() -> Unit): OptionalChainingExpression {
    return OptionalChainingExpressionImpl().apply(block)
}

/**
 * JSXSpreadChild#expression: Expression
 * extension function for create Expression -> InvalidImpl
 */
fun JSXSpreadChild.invalid(block: Invalid.() -> Unit): Invalid {
    return InvalidImpl().apply(block)
}

fun JSXSpreadChild.span(block: Span.() -> Unit): Span {
    return Span().apply(block)
}
