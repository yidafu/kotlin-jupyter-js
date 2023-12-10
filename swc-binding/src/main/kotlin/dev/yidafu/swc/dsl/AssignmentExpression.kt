package dev.yidafu.swc.dsl

import dev.yidafu.swc.types.*

/**
 * AssignmentExpression#right: Expression
 * extension function for create Expression -> ThisExpressionImpl
 */
fun AssignmentExpression.thisExpression(block: ThisExpression.() -> Unit): ThisExpression {
    return ThisExpressionImpl().apply(block)
}

/**
 * AssignmentExpression#right: Expression
 * extension function for create Expression -> ArrayExpressionImpl
 */
fun AssignmentExpression.arrayExpression(block: ArrayExpression.() -> Unit): ArrayExpression {
    return ArrayExpressionImpl().apply(block)
}

/**
 * AssignmentExpression#right: Expression
 * extension function for create Expression -> ObjectExpressionImpl
 */
fun AssignmentExpression.objectExpression(block: ObjectExpression.() -> Unit): ObjectExpression {
    return ObjectExpressionImpl().apply(block)
}

/**
 * AssignmentExpression#right: Expression
 * extension function for create Expression -> FunctionExpressionImpl
 */
fun AssignmentExpression.functionExpression(block: FunctionExpression.() -> Unit): FunctionExpression {
    return FunctionExpressionImpl().apply(block)
}

/**
 * AssignmentExpression#right: Expression
 * extension function for create Expression -> UnaryExpressionImpl
 */
fun AssignmentExpression.unaryExpression(block: UnaryExpression.() -> Unit): UnaryExpression {
    return UnaryExpressionImpl().apply(block)
}

/**
 * AssignmentExpression#right: Expression
 * extension function for create Expression -> UpdateExpressionImpl
 */
fun AssignmentExpression.updateExpression(block: UpdateExpression.() -> Unit): UpdateExpression {
    return UpdateExpressionImpl().apply(block)
}

/**
 * AssignmentExpression#right: Expression
 * extension function for create Expression -> BinaryExpressionImpl
 */
fun AssignmentExpression.binaryExpression(block: BinaryExpression.() -> Unit): BinaryExpression {
    return BinaryExpressionImpl().apply(block)
}

/**
 * AssignmentExpression#right: Expression
 * extension function for create Expression -> MemberExpressionImpl
 */
fun AssignmentExpression.memberExpression(block: MemberExpression.() -> Unit): MemberExpression {
    return MemberExpressionImpl().apply(block)
}

/**
 * AssignmentExpression#right: Expression
 * extension function for create Expression -> SuperPropExpressionImpl
 */
fun AssignmentExpression.superPropExpression(block: SuperPropExpression.() -> Unit): SuperPropExpression {
    return SuperPropExpressionImpl().apply(block)
}

/**
 * AssignmentExpression#right: Expression
 * extension function for create Expression -> ConditionalExpressionImpl
 */
fun AssignmentExpression.conditionalExpression(block: ConditionalExpression.() -> Unit): ConditionalExpression {
    return ConditionalExpressionImpl().apply(block)
}

/**
 * AssignmentExpression#right: Expression
 * extension function for create Expression -> CallExpressionImpl
 */
fun AssignmentExpression.callExpression(block: CallExpression.() -> Unit): CallExpression {
    return CallExpressionImpl().apply(block)
}

/**
 * AssignmentExpression#right: Expression
 * extension function for create Expression -> NewExpressionImpl
 */
fun AssignmentExpression.newExpression(block: NewExpression.() -> Unit): NewExpression {
    return NewExpressionImpl().apply(block)
}

/**
 * AssignmentExpression#right: Expression
 * extension function for create Expression -> SequenceExpressionImpl
 */
fun AssignmentExpression.sequenceExpression(block: SequenceExpression.() -> Unit): SequenceExpression {
    return SequenceExpressionImpl().apply(block)
}

/**
 * AssignmentExpression#right: Expression
 * extension function for create Expression -> IdentifierImpl
 */
fun AssignmentExpression.identifier(block: Identifier.() -> Unit): Identifier {
    return IdentifierImpl().apply(block)
}

/**
 * AssignmentExpression#right: Expression
 * extension function for create Expression -> StringLiteralImpl
 */
fun AssignmentExpression.stringLiteral(block: StringLiteral.() -> Unit): StringLiteral {
    return StringLiteralImpl().apply(block)
}

/**
 * AssignmentExpression#right: Expression
 * extension function for create Expression -> BooleanLiteralImpl
 */
fun AssignmentExpression.booleanLiteral(block: BooleanLiteral.() -> Unit): BooleanLiteral {
    return BooleanLiteralImpl().apply(block)
}

/**
 * AssignmentExpression#right: Expression
 * extension function for create Expression -> NullLiteralImpl
 */
