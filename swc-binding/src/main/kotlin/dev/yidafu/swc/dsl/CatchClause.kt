package dev.yidafu.swc.dsl

import dev.yidafu.swc.types.*

/**
 * CatchClause#param: Pattern
 * extension function for create Pattern -> BindingIdentifierImpl
 */
fun CatchClause.bindingIdentifier(block: BindingIdentifier.() -> Unit): BindingIdentifier {
    return BindingIdentifierImpl().apply(block)
}

/**
 * CatchClause#param: Pattern
 * extension function for create Pattern -> ArrayPatternImpl
 */
fun CatchClause.arrayPattern(block: ArrayPattern.() -> Unit): ArrayPattern {
    return ArrayPatternImpl().apply(block)
}

/**
 * CatchClause#param: Pattern
 * extension function for create Pattern -> RestElementImpl
 */
fun CatchClause.restElement(block: RestElement.() -> Unit): RestElement {
    return RestElementImpl().apply(block)
}

/**
 * CatchClause#param: Pattern
 * extension function for create Pattern -> ObjectPatternImpl
 */
fun CatchClause.objectPattern(block: ObjectPattern.() -> Unit): ObjectPattern {
    return ObjectPatternImpl().apply(block)
}

/**
 * CatchClause#param: Pattern
 * extension function for create Pattern -> AssignmentPatternImpl
 */
fun CatchClause.assignmentPattern(block: AssignmentPattern.() -> Unit): AssignmentPattern {
    return AssignmentPatternImpl().apply(block)
}

/**
 * CatchClause#param: Pattern
 * extension function for create Pattern -> InvalidImpl
 */
fun CatchClause.invalid(block: Invalid.() -> Unit): Invalid {
    return InvalidImpl().apply(block)
}

/**
 * CatchClause#param: Pattern
 * extension function for create Pattern -> ThisExpressionImpl
 */
fun CatchClause.thisExpression(block: ThisExpression.() -> Unit): ThisExpression {
    return ThisExpressionImpl().apply(block)
}

/**
 * CatchClause#param: Pattern
 * extension function for create Pattern -> ArrayExpressionImpl
 */
fun CatchClause.arrayExpression(block: ArrayExpression.() -> Unit): ArrayExpression {
    return ArrayExpressionImpl().apply(block)
}

/**
 * CatchClause#param: Pattern
 * extension function for create Pattern -> ObjectExpressionImpl
 */
fun CatchClause.objectExpression(block: ObjectExpression.() -> Unit): ObjectExpression {
    return ObjectExpressionImpl().apply(block)
}

/**
 * CatchClause#param: Pattern
 * extension function for create Pattern -> FunctionExpressionImpl
 */
fun CatchClause.functionExpression(block: FunctionExpression.() -> Unit): FunctionExpression {
    return FunctionExpressionImpl().apply(block)
}

/**
 * CatchClause#param: Pattern
 * extension function for create Pattern -> UnaryExpressionImpl
 */
fun CatchClause.unaryExpression(block: UnaryExpression.() -> Unit): UnaryExpression {
    return UnaryExpressionImpl().apply(block)
}

/**
 * CatchClause#param: Pattern
 * extension function for create Pattern -> UpdateExpressionImpl
 */
fun CatchClause.updateExpression(block: UpdateExpression.() -> Unit): UpdateExpression {
    return UpdateExpressionImpl().apply(block)
}

/**
 * CatchClause#param: Pattern
 * extension function for create Pattern -> BinaryExpressionImpl
 */
fun CatchClause.binaryExpression(block: BinaryExpression.() -> Unit): BinaryExpression {
    return BinaryExpressionImpl().apply(block)
}

/**
 * CatchClause#param: Pattern
 * extension function for create Pattern -> AssignmentExpressionImpl
 */
fun CatchClause.assignmentExpression(block: AssignmentExpression.() -> Unit): AssignmentExpression {
    return AssignmentExpressionImpl().apply(block)
}

/**
 * CatchClause#param: Pattern
 * extension function for create Pattern -> MemberExpressionImpl
 */
fun CatchClause.memberExpression(block: MemberExpression.() -> Unit): MemberExpression {
    return MemberExpressionImpl().apply(block)
}

/**
 * CatchClause#param: Pattern
 * extension function for create Pattern -> SuperPropExpressionImpl
 */
fun CatchClause.superPropExpression(block: SuperPropExpression.() -> Unit): SuperPropExpression {
    return SuperPropExpressionImpl().apply(block)
}

/**
 * CatchClause#param: Pattern
 * extension function for create Pattern -> ConditionalExpressionImpl
 */
