package dev.yidafu.swc.dsl

import dev.yidafu.swc.types.*

/**
 * ArrayPattern#elements: Array<Pattern>
 * extension function for create Array<Pattern> -> BindingIdentifierImpl
 */
fun ArrayPattern.bindingIdentifier(block: BindingIdentifier.() -> Unit): BindingIdentifier {
    return BindingIdentifierImpl().apply(block)
}

/**
 * ArrayPattern#elements: Array<Pattern>
 * extension function for create Array<Pattern> -> RestElementImpl
 */
fun ArrayPattern.restElement(block: RestElement.() -> Unit): RestElement {
    return RestElementImpl().apply(block)
}

/**
 * ArrayPattern#elements: Array<Pattern>
 * extension function for create Array<Pattern> -> ObjectPatternImpl
 */
fun ArrayPattern.objectPattern(block: ObjectPattern.() -> Unit): ObjectPattern {
    return ObjectPatternImpl().apply(block)
}

/**
 * ArrayPattern#elements: Array<Pattern>
 * extension function for create Array<Pattern> -> AssignmentPatternImpl
 */
fun ArrayPattern.assignmentPattern(block: AssignmentPattern.() -> Unit): AssignmentPattern {
    return AssignmentPatternImpl().apply(block)
}

/**
 * ArrayPattern#elements: Array<Pattern>
 * extension function for create Array<Pattern> -> InvalidImpl
 */
fun ArrayPattern.invalid(block: Invalid.() -> Unit): Invalid {
    return InvalidImpl().apply(block)
}

/**
 * ArrayPattern#elements: Array<Pattern>
 * extension function for create Array<Pattern> -> ThisExpressionImpl
 */
fun ArrayPattern.thisExpression(block: ThisExpression.() -> Unit): ThisExpression {
    return ThisExpressionImpl().apply(block)
}

/**
 * ArrayPattern#elements: Array<Pattern>
 * extension function for create Array<Pattern> -> ArrayExpressionImpl
 */
fun ArrayPattern.arrayExpression(block: ArrayExpression.() -> Unit): ArrayExpression {
    return ArrayExpressionImpl().apply(block)
}

/**
 * ArrayPattern#elements: Array<Pattern>
 * extension function for create Array<Pattern> -> ObjectExpressionImpl
 */
fun ArrayPattern.objectExpression(block: ObjectExpression.() -> Unit): ObjectExpression {
    return ObjectExpressionImpl().apply(block)
}

/**
 * ArrayPattern#elements: Array<Pattern>
 * extension function for create Array<Pattern> -> FunctionExpressionImpl
 */
fun ArrayPattern.functionExpression(block: FunctionExpression.() -> Unit): FunctionExpression {
    return FunctionExpressionImpl().apply(block)
}

/**
 * ArrayPattern#elements: Array<Pattern>
 * extension function for create Array<Pattern> -> UnaryExpressionImpl
 */
fun ArrayPattern.unaryExpression(block: UnaryExpression.() -> Unit): UnaryExpression {
    return UnaryExpressionImpl().apply(block)
}

/**
 * ArrayPattern#elements: Array<Pattern>
 * extension function for create Array<Pattern> -> UpdateExpressionImpl
 */
fun ArrayPattern.updateExpression(block: UpdateExpression.() -> Unit): UpdateExpression {
    return UpdateExpressionImpl().apply(block)
}

/**
 * ArrayPattern#elements: Array<Pattern>
 * extension function for create Array<Pattern> -> BinaryExpressionImpl
 */
fun ArrayPattern.binaryExpression(block: BinaryExpression.() -> Unit): BinaryExpression {
    return BinaryExpressionImpl().apply(block)
}

/**
 * ArrayPattern#elements: Array<Pattern>
 * extension function for create Array<Pattern> -> AssignmentExpressionImpl
 */
fun ArrayPattern.assignmentExpression(block: AssignmentExpression.() -> Unit): AssignmentExpression {
    return AssignmentExpressionImpl().apply(block)
}

/**
 * ArrayPattern#elements: Array<Pattern>
 * extension function for create Array<Pattern> -> MemberExpressionImpl
 */
fun ArrayPattern.memberExpression(block: MemberExpression.() -> Unit): MemberExpression {
    return MemberExpressionImpl().apply(block)
}

/**
 * ArrayPattern#elements: Array<Pattern>
 * extension function for create Array<Pattern> -> SuperPropExpressionImpl
 */
fun ArrayPattern.superPropExpression(block: SuperPropExpression.() -> Unit): SuperPropExpression {
    return SuperPropExpressionImpl().apply(block)
}

/**
 * ArrayPattern#elements: Array<Pattern>
 * extension function for create Array<Pattern> -> ConditionalExpressionImpl
 */
fun ArrayPattern.conditionalExpression(block: ConditionalExpression.() -> Unit): ConditionalExpression {
    return ConditionalExpressionImpl().apply(block)
}

/**
 * ArrayPattern#elements: Array<Pattern>
 * extension function for create Array<Pattern> -> CallExpressionImpl
 */
