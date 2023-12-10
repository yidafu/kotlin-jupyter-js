package dev.yidafu.swc.dsl

import dev.yidafu.swc.types.*

fun SpreadElement.span(block: Span.() -> Unit): Span {
    return Span().apply(block)
}

/**
 * SpreadElement#arguments: Expression
 * extension function for create Expression -> ThisExpressionImpl
 */
fun SpreadElement.thisExpression(block: ThisExpression.() -> Unit): ThisExpression {
    return ThisExpressionImpl().apply(block)
}

/**
 * SpreadElement#arguments: Expression
 * extension function for create Expression -> ArrayExpressionImpl
 */
fun SpreadElement.arrayExpression(block: ArrayExpression.() -> Unit): ArrayExpression {
    return ArrayExpressionImpl().apply(block)
}

/**
 * SpreadElement#arguments: Expression
 * extension function for create Expression -> ObjectExpressionImpl
 */
fun SpreadElement.objectExpression(block: ObjectExpression.() -> Unit): ObjectExpression {
    return ObjectExpressionImpl().apply(block)
}

/**
 * SpreadElement#arguments: Expression
 * extension function for create Expression -> FunctionExpressionImpl
 */
fun SpreadElement.functionExpression(block: FunctionExpression.() -> Unit): FunctionExpression {
    return FunctionExpressionImpl().apply(block)
}

/**
 * SpreadElement#arguments: Expression
 * extension function for create Expression -> UnaryExpressionImpl
 */
fun SpreadElement.unaryExpression(block: UnaryExpression.() -> Unit): UnaryExpression {
    return UnaryExpressionImpl().apply(block)
}

/**
 * SpreadElement#arguments: Expression
 * extension function for create Expression -> UpdateExpressionImpl
 */
fun SpreadElement.updateExpression(block: UpdateExpression.() -> Unit): UpdateExpression {
    return UpdateExpressionImpl().apply(block)
}

/**
 * SpreadElement#arguments: Expression
 * extension function for create Expression -> BinaryExpressionImpl
 */
fun SpreadElement.binaryExpression(block: BinaryExpression.() -> Unit): BinaryExpression {
    return BinaryExpressionImpl().apply(block)
}

/**
 * SpreadElement#arguments: Expression
 * extension function for create Expression -> AssignmentExpressionImpl
 */
fun SpreadElement.assignmentExpression(block: AssignmentExpression.() -> Unit): AssignmentExpression {
    return AssignmentExpressionImpl().apply(block)
}

/**
 * SpreadElement#arguments: Expression
 * extension function for create Expression -> MemberExpressionImpl
 */
fun SpreadElement.memberExpression(block: MemberExpression.() -> Unit): MemberExpression {
    return MemberExpressionImpl().apply(block)
}

/**
 * SpreadElement#arguments: Expression
 * extension function for create Expression -> SuperPropExpressionImpl
 */
fun SpreadElement.superPropExpression(block: SuperPropExpression.() -> Unit): SuperPropExpression {
    return SuperPropExpressionImpl().apply(block)
}

/**
 * SpreadElement#arguments: Expression
 * extension function for create Expression -> ConditionalExpressionImpl
 */
fun SpreadElement.conditionalExpression(block: ConditionalExpression.() -> Unit): ConditionalExpression {
    return ConditionalExpressionImpl().apply(block)
}

/**
 * SpreadElement#arguments: Expression
 * extension function for create Expression -> CallExpressionImpl
 */
fun SpreadElement.callExpression(block: CallExpression.() -> Unit): CallExpression {
    return CallExpressionImpl().apply(block)
}

/**
 * SpreadElement#arguments: Expression
 * extension function for create Expression -> NewExpressionImpl
 */
fun SpreadElement.newExpression(block: NewExpression.() -> Unit): NewExpression {
    return NewExpressionImpl().apply(block)
}

/**
 * SpreadElement#arguments: Expression
 * extension function for create Expression -> SequenceExpressionImpl
 */
fun SpreadElement.sequenceExpression(block: SequenceExpression.() -> Unit): SequenceExpression {
    return SequenceExpressionImpl().apply(block)
}

/**
 * SpreadElement#arguments: Expression
 * extension function for create Expression -> IdentifierImpl
 */
