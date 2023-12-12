package dev.yidafu.swc.dsl

import dev.yidafu.swc.types.*

/**
 * subtype of ClassPropertyBase
 */
fun ClassPropertyBase.classProperty(block: ClassProperty.() -> Unit): ClassProperty {
    return ClassPropertyImpl().apply(block)
}

/**
 * subtype of ClassPropertyBase
 */
fun ClassPropertyBase.privateProperty(block: PrivateProperty.() -> Unit): PrivateProperty {
    return PrivatePropertyImpl().apply(block)
}

/**
 * ClassPropertyBase#value: Expression
 * extension function for create Expression -> ThisExpressionImpl
 */
fun ClassPropertyBase.thisExpression(block: ThisExpression.() -> Unit): ThisExpression {
    return ThisExpressionImpl().apply(block)
}

/**
 * ClassPropertyBase#value: Expression
 * extension function for create Expression -> ArrayExpressionImpl
 */
fun ClassPropertyBase.arrayExpression(block: ArrayExpression.() -> Unit): ArrayExpression {
    return ArrayExpressionImpl().apply(block)
}

/**
 * ClassPropertyBase#value: Expression
 * extension function for create Expression -> ObjectExpressionImpl
 */
fun ClassPropertyBase.objectExpression(block: ObjectExpression.() -> Unit): ObjectExpression {
    return ObjectExpressionImpl().apply(block)
}

/**
 * ClassPropertyBase#value: Expression
 * extension function for create Expression -> FunctionExpressionImpl
 */
fun ClassPropertyBase.functionExpression(block: FunctionExpression.() -> Unit): FunctionExpression {
    return FunctionExpressionImpl().apply(block)
}

/**
 * ClassPropertyBase#value: Expression
 * extension function for create Expression -> UnaryExpressionImpl
 */
fun ClassPropertyBase.unaryExpression(block: UnaryExpression.() -> Unit): UnaryExpression {
    return UnaryExpressionImpl().apply(block)
}

/**
 * ClassPropertyBase#value: Expression
 * extension function for create Expression -> UpdateExpressionImpl
 */
fun ClassPropertyBase.updateExpression(block: UpdateExpression.() -> Unit): UpdateExpression {
    return UpdateExpressionImpl().apply(block)
}

/**
 * ClassPropertyBase#value: Expression
 * extension function for create Expression -> BinaryExpressionImpl
 */
fun ClassPropertyBase.binaryExpression(block: BinaryExpression.() -> Unit): BinaryExpression {
    return BinaryExpressionImpl().apply(block)
}

/**
 * ClassPropertyBase#value: Expression
 * extension function for create Expression -> AssignmentExpressionImpl
 */
fun ClassPropertyBase.assignmentExpression(block: AssignmentExpression.() -> Unit): AssignmentExpression {
    return AssignmentExpressionImpl().apply(block)
}

/**
 * ClassPropertyBase#value: Expression
 * extension function for create Expression -> MemberExpressionImpl
 */
fun ClassPropertyBase.memberExpression(block: MemberExpression.() -> Unit): MemberExpression {
    return MemberExpressionImpl().apply(block)
}

/**
 * ClassPropertyBase#value: Expression
 * extension function for create Expression -> SuperPropExpressionImpl
 */
fun ClassPropertyBase.superPropExpression(block: SuperPropExpression.() -> Unit): SuperPropExpression {
    return SuperPropExpressionImpl().apply(block)
}

/**
 * ClassPropertyBase#value: Expression
 * extension function for create Expression -> ConditionalExpressionImpl
 */
fun ClassPropertyBase.conditionalExpression(block: ConditionalExpression.() -> Unit): ConditionalExpression {
    return ConditionalExpressionImpl().apply(block)
}

/**
 * ClassPropertyBase#value: Expression
 * extension function for create Expression -> CallExpressionImpl
 */
fun ClassPropertyBase.callExpression(block: CallExpression.() -> Unit): CallExpression {
    return CallExpressionImpl().apply(block)
}

/**
 * ClassPropertyBase#value: Expression
 * extension function for create Expression -> NewExpressionImpl
 */
fun ClassPropertyBase.newExpression(block: NewExpression.() -> Unit): NewExpression {
    return NewExpressionImpl().apply(block)
}

/**
 * ClassPropertyBase#value: Expression
 * extension function for create Expression -> SequenceExpressionImpl
 */
fun ClassPropertyBase.sequenceExpression(block: SequenceExpression.() -> Unit): SequenceExpression {
    return SequenceExpressionImpl().apply(block)
}

/**
 * ClassPropertyBase#value: Expression
 * extension function for create Expression -> IdentifierImpl
 */