fun CatchClause.conditionalExpression(block: ConditionalExpression.() -> Unit): ConditionalExpression {
    return ConditionalExpressionImpl().apply(block)
}

/**
 * CatchClause#param: Pattern
 * extension function for create Pattern -> CallExpressionImpl
 */
fun CatchClause.callExpression(block: CallExpression.() -> Unit): CallExpression {
    return CallExpressionImpl().apply(block)
}

/**
 * CatchClause#param: Pattern
 * extension function for create Pattern -> NewExpressionImpl
 */
fun CatchClause.newExpression(block: NewExpression.() -> Unit): NewExpression {
    return NewExpressionImpl().apply(block)
}

/**
 * CatchClause#param: Pattern
 * extension function for create Pattern -> SequenceExpressionImpl
 */
fun CatchClause.sequenceExpression(block: SequenceExpression.() -> Unit): SequenceExpression {
    return SequenceExpressionImpl().apply(block)
}

/**
 * CatchClause#param: Pattern
 * extension function for create Pattern -> IdentifierImpl
 */
fun CatchClause.identifier(block: Identifier.() -> Unit): Identifier {
    return IdentifierImpl().apply(block)
}

/**
 * CatchClause#param: Pattern
 * extension function for create Pattern -> StringLiteralImpl
 */
fun CatchClause.stringLiteral(block: StringLiteral.() -> Unit): StringLiteral {
    return StringLiteralImpl().apply(block)
}

/**
 * CatchClause#param: Pattern
 * extension function for create Pattern -> BooleanLiteralImpl
 */
fun CatchClause.booleanLiteral(block: BooleanLiteral.() -> Unit): BooleanLiteral {
    return BooleanLiteralImpl().apply(block)
}

/**
 * CatchClause#param: Pattern
 * extension function for create Pattern -> NullLiteralImpl
 */
fun CatchClause.nullLiteral(block: NullLiteral.() -> Unit): NullLiteral {
    return NullLiteralImpl().apply(block)
}

/**
 * CatchClause#param: Pattern
 * extension function for create Pattern -> NumericLiteralImpl
 */
fun CatchClause.numericLiteral(block: NumericLiteral.() -> Unit): NumericLiteral {
    return NumericLiteralImpl().apply(block)
}

/**
 * CatchClause#param: Pattern
 * extension function for create Pattern -> BigIntLiteralImpl
 */
fun CatchClause.bigIntLiteral(block: BigIntLiteral.() -> Unit): BigIntLiteral {
    return BigIntLiteralImpl().apply(block)
}

/**
 * CatchClause#param: Pattern
 * extension function for create Pattern -> RegExpLiteralImpl
 */
fun CatchClause.regExpLiteral(block: RegExpLiteral.() -> Unit): RegExpLiteral {
    return RegExpLiteralImpl().apply(block)
}

/**
 * CatchClause#param: Pattern
 * extension function for create Pattern -> JSXTextImpl
 */
fun CatchClause.jSXText(block: JSXText.() -> Unit): JSXText {
    return JSXTextImpl().apply(block)
}

/**
 * CatchClause#param: Pattern
 * extension function for create Pattern -> TemplateLiteralImpl
 */
fun CatchClause.templateLiteral(block: TemplateLiteral.() -> Unit): TemplateLiteral {
    return TemplateLiteralImpl().apply(block)
}

/**
 * CatchClause#param: Pattern
 * extension function for create Pattern -> TaggedTemplateExpressionImpl
 */
fun CatchClause.taggedTemplateExpression(block: TaggedTemplateExpression.() -> Unit): TaggedTemplateExpression {
    return TaggedTemplateExpressionImpl().apply(block)
}

/**
 * CatchClause#param: Pattern
 * extension function for create Pattern -> ArrowFunctionExpressionImpl
 */
fun CatchClause.arrowFunctionExpression(block: ArrowFunctionExpression.() -> Unit): ArrowFunctionExpression {
    return ArrowFunctionExpressionImpl().apply(block)
}

/**
 * CatchClause#param: Pattern
 * extension function for create Pattern -> ClassExpressionImpl
 */
fun CatchClause.classExpression(block: ClassExpression.() -> Unit): ClassExpression {
    return ClassExpressionImpl().apply(block)
}

/**
 * CatchClause#param: Pattern
 * extension function for create Pattern -> YieldExpressionImpl
 */
fun CatchClause.yieldExpression(block: YieldExpression.() -> Unit): YieldExpression {
    return YieldExpressionImpl().apply(block)
}

/**
 * CatchClause#param: Pattern
 * extension function for create Pattern -> MetaPropertyImpl
 */
fun CatchClause.metaProperty(block: MetaProperty.() -> Unit): MetaProperty {
    return MetaPropertyImpl().apply(block)
}

