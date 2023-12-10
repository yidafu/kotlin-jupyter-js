package dev.yidafu.swc.dsl

import dev.yidafu.swc.types.*

/**
 * TemplateLiteral#expressions: Array<Expression>
 * extension function for create Array<Expression> -> ThisExpressionImpl
 */
fun TemplateLiteral.thisExpression(block: ThisExpression.() -> Unit): ThisExpression {
    return ThisExpressionImpl().apply(block)
}

/**
 * TemplateLiteral#expressions: Array<Expression>
 * extension function for create Array<Expression> -> ArrayExpressionImpl
 */
fun TemplateLiteral.arrayExpression(block: ArrayExpression.() -> Unit): ArrayExpression {
    return ArrayExpressionImpl().apply(block)
}

/**
 * TemplateLiteral#expressions: Array<Expression>
 * extension function for create Array<Expression> -> ObjectExpressionImpl
 */
fun TemplateLiteral.objectExpression(block: ObjectExpression.() -> Unit): ObjectExpression {
    return ObjectExpressionImpl().apply(block)
}

/**
 * TemplateLiteral#expressions: Array<Expression>
 * extension function for create Array<Expression> -> FunctionExpressionImpl
 */
fun TemplateLiteral.functionExpression(block: FunctionExpression.() -> Unit): FunctionExpression {
    return FunctionExpressionImpl().apply(block)
}

/**
 * TemplateLiteral#expressions: Array<Expression>
 * extension function for create Array<Expression> -> UnaryExpressionImpl
 */
fun TemplateLiteral.unaryExpression(block: UnaryExpression.() -> Unit): UnaryExpression {
    return UnaryExpressionImpl().apply(block)
}

/**
 * TemplateLiteral#expressions: Array<Expression>
 * extension function for create Array<Expression> -> UpdateExpressionImpl
 */
fun TemplateLiteral.updateExpression(block: UpdateExpression.() -> Unit): UpdateExpression {
    return UpdateExpressionImpl().apply(block)
}

/**
 * TemplateLiteral#expressions: Array<Expression>
 * extension function for create Array<Expression> -> BinaryExpressionImpl
 */
fun TemplateLiteral.binaryExpression(block: BinaryExpression.() -> Unit): BinaryExpression {
    return BinaryExpressionImpl().apply(block)
}

/**
 * TemplateLiteral#expressions: Array<Expression>
 * extension function for create Array<Expression> -> AssignmentExpressionImpl
 */
fun TemplateLiteral.assignmentExpression(block: AssignmentExpression.() -> Unit): AssignmentExpression {
    return AssignmentExpressionImpl().apply(block)
}

/**
 * TemplateLiteral#expressions: Array<Expression>
 * extension function for create Array<Expression> -> MemberExpressionImpl
 */
fun TemplateLiteral.memberExpression(block: MemberExpression.() -> Unit): MemberExpression {
    return MemberExpressionImpl().apply(block)
}

/**
 * TemplateLiteral#expressions: Array<Expression>
 * extension function for create Array<Expression> -> SuperPropExpressionImpl
 */
fun TemplateLiteral.superPropExpression(block: SuperPropExpression.() -> Unit): SuperPropExpression {
    return SuperPropExpressionImpl().apply(block)
}

/**
 * TemplateLiteral#expressions: Array<Expression>
 * extension function for create Array<Expression> -> ConditionalExpressionImpl
 */
fun TemplateLiteral.conditionalExpression(block: ConditionalExpression.() -> Unit): ConditionalExpression {
    return ConditionalExpressionImpl().apply(block)
}

/**
 * TemplateLiteral#expressions: Array<Expression>
 * extension function for create Array<Expression> -> CallExpressionImpl
 */
fun TemplateLiteral.callExpression(block: CallExpression.() -> Unit): CallExpression {
    return CallExpressionImpl().apply(block)
}

/**
 * TemplateLiteral#expressions: Array<Expression>
 * extension function for create Array<Expression> -> NewExpressionImpl
 */
fun TemplateLiteral.newExpression(block: NewExpression.() -> Unit): NewExpression {
    return NewExpressionImpl().apply(block)
}

/**
 * TemplateLiteral#expressions: Array<Expression>
 * extension function for create Array<Expression> -> SequenceExpressionImpl
 */
fun TemplateLiteral.sequenceExpression(block: SequenceExpression.() -> Unit): SequenceExpression {
    return SequenceExpressionImpl().apply(block)
}

/**
 * TemplateLiteral#expressions: Array<Expression>
 * extension function for create Array<Expression> -> IdentifierImpl
 */
fun TemplateLiteral.identifier(block: Identifier.() -> Unit): Identifier {
    return IdentifierImpl().apply(block)
}

