package dev.yidafu.swc.dsl

import dev.yidafu.swc.types.*

/**
 * TsInstantiation#expression: Expression
 * extension function for create Expression -> ThisExpressionImpl
 */
fun TsInstantiation.thisExpression(block: ThisExpression.() -> Unit): ThisExpression {
    return ThisExpressionImpl().apply(block)
}

/**
 * TsInstantiation#expression: Expression
 * extension function for create Expression -> ArrayExpressionImpl
 */
fun TsInstantiation.arrayExpression(block: ArrayExpression.() -> Unit): ArrayExpression {
    return ArrayExpressionImpl().apply(block)
}

/**
 * TsInstantiation#expression: Expression
 * extension function for create Expression -> ObjectExpressionImpl
 */
fun TsInstantiation.objectExpression(block: ObjectExpression.() -> Unit): ObjectExpression {
    return ObjectExpressionImpl().apply(block)
}

/**
 * TsInstantiation#expression: Expression
 * extension function for create Expression -> FunctionExpressionImpl
 */
fun TsInstantiation.functionExpression(block: FunctionExpression.() -> Unit): FunctionExpression {
    return FunctionExpressionImpl().apply(block)
}

/**
 * TsInstantiation#expression: Expression
 * extension function for create Expression -> UnaryExpressionImpl
 */
fun TsInstantiation.unaryExpression(block: UnaryExpression.() -> Unit): UnaryExpression {
    return UnaryExpressionImpl().apply(block)
}

/**
 * TsInstantiation#expression: Expression
 * extension function for create Expression -> UpdateExpressionImpl
 */
fun TsInstantiation.updateExpression(block: UpdateExpression.() -> Unit): UpdateExpression {
    return UpdateExpressionImpl().apply(block)
}

/**
 * TsInstantiation#expression: Expression
 * extension function for create Expression -> BinaryExpressionImpl
 */
fun TsInstantiation.binaryExpression(block: BinaryExpression.() -> Unit): BinaryExpression {
    return BinaryExpressionImpl().apply(block)
}

/**
 * TsInstantiation#expression: Expression
 * extension function for create Expression -> AssignmentExpressionImpl
 */
fun TsInstantiation.assignmentExpression(block: AssignmentExpression.() -> Unit): AssignmentExpression {
    return AssignmentExpressionImpl().apply(block)
}

/**
 * TsInstantiation#expression: Expression
 * extension function for create Expression -> MemberExpressionImpl
 */
fun TsInstantiation.memberExpression(block: MemberExpression.() -> Unit): MemberExpression {
    return MemberExpressionImpl().apply(block)
}

/**
 * TsInstantiation#expression: Expression
 * extension function for create Expression -> SuperPropExpressionImpl
 */
fun TsInstantiation.superPropExpression(block: SuperPropExpression.() -> Unit): SuperPropExpression {
    return SuperPropExpressionImpl().apply(block)
}

/**
 * TsInstantiation#expression: Expression
 * extension function for create Expression -> ConditionalExpressionImpl
 */
fun TsInstantiation.conditionalExpression(block: ConditionalExpression.() -> Unit): ConditionalExpression {
    return ConditionalExpressionImpl().apply(block)
}

/**
 * TsInstantiation#expression: Expression
 * extension function for create Expression -> CallExpressionImpl
 */
fun TsInstantiation.callExpression(block: CallExpression.() -> Unit): CallExpression {
    return CallExpressionImpl().apply(block)
}

/**
 * TsInstantiation#expression: Expression
 * extension function for create Expression -> NewExpressionImpl
 */
fun TsInstantiation.newExpression(block: NewExpression.() -> Unit): NewExpression {
    return NewExpressionImpl().apply(block)
}

/**
 * TsInstantiation#expression: Expression
 * extension function for create Expression -> SequenceExpressionImpl
 */
fun TsInstantiation.sequenceExpression(block: SequenceExpression.() -> Unit): SequenceExpression {
    return SequenceExpressionImpl().apply(block)
}

/**
 * TsInstantiation#expression: Expression
 * extension function for create Expression -> IdentifierImpl
 */
fun TsInstantiation.identifier(block: Identifier.() -> Unit): Identifier {
    return IdentifierImpl().apply(block)
}

