package dev.yidafu.swc.dsl

import dev.yidafu.swc.types.*

/**
 * ExportDefaultExpression#expression: Expression
 * extension function for create Expression -> ThisExpressionImpl
 */
fun ExportDefaultExpression.thisExpression(block: ThisExpression.() -> Unit): ThisExpression {
    return ThisExpressionImpl().apply(block)
}

/**
 * ExportDefaultExpression#expression: Expression
 * extension function for create Expression -> ArrayExpressionImpl
 */
fun ExportDefaultExpression.arrayExpression(block: ArrayExpression.() -> Unit): ArrayExpression {
    return ArrayExpressionImpl().apply(block)
}

/**
 * ExportDefaultExpression#expression: Expression
 * extension function for create Expression -> ObjectExpressionImpl
 */
fun ExportDefaultExpression.objectExpression(block: ObjectExpression.() -> Unit): ObjectExpression {
    return ObjectExpressionImpl().apply(block)
}

/**
 * ExportDefaultExpression#expression: Expression
 * extension function for create Expression -> FunctionExpressionImpl
 */
fun ExportDefaultExpression.functionExpression(block: FunctionExpression.() -> Unit): FunctionExpression {
    return FunctionExpressionImpl().apply(block)
}

/**
 * ExportDefaultExpression#expression: Expression
 * extension function for create Expression -> UnaryExpressionImpl
 */
fun ExportDefaultExpression.unaryExpression(block: UnaryExpression.() -> Unit): UnaryExpression {
    return UnaryExpressionImpl().apply(block)
}

/**
 * ExportDefaultExpression#expression: Expression
 * extension function for create Expression -> UpdateExpressionImpl
 */
fun ExportDefaultExpression.updateExpression(block: UpdateExpression.() -> Unit): UpdateExpression {
    return UpdateExpressionImpl().apply(block)
}

/**
 * ExportDefaultExpression#expression: Expression
 * extension function for create Expression -> BinaryExpressionImpl
 */
fun ExportDefaultExpression.binaryExpression(block: BinaryExpression.() -> Unit): BinaryExpression {
    return BinaryExpressionImpl().apply(block)
}

/**
 * ExportDefaultExpression#expression: Expression
 * extension function for create Expression -> AssignmentExpressionImpl
 */
fun ExportDefaultExpression.assignmentExpression(block: AssignmentExpression.() -> Unit): AssignmentExpression {
    return AssignmentExpressionImpl().apply(block)
}

/**
 * ExportDefaultExpression#expression: Expression
 * extension function for create Expression -> MemberExpressionImpl
 */
fun ExportDefaultExpression.memberExpression(block: MemberExpression.() -> Unit): MemberExpression {
    return MemberExpressionImpl().apply(block)
}

/**
 * ExportDefaultExpression#expression: Expression
 * extension function for create Expression -> SuperPropExpressionImpl
 */
fun ExportDefaultExpression.superPropExpression(block: SuperPropExpression.() -> Unit): SuperPropExpression {
    return SuperPropExpressionImpl().apply(block)
}

/**
 * ExportDefaultExpression#expression: Expression
 * extension function for create Expression -> ConditionalExpressionImpl
 */
fun ExportDefaultExpression.conditionalExpression(block: ConditionalExpression.() -> Unit): ConditionalExpression {
    return ConditionalExpressionImpl().apply(block)
}

/**
 * ExportDefaultExpression#expression: Expression
 * extension function for create Expression -> CallExpressionImpl
 */
fun ExportDefaultExpression.callExpression(block: CallExpression.() -> Unit): CallExpression {
    return CallExpressionImpl().apply(block)
}

/**
 * ExportDefaultExpression#expression: Expression
 * extension function for create Expression -> NewExpressionImpl
 */
fun ExportDefaultExpression.newExpression(block: NewExpression.() -> Unit): NewExpression {
    return NewExpressionImpl().apply(block)
}

/**
 * ExportDefaultExpression#expression: Expression
 * extension function for create Expression -> SequenceExpressionImpl
 */
fun ExportDefaultExpression.sequenceExpression(block: SequenceExpression.() -> Unit): SequenceExpression {
    return SequenceExpressionImpl().apply(block)
}

/**
 * ExportDefaultExpression#expression: Expression
 * extension function for create Expression -> IdentifierImpl
 */
fun ExportDefaultExpression.identifier(block: Identifier.() -> Unit): Identifier {
    return IdentifierImpl().apply(block)
}