/**
 * TemplateLiteral#expressions: Array<Expression>
 * extension function for create Array<Expression> -> StringLiteralImpl
 */
fun TemplateLiteral.stringLiteral(block: StringLiteral.() -> Unit): StringLiteral {
    return StringLiteralImpl().apply(block)
}

/**
 * TemplateLiteral#expressions: Array<Expression>
 * extension function for create Array<Expression> -> BooleanLiteralImpl
 */
fun TemplateLiteral.booleanLiteral(block: BooleanLiteral.() -> Unit): BooleanLiteral {
    return BooleanLiteralImpl().apply(block)
}

/**
 * TemplateLiteral#expressions: Array<Expression>
 * extension function for create Array<Expression> -> NullLiteralImpl
 */
fun TemplateLiteral.nullLiteral(block: NullLiteral.() -> Unit): NullLiteral {
    return NullLiteralImpl().apply(block)
}

/**
 * TemplateLiteral#expressions: Array<Expression>
 * extension function for create Array<Expression> -> NumericLiteralImpl
 */
fun TemplateLiteral.numericLiteral(block: NumericLiteral.() -> Unit): NumericLiteral {
    return NumericLiteralImpl().apply(block)
}

/**
 * TemplateLiteral#expressions: Array<Expression>
 * extension function for create Array<Expression> -> BigIntLiteralImpl
 */
fun TemplateLiteral.bigIntLiteral(block: BigIntLiteral.() -> Unit): BigIntLiteral {
    return BigIntLiteralImpl().apply(block)
}

/**
 * TemplateLiteral#expressions: Array<Expression>
 * extension function for create Array<Expression> -> RegExpLiteralImpl
 */
fun TemplateLiteral.regExpLiteral(block: RegExpLiteral.() -> Unit): RegExpLiteral {
    return RegExpLiteralImpl().apply(block)
}

/**
 * TemplateLiteral#expressions: Array<Expression>
 * extension function for create Array<Expression> -> JSXTextImpl
 */
fun TemplateLiteral.jSXText(block: JSXText.() -> Unit): JSXText {
    return JSXTextImpl().apply(block)
}

/**
 * TemplateLiteral#expressions: Array<Expression>
 * extension function for create Array<Expression> -> TaggedTemplateExpressionImpl
 */
fun TemplateLiteral.taggedTemplateExpression(block: TaggedTemplateExpression.() -> Unit): TaggedTemplateExpression {
    return TaggedTemplateExpressionImpl().apply(block)
}

/**
 * TemplateLiteral#expressions: Array<Expression>
 * extension function for create Array<Expression> -> ArrowFunctionExpressionImpl
 */
fun TemplateLiteral.arrowFunctionExpression(block: ArrowFunctionExpression.() -> Unit): ArrowFunctionExpression {
    return ArrowFunctionExpressionImpl().apply(block)
}

/**
 * TemplateLiteral#expressions: Array<Expression>
 * extension function for create Array<Expression> -> ClassExpressionImpl
 */
fun TemplateLiteral.classExpression(block: ClassExpression.() -> Unit): ClassExpression {
    return ClassExpressionImpl().apply(block)
}

/**
 * TemplateLiteral#expressions: Array<Expression>
 * extension function for create Array<Expression> -> YieldExpressionImpl
 */
fun TemplateLiteral.yieldExpression(block: YieldExpression.() -> Unit): YieldExpression {
    return YieldExpressionImpl().apply(block)
}

/**
 * TemplateLiteral#expressions: Array<Expression>
 * extension function for create Array<Expression> -> MetaPropertyImpl
 */
fun TemplateLiteral.metaProperty(block: MetaProperty.() -> Unit): MetaProperty {
    return MetaPropertyImpl().apply(block)
}

/**
 * TemplateLiteral#expressions: Array<Expression>
 * extension function for create Array<Expression> -> AwaitExpressionImpl
 */
fun TemplateLiteral.awaitExpression(block: AwaitExpression.() -> Unit): AwaitExpression {
    return AwaitExpressionImpl().apply(block)
}

/**
 * TemplateLiteral#expressions: Array<Expression>
 * extension function for create Array<Expression> -> ParenthesisExpressionImpl
 */
fun TemplateLiteral.parenthesisExpression(block: ParenthesisExpression.() -> Unit): ParenthesisExpression {
    return ParenthesisExpressionImpl().apply(block)
}

/**
 * TemplateLiteral#expressions: Array<Expression>
 * extension function for create Array<Expression> -> JSXMemberExpressionImpl
 */
