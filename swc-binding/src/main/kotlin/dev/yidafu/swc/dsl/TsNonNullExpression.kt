package dev.yidafu.swc.dsl

import dev.yidafu.swc.types.*

/**
 * TsNonNullExpression#expression: Expression
 * extension function for create Expression -> ThisExpressionImpl
 */
fun TsNonNullExpression.thisExpression(block: ThisExpression.() -> Unit): ThisExpression {
    return ThisExpressionImpl().apply(block)
}

/**
 * TsNonNullExpression#expression: Expression
 * extension function for create Expression -> ArrayExpressionImpl
 */
fun TsNonNullExpression.arrayExpression(block: ArrayExpression.() -> Unit): ArrayExpression {
    return ArrayExpressionImpl().apply(block)
}

/**
 * TsNonNullExpression#expression: Expression
 * extension function for create Expression -> ObjectExpressionImpl
 */
fun TsNonNullExpression.objectExpression(block: ObjectExpression.() -> Unit): ObjectExpression {
    return ObjectExpressionImpl().apply(block)
}

/**
 * TsNonNullExpression#expression: Expression
 * extension function for create Expression -> FunctionExpressionImpl
 */
fun TsNonNullExpression.functionExpression(block: FunctionExpression.() -> Unit): FunctionExpression {
    return FunctionExpressionImpl().apply(block)
}

/**
 * TsNonNullExpression#expression: Expression
 * extension function for create Expression -> UnaryExpressionImpl
 */
fun TsNonNullExpression.unaryExpression(block: UnaryExpression.() -> Unit): UnaryExpression {
    return UnaryExpressionImpl().apply(block)
}

/**
 * TsNonNullExpression#expression: Expression
 * extension function for create Expression -> UpdateExpressionImpl
 */
fun TsNonNullExpression.updateExpression(block: UpdateExpression.() -> Unit): UpdateExpression {
    return UpdateExpressionImpl().apply(block)
}

/**
 * TsNonNullExpression#expression: Expression
 * extension function for create Expression -> BinaryExpressionImpl
 */
fun TsNonNullExpression.binaryExpression(block: BinaryExpression.() -> Unit): BinaryExpression {
    return BinaryExpressionImpl().apply(block)
}

/**
 * TsNonNullExpression#expression: Expression
 * extension function for create Expression -> AssignmentExpressionImpl
 */
fun TsNonNullExpression.assignmentExpression(block: AssignmentExpression.() -> Unit): AssignmentExpression {
    return AssignmentExpressionImpl().apply(block)
}

/**
 * TsNonNullExpression#expression: Expression
 * extension function for create Expression -> MemberExpressionImpl
 */
fun TsNonNullExpression.memberExpression(block: MemberExpression.() -> Unit): MemberExpression {
    return MemberExpressionImpl().apply(block)
}

/**
 * TsNonNullExpression#expression: Expression
 * extension function for create Expression -> SuperPropExpressionImpl
 */
fun TsNonNullExpression.superPropExpression(block: SuperPropExpression.() -> Unit): SuperPropExpression {
    return SuperPropExpressionImpl().apply(block)
}

/**
 * TsNonNullExpression#expression: Expression
 * extension function for create Expression -> ConditionalExpressionImpl
 */
fun TsNonNullExpression.conditionalExpression(block: ConditionalExpression.() -> Unit): ConditionalExpression {
    return ConditionalExpressionImpl().apply(block)
}

/**
 * TsNonNullExpression#expression: Expression
 * extension function for create Expression -> CallExpressionImpl
 */
fun TsNonNullExpression.callExpression(block: CallExpression.() -> Unit): CallExpression {
    return CallExpressionImpl().apply(block)
}

/**
 * TsNonNullExpression#expression: Expression
 * extension function for create Expression -> NewExpressionImpl
 */
fun TsNonNullExpression.newExpression(block: NewExpression.() -> Unit): NewExpression {
    return NewExpressionImpl().apply(block)
}

/**
 * TsNonNullExpression#expression: Expression
 * extension function for create Expression -> SequenceExpressionImpl
 */
fun TsNonNullExpression.sequenceExpression(block: SequenceExpression.() -> Unit): SequenceExpression {
    return SequenceExpressionImpl().apply(block)
}

/**
 * TsNonNullExpression#expression: Expression
 * extension function for create Expression -> IdentifierImpl
 */
