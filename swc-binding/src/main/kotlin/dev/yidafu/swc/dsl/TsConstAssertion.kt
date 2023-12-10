package dev.yidafu.swc.dsl

import dev.yidafu.swc.types.*

/**
 * TsConstAssertion#expression: Expression
 * extension function for create Expression -> ThisExpressionImpl
 */
fun TsConstAssertion.thisExpression(block: ThisExpression.() -> Unit): ThisExpression {
    return ThisExpressionImpl().apply(block)
}

/**
 * TsConstAssertion#expression: Expression
 * extension function for create Expression -> ArrayExpressionImpl
 */
fun TsConstAssertion.arrayExpression(block: ArrayExpression.() -> Unit): ArrayExpression {
    return ArrayExpressionImpl().apply(block)
}

/**
 * TsConstAssertion#expression: Expression
 * extension function for create Expression -> ObjectExpressionImpl
 */
fun TsConstAssertion.objectExpression(block: ObjectExpression.() -> Unit): ObjectExpression {
    return ObjectExpressionImpl().apply(block)
}

/**
 * TsConstAssertion#expression: Expression
 * extension function for create Expression -> FunctionExpressionImpl
 */
fun TsConstAssertion.functionExpression(block: FunctionExpression.() -> Unit): FunctionExpression {
    return FunctionExpressionImpl().apply(block)
}

/**
 * TsConstAssertion#expression: Expression
 * extension function for create Expression -> UnaryExpressionImpl
 */
fun TsConstAssertion.unaryExpression(block: UnaryExpression.() -> Unit): UnaryExpression {
    return UnaryExpressionImpl().apply(block)
}

/**
 * TsConstAssertion#expression: Expression
 * extension function for create Expression -> UpdateExpressionImpl
 */
fun TsConstAssertion.updateExpression(block: UpdateExpression.() -> Unit): UpdateExpression {
    return UpdateExpressionImpl().apply(block)
}

/**
 * TsConstAssertion#expression: Expression
 * extension function for create Expression -> BinaryExpressionImpl
 */
fun TsConstAssertion.binaryExpression(block: BinaryExpression.() -> Unit): BinaryExpression {
    return BinaryExpressionImpl().apply(block)
}

/**
 * TsConstAssertion#expression: Expression
 * extension function for create Expression -> AssignmentExpressionImpl
 */
fun TsConstAssertion.assignmentExpression(block: AssignmentExpression.() -> Unit): AssignmentExpression {
    return AssignmentExpressionImpl().apply(block)
}

/**
 * TsConstAssertion#expression: Expression
 * extension function for create Expression -> MemberExpressionImpl
 */
fun TsConstAssertion.memberExpression(block: MemberExpression.() -> Unit): MemberExpression {
    return MemberExpressionImpl().apply(block)
}

/**
 * TsConstAssertion#expression: Expression
 * extension function for create Expression -> SuperPropExpressionImpl
 */
fun TsConstAssertion.superPropExpression(block: SuperPropExpression.() -> Unit): SuperPropExpression {
    return SuperPropExpressionImpl().apply(block)
}

/**
 * TsConstAssertion#expression: Expression
 * extension function for create Expression -> ConditionalExpressionImpl
 */
fun TsConstAssertion.conditionalExpression(block: ConditionalExpression.() -> Unit): ConditionalExpression {
    return ConditionalExpressionImpl().apply(block)
}

/**
 * TsConstAssertion#expression: Expression
 * extension function for create Expression -> CallExpressionImpl
 */
fun TsConstAssertion.callExpression(block: CallExpression.() -> Unit): CallExpression {
    return CallExpressionImpl().apply(block)
}

/**
 * TsConstAssertion#expression: Expression
 * extension function for create Expression -> NewExpressionImpl
 */
fun TsConstAssertion.newExpression(block: NewExpression.() -> Unit): NewExpression {
    return NewExpressionImpl().apply(block)
}

/**
 * TsConstAssertion#expression: Expression
 * extension function for create Expression -> SequenceExpressionImpl
 */
fun TsConstAssertion.sequenceExpression(block: SequenceExpression.() -> Unit): SequenceExpression {
    return SequenceExpressionImpl().apply(block)
}

/**
 * TsConstAssertion#expression: Expression
 * extension function for create Expression -> IdentifierImpl
 */
