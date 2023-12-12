package dev.yidafu.swc.dsl

import dev.yidafu.swc.types.*

/**
 * ExpressionStatement#expression: Expression
 * extension function for create Expression -> ThisExpressionImpl
 */
fun ExpressionStatement.thisExpression(block: ThisExpression.() -> Unit): ThisExpression {
    return ThisExpressionImpl().apply(block)
}

/**
 * ExpressionStatement#expression: Expression
 * extension function for create Expression -> ArrayExpressionImpl
 */
fun ExpressionStatement.arrayExpression(block: ArrayExpression.() -> Unit): ArrayExpression {
    return ArrayExpressionImpl().apply(block)
}

/**
 * ExpressionStatement#expression: Expression
 * extension function for create Expression -> ObjectExpressionImpl
 */
fun ExpressionStatement.objectExpression(block: ObjectExpression.() -> Unit): ObjectExpression {
    return ObjectExpressionImpl().apply(block)
}

/**
 * ExpressionStatement#expression: Expression
 * extension function for create Expression -> FunctionExpressionImpl
 */
fun ExpressionStatement.functionExpression(block: FunctionExpression.() -> Unit): FunctionExpression {
    return FunctionExpressionImpl().apply(block)
}

/**
 * ExpressionStatement#expression: Expression
 * extension function for create Expression -> UnaryExpressionImpl
 */
fun ExpressionStatement.unaryExpression(block: UnaryExpression.() -> Unit): UnaryExpression {
    return UnaryExpressionImpl().apply(block)
}

/**
 * ExpressionStatement#expression: Expression
 * extension function for create Expression -> UpdateExpressionImpl
 */
fun ExpressionStatement.updateExpression(block: UpdateExpression.() -> Unit): UpdateExpression {
    return UpdateExpressionImpl().apply(block)
}

/**
 * ExpressionStatement#expression: Expression
 * extension function for create Expression -> BinaryExpressionImpl
 */
fun ExpressionStatement.binaryExpression(block: BinaryExpression.() -> Unit): BinaryExpression {
    return BinaryExpressionImpl().apply(block)
}

/**
 * ExpressionStatement#expression: Expression
 * extension function for create Expression -> AssignmentExpressionImpl
 */
fun ExpressionStatement.assignmentExpression(block: AssignmentExpression.() -> Unit): AssignmentExpression {
    return AssignmentExpressionImpl().apply(block)
}

/**
 * ExpressionStatement#expression: Expression
 * extension function for create Expression -> MemberExpressionImpl
 */
fun ExpressionStatement.memberExpression(block: MemberExpression.() -> Unit): MemberExpression {
    return MemberExpressionImpl().apply(block)
}

/**
 * ExpressionStatement#expression: Expression
 * extension function for create Expression -> SuperPropExpressionImpl
 */
fun ExpressionStatement.superPropExpression(block: SuperPropExpression.() -> Unit): SuperPropExpression {
    return SuperPropExpressionImpl().apply(block)
}

/**
 * ExpressionStatement#expression: Expression
 * extension function for create Expression -> ConditionalExpressionImpl
 */
fun ExpressionStatement.conditionalExpression(block: ConditionalExpression.() -> Unit): ConditionalExpression {
    return ConditionalExpressionImpl().apply(block)
}

/**
 * ExpressionStatement#expression: Expression
 * extension function for create Expression -> CallExpressionImpl
 */
fun ExpressionStatement.callExpression(block: CallExpression.() -> Unit): CallExpression {
    return CallExpressionImpl().apply(block)
}

/**
 * ExpressionStatement#expression: Expression
 * extension function for create Expression -> NewExpressionImpl
 */
fun ExpressionStatement.newExpression(block: NewExpression.() -> Unit): NewExpression {
    return NewExpressionImpl().apply(block)
}

/**
 * ExpressionStatement#expression: Expression
 * extension function for create Expression -> SequenceExpressionImpl
 */
fun ExpressionStatement.sequenceExpression(block: SequenceExpression.() -> Unit): SequenceExpression {
    return SequenceExpressionImpl().apply(block)
}

/**
 * ExpressionStatement#expression: Expression
 * extension function for create Expression -> IdentifierImpl
 */
fun ExpressionStatement.identifier(block: Identifier.() -> Unit): Identifier {
    return IdentifierImpl().apply(block)
}

