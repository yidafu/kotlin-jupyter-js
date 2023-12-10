package dev.yidafu.swc.dsl

import dev.yidafu.swc.types.*

/**
 * KeyValueProperty#value: Expression
 * extension function for create Expression -> ThisExpressionImpl
 */
fun KeyValueProperty.thisExpression(block: ThisExpression.() -> Unit): ThisExpression {
    return ThisExpressionImpl().apply(block)
}

/**
 * KeyValueProperty#value: Expression
 * extension function for create Expression -> ArrayExpressionImpl
 */
fun KeyValueProperty.arrayExpression(block: ArrayExpression.() -> Unit): ArrayExpression {
    return ArrayExpressionImpl().apply(block)
}

/**
 * KeyValueProperty#value: Expression
 * extension function for create Expression -> ObjectExpressionImpl
 */
fun KeyValueProperty.objectExpression(block: ObjectExpression.() -> Unit): ObjectExpression {
    return ObjectExpressionImpl().apply(block)
}

/**
 * KeyValueProperty#value: Expression
 * extension function for create Expression -> FunctionExpressionImpl
 */
fun KeyValueProperty.functionExpression(block: FunctionExpression.() -> Unit): FunctionExpression {
    return FunctionExpressionImpl().apply(block)
}

/**
 * KeyValueProperty#value: Expression
 * extension function for create Expression -> UnaryExpressionImpl
 */
fun KeyValueProperty.unaryExpression(block: UnaryExpression.() -> Unit): UnaryExpression {
    return UnaryExpressionImpl().apply(block)
}

/**
 * KeyValueProperty#value: Expression
 * extension function for create Expression -> UpdateExpressionImpl
 */
fun KeyValueProperty.updateExpression(block: UpdateExpression.() -> Unit): UpdateExpression {
    return UpdateExpressionImpl().apply(block)
}

/**
 * KeyValueProperty#value: Expression
 * extension function for create Expression -> BinaryExpressionImpl
 */
fun KeyValueProperty.binaryExpression(block: BinaryExpression.() -> Unit): BinaryExpression {
    return BinaryExpressionImpl().apply(block)
}

/**
 * KeyValueProperty#value: Expression
 * extension function for create Expression -> AssignmentExpressionImpl
 */
fun KeyValueProperty.assignmentExpression(block: AssignmentExpression.() -> Unit): AssignmentExpression {
    return AssignmentExpressionImpl().apply(block)
}

/**
 * KeyValueProperty#value: Expression
 * extension function for create Expression -> MemberExpressionImpl
 */
fun KeyValueProperty.memberExpression(block: MemberExpression.() -> Unit): MemberExpression {
    return MemberExpressionImpl().apply(block)
}

/**
 * KeyValueProperty#value: Expression
 * extension function for create Expression -> SuperPropExpressionImpl
 */
fun KeyValueProperty.superPropExpression(block: SuperPropExpression.() -> Unit): SuperPropExpression {
    return SuperPropExpressionImpl().apply(block)
}

/**
 * KeyValueProperty#value: Expression
 * extension function for create Expression -> ConditionalExpressionImpl
 */
fun KeyValueProperty.conditionalExpression(block: ConditionalExpression.() -> Unit): ConditionalExpression {
    return ConditionalExpressionImpl().apply(block)
}

/**
 * KeyValueProperty#value: Expression
 * extension function for create Expression -> CallExpressionImpl
 */
fun KeyValueProperty.callExpression(block: CallExpression.() -> Unit): CallExpression {
    return CallExpressionImpl().apply(block)
}

/**
 * KeyValueProperty#value: Expression
 * extension function for create Expression -> NewExpressionImpl
 */
fun KeyValueProperty.newExpression(block: NewExpression.() -> Unit): NewExpression {
    return NewExpressionImpl().apply(block)
}

/**
 * KeyValueProperty#value: Expression
 * extension function for create Expression -> SequenceExpressionImpl
 */
fun KeyValueProperty.sequenceExpression(block: SequenceExpression.() -> Unit): SequenceExpression {
    return SequenceExpressionImpl().apply(block)
}

/**
 * KeyValueProperty#key: PropertyName
 * extension function for create PropertyName -> IdentifierImpl
 */
fun KeyValueProperty.identifier(block: Identifier.() -> Unit): Identifier {
    return IdentifierImpl().apply(block)
}

