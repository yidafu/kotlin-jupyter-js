package dev.yidafu.swc.dsl

import dev.yidafu.swc.types.*

/**
 * MemberExpression#object: Expression
 * extension function for create Expression -> ThisExpressionImpl
 */
fun MemberExpression.thisExpression(block: ThisExpression.() -> Unit): ThisExpression {
    return ThisExpressionImpl().apply(block)
}

/**
 * MemberExpression#object: Expression
 * extension function for create Expression -> ArrayExpressionImpl
 */
fun MemberExpression.arrayExpression(block: ArrayExpression.() -> Unit): ArrayExpression {
    return ArrayExpressionImpl().apply(block)
}

/**
 * MemberExpression#object: Expression
 * extension function for create Expression -> ObjectExpressionImpl
 */
fun MemberExpression.objectExpression(block: ObjectExpression.() -> Unit): ObjectExpression {
    return ObjectExpressionImpl().apply(block)
}

/**
 * MemberExpression#object: Expression
 * extension function for create Expression -> FunctionExpressionImpl
 */
fun MemberExpression.functionExpression(block: FunctionExpression.() -> Unit): FunctionExpression {
    return FunctionExpressionImpl().apply(block)
}

/**
 * MemberExpression#object: Expression
 * extension function for create Expression -> UnaryExpressionImpl
 */
fun MemberExpression.unaryExpression(block: UnaryExpression.() -> Unit): UnaryExpression {
    return UnaryExpressionImpl().apply(block)
}

/**
 * MemberExpression#object: Expression
 * extension function for create Expression -> UpdateExpressionImpl
 */
fun MemberExpression.updateExpression(block: UpdateExpression.() -> Unit): UpdateExpression {
    return UpdateExpressionImpl().apply(block)
}

/**
 * MemberExpression#object: Expression
 * extension function for create Expression -> BinaryExpressionImpl
 */
fun MemberExpression.binaryExpression(block: BinaryExpression.() -> Unit): BinaryExpression {
    return BinaryExpressionImpl().apply(block)
}

/**
 * MemberExpression#object: Expression
 * extension function for create Expression -> AssignmentExpressionImpl
 */
fun MemberExpression.assignmentExpression(block: AssignmentExpression.() -> Unit): AssignmentExpression {
    return AssignmentExpressionImpl().apply(block)
}

/**
 * MemberExpression#object: Expression
 * extension function for create Expression -> SuperPropExpressionImpl
 */
fun MemberExpression.superPropExpression(block: SuperPropExpression.() -> Unit): SuperPropExpression {
    return SuperPropExpressionImpl().apply(block)
}

/**
 * MemberExpression#object: Expression
 * extension function for create Expression -> ConditionalExpressionImpl
 */
fun MemberExpression.conditionalExpression(block: ConditionalExpression.() -> Unit): ConditionalExpression {
    return ConditionalExpressionImpl().apply(block)
}

/**
 * MemberExpression#object: Expression
 * extension function for create Expression -> CallExpressionImpl
 */
fun MemberExpression.callExpression(block: CallExpression.() -> Unit): CallExpression {
    return CallExpressionImpl().apply(block)
}

/**
 * MemberExpression#object: Expression
 * extension function for create Expression -> NewExpressionImpl
 */
fun MemberExpression.newExpression(block: NewExpression.() -> Unit): NewExpression {
    return NewExpressionImpl().apply(block)
}

/**
 * MemberExpression#object: Expression
 * extension function for create Expression -> SequenceExpressionImpl
 */
fun MemberExpression.sequenceExpression(block: SequenceExpression.() -> Unit): SequenceExpression {
    return SequenceExpressionImpl().apply(block)
}

/**
 * MemberExpression#property: Union.U3<Identifier, PrivateName, ComputedPropName>
 * extension function for create Union.U3<Identifier, PrivateName, ComputedPropName> -> IdentifierImpl
 */
fun MemberExpression.identifier(block: Identifier.() -> Unit): Identifier {
    return IdentifierImpl().apply(block)
}

/**
 * MemberExpression#object: Expression
 * extension function for create Expression -> StringLiteralImpl
 */
fun MemberExpression.stringLiteral(block: StringLiteral.() -> Unit): StringLiteral {
    return StringLiteralImpl().apply(block)
}

