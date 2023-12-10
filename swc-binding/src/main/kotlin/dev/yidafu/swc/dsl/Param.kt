package dev.yidafu.swc.dsl

import dev.yidafu.swc.types.*

/**
 * Param#pat: Pattern
 * extension function for create Pattern -> BindingIdentifierImpl
 */
fun Param.bindingIdentifier(block: BindingIdentifier.() -> Unit): BindingIdentifier {
    return BindingIdentifierImpl().apply(block)
}

/**
 * Param#pat: Pattern
 * extension function for create Pattern -> ArrayPatternImpl
 */
fun Param.arrayPattern(block: ArrayPattern.() -> Unit): ArrayPattern {
    return ArrayPatternImpl().apply(block)
}

/**
 * Param#pat: Pattern
 * extension function for create Pattern -> RestElementImpl
 */
fun Param.restElement(block: RestElement.() -> Unit): RestElement {
    return RestElementImpl().apply(block)
}

/**
 * Param#pat: Pattern
 * extension function for create Pattern -> ObjectPatternImpl
 */
fun Param.objectPattern(block: ObjectPattern.() -> Unit): ObjectPattern {
    return ObjectPatternImpl().apply(block)
}

/**
 * Param#pat: Pattern
 * extension function for create Pattern -> AssignmentPatternImpl
 */
fun Param.assignmentPattern(block: AssignmentPattern.() -> Unit): AssignmentPattern {
    return AssignmentPatternImpl().apply(block)
}

/**
 * Param#pat: Pattern
 * extension function for create Pattern -> InvalidImpl
 */
fun Param.invalid(block: Invalid.() -> Unit): Invalid {
    return InvalidImpl().apply(block)
}

/**
 * Param#pat: Pattern
 * extension function for create Pattern -> ThisExpressionImpl
 */
fun Param.thisExpression(block: ThisExpression.() -> Unit): ThisExpression {
    return ThisExpressionImpl().apply(block)
}

/**
 * Param#pat: Pattern
 * extension function for create Pattern -> ArrayExpressionImpl
 */
fun Param.arrayExpression(block: ArrayExpression.() -> Unit): ArrayExpression {
    return ArrayExpressionImpl().apply(block)
}

/**
 * Param#pat: Pattern
 * extension function for create Pattern -> ObjectExpressionImpl
 */
fun Param.objectExpression(block: ObjectExpression.() -> Unit): ObjectExpression {
    return ObjectExpressionImpl().apply(block)
}

/**
 * Param#pat: Pattern
 * extension function for create Pattern -> FunctionExpressionImpl
 */
fun Param.functionExpression(block: FunctionExpression.() -> Unit): FunctionExpression {
    return FunctionExpressionImpl().apply(block)
}

/**
 * Param#pat: Pattern
 * extension function for create Pattern -> UnaryExpressionImpl
 */
fun Param.unaryExpression(block: UnaryExpression.() -> Unit): UnaryExpression {
    return UnaryExpressionImpl().apply(block)
}

/**
 * Param#pat: Pattern
 * extension function for create Pattern -> UpdateExpressionImpl
 */
fun Param.updateExpression(block: UpdateExpression.() -> Unit): UpdateExpression {
    return UpdateExpressionImpl().apply(block)
}

/**
 * Param#pat: Pattern
 * extension function for create Pattern -> BinaryExpressionImpl
 */
fun Param.binaryExpression(block: BinaryExpression.() -> Unit): BinaryExpression {
    return BinaryExpressionImpl().apply(block)
}

/**
 * Param#pat: Pattern
 * extension function for create Pattern -> AssignmentExpressionImpl
 */
fun Param.assignmentExpression(block: AssignmentExpression.() -> Unit): AssignmentExpression {
    return AssignmentExpressionImpl().apply(block)
}

/**
 * Param#pat: Pattern
 * extension function for create Pattern -> MemberExpressionImpl
 */
fun Param.memberExpression(block: MemberExpression.() -> Unit): MemberExpression {
    return MemberExpressionImpl().apply(block)
}

/**
 * Param#pat: Pattern
 * extension function for create Pattern -> SuperPropExpressionImpl
 */
fun Param.superPropExpression(block: SuperPropExpression.() -> Unit): SuperPropExpression {
    return SuperPropExpressionImpl().apply(block)
}

/**
 * Param#pat: Pattern
 * extension function for create Pattern -> ConditionalExpressionImpl
 */
