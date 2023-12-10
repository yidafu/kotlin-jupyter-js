package dev.yidafu.swc.dsl

import dev.yidafu.swc.types.*

/**
 * TsPropertySignature#init: Expression
 * extension function for create Expression -> ThisExpressionImpl
 */
fun TsPropertySignature.thisExpression(block: ThisExpression.() -> Unit): ThisExpression {
    return ThisExpressionImpl().apply(block)
}

/**
 * TsPropertySignature#init: Expression
 * extension function for create Expression -> ArrayExpressionImpl
 */
fun TsPropertySignature.arrayExpression(block: ArrayExpression.() -> Unit): ArrayExpression {
    return ArrayExpressionImpl().apply(block)
}

/**
 * TsPropertySignature#init: Expression
 * extension function for create Expression -> ObjectExpressionImpl
 */
fun TsPropertySignature.objectExpression(block: ObjectExpression.() -> Unit): ObjectExpression {
    return ObjectExpressionImpl().apply(block)
}

/**
 * TsPropertySignature#init: Expression
 * extension function for create Expression -> FunctionExpressionImpl
 */
fun TsPropertySignature.functionExpression(block: FunctionExpression.() -> Unit): FunctionExpression {
    return FunctionExpressionImpl().apply(block)
}

/**
 * TsPropertySignature#init: Expression
 * extension function for create Expression -> UnaryExpressionImpl
 */
fun TsPropertySignature.unaryExpression(block: UnaryExpression.() -> Unit): UnaryExpression {
    return UnaryExpressionImpl().apply(block)
}

/**
 * TsPropertySignature#init: Expression
 * extension function for create Expression -> UpdateExpressionImpl
 */
fun TsPropertySignature.updateExpression(block: UpdateExpression.() -> Unit): UpdateExpression {
    return UpdateExpressionImpl().apply(block)
}

/**
 * TsPropertySignature#init: Expression
 * extension function for create Expression -> BinaryExpressionImpl
 */
fun TsPropertySignature.binaryExpression(block: BinaryExpression.() -> Unit): BinaryExpression {
    return BinaryExpressionImpl().apply(block)
}

/**
 * TsPropertySignature#init: Expression
 * extension function for create Expression -> AssignmentExpressionImpl
 */
fun TsPropertySignature.assignmentExpression(block: AssignmentExpression.() -> Unit): AssignmentExpression {
    return AssignmentExpressionImpl().apply(block)
}

/**
 * TsPropertySignature#init: Expression
 * extension function for create Expression -> MemberExpressionImpl
 */
fun TsPropertySignature.memberExpression(block: MemberExpression.() -> Unit): MemberExpression {
    return MemberExpressionImpl().apply(block)
}

/**
 * TsPropertySignature#init: Expression
 * extension function for create Expression -> SuperPropExpressionImpl
 */
fun TsPropertySignature.superPropExpression(block: SuperPropExpression.() -> Unit): SuperPropExpression {
    return SuperPropExpressionImpl().apply(block)
}

/**
 * TsPropertySignature#init: Expression
 * extension function for create Expression -> ConditionalExpressionImpl
 */
fun TsPropertySignature.conditionalExpression(block: ConditionalExpression.() -> Unit): ConditionalExpression {
    return ConditionalExpressionImpl().apply(block)
}

/**
 * TsPropertySignature#init: Expression
 * extension function for create Expression -> CallExpressionImpl
 */
fun TsPropertySignature.callExpression(block: CallExpression.() -> Unit): CallExpression {
    return CallExpressionImpl().apply(block)
}

/**
 * TsPropertySignature#init: Expression
 * extension function for create Expression -> NewExpressionImpl
 */
fun TsPropertySignature.newExpression(block: NewExpression.() -> Unit): NewExpression {
    return NewExpressionImpl().apply(block)
}

/**
 * TsPropertySignature#init: Expression
 * extension function for create Expression -> SequenceExpressionImpl
 */
fun TsPropertySignature.sequenceExpression(block: SequenceExpression.() -> Unit): SequenceExpression {
    return SequenceExpressionImpl().apply(block)
}

/**
 * TsPropertySignature#init: Expression
 * extension function for create Expression -> IdentifierImpl
 */
fun TsPropertySignature.identifier(block: Identifier.() -> Unit): Identifier {
    return IdentifierImpl().apply(block)
}

/**
 * TsPropertySignature#init: Expression
 * extension function for create Expression -> StringLiteralImpl
 */
fun TsPropertySignature.stringLiteral(block: StringLiteral.() -> Unit): StringLiteral {
    return StringLiteralImpl().apply(block)
}

/**
 * TsPropertySignature#init: Expression
 * extension function for create Expression -> BooleanLiteralImpl
 */
fun TsPropertySignature.booleanLiteral(block: BooleanLiteral.() -> Unit): BooleanLiteral {
    return BooleanLiteralImpl().apply(block)
}

/**
 * TsPropertySignature#init: Expression
 * extension function for create Expression -> NullLiteralImpl
 */
