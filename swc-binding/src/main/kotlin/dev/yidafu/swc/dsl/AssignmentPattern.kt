package dev.yidafu.swc.dsl

import dev.yidafu.swc.types.*

/**
 * AssignmentPattern#left: Pattern
 * extension function for create Pattern -> BindingIdentifierImpl
 */
fun AssignmentPattern.bindingIdentifier(block: BindingIdentifier.() -> Unit): BindingIdentifier {
    return BindingIdentifierImpl().apply(block)
}

/**
 * AssignmentPattern#left: Pattern
 * extension function for create Pattern -> ArrayPatternImpl
 */
fun AssignmentPattern.arrayPattern(block: ArrayPattern.() -> Unit): ArrayPattern {
    return ArrayPatternImpl().apply(block)
}

/**
 * AssignmentPattern#left: Pattern
 * extension function for create Pattern -> RestElementImpl
 */
fun AssignmentPattern.restElement(block: RestElement.() -> Unit): RestElement {
    return RestElementImpl().apply(block)
}

/**
 * AssignmentPattern#left: Pattern
 * extension function for create Pattern -> ObjectPatternImpl
 */
fun AssignmentPattern.objectPattern(block: ObjectPattern.() -> Unit): ObjectPattern {
    return ObjectPatternImpl().apply(block)
}

/**
 * AssignmentPattern#right: Expression
 * extension function for create Expression -> InvalidImpl
 */
fun AssignmentPattern.invalid(block: Invalid.() -> Unit): Invalid {
    return InvalidImpl().apply(block)
}

/**
 * AssignmentPattern#right: Expression
 * extension function for create Expression -> ThisExpressionImpl
 */
fun AssignmentPattern.thisExpression(block: ThisExpression.() -> Unit): ThisExpression {
    return ThisExpressionImpl().apply(block)
}

/**
 * AssignmentPattern#right: Expression
 * extension function for create Expression -> ArrayExpressionImpl
 */
fun AssignmentPattern.arrayExpression(block: ArrayExpression.() -> Unit): ArrayExpression {
    return ArrayExpressionImpl().apply(block)
}

/**
 * AssignmentPattern#right: Expression
 * extension function for create Expression -> ObjectExpressionImpl
 */
fun AssignmentPattern.objectExpression(block: ObjectExpression.() -> Unit): ObjectExpression {
    return ObjectExpressionImpl().apply(block)
}

/**
 * AssignmentPattern#right: Expression
 * extension function for create Expression -> FunctionExpressionImpl
 */
fun AssignmentPattern.functionExpression(block: FunctionExpression.() -> Unit): FunctionExpression {
    return FunctionExpressionImpl().apply(block)
}

/**
 * AssignmentPattern#right: Expression
 * extension function for create Expression -> UnaryExpressionImpl
 */
fun AssignmentPattern.unaryExpression(block: UnaryExpression.() -> Unit): UnaryExpression {
    return UnaryExpressionImpl().apply(block)
}

/**
 * AssignmentPattern#right: Expression
 * extension function for create Expression -> UpdateExpressionImpl
 */
fun AssignmentPattern.updateExpression(block: UpdateExpression.() -> Unit): UpdateExpression {
    return UpdateExpressionImpl().apply(block)
}

/**
 * AssignmentPattern#right: Expression
 * extension function for create Expression -> BinaryExpressionImpl
 */
fun AssignmentPattern.binaryExpression(block: BinaryExpression.() -> Unit): BinaryExpression {
    return BinaryExpressionImpl().apply(block)
}

/**
 * AssignmentPattern#right: Expression
 * extension function for create Expression -> AssignmentExpressionImpl
 */
fun AssignmentPattern.assignmentExpression(block: AssignmentExpression.() -> Unit): AssignmentExpression {
    return AssignmentExpressionImpl().apply(block)
}

/**
 * AssignmentPattern#right: Expression
 * extension function for create Expression -> MemberExpressionImpl
 */
fun AssignmentPattern.memberExpression(block: MemberExpression.() -> Unit): MemberExpression {
    return MemberExpressionImpl().apply(block)
}

/**
 * AssignmentPattern#right: Expression
 * extension function for create Expression -> SuperPropExpressionImpl
 */
fun AssignmentPattern.superPropExpression(block: SuperPropExpression.() -> Unit): SuperPropExpression {
    return SuperPropExpressionImpl().apply(block)
}

/**
 * AssignmentPattern#right: Expression
 * extension function for create Expression -> ConditionalExpressionImpl
 */
fun AssignmentPattern.conditionalExpression(block: ConditionalExpression.() -> Unit): ConditionalExpression {
    return ConditionalExpressionImpl().apply(block)
}

/**
 * AssignmentPattern#right: Expression
 * extension function for create Expression -> CallExpressionImpl
 */