/**
 * KeyValueProperty#key: PropertyName
 * extension function for create PropertyName -> StringLiteralImpl
 */
fun KeyValueProperty.stringLiteral(block: StringLiteral.() -> Unit): StringLiteral {
    return StringLiteralImpl().apply(block)
}

/**
 * KeyValueProperty#value: Expression
 * extension function for create Expression -> BooleanLiteralImpl
 */
fun KeyValueProperty.booleanLiteral(block: BooleanLiteral.() -> Unit): BooleanLiteral {
    return BooleanLiteralImpl().apply(block)
}

/**
 * KeyValueProperty#value: Expression
 * extension function for create Expression -> NullLiteralImpl
 */
fun KeyValueProperty.nullLiteral(block: NullLiteral.() -> Unit): NullLiteral {
    return NullLiteralImpl().apply(block)
}

/**
 * KeyValueProperty#key: PropertyName
 * extension function for create PropertyName -> NumericLiteralImpl
 */
fun KeyValueProperty.numericLiteral(block: NumericLiteral.() -> Unit): NumericLiteral {
    return NumericLiteralImpl().apply(block)
}

/**
 * KeyValueProperty#key: PropertyName
 * extension function for create PropertyName -> BigIntLiteralImpl
 */
fun KeyValueProperty.bigIntLiteral(block: BigIntLiteral.() -> Unit): BigIntLiteral {
    return BigIntLiteralImpl().apply(block)
}

/**
 * KeyValueProperty#value: Expression
 * extension function for create Expression -> RegExpLiteralImpl
 */
fun KeyValueProperty.regExpLiteral(block: RegExpLiteral.() -> Unit): RegExpLiteral {
    return RegExpLiteralImpl().apply(block)
}

/**
 * KeyValueProperty#value: Expression
 * extension function for create Expression -> JSXTextImpl
 */
fun KeyValueProperty.jSXText(block: JSXText.() -> Unit): JSXText {
    return JSXTextImpl().apply(block)
}

/**
 * KeyValueProperty#value: Expression
 * extension function for create Expression -> TemplateLiteralImpl
 */
fun KeyValueProperty.templateLiteral(block: TemplateLiteral.() -> Unit): TemplateLiteral {
    return TemplateLiteralImpl().apply(block)
}

/**
 * KeyValueProperty#value: Expression
 * extension function for create Expression -> TaggedTemplateExpressionImpl
 */
fun KeyValueProperty.taggedTemplateExpression(block: TaggedTemplateExpression.() -> Unit): TaggedTemplateExpression {
    return TaggedTemplateExpressionImpl().apply(block)
}

/**
 * KeyValueProperty#value: Expression
 * extension function for create Expression -> ArrowFunctionExpressionImpl
 */
fun KeyValueProperty.arrowFunctionExpression(block: ArrowFunctionExpression.() -> Unit): ArrowFunctionExpression {
    return ArrowFunctionExpressionImpl().apply(block)
}

/**
 * KeyValueProperty#value: Expression
 * extension function for create Expression -> ClassExpressionImpl
 */
fun KeyValueProperty.classExpression(block: ClassExpression.() -> Unit): ClassExpression {
    return ClassExpressionImpl().apply(block)
}

/**
 * KeyValueProperty#value: Expression
 * extension function for create Expression -> YieldExpressionImpl
 */
fun KeyValueProperty.yieldExpression(block: YieldExpression.() -> Unit): YieldExpression {
    return YieldExpressionImpl().apply(block)
}

/**
 * KeyValueProperty#value: Expression
 * extension function for create Expression -> MetaPropertyImpl
 */
fun KeyValueProperty.metaProperty(block: MetaProperty.() -> Unit): MetaProperty {
    return MetaPropertyImpl().apply(block)
}

/**
 * KeyValueProperty#value: Expression
 * extension function for create Expression -> AwaitExpressionImpl
 */
fun KeyValueProperty.awaitExpression(block: AwaitExpression.() -> Unit): AwaitExpression {
    return AwaitExpressionImpl().apply(block)
}

/**
 * KeyValueProperty#value: Expression
 * extension function for create Expression -> ParenthesisExpressionImpl
 */
fun KeyValueProperty.parenthesisExpression(block: ParenthesisExpression.() -> Unit): ParenthesisExpression {
    return ParenthesisExpressionImpl().apply(block)
}

