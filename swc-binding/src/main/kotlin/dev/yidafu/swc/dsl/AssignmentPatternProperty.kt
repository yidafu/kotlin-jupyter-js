package dev.yidafu.swc.dsl

import dev.yidafu.swc.types.*

/**
 * AssignmentPatternProperty#value: Expression
 * extension function for create Expression -> IdentifierImpl
 */
fun AssignmentPatternProperty.identifier(block: Identifier.() -> Unit): Identifier {
    return IdentifierImpl().apply(block)
}

/**
 * AssignmentPatternProperty#value: Expression
 * extension function for create Expression -> ThisExpressionImpl
 */
fun AssignmentPatternProperty.thisExpression(block: ThisExpression.() -> Unit): ThisExpression {
    return ThisExpressionImpl().apply(block)
}

/**
 * AssignmentPatternProperty#value: Expression
 * extension function for create Expression -> ArrayExpressionImpl
 */
fun AssignmentPatternProperty.arrayExpression(block: ArrayExpression.() -> Unit): ArrayExpression {
    return ArrayExpressionImpl().apply(block)
}

/**
 * AssignmentPatternProperty#value: Expression
 * extension function for create Expression -> ObjectExpressionImpl
 */
fun AssignmentPatternProperty.objectExpression(block: ObjectExpression.() -> Unit): ObjectExpression {
    return ObjectExpressionImpl().apply(block)
}

/**
 * AssignmentPatternProperty#value: Expression
 * extension function for create Expression -> FunctionExpressionImpl
 */
fun AssignmentPatternProperty.functionExpression(block: FunctionExpression.() -> Unit): FunctionExpression {
    return FunctionExpressionImpl().apply(block)
}

/**
 * AssignmentPatternProperty#value: Expression
 * extension function for create Expression -> UnaryExpressionImpl
 */
fun AssignmentPatternProperty.unaryExpression(block: UnaryExpression.() -> Unit): UnaryExpression {
    return UnaryExpressionImpl().apply(block)
}

/**
 * AssignmentPatternProperty#value: Expression
 * extension function for create Expression -> UpdateExpressionImpl
 */
fun AssignmentPatternProperty.updateExpression(block: UpdateExpression.() -> Unit): UpdateExpression {
    return UpdateExpressionImpl().apply(block)
}

/**
 * AssignmentPatternProperty#value: Expression
 * extension function for create Expression -> BinaryExpressionImpl
 */
fun AssignmentPatternProperty.binaryExpression(block: BinaryExpression.() -> Unit): BinaryExpression {
    return BinaryExpressionImpl().apply(block)
}

/**
 * AssignmentPatternProperty#value: Expression
 * extension function for create Expression -> AssignmentExpressionImpl
 */
fun AssignmentPatternProperty.assignmentExpression(block: AssignmentExpression.() -> Unit): AssignmentExpression {
    return AssignmentExpressionImpl().apply(block)
}

/**
 * AssignmentPatternProperty#value: Expression
 * extension function for create Expression -> MemberExpressionImpl
 */
fun AssignmentPatternProperty.memberExpression(block: MemberExpression.() -> Unit): MemberExpression {
    return MemberExpressionImpl().apply(block)
}

/**
 * AssignmentPatternProperty#value: Expression
 * extension function for create Expression -> SuperPropExpressionImpl
 */
fun AssignmentPatternProperty.superPropExpression(block: SuperPropExpression.() -> Unit): SuperPropExpression {
    return SuperPropExpressionImpl().apply(block)
}

/**
 * AssignmentPatternProperty#value: Expression
 * extension function for create Expression -> ConditionalExpressionImpl
 */
fun AssignmentPatternProperty.conditionalExpression(block: ConditionalExpression.() -> Unit): ConditionalExpression {
    return ConditionalExpressionImpl().apply(block)
}

/**
 * AssignmentPatternProperty#value: Expression
 * extension function for create Expression -> CallExpressionImpl
 */
fun AssignmentPatternProperty.callExpression(block: CallExpression.() -> Unit): CallExpression {
    return CallExpressionImpl().apply(block)
}

/**
 * AssignmentPatternProperty#value: Expression
 * extension function for create Expression -> NewExpressionImpl
 */
fun AssignmentPatternProperty.newExpression(block: NewExpression.() -> Unit): NewExpression {
    return NewExpressionImpl().apply(block)
}

/**
 * AssignmentPatternProperty#value: Expression
 * extension function for create Expression -> SequenceExpressionImpl
 */
