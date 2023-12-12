package dev.yidafu.swc.dsl

import dev.yidafu.swc.types.*

/**
 * TsSetterSignature#key: Expression
 * extension function for create Expression -> ThisExpressionImpl
 */
fun TsSetterSignature.thisExpression(block: ThisExpression.() -> Unit): ThisExpression {
    return ThisExpressionImpl().apply(block)
}

/**
 * TsSetterSignature#key: Expression
 * extension function for create Expression -> ArrayExpressionImpl
 */
fun TsSetterSignature.arrayExpression(block: ArrayExpression.() -> Unit): ArrayExpression {
    return ArrayExpressionImpl().apply(block)
}

/**
 * TsSetterSignature#key: Expression
 * extension function for create Expression -> ObjectExpressionImpl
 */
fun TsSetterSignature.objectExpression(block: ObjectExpression.() -> Unit): ObjectExpression {
    return ObjectExpressionImpl().apply(block)
}

/**
 * TsSetterSignature#key: Expression
 * extension function for create Expression -> FunctionExpressionImpl
 */
fun TsSetterSignature.functionExpression(block: FunctionExpression.() -> Unit): FunctionExpression {
    return FunctionExpressionImpl().apply(block)
}

/**
 * TsSetterSignature#key: Expression
 * extension function for create Expression -> UnaryExpressionImpl
 */
fun TsSetterSignature.unaryExpression(block: UnaryExpression.() -> Unit): UnaryExpression {
    return UnaryExpressionImpl().apply(block)
}

/**
 * TsSetterSignature#key: Expression
 * extension function for create Expression -> UpdateExpressionImpl
 */
fun TsSetterSignature.updateExpression(block: UpdateExpression.() -> Unit): UpdateExpression {
    return UpdateExpressionImpl().apply(block)
}

/**
 * TsSetterSignature#key: Expression
 * extension function for create Expression -> BinaryExpressionImpl
 */
fun TsSetterSignature.binaryExpression(block: BinaryExpression.() -> Unit): BinaryExpression {
    return BinaryExpressionImpl().apply(block)
}

/**
 * TsSetterSignature#key: Expression
 * extension function for create Expression -> AssignmentExpressionImpl
 */
fun TsSetterSignature.assignmentExpression(block: AssignmentExpression.() -> Unit): AssignmentExpression {
    return AssignmentExpressionImpl().apply(block)
}

/**
 * TsSetterSignature#key: Expression
 * extension function for create Expression -> MemberExpressionImpl
 */
fun TsSetterSignature.memberExpression(block: MemberExpression.() -> Unit): MemberExpression {
    return MemberExpressionImpl().apply(block)
}

/**
 * TsSetterSignature#key: Expression
 * extension function for create Expression -> SuperPropExpressionImpl
 */
fun TsSetterSignature.superPropExpression(block: SuperPropExpression.() -> Unit): SuperPropExpression {
    return SuperPropExpressionImpl().apply(block)
}

/**
 * TsSetterSignature#key: Expression
 * extension function for create Expression -> ConditionalExpressionImpl
 */
fun TsSetterSignature.conditionalExpression(block: ConditionalExpression.() -> Unit): ConditionalExpression {
    return ConditionalExpressionImpl().apply(block)
}

/**
 * TsSetterSignature#key: Expression
 * extension function for create Expression -> CallExpressionImpl
 */
fun TsSetterSignature.callExpression(block: CallExpression.() -> Unit): CallExpression {
    return CallExpressionImpl().apply(block)
}

/**
 * TsSetterSignature#key: Expression
 * extension function for create Expression -> NewExpressionImpl
 */
fun TsSetterSignature.newExpression(block: NewExpression.() -> Unit): NewExpression {
    return NewExpressionImpl().apply(block)
}

/**
 * TsSetterSignature#key: Expression
 * extension function for create Expression -> SequenceExpressionImpl
 */
fun TsSetterSignature.sequenceExpression(block: SequenceExpression.() -> Unit): SequenceExpression {
    return SequenceExpressionImpl().apply(block)
}

/**
 * TsSetterSignature#key: Expression
 * extension function for create Expression -> IdentifierImpl
 */
fun TsSetterSignature.identifier(block: Identifier.() -> Unit): Identifier {
    return IdentifierImpl().apply(block)
}

/**
 * TsSetterSignature#key: Expression
 * extension function for create Expression -> StringLiteralImpl
 */
fun TsSetterSignature.stringLiteral(block: StringLiteral.() -> Unit): StringLiteral {
    return StringLiteralImpl().apply(block)
}

/**
 * TsSetterSignature#key: Expression
 * extension function for create Expression -> BooleanLiteralImpl
 */