fun ClassPropertyBase.identifier(block: Identifier.() -> Unit): Identifier {
    return IdentifierImpl().apply(block)
}

/**
 * ClassPropertyBase#value: Expression
 * extension function for create Expression -> StringLiteralImpl
 */
fun ClassPropertyBase.stringLiteral(block: StringLiteral.() -> Unit): StringLiteral {
    return StringLiteralImpl().apply(block)
}

/**
 * ClassPropertyBase#value: Expression
 * extension function for create Expression -> BooleanLiteralImpl
 */
fun ClassPropertyBase.booleanLiteral(block: BooleanLiteral.() -> Unit): BooleanLiteral {
    return BooleanLiteralImpl().apply(block)
}

/**
 * ClassPropertyBase#value: Expression
 * extension function for create Expression -> NullLiteralImpl
 */
fun ClassPropertyBase.nullLiteral(block: NullLiteral.() -> Unit): NullLiteral {
    return NullLiteralImpl().apply(block)
}

/**
 * ClassPropertyBase#value: Expression
 * extension function for create Expression -> NumericLiteralImpl
 */
fun ClassPropertyBase.numericLiteral(block: NumericLiteral.() -> Unit): NumericLiteral {
    return NumericLiteralImpl().apply(block)
}

/**
 * ClassPropertyBase#value: Expression
 * extension function for create Expression -> BigIntLiteralImpl
 */
fun ClassPropertyBase.bigIntLiteral(block: BigIntLiteral.() -> Unit): BigIntLiteral {
    return BigIntLiteralImpl().apply(block)
}

/**
 * ClassPropertyBase#value: Expression
 * extension function for create Expression -> RegExpLiteralImpl
 */
fun ClassPropertyBase.regExpLiteral(block: RegExpLiteral.() -> Unit): RegExpLiteral {
    return RegExpLiteralImpl().apply(block)
}

/**
 * ClassPropertyBase#value: Expression
 * extension function for create Expression -> JSXTextImpl
 */
fun ClassPropertyBase.jSXText(block: JSXText.() -> Unit): JSXText {
    return JSXTextImpl().apply(block)
}

/**
 * ClassPropertyBase#value: Expression
 * extension function for create Expression -> TemplateLiteralImpl
 */
fun ClassPropertyBase.templateLiteral(block: TemplateLiteral.() -> Unit): TemplateLiteral {
    return TemplateLiteralImpl().apply(block)
}

/**
 * ClassPropertyBase#value: Expression
 * extension function for create Expression -> TaggedTemplateExpressionImpl
 */
fun ClassPropertyBase.taggedTemplateExpression(block: TaggedTemplateExpression.() -> Unit): TaggedTemplateExpression {
    return TaggedTemplateExpressionImpl().apply(block)
}

/**
 * ClassPropertyBase#value: Expression
 * extension function for create Expression -> ArrowFunctionExpressionImpl
 */
fun ClassPropertyBase.arrowFunctionExpression(block: ArrowFunctionExpression.() -> Unit): ArrowFunctionExpression {
    return ArrowFunctionExpressionImpl().apply(block)
}

/**
 * ClassPropertyBase#value: Expression
 * extension function for create Expression -> ClassExpressionImpl
 */
fun ClassPropertyBase.classExpression(block: ClassExpression.() -> Unit): ClassExpression {
    return ClassExpressionImpl().apply(block)
}

/**
 * ClassPropertyBase#value: Expression
 * extension function for create Expression -> YieldExpressionImpl
 */
fun ClassPropertyBase.yieldExpression(block: YieldExpression.() -> Unit): YieldExpression {
    return YieldExpressionImpl().apply(block)
}

/**
 * ClassPropertyBase#value: Expression
 * extension function for create Expression -> MetaPropertyImpl
 */
fun ClassPropertyBase.metaProperty(block: MetaProperty.() -> Unit): MetaProperty {
    return MetaPropertyImpl().apply(block)
}

/**
 * ClassPropertyBase#value: Expression
 * extension function for create Expression -> AwaitExpressionImpl
 */
fun ClassPropertyBase.awaitExpression(block: AwaitExpression.() -> Unit): AwaitExpression {
    return AwaitExpressionImpl().apply(block)
}

/**
 * ClassPropertyBase#value: Expression
 * extension function for create Expression -> ParenthesisExpressionImpl
 */
fun ClassPropertyBase.parenthesisExpression(block: ParenthesisExpression.() -> Unit): ParenthesisExpression {
    return ParenthesisExpressionImpl().apply(block)
}

/**
 * ClassPropertyBase#value: Expression
 * extension function for create Expression -> JSXMemberExpressionImpl
 */
fun ClassPropertyBase.jSXMemberExpression(block: JSXMemberExpression.() -> Unit): JSXMemberExpression {
    return JSXMemberExpressionImpl().apply(block)
}