/**
 * TsInstantiation#expression: Expression
 * extension function for create Expression -> StringLiteralImpl
 */
fun TsInstantiation.stringLiteral(block: StringLiteral.() -> Unit): StringLiteral {
    return StringLiteralImpl().apply(block)
}

/**
 * TsInstantiation#expression: Expression
 * extension function for create Expression -> BooleanLiteralImpl
 */
fun TsInstantiation.booleanLiteral(block: BooleanLiteral.() -> Unit): BooleanLiteral {
    return BooleanLiteralImpl().apply(block)
}

/**
 * TsInstantiation#expression: Expression
 * extension function for create Expression -> NullLiteralImpl
 */
fun TsInstantiation.nullLiteral(block: NullLiteral.() -> Unit): NullLiteral {
    return NullLiteralImpl().apply(block)
}

/**
 * TsInstantiation#expression: Expression
 * extension function for create Expression -> NumericLiteralImpl
 */
fun TsInstantiation.numericLiteral(block: NumericLiteral.() -> Unit): NumericLiteral {
    return NumericLiteralImpl().apply(block)
}

/**
 * TsInstantiation#expression: Expression
 * extension function for create Expression -> BigIntLiteralImpl
 */
fun TsInstantiation.bigIntLiteral(block: BigIntLiteral.() -> Unit): BigIntLiteral {
    return BigIntLiteralImpl().apply(block)
}

/**
 * TsInstantiation#expression: Expression
 * extension function for create Expression -> RegExpLiteralImpl
 */
fun TsInstantiation.regExpLiteral(block: RegExpLiteral.() -> Unit): RegExpLiteral {
    return RegExpLiteralImpl().apply(block)
}

/**
 * TsInstantiation#expression: Expression
 * extension function for create Expression -> JSXTextImpl
 */
fun TsInstantiation.jSXText(block: JSXText.() -> Unit): JSXText {
    return JSXTextImpl().apply(block)
}

/**
 * TsInstantiation#expression: Expression
 * extension function for create Expression -> TemplateLiteralImpl
 */
fun TsInstantiation.templateLiteral(block: TemplateLiteral.() -> Unit): TemplateLiteral {
    return TemplateLiteralImpl().apply(block)
}

/**
 * TsInstantiation#expression: Expression
 * extension function for create Expression -> TaggedTemplateExpressionImpl
 */
fun TsInstantiation.taggedTemplateExpression(block: TaggedTemplateExpression.() -> Unit): TaggedTemplateExpression {
    return TaggedTemplateExpressionImpl().apply(block)
}

/**
 * TsInstantiation#expression: Expression
 * extension function for create Expression -> ArrowFunctionExpressionImpl
 */
fun TsInstantiation.arrowFunctionExpression(block: ArrowFunctionExpression.() -> Unit): ArrowFunctionExpression {
    return ArrowFunctionExpressionImpl().apply(block)
}

/**
 * TsInstantiation#expression: Expression
 * extension function for create Expression -> ClassExpressionImpl
 */
fun TsInstantiation.classExpression(block: ClassExpression.() -> Unit): ClassExpression {
    return ClassExpressionImpl().apply(block)
}

/**
 * TsInstantiation#expression: Expression
 * extension function for create Expression -> YieldExpressionImpl
 */
fun TsInstantiation.yieldExpression(block: YieldExpression.() -> Unit): YieldExpression {
    return YieldExpressionImpl().apply(block)
}

/**
 * TsInstantiation#expression: Expression
 * extension function for create Expression -> MetaPropertyImpl
 */
fun TsInstantiation.metaProperty(block: MetaProperty.() -> Unit): MetaProperty {
    return MetaPropertyImpl().apply(block)
}

/**
 * TsInstantiation#expression: Expression
 * extension function for create Expression -> AwaitExpressionImpl
 */
fun TsInstantiation.awaitExpression(block: AwaitExpression.() -> Unit): AwaitExpression {
    return AwaitExpressionImpl().apply(block)
}

/**
 * TsInstantiation#expression: Expression
 * extension function for create Expression -> ParenthesisExpressionImpl
 */
fun TsInstantiation.parenthesisExpression(block: ParenthesisExpression.() -> Unit): ParenthesisExpression {
    return ParenthesisExpressionImpl().apply(block)
}

