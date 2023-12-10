package dev.yidafu.swc.dsl

import dev.yidafu.swc.types.*

/**
 * subtype of ExpressionBase
 */
fun ExpressionBase.identifier(block: Identifier.() -> Unit): Identifier {
    return IdentifierImpl().apply(block)
}

/**
 * subtype of ExpressionBase
 */
fun ExpressionBase.optionalChainingExpression(block: OptionalChainingExpression.() -> Unit): OptionalChainingExpression {
    return OptionalChainingExpressionImpl().apply(block)
}

/**
 * subtype of ExpressionBase
 */
fun ExpressionBase.optionalChainingCall(block: OptionalChainingCall.() -> Unit): OptionalChainingCall {
    return OptionalChainingCallImpl().apply(block)
}

/**
 * subtype of ExpressionBase
 */
fun ExpressionBase.thisExpression(block: ThisExpression.() -> Unit): ThisExpression {
    return ThisExpressionImpl().apply(block)
}

/**
 * subtype of ExpressionBase
 */
fun ExpressionBase.arrayExpression(block: ArrayExpression.() -> Unit): ArrayExpression {
    return ArrayExpressionImpl().apply(block)
}

/**
 * subtype of ExpressionBase
 */
fun ExpressionBase.objectExpression(block: ObjectExpression.() -> Unit): ObjectExpression {
    return ObjectExpressionImpl().apply(block)
}

/**
 * subtype of ExpressionBase
 */
fun ExpressionBase.unaryExpression(block: UnaryExpression.() -> Unit): UnaryExpression {
    return UnaryExpressionImpl().apply(block)
}

/**
 * subtype of ExpressionBase
 */
fun ExpressionBase.updateExpression(block: UpdateExpression.() -> Unit): UpdateExpression {
    return UpdateExpressionImpl().apply(block)
}

/**
 * subtype of ExpressionBase
 */
fun ExpressionBase.binaryExpression(block: BinaryExpression.() -> Unit): BinaryExpression {
    return BinaryExpressionImpl().apply(block)
}

/**
 * subtype of ExpressionBase
 */
fun ExpressionBase.functionExpression(block: FunctionExpression.() -> Unit): FunctionExpression {
    return FunctionExpressionImpl().apply(block)
}

/**
 * subtype of ExpressionBase
 */
fun ExpressionBase.classExpression(block: ClassExpression.() -> Unit): ClassExpression {
    return ClassExpressionImpl().apply(block)
}

/**
 * subtype of ExpressionBase
 */
fun ExpressionBase.assignmentExpression(block: AssignmentExpression.() -> Unit): AssignmentExpression {
    return AssignmentExpressionImpl().apply(block)
}

/**
 * subtype of ExpressionBase
 */
fun ExpressionBase.memberExpression(block: MemberExpression.() -> Unit): MemberExpression {
    return MemberExpressionImpl().apply(block)
}

/**
 * subtype of ExpressionBase
 */
fun ExpressionBase.superPropExpression(block: SuperPropExpression.() -> Unit): SuperPropExpression {
    return SuperPropExpressionImpl().apply(block)
}

/**
 * subtype of ExpressionBase
 */
fun ExpressionBase.conditionalExpression(block: ConditionalExpression.() -> Unit): ConditionalExpression {
    return ConditionalExpressionImpl().apply(block)
}

/**
 * subtype of ExpressionBase
 */
fun ExpressionBase.callExpression(block: CallExpression.() -> Unit): CallExpression {
    return CallExpressionImpl().apply(block)
}

/**
 * subtype of ExpressionBase
 */
fun ExpressionBase.newExpression(block: NewExpression.() -> Unit): NewExpression {
    return NewExpressionImpl().apply(block)
}

/**
 * subtype of ExpressionBase
 */
fun ExpressionBase.sequenceExpression(block: SequenceExpression.() -> Unit): SequenceExpression {
    return SequenceExpressionImpl().apply(block)
}

/**
 * subtype of ExpressionBase
 */
fun ExpressionBase.arrowFunctionExpression(block: ArrowFunctionExpression.() -> Unit): ArrowFunctionExpression {
    return ArrowFunctionExpressionImpl().apply(block)
}

/**
 * subtype of ExpressionBase
 */
fun ExpressionBase.yieldExpression(block: YieldExpression.() -> Unit): YieldExpression {
    return YieldExpressionImpl().apply(block)
}

/**
 * subtype of ExpressionBase
 */
fun ExpressionBase.awaitExpression(block: AwaitExpression.() -> Unit): AwaitExpression {
    return AwaitExpressionImpl().apply(block)
}

/**
 * subtype of ExpressionBase
 */
fun ExpressionBase.templateLiteral(block: TemplateLiteral.() -> Unit): TemplateLiteral {
    return TemplateLiteralImpl().apply(block)
}

/**
 * subtype of ExpressionBase
 */
fun ExpressionBase.taggedTemplateExpression(block: TaggedTemplateExpression.() -> Unit): TaggedTemplateExpression {
    return TaggedTemplateExpressionImpl().apply(block)
}

/**
 * subtype of ExpressionBase
 */
fun ExpressionBase.templateElement(block: TemplateElement.() -> Unit): TemplateElement {
    return TemplateElementImpl().apply(block)
}

/**
 * subtype of ExpressionBase
 */
fun ExpressionBase.parenthesisExpression(block: ParenthesisExpression.() -> Unit): ParenthesisExpression {
    return ParenthesisExpressionImpl().apply(block)
}

/**
 * subtype of ExpressionBase
 */
fun ExpressionBase.privateName(block: PrivateName.() -> Unit): PrivateName {
    return PrivateNameImpl().apply(block)
}

/**
 * subtype of ExpressionBase
 */
fun ExpressionBase.tsAsExpression(block: TsAsExpression.() -> Unit): TsAsExpression {
    return TsAsExpressionImpl().apply(block)
}

/**
 * subtype of ExpressionBase
 */
fun ExpressionBase.tsSatisfiesExpression(block: TsSatisfiesExpression.() -> Unit): TsSatisfiesExpression {
    return TsSatisfiesExpressionImpl().apply(block)
}

/**
 * subtype of ExpressionBase
 */
fun ExpressionBase.tsTypeAssertion(block: TsTypeAssertion.() -> Unit): TsTypeAssertion {
    return TsTypeAssertionImpl().apply(block)
}

/**
 * subtype of ExpressionBase
 */
fun ExpressionBase.tsConstAssertion(block: TsConstAssertion.() -> Unit): TsConstAssertion {
    return TsConstAssertionImpl().apply(block)
}

/**
 * subtype of ExpressionBase
 */
fun ExpressionBase.tsNonNullExpression(block: TsNonNullExpression.() -> Unit): TsNonNullExpression {
    return TsNonNullExpressionImpl().apply(block)
}

fun ExpressionBase.span(block: Span.() -> Unit): Span {
    return Span().apply(block)
}