fun TsConstAssertion.identifier(block: Identifier.() -> Unit): Identifier {
    return IdentifierImpl().apply(block)
}

/**
 * TsConstAssertion#expression: Expression
 * extension function for create Expression -> StringLiteralImpl
 */
fun TsConstAssertion.stringLiteral(block: StringLiteral.() -> Unit): StringLiteral {
    return StringLiteralImpl().apply(block)
}

/**
 * TsConstAssertion#expression: Expression
 * extension function for create Expression -> BooleanLiteralImpl
 */
fun TsConstAssertion.booleanLiteral(block: BooleanLiteral.() -> Unit): BooleanLiteral {
    return BooleanLiteralImpl().apply(block)
}

/**
 * TsConstAssertion#expression: Expression
 * extension function for create Expression -> NullLiteralImpl
 */
fun TsConstAssertion.nullLiteral(block: NullLiteral.() -> Unit): NullLiteral {
    return NullLiteralImpl().apply(block)
}

/**
 * TsConstAssertion#expression: Expression
 * extension function for create Expression -> NumericLiteralImpl
 */
fun TsConstAssertion.numericLiteral(block: NumericLiteral.() -> Unit): NumericLiteral {
    return NumericLiteralImpl().apply(block)
}

/**
 * TsConstAssertion#expression: Expression
 * extension function for create Expression -> BigIntLiteralImpl
 */
fun TsConstAssertion.bigIntLiteral(block: BigIntLiteral.() -> Unit): BigIntLiteral {
    return BigIntLiteralImpl().apply(block)
}

/**
 * TsConstAssertion#expression: Expression
 * extension function for create Expression -> RegExpLiteralImpl
 */
fun TsConstAssertion.regExpLiteral(block: RegExpLiteral.() -> Unit): RegExpLiteral {
    return RegExpLiteralImpl().apply(block)
}

/**
 * TsConstAssertion#expression: Expression
 * extension function for create Expression -> JSXTextImpl
 */
fun TsConstAssertion.jSXText(block: JSXText.() -> Unit): JSXText {
    return JSXTextImpl().apply(block)
}

/**
 * TsConstAssertion#expression: Expression
 * extension function for create Expression -> TemplateLiteralImpl
 */
fun TsConstAssertion.templateLiteral(block: TemplateLiteral.() -> Unit): TemplateLiteral {
    return TemplateLiteralImpl().apply(block)
}

/**
 * TsConstAssertion#expression: Expression
 * extension function for create Expression -> TaggedTemplateExpressionImpl
 */
fun TsConstAssertion.taggedTemplateExpression(block: TaggedTemplateExpression.() -> Unit): TaggedTemplateExpression {
    return TaggedTemplateExpressionImpl().apply(block)
}

/**
 * TsConstAssertion#expression: Expression
 * extension function for create Expression -> ArrowFunctionExpressionImpl
 */
fun TsConstAssertion.arrowFunctionExpression(block: ArrowFunctionExpression.() -> Unit): ArrowFunctionExpression {
    return ArrowFunctionExpressionImpl().apply(block)
}

/**
 * TsConstAssertion#expression: Expression
 * extension function for create Expression -> ClassExpressionImpl
 */
fun TsConstAssertion.classExpression(block: ClassExpression.() -> Unit): ClassExpression {
    return ClassExpressionImpl().apply(block)
}

/**
 * TsConstAssertion#expression: Expression
 * extension function for create Expression -> YieldExpressionImpl
 */
fun TsConstAssertion.yieldExpression(block: YieldExpression.() -> Unit): YieldExpression {
    return YieldExpressionImpl().apply(block)
}

/**
 * TsConstAssertion#expression: Expression
 * extension function for create Expression -> MetaPropertyImpl
 */
fun TsConstAssertion.metaProperty(block: MetaProperty.() -> Unit): MetaProperty {
    return MetaPropertyImpl().apply(block)
}

/**
 * TsConstAssertion#expression: Expression
 * extension function for create Expression -> AwaitExpressionImpl
 */
fun TsConstAssertion.awaitExpression(block: AwaitExpression.() -> Unit): AwaitExpression {
    return AwaitExpressionImpl().apply(block)
}

