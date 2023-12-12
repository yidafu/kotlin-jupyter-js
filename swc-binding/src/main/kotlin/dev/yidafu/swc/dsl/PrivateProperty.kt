package dev.yidafu.swc.dsl

import dev.yidafu.swc.types.*

/**
 * PrivateProperty#value: Expression
 * extension function for create Expression -> PrivateNameImpl
 */
fun PrivateProperty.privateName(block: PrivateName.() -> Unit): PrivateName {
    return PrivateNameImpl().apply(block)
}

/**
 * PrivateProperty#value: Expression
 * extension function for create Expression -> ThisExpressionImpl
 */
fun PrivateProperty.thisExpression(block: ThisExpression.() -> Unit): ThisExpression {
    return ThisExpressionImpl().apply(block)
}

/**
 * PrivateProperty#value: Expression
 * extension function for create Expression -> ArrayExpressionImpl
 */
fun PrivateProperty.arrayExpression(block: ArrayExpression.() -> Unit): ArrayExpression {
    return ArrayExpressionImpl().apply(block)
}

/**
 * PrivateProperty#value: Expression
 * extension function for create Expression -> ObjectExpressionImpl
 */
fun PrivateProperty.objectExpression(block: ObjectExpression.() -> Unit): ObjectExpression {
    return ObjectExpressionImpl().apply(block)
}

/**
 * PrivateProperty#value: Expression
 * extension function for create Expression -> FunctionExpressionImpl
 */
fun PrivateProperty.functionExpression(block: FunctionExpression.() -> Unit): FunctionExpression {
    return FunctionExpressionImpl().apply(block)
}

/**
 * PrivateProperty#value: Expression
 * extension function for create Expression -> UnaryExpressionImpl
 */
fun PrivateProperty.unaryExpression(block: UnaryExpression.() -> Unit): UnaryExpression {
    return UnaryExpressionImpl().apply(block)
}

/**
 * PrivateProperty#value: Expression
 * extension function for create Expression -> UpdateExpressionImpl
 */
fun PrivateProperty.updateExpression(block: UpdateExpression.() -> Unit): UpdateExpression {
    return UpdateExpressionImpl().apply(block)
}

/**
 * PrivateProperty#value: Expression
 * extension function for create Expression -> BinaryExpressionImpl
 */
fun PrivateProperty.binaryExpression(block: BinaryExpression.() -> Unit): BinaryExpression {
    return BinaryExpressionImpl().apply(block)
}

/**
 * PrivateProperty#value: Expression
 * extension function for create Expression -> AssignmentExpressionImpl
 */
fun PrivateProperty.assignmentExpression(block: AssignmentExpression.() -> Unit): AssignmentExpression {
    return AssignmentExpressionImpl().apply(block)
}

/**
 * PrivateProperty#value: Expression
 * extension function for create Expression -> MemberExpressionImpl
 */
fun PrivateProperty.memberExpression(block: MemberExpression.() -> Unit): MemberExpression {
    return MemberExpressionImpl().apply(block)
}

/**
 * PrivateProperty#value: Expression
 * extension function for create Expression -> SuperPropExpressionImpl
 */
fun PrivateProperty.superPropExpression(block: SuperPropExpression.() -> Unit): SuperPropExpression {
    return SuperPropExpressionImpl().apply(block)
}

/**
 * PrivateProperty#value: Expression
 * extension function for create Expression -> ConditionalExpressionImpl
 */
fun PrivateProperty.conditionalExpression(block: ConditionalExpression.() -> Unit): ConditionalExpression {
    return ConditionalExpressionImpl().apply(block)
}

/**
 * PrivateProperty#value: Expression
 * extension function for create Expression -> CallExpressionImpl
 */
fun PrivateProperty.callExpression(block: CallExpression.() -> Unit): CallExpression {
    return CallExpressionImpl().apply(block)
}

/**
 * PrivateProperty#value: Expression
 * extension function for create Expression -> NewExpressionImpl
 */
fun PrivateProperty.newExpression(block: NewExpression.() -> Unit): NewExpression {
    return NewExpressionImpl().apply(block)
}

/**
 * PrivateProperty#value: Expression
 * extension function for create Expression -> SequenceExpressionImpl
 */
fun PrivateProperty.sequenceExpression(block: SequenceExpression.() -> Unit): SequenceExpression {
    return SequenceExpressionImpl().apply(block)
}

/**
 * PrivateProperty#value: Expression
 * extension function for create Expression -> IdentifierImpl
 */
