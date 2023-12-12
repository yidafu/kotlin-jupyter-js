package dev.yidafu.swc.dsl

import dev.yidafu.swc.types.*

/**
 * SequenceExpression#expressions: Array<Expression>
 * extension function for create Array<Expression> -> ThisExpressionImpl
 */
fun SequenceExpression.thisExpression(block: ThisExpression.() -> Unit): ThisExpression {
    return ThisExpressionImpl().apply(block)
}

/**
 * SequenceExpression#expressions: Array<Expression>
 * extension function for create Array<Expression> -> ArrayExpressionImpl
 */
fun SequenceExpression.arrayExpression(block: ArrayExpression.() -> Unit): ArrayExpression {
    return ArrayExpressionImpl().apply(block)
}

/**
 * SequenceExpression#expressions: Array<Expression>
 * extension function for create Array<Expression> -> ObjectExpressionImpl
 */
fun SequenceExpression.objectExpression(block: ObjectExpression.() -> Unit): ObjectExpression {
    return ObjectExpressionImpl().apply(block)
}

/**
 * SequenceExpression#expressions: Array<Expression>
 * extension function for create Array<Expression> -> FunctionExpressionImpl
 */
fun SequenceExpression.functionExpression(block: FunctionExpression.() -> Unit): FunctionExpression {
    return FunctionExpressionImpl().apply(block)
}

/**
 * SequenceExpression#expressions: Array<Expression>
 * extension function for create Array<Expression> -> UnaryExpressionImpl
 */
fun SequenceExpression.unaryExpression(block: UnaryExpression.() -> Unit): UnaryExpression {
    return UnaryExpressionImpl().apply(block)
}

/**
 * SequenceExpression#expressions: Array<Expression>
 * extension function for create Array<Expression> -> UpdateExpressionImpl
 */
fun SequenceExpression.updateExpression(block: UpdateExpression.() -> Unit): UpdateExpression {
    return UpdateExpressionImpl().apply(block)
}

/**
 * SequenceExpression#expressions: Array<Expression>
 * extension function for create Array<Expression> -> BinaryExpressionImpl
 */
fun SequenceExpression.binaryExpression(block: BinaryExpression.() -> Unit): BinaryExpression {
    return BinaryExpressionImpl().apply(block)
}

/**
 * SequenceExpression#expressions: Array<Expression>
 * extension function for create Array<Expression> -> AssignmentExpressionImpl
 */
fun SequenceExpression.assignmentExpression(block: AssignmentExpression.() -> Unit): AssignmentExpression {
    return AssignmentExpressionImpl().apply(block)
}

/**
 * SequenceExpression#expressions: Array<Expression>
 * extension function for create Array<Expression> -> MemberExpressionImpl
 */
fun SequenceExpression.memberExpression(block: MemberExpression.() -> Unit): MemberExpression {
    return MemberExpressionImpl().apply(block)
}

/**
 * SequenceExpression#expressions: Array<Expression>
 * extension function for create Array<Expression> -> SuperPropExpressionImpl
 */
fun SequenceExpression.superPropExpression(block: SuperPropExpression.() -> Unit): SuperPropExpression {
    return SuperPropExpressionImpl().apply(block)
}

/**
 * SequenceExpression#expressions: Array<Expression>
 * extension function for create Array<Expression> -> ConditionalExpressionImpl
 */
fun SequenceExpression.conditionalExpression(block: ConditionalExpression.() -> Unit): ConditionalExpression {
    return ConditionalExpressionImpl().apply(block)
}

/**
 * SequenceExpression#expressions: Array<Expression>
 * extension function for create Array<Expression> -> CallExpressionImpl
 */
fun SequenceExpression.callExpression(block: CallExpression.() -> Unit): CallExpression {
    return CallExpressionImpl().apply(block)
}

/**
 * SequenceExpression#expressions: Array<Expression>
 * extension function for create Array<Expression> -> NewExpressionImpl
 */
fun SequenceExpression.newExpression(block: NewExpression.() -> Unit): NewExpression {
    return NewExpressionImpl().apply(block)
}

/**
 * SequenceExpression#expressions: Array<Expression>
 * extension function for create Array<Expression> -> IdentifierImpl
 */
fun SequenceExpression.identifier(block: Identifier.() -> Unit): Identifier {
    return IdentifierImpl().apply(block)
}

/**
 * SequenceExpression#expressions: Array<Expression>
 * extension function for create Array<Expression> -> StringLiteralImpl
 */