fun AssignmentExpression.nullLiteral(block: NullLiteral.() -> Unit): NullLiteral {
    return NullLiteralImpl().apply(block)
}

/**
 * AssignmentExpression#right: Expression
 * extension function for create Expression -> NumericLiteralImpl
 */
fun AssignmentExpression.numericLiteral(block: NumericLiteral.() -> Unit): NumericLiteral {
    return NumericLiteralImpl().apply(block)
}

/**
 * AssignmentExpression#right: Expression
 * extension function for create Expression -> BigIntLiteralImpl
 */
fun AssignmentExpression.bigIntLiteral(block: BigIntLiteral.() -> Unit): BigIntLiteral {
    return BigIntLiteralImpl().apply(block)
}

/**
 * AssignmentExpression#right: Expression
 * extension function for create Expression -> RegExpLiteralImpl
 */
fun AssignmentExpression.regExpLiteral(block: RegExpLiteral.() -> Unit): RegExpLiteral {
    return RegExpLiteralImpl().apply(block)
}

/**
 * AssignmentExpression#right: Expression
 * extension function for create Expression -> JSXTextImpl
 */
fun AssignmentExpression.jSXText(block: JSXText.() -> Unit): JSXText {
    return JSXTextImpl().apply(block)
}

/**
 * AssignmentExpression#right: Expression
 * extension function for create Expression -> TemplateLiteralImpl
 */
fun AssignmentExpression.templateLiteral(block: TemplateLiteral.() -> Unit): TemplateLiteral {
    return TemplateLiteralImpl().apply(block)
}

/**
 * AssignmentExpression#right: Expression
 * extension function for create Expression -> TaggedTemplateExpressionImpl
 */
fun AssignmentExpression.taggedTemplateExpression(block: TaggedTemplateExpression.() -> Unit): TaggedTemplateExpression {
    return TaggedTemplateExpressionImpl().apply(block)
}

/**
 * AssignmentExpression#right: Expression
 * extension function for create Expression -> ArrowFunctionExpressionImpl
 */
fun AssignmentExpression.arrowFunctionExpression(block: ArrowFunctionExpression.() -> Unit): ArrowFunctionExpression {
    return ArrowFunctionExpressionImpl().apply(block)
}

/**
 * AssignmentExpression#right: Expression
 * extension function for create Expression -> ClassExpressionImpl
 */
fun AssignmentExpression.classExpression(block: ClassExpression.() -> Unit): ClassExpression {
    return ClassExpressionImpl().apply(block)
}

/**
 * AssignmentExpression#right: Expression
 * extension function for create Expression -> YieldExpressionImpl
 */
fun AssignmentExpression.yieldExpression(block: YieldExpression.() -> Unit): YieldExpression {
    return YieldExpressionImpl().apply(block)
}

/**
 * AssignmentExpression#right: Expression
 * extension function for create Expression -> MetaPropertyImpl
 */
fun AssignmentExpression.metaProperty(block: MetaProperty.() -> Unit): MetaProperty {
    return MetaPropertyImpl().apply(block)
}

/**
 * AssignmentExpression#right: Expression
 * extension function for create Expression -> AwaitExpressionImpl
 */
fun AssignmentExpression.awaitExpression(block: AwaitExpression.() -> Unit): AwaitExpression {
    return AwaitExpressionImpl().apply(block)
}

/**
 * AssignmentExpression#right: Expression
 * extension function for create Expression -> ParenthesisExpressionImpl
 */
fun AssignmentExpression.parenthesisExpression(block: ParenthesisExpression.() -> Unit): ParenthesisExpression {
    return ParenthesisExpressionImpl().apply(block)
}

/**
 * AssignmentExpression#right: Expression
 * extension function for create Expression -> JSXMemberExpressionImpl
 */
fun AssignmentExpression.jSXMemberExpression(block: JSXMemberExpression.() -> Unit): JSXMemberExpression {
    return JSXMemberExpressionImpl().apply(block)
}

/**
 * AssignmentExpression#right: Expression
 * extension function for create Expression -> JSXNamespacedNameImpl
 */
fun AssignmentExpression.jSXNamespacedName(block: JSXNamespacedName.() -> Unit): JSXNamespacedName {
    return JSXNamespacedNameImpl().apply(block)
}

/**
 * AssignmentExpression#right: Expression
 * extension function for create Expression -> JSXEmptyExpressionImpl
 */
fun AssignmentExpression.jSXEmptyExpression(block: JSXEmptyExpression.() -> Unit): JSXEmptyExpression {
    return JSXEmptyExpressionImpl().apply(block)
}

/**
 * AssignmentExpression#right: Expression
 * extension function for create Expression -> JSXElementImpl
 */