fun SpreadElement.identifier(block: Identifier.() -> Unit): Identifier {
    return IdentifierImpl().apply(block)
}

/**
 * SpreadElement#arguments: Expression
 * extension function for create Expression -> StringLiteralImpl
 */
fun SpreadElement.stringLiteral(block: StringLiteral.() -> Unit): StringLiteral {
    return StringLiteralImpl().apply(block)
}

/**
 * SpreadElement#arguments: Expression
 * extension function for create Expression -> BooleanLiteralImpl
 */
fun SpreadElement.booleanLiteral(block: BooleanLiteral.() -> Unit): BooleanLiteral {
    return BooleanLiteralImpl().apply(block)
}

/**
 * SpreadElement#arguments: Expression
 * extension function for create Expression -> NullLiteralImpl
 */
fun SpreadElement.nullLiteral(block: NullLiteral.() -> Unit): NullLiteral {
    return NullLiteralImpl().apply(block)
}

/**
 * SpreadElement#arguments: Expression
 * extension function for create Expression -> NumericLiteralImpl
 */
fun SpreadElement.numericLiteral(block: NumericLiteral.() -> Unit): NumericLiteral {
    return NumericLiteralImpl().apply(block)
}

/**
 * SpreadElement#arguments: Expression
 * extension function for create Expression -> BigIntLiteralImpl
 */
fun SpreadElement.bigIntLiteral(block: BigIntLiteral.() -> Unit): BigIntLiteral {
    return BigIntLiteralImpl().apply(block)
}

/**
 * SpreadElement#arguments: Expression
 * extension function for create Expression -> RegExpLiteralImpl
 */
fun SpreadElement.regExpLiteral(block: RegExpLiteral.() -> Unit): RegExpLiteral {
    return RegExpLiteralImpl().apply(block)
}

/**
 * SpreadElement#arguments: Expression
 * extension function for create Expression -> JSXTextImpl
 */
fun SpreadElement.jSXText(block: JSXText.() -> Unit): JSXText {
    return JSXTextImpl().apply(block)
}

/**
 * SpreadElement#arguments: Expression
 * extension function for create Expression -> TemplateLiteralImpl
 */
fun SpreadElement.templateLiteral(block: TemplateLiteral.() -> Unit): TemplateLiteral {
    return TemplateLiteralImpl().apply(block)
}

/**
 * SpreadElement#arguments: Expression
 * extension function for create Expression -> TaggedTemplateExpressionImpl
 */
fun SpreadElement.taggedTemplateExpression(block: TaggedTemplateExpression.() -> Unit): TaggedTemplateExpression {
    return TaggedTemplateExpressionImpl().apply(block)
}

/**
 * SpreadElement#arguments: Expression
 * extension function for create Expression -> ArrowFunctionExpressionImpl
 */
fun SpreadElement.arrowFunctionExpression(block: ArrowFunctionExpression.() -> Unit): ArrowFunctionExpression {
    return ArrowFunctionExpressionImpl().apply(block)
}

/**
 * SpreadElement#arguments: Expression
 * extension function for create Expression -> ClassExpressionImpl
 */
fun SpreadElement.classExpression(block: ClassExpression.() -> Unit): ClassExpression {
    return ClassExpressionImpl().apply(block)
}

/**
 * SpreadElement#arguments: Expression
 * extension function for create Expression -> YieldExpressionImpl
 */
fun SpreadElement.yieldExpression(block: YieldExpression.() -> Unit): YieldExpression {
    return YieldExpressionImpl().apply(block)
}

/**
 * SpreadElement#arguments: Expression
 * extension function for create Expression -> MetaPropertyImpl
 */
fun SpreadElement.metaProperty(block: MetaProperty.() -> Unit): MetaProperty {
    return MetaPropertyImpl().apply(block)
}

/**
 * SpreadElement#arguments: Expression
 * extension function for create Expression -> AwaitExpressionImpl
 */
fun SpreadElement.awaitExpression(block: AwaitExpression.() -> Unit): AwaitExpression {
    return AwaitExpressionImpl().apply(block)
}

/**
 * SpreadElement#arguments: Expression
 * extension function for create Expression -> ParenthesisExpressionImpl
 */
