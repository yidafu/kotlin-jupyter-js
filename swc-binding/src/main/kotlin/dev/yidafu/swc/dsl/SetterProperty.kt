package dev.yidafu.swc.dsl

import dev.yidafu.swc.types.*

/**
 * SetterProperty#param: Pattern
 * extension function for create Pattern -> BindingIdentifierImpl
 */
fun SetterProperty.bindingIdentifier(block: BindingIdentifier.() -> Unit): BindingIdentifier {
    return BindingIdentifierImpl().apply(block)
}

/**
 * SetterProperty#param: Pattern
 * extension function for create Pattern -> ArrayPatternImpl
 */
fun SetterProperty.arrayPattern(block: ArrayPattern.() -> Unit): ArrayPattern {
    return ArrayPatternImpl().apply(block)
}

/**
 * SetterProperty#param: Pattern
 * extension function for create Pattern -> RestElementImpl
 */
fun SetterProperty.restElement(block: RestElement.() -> Unit): RestElement {
    return RestElementImpl().apply(block)
}

/**
 * SetterProperty#param: Pattern
 * extension function for create Pattern -> ObjectPatternImpl
 */
fun SetterProperty.objectPattern(block: ObjectPattern.() -> Unit): ObjectPattern {
    return ObjectPatternImpl().apply(block)
}

/**
 * SetterProperty#param: Pattern
 * extension function for create Pattern -> AssignmentPatternImpl
 */
fun SetterProperty.assignmentPattern(block: AssignmentPattern.() -> Unit): AssignmentPattern {
    return AssignmentPatternImpl().apply(block)
}

/**
 * SetterProperty#param: Pattern
 * extension function for create Pattern -> InvalidImpl
 */
fun SetterProperty.invalid(block: Invalid.() -> Unit): Invalid {
    return InvalidImpl().apply(block)
}

/**
 * SetterProperty#param: Pattern
 * extension function for create Pattern -> ThisExpressionImpl
 */
fun SetterProperty.thisExpression(block: ThisExpression.() -> Unit): ThisExpression {
    return ThisExpressionImpl().apply(block)
}

/**
 * SetterProperty#param: Pattern
 * extension function for create Pattern -> ArrayExpressionImpl
 */
fun SetterProperty.arrayExpression(block: ArrayExpression.() -> Unit): ArrayExpression {
    return ArrayExpressionImpl().apply(block)
}

/**
 * SetterProperty#param: Pattern
 * extension function for create Pattern -> ObjectExpressionImpl
 */
fun SetterProperty.objectExpression(block: ObjectExpression.() -> Unit): ObjectExpression {
    return ObjectExpressionImpl().apply(block)
}

/**
 * SetterProperty#param: Pattern
 * extension function for create Pattern -> FunctionExpressionImpl
 */
fun SetterProperty.functionExpression(block: FunctionExpression.() -> Unit): FunctionExpression {
    return FunctionExpressionImpl().apply(block)
}

/**
 * SetterProperty#param: Pattern
 * extension function for create Pattern -> UnaryExpressionImpl
 */
fun SetterProperty.unaryExpression(block: UnaryExpression.() -> Unit): UnaryExpression {
    return UnaryExpressionImpl().apply(block)
}

/**
 * SetterProperty#param: Pattern
 * extension function for create Pattern -> UpdateExpressionImpl
 */
fun SetterProperty.updateExpression(block: UpdateExpression.() -> Unit): UpdateExpression {
    return UpdateExpressionImpl().apply(block)
}

/**
 * SetterProperty#param: Pattern
 * extension function for create Pattern -> BinaryExpressionImpl
 */
fun SetterProperty.binaryExpression(block: BinaryExpression.() -> Unit): BinaryExpression {
    return BinaryExpressionImpl().apply(block)
}

/**
 * SetterProperty#param: Pattern
 * extension function for create Pattern -> AssignmentExpressionImpl
 */
fun SetterProperty.assignmentExpression(block: AssignmentExpression.() -> Unit): AssignmentExpression {
    return AssignmentExpressionImpl().apply(block)
}

/**
 * SetterProperty#param: Pattern
 * extension function for create Pattern -> MemberExpressionImpl
 */
fun SetterProperty.memberExpression(block: MemberExpression.() -> Unit): MemberExpression {
    return MemberExpressionImpl().apply(block)
}

/**
 * SetterProperty#param: Pattern
 * extension function for create Pattern -> SuperPropExpressionImpl
 */
fun SetterProperty.superPropExpression(block: SuperPropExpression.() -> Unit): SuperPropExpression {
    return SuperPropExpressionImpl().apply(block)
}

/**
 * SetterProperty#param: Pattern
 * extension function for create Pattern -> ConditionalExpressionImpl
 */
fun SetterProperty.conditionalExpression(block: ConditionalExpression.() -> Unit): ConditionalExpression {
    return ConditionalExpressionImpl().apply(block)
}