fun SequenceExpression.stringLiteral(block: StringLiteral.() -> Unit): StringLiteral {
    return StringLiteralImpl().apply(block)
}

/**
 * SequenceExpression#expressions: Array<Expression>
 * extension function for create Array<Expression> -> BooleanLiteralImpl
 */
fun SequenceExpression.booleanLiteral(block: BooleanLiteral.() -> Unit): BooleanLiteral {
    return BooleanLiteralImpl().apply(block)
}

/**
 * SequenceExpression#expressions: Array<Expression>
 * extension function for create Array<Expression> -> NullLiteralImpl
 */
fun SequenceExpression.nullLiteral(block: NullLiteral.() -> Unit): NullLiteral {
    return NullLiteralImpl().apply(block)
}

/**
 * SequenceExpression#expressions: Array<Expression>
 * extension function for create Array<Expression> -> NumericLiteralImpl
 */
fun SequenceExpression.numericLiteral(block: NumericLiteral.() -> Unit): NumericLiteral {
    return NumericLiteralImpl().apply(block)
}

/**
 * SequenceExpression#expressions: Array<Expression>
 * extension function for create Array<Expression> -> BigIntLiteralImpl
 */
fun SequenceExpression.bigIntLiteral(block: BigIntLiteral.() -> Unit): BigIntLiteral {
    return BigIntLiteralImpl().apply(block)
}

/**
 * SequenceExpression#expressions: Array<Expression>
 * extension function for create Array<Expression> -> RegExpLiteralImpl
 */
fun SequenceExpression.regExpLiteral(block: RegExpLiteral.() -> Unit): RegExpLiteral {
    return RegExpLiteralImpl().apply(block)
}

/**
 * SequenceExpression#expressions: Array<Expression>
 * extension function for create Array<Expression> -> JSXTextImpl
 */
fun SequenceExpression.jSXText(block: JSXText.() -> Unit): JSXText {
    return JSXTextImpl().apply(block)
}

/**
 * SequenceExpression#expressions: Array<Expression>
 * extension function for create Array<Expression> -> TemplateLiteralImpl
 */
fun SequenceExpression.templateLiteral(block: TemplateLiteral.() -> Unit): TemplateLiteral {
    return TemplateLiteralImpl().apply(block)
}

/**
 * SequenceExpression#expressions: Array<Expression>
 * extension function for create Array<Expression> -> TaggedTemplateExpressionImpl
 */
fun SequenceExpression.taggedTemplateExpression(block: TaggedTemplateExpression.() -> Unit): TaggedTemplateExpression {
    return TaggedTemplateExpressionImpl().apply(block)
}

/**
 * SequenceExpression#expressions: Array<Expression>
 * extension function for create Array<Expression> -> ArrowFunctionExpressionImpl
 */
fun SequenceExpression.arrowFunctionExpression(block: ArrowFunctionExpression.() -> Unit): ArrowFunctionExpression {
    return ArrowFunctionExpressionImpl().apply(block)
}

/**
 * SequenceExpression#expressions: Array<Expression>
 * extension function for create Array<Expression> -> ClassExpressionImpl
 */
fun SequenceExpression.classExpression(block: ClassExpression.() -> Unit): ClassExpression {
    return ClassExpressionImpl().apply(block)
}

/**
 * SequenceExpression#expressions: Array<Expression>
 * extension function for create Array<Expression> -> YieldExpressionImpl
 */
fun SequenceExpression.yieldExpression(block: YieldExpression.() -> Unit): YieldExpression {
    return YieldExpressionImpl().apply(block)
}

/**
 * SequenceExpression#expressions: Array<Expression>
 * extension function for create Array<Expression> -> MetaPropertyImpl
 */
fun SequenceExpression.metaProperty(block: MetaProperty.() -> Unit): MetaProperty {
    return MetaPropertyImpl().apply(block)
}

/**
 * SequenceExpression#expressions: Array<Expression>
 * extension function for create Array<Expression> -> AwaitExpressionImpl
 */
fun SequenceExpression.awaitExpression(block: AwaitExpression.() -> Unit): AwaitExpression {
    return AwaitExpressionImpl().apply(block)
}

/**
 * SequenceExpression#expressions: Array<Expression>
 * extension function for create Array<Expression> -> ParenthesisExpressionImpl
 */
fun SequenceExpression.parenthesisExpression(block: ParenthesisExpression.() -> Unit): ParenthesisExpression {
    return ParenthesisExpressionImpl().apply(block)
}