/**
 * ClassPropertyBase#value: Expression
 * extension function for create Expression -> JSXNamespacedNameImpl
 */
fun ClassPropertyBase.jSXNamespacedName(block: JSXNamespacedName.() -> Unit): JSXNamespacedName {
    return JSXNamespacedNameImpl().apply(block)
}

/**
 * ClassPropertyBase#value: Expression
 * extension function for create Expression -> JSXEmptyExpressionImpl
 */
fun ClassPropertyBase.jSXEmptyExpression(block: JSXEmptyExpression.() -> Unit): JSXEmptyExpression {
    return JSXEmptyExpressionImpl().apply(block)
}

/**
 * ClassPropertyBase#value: Expression
 * extension function for create Expression -> JSXElementImpl
 */
fun ClassPropertyBase.jSXElement(block: JSXElement.() -> Unit): JSXElement {
    return JSXElementImpl().apply(block)
}

/**
 * ClassPropertyBase#value: Expression
 * extension function for create Expression -> JSXFragmentImpl
 */
fun ClassPropertyBase.jSXFragment(block: JSXFragment.() -> Unit): JSXFragment {
    return JSXFragmentImpl().apply(block)
}

/**
 * ClassPropertyBase#value: Expression
 * extension function for create Expression -> TsTypeAssertionImpl
 */
fun ClassPropertyBase.tsTypeAssertion(block: TsTypeAssertion.() -> Unit): TsTypeAssertion {
    return TsTypeAssertionImpl().apply(block)
}

/**
 * ClassPropertyBase#value: Expression
 * extension function for create Expression -> TsConstAssertionImpl
 */
fun ClassPropertyBase.tsConstAssertion(block: TsConstAssertion.() -> Unit): TsConstAssertion {
    return TsConstAssertionImpl().apply(block)
}

/**
 * ClassPropertyBase#value: Expression
 * extension function for create Expression -> TsNonNullExpressionImpl
 */
fun ClassPropertyBase.tsNonNullExpression(block: TsNonNullExpression.() -> Unit): TsNonNullExpression {
    return TsNonNullExpressionImpl().apply(block)
}

/**
 * ClassPropertyBase#value: Expression
 * extension function for create Expression -> TsAsExpressionImpl
 */
fun ClassPropertyBase.tsAsExpression(block: TsAsExpression.() -> Unit): TsAsExpression {
    return TsAsExpressionImpl().apply(block)
}

/**
 * ClassPropertyBase#value: Expression
 * extension function for create Expression -> TsSatisfiesExpressionImpl
 */
fun ClassPropertyBase.tsSatisfiesExpression(block: TsSatisfiesExpression.() -> Unit): TsSatisfiesExpression {
    return TsSatisfiesExpressionImpl().apply(block)
}

/**
 * ClassPropertyBase#value: Expression
 * extension function for create Expression -> TsInstantiationImpl
 */
fun ClassPropertyBase.tsInstantiation(block: TsInstantiation.() -> Unit): TsInstantiation {
    return TsInstantiationImpl().apply(block)
}

/**
 * ClassPropertyBase#value: Expression
 * extension function for create Expression -> PrivateNameImpl
 */
fun ClassPropertyBase.privateName(block: PrivateName.() -> Unit): PrivateName {
    return PrivateNameImpl().apply(block)
}

/**
 * ClassPropertyBase#value: Expression
 * extension function for create Expression -> OptionalChainingExpressionImpl
 */
fun ClassPropertyBase.optionalChainingExpression(block: OptionalChainingExpression.() -> Unit): OptionalChainingExpression {
    return OptionalChainingExpressionImpl().apply(block)
}

/**
 * ClassPropertyBase#value: Expression
 * extension function for create Expression -> InvalidImpl
 */
fun ClassPropertyBase.invalid(block: Invalid.() -> Unit): Invalid {
    return InvalidImpl().apply(block)
}

/**
 * ClassPropertyBase#typeAnnotation: TsTypeAnnotation
 * extension function for create TsTypeAnnotation -> TsTypeAnnotationImpl
 */
fun ClassPropertyBase.tsTypeAnnotation(block: TsTypeAnnotation.() -> Unit): TsTypeAnnotation {
    return TsTypeAnnotationImpl().apply(block)
}

fun ClassPropertyBase.span(block: Span.() -> Unit): Span {
    return Span().apply(block)
}

/**
 * ClassPropertyBase#decorators: Array<Decorator>
 * extension function for create Array<Decorator> -> DecoratorImpl
 */
fun ClassPropertyBase.decorator(block: Decorator.() -> Unit): Decorator {
    return DecoratorImpl().apply(block)
}