fun TsSetterSignature.booleanLiteral(block: BooleanLiteral.() -> Unit): BooleanLiteral {
    return BooleanLiteralImpl().apply(block)
}

/**
 * TsSetterSignature#key: Expression
 * extension function for create Expression -> NullLiteralImpl
 */
fun TsSetterSignature.nullLiteral(block: NullLiteral.() -> Unit): NullLiteral {
    return NullLiteralImpl().apply(block)
}

/**
 * TsSetterSignature#key: Expression
 * extension function for create Expression -> NumericLiteralImpl
 */
fun TsSetterSignature.numericLiteral(block: NumericLiteral.() -> Unit): NumericLiteral {
    return NumericLiteralImpl().apply(block)
}

/**
 * TsSetterSignature#key: Expression
 * extension function for create Expression -> BigIntLiteralImpl
 */
fun TsSetterSignature.bigIntLiteral(block: BigIntLiteral.() -> Unit): BigIntLiteral {
    return BigIntLiteralImpl().apply(block)
}

/**
 * TsSetterSignature#key: Expression
 * extension function for create Expression -> RegExpLiteralImpl
 */
fun TsSetterSignature.regExpLiteral(block: RegExpLiteral.() -> Unit): RegExpLiteral {
    return RegExpLiteralImpl().apply(block)
}

/**
 * TsSetterSignature#key: Expression
 * extension function for create Expression -> JSXTextImpl
 */
fun TsSetterSignature.jSXText(block: JSXText.() -> Unit): JSXText {
    return JSXTextImpl().apply(block)
}

/**
 * TsSetterSignature#key: Expression
 * extension function for create Expression -> TemplateLiteralImpl
 */
fun TsSetterSignature.templateLiteral(block: TemplateLiteral.() -> Unit): TemplateLiteral {
    return TemplateLiteralImpl().apply(block)
}

/**
 * TsSetterSignature#key: Expression
 * extension function for create Expression -> TaggedTemplateExpressionImpl
 */
fun TsSetterSignature.taggedTemplateExpression(block: TaggedTemplateExpression.() -> Unit): TaggedTemplateExpression {
    return TaggedTemplateExpressionImpl().apply(block)
}

/**
 * TsSetterSignature#key: Expression
 * extension function for create Expression -> ArrowFunctionExpressionImpl
 */
fun TsSetterSignature.arrowFunctionExpression(block: ArrowFunctionExpression.() -> Unit): ArrowFunctionExpression {
    return ArrowFunctionExpressionImpl().apply(block)
}

/**
 * TsSetterSignature#key: Expression
 * extension function for create Expression -> ClassExpressionImpl
 */
fun TsSetterSignature.classExpression(block: ClassExpression.() -> Unit): ClassExpression {
    return ClassExpressionImpl().apply(block)
}

/**
 * TsSetterSignature#key: Expression
 * extension function for create Expression -> YieldExpressionImpl
 */
fun TsSetterSignature.yieldExpression(block: YieldExpression.() -> Unit): YieldExpression {
    return YieldExpressionImpl().apply(block)
}

/**
 * TsSetterSignature#key: Expression
 * extension function for create Expression -> MetaPropertyImpl
 */
fun TsSetterSignature.metaProperty(block: MetaProperty.() -> Unit): MetaProperty {
    return MetaPropertyImpl().apply(block)
}

/**
 * TsSetterSignature#key: Expression
 * extension function for create Expression -> AwaitExpressionImpl
 */
fun TsSetterSignature.awaitExpression(block: AwaitExpression.() -> Unit): AwaitExpression {
    return AwaitExpressionImpl().apply(block)
}

/**
 * TsSetterSignature#key: Expression
 * extension function for create Expression -> ParenthesisExpressionImpl
 */
fun TsSetterSignature.parenthesisExpression(block: ParenthesisExpression.() -> Unit): ParenthesisExpression {
    return ParenthesisExpressionImpl().apply(block)
}

/**
 * TsSetterSignature#key: Expression
 * extension function for create Expression -> JSXMemberExpressionImpl
 */
fun TsSetterSignature.jSXMemberExpression(block: JSXMemberExpression.() -> Unit): JSXMemberExpression {
    return JSXMemberExpressionImpl().apply(block)
}

/**
 * TsSetterSignature#key: Expression
 * extension function for create Expression -> JSXNamespacedNameImpl
 */
fun TsSetterSignature.jSXNamespacedName(block: JSXNamespacedName.() -> Unit): JSXNamespacedName {
    return JSXNamespacedNameImpl().apply(block)
}

/**
 * TsSetterSignature#key: Expression
 * extension function for create Expression -> JSXEmptyExpressionImpl
 */