fun ArrayPattern.callExpression(block: CallExpression.() -> Unit): CallExpression {
    return CallExpressionImpl().apply(block)
}

/**
 * ArrayPattern#elements: Array<Pattern>
 * extension function for create Array<Pattern> -> NewExpressionImpl
 */
fun ArrayPattern.newExpression(block: NewExpression.() -> Unit): NewExpression {
    return NewExpressionImpl().apply(block)
}

/**
 * ArrayPattern#elements: Array<Pattern>
 * extension function for create Array<Pattern> -> SequenceExpressionImpl
 */
fun ArrayPattern.sequenceExpression(block: SequenceExpression.() -> Unit): SequenceExpression {
    return SequenceExpressionImpl().apply(block)
}

/**
 * ArrayPattern#elements: Array<Pattern>
 * extension function for create Array<Pattern> -> IdentifierImpl
 */
fun ArrayPattern.identifier(block: Identifier.() -> Unit): Identifier {
    return IdentifierImpl().apply(block)
}

/**
 * ArrayPattern#elements: Array<Pattern>
 * extension function for create Array<Pattern> -> StringLiteralImpl
 */
fun ArrayPattern.stringLiteral(block: StringLiteral.() -> Unit): StringLiteral {
    return StringLiteralImpl().apply(block)
}

/**
 * ArrayPattern#elements: Array<Pattern>
 * extension function for create Array<Pattern> -> BooleanLiteralImpl
 */
fun ArrayPattern.booleanLiteral(block: BooleanLiteral.() -> Unit): BooleanLiteral {
    return BooleanLiteralImpl().apply(block)
}

/**
 * ArrayPattern#elements: Array<Pattern>
 * extension function for create Array<Pattern> -> NullLiteralImpl
 */
fun ArrayPattern.nullLiteral(block: NullLiteral.() -> Unit): NullLiteral {
    return NullLiteralImpl().apply(block)
}

/**
 * ArrayPattern#elements: Array<Pattern>
 * extension function for create Array<Pattern> -> NumericLiteralImpl
 */
fun ArrayPattern.numericLiteral(block: NumericLiteral.() -> Unit): NumericLiteral {
    return NumericLiteralImpl().apply(block)
}

/**
 * ArrayPattern#elements: Array<Pattern>
 * extension function for create Array<Pattern> -> BigIntLiteralImpl
 */
fun ArrayPattern.bigIntLiteral(block: BigIntLiteral.() -> Unit): BigIntLiteral {
    return BigIntLiteralImpl().apply(block)
}

/**
 * ArrayPattern#elements: Array<Pattern>
 * extension function for create Array<Pattern> -> RegExpLiteralImpl
 */
fun ArrayPattern.regExpLiteral(block: RegExpLiteral.() -> Unit): RegExpLiteral {
    return RegExpLiteralImpl().apply(block)
}

/**
 * ArrayPattern#elements: Array<Pattern>
 * extension function for create Array<Pattern> -> JSXTextImpl
 */
fun ArrayPattern.jSXText(block: JSXText.() -> Unit): JSXText {
    return JSXTextImpl().apply(block)
}

/**
 * ArrayPattern#elements: Array<Pattern>
 * extension function for create Array<Pattern> -> TemplateLiteralImpl
 */
fun ArrayPattern.templateLiteral(block: TemplateLiteral.() -> Unit): TemplateLiteral {
    return TemplateLiteralImpl().apply(block)
}

/**
 * ArrayPattern#elements: Array<Pattern>
 * extension function for create Array<Pattern> -> TaggedTemplateExpressionImpl
 */
fun ArrayPattern.taggedTemplateExpression(block: TaggedTemplateExpression.() -> Unit): TaggedTemplateExpression {
    return TaggedTemplateExpressionImpl().apply(block)
}

/**
 * ArrayPattern#elements: Array<Pattern>
 * extension function for create Array<Pattern> -> ArrowFunctionExpressionImpl
 */
fun ArrayPattern.arrowFunctionExpression(block: ArrowFunctionExpression.() -> Unit): ArrowFunctionExpression {
    return ArrowFunctionExpressionImpl().apply(block)
}

/**
 * ArrayPattern#elements: Array<Pattern>
 * extension function for create Array<Pattern> -> ClassExpressionImpl
 */
fun ArrayPattern.classExpression(block: ClassExpression.() -> Unit): ClassExpression {
    return ClassExpressionImpl().apply(block)
}

/**
 * ArrayPattern#elements: Array<Pattern>
 * extension function for create Array<Pattern> -> YieldExpressionImpl
 */
fun ArrayPattern.yieldExpression(block: YieldExpression.() -> Unit): YieldExpression {
    return YieldExpressionImpl().apply(block)
}

/**
 * ArrayPattern#elements: Array<Pattern>
 * extension function for create Array<Pattern> -> MetaPropertyImpl
 */
fun ArrayPattern.metaProperty(block: MetaProperty.() -> Unit): MetaProperty {
    return MetaPropertyImpl().apply(block)
}

/**
 * ArrayPattern#elements: Array<Pattern>
 * extension function for create Array<Pattern> -> AwaitExpressionImpl
 */
