package dev.yidafu.swc.dsl

import dev.yidafu.swc.types.*

/**
 * TsEnumMember#init: Expression
 * extension function for create Expression -> IdentifierImpl
 */
fun TsEnumMember.identifier(block: Identifier.() -> Unit): Identifier {
    return IdentifierImpl().apply(block)
}

/**
 * TsEnumMember#init: Expression
 * extension function for create Expression -> StringLiteralImpl
 */
fun TsEnumMember.stringLiteral(block: StringLiteral.() -> Unit): StringLiteral {
    return StringLiteralImpl().apply(block)
}

/**
 * TsEnumMember#init: Expression
 * extension function for create Expression -> ThisExpressionImpl
 */
fun TsEnumMember.thisExpression(block: ThisExpression.() -> Unit): ThisExpression {
    return ThisExpressionImpl().apply(block)
}

/**
 * TsEnumMember#init: Expression
 * extension function for create Expression -> ArrayExpressionImpl
 */
fun TsEnumMember.arrayExpression(block: ArrayExpression.() -> Unit): ArrayExpression {
    return ArrayExpressionImpl().apply(block)
}

/**
 * TsEnumMember#init: Expression
 * extension function for create Expression -> ObjectExpressionImpl
 */
fun TsEnumMember.objectExpression(block: ObjectExpression.() -> Unit): ObjectExpression {
    return ObjectExpressionImpl().apply(block)
}

/**
 * TsEnumMember#init: Expression
 * extension function for create Expression -> FunctionExpressionImpl
 */
fun TsEnumMember.functionExpression(block: FunctionExpression.() -> Unit): FunctionExpression {
    return FunctionExpressionImpl().apply(block)
}

/**
 * TsEnumMember#init: Expression
 * extension function for create Expression -> UnaryExpressionImpl
 */
fun TsEnumMember.unaryExpression(block: UnaryExpression.() -> Unit): UnaryExpression {
    return UnaryExpressionImpl().apply(block)
}

/**
 * TsEnumMember#init: Expression
 * extension function for create Expression -> UpdateExpressionImpl
 */
fun TsEnumMember.updateExpression(block: UpdateExpression.() -> Unit): UpdateExpression {
    return UpdateExpressionImpl().apply(block)
}

/**
 * TsEnumMember#init: Expression
 * extension function for create Expression -> BinaryExpressionImpl
 */
fun TsEnumMember.binaryExpression(block: BinaryExpression.() -> Unit): BinaryExpression {
    return BinaryExpressionImpl().apply(block)
}

/**
 * TsEnumMember#init: Expression
 * extension function for create Expression -> AssignmentExpressionImpl
 */
fun TsEnumMember.assignmentExpression(block: AssignmentExpression.() -> Unit): AssignmentExpression {
    return AssignmentExpressionImpl().apply(block)
}

/**
 * TsEnumMember#init: Expression
 * extension function for create Expression -> MemberExpressionImpl
 */
fun TsEnumMember.memberExpression(block: MemberExpression.() -> Unit): MemberExpression {
    return MemberExpressionImpl().apply(block)
}

/**
 * TsEnumMember#init: Expression
 * extension function for create Expression -> SuperPropExpressionImpl
 */
fun TsEnumMember.superPropExpression(block: SuperPropExpression.() -> Unit): SuperPropExpression {
    return SuperPropExpressionImpl().apply(block)
}

/**
 * TsEnumMember#init: Expression
 * extension function for create Expression -> ConditionalExpressionImpl
 */
fun TsEnumMember.conditionalExpression(block: ConditionalExpression.() -> Unit): ConditionalExpression {
    return ConditionalExpressionImpl().apply(block)
}

/**
 * TsEnumMember#init: Expression
 * extension function for create Expression -> CallExpressionImpl
 */
fun TsEnumMember.callExpression(block: CallExpression.() -> Unit): CallExpression {
    return CallExpressionImpl().apply(block)
}

/**
 * TsEnumMember#init: Expression
 * extension function for create Expression -> NewExpressionImpl
 */
fun TsEnumMember.newExpression(block: NewExpression.() -> Unit): NewExpression {
    return NewExpressionImpl().apply(block)
}