fun TsSetterSignature.jSXEmptyExpression(block: JSXEmptyExpression.() -> Unit): JSXEmptyExpression {
    return JSXEmptyExpressionImpl().apply(block)
}

/**
 * TsSetterSignature#key: Expression
 * extension function for create Expression -> JSXElementImpl
 */
fun TsSetterSignature.jSXElement(block: JSXElement.() -> Unit): JSXElement {
    return JSXElementImpl().apply(block)
}

/**
 * TsSetterSignature#key: Expression
 * extension function for create Expression -> JSXFragmentImpl
 */
fun TsSetterSignature.jSXFragment(block: JSXFragment.() -> Unit): JSXFragment {
    return JSXFragmentImpl().apply(block)
}

/**
 * TsSetterSignature#key: Expression
 * extension function for create Expression -> TsTypeAssertionImpl
 */
fun TsSetterSignature.tsTypeAssertion(block: TsTypeAssertion.() -> Unit): TsTypeAssertion {
    return TsTypeAssertionImpl().apply(block)
}

/**
 * TsSetterSignature#key: Expression
 * extension function for create Expression -> TsConstAssertionImpl
 */
fun TsSetterSignature.tsConstAssertion(block: TsConstAssertion.() -> Unit): TsConstAssertion {
    return TsConstAssertionImpl().apply(block)
}

/**
 * TsSetterSignature#key: Expression
 * extension function for create Expression -> TsNonNullExpressionImpl
 */
fun TsSetterSignature.tsNonNullExpression(block: TsNonNullExpression.() -> Unit): TsNonNullExpression {
    return TsNonNullExpressionImpl().apply(block)
}

/**
 * TsSetterSignature#key: Expression
 * extension function for create Expression -> TsAsExpressionImpl
 */
fun TsSetterSignature.tsAsExpression(block: TsAsExpression.() -> Unit): TsAsExpression {
    return TsAsExpressionImpl().apply(block)
}

/**
 * TsSetterSignature#key: Expression
 * extension function for create Expression -> TsSatisfiesExpressionImpl
 */
fun TsSetterSignature.tsSatisfiesExpression(block: TsSatisfiesExpression.() -> Unit): TsSatisfiesExpression {
    return TsSatisfiesExpressionImpl().apply(block)
}

/**
 * TsSetterSignature#key: Expression
 * extension function for create Expression -> TsInstantiationImpl
 */
fun TsSetterSignature.tsInstantiation(block: TsInstantiation.() -> Unit): TsInstantiation {
    return TsInstantiationImpl().apply(block)
}

/**
 * TsSetterSignature#key: Expression
 * extension function for create Expression -> PrivateNameImpl
 */
fun TsSetterSignature.privateName(block: PrivateName.() -> Unit): PrivateName {
    return PrivateNameImpl().apply(block)
}

/**
 * TsSetterSignature#key: Expression
 * extension function for create Expression -> OptionalChainingExpressionImpl
 */
fun TsSetterSignature.optionalChainingExpression(block: OptionalChainingExpression.() -> Unit): OptionalChainingExpression {
    return OptionalChainingExpressionImpl().apply(block)
}

/**
 * TsSetterSignature#key: Expression
 * extension function for create Expression -> InvalidImpl
 */
fun TsSetterSignature.invalid(block: Invalid.() -> Unit): Invalid {
    return InvalidImpl().apply(block)
}

/**
 * TsSetterSignature#param: TsFnParameter
 * extension function for create TsFnParameter -> BindingIdentifierImpl
 */
fun TsSetterSignature.bindingIdentifier(block: BindingIdentifier.() -> Unit): BindingIdentifier {
    return BindingIdentifierImpl().apply(block)
}

/**
 * TsSetterSignature#param: TsFnParameter
 * extension function for create TsFnParameter -> ArrayPatternImpl
 */
fun TsSetterSignature.arrayPattern(block: ArrayPattern.() -> Unit): ArrayPattern {
    return ArrayPatternImpl().apply(block)
}

/**
 * TsSetterSignature#param: TsFnParameter
 * extension function for create TsFnParameter -> RestElementImpl
 */
fun TsSetterSignature.restElement(block: RestElement.() -> Unit): RestElement {
    return RestElementImpl().apply(block)
}

/**
 * TsSetterSignature#param: TsFnParameter
 * extension function for create TsFnParameter -> ObjectPatternImpl
 */
fun TsSetterSignature.objectPattern(block: ObjectPattern.() -> Unit): ObjectPattern {
    return ObjectPatternImpl().apply(block)
}

fun TsSetterSignature.span(block: Span.() -> Unit): Span {
    return Span().apply(block)
}