fun TsPropertySignature.nullLiteral(block: NullLiteral.() -> Unit): NullLiteral {
    return NullLiteralImpl().apply(block)
}

/**
 * TsPropertySignature#init: Expression
 * extension function for create Expression -> NumericLiteralImpl
 */
fun TsPropertySignature.numericLiteral(block: NumericLiteral.() -> Unit): NumericLiteral {
    return NumericLiteralImpl().apply(block)
}

/**
 * TsPropertySignature#init: Expression
 * extension function for create Expression -> BigIntLiteralImpl
 */
fun TsPropertySignature.bigIntLiteral(block: BigIntLiteral.() -> Unit): BigIntLiteral {
    return BigIntLiteralImpl().apply(block)
}

/**
 * TsPropertySignature#init: Expression
 * extension function for create Expression -> RegExpLiteralImpl
 */
fun TsPropertySignature.regExpLiteral(block: RegExpLiteral.() -> Unit): RegExpLiteral {
    return RegExpLiteralImpl().apply(block)
}

/**
 * TsPropertySignature#init: Expression
 * extension function for create Expression -> JSXTextImpl
 */
fun TsPropertySignature.jSXText(block: JSXText.() -> Unit): JSXText {
    return JSXTextImpl().apply(block)
}

/**
 * TsPropertySignature#init: Expression
 * extension function for create Expression -> TemplateLiteralImpl
 */
fun TsPropertySignature.templateLiteral(block: TemplateLiteral.() -> Unit): TemplateLiteral {
    return TemplateLiteralImpl().apply(block)
}

/**
 * TsPropertySignature#init: Expression
 * extension function for create Expression -> TaggedTemplateExpressionImpl
 */
fun TsPropertySignature.taggedTemplateExpression(block: TaggedTemplateExpression.() -> Unit): TaggedTemplateExpression {
    return TaggedTemplateExpressionImpl().apply(block)
}

/**
 * TsPropertySignature#init: Expression
 * extension function for create Expression -> ArrowFunctionExpressionImpl
 */
fun TsPropertySignature.arrowFunctionExpression(block: ArrowFunctionExpression.() -> Unit): ArrowFunctionExpression {
    return ArrowFunctionExpressionImpl().apply(block)
}

/**
 * TsPropertySignature#init: Expression
 * extension function for create Expression -> ClassExpressionImpl
 */
fun TsPropertySignature.classExpression(block: ClassExpression.() -> Unit): ClassExpression {
    return ClassExpressionImpl().apply(block)
}

/**
 * TsPropertySignature#init: Expression
 * extension function for create Expression -> YieldExpressionImpl
 */
fun TsPropertySignature.yieldExpression(block: YieldExpression.() -> Unit): YieldExpression {
    return YieldExpressionImpl().apply(block)
}

/**
 * TsPropertySignature#init: Expression
 * extension function for create Expression -> MetaPropertyImpl
 */
fun TsPropertySignature.metaProperty(block: MetaProperty.() -> Unit): MetaProperty {
    return MetaPropertyImpl().apply(block)
}

/**
 * TsPropertySignature#init: Expression
 * extension function for create Expression -> AwaitExpressionImpl
 */
fun TsPropertySignature.awaitExpression(block: AwaitExpression.() -> Unit): AwaitExpression {
    return AwaitExpressionImpl().apply(block)
}

/**
 * TsPropertySignature#init: Expression
 * extension function for create Expression -> ParenthesisExpressionImpl
 */
fun TsPropertySignature.parenthesisExpression(block: ParenthesisExpression.() -> Unit): ParenthesisExpression {
    return ParenthesisExpressionImpl().apply(block)
}

/**
 * TsPropertySignature#init: Expression
 * extension function for create Expression -> JSXMemberExpressionImpl
 */
fun TsPropertySignature.jSXMemberExpression(block: JSXMemberExpression.() -> Unit): JSXMemberExpression {
    return JSXMemberExpressionImpl().apply(block)
}

/**
 * TsPropertySignature#init: Expression
 * extension function for create Expression -> JSXNamespacedNameImpl
 */
fun TsPropertySignature.jSXNamespacedName(block: JSXNamespacedName.() -> Unit): JSXNamespacedName {
    return JSXNamespacedNameImpl().apply(block)
}

/**
 * TsPropertySignature#init: Expression
 * extension function for create Expression -> JSXEmptyExpressionImpl
 */
fun TsPropertySignature.jSXEmptyExpression(block: JSXEmptyExpression.() -> Unit): JSXEmptyExpression {
    return JSXEmptyExpressionImpl().apply(block)
}

/**
 * TsPropertySignature#init: Expression
 * extension function for create Expression -> JSXElementImpl
 */
fun TsPropertySignature.jSXElement(block: JSXElement.() -> Unit): JSXElement {
    return JSXElementImpl().apply(block)
}

/**
 * TsPropertySignature#init: Expression
 * extension function for create Expression -> JSXFragmentImpl
 */
