package dev.yidafu.swc.dsl

import dev.yidafu.swc.types.*

/**
 * UpdateExpression#argument: Expression
 * extension function for create Expression -> ThisExpressionImpl
 */
fun UpdateExpression.thisExpression(block: ThisExpression.() -> Unit): ThisExpression {
    return ThisExpressionImpl().apply(block)
}

/**
 * UpdateExpression#argument: Expression
 * extension function for create Expression -> ArrayExpressionImpl
 */
fun UpdateExpression.arrayExpression(block: ArrayExpression.() -> Unit): ArrayExpression {
    return ArrayExpressionImpl().apply(block)
}

/**
 * UpdateExpression#argument: Expression
 * extension function for create Expression -> ObjectExpressionImpl
 */
fun UpdateExpression.objectExpression(block: ObjectExpression.() -> Unit): ObjectExpression {
    return ObjectExpressionImpl().apply(block)
}

/**
 * UpdateExpression#argument: Expression
 * extension function for create Expression -> FunctionExpressionImpl
 */
fun UpdateExpression.functionExpression(block: FunctionExpression.() -> Unit): FunctionExpression {
    return FunctionExpressionImpl().apply(block)
}

/**
 * UpdateExpression#argument: Expression
 * extension function for create Expression -> UnaryExpressionImpl
 */
fun UpdateExpression.unaryExpression(block: UnaryExpression.() -> Unit): UnaryExpression {
    return UnaryExpressionImpl().apply(block)
}

/**
 * UpdateExpression#argument: Expression
 * extension function for create Expression -> BinaryExpressionImpl
 */
fun UpdateExpression.binaryExpression(block: BinaryExpression.() -> Unit): BinaryExpression {
    return BinaryExpressionImpl().apply(block)
}

/**
 * UpdateExpression#argument: Expression
 * extension function for create Expression -> AssignmentExpressionImpl
 */
fun UpdateExpression.assignmentExpression(block: AssignmentExpression.() -> Unit): AssignmentExpression {
    return AssignmentExpressionImpl().apply(block)
}

/**
 * UpdateExpression#argument: Expression
 * extension function for create Expression -> MemberExpressionImpl
 */
fun UpdateExpression.memberExpression(block: MemberExpression.() -> Unit): MemberExpression {
    return MemberExpressionImpl().apply(block)
}

/**
 * UpdateExpression#argument: Expression
 * extension function for create Expression -> SuperPropExpressionImpl
 */
fun UpdateExpression.superPropExpression(block: SuperPropExpression.() -> Unit): SuperPropExpression {
    return SuperPropExpressionImpl().apply(block)
}

/**
 * UpdateExpression#argument: Expression
 * extension function for create Expression -> ConditionalExpressionImpl
 */
fun UpdateExpression.conditionalExpression(block: ConditionalExpression.() -> Unit): ConditionalExpression {
    return ConditionalExpressionImpl().apply(block)
}

/**
 * UpdateExpression#argument: Expression
 * extension function for create Expression -> CallExpressionImpl
 */
fun UpdateExpression.callExpression(block: CallExpression.() -> Unit): CallExpression {
    return CallExpressionImpl().apply(block)
}

/**
 * UpdateExpression#argument: Expression
 * extension function for create Expression -> NewExpressionImpl
 */
fun UpdateExpression.newExpression(block: NewExpression.() -> Unit): NewExpression {
    return NewExpressionImpl().apply(block)
}

/**
 * UpdateExpression#argument: Expression
 * extension function for create Expression -> SequenceExpressionImpl
 */
fun UpdateExpression.sequenceExpression(block: SequenceExpression.() -> Unit): SequenceExpression {
    return SequenceExpressionImpl().apply(block)
}

/**
 * UpdateExpression#argument: Expression
 * extension function for create Expression -> IdentifierImpl
 */
fun UpdateExpression.identifier(block: Identifier.() -> Unit): Identifier {
    return IdentifierImpl().apply(block)
}

/**
 * UpdateExpression#argument: Expression
 * extension function for create Expression -> StringLiteralImpl
 */
fun UpdateExpression.stringLiteral(block: StringLiteral.() -> Unit): StringLiteral {
    return StringLiteralImpl().apply(block)
}