fun AssignmentPattern.callExpression(block: CallExpression.() -> Unit): CallExpression {
    return CallExpressionImpl().apply(block)
}

/**
 * AssignmentPattern#right: Expression
 * extension function for create Expression -> NewExpressionImpl
 */
fun AssignmentPattern.newExpression(block: NewExpression.() -> Unit): NewExpression {
    return NewExpressionImpl().apply(block)
}

/**
 * AssignmentPattern#right: Expression
 * extension function for create Expression -> SequenceExpressionImpl
 */
fun AssignmentPattern.sequenceExpression(block: SequenceExpression.() -> Unit): SequenceExpression {
    return SequenceExpressionImpl().apply(block)
}

/**
 * AssignmentPattern#right: Expression
 * extension function for create Expression -> IdentifierImpl
 */
fun AssignmentPattern.identifier(block: Identifier.() -> Unit): Identifier {
    return IdentifierImpl().apply(block)
}

/**
 * AssignmentPattern#right: Expression
 * extension function for create Expression -> StringLiteralImpl
 */
fun AssignmentPattern.stringLiteral(block: StringLiteral.() -> Unit): StringLiteral {
    return StringLiteralImpl().apply(block)
}

/**
 * AssignmentPattern#right: Expression
 * extension function for create Expression -> BooleanLiteralImpl
 */
fun AssignmentPattern.booleanLiteral(block: BooleanLiteral.() -> Unit): BooleanLiteral {
    return BooleanLiteralImpl().apply(block)
}

/**
 * AssignmentPattern#right: Expression
 * extension function for create Expression -> NullLiteralImpl
 */
fun AssignmentPattern.nullLiteral(block: NullLiteral.() -> Unit): NullLiteral {
    return NullLiteralImpl().apply(block)
}

/**
 * AssignmentPattern#right: Expression
 * extension function for create Expression -> NumericLiteralImpl
 */
fun AssignmentPattern.numericLiteral(block: NumericLiteral.() -> Unit): NumericLiteral {
    return NumericLiteralImpl().apply(block)
}

/**
 * AssignmentPattern#right: Expression
 * extension function for create Expression -> BigIntLiteralImpl
 */
fun AssignmentPattern.bigIntLiteral(block: BigIntLiteral.() -> Unit): BigIntLiteral {
    return BigIntLiteralImpl().apply(block)
}

/**
 * AssignmentPattern#right: Expression
 * extension function for create Expression -> RegExpLiteralImpl
 */
fun AssignmentPattern.regExpLiteral(block: RegExpLiteral.() -> Unit): RegExpLiteral {
    return RegExpLiteralImpl().apply(block)
}

/**
 * AssignmentPattern#right: Expression
 * extension function for create Expression -> JSXTextImpl
 */
fun AssignmentPattern.jSXText(block: JSXText.() -> Unit): JSXText {
    return JSXTextImpl().apply(block)
}

/**
 * AssignmentPattern#right: Expression
 * extension function for create Expression -> TemplateLiteralImpl
 */
fun AssignmentPattern.templateLiteral(block: TemplateLiteral.() -> Unit): TemplateLiteral {
    return TemplateLiteralImpl().apply(block)
}

/**
 * AssignmentPattern#right: Expression
 * extension function for create Expression -> TaggedTemplateExpressionImpl
 */
fun AssignmentPattern.taggedTemplateExpression(block: TaggedTemplateExpression.() -> Unit): TaggedTemplateExpression {
    return TaggedTemplateExpressionImpl().apply(block)
}

/**
 * AssignmentPattern#right: Expression
 * extension function for create Expression -> ArrowFunctionExpressionImpl
 */
fun AssignmentPattern.arrowFunctionExpression(block: ArrowFunctionExpression.() -> Unit): ArrowFunctionExpression {
    return ArrowFunctionExpressionImpl().apply(block)
}

/**
 * AssignmentPattern#right: Expression
 * extension function for create Expression -> ClassExpressionImpl
 */
fun AssignmentPattern.classExpression(block: ClassExpression.() -> Unit): ClassExpression {
    return ClassExpressionImpl().apply(block)
}

/**
 * AssignmentPattern#right: Expression
 * extension function for create Expression -> YieldExpressionImpl
 */
fun AssignmentPattern.yieldExpression(block: YieldExpression.() -> Unit): YieldExpression {
    return YieldExpressionImpl().apply(block)
}

/**
 * AssignmentPattern#right: Expression
 * extension function for create Expression -> MetaPropertyImpl
 */
fun AssignmentPattern.metaProperty(block: MetaProperty.() -> Unit): MetaProperty {
    return MetaPropertyImpl().apply(block)
}

/**
 * AssignmentPattern#right: Expression
 * extension function for create Expression -> AwaitExpressionImpl
 */
