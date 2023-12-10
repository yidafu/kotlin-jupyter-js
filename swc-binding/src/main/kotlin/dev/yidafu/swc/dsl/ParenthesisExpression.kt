package dev.yidafu.swc.dsl

import dev.yidafu.swc.types.*

/**
 * ParenthesisExpression#expression: Expression
 * extension function for create Expression -> ThisExpressionImpl
 */
fun ParenthesisExpression.thisExpression(block: ThisExpression.() -> Unit): ThisExpression {
    return ThisExpressionImpl().apply(block)
}

/**
 * ParenthesisExpression#expression: Expression
 * extension function for create Expression -> ArrayExpressionImpl
 */
fun ParenthesisExpression.arrayExpression(block: ArrayExpression.() -> Unit): ArrayExpression {
    return ArrayExpressionImpl().apply(block)
}

/**
 * ParenthesisExpression#expression: Expression
 * extension function for create Expression -> ObjectExpressionImpl
 */
fun ParenthesisExpression.objectExpression(block: ObjectExpression.() -> Unit): ObjectExpression {
    return ObjectExpressionImpl().apply(block)
}

/**
 * ParenthesisExpression#expression: Expression
 * extension function for create Expression -> FunctionExpressionImpl
 */
fun ParenthesisExpression.functionExpression(block: FunctionExpression.() -> Unit): FunctionExpression {
    return FunctionExpressionImpl().apply(block)
}

/**
 * ParenthesisExpression#expression: Expression
 * extension function for create Expression -> UnaryExpressionImpl
 */
fun ParenthesisExpression.unaryExpression(block: UnaryExpression.() -> Unit): UnaryExpression {
    return UnaryExpressionImpl().apply(block)
}

/**
 * ParenthesisExpression#expression: Expression
 * extension function for create Expression -> UpdateExpressionImpl
 */
fun ParenthesisExpression.updateExpression(block: UpdateExpression.() -> Unit): UpdateExpression {
    return UpdateExpressionImpl().apply(block)
}

/**
 * ParenthesisExpression#expression: Expression
 * extension function for create Expression -> BinaryExpressionImpl
 */
fun ParenthesisExpression.binaryExpression(block: BinaryExpression.() -> Unit): BinaryExpression {
    return BinaryExpressionImpl().apply(block)
}

/**
 * ParenthesisExpression#expression: Expression
 * extension function for create Expression -> AssignmentExpressionImpl
 */
fun ParenthesisExpression.assignmentExpression(block: AssignmentExpression.() -> Unit): AssignmentExpression {
    return AssignmentExpressionImpl().apply(block)
}

/**
 * ParenthesisExpression#expression: Expression
 * extension function for create Expression -> MemberExpressionImpl
 */
fun ParenthesisExpression.memberExpression(block: MemberExpression.() -> Unit): MemberExpression {
    return MemberExpressionImpl().apply(block)
}

/**
 * ParenthesisExpression#expression: Expression
 * extension function for create Expression -> SuperPropExpressionImpl
 */
fun ParenthesisExpression.superPropExpression(block: SuperPropExpression.() -> Unit): SuperPropExpression {
    return SuperPropExpressionImpl().apply(block)
}

/**
 * ParenthesisExpression#expression: Expression
 * extension function for create Expression -> ConditionalExpressionImpl
 */
fun ParenthesisExpression.conditionalExpression(block: ConditionalExpression.() -> Unit): ConditionalExpression {
    return ConditionalExpressionImpl().apply(block)
}

/**
 * ParenthesisExpression#expression: Expression
 * extension function for create Expression -> CallExpressionImpl
 */
fun ParenthesisExpression.callExpression(block: CallExpression.() -> Unit): CallExpression {
    return CallExpressionImpl().apply(block)
}

/**
 * ParenthesisExpression#expression: Expression
 * extension function for create Expression -> NewExpressionImpl
 */
fun ParenthesisExpression.newExpression(block: NewExpression.() -> Unit): NewExpression {
    return NewExpressionImpl().apply(block)
}

/**
 * ParenthesisExpression#expression: Expression
 * extension function for create Expression -> SequenceExpressionImpl
 */
fun ParenthesisExpression.sequenceExpression(block: SequenceExpression.() -> Unit): SequenceExpression {
    return SequenceExpressionImpl().apply(block)
}