/**
 * UpdateExpression#argument: Expression
 * extension function for create Expression -> BooleanLiteralImpl
 */
fun UpdateExpression.booleanLiteral(block: BooleanLiteral.() -> Unit): BooleanLiteral {
    return BooleanLiteralImpl().apply(block)
}

/**
 * UpdateExpression#argument: Expression
 * extension function for create Expression -> NullLiteralImpl
 */
fun UpdateExpression.nullLiteral(block: NullLiteral.() -> Unit): NullLiteral {
    return NullLiteralImpl().apply(block)
}

/**
 * UpdateExpression#argument: Expression
 * extension function for create Expression -> NumericLiteralImpl
 */
fun UpdateExpression.numericLiteral(block: NumericLiteral.() -> Unit): NumericLiteral {
    return NumericLiteralImpl().apply(block)
}

/**
 * UpdateExpression#argument: Expression
 * extension function for create Expression -> BigIntLiteralImpl
 */
fun UpdateExpression.bigIntLiteral(block: BigIntLiteral.() -> Unit): BigIntLiteral {
    return BigIntLiteralImpl().apply(block)
}

/**
 * UpdateExpression#argument: Expression
 * extension function for create Expression -> RegExpLiteralImpl
 */
fun UpdateExpression.regExpLiteral(block: RegExpLiteral.() -> Unit): RegExpLiteral {
    return RegExpLiteralImpl().apply(block)
}

/**
 * UpdateExpression#argument: Expression
 * extension function for create Expression -> JSXTextImpl
 */
fun UpdateExpression.jSXText(block: JSXText.() -> Unit): JSXText {
    return JSXTextImpl().apply(block)
}

/**
 * UpdateExpression#argument: Expression
 * extension function for create Expression -> TemplateLiteralImpl
 */
fun UpdateExpression.templateLiteral(block: TemplateLiteral.() -> Unit): TemplateLiteral {
    return TemplateLiteralImpl().apply(block)
}

/**
 * UpdateExpression#argument: Expression
 * extension function for create Expression -> TaggedTemplateExpressionImpl
 */
fun UpdateExpression.taggedTemplateExpression(block: TaggedTemplateExpression.() -> Unit): TaggedTemplateExpression {
    return TaggedTemplateExpressionImpl().apply(block)
}

/**
 * UpdateExpression#argument: Expression
 * extension function for create Expression -> ArrowFunctionExpressionImpl
 */
fun UpdateExpression.arrowFunctionExpression(block: ArrowFunctionExpression.() -> Unit): ArrowFunctionExpression {
    return ArrowFunctionExpressionImpl().apply(block)
}

/**
 * UpdateExpression#argument: Expression
 * extension function for create Expression -> ClassExpressionImpl
 */
fun UpdateExpression.classExpression(block: ClassExpression.() -> Unit): ClassExpression {
    return ClassExpressionImpl().apply(block)
}

/**
 * UpdateExpression#argument: Expression
 * extension function for create Expression -> YieldExpressionImpl
 */
fun UpdateExpression.yieldExpression(block: YieldExpression.() -> Unit): YieldExpression {
    return YieldExpressionImpl().apply(block)
}

/**
 * UpdateExpression#argument: Expression
 * extension function for create Expression -> MetaPropertyImpl
 */
fun UpdateExpression.metaProperty(block: MetaProperty.() -> Unit): MetaProperty {
    return MetaPropertyImpl().apply(block)
}

/**
 * UpdateExpression#argument: Expression
 * extension function for create Expression -> AwaitExpressionImpl
 */
fun UpdateExpression.awaitExpression(block: AwaitExpression.() -> Unit): AwaitExpression {
    return AwaitExpressionImpl().apply(block)
}

/**
 * UpdateExpression#argument: Expression
 * extension function for create Expression -> ParenthesisExpressionImpl
 */
fun UpdateExpression.parenthesisExpression(block: ParenthesisExpression.() -> Unit): ParenthesisExpression {
    return ParenthesisExpressionImpl().apply(block)
}