fun TsNonNullExpression.identifier(block: Identifier.() -> Unit): Identifier {
    return IdentifierImpl().apply(block)
}

/**
 * TsNonNullExpression#expression: Expression
 * extension function for create Expression -> StringLiteralImpl
 */
fun TsNonNullExpression.stringLiteral(block: StringLiteral.() -> Unit): StringLiteral {
    return StringLiteralImpl().apply(block)
}

/**
 * TsNonNullExpression#expression: Expression
 * extension function for create Expression -> BooleanLiteralImpl
 */
fun TsNonNullExpression.booleanLiteral(block: BooleanLiteral.() -> Unit): BooleanLiteral {
    return BooleanLiteralImpl().apply(block)
}

/**
 * TsNonNullExpression#expression: Expression
 * extension function for create Expression -> NullLiteralImpl
 */
fun TsNonNullExpression.nullLiteral(block: NullLiteral.() -> Unit): NullLiteral {
    return NullLiteralImpl().apply(block)
}

/**
 * TsNonNullExpression#expression: Expression
 * extension function for create Expression -> NumericLiteralImpl
 */
fun TsNonNullExpression.numericLiteral(block: NumericLiteral.() -> Unit): NumericLiteral {
    return NumericLiteralImpl().apply(block)
}

/**
 * TsNonNullExpression#expression: Expression
 * extension function for create Expression -> BigIntLiteralImpl
 */
fun TsNonNullExpression.bigIntLiteral(block: BigIntLiteral.() -> Unit): BigIntLiteral {
    return BigIntLiteralImpl().apply(block)
}

/**
 * TsNonNullExpression#expression: Expression
 * extension function for create Expression -> RegExpLiteralImpl
 */
fun TsNonNullExpression.regExpLiteral(block: RegExpLiteral.() -> Unit): RegExpLiteral {
    return RegExpLiteralImpl().apply(block)
}

/**
 * TsNonNullExpression#expression: Expression
 * extension function for create Expression -> JSXTextImpl
 */
fun TsNonNullExpression.jSXText(block: JSXText.() -> Unit): JSXText {
    return JSXTextImpl().apply(block)
}

/**
 * TsNonNullExpression#expression: Expression
 * extension function for create Expression -> TemplateLiteralImpl
 */
fun TsNonNullExpression.templateLiteral(block: TemplateLiteral.() -> Unit): TemplateLiteral {
    return TemplateLiteralImpl().apply(block)
}

/**
 * TsNonNullExpression#expression: Expression
 * extension function for create Expression -> TaggedTemplateExpressionImpl
 */
fun TsNonNullExpression.taggedTemplateExpression(block: TaggedTemplateExpression.() -> Unit): TaggedTemplateExpression {
    return TaggedTemplateExpressionImpl().apply(block)
}

/**
 * TsNonNullExpression#expression: Expression
 * extension function for create Expression -> ArrowFunctionExpressionImpl
 */
fun TsNonNullExpression.arrowFunctionExpression(block: ArrowFunctionExpression.() -> Unit): ArrowFunctionExpression {
    return ArrowFunctionExpressionImpl().apply(block)
}

/**
 * TsNonNullExpression#expression: Expression
 * extension function for create Expression -> ClassExpressionImpl
 */
fun TsNonNullExpression.classExpression(block: ClassExpression.() -> Unit): ClassExpression {
    return ClassExpressionImpl().apply(block)
}

/**
 * TsNonNullExpression#expression: Expression
 * extension function for create Expression -> YieldExpressionImpl
 */
fun TsNonNullExpression.yieldExpression(block: YieldExpression.() -> Unit): YieldExpression {
    return YieldExpressionImpl().apply(block)
}

/**
 * TsNonNullExpression#expression: Expression
 * extension function for create Expression -> MetaPropertyImpl
 */
fun TsNonNullExpression.metaProperty(block: MetaProperty.() -> Unit): MetaProperty {
    return MetaPropertyImpl().apply(block)
}

/**
 * TsNonNullExpression#expression: Expression
 * extension function for create Expression -> AwaitExpressionImpl
 */
fun TsNonNullExpression.awaitExpression(block: AwaitExpression.() -> Unit): AwaitExpression {
    return AwaitExpressionImpl().apply(block)
}

