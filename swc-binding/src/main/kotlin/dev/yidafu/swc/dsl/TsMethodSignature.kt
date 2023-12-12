package dev.yidafu.swc.dsl

import dev.yidafu.swc.types.*

/**
 * TsMethodSignature#key: Expression
 * extension function for create Expression -> ThisExpressionImpl
 */
fun TsMethodSignature.thisExpression(block: ThisExpression.() -> Unit): ThisExpression {
    return ThisExpressionImpl().apply(block)
}

/**
 * TsMethodSignature#key: Expression
 * extension function for create Expression -> ArrayExpressionImpl
 */
fun TsMethodSignature.arrayExpression(block: ArrayExpression.() -> Unit): ArrayExpression {
    return ArrayExpressionImpl().apply(block)
}

/**
 * TsMethodSignature#key: Expression
 * extension function for create Expression -> ObjectExpressionImpl
 */
fun TsMethodSignature.objectExpression(block: ObjectExpression.() -> Unit): ObjectExpression {
    return ObjectExpressionImpl().apply(block)
}

/**
 * TsMethodSignature#key: Expression
 * extension function for create Expression -> FunctionExpressionImpl
 */
fun TsMethodSignature.functionExpression(block: FunctionExpression.() -> Unit): FunctionExpression {
    return FunctionExpressionImpl().apply(block)
}

/**
 * TsMethodSignature#key: Expression
 * extension function for create Expression -> UnaryExpressionImpl
 */
fun TsMethodSignature.unaryExpression(block: UnaryExpression.() -> Unit): UnaryExpression {
    return UnaryExpressionImpl().apply(block)
}

/**
 * TsMethodSignature#key: Expression
 * extension function for create Expression -> UpdateExpressionImpl
 */
fun TsMethodSignature.updateExpression(block: UpdateExpression.() -> Unit): UpdateExpression {
    return UpdateExpressionImpl().apply(block)
}

/**
 * TsMethodSignature#key: Expression
 * extension function for create Expression -> BinaryExpressionImpl
 */
fun TsMethodSignature.binaryExpression(block: BinaryExpression.() -> Unit): BinaryExpression {
    return BinaryExpressionImpl().apply(block)
}

/**
 * TsMethodSignature#key: Expression
 * extension function for create Expression -> AssignmentExpressionImpl
 */
fun TsMethodSignature.assignmentExpression(block: AssignmentExpression.() -> Unit): AssignmentExpression {
    return AssignmentExpressionImpl().apply(block)
}

/**
 * TsMethodSignature#key: Expression
 * extension function for create Expression -> MemberExpressionImpl
 */
fun TsMethodSignature.memberExpression(block: MemberExpression.() -> Unit): MemberExpression {
    return MemberExpressionImpl().apply(block)
}

/**
 * TsMethodSignature#key: Expression
 * extension function for create Expression -> SuperPropExpressionImpl
 */
fun TsMethodSignature.superPropExpression(block: SuperPropExpression.() -> Unit): SuperPropExpression {
    return SuperPropExpressionImpl().apply(block)
}

/**
 * TsMethodSignature#key: Expression
 * extension function for create Expression -> ConditionalExpressionImpl
 */
fun TsMethodSignature.conditionalExpression(block: ConditionalExpression.() -> Unit): ConditionalExpression {
    return ConditionalExpressionImpl().apply(block)
}

/**
 * TsMethodSignature#key: Expression
 * extension function for create Expression -> CallExpressionImpl
 */
fun TsMethodSignature.callExpression(block: CallExpression.() -> Unit): CallExpression {
    return CallExpressionImpl().apply(block)
}

/**
 * TsMethodSignature#key: Expression
 * extension function for create Expression -> NewExpressionImpl
 */
fun TsMethodSignature.newExpression(block: NewExpression.() -> Unit): NewExpression {
    return NewExpressionImpl().apply(block)
}

/**
 * TsMethodSignature#key: Expression
 * extension function for create Expression -> SequenceExpressionImpl
 */
fun TsMethodSignature.sequenceExpression(block: SequenceExpression.() -> Unit): SequenceExpression {
    return SequenceExpressionImpl().apply(block)
}

/**
 * TsMethodSignature#key: Expression
 * extension function for create Expression -> IdentifierImpl
 */
fun TsMethodSignature.identifier(block: Identifier.() -> Unit): Identifier {
    return IdentifierImpl().apply(block)
}

/**
 * TsMethodSignature#key: Expression
 * extension function for create Expression -> StringLiteralImpl
 */
fun TsMethodSignature.stringLiteral(block: StringLiteral.() -> Unit): StringLiteral {
    return StringLiteralImpl().apply(block)
}

/**
 * TsMethodSignature#key: Expression
 * extension function for create Expression -> BooleanLiteralImpl
 */
fun TsMethodSignature.booleanLiteral(block: BooleanLiteral.() -> Unit): BooleanLiteral {
    return BooleanLiteralImpl().apply(block)
}

