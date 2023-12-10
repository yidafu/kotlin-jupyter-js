package dev.yidafu.swc.dsl

import dev.yidafu.swc.types.*

/**
 * KeyValuePatternProperty#value: Pattern
 * extension function for create Pattern -> IdentifierImpl
 */
fun KeyValuePatternProperty.identifier(block: Identifier.() -> Unit): Identifier {
    return IdentifierImpl().apply(block)
}

/**
 * KeyValuePatternProperty#value: Pattern
 * extension function for create Pattern -> StringLiteralImpl
 */
fun KeyValuePatternProperty.stringLiteral(block: StringLiteral.() -> Unit): StringLiteral {
    return StringLiteralImpl().apply(block)
}

/**
 * KeyValuePatternProperty#value: Pattern
 * extension function for create Pattern -> NumericLiteralImpl
 */
fun KeyValuePatternProperty.numericLiteral(block: NumericLiteral.() -> Unit): NumericLiteral {
    return NumericLiteralImpl().apply(block)
}

/**
 * KeyValuePatternProperty#key: PropertyName
 * extension function for create PropertyName -> ComputedPropNameImpl
 */
fun KeyValuePatternProperty.computedPropName(block: ComputedPropName.() -> Unit): ComputedPropName {
    return ComputedPropNameImpl().apply(block)
}

/**
 * KeyValuePatternProperty#value: Pattern
 * extension function for create Pattern -> BigIntLiteralImpl
 */
fun KeyValuePatternProperty.bigIntLiteral(block: BigIntLiteral.() -> Unit): BigIntLiteral {
    return BigIntLiteralImpl().apply(block)
}

/**
 * KeyValuePatternProperty#value: Pattern
 * extension function for create Pattern -> BindingIdentifierImpl
 */
fun KeyValuePatternProperty.bindingIdentifier(block: BindingIdentifier.() -> Unit): BindingIdentifier {
    return BindingIdentifierImpl().apply(block)
}

/**
 * KeyValuePatternProperty#value: Pattern
 * extension function for create Pattern -> ArrayPatternImpl
 */
fun KeyValuePatternProperty.arrayPattern(block: ArrayPattern.() -> Unit): ArrayPattern {
    return ArrayPatternImpl().apply(block)
}

/**
 * KeyValuePatternProperty#value: Pattern
 * extension function for create Pattern -> RestElementImpl
 */
fun KeyValuePatternProperty.restElement(block: RestElement.() -> Unit): RestElement {
    return RestElementImpl().apply(block)
}

/**
 * KeyValuePatternProperty#value: Pattern
 * extension function for create Pattern -> ObjectPatternImpl
 */
fun KeyValuePatternProperty.objectPattern(block: ObjectPattern.() -> Unit): ObjectPattern {
    return ObjectPatternImpl().apply(block)
}

/**
 * KeyValuePatternProperty#value: Pattern
 * extension function for create Pattern -> AssignmentPatternImpl
 */
fun KeyValuePatternProperty.assignmentPattern(block: AssignmentPattern.() -> Unit): AssignmentPattern {
    return AssignmentPatternImpl().apply(block)
}

/**
 * KeyValuePatternProperty#value: Pattern
 * extension function for create Pattern -> InvalidImpl
 */
fun KeyValuePatternProperty.invalid(block: Invalid.() -> Unit): Invalid {
    return InvalidImpl().apply(block)
}

/**
 * KeyValuePatternProperty#value: Pattern
 * extension function for create Pattern -> ThisExpressionImpl
 */
fun KeyValuePatternProperty.thisExpression(block: ThisExpression.() -> Unit): ThisExpression {
    return ThisExpressionImpl().apply(block)
}

/**
 * KeyValuePatternProperty#value: Pattern
 * extension function for create Pattern -> ArrayExpressionImpl
 */
fun KeyValuePatternProperty.arrayExpression(block: ArrayExpression.() -> Unit): ArrayExpression {
    return ArrayExpressionImpl().apply(block)
}

/**
 * KeyValuePatternProperty#value: Pattern
 * extension function for create Pattern -> ObjectExpressionImpl
 */
fun KeyValuePatternProperty.objectExpression(block: ObjectExpression.() -> Unit): ObjectExpression {
    return ObjectExpressionImpl().apply(block)
}

/**
 * KeyValuePatternProperty#value: Pattern
 * extension function for create Pattern -> FunctionExpressionImpl
 */
fun KeyValuePatternProperty.functionExpression(block: FunctionExpression.() -> Unit): FunctionExpression {
    return FunctionExpressionImpl().apply(block)
}

/**
 * KeyValuePatternProperty#value: Pattern
 * extension function for create Pattern -> UnaryExpressionImpl
 */
fun KeyValuePatternProperty.unaryExpression(block: UnaryExpression.() -> Unit): UnaryExpression {
    return UnaryExpressionImpl().apply(block)
}

/**
 * KeyValuePatternProperty#value: Pattern
 * extension function for create Pattern -> UpdateExpressionImpl
 */
fun KeyValuePatternProperty.updateExpression(block: UpdateExpression.() -> Unit): UpdateExpression {
    return UpdateExpressionImpl().apply(block)
}