/**
 * TsInstantiation#expression: Expression
 * extension function for create Expression -> JSXMemberExpressionImpl
 */
fun TsInstantiation.jSXMemberExpression(block: JSXMemberExpression.() -> Unit): JSXMemberExpression {
    return JSXMemberExpressionImpl().apply(block)
}

/**
 * TsInstantiation#expression: Expression
 * extension function for create Expression -> JSXNamespacedNameImpl
 */
fun TsInstantiation.jSXNamespacedName(block: JSXNamespacedName.() -> Unit): JSXNamespacedName {
    return JSXNamespacedNameImpl().apply(block)
}

/**
 * TsInstantiation#expression: Expression
 * extension function for create Expression -> JSXEmptyExpressionImpl
 */
fun TsInstantiation.jSXEmptyExpression(block: JSXEmptyExpression.() -> Unit): JSXEmptyExpression {
    return JSXEmptyExpressionImpl().apply(block)
}

/**
 * TsInstantiation#expression: Expression
 * extension function for create Expression -> JSXElementImpl
 */
fun TsInstantiation.jSXElement(block: JSXElement.() -> Unit): JSXElement {
    return JSXElementImpl().apply(block)
}

/**
 * TsInstantiation#expression: Expression
 * extension function for create Expression -> JSXFragmentImpl
 */
fun TsInstantiation.jSXFragment(block: JSXFragment.() -> Unit): JSXFragment {
    return JSXFragmentImpl().apply(block)
}

/**
 * TsInstantiation#expression: Expression
 * extension function for create Expression -> TsTypeAssertionImpl
 */
fun TsInstantiation.tsTypeAssertion(block: TsTypeAssertion.() -> Unit): TsTypeAssertion {
    return TsTypeAssertionImpl().apply(block)
}

/**
 * TsInstantiation#expression: Expression
 * extension function for create Expression -> TsConstAssertionImpl
 */
fun TsInstantiation.tsConstAssertion(block: TsConstAssertion.() -> Unit): TsConstAssertion {
    return TsConstAssertionImpl().apply(block)
}

/**
 * TsInstantiation#expression: Expression
 * extension function for create Expression -> TsNonNullExpressionImpl
 */
fun TsInstantiation.tsNonNullExpression(block: TsNonNullExpression.() -> Unit): TsNonNullExpression {
    return TsNonNullExpressionImpl().apply(block)
}

/**
 * TsInstantiation#expression: Expression
 * extension function for create Expression -> TsAsExpressionImpl
 */
fun TsInstantiation.tsAsExpression(block: TsAsExpression.() -> Unit): TsAsExpression {
    return TsAsExpressionImpl().apply(block)
}

/**
 * TsInstantiation#expression: Expression
 * extension function for create Expression -> TsSatisfiesExpressionImpl
 */
fun TsInstantiation.tsSatisfiesExpression(block: TsSatisfiesExpression.() -> Unit): TsSatisfiesExpression {
    return TsSatisfiesExpressionImpl().apply(block)
}

/**
 * TsInstantiation#expression: Expression
 * extension function for create Expression -> PrivateNameImpl
 */
fun TsInstantiation.privateName(block: PrivateName.() -> Unit): PrivateName {
    return PrivateNameImpl().apply(block)
}

/**
 * TsInstantiation#expression: Expression
 * extension function for create Expression -> OptionalChainingExpressionImpl
 */
fun TsInstantiation.optionalChainingExpression(block: OptionalChainingExpression.() -> Unit): OptionalChainingExpression {
    return OptionalChainingExpressionImpl().apply(block)
}

/**
 * TsInstantiation#expression: Expression
 * extension function for create Expression -> InvalidImpl
 */
fun TsInstantiation.invalid(block: Invalid.() -> Unit): Invalid {
    return InvalidImpl().apply(block)
}

/**
 * TsInstantiation#typeArguments: TsTypeParameterInstantiation
 * extension function for create TsTypeParameterInstantiation -> TsTypeParameterInstantiationImpl
 */
fun TsInstantiation.tsTypeParameterInstantiation(block: TsTypeParameterInstantiation.() -> Unit): TsTypeParameterInstantiation {
    return TsTypeParameterInstantiationImpl().apply(block)
}

fun TsInstantiation.span(block: Span.() -> Unit): Span {
    return Span().apply(block)
}