/**
 * UpdateExpression#argument: Expression
 * extension function for create Expression -> JSXMemberExpressionImpl
 */
fun UpdateExpression.jSXMemberExpression(block: JSXMemberExpression.() -> Unit): JSXMemberExpression {
    return JSXMemberExpressionImpl().apply(block)
}

/**
 * UpdateExpression#argument: Expression
 * extension function for create Expression -> JSXNamespacedNameImpl
 */
fun UpdateExpression.jSXNamespacedName(block: JSXNamespacedName.() -> Unit): JSXNamespacedName {
    return JSXNamespacedNameImpl().apply(block)
}

/**
 * UpdateExpression#argument: Expression
 * extension function for create Expression -> JSXEmptyExpressionImpl
 */
fun UpdateExpression.jSXEmptyExpression(block: JSXEmptyExpression.() -> Unit): JSXEmptyExpression {
    return JSXEmptyExpressionImpl().apply(block)
}

/**
 * UpdateExpression#argument: Expression
 * extension function for create Expression -> JSXElementImpl
 */
fun UpdateExpression.jSXElement(block: JSXElement.() -> Unit): JSXElement {
    return JSXElementImpl().apply(block)
}

/**
 * UpdateExpression#argument: Expression
 * extension function for create Expression -> JSXFragmentImpl
 */
fun UpdateExpression.jSXFragment(block: JSXFragment.() -> Unit): JSXFragment {
    return JSXFragmentImpl().apply(block)
}

/**
 * UpdateExpression#argument: Expression
 * extension function for create Expression -> TsTypeAssertionImpl
 */
fun UpdateExpression.tsTypeAssertion(block: TsTypeAssertion.() -> Unit): TsTypeAssertion {
    return TsTypeAssertionImpl().apply(block)
}

/**
 * UpdateExpression#argument: Expression
 * extension function for create Expression -> TsConstAssertionImpl
 */
fun UpdateExpression.tsConstAssertion(block: TsConstAssertion.() -> Unit): TsConstAssertion {
    return TsConstAssertionImpl().apply(block)
}

/**
 * UpdateExpression#argument: Expression
 * extension function for create Expression -> TsNonNullExpressionImpl
 */
fun UpdateExpression.tsNonNullExpression(block: TsNonNullExpression.() -> Unit): TsNonNullExpression {
    return TsNonNullExpressionImpl().apply(block)
}

/**
 * UpdateExpression#argument: Expression
 * extension function for create Expression -> TsAsExpressionImpl
 */
fun UpdateExpression.tsAsExpression(block: TsAsExpression.() -> Unit): TsAsExpression {
    return TsAsExpressionImpl().apply(block)
}

/**
 * UpdateExpression#argument: Expression
 * extension function for create Expression -> TsSatisfiesExpressionImpl
 */
fun UpdateExpression.tsSatisfiesExpression(block: TsSatisfiesExpression.() -> Unit): TsSatisfiesExpression {
    return TsSatisfiesExpressionImpl().apply(block)
}

/**
 * UpdateExpression#argument: Expression
 * extension function for create Expression -> TsInstantiationImpl
 */
fun UpdateExpression.tsInstantiation(block: TsInstantiation.() -> Unit): TsInstantiation {
    return TsInstantiationImpl().apply(block)
}

/**
 * UpdateExpression#argument: Expression
 * extension function for create Expression -> PrivateNameImpl
 */
fun UpdateExpression.privateName(block: PrivateName.() -> Unit): PrivateName {
    return PrivateNameImpl().apply(block)
}

/**
 * UpdateExpression#argument: Expression
 * extension function for create Expression -> OptionalChainingExpressionImpl
 */
fun UpdateExpression.optionalChainingExpression(block: OptionalChainingExpression.() -> Unit): OptionalChainingExpression {
    return OptionalChainingExpressionImpl().apply(block)
}

/**
 * UpdateExpression#argument: Expression
 * extension function for create Expression -> InvalidImpl
 */
fun UpdateExpression.invalid(block: Invalid.() -> Unit): Invalid {
    return InvalidImpl().apply(block)
}

fun UpdateExpression.span(block: Span.() -> Unit): Span {
    return Span().apply(block)
}