/**
 * KeyValuePatternProperty#value: Pattern
 * extension function for create Pattern -> BinaryExpressionImpl
 */
fun KeyValuePatternProperty.binaryExpression(block: BinaryExpression.() -> Unit): BinaryExpression {
    return BinaryExpressionImpl().apply(block)
}

/**
 * KeyValuePatternProperty#value: Pattern
 * extension function for create Pattern -> AssignmentExpressionImpl
 */
fun KeyValuePatternProperty.assignmentExpression(block: AssignmentExpression.() -> Unit): AssignmentExpression {
    return AssignmentExpressionImpl().apply(block)
}

/**
 * KeyValuePatternProperty#value: Pattern
 * extension function for create Pattern -> MemberExpressionImpl
 */
fun KeyValuePatternProperty.memberExpression(block: MemberExpression.() -> Unit): MemberExpression {
    return MemberExpressionImpl().apply(block)
}

/**
 * KeyValuePatternProperty#value: Pattern
 * extension function for create Pattern -> SuperPropExpressionImpl
 */
fun KeyValuePatternProperty.superPropExpression(block: SuperPropExpression.() -> Unit): SuperPropExpression {
    return SuperPropExpressionImpl().apply(block)
}

/**
 * KeyValuePatternProperty#value: Pattern
 * extension function for create Pattern -> ConditionalExpressionImpl
 */
fun KeyValuePatternProperty.conditionalExpression(block: ConditionalExpression.() -> Unit): ConditionalExpression {
    return ConditionalExpressionImpl().apply(block)
}

/**
 * KeyValuePatternProperty#value: Pattern
 * extension function for create Pattern -> CallExpressionImpl
 */
fun KeyValuePatternProperty.callExpression(block: CallExpression.() -> Unit): CallExpression {
    return CallExpressionImpl().apply(block)
}

/**
 * KeyValuePatternProperty#value: Pattern
 * extension function for create Pattern -> NewExpressionImpl
 */
fun KeyValuePatternProperty.newExpression(block: NewExpression.() -> Unit): NewExpression {
    return NewExpressionImpl().apply(block)
}

/**
 * KeyValuePatternProperty#value: Pattern
 * extension function for create Pattern -> SequenceExpressionImpl
 */
fun KeyValuePatternProperty.sequenceExpression(block: SequenceExpression.() -> Unit): SequenceExpression {
    return SequenceExpressionImpl().apply(block)
}

/**
 * KeyValuePatternProperty#value: Pattern
 * extension function for create Pattern -> BooleanLiteralImpl
 */
fun KeyValuePatternProperty.booleanLiteral(block: BooleanLiteral.() -> Unit): BooleanLiteral {
    return BooleanLiteralImpl().apply(block)
}

/**
 * KeyValuePatternProperty#value: Pattern
 * extension function for create Pattern -> NullLiteralImpl
 */
fun KeyValuePatternProperty.nullLiteral(block: NullLiteral.() -> Unit): NullLiteral {
    return NullLiteralImpl().apply(block)
}

/**
 * KeyValuePatternProperty#value: Pattern
 * extension function for create Pattern -> RegExpLiteralImpl
 */
fun KeyValuePatternProperty.regExpLiteral(block: RegExpLiteral.() -> Unit): RegExpLiteral {
    return RegExpLiteralImpl().apply(block)
}

/**
 * KeyValuePatternProperty#value: Pattern
 * extension function for create Pattern -> JSXTextImpl
 */
fun KeyValuePatternProperty.jSXText(block: JSXText.() -> Unit): JSXText {
    return JSXTextImpl().apply(block)
}

/**
 * KeyValuePatternProperty#value: Pattern
 * extension function for create Pattern -> TemplateLiteralImpl
 */
fun KeyValuePatternProperty.templateLiteral(block: TemplateLiteral.() -> Unit): TemplateLiteral {
    return TemplateLiteralImpl().apply(block)
}

/**
 * KeyValuePatternProperty#value: Pattern
 * extension function for create Pattern -> TaggedTemplateExpressionImpl
 */
fun KeyValuePatternProperty.taggedTemplateExpression(block: TaggedTemplateExpression.() -> Unit): TaggedTemplateExpression {
    return TaggedTemplateExpressionImpl().apply(block)
}

/**
 * KeyValuePatternProperty#value: Pattern
 * extension function for create Pattern -> ArrowFunctionExpressionImpl
 */
fun KeyValuePatternProperty.arrowFunctionExpression(block: ArrowFunctionExpression.() -> Unit): ArrowFunctionExpression {
    return ArrowFunctionExpressionImpl().apply(block)
}

/**
 * KeyValuePatternProperty#value: Pattern
 * extension function for create Pattern -> ClassExpressionImpl
 */
fun KeyValuePatternProperty.classExpression(block: ClassExpression.() -> Unit): ClassExpression {
    return ClassExpressionImpl().apply(block)
}

/**
 * KeyValuePatternProperty#value: Pattern
 * extension function for create Pattern -> YieldExpressionImpl
 */