/**
 * SetterProperty#param: Pattern
 * extension function for create Pattern -> CallExpressionImpl
 */
fun SetterProperty.callExpression(block: CallExpression.() -> Unit): CallExpression {
    return CallExpressionImpl().apply(block)
}

/**
 * SetterProperty#param: Pattern
 * extension function for create Pattern -> NewExpressionImpl
 */
fun SetterProperty.newExpression(block: NewExpression.() -> Unit): NewExpression {
    return NewExpressionImpl().apply(block)
}

/**
 * SetterProperty#param: Pattern
 * extension function for create Pattern -> SequenceExpressionImpl
 */
fun SetterProperty.sequenceExpression(block: SequenceExpression.() -> Unit): SequenceExpression {
    return SequenceExpressionImpl().apply(block)
}

/**
 * SetterProperty#key: PropertyName
 * extension function for create PropertyName -> IdentifierImpl
 */
fun SetterProperty.identifier(block: Identifier.() -> Unit): Identifier {
    return IdentifierImpl().apply(block)
}

/**
 * SetterProperty#key: PropertyName
 * extension function for create PropertyName -> StringLiteralImpl
 */
fun SetterProperty.stringLiteral(block: StringLiteral.() -> Unit): StringLiteral {
    return StringLiteralImpl().apply(block)
}

/**
 * SetterProperty#param: Pattern
 * extension function for create Pattern -> BooleanLiteralImpl
 */
fun SetterProperty.booleanLiteral(block: BooleanLiteral.() -> Unit): BooleanLiteral {
    return BooleanLiteralImpl().apply(block)
}

/**
 * SetterProperty#param: Pattern
 * extension function for create Pattern -> NullLiteralImpl
 */
fun SetterProperty.nullLiteral(block: NullLiteral.() -> Unit): NullLiteral {
    return NullLiteralImpl().apply(block)
}

/**
 * SetterProperty#key: PropertyName
 * extension function for create PropertyName -> NumericLiteralImpl
 */
fun SetterProperty.numericLiteral(block: NumericLiteral.() -> Unit): NumericLiteral {
    return NumericLiteralImpl().apply(block)
}

/**
 * SetterProperty#key: PropertyName
 * extension function for create PropertyName -> BigIntLiteralImpl
 */
fun SetterProperty.bigIntLiteral(block: BigIntLiteral.() -> Unit): BigIntLiteral {
    return BigIntLiteralImpl().apply(block)
}

/**
 * SetterProperty#param: Pattern
 * extension function for create Pattern -> RegExpLiteralImpl
 */
fun SetterProperty.regExpLiteral(block: RegExpLiteral.() -> Unit): RegExpLiteral {
    return RegExpLiteralImpl().apply(block)
}

/**
 * SetterProperty#param: Pattern
 * extension function for create Pattern -> JSXTextImpl
 */
fun SetterProperty.jSXText(block: JSXText.() -> Unit): JSXText {
    return JSXTextImpl().apply(block)
}

/**
 * SetterProperty#param: Pattern
 * extension function for create Pattern -> TemplateLiteralImpl
 */
fun SetterProperty.templateLiteral(block: TemplateLiteral.() -> Unit): TemplateLiteral {
    return TemplateLiteralImpl().apply(block)
}

/**
 * SetterProperty#param: Pattern
 * extension function for create Pattern -> TaggedTemplateExpressionImpl
 */
fun SetterProperty.taggedTemplateExpression(block: TaggedTemplateExpression.() -> Unit): TaggedTemplateExpression {
    return TaggedTemplateExpressionImpl().apply(block)
}

/**
 * SetterProperty#param: Pattern
 * extension function for create Pattern -> ArrowFunctionExpressionImpl
 */
fun SetterProperty.arrowFunctionExpression(block: ArrowFunctionExpression.() -> Unit): ArrowFunctionExpression {
    return ArrowFunctionExpressionImpl().apply(block)
}

/**
 * SetterProperty#param: Pattern
 * extension function for create Pattern -> ClassExpressionImpl
 */
fun SetterProperty.classExpression(block: ClassExpression.() -> Unit): ClassExpression {
    return ClassExpressionImpl().apply(block)
}

/**
 * SetterProperty#param: Pattern
 * extension function for create Pattern -> YieldExpressionImpl
 */
fun SetterProperty.yieldExpression(block: YieldExpression.() -> Unit): YieldExpression {
    return YieldExpressionImpl().apply(block)
}

/**
 * SetterProperty#param: Pattern
 * extension function for create Pattern -> MetaPropertyImpl
 */
fun SetterProperty.metaProperty(block: MetaProperty.() -> Unit): MetaProperty {
    return MetaPropertyImpl().apply(block)
}

/**
 * SetterProperty#param: Pattern
 * extension function for create Pattern -> AwaitExpressionImpl
 */