/**
 * TsMethodSignature#key: Expression
 * extension function for create Expression -> NullLiteralImpl
 */
fun TsMethodSignature.nullLiteral(block: NullLiteral.() -> Unit): NullLiteral {
    return NullLiteralImpl().apply(block)
}

/**
 * TsMethodSignature#key: Expression
 * extension function for create Expression -> NumericLiteralImpl
 */
fun TsMethodSignature.numericLiteral(block: NumericLiteral.() -> Unit): NumericLiteral {
    return NumericLiteralImpl().apply(block)
}

/**
 * TsMethodSignature#key: Expression
 * extension function for create Expression -> BigIntLiteralImpl
 */
fun TsMethodSignature.bigIntLiteral(block: BigIntLiteral.() -> Unit): BigIntLiteral {
    return BigIntLiteralImpl().apply(block)
}

/**
 * TsMethodSignature#key: Expression
 * extension function for create Expression -> RegExpLiteralImpl
 */
fun TsMethodSignature.regExpLiteral(block: RegExpLiteral.() -> Unit): RegExpLiteral {
    return RegExpLiteralImpl().apply(block)
}

/**
 * TsMethodSignature#key: Expression
 * extension function for create Expression -> JSXTextImpl
 */
fun TsMethodSignature.jSXText(block: JSXText.() -> Unit): JSXText {
    return JSXTextImpl().apply(block)
}

/**
 * TsMethodSignature#key: Expression
 * extension function for create Expression -> TemplateLiteralImpl
 */
fun TsMethodSignature.templateLiteral(block: TemplateLiteral.() -> Unit): TemplateLiteral {
    return TemplateLiteralImpl().apply(block)
}

/**
 * TsMethodSignature#key: Expression
 * extension function for create Expression -> TaggedTemplateExpressionImpl
 */
fun TsMethodSignature.taggedTemplateExpression(block: TaggedTemplateExpression.() -> Unit): TaggedTemplateExpression {
    return TaggedTemplateExpressionImpl().apply(block)
}

/**
 * TsMethodSignature#key: Expression
 * extension function for create Expression -> ArrowFunctionExpressionImpl
 */
fun TsMethodSignature.arrowFunctionExpression(block: ArrowFunctionExpression.() -> Unit): ArrowFunctionExpression {
    return ArrowFunctionExpressionImpl().apply(block)
}

/**
 * TsMethodSignature#key: Expression
 * extension function for create Expression -> ClassExpressionImpl
 */
fun TsMethodSignature.classExpression(block: ClassExpression.() -> Unit): ClassExpression {
    return ClassExpressionImpl().apply(block)
}

/**
 * TsMethodSignature#key: Expression
 * extension function for create Expression -> YieldExpressionImpl
 */
fun TsMethodSignature.yieldExpression(block: YieldExpression.() -> Unit): YieldExpression {
    return YieldExpressionImpl().apply(block)
}

/**
 * TsMethodSignature#key: Expression
 * extension function for create Expression -> MetaPropertyImpl
 */
fun TsMethodSignature.metaProperty(block: MetaProperty.() -> Unit): MetaProperty {
    return MetaPropertyImpl().apply(block)
}

/**
 * TsMethodSignature#key: Expression
 * extension function for create Expression -> AwaitExpressionImpl
 */
fun TsMethodSignature.awaitExpression(block: AwaitExpression.() -> Unit): AwaitExpression {
    return AwaitExpressionImpl().apply(block)
}

/**
 * TsMethodSignature#key: Expression
 * extension function for create Expression -> ParenthesisExpressionImpl
 */
fun TsMethodSignature.parenthesisExpression(block: ParenthesisExpression.() -> Unit): ParenthesisExpression {
    return ParenthesisExpressionImpl().apply(block)
}

/**
 * TsMethodSignature#key: Expression
 * extension function for create Expression -> JSXMemberExpressionImpl
 */
fun TsMethodSignature.jSXMemberExpression(block: JSXMemberExpression.() -> Unit): JSXMemberExpression {
    return JSXMemberExpressionImpl().apply(block)
}

/**
 * TsMethodSignature#key: Expression
 * extension function for create Expression -> JSXNamespacedNameImpl
 */
fun TsMethodSignature.jSXNamespacedName(block: JSXNamespacedName.() -> Unit): JSXNamespacedName {
    return JSXNamespacedNameImpl().apply(block)
}

/**
 * TsMethodSignature#key: Expression
 * extension function for create Expression -> JSXEmptyExpressionImpl
 */
fun TsMethodSignature.jSXEmptyExpression(block: JSXEmptyExpression.() -> Unit): JSXEmptyExpression {
    return JSXEmptyExpressionImpl().apply(block)
}

/**
 * TsMethodSignature#key: Expression
 * extension function for create Expression -> JSXElementImpl
 */
fun TsMethodSignature.jSXElement(block: JSXElement.() -> Unit): JSXElement {
    return JSXElementImpl().apply(block)
}

/**
 * TsMethodSignature#key: Expression
 * extension function for create Expression -> JSXFragmentImpl
 */