/**
 * TsEnumMember#init: Expression
 * extension function for create Expression -> SequenceExpressionImpl
 */
fun TsEnumMember.sequenceExpression(block: SequenceExpression.() -> Unit): SequenceExpression {
    return SequenceExpressionImpl().apply(block)
}

/**
 * TsEnumMember#init: Expression
 * extension function for create Expression -> BooleanLiteralImpl
 */
fun TsEnumMember.booleanLiteral(block: BooleanLiteral.() -> Unit): BooleanLiteral {
    return BooleanLiteralImpl().apply(block)
}

/**
 * TsEnumMember#init: Expression
 * extension function for create Expression -> NullLiteralImpl
 */
fun TsEnumMember.nullLiteral(block: NullLiteral.() -> Unit): NullLiteral {
    return NullLiteralImpl().apply(block)
}

/**
 * TsEnumMember#init: Expression
 * extension function for create Expression -> NumericLiteralImpl
 */
fun TsEnumMember.numericLiteral(block: NumericLiteral.() -> Unit): NumericLiteral {
    return NumericLiteralImpl().apply(block)
}

/**
 * TsEnumMember#init: Expression
 * extension function for create Expression -> BigIntLiteralImpl
 */
fun TsEnumMember.bigIntLiteral(block: BigIntLiteral.() -> Unit): BigIntLiteral {
    return BigIntLiteralImpl().apply(block)
}

/**
 * TsEnumMember#init: Expression
 * extension function for create Expression -> RegExpLiteralImpl
 */
fun TsEnumMember.regExpLiteral(block: RegExpLiteral.() -> Unit): RegExpLiteral {
    return RegExpLiteralImpl().apply(block)
}

/**
 * TsEnumMember#init: Expression
 * extension function for create Expression -> JSXTextImpl
 */
fun TsEnumMember.jSXText(block: JSXText.() -> Unit): JSXText {
    return JSXTextImpl().apply(block)
}

/**
 * TsEnumMember#init: Expression
 * extension function for create Expression -> TemplateLiteralImpl
 */
fun TsEnumMember.templateLiteral(block: TemplateLiteral.() -> Unit): TemplateLiteral {
    return TemplateLiteralImpl().apply(block)
}

/**
 * TsEnumMember#init: Expression
 * extension function for create Expression -> TaggedTemplateExpressionImpl
 */
fun TsEnumMember.taggedTemplateExpression(block: TaggedTemplateExpression.() -> Unit): TaggedTemplateExpression {
    return TaggedTemplateExpressionImpl().apply(block)
}

/**
 * TsEnumMember#init: Expression
 * extension function for create Expression -> ArrowFunctionExpressionImpl
 */
fun TsEnumMember.arrowFunctionExpression(block: ArrowFunctionExpression.() -> Unit): ArrowFunctionExpression {
    return ArrowFunctionExpressionImpl().apply(block)
}

/**
 * TsEnumMember#init: Expression
 * extension function for create Expression -> ClassExpressionImpl
 */
fun TsEnumMember.classExpression(block: ClassExpression.() -> Unit): ClassExpression {
    return ClassExpressionImpl().apply(block)
}

/**
 * TsEnumMember#init: Expression
 * extension function for create Expression -> YieldExpressionImpl
 */
fun TsEnumMember.yieldExpression(block: YieldExpression.() -> Unit): YieldExpression {
    return YieldExpressionImpl().apply(block)
}

/**
 * TsEnumMember#init: Expression
 * extension function for create Expression -> MetaPropertyImpl
 */
fun TsEnumMember.metaProperty(block: MetaProperty.() -> Unit): MetaProperty {
    return MetaPropertyImpl().apply(block)
}

/**
 * TsEnumMember#init: Expression
 * extension function for create Expression -> AwaitExpressionImpl
 */
fun TsEnumMember.awaitExpression(block: AwaitExpression.() -> Unit): AwaitExpression {
    return AwaitExpressionImpl().apply(block)
}

/**
 * TsEnumMember#init: Expression
 * extension function for create Expression -> ParenthesisExpressionImpl
 */
fun TsEnumMember.parenthesisExpression(block: ParenthesisExpression.() -> Unit): ParenthesisExpression {
    return ParenthesisExpressionImpl().apply(block)
}