/**
 * ExpressionStatement#expression: Expression
 * extension function for create Expression -> StringLiteralImpl
 */
fun ExpressionStatement.stringLiteral(block: StringLiteral.() -> Unit): StringLiteral {
    return StringLiteralImpl().apply(block)
}

/**
 * ExpressionStatement#expression: Expression
 * extension function for create Expression -> BooleanLiteralImpl
 */
fun ExpressionStatement.booleanLiteral(block: BooleanLiteral.() -> Unit): BooleanLiteral {
    return BooleanLiteralImpl().apply(block)
}

/**
 * ExpressionStatement#expression: Expression
 * extension function for create Expression -> NullLiteralImpl
 */
fun ExpressionStatement.nullLiteral(block: NullLiteral.() -> Unit): NullLiteral {
    return NullLiteralImpl().apply(block)
}

/**
 * ExpressionStatement#expression: Expression
 * extension function for create Expression -> NumericLiteralImpl
 */
fun ExpressionStatement.numericLiteral(block: NumericLiteral.() -> Unit): NumericLiteral {
    return NumericLiteralImpl().apply(block)
}

/**
 * ExpressionStatement#expression: Expression
 * extension function for create Expression -> BigIntLiteralImpl
 */
fun ExpressionStatement.bigIntLiteral(block: BigIntLiteral.() -> Unit): BigIntLiteral {
    return BigIntLiteralImpl().apply(block)
}

/**
 * ExpressionStatement#expression: Expression
 * extension function for create Expression -> RegExpLiteralImpl
 */
fun ExpressionStatement.regExpLiteral(block: RegExpLiteral.() -> Unit): RegExpLiteral {
    return RegExpLiteralImpl().apply(block)
}

/**
 * ExpressionStatement#expression: Expression
 * extension function for create Expression -> JSXTextImpl
 */
fun ExpressionStatement.jSXText(block: JSXText.() -> Unit): JSXText {
    return JSXTextImpl().apply(block)
}

/**
 * ExpressionStatement#expression: Expression
 * extension function for create Expression -> TemplateLiteralImpl
 */
fun ExpressionStatement.templateLiteral(block: TemplateLiteral.() -> Unit): TemplateLiteral {
    return TemplateLiteralImpl().apply(block)
}

/**
 * ExpressionStatement#expression: Expression
 * extension function for create Expression -> TaggedTemplateExpressionImpl
 */
fun ExpressionStatement.taggedTemplateExpression(block: TaggedTemplateExpression.() -> Unit): TaggedTemplateExpression {
    return TaggedTemplateExpressionImpl().apply(block)
}

/**
 * ExpressionStatement#expression: Expression
 * extension function for create Expression -> ArrowFunctionExpressionImpl
 */
fun ExpressionStatement.arrowFunctionExpression(block: ArrowFunctionExpression.() -> Unit): ArrowFunctionExpression {
    return ArrowFunctionExpressionImpl().apply(block)
}

/**
 * ExpressionStatement#expression: Expression
 * extension function for create Expression -> ClassExpressionImpl
 */
fun ExpressionStatement.classExpression(block: ClassExpression.() -> Unit): ClassExpression {
    return ClassExpressionImpl().apply(block)
}

/**
 * ExpressionStatement#expression: Expression
 * extension function for create Expression -> YieldExpressionImpl
 */
fun ExpressionStatement.yieldExpression(block: YieldExpression.() -> Unit): YieldExpression {
    return YieldExpressionImpl().apply(block)
}

/**
 * ExpressionStatement#expression: Expression
 * extension function for create Expression -> MetaPropertyImpl
 */
fun ExpressionStatement.metaProperty(block: MetaProperty.() -> Unit): MetaProperty {
    return MetaPropertyImpl().apply(block)
}

/**
 * ExpressionStatement#expression: Expression
 * extension function for create Expression -> AwaitExpressionImpl
 */
fun ExpressionStatement.awaitExpression(block: AwaitExpression.() -> Unit): AwaitExpression {
    return AwaitExpressionImpl().apply(block)
}

/**
 * ExpressionStatement#expression: Expression
 * extension function for create Expression -> ParenthesisExpressionImpl
 */
fun ExpressionStatement.parenthesisExpression(block: ParenthesisExpression.() -> Unit): ParenthesisExpression {
    return ParenthesisExpressionImpl().apply(block)
}