/**
 * CatchClause#param: Pattern
 * extension function for create Pattern -> AwaitExpressionImpl
 */
fun CatchClause.awaitExpression(block: AwaitExpression.() -> Unit): AwaitExpression {
    return AwaitExpressionImpl().apply(block)
}

/**
 * CatchClause#param: Pattern
 * extension function for create Pattern -> ParenthesisExpressionImpl
 */
fun CatchClause.parenthesisExpression(block: ParenthesisExpression.() -> Unit): ParenthesisExpression {
    return ParenthesisExpressionImpl().apply(block)
}

/**
 * CatchClause#param: Pattern
 * extension function for create Pattern -> JSXMemberExpressionImpl
 */
fun CatchClause.jSXMemberExpression(block: JSXMemberExpression.() -> Unit): JSXMemberExpression {
    return JSXMemberExpressionImpl().apply(block)
}

/**
 * CatchClause#param: Pattern
 * extension function for create Pattern -> JSXNamespacedNameImpl
 */
fun CatchClause.jSXNamespacedName(block: JSXNamespacedName.() -> Unit): JSXNamespacedName {
    return JSXNamespacedNameImpl().apply(block)
}

/**
 * CatchClause#param: Pattern
 * extension function for create Pattern -> JSXEmptyExpressionImpl
 */
fun CatchClause.jSXEmptyExpression(block: JSXEmptyExpression.() -> Unit): JSXEmptyExpression {
    return JSXEmptyExpressionImpl().apply(block)
}

/**
 * CatchClause#param: Pattern
 * extension function for create Pattern -> JSXElementImpl
 */
fun CatchClause.jSXElement(block: JSXElement.() -> Unit): JSXElement {
    return JSXElementImpl().apply(block)
}

/**
 * CatchClause#param: Pattern
 * extension function for create Pattern -> JSXFragmentImpl
 */
fun CatchClause.jSXFragment(block: JSXFragment.() -> Unit): JSXFragment {
    return JSXFragmentImpl().apply(block)
}

/**
 * CatchClause#param: Pattern
 * extension function for create Pattern -> TsTypeAssertionImpl
 */
fun CatchClause.tsTypeAssertion(block: TsTypeAssertion.() -> Unit): TsTypeAssertion {
    return TsTypeAssertionImpl().apply(block)
}

/**
 * CatchClause#param: Pattern
 * extension function for create Pattern -> TsConstAssertionImpl
 */
fun CatchClause.tsConstAssertion(block: TsConstAssertion.() -> Unit): TsConstAssertion {
    return TsConstAssertionImpl().apply(block)
}

/**
 * CatchClause#param: Pattern
 * extension function for create Pattern -> TsNonNullExpressionImpl
 */
fun CatchClause.tsNonNullExpression(block: TsNonNullExpression.() -> Unit): TsNonNullExpression {
    return TsNonNullExpressionImpl().apply(block)
}

/**
 * CatchClause#param: Pattern
 * extension function for create Pattern -> TsAsExpressionImpl
 */
fun CatchClause.tsAsExpression(block: TsAsExpression.() -> Unit): TsAsExpression {
    return TsAsExpressionImpl().apply(block)
}

/**
 * CatchClause#param: Pattern
 * extension function for create Pattern -> TsSatisfiesExpressionImpl
 */
fun CatchClause.tsSatisfiesExpression(block: TsSatisfiesExpression.() -> Unit): TsSatisfiesExpression {
    return TsSatisfiesExpressionImpl().apply(block)
}

/**
 * CatchClause#param: Pattern
 * extension function for create Pattern -> TsInstantiationImpl
 */
fun CatchClause.tsInstantiation(block: TsInstantiation.() -> Unit): TsInstantiation {
    return TsInstantiationImpl().apply(block)
}

/**
 * CatchClause#param: Pattern
 * extension function for create Pattern -> PrivateNameImpl
 */
fun CatchClause.privateName(block: PrivateName.() -> Unit): PrivateName {
    return PrivateNameImpl().apply(block)
}

/**
 * CatchClause#param: Pattern
 * extension function for create Pattern -> OptionalChainingExpressionImpl
 */
fun CatchClause.optionalChainingExpression(block: OptionalChainingExpression.() -> Unit): OptionalChainingExpression {
    return OptionalChainingExpressionImpl().apply(block)
}

/**
 * CatchClause#body: BlockStatement
 * extension function for create BlockStatement -> BlockStatementImpl
 */
fun CatchClause.blockStatement(block: BlockStatement.() -> Unit): BlockStatement {
    return BlockStatementImpl().apply(block)
}

fun CatchClause.span(block: Span.() -> Unit): Span {
    return Span().apply(block)
}
