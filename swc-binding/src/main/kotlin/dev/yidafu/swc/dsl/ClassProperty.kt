package dev.yidafu.swc.dsl

import dev.yidafu.swc.types.*

/**
 * ClassProperty#value: Expression
 * extension function for create Expression -> IdentifierImpl
 */
fun ClassProperty.identifier(block: Identifier.() -> Unit): Identifier {
    return IdentifierImpl().apply(block)
}

/**
 * ClassProperty#value: Expression
 * extension function for create Expression -> StringLiteralImpl
 */
fun ClassProperty.stringLiteral(block: StringLiteral.() -> Unit): StringLiteral {
    return StringLiteralImpl().apply(block)
}

/**
 * ClassProperty#value: Expression
 * extension function for create Expression -> NumericLiteralImpl
 */
fun ClassProperty.numericLiteral(block: NumericLiteral.() -> Unit): NumericLiteral {
    return NumericLiteralImpl().apply(block)
}

/**
 * ClassProperty#key: PropertyName
 * extension function for create PropertyName -> ComputedPropNameImpl
 */
fun ClassProperty.computedPropName(block: ComputedPropName.() -> Unit): ComputedPropName {
    return ComputedPropNameImpl().apply(block)
}

/**
 * ClassProperty#value: Expression
 * extension function for create Expression -> BigIntLiteralImpl
 */
fun ClassProperty.bigIntLiteral(block: BigIntLiteral.() -> Unit): BigIntLiteral {
    return BigIntLiteralImpl().apply(block)
}

/**
 * ClassProperty#value: Expression
 * extension function for create Expression -> ThisExpressionImpl
 */
fun ClassProperty.thisExpression(block: ThisExpression.() -> Unit): ThisExpression {
    return ThisExpressionImpl().apply(block)
}

/**
 * ClassProperty#value: Expression
 * extension function for create Expression -> ArrayExpressionImpl
 */
fun ClassProperty.arrayExpression(block: ArrayExpression.() -> Unit): ArrayExpression {
    return ArrayExpressionImpl().apply(block)
}

/**
 * ClassProperty#value: Expression
 * extension function for create Expression -> ObjectExpressionImpl
 */
fun ClassProperty.objectExpression(block: ObjectExpression.() -> Unit): ObjectExpression {
    return ObjectExpressionImpl().apply(block)
}

/**
 * ClassProperty#value: Expression
 * extension function for create Expression -> FunctionExpressionImpl
 */
fun ClassProperty.functionExpression(block: FunctionExpression.() -> Unit): FunctionExpression {
    return FunctionExpressionImpl().apply(block)
}

/**
 * ClassProperty#value: Expression
 * extension function for create Expression -> UnaryExpressionImpl
 */
fun ClassProperty.unaryExpression(block: UnaryExpression.() -> Unit): UnaryExpression {
    return UnaryExpressionImpl().apply(block)
}

/**
 * ClassProperty#value: Expression
 * extension function for create Expression -> UpdateExpressionImpl
 */
fun ClassProperty.updateExpression(block: UpdateExpression.() -> Unit): UpdateExpression {
    return UpdateExpressionImpl().apply(block)
}

/**
 * ClassProperty#value: Expression
 * extension function for create Expression -> BinaryExpressionImpl
 */
fun ClassProperty.binaryExpression(block: BinaryExpression.() -> Unit): BinaryExpression {
    return BinaryExpressionImpl().apply(block)
}

/**
 * ClassProperty#value: Expression
 * extension function for create Expression -> AssignmentExpressionImpl
 */
fun ClassProperty.assignmentExpression(block: AssignmentExpression.() -> Unit): AssignmentExpression {
    return AssignmentExpressionImpl().apply(block)
}

/**
 * ClassProperty#value: Expression
 * extension function for create Expression -> MemberExpressionImpl
 */
fun ClassProperty.memberExpression(block: MemberExpression.() -> Unit): MemberExpression {
    return MemberExpressionImpl().apply(block)
}

/**
 * ClassProperty#value: Expression
 * extension function for create Expression -> SuperPropExpressionImpl
 */
fun ClassProperty.superPropExpression(block: SuperPropExpression.() -> Unit): SuperPropExpression {
    return SuperPropExpressionImpl().apply(block)
}

/**
 * ClassProperty#value: Expression
 * extension function for create Expression -> ConditionalExpressionImpl
 */
fun ClassProperty.conditionalExpression(block: ConditionalExpression.() -> Unit): ConditionalExpression {
    return ConditionalExpressionImpl().apply(block)
}