fun Param.conditionalExpression(block: ConditionalExpression.() -> Unit): ConditionalExpression {
    return ConditionalExpressionImpl().apply(block)
}

/**
 * Param#pat: Pattern
 * extension function for create Pattern -> CallExpressionImpl
 */
fun Param.callExpression(block: CallExpression.() -> Unit): CallExpression {
    return CallExpressionImpl().apply(block)
}

/**
 * Param#pat: Pattern
 * extension function for create Pattern -> NewExpressionImpl
 */
fun Param.newExpression(block: NewExpression.() -> Unit): NewExpression {
    return NewExpressionImpl().apply(block)
}

/**
 * Param#pat: Pattern
 * extension function for create Pattern -> SequenceExpressionImpl
 */
fun Param.sequenceExpression(block: SequenceExpression.() -> Unit): SequenceExpression {
    return SequenceExpressionImpl().apply(block)
}

/**
 * Param#pat: Pattern
 * extension function for create Pattern -> IdentifierImpl
 */
fun Param.identifier(block: Identifier.() -> Unit): Identifier {
    return IdentifierImpl().apply(block)
}

/**
 * Param#pat: Pattern
 * extension function for create Pattern -> StringLiteralImpl
 */
fun Param.stringLiteral(block: StringLiteral.() -> Unit): StringLiteral {
    return StringLiteralImpl().apply(block)
}

/**
 * Param#pat: Pattern
 * extension function for create Pattern -> BooleanLiteralImpl
 */
fun Param.booleanLiteral(block: BooleanLiteral.() -> Unit): BooleanLiteral {
    return BooleanLiteralImpl().apply(block)
}

/**
 * Param#pat: Pattern
 * extension function for create Pattern -> NullLiteralImpl
 */
fun Param.nullLiteral(block: NullLiteral.() -> Unit): NullLiteral {
    return NullLiteralImpl().apply(block)
}

/**
 * Param#pat: Pattern
 * extension function for create Pattern -> NumericLiteralImpl
 */
fun Param.numericLiteral(block: NumericLiteral.() -> Unit): NumericLiteral {
    return NumericLiteralImpl().apply(block)
}

/**
 * Param#pat: Pattern
 * extension function for create Pattern -> BigIntLiteralImpl
 */
fun Param.bigIntLiteral(block: BigIntLiteral.() -> Unit): BigIntLiteral {
    return BigIntLiteralImpl().apply(block)
}

/**
 * Param#pat: Pattern
 * extension function for create Pattern -> RegExpLiteralImpl
 */
fun Param.regExpLiteral(block: RegExpLiteral.() -> Unit): RegExpLiteral {
    return RegExpLiteralImpl().apply(block)
}

/**
 * Param#pat: Pattern
 * extension function for create Pattern -> JSXTextImpl
 */
fun Param.jSXText(block: JSXText.() -> Unit): JSXText {
    return JSXTextImpl().apply(block)
}

/**
 * Param#pat: Pattern
 * extension function for create Pattern -> TemplateLiteralImpl
 */
fun Param.templateLiteral(block: TemplateLiteral.() -> Unit): TemplateLiteral {
    return TemplateLiteralImpl().apply(block)
}

/**
 * Param#pat: Pattern
 * extension function for create Pattern -> TaggedTemplateExpressionImpl
 */
fun Param.taggedTemplateExpression(block: TaggedTemplateExpression.() -> Unit): TaggedTemplateExpression {
    return TaggedTemplateExpressionImpl().apply(block)
}

/**
 * Param#pat: Pattern
 * extension function for create Pattern -> ArrowFunctionExpressionImpl
 */
fun Param.arrowFunctionExpression(block: ArrowFunctionExpression.() -> Unit): ArrowFunctionExpression {
    return ArrowFunctionExpressionImpl().apply(block)
}

/**
 * Param#pat: Pattern
 * extension function for create Pattern -> ClassExpressionImpl
 */
fun Param.classExpression(block: ClassExpression.() -> Unit): ClassExpression {
    return ClassExpressionImpl().apply(block)
}

/**
 * Param#pat: Pattern
 * extension function for create Pattern -> YieldExpressionImpl
 */
fun Param.yieldExpression(block: YieldExpression.() -> Unit): YieldExpression {
    return YieldExpressionImpl().apply(block)
}

/**
 * Param#pat: Pattern
 * extension function for create Pattern -> MetaPropertyImpl
 */
fun Param.metaProperty(block: MetaProperty.() -> Unit): MetaProperty {
    return MetaPropertyImpl().apply(block)
}

