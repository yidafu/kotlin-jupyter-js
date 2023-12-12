package dev.yidafu.swc.dsl

import dev.yidafu.swc.types.*

/**
 * Decorator#expression: Expression
 * extension function for create Expression -> ThisExpressionImpl
 */
fun Decorator.thisExpression(block: ThisExpression.() -> Unit): ThisExpression {
    return ThisExpressionImpl().apply(block)
}

/**
 * Decorator#expression: Expression
 * extension function for create Expression -> ArrayExpressionImpl
 */
fun Decorator.arrayExpression(block: ArrayExpression.() -> Unit): ArrayExpression {
    return ArrayExpressionImpl().apply(block)
}

/**
 * Decorator#expression: Expression
 * extension function for create Expression -> ObjectExpressionImpl
 */
fun Decorator.objectExpression(block: ObjectExpression.() -> Unit): ObjectExpression {
    return ObjectExpressionImpl().apply(block)
}

/**
 * Decorator#expression: Expression
 * extension function for create Expression -> FunctionExpressionImpl
 */
fun Decorator.functionExpression(block: FunctionExpression.() -> Unit): FunctionExpression {
    return FunctionExpressionImpl().apply(block)
}

/**
 * Decorator#expression: Expression
 * extension function for create Expression -> UnaryExpressionImpl
 */
fun Decorator.unaryExpression(block: UnaryExpression.() -> Unit): UnaryExpression {
    return UnaryExpressionImpl().apply(block)
}

/**
 * Decorator#expression: Expression
 * extension function for create Expression -> UpdateExpressionImpl
 */
fun Decorator.updateExpression(block: UpdateExpression.() -> Unit): UpdateExpression {
    return UpdateExpressionImpl().apply(block)
}

/**
 * Decorator#expression: Expression
 * extension function for create Expression -> BinaryExpressionImpl
 */
fun Decorator.binaryExpression(block: BinaryExpression.() -> Unit): BinaryExpression {
    return BinaryExpressionImpl().apply(block)
}

/**
 * Decorator#expression: Expression
 * extension function for create Expression -> AssignmentExpressionImpl
 */
fun Decorator.assignmentExpression(block: AssignmentExpression.() -> Unit): AssignmentExpression {
    return AssignmentExpressionImpl().apply(block)
}

/**
 * Decorator#expression: Expression
 * extension function for create Expression -> MemberExpressionImpl
 */
fun Decorator.memberExpression(block: MemberExpression.() -> Unit): MemberExpression {
    return MemberExpressionImpl().apply(block)
}

/**
 * Decorator#expression: Expression
 * extension function for create Expression -> SuperPropExpressionImpl
 */
fun Decorator.superPropExpression(block: SuperPropExpression.() -> Unit): SuperPropExpression {
    return SuperPropExpressionImpl().apply(block)
}

/**
 * Decorator#expression: Expression
 * extension function for create Expression -> ConditionalExpressionImpl
 */
fun Decorator.conditionalExpression(block: ConditionalExpression.() -> Unit): ConditionalExpression {
    return ConditionalExpressionImpl().apply(block)
}

/**
 * Decorator#expression: Expression
 * extension function for create Expression -> CallExpressionImpl
 */
fun Decorator.callExpression(block: CallExpression.() -> Unit): CallExpression {
    return CallExpressionImpl().apply(block)
}

/**
 * Decorator#expression: Expression
 * extension function for create Expression -> NewExpressionImpl
 */
fun Decorator.newExpression(block: NewExpression.() -> Unit): NewExpression {
    return NewExpressionImpl().apply(block)
}

/**
 * Decorator#expression: Expression
 * extension function for create Expression -> SequenceExpressionImpl
 */
fun Decorator.sequenceExpression(block: SequenceExpression.() -> Unit): SequenceExpression {
    return SequenceExpressionImpl().apply(block)
}

/**
 * Decorator#expression: Expression
 * extension function for create Expression -> IdentifierImpl
 */
fun Decorator.identifier(block: Identifier.() -> Unit): Identifier {
    return IdentifierImpl().apply(block)
}