/**
 * ParenthesisExpression#expression: Expression
 * extension function for create Expression -> IdentifierImpl
 */
fun ParenthesisExpression.identifier(block: Identifier.() -> Unit): Identifier {
    return IdentifierImpl().apply(block)
}

/**
 * ParenthesisExpression#expression: Expression
 * extension function for create Expression -> StringLiteralImpl
 */
fun ParenthesisExpression.stringLiteral(block: StringLiteral.() -> Unit): StringLiteral {
    return StringLiteralImpl().apply(block)
}

/**
 * ParenthesisExpression#expression: Expression
 * extension function for create Expression -> BooleanLiteralImpl
 */
fun ParenthesisExpression.booleanLiteral(block: BooleanLiteral.() -> Unit): BooleanLiteral {
    return BooleanLiteralImpl().apply(block)
}

/**
 * ParenthesisExpression#expression: Expression
 * extension function for create Expression -> NullLiteralImpl
 */
fun ParenthesisExpression.nullLiteral(block: NullLiteral.() -> Unit): NullLiteral {
    return NullLiteralImpl().apply(block)
}

/**
 * ParenthesisExpression#expression: Expression
 * extension function for create Expression -> NumericLiteralImpl
 */
fun ParenthesisExpression.numericLiteral(block: NumericLiteral.() -> Unit): NumericLiteral {
    return NumericLiteralImpl().apply(block)
}

/**
 * ParenthesisExpression#expression: Expression
 * extension function for create Expression -> BigIntLiteralImpl
 */
fun ParenthesisExpression.bigIntLiteral(block: BigIntLiteral.() -> Unit): BigIntLiteral {
    return BigIntLiteralImpl().apply(block)
}

/**
 * ParenthesisExpression#expression: Expression
 * extension function for create Expression -> RegExpLiteralImpl
 */
fun ParenthesisExpression.regExpLiteral(block: RegExpLiteral.() -> Unit): RegExpLiteral {
    return RegExpLiteralImpl().apply(block)
}

/**
 * ParenthesisExpression#expression: Expression
 * extension function for create Expression -> JSXTextImpl
 */
fun ParenthesisExpression.jSXText(block: JSXText.() -> Unit): JSXText {
    return JSXTextImpl().apply(block)
}

/**
 * ParenthesisExpression#expression: Expression
 * extension function for create Expression -> TemplateLiteralImpl
 */
fun ParenthesisExpression.templateLiteral(block: TemplateLiteral.() -> Unit): TemplateLiteral {
    return TemplateLiteralImpl().apply(block)
}

/**
 * ParenthesisExpression#expression: Expression
 * extension function for create Expression -> TaggedTemplateExpressionImpl
 */
fun ParenthesisExpression.taggedTemplateExpression(block: TaggedTemplateExpression.() -> Unit): TaggedTemplateExpression {
    return TaggedTemplateExpressionImpl().apply(block)
}

/**
 * ParenthesisExpression#expression: Expression
 * extension function for create Expression -> ArrowFunctionExpressionImpl
 */
fun ParenthesisExpression.arrowFunctionExpression(block: ArrowFunctionExpression.() -> Unit): ArrowFunctionExpression {
    return ArrowFunctionExpressionImpl().apply(block)
}

/**
 * ParenthesisExpression#expression: Expression
 * extension function for create Expression -> ClassExpressionImpl
 */
fun ParenthesisExpression.classExpression(block: ClassExpression.() -> Unit): ClassExpression {
    return ClassExpressionImpl().apply(block)
}

/**
 * ParenthesisExpression#expression: Expression
 * extension function for create Expression -> YieldExpressionImpl
 */
fun ParenthesisExpression.yieldExpression(block: YieldExpression.() -> Unit): YieldExpression {
    return YieldExpressionImpl().apply(block)
}

/**
 * ParenthesisExpression#expression: Expression
 * extension function for create Expression -> MetaPropertyImpl
 */
fun ParenthesisExpression.metaProperty(block: MetaProperty.() -> Unit): MetaProperty {
    return MetaPropertyImpl().apply(block)
}

/**
 * ParenthesisExpression#expression: Expression
 * extension function for create Expression -> AwaitExpressionImpl
 */
fun ParenthesisExpression.awaitExpression(block: AwaitExpression.() -> Unit): AwaitExpression {
    return AwaitExpressionImpl().apply(block)
}

