package dev.yidafu.swc.dsl

import dev.yidafu.swc.types.*

fun RestElement.span(block: Span.() -> Unit): Span {
    return Span().apply(block)
}

/**
 * RestElement#argument: Pattern
 * extension function for create Pattern -> BindingIdentifierImpl
 */
fun RestElement.bindingIdentifier(block: BindingIdentifier.() -> Unit): BindingIdentifier {
    return BindingIdentifierImpl().apply(block)
}

/**
 * RestElement#argument: Pattern
 * extension function for create Pattern -> ArrayPatternImpl
 */
fun RestElement.arrayPattern(block: ArrayPattern.() -> Unit): ArrayPattern {
    return ArrayPatternImpl().apply(block)
}

/**
 * RestElement#argument: Pattern
 * extension function for create Pattern -> ObjectPatternImpl
 */
fun RestElement.objectPattern(block: ObjectPattern.() -> Unit): ObjectPattern {
    return ObjectPatternImpl().apply(block)
}

/**
 * RestElement#argument: Pattern
 * extension function for create Pattern -> AssignmentPatternImpl
 */
fun RestElement.assignmentPattern(block: AssignmentPattern.() -> Unit): AssignmentPattern {
    return AssignmentPatternImpl().apply(block)
}

/**
 * RestElement#argument: Pattern
 * extension function for create Pattern -> InvalidImpl
 */
fun RestElement.invalid(block: Invalid.() -> Unit): Invalid {
    return InvalidImpl().apply(block)
}

/**
 * RestElement#argument: Pattern
 * extension function for create Pattern -> ThisExpressionImpl
 */
fun RestElement.thisExpression(block: ThisExpression.() -> Unit): ThisExpression {
    return ThisExpressionImpl().apply(block)
}

/**
 * RestElement#argument: Pattern
 * extension function for create Pattern -> ArrayExpressionImpl
 */
fun RestElement.arrayExpression(block: ArrayExpression.() -> Unit): ArrayExpression {
    return ArrayExpressionImpl().apply(block)
}

/**
 * RestElement#argument: Pattern
 * extension function for create Pattern -> ObjectExpressionImpl
 */
fun RestElement.objectExpression(block: ObjectExpression.() -> Unit): ObjectExpression {
    return ObjectExpressionImpl().apply(block)
}

/**
 * RestElement#argument: Pattern
 * extension function for create Pattern -> FunctionExpressionImpl
 */
fun RestElement.functionExpression(block: FunctionExpression.() -> Unit): FunctionExpression {
    return FunctionExpressionImpl().apply(block)
}

/**
 * RestElement#argument: Pattern
 * extension function for create Pattern -> UnaryExpressionImpl
 */
fun RestElement.unaryExpression(block: UnaryExpression.() -> Unit): UnaryExpression {
    return UnaryExpressionImpl().apply(block)
}

/**
 * RestElement#argument: Pattern
 * extension function for create Pattern -> UpdateExpressionImpl
 */
fun RestElement.updateExpression(block: UpdateExpression.() -> Unit): UpdateExpression {
    return UpdateExpressionImpl().apply(block)
}

/**
 * RestElement#argument: Pattern
 * extension function for create Pattern -> BinaryExpressionImpl
 */
fun RestElement.binaryExpression(block: BinaryExpression.() -> Unit): BinaryExpression {
    return BinaryExpressionImpl().apply(block)
}

/**
 * RestElement#argument: Pattern
 * extension function for create Pattern -> AssignmentExpressionImpl
 */
fun RestElement.assignmentExpression(block: AssignmentExpression.() -> Unit): AssignmentExpression {
    return AssignmentExpressionImpl().apply(block)
}

/**
 * RestElement#argument: Pattern
 * extension function for create Pattern -> MemberExpressionImpl
 */
fun RestElement.memberExpression(block: MemberExpression.() -> Unit): MemberExpression {
    return MemberExpressionImpl().apply(block)
}

/**
 * RestElement#argument: Pattern
 * extension function for create Pattern -> SuperPropExpressionImpl
 */
fun RestElement.superPropExpression(block: SuperPropExpression.() -> Unit): SuperPropExpression {
    return SuperPropExpressionImpl().apply(block)
}

/**
 * RestElement#argument: Pattern
 * extension function for create Pattern -> ConditionalExpressionImpl
 */
fun RestElement.conditionalExpression(block: ConditionalExpression.() -> Unit): ConditionalExpression {
    return ConditionalExpressionImpl().apply(block)
}

/**
 * RestElement#argument: Pattern
 * extension function for create Pattern -> CallExpressionImpl
 */
