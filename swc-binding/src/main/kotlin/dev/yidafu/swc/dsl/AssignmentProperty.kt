package dev.yidafu.swc.dsl

import dev.yidafu.swc.types.*

/**
 * AssignmentProperty#value: Expression
 * extension function for create Expression -> IdentifierImpl
 */
fun AssignmentProperty.identifier(block: Identifier.() -> Unit): Identifier {
    return IdentifierImpl().apply(block)
}

/**
 * AssignmentProperty#value: Expression
 * extension function for create Expression -> ThisExpressionImpl
 */
fun AssignmentProperty.thisExpression(block: ThisExpression.() -> Unit): ThisExpression {
    return ThisExpressionImpl().apply(block)
}

/**
 * AssignmentProperty#value: Expression
 * extension function for create Expression -> ArrayExpressionImpl
 */
fun AssignmentProperty.arrayExpression(block: ArrayExpression.() -> Unit): ArrayExpression {
    return ArrayExpressionImpl().apply(block)
}

/**
 * AssignmentProperty#value: Expression
 * extension function for create Expression -> ObjectExpressionImpl
 */
fun AssignmentProperty.objectExpression(block: ObjectExpression.() -> Unit): ObjectExpression {
    return ObjectExpressionImpl().apply(block)
}

/**
 * AssignmentProperty#value: Expression
 * extension function for create Expression -> FunctionExpressionImpl
 */
fun AssignmentProperty.functionExpression(block: FunctionExpression.() -> Unit): FunctionExpression {
    return FunctionExpressionImpl().apply(block)
}

/**
 * AssignmentProperty#value: Expression
 * extension function for create Expression -> UnaryExpressionImpl
 */
fun AssignmentProperty.unaryExpression(block: UnaryExpression.() -> Unit): UnaryExpression {
    return UnaryExpressionImpl().apply(block)
}

/**
 * AssignmentProperty#value: Expression
 * extension function for create Expression -> UpdateExpressionImpl
 */
fun AssignmentProperty.updateExpression(block: UpdateExpression.() -> Unit): UpdateExpression {
    return UpdateExpressionImpl().apply(block)
}

/**
 * AssignmentProperty#value: Expression
 * extension function for create Expression -> BinaryExpressionImpl
 */
fun AssignmentProperty.binaryExpression(block: BinaryExpression.() -> Unit): BinaryExpression {
    return BinaryExpressionImpl().apply(block)
}

/**
 * AssignmentProperty#value: Expression
 * extension function for create Expression -> AssignmentExpressionImpl
 */
fun AssignmentProperty.assignmentExpression(block: AssignmentExpression.() -> Unit): AssignmentExpression {
    return AssignmentExpressionImpl().apply(block)
}

/**
 * AssignmentProperty#value: Expression
 * extension function for create Expression -> MemberExpressionImpl
 */
fun AssignmentProperty.memberExpression(block: MemberExpression.() -> Unit): MemberExpression {
    return MemberExpressionImpl().apply(block)
}

/**
 * AssignmentProperty#value: Expression
 * extension function for create Expression -> SuperPropExpressionImpl
 */
fun AssignmentProperty.superPropExpression(block: SuperPropExpression.() -> Unit): SuperPropExpression {
    return SuperPropExpressionImpl().apply(block)
}

/**
 * AssignmentProperty#value: Expression
 * extension function for create Expression -> ConditionalExpressionImpl
 */
fun AssignmentProperty.conditionalExpression(block: ConditionalExpression.() -> Unit): ConditionalExpression {
    return ConditionalExpressionImpl().apply(block)
}

/**
 * AssignmentProperty#value: Expression
 * extension function for create Expression -> CallExpressionImpl
 */
fun AssignmentProperty.callExpression(block: CallExpression.() -> Unit): CallExpression {
    return CallExpressionImpl().apply(block)
}

/**
 * AssignmentProperty#value: Expression
 * extension function for create Expression -> NewExpressionImpl
 */
fun AssignmentProperty.newExpression(block: NewExpression.() -> Unit): NewExpression {
    return NewExpressionImpl().apply(block)
}

/**
 * AssignmentProperty#value: Expression
 * extension function for create Expression -> SequenceExpressionImpl
 */
