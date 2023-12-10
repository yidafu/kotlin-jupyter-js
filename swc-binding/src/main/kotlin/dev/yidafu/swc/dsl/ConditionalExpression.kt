package dev.yidafu.swc.dsl

import dev.yidafu.swc.types.*

/**
 * ConditionalExpression#alternate: Expression
 * extension function for create Expression -> ThisExpressionImpl
 */
fun ConditionalExpression.thisExpression(block: ThisExpression.() -> Unit): ThisExpression {
    return ThisExpressionImpl().apply(block)
}

/**
 * ConditionalExpression#alternate: Expression
 * extension function for create Expression -> ArrayExpressionImpl
 */
fun ConditionalExpression.arrayExpression(block: ArrayExpression.() -> Unit): ArrayExpression {
    return ArrayExpressionImpl().apply(block)
}

/**
 * ConditionalExpression#alternate: Expression
 * extension function for create Expression -> ObjectExpressionImpl
 */
fun ConditionalExpression.objectExpression(block: ObjectExpression.() -> Unit): ObjectExpression {
    return ObjectExpressionImpl().apply(block)
}

/**
 * ConditionalExpression#alternate: Expression
 * extension function for create Expression -> FunctionExpressionImpl
 */
fun ConditionalExpression.functionExpression(block: FunctionExpression.() -> Unit): FunctionExpression {
    return FunctionExpressionImpl().apply(block)
}

/**
 * ConditionalExpression#alternate: Expression
 * extension function for create Expression -> UnaryExpressionImpl
 */
fun ConditionalExpression.unaryExpression(block: UnaryExpression.() -> Unit): UnaryExpression {
    return UnaryExpressionImpl().apply(block)
}

/**
 * ConditionalExpression#alternate: Expression
 * extension function for create Expression -> UpdateExpressionImpl
 */
fun ConditionalExpression.updateExpression(block: UpdateExpression.() -> Unit): UpdateExpression {
    return UpdateExpressionImpl().apply(block)
}

/**
 * ConditionalExpression#alternate: Expression
 * extension function for create Expression -> BinaryExpressionImpl
 */
fun ConditionalExpression.binaryExpression(block: BinaryExpression.() -> Unit): BinaryExpression {
    return BinaryExpressionImpl().apply(block)
}

/**
 * ConditionalExpression#alternate: Expression
 * extension function for create Expression -> AssignmentExpressionImpl
 */
fun ConditionalExpression.assignmentExpression(block: AssignmentExpression.() -> Unit): AssignmentExpression {
    return AssignmentExpressionImpl().apply(block)
}

/**
 * ConditionalExpression#alternate: Expression
 * extension function for create Expression -> MemberExpressionImpl
 */
fun ConditionalExpression.memberExpression(block: MemberExpression.() -> Unit): MemberExpression {
    return MemberExpressionImpl().apply(block)
}

/**
 * ConditionalExpression#alternate: Expression
 * extension function for create Expression -> SuperPropExpressionImpl
 */
fun ConditionalExpression.superPropExpression(block: SuperPropExpression.() -> Unit): SuperPropExpression {
    return SuperPropExpressionImpl().apply(block)
}

/**
 * ConditionalExpression#alternate: Expression
 * extension function for create Expression -> CallExpressionImpl
 */
fun ConditionalExpression.callExpression(block: CallExpression.() -> Unit): CallExpression {
    return CallExpressionImpl().apply(block)
}

/**
 * ConditionalExpression#alternate: Expression
 * extension function for create Expression -> NewExpressionImpl
 */
fun ConditionalExpression.newExpression(block: NewExpression.() -> Unit): NewExpression {
    return NewExpressionImpl().apply(block)
}

/**
 * ConditionalExpression#alternate: Expression
 * extension function for create Expression -> SequenceExpressionImpl
 */
fun ConditionalExpression.sequenceExpression(block: SequenceExpression.() -> Unit): SequenceExpression {
    return SequenceExpressionImpl().apply(block)
}

/**
 * ConditionalExpression#alternate: Expression
 * extension function for create Expression -> IdentifierImpl
 */
fun ConditionalExpression.identifier(block: Identifier.() -> Unit): Identifier {
    return IdentifierImpl().apply(block)
}

/**
 * ConditionalExpression#alternate: Expression
 * extension function for create Expression -> StringLiteralImpl
 */