fun TemplateLiteral.jSXMemberExpression(block: JSXMemberExpression.() -> Unit): JSXMemberExpression {
    return JSXMemberExpressionImpl().apply(block)
}

/**
 * TemplateLiteral#expressions: Array<Expression>
 * extension function for create Array<Expression> -> JSXNamespacedNameImpl
 */
fun TemplateLiteral.jSXNamespacedName(block: JSXNamespacedName.() -> Unit): JSXNamespacedName {
    return JSXNamespacedNameImpl().apply(block)
}

/**
 * TemplateLiteral#expressions: Array<Expression>
 * extension function for create Array<Expression> -> JSXEmptyExpressionImpl
 */
fun TemplateLiteral.jSXEmptyExpression(block: JSXEmptyExpression.() -> Unit): JSXEmptyExpression {
    return JSXEmptyExpressionImpl().apply(block)
}

/**
 * TemplateLiteral#expressions: Array<Expression>
 * extension function for create Array<Expression> -> JSXElementImpl
 */
fun TemplateLiteral.jSXElement(block: JSXElement.() -> Unit): JSXElement {
    return JSXElementImpl().apply(block)
}

/**
 * TemplateLiteral#expressions: Array<Expression>
 * extension function for create Array<Expression> -> JSXFragmentImpl
 */
fun TemplateLiteral.jSXFragment(block: JSXFragment.() -> Unit): JSXFragment {
    return JSXFragmentImpl().apply(block)
}

/**
 * TemplateLiteral#expressions: Array<Expression>
 * extension function for create Array<Expression> -> TsTypeAssertionImpl
 */
fun TemplateLiteral.tsTypeAssertion(block: TsTypeAssertion.() -> Unit): TsTypeAssertion {
    return TsTypeAssertionImpl().apply(block)
}

/**
 * TemplateLiteral#expressions: Array<Expression>
 * extension function for create Array<Expression> -> TsConstAssertionImpl
 */
fun TemplateLiteral.tsConstAssertion(block: TsConstAssertion.() -> Unit): TsConstAssertion {
    return TsConstAssertionImpl().apply(block)
}

/**
 * TemplateLiteral#expressions: Array<Expression>
 * extension function for create Array<Expression> -> TsNonNullExpressionImpl
 */
fun TemplateLiteral.tsNonNullExpression(block: TsNonNullExpression.() -> Unit): TsNonNullExpression {
    return TsNonNullExpressionImpl().apply(block)
}

/**
 * TemplateLiteral#expressions: Array<Expression>
 * extension function for create Array<Expression> -> TsAsExpressionImpl
 */
fun TemplateLiteral.tsAsExpression(block: TsAsExpression.() -> Unit): TsAsExpression {
    return TsAsExpressionImpl().apply(block)
}

/**
 * TemplateLiteral#expressions: Array<Expression>
 * extension function for create Array<Expression> -> TsSatisfiesExpressionImpl
 */
fun TemplateLiteral.tsSatisfiesExpression(block: TsSatisfiesExpression.() -> Unit): TsSatisfiesExpression {
    return TsSatisfiesExpressionImpl().apply(block)
}

/**
 * TemplateLiteral#expressions: Array<Expression>
 * extension function for create Array<Expression> -> TsInstantiationImpl
 */
fun TemplateLiteral.tsInstantiation(block: TsInstantiation.() -> Unit): TsInstantiation {
    return TsInstantiationImpl().apply(block)
}

/**
 * TemplateLiteral#expressions: Array<Expression>
 * extension function for create Array<Expression> -> PrivateNameImpl
 */
fun TemplateLiteral.privateName(block: PrivateName.() -> Unit): PrivateName {
    return PrivateNameImpl().apply(block)
}

/**
 * TemplateLiteral#expressions: Array<Expression>
 * extension function for create Array<Expression> -> OptionalChainingExpressionImpl
 */
fun TemplateLiteral.optionalChainingExpression(block: OptionalChainingExpression.() -> Unit): OptionalChainingExpression {
    return OptionalChainingExpressionImpl().apply(block)
}

/**
 * TemplateLiteral#expressions: Array<Expression>
 * extension function for create Array<Expression> -> InvalidImpl
 */
fun TemplateLiteral.invalid(block: Invalid.() -> Unit): Invalid {
    return InvalidImpl().apply(block)
}

/**
 * TemplateLiteral#quasis: Array<TemplateElement>
 * extension function for create Array<TemplateElement> -> TemplateElementImpl
 */
fun TemplateLiteral.templateElement(block: TemplateElement.() -> Unit): TemplateElement {
    return TemplateElementImpl().apply(block)
}

fun TemplateLiteral.span(block: Span.() -> Unit): Span {
    return Span().apply(block)
}