/**
 * MemberExpression#object: Expression
 * extension function for create Expression -> BooleanLiteralImpl
 */
fun MemberExpression.booleanLiteral(block: BooleanLiteral.() -> Unit): BooleanLiteral {
    return BooleanLiteralImpl().apply(block)
}

/**
 * MemberExpression#object: Expression
 * extension function for create Expression -> NullLiteralImpl
 */
fun MemberExpression.nullLiteral(block: NullLiteral.() -> Unit): NullLiteral {
    return NullLiteralImpl().apply(block)
}

/**
 * MemberExpression#object: Expression
 * extension function for create Expression -> NumericLiteralImpl
 */
fun MemberExpression.numericLiteral(block: NumericLiteral.() -> Unit): NumericLiteral {
    return NumericLiteralImpl().apply(block)
}

/**
 * MemberExpression#object: Expression
 * extension function for create Expression -> BigIntLiteralImpl
 */
fun MemberExpression.bigIntLiteral(block: BigIntLiteral.() -> Unit): BigIntLiteral {
    return BigIntLiteralImpl().apply(block)
}

/**
 * MemberExpression#object: Expression
 * extension function for create Expression -> RegExpLiteralImpl
 */
fun MemberExpression.regExpLiteral(block: RegExpLiteral.() -> Unit): RegExpLiteral {
    return RegExpLiteralImpl().apply(block)
}

/**
 * MemberExpression#object: Expression
 * extension function for create Expression -> JSXTextImpl
 */
fun MemberExpression.jSXText(block: JSXText.() -> Unit): JSXText {
    return JSXTextImpl().apply(block)
}

/**
 * MemberExpression#object: Expression
 * extension function for create Expression -> TemplateLiteralImpl
 */
fun MemberExpression.templateLiteral(block: TemplateLiteral.() -> Unit): TemplateLiteral {
    return TemplateLiteralImpl().apply(block)
}

/**
 * MemberExpression#object: Expression
 * extension function for create Expression -> TaggedTemplateExpressionImpl
 */
fun MemberExpression.taggedTemplateExpression(block: TaggedTemplateExpression.() -> Unit): TaggedTemplateExpression {
    return TaggedTemplateExpressionImpl().apply(block)
}

/**
 * MemberExpression#object: Expression
 * extension function for create Expression -> ArrowFunctionExpressionImpl
 */
fun MemberExpression.arrowFunctionExpression(block: ArrowFunctionExpression.() -> Unit): ArrowFunctionExpression {
    return ArrowFunctionExpressionImpl().apply(block)
}

/**
 * MemberExpression#object: Expression
 * extension function for create Expression -> ClassExpressionImpl
 */
fun MemberExpression.classExpression(block: ClassExpression.() -> Unit): ClassExpression {
    return ClassExpressionImpl().apply(block)
}

/**
 * MemberExpression#object: Expression
 * extension function for create Expression -> YieldExpressionImpl
 */
fun MemberExpression.yieldExpression(block: YieldExpression.() -> Unit): YieldExpression {
    return YieldExpressionImpl().apply(block)
}

/**
 * MemberExpression#object: Expression
 * extension function for create Expression -> MetaPropertyImpl
 */
fun MemberExpression.metaProperty(block: MetaProperty.() -> Unit): MetaProperty {
    return MetaPropertyImpl().apply(block)
}

/**
 * MemberExpression#object: Expression
 * extension function for create Expression -> AwaitExpressionImpl
 */
fun MemberExpression.awaitExpression(block: AwaitExpression.() -> Unit): AwaitExpression {
    return AwaitExpressionImpl().apply(block)
}

/**
 * MemberExpression#object: Expression
 * extension function for create Expression -> ParenthesisExpressionImpl
 */
fun MemberExpression.parenthesisExpression(block: ParenthesisExpression.() -> Unit): ParenthesisExpression {
    return ParenthesisExpressionImpl().apply(block)
}

/**
 * MemberExpression#object: Expression
 * extension function for create Expression -> JSXMemberExpressionImpl
 */
fun MemberExpression.jSXMemberExpression(block: JSXMemberExpression.() -> Unit): JSXMemberExpression {
    return JSXMemberExpressionImpl().apply(block)
}