fun PrivateProperty.identifier(block: Identifier.() -> Unit): Identifier {
    return IdentifierImpl().apply(block)
}

/**
 * PrivateProperty#value: Expression
 * extension function for create Expression -> StringLiteralImpl
 */
fun PrivateProperty.stringLiteral(block: StringLiteral.() -> Unit): StringLiteral {
    return StringLiteralImpl().apply(block)
}

/**
 * PrivateProperty#value: Expression
 * extension function for create Expression -> BooleanLiteralImpl
 */
fun PrivateProperty.booleanLiteral(block: BooleanLiteral.() -> Unit): BooleanLiteral {
    return BooleanLiteralImpl().apply(block)
}

/**
 * PrivateProperty#value: Expression
 * extension function for create Expression -> NullLiteralImpl
 */
fun PrivateProperty.nullLiteral(block: NullLiteral.() -> Unit): NullLiteral {
    return NullLiteralImpl().apply(block)
}

/**
 * PrivateProperty#value: Expression
 * extension function for create Expression -> NumericLiteralImpl
 */
fun PrivateProperty.numericLiteral(block: NumericLiteral.() -> Unit): NumericLiteral {
    return NumericLiteralImpl().apply(block)
}

/**
 * PrivateProperty#value: Expression
 * extension function for create Expression -> BigIntLiteralImpl
 */
fun PrivateProperty.bigIntLiteral(block: BigIntLiteral.() -> Unit): BigIntLiteral {
    return BigIntLiteralImpl().apply(block)
}

/**
 * PrivateProperty#value: Expression
 * extension function for create Expression -> RegExpLiteralImpl
 */
fun PrivateProperty.regExpLiteral(block: RegExpLiteral.() -> Unit): RegExpLiteral {
    return RegExpLiteralImpl().apply(block)
}

/**
 * PrivateProperty#value: Expression
 * extension function for create Expression -> JSXTextImpl
 */
fun PrivateProperty.jSXText(block: JSXText.() -> Unit): JSXText {
    return JSXTextImpl().apply(block)
}

/**
 * PrivateProperty#value: Expression
 * extension function for create Expression -> TemplateLiteralImpl
 */
fun PrivateProperty.templateLiteral(block: TemplateLiteral.() -> Unit): TemplateLiteral {
    return TemplateLiteralImpl().apply(block)
}

/**
 * PrivateProperty#value: Expression
 * extension function for create Expression -> TaggedTemplateExpressionImpl
 */
fun PrivateProperty.taggedTemplateExpression(block: TaggedTemplateExpression.() -> Unit): TaggedTemplateExpression {
    return TaggedTemplateExpressionImpl().apply(block)
}

/**
 * PrivateProperty#value: Expression
 * extension function for create Expression -> ArrowFunctionExpressionImpl
 */
fun PrivateProperty.arrowFunctionExpression(block: ArrowFunctionExpression.() -> Unit): ArrowFunctionExpression {
    return ArrowFunctionExpressionImpl().apply(block)
}

/**
 * PrivateProperty#value: Expression
 * extension function for create Expression -> ClassExpressionImpl
 */
fun PrivateProperty.classExpression(block: ClassExpression.() -> Unit): ClassExpression {
    return ClassExpressionImpl().apply(block)
}

/**
 * PrivateProperty#value: Expression
 * extension function for create Expression -> YieldExpressionImpl
 */
fun PrivateProperty.yieldExpression(block: YieldExpression.() -> Unit): YieldExpression {
    return YieldExpressionImpl().apply(block)
}

/**
 * PrivateProperty#value: Expression
 * extension function for create Expression -> MetaPropertyImpl
 */
fun PrivateProperty.metaProperty(block: MetaProperty.() -> Unit): MetaProperty {
    return MetaPropertyImpl().apply(block)
}

/**
 * PrivateProperty#value: Expression
 * extension function for create Expression -> AwaitExpressionImpl
 */
fun PrivateProperty.awaitExpression(block: AwaitExpression.() -> Unit): AwaitExpression {
    return AwaitExpressionImpl().apply(block)
}

/**
 * PrivateProperty#value: Expression
 * extension function for create Expression -> ParenthesisExpressionImpl
 */
fun PrivateProperty.parenthesisExpression(block: ParenthesisExpression.() -> Unit): ParenthesisExpression {
    return ParenthesisExpressionImpl().apply(block)
}

/**
 * PrivateProperty#value: Expression
 * extension function for create Expression -> JSXMemberExpressionImpl
 */
