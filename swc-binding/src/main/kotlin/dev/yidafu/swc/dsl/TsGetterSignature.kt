package dev.yidafu.swc.dsl

import dev.yidafu.swc.types.*

/**
 * TsGetterSignature#key: Expression
 * extension function for create Expression -> ThisExpressionImpl
 */
fun TsGetterSignature.thisExpression(block: ThisExpression.() -> Unit): ThisExpression {
    return ThisExpressionImpl().apply(block)
}

/**
 * TsGetterSignature#key: Expression
 * extension function for create Expression -> ArrayExpressionImpl
 */
fun TsGetterSignature.arrayExpression(block: ArrayExpression.() -> Unit): ArrayExpression {
    return ArrayExpressionImpl().apply(block)
}

/**
 * TsGetterSignature#key: Expression
 * extension function for create Expression -> ObjectExpressionImpl
 */
fun TsGetterSignature.objectExpression(block: ObjectExpression.() -> Unit): ObjectExpression {
    return ObjectExpressionImpl().apply(block)
}

/**
 * TsGetterSignature#key: Expression
 * extension function for create Expression -> FunctionExpressionImpl
 */
fun TsGetterSignature.functionExpression(block: FunctionExpression.() -> Unit): FunctionExpression {
    return FunctionExpressionImpl().apply(block)
}

/**
 * TsGetterSignature#key: Expression
 * extension function for create Expression -> UnaryExpressionImpl
 */
fun TsGetterSignature.unaryExpression(block: UnaryExpression.() -> Unit): UnaryExpression {
    return UnaryExpressionImpl().apply(block)
}

/**
 * TsGetterSignature#key: Expression
 * extension function for create Expression -> UpdateExpressionImpl
 */
fun TsGetterSignature.updateExpression(block: UpdateExpression.() -> Unit): UpdateExpression {
    return UpdateExpressionImpl().apply(block)
}

/**
 * TsGetterSignature#key: Expression
 * extension function for create Expression -> BinaryExpressionImpl
 */
fun TsGetterSignature.binaryExpression(block: BinaryExpression.() -> Unit): BinaryExpression {
    return BinaryExpressionImpl().apply(block)
}

/**
 * TsGetterSignature#key: Expression
 * extension function for create Expression -> AssignmentExpressionImpl
 */
fun TsGetterSignature.assignmentExpression(block: AssignmentExpression.() -> Unit): AssignmentExpression {
    return AssignmentExpressionImpl().apply(block)
}

/**
 * TsGetterSignature#key: Expression
 * extension function for create Expression -> MemberExpressionImpl
 */
fun TsGetterSignature.memberExpression(block: MemberExpression.() -> Unit): MemberExpression {
    return MemberExpressionImpl().apply(block)
}

/**
 * TsGetterSignature#key: Expression
 * extension function for create Expression -> SuperPropExpressionImpl
 */
fun TsGetterSignature.superPropExpression(block: SuperPropExpression.() -> Unit): SuperPropExpression {
    return SuperPropExpressionImpl().apply(block)
}

/**
 * TsGetterSignature#key: Expression
 * extension function for create Expression -> ConditionalExpressionImpl
 */
fun TsGetterSignature.conditionalExpression(block: ConditionalExpression.() -> Unit): ConditionalExpression {
    return ConditionalExpressionImpl().apply(block)
}

/**
 * TsGetterSignature#key: Expression
 * extension function for create Expression -> CallExpressionImpl
 */
fun TsGetterSignature.callExpression(block: CallExpression.() -> Unit): CallExpression {
    return CallExpressionImpl().apply(block)
}

/**
 * TsGetterSignature#key: Expression
 * extension function for create Expression -> NewExpressionImpl
 */
fun TsGetterSignature.newExpression(block: NewExpression.() -> Unit): NewExpression {
    return NewExpressionImpl().apply(block)
}

/**
 * TsGetterSignature#key: Expression
 * extension function for create Expression -> SequenceExpressionImpl
 */
fun TsGetterSignature.sequenceExpression(block: SequenceExpression.() -> Unit): SequenceExpression {
    return SequenceExpressionImpl().apply(block)
}

/**
 * TsGetterSignature#key: Expression
 * extension function for create Expression -> IdentifierImpl
 */
fun TsGetterSignature.identifier(block: Identifier.() -> Unit): Identifier {
    return IdentifierImpl().apply(block)
}

