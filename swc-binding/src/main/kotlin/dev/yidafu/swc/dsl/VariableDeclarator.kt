package dev.yidafu.swc.dsl

import dev.yidafu.swc.types.*

/**
 * VariableDeclarator#id: Pattern
 * extension function for create Pattern -> BindingIdentifierImpl
 */
fun VariableDeclarator.bindingIdentifier(block: BindingIdentifier.() -> Unit): BindingIdentifier {
    return BindingIdentifierImpl().apply(block)
}

/**
 * VariableDeclarator#id: Pattern
 * extension function for create Pattern -> ArrayPatternImpl
 */
fun VariableDeclarator.arrayPattern(block: ArrayPattern.() -> Unit): ArrayPattern {
    return ArrayPatternImpl().apply(block)
}

/**
 * VariableDeclarator#id: Pattern
 * extension function for create Pattern -> RestElementImpl
 */
fun VariableDeclarator.restElement(block: RestElement.() -> Unit): RestElement {
    return RestElementImpl().apply(block)
}

/**
 * VariableDeclarator#id: Pattern
 * extension function for create Pattern -> ObjectPatternImpl
 */
fun VariableDeclarator.objectPattern(block: ObjectPattern.() -> Unit): ObjectPattern {
    return ObjectPatternImpl().apply(block)
}

/**
 * VariableDeclarator#id: Pattern
 * extension function for create Pattern -> AssignmentPatternImpl
 */
fun VariableDeclarator.assignmentPattern(block: AssignmentPattern.() -> Unit): AssignmentPattern {
    return AssignmentPatternImpl().apply(block)
}

/**
 * VariableDeclarator#init: Expression
 * extension function for create Expression -> InvalidImpl
 */
fun VariableDeclarator.invalid(block: Invalid.() -> Unit): Invalid {
    return InvalidImpl().apply(block)
}

/**
 * VariableDeclarator#init: Expression
 * extension function for create Expression -> ThisExpressionImpl
 */
fun VariableDeclarator.thisExpression(block: ThisExpression.() -> Unit): ThisExpression {
    return ThisExpressionImpl().apply(block)
}

/**
 * VariableDeclarator#init: Expression
 * extension function for create Expression -> ArrayExpressionImpl
 */
fun VariableDeclarator.arrayExpression(block: ArrayExpression.() -> Unit): ArrayExpression {
    return ArrayExpressionImpl().apply(block)
}

/**
 * VariableDeclarator#init: Expression
 * extension function for create Expression -> ObjectExpressionImpl
 */
fun VariableDeclarator.objectExpression(block: ObjectExpression.() -> Unit): ObjectExpression {
    return ObjectExpressionImpl().apply(block)
}

/**
 * VariableDeclarator#init: Expression
 * extension function for create Expression -> FunctionExpressionImpl
 */
fun VariableDeclarator.functionExpression(block: FunctionExpression.() -> Unit): FunctionExpression {
    return FunctionExpressionImpl().apply(block)
}

/**
 * VariableDeclarator#init: Expression
 * extension function for create Expression -> UnaryExpressionImpl
 */
fun VariableDeclarator.unaryExpression(block: UnaryExpression.() -> Unit): UnaryExpression {
    return UnaryExpressionImpl().apply(block)
}

/**
 * VariableDeclarator#init: Expression
 * extension function for create Expression -> UpdateExpressionImpl
 */
fun VariableDeclarator.updateExpression(block: UpdateExpression.() -> Unit): UpdateExpression {
    return UpdateExpressionImpl().apply(block)
}

/**
 * VariableDeclarator#init: Expression
 * extension function for create Expression -> BinaryExpressionImpl
 */
fun VariableDeclarator.binaryExpression(block: BinaryExpression.() -> Unit): BinaryExpression {
    return BinaryExpressionImpl().apply(block)
}

/**
 * VariableDeclarator#init: Expression
 * extension function for create Expression -> AssignmentExpressionImpl
 */
fun VariableDeclarator.assignmentExpression(block: AssignmentExpression.() -> Unit): AssignmentExpression {
    return AssignmentExpressionImpl().apply(block)
}

/**
 * VariableDeclarator#init: Expression
 * extension function for create Expression -> MemberExpressionImpl
 */
fun VariableDeclarator.memberExpression(block: MemberExpression.() -> Unit): MemberExpression {
    return MemberExpressionImpl().apply(block)
}

/**
 * VariableDeclarator#init: Expression
 * extension function for create Expression -> SuperPropExpressionImpl
 */
fun VariableDeclarator.superPropExpression(block: SuperPropExpression.() -> Unit): SuperPropExpression {
    return SuperPropExpressionImpl().apply(block)
}

/**
 * VariableDeclarator#init: Expression
 * extension function for create Expression -> ConditionalExpressionImpl
 */