fun PrivateProperty.jSXMemberExpression(block: JSXMemberExpression.() -> Unit): JSXMemberExpression {
    return JSXMemberExpressionImpl().apply(block)
}

/**
 * PrivateProperty#value: Expression
 * extension function for create Expression -> JSXNamespacedNameImpl
 */
fun PrivateProperty.jSXNamespacedName(block: JSXNamespacedName.() -> Unit): JSXNamespacedName {
    return JSXNamespacedNameImpl().apply(block)
}

/**
 * PrivateProperty#value: Expression
 * extension function for create Expression -> JSXEmptyExpressionImpl
 */
fun PrivateProperty.jSXEmptyExpression(block: JSXEmptyExpression.() -> Unit): JSXEmptyExpression {
    return JSXEmptyExpressionImpl().apply(block)
}

/**
 * PrivateProperty#value: Expression
 * extension function for create Expression -> JSXElementImpl
 */
fun PrivateProperty.jSXElement(block: JSXElement.() -> Unit): JSXElement {
    return JSXElementImpl().apply(block)
}

/**
 * PrivateProperty#value: Expression
 * extension function for create Expression -> JSXFragmentImpl
 */
fun PrivateProperty.jSXFragment(block: JSXFragment.() -> Unit): JSXFragment {
    return JSXFragmentImpl().apply(block)
}

/**
 * PrivateProperty#value: Expression
 * extension function for create Expression -> TsTypeAssertionImpl
 */
fun PrivateProperty.tsTypeAssertion(block: TsTypeAssertion.() -> Unit): TsTypeAssertion {
    return TsTypeAssertionImpl().apply(block)
}

/**
 * PrivateProperty#value: Expression
 * extension function for create Expression -> TsConstAssertionImpl
 */
fun PrivateProperty.tsConstAssertion(block: TsConstAssertion.() -> Unit): TsConstAssertion {
    return TsConstAssertionImpl().apply(block)
}

/**
 * PrivateProperty#value: Expression
 * extension function for create Expression -> TsNonNullExpressionImpl
 */
fun PrivateProperty.tsNonNullExpression(block: TsNonNullExpression.() -> Unit): TsNonNullExpression {
    return TsNonNullExpressionImpl().apply(block)
}

/**
 * PrivateProperty#value: Expression
 * extension function for create Expression -> TsAsExpressionImpl
 */
fun PrivateProperty.tsAsExpression(block: TsAsExpression.() -> Unit): TsAsExpression {
    return TsAsExpressionImpl().apply(block)
}

/**
 * PrivateProperty#value: Expression
 * extension function for create Expression -> TsSatisfiesExpressionImpl
 */
fun PrivateProperty.tsSatisfiesExpression(block: TsSatisfiesExpression.() -> Unit): TsSatisfiesExpression {
    return TsSatisfiesExpressionImpl().apply(block)
}

/**
 * PrivateProperty#value: Expression
 * extension function for create Expression -> TsInstantiationImpl
 */
fun PrivateProperty.tsInstantiation(block: TsInstantiation.() -> Unit): TsInstantiation {
    return TsInstantiationImpl().apply(block)
}

/**
 * PrivateProperty#value: Expression
 * extension function for create Expression -> OptionalChainingExpressionImpl
 */
fun PrivateProperty.optionalChainingExpression(block: OptionalChainingExpression.() -> Unit): OptionalChainingExpression {
    return OptionalChainingExpressionImpl().apply(block)
}

/**
 * PrivateProperty#value: Expression
 * extension function for create Expression -> InvalidImpl
 */
fun PrivateProperty.invalid(block: Invalid.() -> Unit): Invalid {
    return InvalidImpl().apply(block)
}

/**
 * PrivateProperty#typeAnnotation: TsTypeAnnotation
 * extension function for create TsTypeAnnotation -> TsTypeAnnotationImpl
 */
fun PrivateProperty.tsTypeAnnotation(block: TsTypeAnnotation.() -> Unit): TsTypeAnnotation {
    return TsTypeAnnotationImpl().apply(block)
}

fun PrivateProperty.span(block: Span.() -> Unit): Span {
    return Span().apply(block)
}

/**
 * PrivateProperty#decorators: Array<Decorator>
 * extension function for create Array<Decorator> -> DecoratorImpl
 */
fun PrivateProperty.decorator(block: Decorator.() -> Unit): Decorator {
    return DecoratorImpl().apply(block)
}