/**
 * TsConstAssertion#expression: Expression
 * extension function for create Expression -> ParenthesisExpressionImpl
 */
fun TsConstAssertion.parenthesisExpression(block: ParenthesisExpression.() -> Unit): ParenthesisExpression {
    return ParenthesisExpressionImpl().apply(block)
}

/**
 * TsConstAssertion#expression: Expression
 * extension function for create Expression -> JSXMemberExpressionImpl
 */
fun TsConstAssertion.jSXMemberExpression(block: JSXMemberExpression.() -> Unit): JSXMemberExpression {
    return JSXMemberExpressionImpl().apply(block)
}

/**
 * TsConstAssertion#expression: Expression
 * extension function for create Expression -> JSXNamespacedNameImpl
 */
fun TsConstAssertion.jSXNamespacedName(block: JSXNamespacedName.() -> Unit): JSXNamespacedName {
    return JSXNamespacedNameImpl().apply(block)
}

/**
 * TsConstAssertion#expression: Expression
 * extension function for create Expression -> JSXEmptyExpressionImpl
 */
fun TsConstAssertion.jSXEmptyExpression(block: JSXEmptyExpression.() -> Unit): JSXEmptyExpression {
    return JSXEmptyExpressionImpl().apply(block)
}

/**
 * TsConstAssertion#expression: Expression
 * extension function for create Expression -> JSXElementImpl
 */
fun TsConstAssertion.jSXElement(block: JSXElement.() -> Unit): JSXElement {
    return JSXElementImpl().apply(block)
}

/**
 * TsConstAssertion#expression: Expression
 * extension function for create Expression -> JSXFragmentImpl
 */
fun TsConstAssertion.jSXFragment(block: JSXFragment.() -> Unit): JSXFragment {
    return JSXFragmentImpl().apply(block)
}

/**
 * TsConstAssertion#expression: Expression
 * extension function for create Expression -> TsTypeAssertionImpl
 */
fun TsConstAssertion.tsTypeAssertion(block: TsTypeAssertion.() -> Unit): TsTypeAssertion {
    return TsTypeAssertionImpl().apply(block)
}

/**
 * TsConstAssertion#expression: Expression
 * extension function for create Expression -> TsNonNullExpressionImpl
 */
fun TsConstAssertion.tsNonNullExpression(block: TsNonNullExpression.() -> Unit): TsNonNullExpression {
    return TsNonNullExpressionImpl().apply(block)
}

/**
 * TsConstAssertion#expression: Expression
 * extension function for create Expression -> TsAsExpressionImpl
 */
fun TsConstAssertion.tsAsExpression(block: TsAsExpression.() -> Unit): TsAsExpression {
    return TsAsExpressionImpl().apply(block)
}

/**
 * TsConstAssertion#expression: Expression
 * extension function for create Expression -> TsSatisfiesExpressionImpl
 */
fun TsConstAssertion.tsSatisfiesExpression(block: TsSatisfiesExpression.() -> Unit): TsSatisfiesExpression {
    return TsSatisfiesExpressionImpl().apply(block)
}

/**
 * TsConstAssertion#expression: Expression
 * extension function for create Expression -> TsInstantiationImpl
 */
fun TsConstAssertion.tsInstantiation(block: TsInstantiation.() -> Unit): TsInstantiation {
    return TsInstantiationImpl().apply(block)
}

/**
 * TsConstAssertion#expression: Expression
 * extension function for create Expression -> PrivateNameImpl
 */
fun TsConstAssertion.privateName(block: PrivateName.() -> Unit): PrivateName {
    return PrivateNameImpl().apply(block)
}

/**
 * TsConstAssertion#expression: Expression
 * extension function for create Expression -> OptionalChainingExpressionImpl
 */
fun TsConstAssertion.optionalChainingExpression(block: OptionalChainingExpression.() -> Unit): OptionalChainingExpression {
    return OptionalChainingExpressionImpl().apply(block)
}

/**
 * TsConstAssertion#expression: Expression
 * extension function for create Expression -> InvalidImpl
 */
fun TsConstAssertion.invalid(block: Invalid.() -> Unit): Invalid {
    return InvalidImpl().apply(block)
}

fun TsConstAssertion.span(block: Span.() -> Unit): Span {
    return Span().apply(block)
}