/**
 * KeyValueProperty#value: Expression
 * extension function for create Expression -> JSXMemberExpressionImpl
 */
fun KeyValueProperty.jSXMemberExpression(block: JSXMemberExpression.() -> Unit): JSXMemberExpression {
    return JSXMemberExpressionImpl().apply(block)
}

/**
 * KeyValueProperty#value: Expression
 * extension function for create Expression -> JSXNamespacedNameImpl
 */
fun KeyValueProperty.jSXNamespacedName(block: JSXNamespacedName.() -> Unit): JSXNamespacedName {
    return JSXNamespacedNameImpl().apply(block)
}

/**
 * KeyValueProperty#value: Expression
 * extension function for create Expression -> JSXEmptyExpressionImpl
 */
fun KeyValueProperty.jSXEmptyExpression(block: JSXEmptyExpression.() -> Unit): JSXEmptyExpression {
    return JSXEmptyExpressionImpl().apply(block)
}

/**
 * KeyValueProperty#value: Expression
 * extension function for create Expression -> JSXElementImpl
 */
fun KeyValueProperty.jSXElement(block: JSXElement.() -> Unit): JSXElement {
    return JSXElementImpl().apply(block)
}

/**
 * KeyValueProperty#value: Expression
 * extension function for create Expression -> JSXFragmentImpl
 */
fun KeyValueProperty.jSXFragment(block: JSXFragment.() -> Unit): JSXFragment {
    return JSXFragmentImpl().apply(block)
}

/**
 * KeyValueProperty#value: Expression
 * extension function for create Expression -> TsTypeAssertionImpl
 */
fun KeyValueProperty.tsTypeAssertion(block: TsTypeAssertion.() -> Unit): TsTypeAssertion {
    return TsTypeAssertionImpl().apply(block)
}

/**
 * KeyValueProperty#value: Expression
 * extension function for create Expression -> TsConstAssertionImpl
 */
fun KeyValueProperty.tsConstAssertion(block: TsConstAssertion.() -> Unit): TsConstAssertion {
    return TsConstAssertionImpl().apply(block)
}

/**
 * KeyValueProperty#value: Expression
 * extension function for create Expression -> TsNonNullExpressionImpl
 */
fun KeyValueProperty.tsNonNullExpression(block: TsNonNullExpression.() -> Unit): TsNonNullExpression {
    return TsNonNullExpressionImpl().apply(block)
}

/**
 * KeyValueProperty#value: Expression
 * extension function for create Expression -> TsAsExpressionImpl
 */
fun KeyValueProperty.tsAsExpression(block: TsAsExpression.() -> Unit): TsAsExpression {
    return TsAsExpressionImpl().apply(block)
}

/**
 * KeyValueProperty#value: Expression
 * extension function for create Expression -> TsSatisfiesExpressionImpl
 */
fun KeyValueProperty.tsSatisfiesExpression(block: TsSatisfiesExpression.() -> Unit): TsSatisfiesExpression {
    return TsSatisfiesExpressionImpl().apply(block)
}

/**
 * KeyValueProperty#value: Expression
 * extension function for create Expression -> TsInstantiationImpl
 */
fun KeyValueProperty.tsInstantiation(block: TsInstantiation.() -> Unit): TsInstantiation {
    return TsInstantiationImpl().apply(block)
}

/**
 * KeyValueProperty#value: Expression
 * extension function for create Expression -> PrivateNameImpl
 */
fun KeyValueProperty.privateName(block: PrivateName.() -> Unit): PrivateName {
    return PrivateNameImpl().apply(block)
}

/**
 * KeyValueProperty#value: Expression
 * extension function for create Expression -> OptionalChainingExpressionImpl
 */
fun KeyValueProperty.optionalChainingExpression(block: OptionalChainingExpression.() -> Unit): OptionalChainingExpression {
    return OptionalChainingExpressionImpl().apply(block)
}

/**
 * KeyValueProperty#value: Expression
 * extension function for create Expression -> InvalidImpl
 */
fun KeyValueProperty.invalid(block: Invalid.() -> Unit): Invalid {
    return InvalidImpl().apply(block)
}

/**
 * KeyValueProperty#key: PropertyName
 * extension function for create PropertyName -> ComputedPropNameImpl
 */
fun KeyValueProperty.computedPropName(block: ComputedPropName.() -> Unit): ComputedPropName {
    return ComputedPropNameImpl().apply(block)
}