/**
 * TsGetterSignature#key: Expression
 * extension function for create Expression -> StringLiteralImpl
 */
fun TsGetterSignature.stringLiteral(block: StringLiteral.() -> Unit): StringLiteral {
    return StringLiteralImpl().apply(block)
}

/**
 * TsGetterSignature#key: Expression
 * extension function for create Expression -> BooleanLiteralImpl
 */
fun TsGetterSignature.booleanLiteral(block: BooleanLiteral.() -> Unit): BooleanLiteral {
    return BooleanLiteralImpl().apply(block)
}

/**
 * TsGetterSignature#key: Expression
 * extension function for create Expression -> NullLiteralImpl
 */
fun TsGetterSignature.nullLiteral(block: NullLiteral.() -> Unit): NullLiteral {
    return NullLiteralImpl().apply(block)
}

/**
 * TsGetterSignature#key: Expression
 * extension function for create Expression -> NumericLiteralImpl
 */
fun TsGetterSignature.numericLiteral(block: NumericLiteral.() -> Unit): NumericLiteral {
    return NumericLiteralImpl().apply(block)
}

/**
 * TsGetterSignature#key: Expression
 * extension function for create Expression -> BigIntLiteralImpl
 */
fun TsGetterSignature.bigIntLiteral(block: BigIntLiteral.() -> Unit): BigIntLiteral {
    return BigIntLiteralImpl().apply(block)
}

/**
 * TsGetterSignature#key: Expression
 * extension function for create Expression -> RegExpLiteralImpl
 */
fun TsGetterSignature.regExpLiteral(block: RegExpLiteral.() -> Unit): RegExpLiteral {
    return RegExpLiteralImpl().apply(block)
}

/**
 * TsGetterSignature#key: Expression
 * extension function for create Expression -> JSXTextImpl
 */
fun TsGetterSignature.jSXText(block: JSXText.() -> Unit): JSXText {
    return JSXTextImpl().apply(block)
}

/**
 * TsGetterSignature#key: Expression
 * extension function for create Expression -> TemplateLiteralImpl
 */
fun TsGetterSignature.templateLiteral(block: TemplateLiteral.() -> Unit): TemplateLiteral {
    return TemplateLiteralImpl().apply(block)
}

/**
 * TsGetterSignature#key: Expression
 * extension function for create Expression -> TaggedTemplateExpressionImpl
 */
fun TsGetterSignature.taggedTemplateExpression(block: TaggedTemplateExpression.() -> Unit): TaggedTemplateExpression {
    return TaggedTemplateExpressionImpl().apply(block)
}

/**
 * TsGetterSignature#key: Expression
 * extension function for create Expression -> ArrowFunctionExpressionImpl
 */
fun TsGetterSignature.arrowFunctionExpression(block: ArrowFunctionExpression.() -> Unit): ArrowFunctionExpression {
    return ArrowFunctionExpressionImpl().apply(block)
}

/**
 * TsGetterSignature#key: Expression
 * extension function for create Expression -> ClassExpressionImpl
 */
fun TsGetterSignature.classExpression(block: ClassExpression.() -> Unit): ClassExpression {
    return ClassExpressionImpl().apply(block)
}

/**
 * TsGetterSignature#key: Expression
 * extension function for create Expression -> YieldExpressionImpl
 */
fun TsGetterSignature.yieldExpression(block: YieldExpression.() -> Unit): YieldExpression {
    return YieldExpressionImpl().apply(block)
}

/**
 * TsGetterSignature#key: Expression
 * extension function for create Expression -> MetaPropertyImpl
 */
fun TsGetterSignature.metaProperty(block: MetaProperty.() -> Unit): MetaProperty {
    return MetaPropertyImpl().apply(block)
}

/**
 * TsGetterSignature#key: Expression
 * extension function for create Expression -> AwaitExpressionImpl
 */
fun TsGetterSignature.awaitExpression(block: AwaitExpression.() -> Unit): AwaitExpression {
    return AwaitExpressionImpl().apply(block)
}

/**
 * TsGetterSignature#key: Expression
 * extension function for create Expression -> ParenthesisExpressionImpl
 */
fun TsGetterSignature.parenthesisExpression(block: ParenthesisExpression.() -> Unit): ParenthesisExpression {
    return ParenthesisExpressionImpl().apply(block)
}

/**
 * TsGetterSignature#key: Expression
 * extension function for create Expression -> JSXMemberExpressionImpl
 */