/**
 * TsEnumMember#init: Expression
 * extension function for create Expression -> JSXMemberExpressionImpl
 */
fun TsEnumMember.jSXMemberExpression(block: JSXMemberExpression.() -> Unit): JSXMemberExpression {
    return JSXMemberExpressionImpl().apply(block)
}

/**
 * TsEnumMember#init: Expression
 * extension function for create Expression -> JSXNamespacedNameImpl
 */
fun TsEnumMember.jSXNamespacedName(block: JSXNamespacedName.() -> Unit): JSXNamespacedName {
    return JSXNamespacedNameImpl().apply(block)
}

/**
 * TsEnumMember#init: Expression
 * extension function for create Expression -> JSXEmptyExpressionImpl
 */
fun TsEnumMember.jSXEmptyExpression(block: JSXEmptyExpression.() -> Unit): JSXEmptyExpression {
    return JSXEmptyExpressionImpl().apply(block)
}

/**
 * TsEnumMember#init: Expression
 * extension function for create Expression -> JSXElementImpl
 */
fun TsEnumMember.jSXElement(block: JSXElement.() -> Unit): JSXElement {
    return JSXElementImpl().apply(block)
}

/**
 * TsEnumMember#init: Expression
 * extension function for create Expression -> JSXFragmentImpl
 */
fun TsEnumMember.jSXFragment(block: JSXFragment.() -> Unit): JSXFragment {
    return JSXFragmentImpl().apply(block)
}

/**
 * TsEnumMember#init: Expression
 * extension function for create Expression -> TsTypeAssertionImpl
 */
fun TsEnumMember.tsTypeAssertion(block: TsTypeAssertion.() -> Unit): TsTypeAssertion {
    return TsTypeAssertionImpl().apply(block)
}

/**
 * TsEnumMember#init: Expression
 * extension function for create Expression -> TsConstAssertionImpl
 */
fun TsEnumMember.tsConstAssertion(block: TsConstAssertion.() -> Unit): TsConstAssertion {
    return TsConstAssertionImpl().apply(block)
}

/**
 * TsEnumMember#init: Expression
 * extension function for create Expression -> TsNonNullExpressionImpl
 */
fun TsEnumMember.tsNonNullExpression(block: TsNonNullExpression.() -> Unit): TsNonNullExpression {
    return TsNonNullExpressionImpl().apply(block)
}

/**
 * TsEnumMember#init: Expression
 * extension function for create Expression -> TsAsExpressionImpl
 */
fun TsEnumMember.tsAsExpression(block: TsAsExpression.() -> Unit): TsAsExpression {
    return TsAsExpressionImpl().apply(block)
}

/**
 * TsEnumMember#init: Expression
 * extension function for create Expression -> TsSatisfiesExpressionImpl
 */
fun TsEnumMember.tsSatisfiesExpression(block: TsSatisfiesExpression.() -> Unit): TsSatisfiesExpression {
    return TsSatisfiesExpressionImpl().apply(block)
}

/**
 * TsEnumMember#init: Expression
 * extension function for create Expression -> TsInstantiationImpl
 */
fun TsEnumMember.tsInstantiation(block: TsInstantiation.() -> Unit): TsInstantiation {
    return TsInstantiationImpl().apply(block)
}

/**
 * TsEnumMember#init: Expression
 * extension function for create Expression -> PrivateNameImpl
 */
fun TsEnumMember.privateName(block: PrivateName.() -> Unit): PrivateName {
    return PrivateNameImpl().apply(block)
}

/**
 * TsEnumMember#init: Expression
 * extension function for create Expression -> OptionalChainingExpressionImpl
 */
fun TsEnumMember.optionalChainingExpression(block: OptionalChainingExpression.() -> Unit): OptionalChainingExpression {
    return OptionalChainingExpressionImpl().apply(block)
}

/**
 * TsEnumMember#init: Expression
 * extension function for create Expression -> InvalidImpl
 */
fun TsEnumMember.invalid(block: Invalid.() -> Unit): Invalid {
    return InvalidImpl().apply(block)
}

fun TsEnumMember.span(block: Span.() -> Unit): Span {
    return Span().apply(block)
}