fun SpreadElement.parenthesisExpression(block: ParenthesisExpression.() -> Unit): ParenthesisExpression {
    return ParenthesisExpressionImpl().apply(block)
}

/**
 * SpreadElement#arguments: Expression
 * extension function for create Expression -> JSXMemberExpressionImpl
 */
fun SpreadElement.jSXMemberExpression(block: JSXMemberExpression.() -> Unit): JSXMemberExpression {
    return JSXMemberExpressionImpl().apply(block)
}

/**
 * SpreadElement#arguments: Expression
 * extension function for create Expression -> JSXNamespacedNameImpl
 */
fun SpreadElement.jSXNamespacedName(block: JSXNamespacedName.() -> Unit): JSXNamespacedName {
    return JSXNamespacedNameImpl().apply(block)
}

/**
 * SpreadElement#arguments: Expression
 * extension function for create Expression -> JSXEmptyExpressionImpl
 */
fun SpreadElement.jSXEmptyExpression(block: JSXEmptyExpression.() -> Unit): JSXEmptyExpression {
    return JSXEmptyExpressionImpl().apply(block)
}

/**
 * SpreadElement#arguments: Expression
 * extension function for create Expression -> JSXElementImpl
 */
fun SpreadElement.jSXElement(block: JSXElement.() -> Unit): JSXElement {
    return JSXElementImpl().apply(block)
}

/**
 * SpreadElement#arguments: Expression
 * extension function for create Expression -> JSXFragmentImpl
 */
fun SpreadElement.jSXFragment(block: JSXFragment.() -> Unit): JSXFragment {
    return JSXFragmentImpl().apply(block)
}

/**
 * SpreadElement#arguments: Expression
 * extension function for create Expression -> TsTypeAssertionImpl
 */
fun SpreadElement.tsTypeAssertion(block: TsTypeAssertion.() -> Unit): TsTypeAssertion {
    return TsTypeAssertionImpl().apply(block)
}

/**
 * SpreadElement#arguments: Expression
 * extension function for create Expression -> TsConstAssertionImpl
 */
fun SpreadElement.tsConstAssertion(block: TsConstAssertion.() -> Unit): TsConstAssertion {
    return TsConstAssertionImpl().apply(block)
}

/**
 * SpreadElement#arguments: Expression
 * extension function for create Expression -> TsNonNullExpressionImpl
 */
fun SpreadElement.tsNonNullExpression(block: TsNonNullExpression.() -> Unit): TsNonNullExpression {
    return TsNonNullExpressionImpl().apply(block)
}

/**
 * SpreadElement#arguments: Expression
 * extension function for create Expression -> TsAsExpressionImpl
 */
fun SpreadElement.tsAsExpression(block: TsAsExpression.() -> Unit): TsAsExpression {
    return TsAsExpressionImpl().apply(block)
}

/**
 * SpreadElement#arguments: Expression
 * extension function for create Expression -> TsSatisfiesExpressionImpl
 */
fun SpreadElement.tsSatisfiesExpression(block: TsSatisfiesExpression.() -> Unit): TsSatisfiesExpression {
    return TsSatisfiesExpressionImpl().apply(block)
}

/**
 * SpreadElement#arguments: Expression
 * extension function for create Expression -> TsInstantiationImpl
 */
fun SpreadElement.tsInstantiation(block: TsInstantiation.() -> Unit): TsInstantiation {
    return TsInstantiationImpl().apply(block)
}

/**
 * SpreadElement#arguments: Expression
 * extension function for create Expression -> PrivateNameImpl
 */
fun SpreadElement.privateName(block: PrivateName.() -> Unit): PrivateName {
    return PrivateNameImpl().apply(block)
}

/**
 * SpreadElement#arguments: Expression
 * extension function for create Expression -> OptionalChainingExpressionImpl
 */
fun SpreadElement.optionalChainingExpression(block: OptionalChainingExpression.() -> Unit): OptionalChainingExpression {
    return OptionalChainingExpressionImpl().apply(block)
}

/**
 * SpreadElement#arguments: Expression
 * extension function for create Expression -> InvalidImpl
 */
fun SpreadElement.invalid(block: Invalid.() -> Unit): Invalid {
    return InvalidImpl().apply(block)
}