/**
 * Param#pat: Pattern
 * extension function for create Pattern -> AwaitExpressionImpl
 */
fun Param.awaitExpression(block: AwaitExpression.() -> Unit): AwaitExpression {
    return AwaitExpressionImpl().apply(block)
}

/**
 * Param#pat: Pattern
 * extension function for create Pattern -> ParenthesisExpressionImpl
 */
fun Param.parenthesisExpression(block: ParenthesisExpression.() -> Unit): ParenthesisExpression {
    return ParenthesisExpressionImpl().apply(block)
}

/**
 * Param#pat: Pattern
 * extension function for create Pattern -> JSXMemberExpressionImpl
 */
fun Param.jSXMemberExpression(block: JSXMemberExpression.() -> Unit): JSXMemberExpression {
    return JSXMemberExpressionImpl().apply(block)
}

/**
 * Param#pat: Pattern
 * extension function for create Pattern -> JSXNamespacedNameImpl
 */
fun Param.jSXNamespacedName(block: JSXNamespacedName.() -> Unit): JSXNamespacedName {
    return JSXNamespacedNameImpl().apply(block)
}

/**
 * Param#pat: Pattern
 * extension function for create Pattern -> JSXEmptyExpressionImpl
 */
fun Param.jSXEmptyExpression(block: JSXEmptyExpression.() -> Unit): JSXEmptyExpression {
    return JSXEmptyExpressionImpl().apply(block)
}

/**
 * Param#pat: Pattern
 * extension function for create Pattern -> JSXElementImpl
 */
fun Param.jSXElement(block: JSXElement.() -> Unit): JSXElement {
    return JSXElementImpl().apply(block)
}

/**
 * Param#pat: Pattern
 * extension function for create Pattern -> JSXFragmentImpl
 */
fun Param.jSXFragment(block: JSXFragment.() -> Unit): JSXFragment {
    return JSXFragmentImpl().apply(block)
}

/**
 * Param#pat: Pattern
 * extension function for create Pattern -> TsTypeAssertionImpl
 */
fun Param.tsTypeAssertion(block: TsTypeAssertion.() -> Unit): TsTypeAssertion {
    return TsTypeAssertionImpl().apply(block)
}

/**
 * Param#pat: Pattern
 * extension function for create Pattern -> TsConstAssertionImpl
 */
fun Param.tsConstAssertion(block: TsConstAssertion.() -> Unit): TsConstAssertion {
    return TsConstAssertionImpl().apply(block)
}

/**
 * Param#pat: Pattern
 * extension function for create Pattern -> TsNonNullExpressionImpl
 */
fun Param.tsNonNullExpression(block: TsNonNullExpression.() -> Unit): TsNonNullExpression {
    return TsNonNullExpressionImpl().apply(block)
}

/**
 * Param#pat: Pattern
 * extension function for create Pattern -> TsAsExpressionImpl
 */
fun Param.tsAsExpression(block: TsAsExpression.() -> Unit): TsAsExpression {
    return TsAsExpressionImpl().apply(block)
}

/**
 * Param#pat: Pattern
 * extension function for create Pattern -> TsSatisfiesExpressionImpl
 */
fun Param.tsSatisfiesExpression(block: TsSatisfiesExpression.() -> Unit): TsSatisfiesExpression {
    return TsSatisfiesExpressionImpl().apply(block)
}

/**
 * Param#pat: Pattern
 * extension function for create Pattern -> TsInstantiationImpl
 */
fun Param.tsInstantiation(block: TsInstantiation.() -> Unit): TsInstantiation {
    return TsInstantiationImpl().apply(block)
}

/**
 * Param#pat: Pattern
 * extension function for create Pattern -> PrivateNameImpl
 */
fun Param.privateName(block: PrivateName.() -> Unit): PrivateName {
    return PrivateNameImpl().apply(block)
}

/**
 * Param#pat: Pattern
 * extension function for create Pattern -> OptionalChainingExpressionImpl
 */
fun Param.optionalChainingExpression(block: OptionalChainingExpression.() -> Unit): OptionalChainingExpression {
    return OptionalChainingExpressionImpl().apply(block)
}

fun Param.span(block: Span.() -> Unit): Span {
    return Span().apply(block)
}

/**
 * Param#decorators: Array<Decorator>
 * extension function for create Array<Decorator> -> DecoratorImpl
 */
fun Param.decorator(block: Decorator.() -> Unit): Decorator {
    return DecoratorImpl().apply(block)
}