fun AssignmentProperty.sequenceExpression(block: SequenceExpression.() -> Unit): SequenceExpression {
    return SequenceExpressionImpl().apply(block)
}

/**
 * AssignmentProperty#value: Expression
 * extension function for create Expression -> StringLiteralImpl
 */
fun AssignmentProperty.stringLiteral(block: StringLiteral.() -> Unit): StringLiteral {
    return StringLiteralImpl().apply(block)
}

/**
 * AssignmentProperty#value: Expression
 * extension function for create Expression -> BooleanLiteralImpl
 */
fun AssignmentProperty.booleanLiteral(block: BooleanLiteral.() -> Unit): BooleanLiteral {
    return BooleanLiteralImpl().apply(block)
}

/**
 * AssignmentProperty#value: Expression
 * extension function for create Expression -> NullLiteralImpl
 */
fun AssignmentProperty.nullLiteral(block: NullLiteral.() -> Unit): NullLiteral {
    return NullLiteralImpl().apply(block)
}

/**
 * AssignmentProperty#value: Expression
 * extension function for create Expression -> NumericLiteralImpl
 */
fun AssignmentProperty.numericLiteral(block: NumericLiteral.() -> Unit): NumericLiteral {
    return NumericLiteralImpl().apply(block)
}

/**
 * AssignmentProperty#value: Expression
 * extension function for create Expression -> BigIntLiteralImpl
 */
fun AssignmentProperty.bigIntLiteral(block: BigIntLiteral.() -> Unit): BigIntLiteral {
    return BigIntLiteralImpl().apply(block)
}

/**
 * AssignmentProperty#value: Expression
 * extension function for create Expression -> RegExpLiteralImpl
 */
fun AssignmentProperty.regExpLiteral(block: RegExpLiteral.() -> Unit): RegExpLiteral {
    return RegExpLiteralImpl().apply(block)
}

/**
 * AssignmentProperty#value: Expression
 * extension function for create Expression -> JSXTextImpl
 */
fun AssignmentProperty.jSXText(block: JSXText.() -> Unit): JSXText {
    return JSXTextImpl().apply(block)
}

/**
 * AssignmentProperty#value: Expression
 * extension function for create Expression -> TemplateLiteralImpl
 */
fun AssignmentProperty.templateLiteral(block: TemplateLiteral.() -> Unit): TemplateLiteral {
    return TemplateLiteralImpl().apply(block)
}

/**
 * AssignmentProperty#value: Expression
 * extension function for create Expression -> TaggedTemplateExpressionImpl
 */
fun AssignmentProperty.taggedTemplateExpression(block: TaggedTemplateExpression.() -> Unit): TaggedTemplateExpression {
    return TaggedTemplateExpressionImpl().apply(block)
}

/**
 * AssignmentProperty#value: Expression
 * extension function for create Expression -> ArrowFunctionExpressionImpl
 */
fun AssignmentProperty.arrowFunctionExpression(block: ArrowFunctionExpression.() -> Unit): ArrowFunctionExpression {
    return ArrowFunctionExpressionImpl().apply(block)
}

/**
 * AssignmentProperty#value: Expression
 * extension function for create Expression -> ClassExpressionImpl
 */
fun AssignmentProperty.classExpression(block: ClassExpression.() -> Unit): ClassExpression {
    return ClassExpressionImpl().apply(block)
}

/**
 * AssignmentProperty#value: Expression
 * extension function for create Expression -> YieldExpressionImpl
 */
fun AssignmentProperty.yieldExpression(block: YieldExpression.() -> Unit): YieldExpression {
    return YieldExpressionImpl().apply(block)
}

/**
 * AssignmentProperty#value: Expression
 * extension function for create Expression -> MetaPropertyImpl
 */
fun AssignmentProperty.metaProperty(block: MetaProperty.() -> Unit): MetaProperty {
    return MetaPropertyImpl().apply(block)
}

/**
 * AssignmentProperty#value: Expression
 * extension function for create Expression -> AwaitExpressionImpl
 */
fun AssignmentProperty.awaitExpression(block: AwaitExpression.() -> Unit): AwaitExpression {
    return AwaitExpressionImpl().apply(block)
}

/**
 * AssignmentProperty#value: Expression
 * extension function for create Expression -> ParenthesisExpressionImpl
 */
