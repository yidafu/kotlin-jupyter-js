package dev.yidafu.swc.dsl

import dev.yidafu.swc.types.*

/**
 * SwitchStatement#discriminant: Expression
 * extension function for create Expression -> ThisExpressionImpl
 */
fun SwitchStatement.thisExpression(block: ThisExpression.() -> Unit): ThisExpression {
    return ThisExpressionImpl().apply(block)
}

/**
 * SwitchStatement#discriminant: Expression
 * extension function for create Expression -> ArrayExpressionImpl
 */
fun SwitchStatement.arrayExpression(block: ArrayExpression.() -> Unit): ArrayExpression {
    return ArrayExpressionImpl().apply(block)
}

/**
 * SwitchStatement#discriminant: Expression
 * extension function for create Expression -> ObjectExpressionImpl
 */
fun SwitchStatement.objectExpression(block: ObjectExpression.() -> Unit): ObjectExpression {
    return ObjectExpressionImpl().apply(block)
}

/**
 * SwitchStatement#discriminant: Expression
 * extension function for create Expression -> FunctionExpressionImpl
 */
fun SwitchStatement.functionExpression(block: FunctionExpression.() -> Unit): FunctionExpression {
    return FunctionExpressionImpl().apply(block)
}

/**
 * SwitchStatement#discriminant: Expression
 * extension function for create Expression -> UnaryExpressionImpl
 */
fun SwitchStatement.unaryExpression(block: UnaryExpression.() -> Unit): UnaryExpression {
    return UnaryExpressionImpl().apply(block)
}

/**
 * SwitchStatement#discriminant: Expression
 * extension function for create Expression -> UpdateExpressionImpl
 */
fun SwitchStatement.updateExpression(block: UpdateExpression.() -> Unit): UpdateExpression {
    return UpdateExpressionImpl().apply(block)
}

/**
 * SwitchStatement#discriminant: Expression
 * extension function for create Expression -> BinaryExpressionImpl
 */
fun SwitchStatement.binaryExpression(block: BinaryExpression.() -> Unit): BinaryExpression {
    return BinaryExpressionImpl().apply(block)
}

/**
 * SwitchStatement#discriminant: Expression
 * extension function for create Expression -> AssignmentExpressionImpl
 */
fun SwitchStatement.assignmentExpression(block: AssignmentExpression.() -> Unit): AssignmentExpression {
    return AssignmentExpressionImpl().apply(block)
}

/**
 * SwitchStatement#discriminant: Expression
 * extension function for create Expression -> MemberExpressionImpl
 */
fun SwitchStatement.memberExpression(block: MemberExpression.() -> Unit): MemberExpression {
    return MemberExpressionImpl().apply(block)
}

/**
 * SwitchStatement#discriminant: Expression
 * extension function for create Expression -> SuperPropExpressionImpl
 */
fun SwitchStatement.superPropExpression(block: SuperPropExpression.() -> Unit): SuperPropExpression {
    return SuperPropExpressionImpl().apply(block)
}

/**
 * SwitchStatement#discriminant: Expression
 * extension function for create Expression -> ConditionalExpressionImpl
 */
fun SwitchStatement.conditionalExpression(block: ConditionalExpression.() -> Unit): ConditionalExpression {
    return ConditionalExpressionImpl().apply(block)
}

/**
 * SwitchStatement#discriminant: Expression
 * extension function for create Expression -> CallExpressionImpl
 */
fun SwitchStatement.callExpression(block: CallExpression.() -> Unit): CallExpression {
    return CallExpressionImpl().apply(block)
}

/**
 * SwitchStatement#discriminant: Expression
 * extension function for create Expression -> NewExpressionImpl
 */
fun SwitchStatement.newExpression(block: NewExpression.() -> Unit): NewExpression {
    return NewExpressionImpl().apply(block)
}

/**
 * SwitchStatement#discriminant: Expression
 * extension function for create Expression -> SequenceExpressionImpl
 */
fun SwitchStatement.sequenceExpression(block: SequenceExpression.() -> Unit): SequenceExpression {
    return SequenceExpressionImpl().apply(block)
}

/**
 * SwitchStatement#discriminant: Expression
 * extension function for create Expression -> IdentifierImpl
 */
fun SwitchStatement.identifier(block: Identifier.() -> Unit): Identifier {
    return IdentifierImpl().apply(block)
}

/**
 * SwitchStatement#discriminant: Expression
 * extension function for create Expression -> StringLiteralImpl
 */