/**
 * ClassProperty#value: Expression
 * extension function for create Expression -> CallExpressionImpl
 */
fun ClassProperty.callExpression(block: CallExpression.() -> Unit): CallExpression {
    return CallExpressionImpl().apply(block)
}

/**
 * ClassProperty#value: Expression
 * extension function for create Expression -> NewExpressionImpl
 */
fun ClassProperty.newExpression(block: NewExpression.() -> Unit): NewExpression {
    return NewExpressionImpl().apply(block)
}

/**
 * ClassProperty#value: Expression
 * extension function for create Expression -> SequenceExpressionImpl
 */
fun ClassProperty.sequenceExpression(block: SequenceExpression.() -> Unit): SequenceExpression {
    return SequenceExpressionImpl().apply(block)
}

/**
 * ClassProperty#value: Expression
 * extension function for create Expression -> BooleanLiteralImpl
 */
fun ClassProperty.booleanLiteral(block: BooleanLiteral.() -> Unit): BooleanLiteral {
    return BooleanLiteralImpl().apply(block)
}

/**
 * ClassProperty#value: Expression
 * extension function for create Expression -> NullLiteralImpl
 */
fun ClassProperty.nullLiteral(block: NullLiteral.() -> Unit): NullLiteral {
    return NullLiteralImpl().apply(block)
}

/**
 * ClassProperty#value: Expression
 * extension function for create Expression -> RegExpLiteralImpl
 */
fun ClassProperty.regExpLiteral(block: RegExpLiteral.() -> Unit): RegExpLiteral {
    return RegExpLiteralImpl().apply(block)
}

/**
 * ClassProperty#value: Expression
 * extension function for create Expression -> JSXTextImpl
 */
fun ClassProperty.jSXText(block: JSXText.() -> Unit): JSXText {
    return JSXTextImpl().apply(block)
}

/**
 * ClassProperty#value: Expression
 * extension function for create Expression -> TemplateLiteralImpl
 */
fun ClassProperty.templateLiteral(block: TemplateLiteral.() -> Unit): TemplateLiteral {
    return TemplateLiteralImpl().apply(block)
}

/**
 * ClassProperty#value: Expression
 * extension function for create Expression -> TaggedTemplateExpressionImpl
 */
fun ClassProperty.taggedTemplateExpression(block: TaggedTemplateExpression.() -> Unit): TaggedTemplateExpression {
    return TaggedTemplateExpressionImpl().apply(block)
}

/**
 * ClassProperty#value: Expression
 * extension function for create Expression -> ArrowFunctionExpressionImpl
 */
fun ClassProperty.arrowFunctionExpression(block: ArrowFunctionExpression.() -> Unit): ArrowFunctionExpression {
    return ArrowFunctionExpressionImpl().apply(block)
}

/**
 * ClassProperty#value: Expression
 * extension function for create Expression -> ClassExpressionImpl
 */
fun ClassProperty.classExpression(block: ClassExpression.() -> Unit): ClassExpression {
    return ClassExpressionImpl().apply(block)
}

/**
 * ClassProperty#value: Expression
 * extension function for create Expression -> YieldExpressionImpl
 */
fun ClassProperty.yieldExpression(block: YieldExpression.() -> Unit): YieldExpression {
    return YieldExpressionImpl().apply(block)
}

/**
 * ClassProperty#value: Expression
 * extension function for create Expression -> MetaPropertyImpl
 */
fun ClassProperty.metaProperty(block: MetaProperty.() -> Unit): MetaProperty {
    return MetaPropertyImpl().apply(block)
}

/**
 * ClassProperty#value: Expression
 * extension function for create Expression -> AwaitExpressionImpl
 */
fun ClassProperty.awaitExpression(block: AwaitExpression.() -> Unit): AwaitExpression {
    return AwaitExpressionImpl().apply(block)
}

/**
 * ClassProperty#value: Expression
 * extension function for create Expression -> ParenthesisExpressionImpl
 */
fun ClassProperty.parenthesisExpression(block: ParenthesisExpression.() -> Unit): ParenthesisExpression {
    return ParenthesisExpressionImpl().apply(block)
}

/**
 * ClassProperty#value: Expression
 * extension function for create Expression -> JSXMemberExpressionImpl
 */
fun ClassProperty.jSXMemberExpression(block: JSXMemberExpression.() -> Unit): JSXMemberExpression {
    return JSXMemberExpressionImpl().apply(block)
}