fun TsMethodSignature.jSXFragment(block: JSXFragment.() -> Unit): JSXFragment {
    return JSXFragmentImpl().apply(block)
}

/**
 * TsMethodSignature#key: Expression
 * extension function for create Expression -> TsTypeAssertionImpl
 */
fun TsMethodSignature.tsTypeAssertion(block: TsTypeAssertion.() -> Unit): TsTypeAssertion {
    return TsTypeAssertionImpl().apply(block)
}

/**
 * TsMethodSignature#key: Expression
 * extension function for create Expression -> TsConstAssertionImpl
 */
fun TsMethodSignature.tsConstAssertion(block: TsConstAssertion.() -> Unit): TsConstAssertion {
    return TsConstAssertionImpl().apply(block)
}

/**
 * TsMethodSignature#key: Expression
 * extension function for create Expression -> TsNonNullExpressionImpl
 */
fun TsMethodSignature.tsNonNullExpression(block: TsNonNullExpression.() -> Unit): TsNonNullExpression {
    return TsNonNullExpressionImpl().apply(block)
}

/**
 * TsMethodSignature#key: Expression
 * extension function for create Expression -> TsAsExpressionImpl
 */
fun TsMethodSignature.tsAsExpression(block: TsAsExpression.() -> Unit): TsAsExpression {
    return TsAsExpressionImpl().apply(block)
}

/**
 * TsMethodSignature#key: Expression
 * extension function for create Expression -> TsSatisfiesExpressionImpl
 */
fun TsMethodSignature.tsSatisfiesExpression(block: TsSatisfiesExpression.() -> Unit): TsSatisfiesExpression {
    return TsSatisfiesExpressionImpl().apply(block)
}

/**
 * TsMethodSignature#key: Expression
 * extension function for create Expression -> TsInstantiationImpl
 */
fun TsMethodSignature.tsInstantiation(block: TsInstantiation.() -> Unit): TsInstantiation {
    return TsInstantiationImpl().apply(block)
}

/**
 * TsMethodSignature#key: Expression
 * extension function for create Expression -> PrivateNameImpl
 */
fun TsMethodSignature.privateName(block: PrivateName.() -> Unit): PrivateName {
    return PrivateNameImpl().apply(block)
}

/**
 * TsMethodSignature#key: Expression
 * extension function for create Expression -> OptionalChainingExpressionImpl
 */
fun TsMethodSignature.optionalChainingExpression(block: OptionalChainingExpression.() -> Unit): OptionalChainingExpression {
    return OptionalChainingExpressionImpl().apply(block)
}

/**
 * TsMethodSignature#key: Expression
 * extension function for create Expression -> InvalidImpl
 */
fun TsMethodSignature.invalid(block: Invalid.() -> Unit): Invalid {
    return InvalidImpl().apply(block)
}

/**
 * TsMethodSignature#params: Array<TsFnParameter>
 * extension function for create Array<TsFnParameter> -> BindingIdentifierImpl
 */
fun TsMethodSignature.bindingIdentifier(block: BindingIdentifier.() -> Unit): BindingIdentifier {
    return BindingIdentifierImpl().apply(block)
}

/**
 * TsMethodSignature#params: Array<TsFnParameter>
 * extension function for create Array<TsFnParameter> -> ArrayPatternImpl
 */
fun TsMethodSignature.arrayPattern(block: ArrayPattern.() -> Unit): ArrayPattern {
    return ArrayPatternImpl().apply(block)
}

/**
 * TsMethodSignature#params: Array<TsFnParameter>
 * extension function for create Array<TsFnParameter> -> RestElementImpl
 */
fun TsMethodSignature.restElement(block: RestElement.() -> Unit): RestElement {
    return RestElementImpl().apply(block)
}

/**
 * TsMethodSignature#params: Array<TsFnParameter>
 * extension function for create Array<TsFnParameter> -> ObjectPatternImpl
 */
fun TsMethodSignature.objectPattern(block: ObjectPattern.() -> Unit): ObjectPattern {
    return ObjectPatternImpl().apply(block)
}

/**
 * TsMethodSignature#typeAnn: TsTypeAnnotation
 * extension function for create TsTypeAnnotation -> TsTypeAnnotationImpl
 */
fun TsMethodSignature.tsTypeAnnotation(block: TsTypeAnnotation.() -> Unit): TsTypeAnnotation {
    return TsTypeAnnotationImpl().apply(block)
}

/**
 * TsMethodSignature#typeParams: TsTypeParameterDeclaration
 * extension function for create TsTypeParameterDeclaration -> TsTypeParameterDeclarationImpl
 */
fun TsMethodSignature.tsTypeParameterDeclaration(block: TsTypeParameterDeclaration.() -> Unit): TsTypeParameterDeclaration {
    return TsTypeParameterDeclarationImpl().apply(block)
}

fun TsMethodSignature.span(block: Span.() -> Unit): Span {
    return Span().apply(block)
}