fun SwitchStatement.stringLiteral(block: StringLiteral.() -> Unit): StringLiteral {
    return StringLiteralImpl().apply(block)
}

/**
 * SwitchStatement#discriminant: Expression
 * extension function for create Expression -> BooleanLiteralImpl
 */
fun SwitchStatement.booleanLiteral(block: BooleanLiteral.() -> Unit): BooleanLiteral {
    return BooleanLiteralImpl().apply(block)
}

/**
 * SwitchStatement#discriminant: Expression
 * extension function for create Expression -> NullLiteralImpl
 */
fun SwitchStatement.nullLiteral(block: NullLiteral.() -> Unit): NullLiteral {
    return NullLiteralImpl().apply(block)
}

/**
 * SwitchStatement#discriminant: Expression
 * extension function for create Expression -> NumericLiteralImpl
 */
fun SwitchStatement.numericLiteral(block: NumericLiteral.() -> Unit): NumericLiteral {
    return NumericLiteralImpl().apply(block)
}

/**
 * SwitchStatement#discriminant: Expression
 * extension function for create Expression -> BigIntLiteralImpl
 */
fun SwitchStatement.bigIntLiteral(block: BigIntLiteral.() -> Unit): BigIntLiteral {
    return BigIntLiteralImpl().apply(block)
}

/**
 * SwitchStatement#discriminant: Expression
 * extension function for create Expression -> RegExpLiteralImpl
 */
fun SwitchStatement.regExpLiteral(block: RegExpLiteral.() -> Unit): RegExpLiteral {
    return RegExpLiteralImpl().apply(block)
}

/**
 * SwitchStatement#discriminant: Expression
 * extension function for create Expression -> JSXTextImpl
 */
fun SwitchStatement.jSXText(block: JSXText.() -> Unit): JSXText {
    return JSXTextImpl().apply(block)
}

/**
 * SwitchStatement#discriminant: Expression
 * extension function for create Expression -> TemplateLiteralImpl
 */
fun SwitchStatement.templateLiteral(block: TemplateLiteral.() -> Unit): TemplateLiteral {
    return TemplateLiteralImpl().apply(block)
}

/**
 * SwitchStatement#discriminant: Expression
 * extension function for create Expression -> TaggedTemplateExpressionImpl
 */
fun SwitchStatement.taggedTemplateExpression(block: TaggedTemplateExpression.() -> Unit): TaggedTemplateExpression {
    return TaggedTemplateExpressionImpl().apply(block)
}

/**
 * SwitchStatement#discriminant: Expression
 * extension function for create Expression -> ArrowFunctionExpressionImpl
 */
fun SwitchStatement.arrowFunctionExpression(block: ArrowFunctionExpression.() -> Unit): ArrowFunctionExpression {
    return ArrowFunctionExpressionImpl().apply(block)
}

/**
 * SwitchStatement#discriminant: Expression
 * extension function for create Expression -> ClassExpressionImpl
 */
fun SwitchStatement.classExpression(block: ClassExpression.() -> Unit): ClassExpression {
    return ClassExpressionImpl().apply(block)
}

/**
 * SwitchStatement#discriminant: Expression
 * extension function for create Expression -> YieldExpressionImpl
 */
fun SwitchStatement.yieldExpression(block: YieldExpression.() -> Unit): YieldExpression {
    return YieldExpressionImpl().apply(block)
}

/**
 * SwitchStatement#discriminant: Expression
 * extension function for create Expression -> MetaPropertyImpl
 */
fun SwitchStatement.metaProperty(block: MetaProperty.() -> Unit): MetaProperty {
    return MetaPropertyImpl().apply(block)
}

/**
 * SwitchStatement#discriminant: Expression
 * extension function for create Expression -> AwaitExpressionImpl
 */
fun SwitchStatement.awaitExpression(block: AwaitExpression.() -> Unit): AwaitExpression {
    return AwaitExpressionImpl().apply(block)
}

/**
 * SwitchStatement#discriminant: Expression
 * extension function for create Expression -> ParenthesisExpressionImpl
 */
fun SwitchStatement.parenthesisExpression(block: ParenthesisExpression.() -> Unit): ParenthesisExpression {
    return ParenthesisExpressionImpl().apply(block)
}

/**
 * SwitchStatement#discriminant: Expression
 * extension function for create Expression -> JSXMemberExpressionImpl
 */