fun AssignmentPattern.awaitExpression(block: AwaitExpression.() -> Unit): AwaitExpression {
    return AwaitExpressionImpl().apply(block)
}

/**
 * AssignmentPattern#right: Expression
 * extension function for create Expression -> ParenthesisExpressionImpl
 */
fun AssignmentPattern.parenthesisExpression(block: ParenthesisExpression.() -> Unit): ParenthesisExpression {
    return ParenthesisExpressionImpl().apply(block)
}

/**
 * AssignmentPattern#right: Expression
 * extension function for create Expression -> JSXMemberExpressionImpl
 */
fun AssignmentPattern.jSXMemberExpression(block: JSXMemberExpression.() -> Unit): JSXMemberExpression {
    return JSXMemberExpressionImpl().apply(block)
}

/**
 * AssignmentPattern#right: Expression
 * extension function for create Expression -> JSXNamespacedNameImpl
 */
fun AssignmentPattern.jSXNamespacedName(block: JSXNamespacedName.() -> Unit): JSXNamespacedName {
    return JSXNamespacedNameImpl().apply(block)
}

/**
 * AssignmentPattern#right: Expression
 * extension function for create Expression -> JSXEmptyExpressionImpl
 */
fun AssignmentPattern.jSXEmptyExpression(block: JSXEmptyExpression.() -> Unit): JSXEmptyExpression {
    return JSXEmptyExpressionImpl().apply(block)
}

/**
 * AssignmentPattern#right: Expression
 * extension function for create Expression -> JSXElementImpl
 */
fun AssignmentPattern.jSXElement(block: JSXElement.() -> Unit): JSXElement {
    return JSXElementImpl().apply(block)
}

/**
 * AssignmentPattern#right: Expression
 * extension function for create Expression -> JSXFragmentImpl
 */
fun AssignmentPattern.jSXFragment(block: JSXFragment.() -> Unit): JSXFragment {
    return JSXFragmentImpl().apply(block)
}

/**
 * AssignmentPattern#right: Expression
 * extension function for create Expression -> TsTypeAssertionImpl
 */
fun AssignmentPattern.tsTypeAssertion(block: TsTypeAssertion.() -> Unit): TsTypeAssertion {
    return TsTypeAssertionImpl().apply(block)
}

/**
 * AssignmentPattern#right: Expression
 * extension function for create Expression -> TsConstAssertionImpl
 */
fun AssignmentPattern.tsConstAssertion(block: TsConstAssertion.() -> Unit): TsConstAssertion {
    return TsConstAssertionImpl().apply(block)
}

/**
 * AssignmentPattern#right: Expression
 * extension function for create Expression -> TsNonNullExpressionImpl
 */
fun AssignmentPattern.tsNonNullExpression(block: TsNonNullExpression.() -> Unit): TsNonNullExpression {
    return TsNonNullExpressionImpl().apply(block)
}

/**
 * AssignmentPattern#right: Expression
 * extension function for create Expression -> TsAsExpressionImpl
 */
fun AssignmentPattern.tsAsExpression(block: TsAsExpression.() -> Unit): TsAsExpression {
    return TsAsExpressionImpl().apply(block)
}

/**
 * AssignmentPattern#right: Expression
 * extension function for create Expression -> TsSatisfiesExpressionImpl
 */
fun AssignmentPattern.tsSatisfiesExpression(block: TsSatisfiesExpression.() -> Unit): TsSatisfiesExpression {
    return TsSatisfiesExpressionImpl().apply(block)
}

/**
 * AssignmentPattern#right: Expression
 * extension function for create Expression -> TsInstantiationImpl
 */
fun AssignmentPattern.tsInstantiation(block: TsInstantiation.() -> Unit): TsInstantiation {
    return TsInstantiationImpl().apply(block)
}

/**
 * AssignmentPattern#right: Expression
 * extension function for create Expression -> PrivateNameImpl
 */
fun AssignmentPattern.privateName(block: PrivateName.() -> Unit): PrivateName {
    return PrivateNameImpl().apply(block)
}

/**
 * AssignmentPattern#right: Expression
 * extension function for create Expression -> OptionalChainingExpressionImpl
 */
fun AssignmentPattern.optionalChainingExpression(block: OptionalChainingExpression.() -> Unit): OptionalChainingExpression {
    return OptionalChainingExpressionImpl().apply(block)
}

/**
 * AssignmentPattern#typeAnnotation: TsTypeAnnotation
 * extension function for create TsTypeAnnotation -> TsTypeAnnotationImpl
 */
fun AssignmentPattern.tsTypeAnnotation(block: TsTypeAnnotation.() -> Unit): TsTypeAnnotation {
    return TsTypeAnnotationImpl().apply(block)
}

fun AssignmentPattern.span(block: Span.() -> Unit): Span {
    return Span().apply(block)
}