/**
 * SequenceExpression#expressions: Array<Expression>
 * extension function for create Array<Expression> -> JSXMemberExpressionImpl
 */
fun SequenceExpression.jSXMemberExpression(block: JSXMemberExpression.() -> Unit): JSXMemberExpression {
    return JSXMemberExpressionImpl().apply(block)
}

/**
 * SequenceExpression#expressions: Array<Expression>
 * extension function for create Array<Expression> -> JSXNamespacedNameImpl
 */
fun SequenceExpression.jSXNamespacedName(block: JSXNamespacedName.() -> Unit): JSXNamespacedName {
    return JSXNamespacedNameImpl().apply(block)
}

/**
 * SequenceExpression#expressions: Array<Expression>
 * extension function for create Array<Expression> -> JSXEmptyExpressionImpl
 */
fun SequenceExpression.jSXEmptyExpression(block: JSXEmptyExpression.() -> Unit): JSXEmptyExpression {
    return JSXEmptyExpressionImpl().apply(block)
}

/**
 * SequenceExpression#expressions: Array<Expression>
 * extension function for create Array<Expression> -> JSXElementImpl
 */
fun SequenceExpression.jSXElement(block: JSXElement.() -> Unit): JSXElement {
    return JSXElementImpl().apply(block)
}

/**
 * SequenceExpression#expressions: Array<Expression>
 * extension function for create Array<Expression> -> JSXFragmentImpl
 */
fun SequenceExpression.jSXFragment(block: JSXFragment.() -> Unit): JSXFragment {
    return JSXFragmentImpl().apply(block)
}

/**
 * SequenceExpression#expressions: Array<Expression>
 * extension function for create Array<Expression> -> TsTypeAssertionImpl
 */
fun SequenceExpression.tsTypeAssertion(block: TsTypeAssertion.() -> Unit): TsTypeAssertion {
    return TsTypeAssertionImpl().apply(block)
}

/**
 * SequenceExpression#expressions: Array<Expression>
 * extension function for create Array<Expression> -> TsConstAssertionImpl
 */
fun SequenceExpression.tsConstAssertion(block: TsConstAssertion.() -> Unit): TsConstAssertion {
    return TsConstAssertionImpl().apply(block)
}

/**
 * SequenceExpression#expressions: Array<Expression>
 * extension function for create Array<Expression> -> TsNonNullExpressionImpl
 */
fun SequenceExpression.tsNonNullExpression(block: TsNonNullExpression.() -> Unit): TsNonNullExpression {
    return TsNonNullExpressionImpl().apply(block)
}

/**
 * SequenceExpression#expressions: Array<Expression>
 * extension function for create Array<Expression> -> TsAsExpressionImpl
 */
fun SequenceExpression.tsAsExpression(block: TsAsExpression.() -> Unit): TsAsExpression {
    return TsAsExpressionImpl().apply(block)
}

/**
 * SequenceExpression#expressions: Array<Expression>
 * extension function for create Array<Expression> -> TsSatisfiesExpressionImpl
 */
fun SequenceExpression.tsSatisfiesExpression(block: TsSatisfiesExpression.() -> Unit): TsSatisfiesExpression {
    return TsSatisfiesExpressionImpl().apply(block)
}

/**
 * SequenceExpression#expressions: Array<Expression>
 * extension function for create Array<Expression> -> TsInstantiationImpl
 */
fun SequenceExpression.tsInstantiation(block: TsInstantiation.() -> Unit): TsInstantiation {
    return TsInstantiationImpl().apply(block)
}

/**
 * SequenceExpression#expressions: Array<Expression>
 * extension function for create Array<Expression> -> PrivateNameImpl
 */
fun SequenceExpression.privateName(block: PrivateName.() -> Unit): PrivateName {
    return PrivateNameImpl().apply(block)
}

/**
 * SequenceExpression#expressions: Array<Expression>
 * extension function for create Array<Expression> -> OptionalChainingExpressionImpl
 */
fun SequenceExpression.optionalChainingExpression(block: OptionalChainingExpression.() -> Unit): OptionalChainingExpression {
    return OptionalChainingExpressionImpl().apply(block)
}

/**
 * SequenceExpression#expressions: Array<Expression>
 * extension function for create Array<Expression> -> InvalidImpl
 */
fun SequenceExpression.invalid(block: Invalid.() -> Unit): Invalid {
    return InvalidImpl().apply(block)
}

fun SequenceExpression.span(block: Span.() -> Unit): Span {
    return Span().apply(block)
}