fun ArrayPattern.awaitExpression(block: AwaitExpression.() -> Unit): AwaitExpression {
    return AwaitExpressionImpl().apply(block)
}

/**
 * ArrayPattern#elements: Array<Pattern>
 * extension function for create Array<Pattern> -> ParenthesisExpressionImpl
 */
fun ArrayPattern.parenthesisExpression(block: ParenthesisExpression.() -> Unit): ParenthesisExpression {
    return ParenthesisExpressionImpl().apply(block)
}

/**
 * ArrayPattern#elements: Array<Pattern>
 * extension function for create Array<Pattern> -> JSXMemberExpressionImpl
 */
fun ArrayPattern.jSXMemberExpression(block: JSXMemberExpression.() -> Unit): JSXMemberExpression {
    return JSXMemberExpressionImpl().apply(block)
}

/**
 * ArrayPattern#elements: Array<Pattern>
 * extension function for create Array<Pattern> -> JSXNamespacedNameImpl
 */
fun ArrayPattern.jSXNamespacedName(block: JSXNamespacedName.() -> Unit): JSXNamespacedName {
    return JSXNamespacedNameImpl().apply(block)
}

/**
 * ArrayPattern#elements: Array<Pattern>
 * extension function for create Array<Pattern> -> JSXEmptyExpressionImpl
 */
fun ArrayPattern.jSXEmptyExpression(block: JSXEmptyExpression.() -> Unit): JSXEmptyExpression {
    return JSXEmptyExpressionImpl().apply(block)
}

/**
 * ArrayPattern#elements: Array<Pattern>
 * extension function for create Array<Pattern> -> JSXElementImpl
 */
fun ArrayPattern.jSXElement(block: JSXElement.() -> Unit): JSXElement {
    return JSXElementImpl().apply(block)
}

/**
 * ArrayPattern#elements: Array<Pattern>
 * extension function for create Array<Pattern> -> JSXFragmentImpl
 */
fun ArrayPattern.jSXFragment(block: JSXFragment.() -> Unit): JSXFragment {
    return JSXFragmentImpl().apply(block)
}

/**
 * ArrayPattern#elements: Array<Pattern>
 * extension function for create Array<Pattern> -> TsTypeAssertionImpl
 */
fun ArrayPattern.tsTypeAssertion(block: TsTypeAssertion.() -> Unit): TsTypeAssertion {
    return TsTypeAssertionImpl().apply(block)
}

/**
 * ArrayPattern#elements: Array<Pattern>
 * extension function for create Array<Pattern> -> TsConstAssertionImpl
 */
fun ArrayPattern.tsConstAssertion(block: TsConstAssertion.() -> Unit): TsConstAssertion {
    return TsConstAssertionImpl().apply(block)
}

/**
 * ArrayPattern#elements: Array<Pattern>
 * extension function for create Array<Pattern> -> TsNonNullExpressionImpl
 */
fun ArrayPattern.tsNonNullExpression(block: TsNonNullExpression.() -> Unit): TsNonNullExpression {
    return TsNonNullExpressionImpl().apply(block)
}

/**
 * ArrayPattern#elements: Array<Pattern>
 * extension function for create Array<Pattern> -> TsAsExpressionImpl
 */
fun ArrayPattern.tsAsExpression(block: TsAsExpression.() -> Unit): TsAsExpression {
    return TsAsExpressionImpl().apply(block)
}

/**
 * ArrayPattern#elements: Array<Pattern>
 * extension function for create Array<Pattern> -> TsSatisfiesExpressionImpl
 */
fun ArrayPattern.tsSatisfiesExpression(block: TsSatisfiesExpression.() -> Unit): TsSatisfiesExpression {
    return TsSatisfiesExpressionImpl().apply(block)
}

/**
 * ArrayPattern#elements: Array<Pattern>
 * extension function for create Array<Pattern> -> TsInstantiationImpl
 */
fun ArrayPattern.tsInstantiation(block: TsInstantiation.() -> Unit): TsInstantiation {
    return TsInstantiationImpl().apply(block)
}

/**
 * ArrayPattern#elements: Array<Pattern>
 * extension function for create Array<Pattern> -> PrivateNameImpl
 */
fun ArrayPattern.privateName(block: PrivateName.() -> Unit): PrivateName {
    return PrivateNameImpl().apply(block)
}

/**
 * ArrayPattern#elements: Array<Pattern>
 * extension function for create Array<Pattern> -> OptionalChainingExpressionImpl
 */
fun ArrayPattern.optionalChainingExpression(block: OptionalChainingExpression.() -> Unit): OptionalChainingExpression {
    return OptionalChainingExpressionImpl().apply(block)
}

/**
 * ArrayPattern#typeAnnotation: TsTypeAnnotation
 * extension function for create TsTypeAnnotation -> TsTypeAnnotationImpl
 */
fun ArrayPattern.tsTypeAnnotation(block: TsTypeAnnotation.() -> Unit): TsTypeAnnotation {
    return TsTypeAnnotationImpl().apply(block)
}

fun ArrayPattern.span(block: Span.() -> Unit): Span {
    return Span().apply(block)
}