fun AssignmentProperty.parenthesisExpression(block: ParenthesisExpression.() -> Unit): ParenthesisExpression {
    return ParenthesisExpressionImpl().apply(block)
}

/**
 * AssignmentProperty#value: Expression
 * extension function for create Expression -> JSXMemberExpressionImpl
 */
fun AssignmentProperty.jSXMemberExpression(block: JSXMemberExpression.() -> Unit): JSXMemberExpression {
    return JSXMemberExpressionImpl().apply(block)
}

/**
 * AssignmentProperty#value: Expression
 * extension function for create Expression -> JSXNamespacedNameImpl
 */
fun AssignmentProperty.jSXNamespacedName(block: JSXNamespacedName.() -> Unit): JSXNamespacedName {
    return JSXNamespacedNameImpl().apply(block)
}

/**
 * AssignmentProperty#value: Expression
 * extension function for create Expression -> JSXEmptyExpressionImpl
 */
fun AssignmentProperty.jSXEmptyExpression(block: JSXEmptyExpression.() -> Unit): JSXEmptyExpression {
    return JSXEmptyExpressionImpl().apply(block)
}

/**
 * AssignmentProperty#value: Expression
 * extension function for create Expression -> JSXElementImpl
 */
fun AssignmentProperty.jSXElement(block: JSXElement.() -> Unit): JSXElement {
    return JSXElementImpl().apply(block)
}

/**
 * AssignmentProperty#value: Expression
 * extension function for create Expression -> JSXFragmentImpl
 */
fun AssignmentProperty.jSXFragment(block: JSXFragment.() -> Unit): JSXFragment {
    return JSXFragmentImpl().apply(block)
}

/**
 * AssignmentProperty#value: Expression
 * extension function for create Expression -> TsTypeAssertionImpl
 */
fun AssignmentProperty.tsTypeAssertion(block: TsTypeAssertion.() -> Unit): TsTypeAssertion {
    return TsTypeAssertionImpl().apply(block)
}

/**
 * AssignmentProperty#value: Expression
 * extension function for create Expression -> TsConstAssertionImpl
 */
fun AssignmentProperty.tsConstAssertion(block: TsConstAssertion.() -> Unit): TsConstAssertion {
    return TsConstAssertionImpl().apply(block)
}

/**
 * AssignmentProperty#value: Expression
 * extension function for create Expression -> TsNonNullExpressionImpl
 */
fun AssignmentProperty.tsNonNullExpression(block: TsNonNullExpression.() -> Unit): TsNonNullExpression {
    return TsNonNullExpressionImpl().apply(block)
}

/**
 * AssignmentProperty#value: Expression
 * extension function for create Expression -> TsAsExpressionImpl
 */
fun AssignmentProperty.tsAsExpression(block: TsAsExpression.() -> Unit): TsAsExpression {
    return TsAsExpressionImpl().apply(block)
}

/**
 * AssignmentProperty#value: Expression
 * extension function for create Expression -> TsSatisfiesExpressionImpl
 */
fun AssignmentProperty.tsSatisfiesExpression(block: TsSatisfiesExpression.() -> Unit): TsSatisfiesExpression {
    return TsSatisfiesExpressionImpl().apply(block)
}

/**
 * AssignmentProperty#value: Expression
 * extension function for create Expression -> TsInstantiationImpl
 */
fun AssignmentProperty.tsInstantiation(block: TsInstantiation.() -> Unit): TsInstantiation {
    return TsInstantiationImpl().apply(block)
}

/**
 * AssignmentProperty#value: Expression
 * extension function for create Expression -> PrivateNameImpl
 */
fun AssignmentProperty.privateName(block: PrivateName.() -> Unit): PrivateName {
    return PrivateNameImpl().apply(block)
}

/**
 * AssignmentProperty#value: Expression
 * extension function for create Expression -> OptionalChainingExpressionImpl
 */
fun AssignmentProperty.optionalChainingExpression(block: OptionalChainingExpression.() -> Unit): OptionalChainingExpression {
    return OptionalChainingExpressionImpl().apply(block)
}

/**
 * AssignmentProperty#value: Expression
 * extension function for create Expression -> InvalidImpl
 */
fun AssignmentProperty.invalid(block: Invalid.() -> Unit): Invalid {
    return InvalidImpl().apply(block)
}