fun TsGetterSignature.jSXMemberExpression(block: JSXMemberExpression.() -> Unit): JSXMemberExpression {
    return JSXMemberExpressionImpl().apply(block)
}

/**
 * TsGetterSignature#key: Expression
 * extension function for create Expression -> JSXNamespacedNameImpl
 */
fun TsGetterSignature.jSXNamespacedName(block: JSXNamespacedName.() -> Unit): JSXNamespacedName {
    return JSXNamespacedNameImpl().apply(block)
}

/**
 * TsGetterSignature#key: Expression
 * extension function for create Expression -> JSXEmptyExpressionImpl
 */
fun TsGetterSignature.jSXEmptyExpression(block: JSXEmptyExpression.() -> Unit): JSXEmptyExpression {
    return JSXEmptyExpressionImpl().apply(block)
}

/**
 * TsGetterSignature#key: Expression
 * extension function for create Expression -> JSXElementImpl
 */
fun TsGetterSignature.jSXElement(block: JSXElement.() -> Unit): JSXElement {
    return JSXElementImpl().apply(block)
}

/**
 * TsGetterSignature#key: Expression
 * extension function for create Expression -> JSXFragmentImpl
 */
fun TsGetterSignature.jSXFragment(block: JSXFragment.() -> Unit): JSXFragment {
    return JSXFragmentImpl().apply(block)
}

/**
 * TsGetterSignature#key: Expression
 * extension function for create Expression -> TsTypeAssertionImpl
 */
fun TsGetterSignature.tsTypeAssertion(block: TsTypeAssertion.() -> Unit): TsTypeAssertion {
    return TsTypeAssertionImpl().apply(block)
}

/**
 * TsGetterSignature#key: Expression
 * extension function for create Expression -> TsConstAssertionImpl
 */
fun TsGetterSignature.tsConstAssertion(block: TsConstAssertion.() -> Unit): TsConstAssertion {
    return TsConstAssertionImpl().apply(block)
}

/**
 * TsGetterSignature#key: Expression
 * extension function for create Expression -> TsNonNullExpressionImpl
 */
fun TsGetterSignature.tsNonNullExpression(block: TsNonNullExpression.() -> Unit): TsNonNullExpression {
    return TsNonNullExpressionImpl().apply(block)
}

/**
 * TsGetterSignature#key: Expression
 * extension function for create Expression -> TsAsExpressionImpl
 */
fun TsGetterSignature.tsAsExpression(block: TsAsExpression.() -> Unit): TsAsExpression {
    return TsAsExpressionImpl().apply(block)
}

/**
 * TsGetterSignature#key: Expression
 * extension function for create Expression -> TsSatisfiesExpressionImpl
 */
fun TsGetterSignature.tsSatisfiesExpression(block: TsSatisfiesExpression.() -> Unit): TsSatisfiesExpression {
    return TsSatisfiesExpressionImpl().apply(block)
}

/**
 * TsGetterSignature#key: Expression
 * extension function for create Expression -> TsInstantiationImpl
 */
fun TsGetterSignature.tsInstantiation(block: TsInstantiation.() -> Unit): TsInstantiation {
    return TsInstantiationImpl().apply(block)
}

/**
 * TsGetterSignature#key: Expression
 * extension function for create Expression -> PrivateNameImpl
 */
fun TsGetterSignature.privateName(block: PrivateName.() -> Unit): PrivateName {
    return PrivateNameImpl().apply(block)
}

/**
 * TsGetterSignature#key: Expression
 * extension function for create Expression -> OptionalChainingExpressionImpl
 */
fun TsGetterSignature.optionalChainingExpression(block: OptionalChainingExpression.() -> Unit): OptionalChainingExpression {
    return OptionalChainingExpressionImpl().apply(block)
}

/**
 * TsGetterSignature#key: Expression
 * extension function for create Expression -> InvalidImpl
 */
fun TsGetterSignature.invalid(block: Invalid.() -> Unit): Invalid {
    return InvalidImpl().apply(block)
}

/**
 * TsGetterSignature#typeAnnotation: TsTypeAnnotation
 * extension function for create TsTypeAnnotation -> TsTypeAnnotationImpl
 */
fun TsGetterSignature.tsTypeAnnotation(block: TsTypeAnnotation.() -> Unit): TsTypeAnnotation {
    return TsTypeAnnotationImpl().apply(block)
}

fun TsGetterSignature.span(block: Span.() -> Unit): Span {
    return Span().apply(block)
}