/**
 * ExportDefaultExpression#expression: Expression
 * extension function for create Expression -> StringLiteralImpl
 */
fun ExportDefaultExpression.stringLiteral(block: StringLiteral.() -> Unit): StringLiteral {
    return StringLiteralImpl().apply(block)
}

/**
 * ExportDefaultExpression#expression: Expression
 * extension function for create Expression -> BooleanLiteralImpl
 */
fun ExportDefaultExpression.booleanLiteral(block: BooleanLiteral.() -> Unit): BooleanLiteral {
    return BooleanLiteralImpl().apply(block)
}

/**
 * ExportDefaultExpression#expression: Expression
 * extension function for create Expression -> NullLiteralImpl
 */
fun ExportDefaultExpression.nullLiteral(block: NullLiteral.() -> Unit): NullLiteral {
    return NullLiteralImpl().apply(block)
}

/**
 * ExportDefaultExpression#expression: Expression
 * extension function for create Expression -> NumericLiteralImpl
 */
fun ExportDefaultExpression.numericLiteral(block: NumericLiteral.() -> Unit): NumericLiteral {
    return NumericLiteralImpl().apply(block)
}

/**
 * ExportDefaultExpression#expression: Expression
 * extension function for create Expression -> BigIntLiteralImpl
 */
fun ExportDefaultExpression.bigIntLiteral(block: BigIntLiteral.() -> Unit): BigIntLiteral {
    return BigIntLiteralImpl().apply(block)
}

/**
 * ExportDefaultExpression#expression: Expression
 * extension function for create Expression -> RegExpLiteralImpl
 */
fun ExportDefaultExpression.regExpLiteral(block: RegExpLiteral.() -> Unit): RegExpLiteral {
    return RegExpLiteralImpl().apply(block)
}

/**
 * ExportDefaultExpression#expression: Expression
 * extension function for create Expression -> JSXTextImpl
 */
fun ExportDefaultExpression.jSXText(block: JSXText.() -> Unit): JSXText {
    return JSXTextImpl().apply(block)
}

/**
 * ExportDefaultExpression#expression: Expression
 * extension function for create Expression -> TemplateLiteralImpl
 */
fun ExportDefaultExpression.templateLiteral(block: TemplateLiteral.() -> Unit): TemplateLiteral {
    return TemplateLiteralImpl().apply(block)
}

/**
 * ExportDefaultExpression#expression: Expression
 * extension function for create Expression -> TaggedTemplateExpressionImpl
 */
fun ExportDefaultExpression.taggedTemplateExpression(block: TaggedTemplateExpression.() -> Unit): TaggedTemplateExpression {
    return TaggedTemplateExpressionImpl().apply(block)
}

/**
 * ExportDefaultExpression#expression: Expression
 * extension function for create Expression -> ArrowFunctionExpressionImpl
 */
fun ExportDefaultExpression.arrowFunctionExpression(block: ArrowFunctionExpression.() -> Unit): ArrowFunctionExpression {
    return ArrowFunctionExpressionImpl().apply(block)
}

/**
 * ExportDefaultExpression#expression: Expression
 * extension function for create Expression -> ClassExpressionImpl
 */
fun ExportDefaultExpression.classExpression(block: ClassExpression.() -> Unit): ClassExpression {
    return ClassExpressionImpl().apply(block)
}

/**
 * ExportDefaultExpression#expression: Expression
 * extension function for create Expression -> YieldExpressionImpl
 */
fun ExportDefaultExpression.yieldExpression(block: YieldExpression.() -> Unit): YieldExpression {
    return YieldExpressionImpl().apply(block)
}

/**
 * ExportDefaultExpression#expression: Expression
 * extension function for create Expression -> MetaPropertyImpl
 */
fun ExportDefaultExpression.metaProperty(block: MetaProperty.() -> Unit): MetaProperty {
    return MetaPropertyImpl().apply(block)
}

/**
 * ExportDefaultExpression#expression: Expression
 * extension function for create Expression -> AwaitExpressionImpl
 */
fun ExportDefaultExpression.awaitExpression(block: AwaitExpression.() -> Unit): AwaitExpression {
    return AwaitExpressionImpl().apply(block)
}

/**
 * ExportDefaultExpression#expression: Expression
 * extension function for create Expression -> ParenthesisExpressionImpl
 */
fun ExportDefaultExpression.parenthesisExpression(block: ParenthesisExpression.() -> Unit): ParenthesisExpression {
    return ParenthesisExpressionImpl().apply(block)
}