/**
 * Decorator#expression: Expression
 * extension function for create Expression -> StringLiteralImpl
 */
fun Decorator.stringLiteral(block: StringLiteral.() -> Unit): StringLiteral {
    return StringLiteralImpl().apply(block)
}

/**
 * Decorator#expression: Expression
 * extension function for create Expression -> BooleanLiteralImpl
 */
fun Decorator.booleanLiteral(block: BooleanLiteral.() -> Unit): BooleanLiteral {
    return BooleanLiteralImpl().apply(block)
}

/**
 * Decorator#expression: Expression
 * extension function for create Expression -> NullLiteralImpl
 */
fun Decorator.nullLiteral(block: NullLiteral.() -> Unit): NullLiteral {
    return NullLiteralImpl().apply(block)
}

/**
 * Decorator#expression: Expression
 * extension function for create Expression -> NumericLiteralImpl
 */
fun Decorator.numericLiteral(block: NumericLiteral.() -> Unit): NumericLiteral {
    return NumericLiteralImpl().apply(block)
}

/**
 * Decorator#expression: Expression
 * extension function for create Expression -> BigIntLiteralImpl
 */
fun Decorator.bigIntLiteral(block: BigIntLiteral.() -> Unit): BigIntLiteral {
    return BigIntLiteralImpl().apply(block)
}

/**
 * Decorator#expression: Expression
 * extension function for create Expression -> RegExpLiteralImpl
 */
fun Decorator.regExpLiteral(block: RegExpLiteral.() -> Unit): RegExpLiteral {
    return RegExpLiteralImpl().apply(block)
}

/**
 * Decorator#expression: Expression
 * extension function for create Expression -> JSXTextImpl
 */
fun Decorator.jSXText(block: JSXText.() -> Unit): JSXText {
    return JSXTextImpl().apply(block)
}

/**
 * Decorator#expression: Expression
 * extension function for create Expression -> TemplateLiteralImpl
 */
fun Decorator.templateLiteral(block: TemplateLiteral.() -> Unit): TemplateLiteral {
    return TemplateLiteralImpl().apply(block)
}

/**
 * Decorator#expression: Expression
 * extension function for create Expression -> TaggedTemplateExpressionImpl
 */
fun Decorator.taggedTemplateExpression(block: TaggedTemplateExpression.() -> Unit): TaggedTemplateExpression {
    return TaggedTemplateExpressionImpl().apply(block)
}

/**
 * Decorator#expression: Expression
 * extension function for create Expression -> ArrowFunctionExpressionImpl
 */
fun Decorator.arrowFunctionExpression(block: ArrowFunctionExpression.() -> Unit): ArrowFunctionExpression {
    return ArrowFunctionExpressionImpl().apply(block)
}

/**
 * Decorator#expression: Expression
 * extension function for create Expression -> ClassExpressionImpl
 */
fun Decorator.classExpression(block: ClassExpression.() -> Unit): ClassExpression {
    return ClassExpressionImpl().apply(block)
}

/**
 * Decorator#expression: Expression
 * extension function for create Expression -> YieldExpressionImpl
 */
fun Decorator.yieldExpression(block: YieldExpression.() -> Unit): YieldExpression {
    return YieldExpressionImpl().apply(block)
}

/**
 * Decorator#expression: Expression
 * extension function for create Expression -> MetaPropertyImpl
 */
fun Decorator.metaProperty(block: MetaProperty.() -> Unit): MetaProperty {
    return MetaPropertyImpl().apply(block)
}

/**
 * Decorator#expression: Expression
 * extension function for create Expression -> AwaitExpressionImpl
 */
fun Decorator.awaitExpression(block: AwaitExpression.() -> Unit): AwaitExpression {
    return AwaitExpressionImpl().apply(block)
}

/**
 * Decorator#expression: Expression
 * extension function for create Expression -> ParenthesisExpressionImpl
 */
fun Decorator.parenthesisExpression(block: ParenthesisExpression.() -> Unit): ParenthesisExpression {
    return ParenthesisExpressionImpl().apply(block)
}

