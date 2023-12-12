package dev.yidafu.swc.dsl

import dev.yidafu.swc.types.*

/**
 * TsExportAssignment#expression: Expression
 * extension function for create Expression -> ThisExpressionImpl
 */
fun TsExportAssignment.thisExpression(block: ThisExpression.() -> Unit): ThisExpression {
    return ThisExpressionImpl().apply(block)
}

/**
 * TsExportAssignment#expression: Expression
 * extension function for create Expression -> ArrayExpressionImpl
 */
fun TsExportAssignment.arrayExpression(block: ArrayExpression.() -> Unit): ArrayExpression {
    return ArrayExpressionImpl().apply(block)
}

/**
 * TsExportAssignment#expression: Expression
 * extension function for create Expression -> ObjectExpressionImpl
 */
fun TsExportAssignment.objectExpression(block: ObjectExpression.() -> Unit): ObjectExpression {
    return ObjectExpressionImpl().apply(block)
}

/**
 * TsExportAssignment#expression: Expression
 * extension function for create Expression -> FunctionExpressionImpl
 */
fun TsExportAssignment.functionExpression(block: FunctionExpression.() -> Unit): FunctionExpression {
    return FunctionExpressionImpl().apply(block)
}

/**
 * TsExportAssignment#expression: Expression
 * extension function for create Expression -> UnaryExpressionImpl
 */
fun TsExportAssignment.unaryExpression(block: UnaryExpression.() -> Unit): UnaryExpression {
    return UnaryExpressionImpl().apply(block)
}

/**
 * TsExportAssignment#expression: Expression
 * extension function for create Expression -> UpdateExpressionImpl
 */
fun TsExportAssignment.updateExpression(block: UpdateExpression.() -> Unit): UpdateExpression {
    return UpdateExpressionImpl().apply(block)
}

/**
 * TsExportAssignment#expression: Expression
 * extension function for create Expression -> BinaryExpressionImpl
 */
fun TsExportAssignment.binaryExpression(block: BinaryExpression.() -> Unit): BinaryExpression {
    return BinaryExpressionImpl().apply(block)
}

/**
 * TsExportAssignment#expression: Expression
 * extension function for create Expression -> AssignmentExpressionImpl
 */
fun TsExportAssignment.assignmentExpression(block: AssignmentExpression.() -> Unit): AssignmentExpression {
    return AssignmentExpressionImpl().apply(block)
}

/**
 * TsExportAssignment#expression: Expression
 * extension function for create Expression -> MemberExpressionImpl
 */
fun TsExportAssignment.memberExpression(block: MemberExpression.() -> Unit): MemberExpression {
    return MemberExpressionImpl().apply(block)
}

/**
 * TsExportAssignment#expression: Expression
 * extension function for create Expression -> SuperPropExpressionImpl
 */
fun TsExportAssignment.superPropExpression(block: SuperPropExpression.() -> Unit): SuperPropExpression {
    return SuperPropExpressionImpl().apply(block)
}

/**
 * TsExportAssignment#expression: Expression
 * extension function for create Expression -> ConditionalExpressionImpl
 */
fun TsExportAssignment.conditionalExpression(block: ConditionalExpression.() -> Unit): ConditionalExpression {
    return ConditionalExpressionImpl().apply(block)
}

/**
 * TsExportAssignment#expression: Expression
 * extension function for create Expression -> CallExpressionImpl
 */
fun TsExportAssignment.callExpression(block: CallExpression.() -> Unit): CallExpression {
    return CallExpressionImpl().apply(block)
}

/**
 * TsExportAssignment#expression: Expression
 * extension function for create Expression -> NewExpressionImpl
 */
fun TsExportAssignment.newExpression(block: NewExpression.() -> Unit): NewExpression {
    return NewExpressionImpl().apply(block)
}

/**
 * TsExportAssignment#expression: Expression
 * extension function for create Expression -> SequenceExpressionImpl
 */
fun TsExportAssignment.sequenceExpression(block: SequenceExpression.() -> Unit): SequenceExpression {
    return SequenceExpressionImpl().apply(block)
}

/**
 * TsExportAssignment#expression: Expression
 * extension function for create Expression -> IdentifierImpl
 */
fun TsExportAssignment.identifier(block: Identifier.() -> Unit): Identifier {
    return IdentifierImpl().apply(block)
}