fun SwitchStatement.jSXMemberExpression(block: JSXMemberExpression.() -> Unit): JSXMemberExpression {
    return JSXMemberExpressionImpl().apply(block)
}

/**
 * SwitchStatement#discriminant: Expression
 * extension function for create Expression -> JSXNamespacedNameImpl
 */
fun SwitchStatement.jSXNamespacedName(block: JSXNamespacedName.() -> Unit): JSXNamespacedName {
    return JSXNamespacedNameImpl().apply(block)
}

/**
 * SwitchStatement#discriminant: Expression
 * extension function for create Expression -> JSXEmptyExpressionImpl
 */
fun SwitchStatement.jSXEmptyExpression(block: JSXEmptyExpression.() -> Unit): JSXEmptyExpression {
    return JSXEmptyExpressionImpl().apply(block)
}

/**
 * SwitchStatement#discriminant: Expression
 * extension function for create Expression -> JSXElementImpl
 */
fun SwitchStatement.jSXElement(block: JSXElement.() -> Unit): JSXElement {
    return JSXElementImpl().apply(block)
}

/**
 * SwitchStatement#discriminant: Expression
 * extension function for create Expression -> JSXFragmentImpl
 */
fun SwitchStatement.jSXFragment(block: JSXFragment.() -> Unit): JSXFragment {
    return JSXFragmentImpl().apply(block)
}

/**
 * SwitchStatement#discriminant: Expression
 * extension function for create Expression -> TsTypeAssertionImpl
 */
fun SwitchStatement.tsTypeAssertion(block: TsTypeAssertion.() -> Unit): TsTypeAssertion {
    return TsTypeAssertionImpl().apply(block)
}

/**
 * SwitchStatement#discriminant: Expression
 * extension function for create Expression -> TsConstAssertionImpl
 */
fun SwitchStatement.tsConstAssertion(block: TsConstAssertion.() -> Unit): TsConstAssertion {
    return TsConstAssertionImpl().apply(block)
}

/**
 * SwitchStatement#discriminant: Expression
 * extension function for create Expression -> TsNonNullExpressionImpl
 */
fun SwitchStatement.tsNonNullExpression(block: TsNonNullExpression.() -> Unit): TsNonNullExpression {
    return TsNonNullExpressionImpl().apply(block)
}

/**
 * SwitchStatement#discriminant: Expression
 * extension function for create Expression -> TsAsExpressionImpl
 */
fun SwitchStatement.tsAsExpression(block: TsAsExpression.() -> Unit): TsAsExpression {
    return TsAsExpressionImpl().apply(block)
}

/**
 * SwitchStatement#discriminant: Expression
 * extension function for create Expression -> TsSatisfiesExpressionImpl
 */
fun SwitchStatement.tsSatisfiesExpression(block: TsSatisfiesExpression.() -> Unit): TsSatisfiesExpression {
    return TsSatisfiesExpressionImpl().apply(block)
}

/**
 * SwitchStatement#discriminant: Expression
 * extension function for create Expression -> TsInstantiationImpl
 */
fun SwitchStatement.tsInstantiation(block: TsInstantiation.() -> Unit): TsInstantiation {
    return TsInstantiationImpl().apply(block)
}

/**
 * SwitchStatement#discriminant: Expression
 * extension function for create Expression -> PrivateNameImpl
 */
fun SwitchStatement.privateName(block: PrivateName.() -> Unit): PrivateName {
    return PrivateNameImpl().apply(block)
}

/**
 * SwitchStatement#discriminant: Expression
 * extension function for create Expression -> OptionalChainingExpressionImpl
 */
fun SwitchStatement.optionalChainingExpression(block: OptionalChainingExpression.() -> Unit): OptionalChainingExpression {
    return OptionalChainingExpressionImpl().apply(block)
}

/**
 * SwitchStatement#discriminant: Expression
 * extension function for create Expression -> InvalidImpl
 */
fun SwitchStatement.invalid(block: Invalid.() -> Unit): Invalid {
    return InvalidImpl().apply(block)
}

/**
 * SwitchStatement#cases: Array<SwitchCase>
 * extension function for create Array<SwitchCase> -> SwitchCaseImpl
 */
fun SwitchStatement.switchCase(block: SwitchCase.() -> Unit): SwitchCase {
    return SwitchCaseImpl().apply(block)
}

fun SwitchStatement.span(block: Span.() -> Unit): Span {
    return Span().apply(block)
}