/**
 * MemberExpression#object: Expression
 * extension function for create Expression -> JSXNamespacedNameImpl
 */
fun MemberExpression.jSXNamespacedName(block: JSXNamespacedName.() -> Unit): JSXNamespacedName {
    return JSXNamespacedNameImpl().apply(block)
}

/**
 * MemberExpression#object: Expression
 * extension function for create Expression -> JSXEmptyExpressionImpl
 */
fun MemberExpression.jSXEmptyExpression(block: JSXEmptyExpression.() -> Unit): JSXEmptyExpression {
    return JSXEmptyExpressionImpl().apply(block)
}

/**
 * MemberExpression#object: Expression
 * extension function for create Expression -> JSXElementImpl
 */
fun MemberExpression.jSXElement(block: JSXElement.() -> Unit): JSXElement {
    return JSXElementImpl().apply(block)
}

/**
 * MemberExpression#object: Expression
 * extension function for create Expression -> JSXFragmentImpl
 */
fun MemberExpression.jSXFragment(block: JSXFragment.() -> Unit): JSXFragment {
    return JSXFragmentImpl().apply(block)
}

/**
 * MemberExpression#object: Expression
 * extension function for create Expression -> TsTypeAssertionImpl
 */
fun MemberExpression.tsTypeAssertion(block: TsTypeAssertion.() -> Unit): TsTypeAssertion {
    return TsTypeAssertionImpl().apply(block)
}

/**
 * MemberExpression#object: Expression
 * extension function for create Expression -> TsConstAssertionImpl
 */
fun MemberExpression.tsConstAssertion(block: TsConstAssertion.() -> Unit): TsConstAssertion {
    return TsConstAssertionImpl().apply(block)
}

/**
 * MemberExpression#object: Expression
 * extension function for create Expression -> TsNonNullExpressionImpl
 */
fun MemberExpression.tsNonNullExpression(block: TsNonNullExpression.() -> Unit): TsNonNullExpression {
    return TsNonNullExpressionImpl().apply(block)
}

/**
 * MemberExpression#object: Expression
 * extension function for create Expression -> TsAsExpressionImpl
 */
fun MemberExpression.tsAsExpression(block: TsAsExpression.() -> Unit): TsAsExpression {
    return TsAsExpressionImpl().apply(block)
}

/**
 * MemberExpression#object: Expression
 * extension function for create Expression -> TsSatisfiesExpressionImpl
 */
fun MemberExpression.tsSatisfiesExpression(block: TsSatisfiesExpression.() -> Unit): TsSatisfiesExpression {
    return TsSatisfiesExpressionImpl().apply(block)
}

/**
 * MemberExpression#object: Expression
 * extension function for create Expression -> TsInstantiationImpl
 */
fun MemberExpression.tsInstantiation(block: TsInstantiation.() -> Unit): TsInstantiation {
    return TsInstantiationImpl().apply(block)
}

/**
 * MemberExpression#property: Union.U3<Identifier, PrivateName, ComputedPropName>
 * extension function for create Union.U3<Identifier, PrivateName, ComputedPropName> -> PrivateNameImpl
 */
fun MemberExpression.privateName(block: PrivateName.() -> Unit): PrivateName {
    return PrivateNameImpl().apply(block)
}

/**
 * MemberExpression#object: Expression
 * extension function for create Expression -> OptionalChainingExpressionImpl
 */
fun MemberExpression.optionalChainingExpression(block: OptionalChainingExpression.() -> Unit): OptionalChainingExpression {
    return OptionalChainingExpressionImpl().apply(block)
}

/**
 * MemberExpression#object: Expression
 * extension function for create Expression -> InvalidImpl
 */
fun MemberExpression.invalid(block: Invalid.() -> Unit): Invalid {
    return InvalidImpl().apply(block)
}

/**
 * MemberExpression#property: Union.U3<Identifier, PrivateName, ComputedPropName>
 * extension function for create Union.U3<Identifier, PrivateName, ComputedPropName> -> ComputedPropNameImpl
 */
fun MemberExpression.computedPropName(block: ComputedPropName.() -> Unit): ComputedPropName {
    return ComputedPropNameImpl().apply(block)
}

fun MemberExpression.span(block: Span.() -> Unit): Span {
    return Span().apply(block)
}