fun VariableDeclarator.conditionalExpression(block: ConditionalExpression.() -> Unit): ConditionalExpression {
    return ConditionalExpressionImpl().apply(block)
}

/**
 * VariableDeclarator#init: Expression
 * extension function for create Expression -> CallExpressionImpl
 */
fun VariableDeclarator.callExpression(block: CallExpression.() -> Unit): CallExpression {
    return CallExpressionImpl().apply(block)
}

/**
 * VariableDeclarator#init: Expression
 * extension function for create Expression -> NewExpressionImpl
 */
fun VariableDeclarator.newExpression(block: NewExpression.() -> Unit): NewExpression {
    return NewExpressionImpl().apply(block)
}

/**
 * VariableDeclarator#init: Expression
 * extension function for create Expression -> SequenceExpressionImpl
 */
fun VariableDeclarator.sequenceExpression(block: SequenceExpression.() -> Unit): SequenceExpression {
    return SequenceExpressionImpl().apply(block)
}

/**
 * VariableDeclarator#init: Expression
 * extension function for create Expression -> IdentifierImpl
 */
fun VariableDeclarator.identifier(block: Identifier.() -> Unit): Identifier {
    return IdentifierImpl().apply(block)
}

/**
 * VariableDeclarator#init: Expression
 * extension function for create Expression -> StringLiteralImpl
 */
fun VariableDeclarator.stringLiteral(block: StringLiteral.() -> Unit): StringLiteral {
    return StringLiteralImpl().apply(block)
}

/**
 * VariableDeclarator#init: Expression
 * extension function for create Expression -> BooleanLiteralImpl
 */
fun VariableDeclarator.booleanLiteral(block: BooleanLiteral.() -> Unit): BooleanLiteral {
    return BooleanLiteralImpl().apply(block)
}

/**
 * VariableDeclarator#init: Expression
 * extension function for create Expression -> NullLiteralImpl
 */
fun VariableDeclarator.nullLiteral(block: NullLiteral.() -> Unit): NullLiteral {
    return NullLiteralImpl().apply(block)
}

/**
 * VariableDeclarator#init: Expression
 * extension function for create Expression -> NumericLiteralImpl
 */
fun VariableDeclarator.numericLiteral(block: NumericLiteral.() -> Unit): NumericLiteral {
    return NumericLiteralImpl().apply(block)
}

/**
 * VariableDeclarator#init: Expression
 * extension function for create Expression -> BigIntLiteralImpl
 */
fun VariableDeclarator.bigIntLiteral(block: BigIntLiteral.() -> Unit): BigIntLiteral {
    return BigIntLiteralImpl().apply(block)
}

/**
 * VariableDeclarator#init: Expression
 * extension function for create Expression -> RegExpLiteralImpl
 */
fun VariableDeclarator.regExpLiteral(block: RegExpLiteral.() -> Unit): RegExpLiteral {
    return RegExpLiteralImpl().apply(block)
}

/**
 * VariableDeclarator#init: Expression
 * extension function for create Expression -> JSXTextImpl
 */
fun VariableDeclarator.jSXText(block: JSXText.() -> Unit): JSXText {
    return JSXTextImpl().apply(block)
}

/**
 * VariableDeclarator#init: Expression
 * extension function for create Expression -> TemplateLiteralImpl
 */
fun VariableDeclarator.templateLiteral(block: TemplateLiteral.() -> Unit): TemplateLiteral {
    return TemplateLiteralImpl().apply(block)
}

/**
 * VariableDeclarator#init: Expression
 * extension function for create Expression -> TaggedTemplateExpressionImpl
 */
fun VariableDeclarator.taggedTemplateExpression(block: TaggedTemplateExpression.() -> Unit): TaggedTemplateExpression {
    return TaggedTemplateExpressionImpl().apply(block)
}

/**
 * VariableDeclarator#init: Expression
 * extension function for create Expression -> ArrowFunctionExpressionImpl
 */
fun VariableDeclarator.arrowFunctionExpression(block: ArrowFunctionExpression.() -> Unit): ArrowFunctionExpression {
    return ArrowFunctionExpressionImpl().apply(block)
}

/**
 * VariableDeclarator#init: Expression
 * extension function for create Expression -> ClassExpressionImpl
 */
fun VariableDeclarator.classExpression(block: ClassExpression.() -> Unit): ClassExpression {
    return ClassExpressionImpl().apply(block)
}

/**
 * VariableDeclarator#init: Expression
 * extension function for create Expression -> YieldExpressionImpl
 */
fun VariableDeclarator.yieldExpression(block: YieldExpression.() -> Unit): YieldExpression {
    return YieldExpressionImpl().apply(block)
}

/**
 * VariableDeclarator#init: Expression
 * extension function for create Expression -> MetaPropertyImpl
 */