fun RestElement.callExpression(block: CallExpression.() -> Unit): CallExpression {
    return CallExpressionImpl().apply(block)
}

/**
 * RestElement#argument: Pattern
 * extension function for create Pattern -> NewExpressionImpl
 */
fun RestElement.newExpression(block: NewExpression.() -> Unit): NewExpression {
    return NewExpressionImpl().apply(block)
}

/**
 * RestElement#argument: Pattern
 * extension function for create Pattern -> SequenceExpressionImpl
 */
fun RestElement.sequenceExpression(block: SequenceExpression.() -> Unit): SequenceExpression {
    return SequenceExpressionImpl().apply(block)
}

/**
 * RestElement#argument: Pattern
 * extension function for create Pattern -> IdentifierImpl
 */
fun RestElement.identifier(block: Identifier.() -> Unit): Identifier {
    return IdentifierImpl().apply(block)
}

/**
 * RestElement#argument: Pattern
 * extension function for create Pattern -> StringLiteralImpl
 */
fun RestElement.stringLiteral(block: StringLiteral.() -> Unit): StringLiteral {
    return StringLiteralImpl().apply(block)
}

/**
 * RestElement#argument: Pattern
 * extension function for create Pattern -> BooleanLiteralImpl
 */
fun RestElement.booleanLiteral(block: BooleanLiteral.() -> Unit): BooleanLiteral {
    return BooleanLiteralImpl().apply(block)
}

/**
 * RestElement#argument: Pattern
 * extension function for create Pattern -> NullLiteralImpl
 */
fun RestElement.nullLiteral(block: NullLiteral.() -> Unit): NullLiteral {
    return NullLiteralImpl().apply(block)
}

/**
 * RestElement#argument: Pattern
 * extension function for create Pattern -> NumericLiteralImpl
 */
fun RestElement.numericLiteral(block: NumericLiteral.() -> Unit): NumericLiteral {
    return NumericLiteralImpl().apply(block)
}

/**
 * RestElement#argument: Pattern
 * extension function for create Pattern -> BigIntLiteralImpl
 */
fun RestElement.bigIntLiteral(block: BigIntLiteral.() -> Unit): BigIntLiteral {
    return BigIntLiteralImpl().apply(block)
}

/**
 * RestElement#argument: Pattern
 * extension function for create Pattern -> RegExpLiteralImpl
 */
fun RestElement.regExpLiteral(block: RegExpLiteral.() -> Unit): RegExpLiteral {
    return RegExpLiteralImpl().apply(block)
}

/**
 * RestElement#argument: Pattern
 * extension function for create Pattern -> JSXTextImpl
 */
fun RestElement.jSXText(block: JSXText.() -> Unit): JSXText {
    return JSXTextImpl().apply(block)
}

/**
 * RestElement#argument: Pattern
 * extension function for create Pattern -> TemplateLiteralImpl
 */
fun RestElement.templateLiteral(block: TemplateLiteral.() -> Unit): TemplateLiteral {
    return TemplateLiteralImpl().apply(block)
}

/**
 * RestElement#argument: Pattern
 * extension function for create Pattern -> TaggedTemplateExpressionImpl
 */
fun RestElement.taggedTemplateExpression(block: TaggedTemplateExpression.() -> Unit): TaggedTemplateExpression {
    return TaggedTemplateExpressionImpl().apply(block)
}

/**
 * RestElement#argument: Pattern
 * extension function for create Pattern -> ArrowFunctionExpressionImpl
 */
fun RestElement.arrowFunctionExpression(block: ArrowFunctionExpression.() -> Unit): ArrowFunctionExpression {
    return ArrowFunctionExpressionImpl().apply(block)
}

/**
 * RestElement#argument: Pattern
 * extension function for create Pattern -> ClassExpressionImpl
 */
fun RestElement.classExpression(block: ClassExpression.() -> Unit): ClassExpression {
    return ClassExpressionImpl().apply(block)
}

/**
 * RestElement#argument: Pattern
 * extension function for create Pattern -> YieldExpressionImpl
 */
fun RestElement.yieldExpression(block: YieldExpression.() -> Unit): YieldExpression {
    return YieldExpressionImpl().apply(block)
}

/**
 * RestElement#argument: Pattern
 * extension function for create Pattern -> MetaPropertyImpl
 */
fun RestElement.metaProperty(block: MetaProperty.() -> Unit): MetaProperty {
    return MetaPropertyImpl().apply(block)
}

/**
 * RestElement#argument: Pattern
 * extension function for create Pattern -> AwaitExpressionImpl
 */