/**
 * ExportDefaultExpression#expression: Expression
 * extension function for create Expression -> JSXMemberExpressionImpl
 */
fun ExportDefaultExpression.jSXMemberExpression(block: JSXMemberExpression.() -> Unit): JSXMemberExpression {
    return JSXMemberExpressionImpl().apply(block)
}

/**
 * ExportDefaultExpression#expression: Expression
 * extension function for create Expression -> JSXNamespacedNameImpl
 */
fun ExportDefaultExpression.jSXNamespacedName(block: JSXNamespacedName.() -> Unit): JSXNamespacedName {
    return JSXNamespacedNameImpl().apply(block)
}

/**
 * ExportDefaultExpression#expression: Expression
 * extension function for create Expression -> JSXEmptyExpressionImpl
 */
fun ExportDefaultExpression.jSXEmptyExpression(block: JSXEmptyExpression.() -> Unit): JSXEmptyExpression {
    return JSXEmptyExpressionImpl().apply(block)
}

/**
 * ExportDefaultExpression#expression: Expression
 * extension function for create Expression -> JSXElementImpl
 */
fun ExportDefaultExpression.jSXElement(block: JSXElement.() -> Unit): JSXElement {
    return JSXElementImpl().apply(block)
}

/**
 * ExportDefaultExpression#expression: Expression
 * extension function for create Expression -> JSXFragmentImpl
 */
fun ExportDefaultExpression.jSXFragment(block: JSXFragment.() -> Unit): JSXFragment {
    return JSXFragmentImpl().apply(block)
}

/**
 * ExportDefaultExpression#expression: Expression
 * extension function for create Expression -> TsTypeAssertionImpl
 */
fun ExportDefaultExpression.tsTypeAssertion(block: TsTypeAssertion.() -> Unit): TsTypeAssertion {
    return TsTypeAssertionImpl().apply(block)
}

/**
 * ExportDefaultExpression#expression: Expression
 * extension function for create Expression -> TsConstAssertionImpl
 */
fun ExportDefaultExpression.tsConstAssertion(block: TsConstAssertion.() -> Unit): TsConstAssertion {
    return TsConstAssertionImpl().apply(block)
}

/**
 * ExportDefaultExpression#expression: Expression
 * extension function for create Expression -> TsNonNullExpressionImpl
 */
fun ExportDefaultExpression.tsNonNullExpression(block: TsNonNullExpression.() -> Unit): TsNonNullExpression {
    return TsNonNullExpressionImpl().apply(block)
}

/**
 * ExportDefaultExpression#expression: Expression
 * extension function for create Expression -> TsAsExpressionImpl
 */
fun ExportDefaultExpression.tsAsExpression(block: TsAsExpression.() -> Unit): TsAsExpression {
    return TsAsExpressionImpl().apply(block)
}

/**
 * ExportDefaultExpression#expression: Expression
 * extension function for create Expression -> TsSatisfiesExpressionImpl
 */
fun ExportDefaultExpression.tsSatisfiesExpression(block: TsSatisfiesExpression.() -> Unit): TsSatisfiesExpression {
    return TsSatisfiesExpressionImpl().apply(block)
}

/**
 * ExportDefaultExpression#expression: Expression
 * extension function for create Expression -> TsInstantiationImpl
 */
fun ExportDefaultExpression.tsInstantiation(block: TsInstantiation.() -> Unit): TsInstantiation {
    return TsInstantiationImpl().apply(block)
}

/**
 * ExportDefaultExpression#expression: Expression
 * extension function for create Expression -> PrivateNameImpl
 */
fun ExportDefaultExpression.privateName(block: PrivateName.() -> Unit): PrivateName {
    return PrivateNameImpl().apply(block)
}

/**
 * ExportDefaultExpression#expression: Expression
 * extension function for create Expression -> OptionalChainingExpressionImpl
 */
fun ExportDefaultExpression.optionalChainingExpression(block: OptionalChainingExpression.() -> Unit): OptionalChainingExpression {
    return OptionalChainingExpressionImpl().apply(block)
}

/**
 * ExportDefaultExpression#expression: Expression
 * extension function for create Expression -> InvalidImpl
 */
fun ExportDefaultExpression.invalid(block: Invalid.() -> Unit): Invalid {
    return InvalidImpl().apply(block)
}

fun ExportDefaultExpression.span(block: Span.() -> Unit): Span {
    return Span().apply(block)
}