fun VariableDeclarator.metaProperty(block: MetaProperty.() -> Unit): MetaProperty {
    return MetaPropertyImpl().apply(block)
}

/**
 * VariableDeclarator#init: Expression
 * extension function for create Expression -> AwaitExpressionImpl
 */
fun VariableDeclarator.awaitExpression(block: AwaitExpression.() -> Unit): AwaitExpression {
    return AwaitExpressionImpl().apply(block)
}

/**
 * VariableDeclarator#init: Expression
 * extension function for create Expression -> ParenthesisExpressionImpl
 */
fun VariableDeclarator.parenthesisExpression(block: ParenthesisExpression.() -> Unit): ParenthesisExpression {
    return ParenthesisExpressionImpl().apply(block)
}

/**
 * VariableDeclarator#init: Expression
 * extension function for create Expression -> JSXMemberExpressionImpl
 */
fun VariableDeclarator.jSXMemberExpression(block: JSXMemberExpression.() -> Unit): JSXMemberExpression {
    return JSXMemberExpressionImpl().apply(block)
}

/**
 * VariableDeclarator#init: Expression
 * extension function for create Expression -> JSXNamespacedNameImpl
 */
fun VariableDeclarator.jSXNamespacedName(block: JSXNamespacedName.() -> Unit): JSXNamespacedName {
    return JSXNamespacedNameImpl().apply(block)
}

/**
 * VariableDeclarator#init: Expression
 * extension function for create Expression -> JSXEmptyExpressionImpl
 */
fun VariableDeclarator.jSXEmptyExpression(block: JSXEmptyExpression.() -> Unit): JSXEmptyExpression {
    return JSXEmptyExpressionImpl().apply(block)
}

/**
 * VariableDeclarator#init: Expression
 * extension function for create Expression -> JSXElementImpl
 */
fun VariableDeclarator.jSXElement(block: JSXElement.() -> Unit): JSXElement {
    return JSXElementImpl().apply(block)
}

/**
 * VariableDeclarator#init: Expression
 * extension function for create Expression -> JSXFragmentImpl
 */
fun VariableDeclarator.jSXFragment(block: JSXFragment.() -> Unit): JSXFragment {
    return JSXFragmentImpl().apply(block)
}

/**
 * VariableDeclarator#init: Expression
 * extension function for create Expression -> TsTypeAssertionImpl
 */
fun VariableDeclarator.tsTypeAssertion(block: TsTypeAssertion.() -> Unit): TsTypeAssertion {
    return TsTypeAssertionImpl().apply(block)
}

/**
 * VariableDeclarator#init: Expression
 * extension function for create Expression -> TsConstAssertionImpl
 */
fun VariableDeclarator.tsConstAssertion(block: TsConstAssertion.() -> Unit): TsConstAssertion {
    return TsConstAssertionImpl().apply(block)
}

/**
 * VariableDeclarator#init: Expression
 * extension function for create Expression -> TsNonNullExpressionImpl
 */
fun VariableDeclarator.tsNonNullExpression(block: TsNonNullExpression.() -> Unit): TsNonNullExpression {
    return TsNonNullExpressionImpl().apply(block)
}

/**
 * VariableDeclarator#init: Expression
 * extension function for create Expression -> TsAsExpressionImpl
 */
fun VariableDeclarator.tsAsExpression(block: TsAsExpression.() -> Unit): TsAsExpression {
    return TsAsExpressionImpl().apply(block)
}

/**
 * VariableDeclarator#init: Expression
 * extension function for create Expression -> TsSatisfiesExpressionImpl
 */
fun VariableDeclarator.tsSatisfiesExpression(block: TsSatisfiesExpression.() -> Unit): TsSatisfiesExpression {
    return TsSatisfiesExpressionImpl().apply(block)
}

/**
 * VariableDeclarator#init: Expression
 * extension function for create Expression -> TsInstantiationImpl
 */
fun VariableDeclarator.tsInstantiation(block: TsInstantiation.() -> Unit): TsInstantiation {
    return TsInstantiationImpl().apply(block)
}

/**
 * VariableDeclarator#init: Expression
 * extension function for create Expression -> PrivateNameImpl
 */
fun VariableDeclarator.privateName(block: PrivateName.() -> Unit): PrivateName {
    return PrivateNameImpl().apply(block)
}

/**
 * VariableDeclarator#init: Expression
 * extension function for create Expression -> OptionalChainingExpressionImpl
 */
fun VariableDeclarator.optionalChainingExpression(block: OptionalChainingExpression.() -> Unit): OptionalChainingExpression {
    return OptionalChainingExpressionImpl().apply(block)
}

fun VariableDeclarator.span(block: Span.() -> Unit): Span {
    return Span().apply(block)
}