/**
 * ExpressionStatement#expression: Expression
 * extension function for create Expression -> JSXMemberExpressionImpl
 */
fun ExpressionStatement.jSXMemberExpression(block: JSXMemberExpression.() -> Unit): JSXMemberExpression {
    return JSXMemberExpressionImpl().apply(block)
}

/**
 * ExpressionStatement#expression: Expression
 * extension function for create Expression -> JSXNamespacedNameImpl
 */
fun ExpressionStatement.jSXNamespacedName(block: JSXNamespacedName.() -> Unit): JSXNamespacedName {
    return JSXNamespacedNameImpl().apply(block)
}

/**
 * ExpressionStatement#expression: Expression
 * extension function for create Expression -> JSXEmptyExpressionImpl
 */
fun ExpressionStatement.jSXEmptyExpression(block: JSXEmptyExpression.() -> Unit): JSXEmptyExpression {
    return JSXEmptyExpressionImpl().apply(block)
}

/**
 * ExpressionStatement#expression: Expression
 * extension function for create Expression -> JSXElementImpl
 */
fun ExpressionStatement.jSXElement(block: JSXElement.() -> Unit): JSXElement {
    return JSXElementImpl().apply(block)
}

/**
 * ExpressionStatement#expression: Expression
 * extension function for create Expression -> JSXFragmentImpl
 */
fun ExpressionStatement.jSXFragment(block: JSXFragment.() -> Unit): JSXFragment {
    return JSXFragmentImpl().apply(block)
}

/**
 * ExpressionStatement#expression: Expression
 * extension function for create Expression -> TsTypeAssertionImpl
 */
fun ExpressionStatement.tsTypeAssertion(block: TsTypeAssertion.() -> Unit): TsTypeAssertion {
    return TsTypeAssertionImpl().apply(block)
}

/**
 * ExpressionStatement#expression: Expression
 * extension function for create Expression -> TsConstAssertionImpl
 */
fun ExpressionStatement.tsConstAssertion(block: TsConstAssertion.() -> Unit): TsConstAssertion {
    return TsConstAssertionImpl().apply(block)
}

/**
 * ExpressionStatement#expression: Expression
 * extension function for create Expression -> TsNonNullExpressionImpl
 */
fun ExpressionStatement.tsNonNullExpression(block: TsNonNullExpression.() -> Unit): TsNonNullExpression {
    return TsNonNullExpressionImpl().apply(block)
}

/**
 * ExpressionStatement#expression: Expression
 * extension function for create Expression -> TsAsExpressionImpl
 */
fun ExpressionStatement.tsAsExpression(block: TsAsExpression.() -> Unit): TsAsExpression {
    return TsAsExpressionImpl().apply(block)
}

/**
 * ExpressionStatement#expression: Expression
 * extension function for create Expression -> TsSatisfiesExpressionImpl
 */
fun ExpressionStatement.tsSatisfiesExpression(block: TsSatisfiesExpression.() -> Unit): TsSatisfiesExpression {
    return TsSatisfiesExpressionImpl().apply(block)
}

/**
 * ExpressionStatement#expression: Expression
 * extension function for create Expression -> TsInstantiationImpl
 */
fun ExpressionStatement.tsInstantiation(block: TsInstantiation.() -> Unit): TsInstantiation {
    return TsInstantiationImpl().apply(block)
}

/**
 * ExpressionStatement#expression: Expression
 * extension function for create Expression -> PrivateNameImpl
 */
fun ExpressionStatement.privateName(block: PrivateName.() -> Unit): PrivateName {
    return PrivateNameImpl().apply(block)
}

/**
 * ExpressionStatement#expression: Expression
 * extension function for create Expression -> OptionalChainingExpressionImpl
 */
fun ExpressionStatement.optionalChainingExpression(block: OptionalChainingExpression.() -> Unit): OptionalChainingExpression {
    return OptionalChainingExpressionImpl().apply(block)
}

/**
 * ExpressionStatement#expression: Expression
 * extension function for create Expression -> InvalidImpl
 */
fun ExpressionStatement.invalid(block: Invalid.() -> Unit): Invalid {
    return InvalidImpl().apply(block)
}

fun ExpressionStatement.span(block: Span.() -> Unit): Span {
    return Span().apply(block)
}