fun ConditionalExpression.stringLiteral(block: StringLiteral.() -> Unit): StringLiteral {
    return StringLiteralImpl().apply(block)
}

/**
 * ConditionalExpression#alternate: Expression
 * extension function for create Expression -> BooleanLiteralImpl
 */
fun ConditionalExpression.booleanLiteral(block: BooleanLiteral.() -> Unit): BooleanLiteral {
    return BooleanLiteralImpl().apply(block)
}

/**
 * ConditionalExpression#alternate: Expression
 * extension function for create Expression -> NullLiteralImpl
 */
fun ConditionalExpression.nullLiteral(block: NullLiteral.() -> Unit): NullLiteral {
    return NullLiteralImpl().apply(block)
}

/**
 * ConditionalExpression#alternate: Expression
 * extension function for create Expression -> NumericLiteralImpl
 */
fun ConditionalExpression.numericLiteral(block: NumericLiteral.() -> Unit): NumericLiteral {
    return NumericLiteralImpl().apply(block)
}

/**
 * ConditionalExpression#alternate: Expression
 * extension function for create Expression -> BigIntLiteralImpl
 */
fun ConditionalExpression.bigIntLiteral(block: BigIntLiteral.() -> Unit): BigIntLiteral {
    return BigIntLiteralImpl().apply(block)
}

/**
 * ConditionalExpression#alternate: Expression
 * extension function for create Expression -> RegExpLiteralImpl
 */
fun ConditionalExpression.regExpLiteral(block: RegExpLiteral.() -> Unit): RegExpLiteral {
    return RegExpLiteralImpl().apply(block)
}

/**
 * ConditionalExpression#alternate: Expression
 * extension function for create Expression -> JSXTextImpl
 */
fun ConditionalExpression.jSXText(block: JSXText.() -> Unit): JSXText {
    return JSXTextImpl().apply(block)
}

/**
 * ConditionalExpression#alternate: Expression
 * extension function for create Expression -> TemplateLiteralImpl
 */
fun ConditionalExpression.templateLiteral(block: TemplateLiteral.() -> Unit): TemplateLiteral {
    return TemplateLiteralImpl().apply(block)
}

/**
 * ConditionalExpression#alternate: Expression
 * extension function for create Expression -> TaggedTemplateExpressionImpl
 */
fun ConditionalExpression.taggedTemplateExpression(block: TaggedTemplateExpression.() -> Unit): TaggedTemplateExpression {
    return TaggedTemplateExpressionImpl().apply(block)
}

/**
 * ConditionalExpression#alternate: Expression
 * extension function for create Expression -> ArrowFunctionExpressionImpl
 */
fun ConditionalExpression.arrowFunctionExpression(block: ArrowFunctionExpression.() -> Unit): ArrowFunctionExpression {
    return ArrowFunctionExpressionImpl().apply(block)
}

/**
 * ConditionalExpression#alternate: Expression
 * extension function for create Expression -> ClassExpressionImpl
 */
fun ConditionalExpression.classExpression(block: ClassExpression.() -> Unit): ClassExpression {
    return ClassExpressionImpl().apply(block)
}

/**
 * ConditionalExpression#alternate: Expression
 * extension function for create Expression -> YieldExpressionImpl
 */
fun ConditionalExpression.yieldExpression(block: YieldExpression.() -> Unit): YieldExpression {
    return YieldExpressionImpl().apply(block)
}

/**
 * ConditionalExpression#alternate: Expression
 * extension function for create Expression -> MetaPropertyImpl
 */
fun ConditionalExpression.metaProperty(block: MetaProperty.() -> Unit): MetaProperty {
    return MetaPropertyImpl().apply(block)
}

/**
 * ConditionalExpression#alternate: Expression
 * extension function for create Expression -> AwaitExpressionImpl
 */
fun ConditionalExpression.awaitExpression(block: AwaitExpression.() -> Unit): AwaitExpression {
    return AwaitExpressionImpl().apply(block)
}

/**
 * ConditionalExpression#alternate: Expression
 * extension function for create Expression -> ParenthesisExpressionImpl
 */
fun ConditionalExpression.parenthesisExpression(block: ParenthesisExpression.() -> Unit): ParenthesisExpression {
    return ParenthesisExpressionImpl().apply(block)
}