fun TsPropertySignature.jSXFragment(block: JSXFragment.() -> Unit): JSXFragment {
    return JSXFragmentImpl().apply(block)
}

/**
 * TsPropertySignature#init: Expression
 * extension function for create Expression -> TsTypeAssertionImpl
 */
fun TsPropertySignature.tsTypeAssertion(block: TsTypeAssertion.() -> Unit): TsTypeAssertion {
    return TsTypeAssertionImpl().apply(block)
}

/**
 * TsPropertySignature#init: Expression
 * extension function for create Expression -> TsConstAssertionImpl
 */
fun TsPropertySignature.tsConstAssertion(block: TsConstAssertion.() -> Unit): TsConstAssertion {
    return TsConstAssertionImpl().apply(block)
}

/**
 * TsPropertySignature#init: Expression
 * extension function for create Expression -> TsNonNullExpressionImpl
 */
fun TsPropertySignature.tsNonNullExpression(block: TsNonNullExpression.() -> Unit): TsNonNullExpression {
    return TsNonNullExpressionImpl().apply(block)
}

/**
 * TsPropertySignature#init: Expression
 * extension function for create Expression -> TsAsExpressionImpl
 */
fun TsPropertySignature.tsAsExpression(block: TsAsExpression.() -> Unit): TsAsExpression {
    return TsAsExpressionImpl().apply(block)
}

/**
 * TsPropertySignature#init: Expression
 * extension function for create Expression -> TsSatisfiesExpressionImpl
 */
fun TsPropertySignature.tsSatisfiesExpression(block: TsSatisfiesExpression.() -> Unit): TsSatisfiesExpression {
    return TsSatisfiesExpressionImpl().apply(block)
}

/**
 * TsPropertySignature#init: Expression
 * extension function for create Expression -> TsInstantiationImpl
 */
fun TsPropertySignature.tsInstantiation(block: TsInstantiation.() -> Unit): TsInstantiation {
    return TsInstantiationImpl().apply(block)
}

/**
 * TsPropertySignature#init: Expression
 * extension function for create Expression -> PrivateNameImpl
 */
fun TsPropertySignature.privateName(block: PrivateName.() -> Unit): PrivateName {
    return PrivateNameImpl().apply(block)
}

/**
 * TsPropertySignature#init: Expression
 * extension function for create Expression -> OptionalChainingExpressionImpl
 */
fun TsPropertySignature.optionalChainingExpression(block: OptionalChainingExpression.() -> Unit): OptionalChainingExpression {
    return OptionalChainingExpressionImpl().apply(block)
}

/**
 * TsPropertySignature#init: Expression
 * extension function for create Expression -> InvalidImpl
 */
fun TsPropertySignature.invalid(block: Invalid.() -> Unit): Invalid {
    return InvalidImpl().apply(block)
}

/**
 * TsPropertySignature#params: Array<TsFnParameter>
 * extension function for create Array<TsFnParameter> -> BindingIdentifierImpl
 */
fun TsPropertySignature.bindingIdentifier(block: BindingIdentifier.() -> Unit): BindingIdentifier {
    return BindingIdentifierImpl().apply(block)
}

/**
 * TsPropertySignature#params: Array<TsFnParameter>
 * extension function for create Array<TsFnParameter> -> ArrayPatternImpl
 */
fun TsPropertySignature.arrayPattern(block: ArrayPattern.() -> Unit): ArrayPattern {
    return ArrayPatternImpl().apply(block)
}

/**
 * TsPropertySignature#params: Array<TsFnParameter>
 * extension function for create Array<TsFnParameter> -> RestElementImpl
 */
fun TsPropertySignature.restElement(block: RestElement.() -> Unit): RestElement {
    return RestElementImpl().apply(block)
}

/**
 * TsPropertySignature#params: Array<TsFnParameter>
 * extension function for create Array<TsFnParameter> -> ObjectPatternImpl
 */
fun TsPropertySignature.objectPattern(block: ObjectPattern.() -> Unit): ObjectPattern {
    return ObjectPatternImpl().apply(block)
}

/**
 * TsPropertySignature#typeAnnotation: TsTypeAnnotation
 * extension function for create TsTypeAnnotation -> TsTypeAnnotationImpl
 */
fun TsPropertySignature.tsTypeAnnotation(block: TsTypeAnnotation.() -> Unit): TsTypeAnnotation {
    return TsTypeAnnotationImpl().apply(block)
}

/**
 * TsPropertySignature#typeParams: TsTypeParameterDeclaration
 * extension function for create TsTypeParameterDeclaration -> TsTypeParameterDeclarationImpl
 */
fun TsPropertySignature.tsTypeParameterDeclaration(block: TsTypeParameterDeclaration.() -> Unit): TsTypeParameterDeclaration {
    return TsTypeParameterDeclarationImpl().apply(block)
}

fun TsPropertySignature.span(block: Span.() -> Unit): Span {
    return Span().apply(block)
}