/**
 * TsExportAssignment#expression: Expression
 * extension function for create Expression -> StringLiteralImpl
 */
fun TsExportAssignment.stringLiteral(block: StringLiteral.() -> Unit): StringLiteral {
    return StringLiteralImpl().apply(block)
}

/**
 * TsExportAssignment#expression: Expression
 * extension function for create Expression -> BooleanLiteralImpl
 */
fun TsExportAssignment.booleanLiteral(block: BooleanLiteral.() -> Unit): BooleanLiteral {
    return BooleanLiteralImpl().apply(block)
}

/**
 * TsExportAssignment#expression: Expression
 * extension function for create Expression -> NullLiteralImpl
 */
fun TsExportAssignment.nullLiteral(block: NullLiteral.() -> Unit): NullLiteral {
    return NullLiteralImpl().apply(block)
}

/**
 * TsExportAssignment#expression: Expression
 * extension function for create Expression -> NumericLiteralImpl
 */
fun TsExportAssignment.numericLiteral(block: NumericLiteral.() -> Unit): NumericLiteral {
    return NumericLiteralImpl().apply(block)
}

/**
 * TsExportAssignment#expression: Expression
 * extension function for create Expression -> BigIntLiteralImpl
 */
fun TsExportAssignment.bigIntLiteral(block: BigIntLiteral.() -> Unit): BigIntLiteral {
    return BigIntLiteralImpl().apply(block)
}

/**
 * TsExportAssignment#expression: Expression
 * extension function for create Expression -> RegExpLiteralImpl
 */
fun TsExportAssignment.regExpLiteral(block: RegExpLiteral.() -> Unit): RegExpLiteral {
    return RegExpLiteralImpl().apply(block)
}

/**
 * TsExportAssignment#expression: Expression
 * extension function for create Expression -> JSXTextImpl
 */
fun TsExportAssignment.jSXText(block: JSXText.() -> Unit): JSXText {
    return JSXTextImpl().apply(block)
}

/**
 * TsExportAssignment#expression: Expression
 * extension function for create Expression -> TemplateLiteralImpl
 */
fun TsExportAssignment.templateLiteral(block: TemplateLiteral.() -> Unit): TemplateLiteral {
    return TemplateLiteralImpl().apply(block)
}

/**
 * TsExportAssignment#expression: Expression
 * extension function for create Expression -> TaggedTemplateExpressionImpl
 */
fun TsExportAssignment.taggedTemplateExpression(block: TaggedTemplateExpression.() -> Unit): TaggedTemplateExpression {
    return TaggedTemplateExpressionImpl().apply(block)
}

/**
 * TsExportAssignment#expression: Expression
 * extension function for create Expression -> ArrowFunctionExpressionImpl
 */
fun TsExportAssignment.arrowFunctionExpression(block: ArrowFunctionExpression.() -> Unit): ArrowFunctionExpression {
    return ArrowFunctionExpressionImpl().apply(block)
}

/**
 * TsExportAssignment#expression: Expression
 * extension function for create Expression -> ClassExpressionImpl
 */
fun TsExportAssignment.classExpression(block: ClassExpression.() -> Unit): ClassExpression {
    return ClassExpressionImpl().apply(block)
}

/**
 * TsExportAssignment#expression: Expression
 * extension function for create Expression -> YieldExpressionImpl
 */
fun TsExportAssignment.yieldExpression(block: YieldExpression.() -> Unit): YieldExpression {
    return YieldExpressionImpl().apply(block)
}

/**
 * TsExportAssignment#expression: Expression
 * extension function for create Expression -> MetaPropertyImpl
 */
fun TsExportAssignment.metaProperty(block: MetaProperty.() -> Unit): MetaProperty {
    return MetaPropertyImpl().apply(block)
}

/**
 * TsExportAssignment#expression: Expression
 * extension function for create Expression -> AwaitExpressionImpl
 */
fun TsExportAssignment.awaitExpression(block: AwaitExpression.() -> Unit): AwaitExpression {
    return AwaitExpressionImpl().apply(block)
}

/**
 * TsExportAssignment#expression: Expression
 * extension function for create Expression -> ParenthesisExpressionImpl
 */
fun TsExportAssignment.parenthesisExpression(block: ParenthesisExpression.() -> Unit): ParenthesisExpression {
    return ParenthesisExpressionImpl().apply(block)
}