fun AssignmentPatternProperty.sequenceExpression(block: SequenceExpression.() -> Unit): SequenceExpression {
    return SequenceExpressionImpl().apply(block)
}

/**
 * AssignmentPatternProperty#value: Expression
 * extension function for create Expression -> StringLiteralImpl
 */
fun AssignmentPatternProperty.stringLiteral(block: StringLiteral.() -> Unit): StringLiteral {
    return StringLiteralImpl().apply(block)
}

/**
 * AssignmentPatternProperty#value: Expression
 * extension function for create Expression -> BooleanLiteralImpl
 */
fun AssignmentPatternProperty.booleanLiteral(block: BooleanLiteral.() -> Unit): BooleanLiteral {
    return BooleanLiteralImpl().apply(block)
}

/**
 * AssignmentPatternProperty#value: Expression
 * extension function for create Expression -> NullLiteralImpl
 */
fun AssignmentPatternProperty.nullLiteral(block: NullLiteral.() -> Unit): NullLiteral {
    return NullLiteralImpl().apply(block)
}

/**
 * AssignmentPatternProperty#value: Expression
 * extension function for create Expression -> NumericLiteralImpl
 */
fun AssignmentPatternProperty.numericLiteral(block: NumericLiteral.() -> Unit): NumericLiteral {
    return NumericLiteralImpl().apply(block)
}

/**
 * AssignmentPatternProperty#value: Expression
 * extension function for create Expression -> BigIntLiteralImpl
 */
fun AssignmentPatternProperty.bigIntLiteral(block: BigIntLiteral.() -> Unit): BigIntLiteral {
    return BigIntLiteralImpl().apply(block)
}

/**
 * AssignmentPatternProperty#value: Expression
 * extension function for create Expression -> RegExpLiteralImpl
 */
fun AssignmentPatternProperty.regExpLiteral(block: RegExpLiteral.() -> Unit): RegExpLiteral {
    return RegExpLiteralImpl().apply(block)
}

/**
 * AssignmentPatternProperty#value: Expression
 * extension function for create Expression -> JSXTextImpl
 */
fun AssignmentPatternProperty.jSXText(block: JSXText.() -> Unit): JSXText {
    return JSXTextImpl().apply(block)
}

/**
 * AssignmentPatternProperty#value: Expression
 * extension function for create Expression -> TemplateLiteralImpl
 */
fun AssignmentPatternProperty.templateLiteral(block: TemplateLiteral.() -> Unit): TemplateLiteral {
    return TemplateLiteralImpl().apply(block)
}

/**
 * AssignmentPatternProperty#value: Expression
 * extension function for create Expression -> TaggedTemplateExpressionImpl
 */
fun AssignmentPatternProperty.taggedTemplateExpression(block: TaggedTemplateExpression.() -> Unit): TaggedTemplateExpression {
    return TaggedTemplateExpressionImpl().apply(block)
}

/**
 * AssignmentPatternProperty#value: Expression
 * extension function for create Expression -> ArrowFunctionExpressionImpl
 */
fun AssignmentPatternProperty.arrowFunctionExpression(block: ArrowFunctionExpression.() -> Unit): ArrowFunctionExpression {
    return ArrowFunctionExpressionImpl().apply(block)
}

/**
 * AssignmentPatternProperty#value: Expression
 * extension function for create Expression -> ClassExpressionImpl
 */
fun AssignmentPatternProperty.classExpression(block: ClassExpression.() -> Unit): ClassExpression {
    return ClassExpressionImpl().apply(block)
}

/**
 * AssignmentPatternProperty#value: Expression
 * extension function for create Expression -> YieldExpressionImpl
 */
fun AssignmentPatternProperty.yieldExpression(block: YieldExpression.() -> Unit): YieldExpression {
    return YieldExpressionImpl().apply(block)
}

/**
 * AssignmentPatternProperty#value: Expression
 * extension function for create Expression -> MetaPropertyImpl
 */
fun AssignmentPatternProperty.metaProperty(block: MetaProperty.() -> Unit): MetaProperty {
    return MetaPropertyImpl().apply(block)
}

/**
 * AssignmentPatternProperty#value: Expression
 * extension function for create Expression -> AwaitExpressionImpl
 */
fun AssignmentPatternProperty.awaitExpression(block: AwaitExpression.() -> Unit): AwaitExpression {
    return AwaitExpressionImpl().apply(block)
}

/**
 * AssignmentPatternProperty#value: Expression
 * extension function for create Expression -> ParenthesisExpressionImpl
 */