fun KeyValuePatternProperty.yieldExpression(block: YieldExpression.() -> Unit): YieldExpression {
    return YieldExpressionImpl().apply(block)
}

/**
 * KeyValuePatternProperty#value: Pattern
 * extension function for create Pattern -> MetaPropertyImpl
 */
fun KeyValuePatternProperty.metaProperty(block: MetaProperty.() -> Unit): MetaProperty {
    return MetaPropertyImpl().apply(block)
}

/**
 * KeyValuePatternProperty#value: Pattern
 * extension function for create Pattern -> AwaitExpressionImpl
 */
fun KeyValuePatternProperty.awaitExpression(block: AwaitExpression.() -> Unit): AwaitExpression {
    return AwaitExpressionImpl().apply(block)
}

/**
 * KeyValuePatternProperty#value: Pattern
 * extension function for create Pattern -> ParenthesisExpressionImpl
 */
fun KeyValuePatternProperty.parenthesisExpression(block: ParenthesisExpression.() -> Unit): ParenthesisExpression {
    return ParenthesisExpressionImpl().apply(block)
}

/**
 * KeyValuePatternProperty#value: Pattern
 * extension function for create Pattern -> JSXMemberExpressionImpl
 */
fun KeyValuePatternProperty.jSXMemberExpression(block: JSXMemberExpression.() -> Unit): JSXMemberExpression {
    return JSXMemberExpressionImpl().apply(block)
}

/**
 * KeyValuePatternProperty#value: Pattern
 * extension function for create Pattern -> JSXNamespacedNameImpl
 */
fun KeyValuePatternProperty.jSXNamespacedName(block: JSXNamespacedName.() -> Unit): JSXNamespacedName {
    return JSXNamespacedNameImpl().apply(block)
}

/**
 * KeyValuePatternProperty#value: Pattern
 * extension function for create Pattern -> JSXEmptyExpressionImpl
 */
fun KeyValuePatternProperty.jSXEmptyExpression(block: JSXEmptyExpression.() -> Unit): JSXEmptyExpression {
    return JSXEmptyExpressionImpl().apply(block)
}

/**
 * KeyValuePatternProperty#value: Pattern
 * extension function for create Pattern -> JSXElementImpl
 */
fun KeyValuePatternProperty.jSXElement(block: JSXElement.() -> Unit): JSXElement {
    return JSXElementImpl().apply(block)
}

/**
 * KeyValuePatternProperty#value: Pattern
 * extension function for create Pattern -> JSXFragmentImpl
 */
fun KeyValuePatternProperty.jSXFragment(block: JSXFragment.() -> Unit): JSXFragment {
    return JSXFragmentImpl().apply(block)
}

/**
 * KeyValuePatternProperty#value: Pattern
 * extension function for create Pattern -> TsTypeAssertionImpl
 */
fun KeyValuePatternProperty.tsTypeAssertion(block: TsTypeAssertion.() -> Unit): TsTypeAssertion {
    return TsTypeAssertionImpl().apply(block)
}

/**
 * KeyValuePatternProperty#value: Pattern
 * extension function for create Pattern -> TsConstAssertionImpl
 */
fun KeyValuePatternProperty.tsConstAssertion(block: TsConstAssertion.() -> Unit): TsConstAssertion {
    return TsConstAssertionImpl().apply(block)
}

/**
 * KeyValuePatternProperty#value: Pattern
 * extension function for create Pattern -> TsNonNullExpressionImpl
 */
fun KeyValuePatternProperty.tsNonNullExpression(block: TsNonNullExpression.() -> Unit): TsNonNullExpression {
    return TsNonNullExpressionImpl().apply(block)
}

/**
 * KeyValuePatternProperty#value: Pattern
 * extension function for create Pattern -> TsAsExpressionImpl
 */
fun KeyValuePatternProperty.tsAsExpression(block: TsAsExpression.() -> Unit): TsAsExpression {
    return TsAsExpressionImpl().apply(block)
}

/**
 * KeyValuePatternProperty#value: Pattern
 * extension function for create Pattern -> TsSatisfiesExpressionImpl
 */
fun KeyValuePatternProperty.tsSatisfiesExpression(block: TsSatisfiesExpression.() -> Unit): TsSatisfiesExpression {
    return TsSatisfiesExpressionImpl().apply(block)
}

/**
 * KeyValuePatternProperty#value: Pattern
 * extension function for create Pattern -> TsInstantiationImpl
 */
fun KeyValuePatternProperty.tsInstantiation(block: TsInstantiation.() -> Unit): TsInstantiation {
    return TsInstantiationImpl().apply(block)
}

/**
 * KeyValuePatternProperty#value: Pattern
 * extension function for create Pattern -> PrivateNameImpl
 */
fun KeyValuePatternProperty.privateName(block: PrivateName.() -> Unit): PrivateName {
    return PrivateNameImpl().apply(block)
}

/**
 * KeyValuePatternProperty#value: Pattern
 * extension function for create Pattern -> OptionalChainingExpressionImpl
 */
fun KeyValuePatternProperty.optionalChainingExpression(block: OptionalChainingExpression.() -> Unit): OptionalChainingExpression {
    return OptionalChainingExpressionImpl().apply(block)
}