fun RestElement.awaitExpression(block: AwaitExpression.() -> Unit): AwaitExpression {
    return AwaitExpressionImpl().apply(block)
}

/**
 * RestElement#argument: Pattern
 * extension function for create Pattern -> ParenthesisExpressionImpl
 */
fun RestElement.parenthesisExpression(block: ParenthesisExpression.() -> Unit): ParenthesisExpression {
    return ParenthesisExpressionImpl().apply(block)
}

/**
 * RestElement#argument: Pattern
 * extension function for create Pattern -> JSXMemberExpressionImpl
 */
fun RestElement.jSXMemberExpression(block: JSXMemberExpression.() -> Unit): JSXMemberExpression {
    return JSXMemberExpressionImpl().apply(block)
}

/**
 * RestElement#argument: Pattern
 * extension function for create Pattern -> JSXNamespacedNameImpl
 */
fun RestElement.jSXNamespacedName(block: JSXNamespacedName.() -> Unit): JSXNamespacedName {
    return JSXNamespacedNameImpl().apply(block)
}

/**
 * RestElement#argument: Pattern
 * extension function for create Pattern -> JSXEmptyExpressionImpl
 */
fun RestElement.jSXEmptyExpression(block: JSXEmptyExpression.() -> Unit): JSXEmptyExpression {
    return JSXEmptyExpressionImpl().apply(block)
}

/**
 * RestElement#argument: Pattern
 * extension function for create Pattern -> JSXElementImpl
 */
fun RestElement.jSXElement(block: JSXElement.() -> Unit): JSXElement {
    return JSXElementImpl().apply(block)
}

/**
 * RestElement#argument: Pattern
 * extension function for create Pattern -> JSXFragmentImpl
 */
fun RestElement.jSXFragment(block: JSXFragment.() -> Unit): JSXFragment {
    return JSXFragmentImpl().apply(block)
}

/**
 * RestElement#argument: Pattern
 * extension function for create Pattern -> TsTypeAssertionImpl
 */
fun RestElement.tsTypeAssertion(block: TsTypeAssertion.() -> Unit): TsTypeAssertion {
    return TsTypeAssertionImpl().apply(block)
}

/**
 * RestElement#argument: Pattern
 * extension function for create Pattern -> TsConstAssertionImpl
 */
fun RestElement.tsConstAssertion(block: TsConstAssertion.() -> Unit): TsConstAssertion {
    return TsConstAssertionImpl().apply(block)
}

/**
 * RestElement#argument: Pattern
 * extension function for create Pattern -> TsNonNullExpressionImpl
 */
fun RestElement.tsNonNullExpression(block: TsNonNullExpression.() -> Unit): TsNonNullExpression {
    return TsNonNullExpressionImpl().apply(block)
}

/**
 * RestElement#argument: Pattern
 * extension function for create Pattern -> TsAsExpressionImpl
 */
fun RestElement.tsAsExpression(block: TsAsExpression.() -> Unit): TsAsExpression {
    return TsAsExpressionImpl().apply(block)
}

/**
 * RestElement#argument: Pattern
 * extension function for create Pattern -> TsSatisfiesExpressionImpl
 */
fun RestElement.tsSatisfiesExpression(block: TsSatisfiesExpression.() -> Unit): TsSatisfiesExpression {
    return TsSatisfiesExpressionImpl().apply(block)
}

/**
 * RestElement#argument: Pattern
 * extension function for create Pattern -> TsInstantiationImpl
 */
fun RestElement.tsInstantiation(block: TsInstantiation.() -> Unit): TsInstantiation {
    return TsInstantiationImpl().apply(block)
}

/**
 * RestElement#argument: Pattern
 * extension function for create Pattern -> PrivateNameImpl
 */
fun RestElement.privateName(block: PrivateName.() -> Unit): PrivateName {
    return PrivateNameImpl().apply(block)
}

/**
 * RestElement#argument: Pattern
 * extension function for create Pattern -> OptionalChainingExpressionImpl
 */
fun RestElement.optionalChainingExpression(block: OptionalChainingExpression.() -> Unit): OptionalChainingExpression {
    return OptionalChainingExpressionImpl().apply(block)
}

/**
 * RestElement#typeAnnotation: TsTypeAnnotation
 * extension function for create TsTypeAnnotation -> TsTypeAnnotationImpl
 */
fun RestElement.tsTypeAnnotation(block: TsTypeAnnotation.() -> Unit): TsTypeAnnotation {
    return TsTypeAnnotationImpl().apply(block)
}