/**
 * ConditionalExpression#alternate: Expression
 * extension function for create Expression -> JSXMemberExpressionImpl
 */
fun ConditionalExpression.jSXMemberExpression(block: JSXMemberExpression.() -> Unit): JSXMemberExpression {
    return JSXMemberExpressionImpl().apply(block)
}

/**
 * ConditionalExpression#alternate: Expression
 * extension function for create Expression -> JSXNamespacedNameImpl
 */
fun ConditionalExpression.jSXNamespacedName(block: JSXNamespacedName.() -> Unit): JSXNamespacedName {
    return JSXNamespacedNameImpl().apply(block)
}

/**
 * ConditionalExpression#alternate: Expression
 * extension function for create Expression -> JSXEmptyExpressionImpl
 */
fun ConditionalExpression.jSXEmptyExpression(block: JSXEmptyExpression.() -> Unit): JSXEmptyExpression {
    return JSXEmptyExpressionImpl().apply(block)
}

/**
 * ConditionalExpression#alternate: Expression
 * extension function for create Expression -> JSXElementImpl
 */
fun ConditionalExpression.jSXElement(block: JSXElement.() -> Unit): JSXElement {
    return JSXElementImpl().apply(block)
}

/**
 * ConditionalExpression#alternate: Expression
 * extension function for create Expression -> JSXFragmentImpl
 */
fun ConditionalExpression.jSXFragment(block: JSXFragment.() -> Unit): JSXFragment {
    return JSXFragmentImpl().apply(block)
}

/**
 * ConditionalExpression#alternate: Expression
 * extension function for create Expression -> TsTypeAssertionImpl
 */
fun ConditionalExpression.tsTypeAssertion(block: TsTypeAssertion.() -> Unit): TsTypeAssertion {
    return TsTypeAssertionImpl().apply(block)
}

/**
 * ConditionalExpression#alternate: Expression
 * extension function for create Expression -> TsConstAssertionImpl
 */
fun ConditionalExpression.tsConstAssertion(block: TsConstAssertion.() -> Unit): TsConstAssertion {
    return TsConstAssertionImpl().apply(block)
}

/**
 * ConditionalExpression#alternate: Expression
 * extension function for create Expression -> TsNonNullExpressionImpl
 */
fun ConditionalExpression.tsNonNullExpression(block: TsNonNullExpression.() -> Unit): TsNonNullExpression {
    return TsNonNullExpressionImpl().apply(block)
}

/**
 * ConditionalExpression#alternate: Expression
 * extension function for create Expression -> TsAsExpressionImpl
 */
fun ConditionalExpression.tsAsExpression(block: TsAsExpression.() -> Unit): TsAsExpression {
    return TsAsExpressionImpl().apply(block)
}

/**
 * ConditionalExpression#alternate: Expression
 * extension function for create Expression -> TsSatisfiesExpressionImpl
 */
fun ConditionalExpression.tsSatisfiesExpression(block: TsSatisfiesExpression.() -> Unit): TsSatisfiesExpression {
    return TsSatisfiesExpressionImpl().apply(block)
}

/**
 * ConditionalExpression#alternate: Expression
 * extension function for create Expression -> TsInstantiationImpl
 */
fun ConditionalExpression.tsInstantiation(block: TsInstantiation.() -> Unit): TsInstantiation {
    return TsInstantiationImpl().apply(block)
}

/**
 * ConditionalExpression#alternate: Expression
 * extension function for create Expression -> PrivateNameImpl
 */
fun ConditionalExpression.privateName(block: PrivateName.() -> Unit): PrivateName {
    return PrivateNameImpl().apply(block)
}

/**
 * ConditionalExpression#alternate: Expression
 * extension function for create Expression -> OptionalChainingExpressionImpl
 */
fun ConditionalExpression.optionalChainingExpression(block: OptionalChainingExpression.() -> Unit): OptionalChainingExpression {
    return OptionalChainingExpressionImpl().apply(block)
}

/**
 * ConditionalExpression#alternate: Expression
 * extension function for create Expression -> InvalidImpl
 */
fun ConditionalExpression.invalid(block: Invalid.() -> Unit): Invalid {
    return InvalidImpl().apply(block)
}

fun ConditionalExpression.span(block: Span.() -> Unit): Span {
    return Span().apply(block)
}