/**
 * TsNonNullExpression#expression: Expression
 * extension function for create Expression -> ParenthesisExpressionImpl
 */
fun TsNonNullExpression.parenthesisExpression(block: ParenthesisExpression.() -> Unit): ParenthesisExpression {
    return ParenthesisExpressionImpl().apply(block)
}

/**
 * TsNonNullExpression#expression: Expression
 * extension function for create Expression -> JSXMemberExpressionImpl
 */
fun TsNonNullExpression.jSXMemberExpression(block: JSXMemberExpression.() -> Unit): JSXMemberExpression {
    return JSXMemberExpressionImpl().apply(block)
}

/**
 * TsNonNullExpression#expression: Expression
 * extension function for create Expression -> JSXNamespacedNameImpl
 */
fun TsNonNullExpression.jSXNamespacedName(block: JSXNamespacedName.() -> Unit): JSXNamespacedName {
    return JSXNamespacedNameImpl().apply(block)
}

/**
 * TsNonNullExpression#expression: Expression
 * extension function for create Expression -> JSXEmptyExpressionImpl
 */
fun TsNonNullExpression.jSXEmptyExpression(block: JSXEmptyExpression.() -> Unit): JSXEmptyExpression {
    return JSXEmptyExpressionImpl().apply(block)
}

/**
 * TsNonNullExpression#expression: Expression
 * extension function for create Expression -> JSXElementImpl
 */
fun TsNonNullExpression.jSXElement(block: JSXElement.() -> Unit): JSXElement {
    return JSXElementImpl().apply(block)
}

/**
 * TsNonNullExpression#expression: Expression
 * extension function for create Expression -> JSXFragmentImpl
 */
fun TsNonNullExpression.jSXFragment(block: JSXFragment.() -> Unit): JSXFragment {
    return JSXFragmentImpl().apply(block)
}

/**
 * TsNonNullExpression#expression: Expression
 * extension function for create Expression -> TsTypeAssertionImpl
 */
fun TsNonNullExpression.tsTypeAssertion(block: TsTypeAssertion.() -> Unit): TsTypeAssertion {
    return TsTypeAssertionImpl().apply(block)
}

/**
 * TsNonNullExpression#expression: Expression
 * extension function for create Expression -> TsConstAssertionImpl
 */
fun TsNonNullExpression.tsConstAssertion(block: TsConstAssertion.() -> Unit): TsConstAssertion {
    return TsConstAssertionImpl().apply(block)
}

/**
 * TsNonNullExpression#expression: Expression
 * extension function for create Expression -> TsAsExpressionImpl
 */
fun TsNonNullExpression.tsAsExpression(block: TsAsExpression.() -> Unit): TsAsExpression {
    return TsAsExpressionImpl().apply(block)
}

/**
 * TsNonNullExpression#expression: Expression
 * extension function for create Expression -> TsSatisfiesExpressionImpl
 */
fun TsNonNullExpression.tsSatisfiesExpression(block: TsSatisfiesExpression.() -> Unit): TsSatisfiesExpression {
    return TsSatisfiesExpressionImpl().apply(block)
}

/**
 * TsNonNullExpression#expression: Expression
 * extension function for create Expression -> TsInstantiationImpl
 */
fun TsNonNullExpression.tsInstantiation(block: TsInstantiation.() -> Unit): TsInstantiation {
    return TsInstantiationImpl().apply(block)
}

/**
 * TsNonNullExpression#expression: Expression
 * extension function for create Expression -> PrivateNameImpl
 */
fun TsNonNullExpression.privateName(block: PrivateName.() -> Unit): PrivateName {
    return PrivateNameImpl().apply(block)
}

/**
 * TsNonNullExpression#expression: Expression
 * extension function for create Expression -> OptionalChainingExpressionImpl
 */
fun TsNonNullExpression.optionalChainingExpression(block: OptionalChainingExpression.() -> Unit): OptionalChainingExpression {
    return OptionalChainingExpressionImpl().apply(block)
}

/**
 * TsNonNullExpression#expression: Expression
 * extension function for create Expression -> InvalidImpl
 */
fun TsNonNullExpression.invalid(block: Invalid.() -> Unit): Invalid {
    return InvalidImpl().apply(block)
}

fun TsNonNullExpression.span(block: Span.() -> Unit): Span {
    return Span().apply(block)
}