fun AssignmentExpression.jSXElement(block: JSXElement.() -> Unit): JSXElement {
    return JSXElementImpl().apply(block)
}

/**
 * AssignmentExpression#right: Expression
 * extension function for create Expression -> JSXFragmentImpl
 */
fun AssignmentExpression.jSXFragment(block: JSXFragment.() -> Unit): JSXFragment {
    return JSXFragmentImpl().apply(block)
}

/**
 * AssignmentExpression#right: Expression
 * extension function for create Expression -> TsTypeAssertionImpl
 */
fun AssignmentExpression.tsTypeAssertion(block: TsTypeAssertion.() -> Unit): TsTypeAssertion {
    return TsTypeAssertionImpl().apply(block)
}

/**
 * AssignmentExpression#right: Expression
 * extension function for create Expression -> TsConstAssertionImpl
 */
fun AssignmentExpression.tsConstAssertion(block: TsConstAssertion.() -> Unit): TsConstAssertion {
    return TsConstAssertionImpl().apply(block)
}

/**
 * AssignmentExpression#right: Expression
 * extension function for create Expression -> TsNonNullExpressionImpl
 */
fun AssignmentExpression.tsNonNullExpression(block: TsNonNullExpression.() -> Unit): TsNonNullExpression {
    return TsNonNullExpressionImpl().apply(block)
}

/**
 * AssignmentExpression#right: Expression
 * extension function for create Expression -> TsAsExpressionImpl
 */
fun AssignmentExpression.tsAsExpression(block: TsAsExpression.() -> Unit): TsAsExpression {
    return TsAsExpressionImpl().apply(block)
}

/**
 * AssignmentExpression#right: Expression
 * extension function for create Expression -> TsSatisfiesExpressionImpl
 */
fun AssignmentExpression.tsSatisfiesExpression(block: TsSatisfiesExpression.() -> Unit): TsSatisfiesExpression {
    return TsSatisfiesExpressionImpl().apply(block)
}

/**
 * AssignmentExpression#right: Expression
 * extension function for create Expression -> TsInstantiationImpl
 */
fun AssignmentExpression.tsInstantiation(block: TsInstantiation.() -> Unit): TsInstantiation {
    return TsInstantiationImpl().apply(block)
}

/**
 * AssignmentExpression#right: Expression
 * extension function for create Expression -> PrivateNameImpl
 */
fun AssignmentExpression.privateName(block: PrivateName.() -> Unit): PrivateName {
    return PrivateNameImpl().apply(block)
}

/**
 * AssignmentExpression#right: Expression
 * extension function for create Expression -> OptionalChainingExpressionImpl
 */
fun AssignmentExpression.optionalChainingExpression(block: OptionalChainingExpression.() -> Unit): OptionalChainingExpression {
    return OptionalChainingExpressionImpl().apply(block)
}

/**
 * AssignmentExpression#right: Expression
 * extension function for create Expression -> InvalidImpl
 */
fun AssignmentExpression.invalid(block: Invalid.() -> Unit): Invalid {
    return InvalidImpl().apply(block)
}

/**
 * AssignmentExpression#left: Union.U2<Expression, Pattern>
 * extension function for create Union.U2<Expression, Pattern> -> BindingIdentifierImpl
 */
fun AssignmentExpression.bindingIdentifier(block: BindingIdentifier.() -> Unit): BindingIdentifier {
    return BindingIdentifierImpl().apply(block)
}

/**
 * AssignmentExpression#left: Union.U2<Expression, Pattern>
 * extension function for create Union.U2<Expression, Pattern> -> ArrayPatternImpl
 */
fun AssignmentExpression.arrayPattern(block: ArrayPattern.() -> Unit): ArrayPattern {
    return ArrayPatternImpl().apply(block)
}

/**
 * AssignmentExpression#left: Union.U2<Expression, Pattern>
 * extension function for create Union.U2<Expression, Pattern> -> RestElementImpl
 */
fun AssignmentExpression.restElement(block: RestElement.() -> Unit): RestElement {
    return RestElementImpl().apply(block)
}

/**
 * AssignmentExpression#left: Union.U2<Expression, Pattern>
 * extension function for create Union.U2<Expression, Pattern> -> ObjectPatternImpl
 */
fun AssignmentExpression.objectPattern(block: ObjectPattern.() -> Unit): ObjectPattern {
    return ObjectPatternImpl().apply(block)
}

/**
 * AssignmentExpression#left: Union.U2<Expression, Pattern>
 * extension function for create Union.U2<Expression, Pattern> -> AssignmentPatternImpl
 */
fun AssignmentExpression.assignmentPattern(block: AssignmentPattern.() -> Unit): AssignmentPattern {
    return AssignmentPatternImpl().apply(block)
}

fun AssignmentExpression.span(block: Span.() -> Unit): Span {
    return Span().apply(block)
}