/**
 * ParenthesisExpression#expression: Expression
 * extension function for create Expression -> JSXMemberExpressionImpl
 */
fun ParenthesisExpression.jSXMemberExpression(block: JSXMemberExpression.() -> Unit): JSXMemberExpression {
    return JSXMemberExpressionImpl().apply(block)
}

/**
 * ParenthesisExpression#expression: Expression
 * extension function for create Expression -> JSXNamespacedNameImpl
 */
fun ParenthesisExpression.jSXNamespacedName(block: JSXNamespacedName.() -> Unit): JSXNamespacedName {
    return JSXNamespacedNameImpl().apply(block)
}

/**
 * ParenthesisExpression#expression: Expression
 * extension function for create Expression -> JSXEmptyExpressionImpl
 */
fun ParenthesisExpression.jSXEmptyExpression(block: JSXEmptyExpression.() -> Unit): JSXEmptyExpression {
    return JSXEmptyExpressionImpl().apply(block)
}

/**
 * ParenthesisExpression#expression: Expression
 * extension function for create Expression -> JSXElementImpl
 */
fun ParenthesisExpression.jSXElement(block: JSXElement.() -> Unit): JSXElement {
    return JSXElementImpl().apply(block)
}

/**
 * ParenthesisExpression#expression: Expression
 * extension function for create Expression -> JSXFragmentImpl
 */
fun ParenthesisExpression.jSXFragment(block: JSXFragment.() -> Unit): JSXFragment {
    return JSXFragmentImpl().apply(block)
}

/**
 * ParenthesisExpression#expression: Expression
 * extension function for create Expression -> TsTypeAssertionImpl
 */
fun ParenthesisExpression.tsTypeAssertion(block: TsTypeAssertion.() -> Unit): TsTypeAssertion {
    return TsTypeAssertionImpl().apply(block)
}

/**
 * ParenthesisExpression#expression: Expression
 * extension function for create Expression -> TsConstAssertionImpl
 */
fun ParenthesisExpression.tsConstAssertion(block: TsConstAssertion.() -> Unit): TsConstAssertion {
    return TsConstAssertionImpl().apply(block)
}

/**
 * ParenthesisExpression#expression: Expression
 * extension function for create Expression -> TsNonNullExpressionImpl
 */
fun ParenthesisExpression.tsNonNullExpression(block: TsNonNullExpression.() -> Unit): TsNonNullExpression {
    return TsNonNullExpressionImpl().apply(block)
}

/**
 * ParenthesisExpression#expression: Expression
 * extension function for create Expression -> TsAsExpressionImpl
 */
fun ParenthesisExpression.tsAsExpression(block: TsAsExpression.() -> Unit): TsAsExpression {
    return TsAsExpressionImpl().apply(block)
}

/**
 * ParenthesisExpression#expression: Expression
 * extension function for create Expression -> TsSatisfiesExpressionImpl
 */
fun ParenthesisExpression.tsSatisfiesExpression(block: TsSatisfiesExpression.() -> Unit): TsSatisfiesExpression {
    return TsSatisfiesExpressionImpl().apply(block)
}

/**
 * ParenthesisExpression#expression: Expression
 * extension function for create Expression -> TsInstantiationImpl
 */
fun ParenthesisExpression.tsInstantiation(block: TsInstantiation.() -> Unit): TsInstantiation {
    return TsInstantiationImpl().apply(block)
}

/**
 * ParenthesisExpression#expression: Expression
 * extension function for create Expression -> PrivateNameImpl
 */
fun ParenthesisExpression.privateName(block: PrivateName.() -> Unit): PrivateName {
    return PrivateNameImpl().apply(block)
}

/**
 * ParenthesisExpression#expression: Expression
 * extension function for create Expression -> OptionalChainingExpressionImpl
 */
fun ParenthesisExpression.optionalChainingExpression(block: OptionalChainingExpression.() -> Unit): OptionalChainingExpression {
    return OptionalChainingExpressionImpl().apply(block)
}

/**
 * ParenthesisExpression#expression: Expression
 * extension function for create Expression -> InvalidImpl
 */
fun ParenthesisExpression.invalid(block: Invalid.() -> Unit): Invalid {
    return InvalidImpl().apply(block)
}

fun ParenthesisExpression.span(block: Span.() -> Unit): Span {
    return Span().apply(block)
}