fun AssignmentPatternProperty.parenthesisExpression(block: ParenthesisExpression.() -> Unit): ParenthesisExpression {
    return ParenthesisExpressionImpl().apply(block)
}

/**
 * AssignmentPatternProperty#value: Expression
 * extension function for create Expression -> JSXMemberExpressionImpl
 */
fun AssignmentPatternProperty.jSXMemberExpression(block: JSXMemberExpression.() -> Unit): JSXMemberExpression {
    return JSXMemberExpressionImpl().apply(block)
}

/**
 * AssignmentPatternProperty#value: Expression
 * extension function for create Expression -> JSXNamespacedNameImpl
 */
fun AssignmentPatternProperty.jSXNamespacedName(block: JSXNamespacedName.() -> Unit): JSXNamespacedName {
    return JSXNamespacedNameImpl().apply(block)
}

/**
 * AssignmentPatternProperty#value: Expression
 * extension function for create Expression -> JSXEmptyExpressionImpl
 */
fun AssignmentPatternProperty.jSXEmptyExpression(block: JSXEmptyExpression.() -> Unit): JSXEmptyExpression {
    return JSXEmptyExpressionImpl().apply(block)
}

/**
 * AssignmentPatternProperty#value: Expression
 * extension function for create Expression -> JSXElementImpl
 */
fun AssignmentPatternProperty.jSXElement(block: JSXElement.() -> Unit): JSXElement {
    return JSXElementImpl().apply(block)
}

/**
 * AssignmentPatternProperty#value: Expression
 * extension function for create Expression -> JSXFragmentImpl
 */
fun AssignmentPatternProperty.jSXFragment(block: JSXFragment.() -> Unit): JSXFragment {
    return JSXFragmentImpl().apply(block)
}

/**
 * AssignmentPatternProperty#value: Expression
 * extension function for create Expression -> TsTypeAssertionImpl
 */
fun AssignmentPatternProperty.tsTypeAssertion(block: TsTypeAssertion.() -> Unit): TsTypeAssertion {
    return TsTypeAssertionImpl().apply(block)
}

/**
 * AssignmentPatternProperty#value: Expression
 * extension function for create Expression -> TsConstAssertionImpl
 */
fun AssignmentPatternProperty.tsConstAssertion(block: TsConstAssertion.() -> Unit): TsConstAssertion {
    return TsConstAssertionImpl().apply(block)
}

/**
 * AssignmentPatternProperty#value: Expression
 * extension function for create Expression -> TsNonNullExpressionImpl
 */
fun AssignmentPatternProperty.tsNonNullExpression(block: TsNonNullExpression.() -> Unit): TsNonNullExpression {
    return TsNonNullExpressionImpl().apply(block)
}

/**
 * AssignmentPatternProperty#value: Expression
 * extension function for create Expression -> TsAsExpressionImpl
 */
fun AssignmentPatternProperty.tsAsExpression(block: TsAsExpression.() -> Unit): TsAsExpression {
    return TsAsExpressionImpl().apply(block)
}

/**
 * AssignmentPatternProperty#value: Expression
 * extension function for create Expression -> TsSatisfiesExpressionImpl
 */
fun AssignmentPatternProperty.tsSatisfiesExpression(block: TsSatisfiesExpression.() -> Unit): TsSatisfiesExpression {
    return TsSatisfiesExpressionImpl().apply(block)
}

/**
 * AssignmentPatternProperty#value: Expression
 * extension function for create Expression -> TsInstantiationImpl
 */
fun AssignmentPatternProperty.tsInstantiation(block: TsInstantiation.() -> Unit): TsInstantiation {
    return TsInstantiationImpl().apply(block)
}

/**
 * AssignmentPatternProperty#value: Expression
 * extension function for create Expression -> PrivateNameImpl
 */
fun AssignmentPatternProperty.privateName(block: PrivateName.() -> Unit): PrivateName {
    return PrivateNameImpl().apply(block)
}

/**
 * AssignmentPatternProperty#value: Expression
 * extension function for create Expression -> OptionalChainingExpressionImpl
 */
fun AssignmentPatternProperty.optionalChainingExpression(block: OptionalChainingExpression.() -> Unit): OptionalChainingExpression {
    return OptionalChainingExpressionImpl().apply(block)
}

/**
 * AssignmentPatternProperty#value: Expression
 * extension function for create Expression -> InvalidImpl
 */
fun AssignmentPatternProperty.invalid(block: Invalid.() -> Unit): Invalid {
    return InvalidImpl().apply(block)
}

fun AssignmentPatternProperty.span(block: Span.() -> Unit): Span {
    return Span().apply(block)
}