/**
 * ClassProperty#value: Expression
 * extension function for create Expression -> JSXNamespacedNameImpl
 */
fun ClassProperty.jSXNamespacedName(block: JSXNamespacedName.() -> Unit): JSXNamespacedName {
    return JSXNamespacedNameImpl().apply(block)
}

/**
 * ClassProperty#value: Expression
 * extension function for create Expression -> JSXEmptyExpressionImpl
 */
fun ClassProperty.jSXEmptyExpression(block: JSXEmptyExpression.() -> Unit): JSXEmptyExpression {
    return JSXEmptyExpressionImpl().apply(block)
}

/**
 * ClassProperty#value: Expression
 * extension function for create Expression -> JSXElementImpl
 */
fun ClassProperty.jSXElement(block: JSXElement.() -> Unit): JSXElement {
    return JSXElementImpl().apply(block)
}

/**
 * ClassProperty#value: Expression
 * extension function for create Expression -> JSXFragmentImpl
 */
fun ClassProperty.jSXFragment(block: JSXFragment.() -> Unit): JSXFragment {
    return JSXFragmentImpl().apply(block)
}

/**
 * ClassProperty#value: Expression
 * extension function for create Expression -> TsTypeAssertionImpl
 */
fun ClassProperty.tsTypeAssertion(block: TsTypeAssertion.() -> Unit): TsTypeAssertion {
    return TsTypeAssertionImpl().apply(block)
}

/**
 * ClassProperty#value: Expression
 * extension function for create Expression -> TsConstAssertionImpl
 */
fun ClassProperty.tsConstAssertion(block: TsConstAssertion.() -> Unit): TsConstAssertion {
    return TsConstAssertionImpl().apply(block)
}

/**
 * ClassProperty#value: Expression
 * extension function for create Expression -> TsNonNullExpressionImpl
 */
fun ClassProperty.tsNonNullExpression(block: TsNonNullExpression.() -> Unit): TsNonNullExpression {
    return TsNonNullExpressionImpl().apply(block)
}

/**
 * ClassProperty#value: Expression
 * extension function for create Expression -> TsAsExpressionImpl
 */
fun ClassProperty.tsAsExpression(block: TsAsExpression.() -> Unit): TsAsExpression {
    return TsAsExpressionImpl().apply(block)
}

/**
 * ClassProperty#value: Expression
 * extension function for create Expression -> TsSatisfiesExpressionImpl
 */
fun ClassProperty.tsSatisfiesExpression(block: TsSatisfiesExpression.() -> Unit): TsSatisfiesExpression {
    return TsSatisfiesExpressionImpl().apply(block)
}

/**
 * ClassProperty#value: Expression
 * extension function for create Expression -> TsInstantiationImpl
 */
fun ClassProperty.tsInstantiation(block: TsInstantiation.() -> Unit): TsInstantiation {
    return TsInstantiationImpl().apply(block)
}

/**
 * ClassProperty#value: Expression
 * extension function for create Expression -> PrivateNameImpl
 */
fun ClassProperty.privateName(block: PrivateName.() -> Unit): PrivateName {
    return PrivateNameImpl().apply(block)
}

/**
 * ClassProperty#value: Expression
 * extension function for create Expression -> OptionalChainingExpressionImpl
 */
fun ClassProperty.optionalChainingExpression(block: OptionalChainingExpression.() -> Unit): OptionalChainingExpression {
    return OptionalChainingExpressionImpl().apply(block)
}

/**
 * ClassProperty#value: Expression
 * extension function for create Expression -> InvalidImpl
 */
fun ClassProperty.invalid(block: Invalid.() -> Unit): Invalid {
    return InvalidImpl().apply(block)
}

/**
 * ClassProperty#typeAnnotation: TsTypeAnnotation
 * extension function for create TsTypeAnnotation -> TsTypeAnnotationImpl
 */
fun ClassProperty.tsTypeAnnotation(block: TsTypeAnnotation.() -> Unit): TsTypeAnnotation {
    return TsTypeAnnotationImpl().apply(block)
}

fun ClassProperty.span(block: Span.() -> Unit): Span {
    return Span().apply(block)
}

/**
 * ClassProperty#decorators: Array<Decorator>
 * extension function for create Array<Decorator> -> DecoratorImpl
 */
fun ClassProperty.decorator(block: Decorator.() -> Unit): Decorator {
    return DecoratorImpl().apply(block)
}