/**
 * Decorator#expression: Expression
 * extension function for create Expression -> JSXMemberExpressionImpl
 */
fun Decorator.jSXMemberExpression(block: JSXMemberExpression.() -> Unit): JSXMemberExpression {
    return JSXMemberExpressionImpl().apply(block)
}

/**
 * Decorator#expression: Expression
 * extension function for create Expression -> JSXNamespacedNameImpl
 */
fun Decorator.jSXNamespacedName(block: JSXNamespacedName.() -> Unit): JSXNamespacedName {
    return JSXNamespacedNameImpl().apply(block)
}

/**
 * Decorator#expression: Expression
 * extension function for create Expression -> JSXEmptyExpressionImpl
 */
fun Decorator.jSXEmptyExpression(block: JSXEmptyExpression.() -> Unit): JSXEmptyExpression {
    return JSXEmptyExpressionImpl().apply(block)
}

/**
 * Decorator#expression: Expression
 * extension function for create Expression -> JSXElementImpl
 */
fun Decorator.jSXElement(block: JSXElement.() -> Unit): JSXElement {
    return JSXElementImpl().apply(block)
}

/**
 * Decorator#expression: Expression
 * extension function for create Expression -> JSXFragmentImpl
 */
fun Decorator.jSXFragment(block: JSXFragment.() -> Unit): JSXFragment {
    return JSXFragmentImpl().apply(block)
}

/**
 * Decorator#expression: Expression
 * extension function for create Expression -> TsTypeAssertionImpl
 */
fun Decorator.tsTypeAssertion(block: TsTypeAssertion.() -> Unit): TsTypeAssertion {
    return TsTypeAssertionImpl().apply(block)
}

/**
 * Decorator#expression: Expression
 * extension function for create Expression -> TsConstAssertionImpl
 */
fun Decorator.tsConstAssertion(block: TsConstAssertion.() -> Unit): TsConstAssertion {
    return TsConstAssertionImpl().apply(block)
}

/**
 * Decorator#expression: Expression
 * extension function for create Expression -> TsNonNullExpressionImpl
 */
fun Decorator.tsNonNullExpression(block: TsNonNullExpression.() -> Unit): TsNonNullExpression {
    return TsNonNullExpressionImpl().apply(block)
}

/**
 * Decorator#expression: Expression
 * extension function for create Expression -> TsAsExpressionImpl
 */
fun Decorator.tsAsExpression(block: TsAsExpression.() -> Unit): TsAsExpression {
    return TsAsExpressionImpl().apply(block)
}

/**
 * Decorator#expression: Expression
 * extension function for create Expression -> TsSatisfiesExpressionImpl
 */
fun Decorator.tsSatisfiesExpression(block: TsSatisfiesExpression.() -> Unit): TsSatisfiesExpression {
    return TsSatisfiesExpressionImpl().apply(block)
}

/**
 * Decorator#expression: Expression
 * extension function for create Expression -> TsInstantiationImpl
 */
fun Decorator.tsInstantiation(block: TsInstantiation.() -> Unit): TsInstantiation {
    return TsInstantiationImpl().apply(block)
}

/**
 * Decorator#expression: Expression
 * extension function for create Expression -> PrivateNameImpl
 */
fun Decorator.privateName(block: PrivateName.() -> Unit): PrivateName {
    return PrivateNameImpl().apply(block)
}

/**
 * Decorator#expression: Expression
 * extension function for create Expression -> OptionalChainingExpressionImpl
 */
fun Decorator.optionalChainingExpression(block: OptionalChainingExpression.() -> Unit): OptionalChainingExpression {
    return OptionalChainingExpressionImpl().apply(block)
}

/**
 * Decorator#expression: Expression
 * extension function for create Expression -> InvalidImpl
 */
fun Decorator.invalid(block: Invalid.() -> Unit): Invalid {
    return InvalidImpl().apply(block)
}

fun Decorator.span(block: Span.() -> Unit): Span {
    return Span().apply(block)
}