/**
 * TsExportAssignment#expression: Expression
 * extension function for create Expression -> JSXMemberExpressionImpl
 */
fun TsExportAssignment.jSXMemberExpression(block: JSXMemberExpression.() -> Unit): JSXMemberExpression {
    return JSXMemberExpressionImpl().apply(block)
}

/**
 * TsExportAssignment#expression: Expression
 * extension function for create Expression -> JSXNamespacedNameImpl
 */
fun TsExportAssignment.jSXNamespacedName(block: JSXNamespacedName.() -> Unit): JSXNamespacedName {
    return JSXNamespacedNameImpl().apply(block)
}

/**
 * TsExportAssignment#expression: Expression
 * extension function for create Expression -> JSXEmptyExpressionImpl
 */
fun TsExportAssignment.jSXEmptyExpression(block: JSXEmptyExpression.() -> Unit): JSXEmptyExpression {
    return JSXEmptyExpressionImpl().apply(block)
}

/**
 * TsExportAssignment#expression: Expression
 * extension function for create Expression -> JSXElementImpl
 */
fun TsExportAssignment.jSXElement(block: JSXElement.() -> Unit): JSXElement {
    return JSXElementImpl().apply(block)
}

/**
 * TsExportAssignment#expression: Expression
 * extension function for create Expression -> JSXFragmentImpl
 */
fun TsExportAssignment.jSXFragment(block: JSXFragment.() -> Unit): JSXFragment {
    return JSXFragmentImpl().apply(block)
}

/**
 * TsExportAssignment#expression: Expression
 * extension function for create Expression -> TsTypeAssertionImpl
 */
fun TsExportAssignment.tsTypeAssertion(block: TsTypeAssertion.() -> Unit): TsTypeAssertion {
    return TsTypeAssertionImpl().apply(block)
}

/**
 * TsExportAssignment#expression: Expression
 * extension function for create Expression -> TsConstAssertionImpl
 */
fun TsExportAssignment.tsConstAssertion(block: TsConstAssertion.() -> Unit): TsConstAssertion {
    return TsConstAssertionImpl().apply(block)
}

/**
 * TsExportAssignment#expression: Expression
 * extension function for create Expression -> TsNonNullExpressionImpl
 */
fun TsExportAssignment.tsNonNullExpression(block: TsNonNullExpression.() -> Unit): TsNonNullExpression {
    return TsNonNullExpressionImpl().apply(block)
}

/**
 * TsExportAssignment#expression: Expression
 * extension function for create Expression -> TsAsExpressionImpl
 */
fun TsExportAssignment.tsAsExpression(block: TsAsExpression.() -> Unit): TsAsExpression {
    return TsAsExpressionImpl().apply(block)
}

/**
 * TsExportAssignment#expression: Expression
 * extension function for create Expression -> TsSatisfiesExpressionImpl
 */
fun TsExportAssignment.tsSatisfiesExpression(block: TsSatisfiesExpression.() -> Unit): TsSatisfiesExpression {
    return TsSatisfiesExpressionImpl().apply(block)
}

/**
 * TsExportAssignment#expression: Expression
 * extension function for create Expression -> TsInstantiationImpl
 */
fun TsExportAssignment.tsInstantiation(block: TsInstantiation.() -> Unit): TsInstantiation {
    return TsInstantiationImpl().apply(block)
}

/**
 * TsExportAssignment#expression: Expression
 * extension function for create Expression -> PrivateNameImpl
 */
fun TsExportAssignment.privateName(block: PrivateName.() -> Unit): PrivateName {
    return PrivateNameImpl().apply(block)
}

/**
 * TsExportAssignment#expression: Expression
 * extension function for create Expression -> OptionalChainingExpressionImpl
 */
fun TsExportAssignment.optionalChainingExpression(block: OptionalChainingExpression.() -> Unit): OptionalChainingExpression {
    return OptionalChainingExpressionImpl().apply(block)
}

/**
 * TsExportAssignment#expression: Expression
 * extension function for create Expression -> InvalidImpl
 */
fun TsExportAssignment.invalid(block: Invalid.() -> Unit): Invalid {
    return InvalidImpl().apply(block)
}

fun TsExportAssignment.span(block: Span.() -> Unit): Span {
    return Span().apply(block)
}