fun SetterProperty.awaitExpression(block: AwaitExpression.() -> Unit): AwaitExpression {
    return AwaitExpressionImpl().apply(block)
}

/**
 * SetterProperty#param: Pattern
 * extension function for create Pattern -> ParenthesisExpressionImpl
 */
fun SetterProperty.parenthesisExpression(block: ParenthesisExpression.() -> Unit): ParenthesisExpression {
    return ParenthesisExpressionImpl().apply(block)
}

/**
 * SetterProperty#param: Pattern
 * extension function for create Pattern -> JSXMemberExpressionImpl
 */
fun SetterProperty.jSXMemberExpression(block: JSXMemberExpression.() -> Unit): JSXMemberExpression {
    return JSXMemberExpressionImpl().apply(block)
}

/**
 * SetterProperty#param: Pattern
 * extension function for create Pattern -> JSXNamespacedNameImpl
 */
fun SetterProperty.jSXNamespacedName(block: JSXNamespacedName.() -> Unit): JSXNamespacedName {
    return JSXNamespacedNameImpl().apply(block)
}

/**
 * SetterProperty#param: Pattern
 * extension function for create Pattern -> JSXEmptyExpressionImpl
 */
fun SetterProperty.jSXEmptyExpression(block: JSXEmptyExpression.() -> Unit): JSXEmptyExpression {
    return JSXEmptyExpressionImpl().apply(block)
}

/**
 * SetterProperty#param: Pattern
 * extension function for create Pattern -> JSXElementImpl
 */
fun SetterProperty.jSXElement(block: JSXElement.() -> Unit): JSXElement {
    return JSXElementImpl().apply(block)
}

/**
 * SetterProperty#param: Pattern
 * extension function for create Pattern -> JSXFragmentImpl
 */
fun SetterProperty.jSXFragment(block: JSXFragment.() -> Unit): JSXFragment {
    return JSXFragmentImpl().apply(block)
}

/**
 * SetterProperty#param: Pattern
 * extension function for create Pattern -> TsTypeAssertionImpl
 */
fun SetterProperty.tsTypeAssertion(block: TsTypeAssertion.() -> Unit): TsTypeAssertion {
    return TsTypeAssertionImpl().apply(block)
}

/**
 * SetterProperty#param: Pattern
 * extension function for create Pattern -> TsConstAssertionImpl
 */
fun SetterProperty.tsConstAssertion(block: TsConstAssertion.() -> Unit): TsConstAssertion {
    return TsConstAssertionImpl().apply(block)
}

/**
 * SetterProperty#param: Pattern
 * extension function for create Pattern -> TsNonNullExpressionImpl
 */
fun SetterProperty.tsNonNullExpression(block: TsNonNullExpression.() -> Unit): TsNonNullExpression {
    return TsNonNullExpressionImpl().apply(block)
}

/**
 * SetterProperty#param: Pattern
 * extension function for create Pattern -> TsAsExpressionImpl
 */
fun SetterProperty.tsAsExpression(block: TsAsExpression.() -> Unit): TsAsExpression {
    return TsAsExpressionImpl().apply(block)
}

/**
 * SetterProperty#param: Pattern
 * extension function for create Pattern -> TsSatisfiesExpressionImpl
 */
fun SetterProperty.tsSatisfiesExpression(block: TsSatisfiesExpression.() -> Unit): TsSatisfiesExpression {
    return TsSatisfiesExpressionImpl().apply(block)
}

/**
 * SetterProperty#param: Pattern
 * extension function for create Pattern -> TsInstantiationImpl
 */
fun SetterProperty.tsInstantiation(block: TsInstantiation.() -> Unit): TsInstantiation {
    return TsInstantiationImpl().apply(block)
}

/**
 * SetterProperty#param: Pattern
 * extension function for create Pattern -> PrivateNameImpl
 */
fun SetterProperty.privateName(block: PrivateName.() -> Unit): PrivateName {
    return PrivateNameImpl().apply(block)
}

/**
 * SetterProperty#param: Pattern
 * extension function for create Pattern -> OptionalChainingExpressionImpl
 */
fun SetterProperty.optionalChainingExpression(block: OptionalChainingExpression.() -> Unit): OptionalChainingExpression {
    return OptionalChainingExpressionImpl().apply(block)
}

/**
 * SetterProperty#body: BlockStatement
 * extension function for create BlockStatement -> BlockStatementImpl
 */
fun SetterProperty.blockStatement(block: BlockStatement.() -> Unit): BlockStatement {
    return BlockStatementImpl().apply(block)
}

/**
 * SetterProperty#key: PropertyName
 * extension function for create PropertyName -> ComputedPropNameImpl
 */
fun SetterProperty.computedPropName(block: ComputedPropName.() -> Unit): ComputedPropName {
    return ComputedPropNameImpl().apply(block)
}

fun SetterProperty.span(block: Span.() -> Unit): Span {
    return Span().apply(block)
}
