package dev.yidafu.swc.dsl

import dev.yidafu.swc.types.*

/**
 * ClassExpression#superClass: Expression
 * extension function for create Expression -> IdentifierImpl
 */
fun ClassExpression.identifier(block: Identifier.() -> Unit): Identifier {
    return IdentifierImpl().apply(block)
}

/**
 * ClassExpression#body: Array<ClassMember>
 * extension function for create Array<ClassMember> -> ConstructorImpl
 */
fun ClassExpression.constructor(block: Constructor.() -> Unit): Constructor {
    return ConstructorImpl().apply(block)
}

/**
 * ClassExpression#body: Array<ClassMember>
 * extension function for create Array<ClassMember> -> ClassMethodImpl
 */
fun ClassExpression.classMethod(block: ClassMethod.() -> Unit): ClassMethod {
    return ClassMethodImpl().apply(block)
}

/**
 * ClassExpression#body: Array<ClassMember>
 * extension function for create Array<ClassMember> -> PrivateMethodImpl
 */
fun ClassExpression.privateMethod(block: PrivateMethod.() -> Unit): PrivateMethod {
    return PrivateMethodImpl().apply(block)
}

/**
 * ClassExpression#body: Array<ClassMember>
 * extension function for create Array<ClassMember> -> ClassPropertyImpl
 */
fun ClassExpression.classProperty(block: ClassProperty.() -> Unit): ClassProperty {
    return ClassPropertyImpl().apply(block)
}

/**
 * ClassExpression#body: Array<ClassMember>
 * extension function for create Array<ClassMember> -> PrivatePropertyImpl
 */
fun ClassExpression.privateProperty(block: PrivateProperty.() -> Unit): PrivateProperty {
    return PrivatePropertyImpl().apply(block)
}

/**
 * ClassExpression#body: Array<ClassMember>
 * extension function for create Array<ClassMember> -> TsIndexSignatureImpl
 */
fun ClassExpression.tsIndexSignature(block: TsIndexSignature.() -> Unit): TsIndexSignature {
    return TsIndexSignatureImpl().apply(block)
}

/**
 * ClassExpression#body: Array<ClassMember>
 * extension function for create Array<ClassMember> -> EmptyStatementImpl
 */
fun ClassExpression.emptyStatement(block: EmptyStatement.() -> Unit): EmptyStatement {
    return EmptyStatementImpl().apply(block)
}

/**
 * ClassExpression#body: Array<ClassMember>
 * extension function for create Array<ClassMember> -> StaticBlockImpl
 */
fun ClassExpression.staticBlock(block: StaticBlock.() -> Unit): StaticBlock {
    return StaticBlockImpl().apply(block)
}

/**
 * ClassExpression#superClass: Expression
 * extension function for create Expression -> ThisExpressionImpl
 */
fun ClassExpression.thisExpression(block: ThisExpression.() -> Unit): ThisExpression {
    return ThisExpressionImpl().apply(block)
}

/**
 * ClassExpression#superClass: Expression
 * extension function for create Expression -> ArrayExpressionImpl
 */
fun ClassExpression.arrayExpression(block: ArrayExpression.() -> Unit): ArrayExpression {
    return ArrayExpressionImpl().apply(block)
}

/**
 * ClassExpression#superClass: Expression
 * extension function for create Expression -> ObjectExpressionImpl
 */
fun ClassExpression.objectExpression(block: ObjectExpression.() -> Unit): ObjectExpression {
    return ObjectExpressionImpl().apply(block)
}

/**
 * ClassExpression#superClass: Expression
 * extension function for create Expression -> FunctionExpressionImpl
 */
fun ClassExpression.functionExpression(block: FunctionExpression.() -> Unit): FunctionExpression {
    return FunctionExpressionImpl().apply(block)
}

/**
 * ClassExpression#superClass: Expression
 * extension function for create Expression -> UnaryExpressionImpl
 */
fun ClassExpression.unaryExpression(block: UnaryExpression.() -> Unit): UnaryExpression {
    return UnaryExpressionImpl().apply(block)
}

/**
 * ClassExpression#superClass: Expression
 * extension function for create Expression -> UpdateExpressionImpl
 */
fun ClassExpression.updateExpression(block: UpdateExpression.() -> Unit): UpdateExpression {
    return UpdateExpressionImpl().apply(block)
}

/**
 * ClassExpression#superClass: Expression
 * extension function for create Expression -> BinaryExpressionImpl
 */
fun ClassExpression.binaryExpression(block: BinaryExpression.() -> Unit): BinaryExpression {
    return BinaryExpressionImpl().apply(block)
}

/**
 * ClassExpression#superClass: Expression
 * extension function for create Expression -> AssignmentExpressionImpl
 */
fun ClassExpression.assignmentExpression(block: AssignmentExpression.() -> Unit): AssignmentExpression {
    return AssignmentExpressionImpl().apply(block)
}

/**
 * ClassExpression#superClass: Expression
 * extension function for create Expression -> MemberExpressionImpl
 */
fun ClassExpression.memberExpression(block: MemberExpression.() -> Unit): MemberExpression {
    return MemberExpressionImpl().apply(block)
}

/**
 * ClassExpression#superClass: Expression
 * extension function for create Expression -> SuperPropExpressionImpl
 */
fun ClassExpression.superPropExpression(block: SuperPropExpression.() -> Unit): SuperPropExpression {
    return SuperPropExpressionImpl().apply(block)
}

/**
 * ClassExpression#superClass: Expression
 * extension function for create Expression -> ConditionalExpressionImpl
 */
fun ClassExpression.conditionalExpression(block: ConditionalExpression.() -> Unit): ConditionalExpression {
    return ConditionalExpressionImpl().apply(block)
}

/**
 * ClassExpression#superClass: Expression
 * extension function for create Expression -> CallExpressionImpl
 */
fun ClassExpression.callExpression(block: CallExpression.() -> Unit): CallExpression {
    return CallExpressionImpl().apply(block)
}

/**
 * ClassExpression#superClass: Expression
 * extension function for create Expression -> NewExpressionImpl
 */
fun ClassExpression.newExpression(block: NewExpression.() -> Unit): NewExpression {
    return NewExpressionImpl().apply(block)
}

/**
 * ClassExpression#superClass: Expression
 * extension function for create Expression -> SequenceExpressionImpl
 */
fun ClassExpression.sequenceExpression(block: SequenceExpression.() -> Unit): SequenceExpression {
    return SequenceExpressionImpl().apply(block)
}

/**
 * ClassExpression#superClass: Expression
 * extension function for create Expression -> StringLiteralImpl
 */
fun ClassExpression.stringLiteral(block: StringLiteral.() -> Unit): StringLiteral {
    return StringLiteralImpl().apply(block)
}

/**
 * ClassExpression#superClass: Expression
 * extension function for create Expression -> BooleanLiteralImpl
 */
fun ClassExpression.booleanLiteral(block: BooleanLiteral.() -> Unit): BooleanLiteral {
    return BooleanLiteralImpl().apply(block)
}

/**
 * ClassExpression#superClass: Expression
 * extension function for create Expression -> NullLiteralImpl
 */
fun ClassExpression.nullLiteral(block: NullLiteral.() -> Unit): NullLiteral {
    return NullLiteralImpl().apply(block)
}

/**
 * ClassExpression#superClass: Expression
 * extension function for create Expression -> NumericLiteralImpl
 */
fun ClassExpression.numericLiteral(block: NumericLiteral.() -> Unit): NumericLiteral {
    return NumericLiteralImpl().apply(block)
}

/**
 * ClassExpression#superClass: Expression
 * extension function for create Expression -> BigIntLiteralImpl
 */
fun ClassExpression.bigIntLiteral(block: BigIntLiteral.() -> Unit): BigIntLiteral {
    return BigIntLiteralImpl().apply(block)
}

/**
 * ClassExpression#superClass: Expression
 * extension function for create Expression -> RegExpLiteralImpl
 */
fun ClassExpression.regExpLiteral(block: RegExpLiteral.() -> Unit): RegExpLiteral {
    return RegExpLiteralImpl().apply(block)
}

/**
 * ClassExpression#superClass: Expression
 * extension function for create Expression -> JSXTextImpl
 */
fun ClassExpression.jSXText(block: JSXText.() -> Unit): JSXText {
    return JSXTextImpl().apply(block)
}

/**
 * ClassExpression#superClass: Expression
 * extension function for create Expression -> TemplateLiteralImpl
 */
fun ClassExpression.templateLiteral(block: TemplateLiteral.() -> Unit): TemplateLiteral {
    return TemplateLiteralImpl().apply(block)
}

/**
 * ClassExpression#superClass: Expression
 * extension function for create Expression -> TaggedTemplateExpressionImpl
 */
fun ClassExpression.taggedTemplateExpression(block: TaggedTemplateExpression.() -> Unit): TaggedTemplateExpression {
    return TaggedTemplateExpressionImpl().apply(block)
}

/**
 * ClassExpression#superClass: Expression
 * extension function for create Expression -> ArrowFunctionExpressionImpl
 */
fun ClassExpression.arrowFunctionExpression(block: ArrowFunctionExpression.() -> Unit): ArrowFunctionExpression {
    return ArrowFunctionExpressionImpl().apply(block)
}

/**
 * ClassExpression#superClass: Expression
 * extension function for create Expression -> YieldExpressionImpl
 */
fun ClassExpression.yieldExpression(block: YieldExpression.() -> Unit): YieldExpression {
    return YieldExpressionImpl().apply(block)
}

/**
 * ClassExpression#superClass: Expression
 * extension function for create Expression -> MetaPropertyImpl
 */
fun ClassExpression.metaProperty(block: MetaProperty.() -> Unit): MetaProperty {
    return MetaPropertyImpl().apply(block)
}

/**
 * ClassExpression#superClass: Expression
 * extension function for create Expression -> AwaitExpressionImpl
 */
fun ClassExpression.awaitExpression(block: AwaitExpression.() -> Unit): AwaitExpression {
    return AwaitExpressionImpl().apply(block)
}

/**
 * ClassExpression#superClass: Expression
 * extension function for create Expression -> ParenthesisExpressionImpl
 */
fun ClassExpression.parenthesisExpression(block: ParenthesisExpression.() -> Unit): ParenthesisExpression {
    return ParenthesisExpressionImpl().apply(block)
}

/**
 * ClassExpression#superClass: Expression
 * extension function for create Expression -> JSXMemberExpressionImpl
 */
fun ClassExpression.jSXMemberExpression(block: JSXMemberExpression.() -> Unit): JSXMemberExpression {
    return JSXMemberExpressionImpl().apply(block)
}

/**
 * ClassExpression#superClass: Expression
 * extension function for create Expression -> JSXNamespacedNameImpl
 */
fun ClassExpression.jSXNamespacedName(block: JSXNamespacedName.() -> Unit): JSXNamespacedName {
    return JSXNamespacedNameImpl().apply(block)
}

/**
 * ClassExpression#superClass: Expression
 * extension function for create Expression -> JSXEmptyExpressionImpl
 */
fun ClassExpression.jSXEmptyExpression(block: JSXEmptyExpression.() -> Unit): JSXEmptyExpression {
    return JSXEmptyExpressionImpl().apply(block)
}

/**
 * ClassExpression#superClass: Expression
 * extension function for create Expression -> JSXElementImpl
 */
fun ClassExpression.jSXElement(block: JSXElement.() -> Unit): JSXElement {
    return JSXElementImpl().apply(block)
}

/**
 * ClassExpression#superClass: Expression
 * extension function for create Expression -> JSXFragmentImpl
 */
fun ClassExpression.jSXFragment(block: JSXFragment.() -> Unit): JSXFragment {
    return JSXFragmentImpl().apply(block)
}

/**
 * ClassExpression#superClass: Expression
 * extension function for create Expression -> TsTypeAssertionImpl
 */
fun ClassExpression.tsTypeAssertion(block: TsTypeAssertion.() -> Unit): TsTypeAssertion {
    return TsTypeAssertionImpl().apply(block)
}

/**
 * ClassExpression#superClass: Expression
 * extension function for create Expression -> TsConstAssertionImpl
 */
fun ClassExpression.tsConstAssertion(block: TsConstAssertion.() -> Unit): TsConstAssertion {
    return TsConstAssertionImpl().apply(block)
}

/**
 * ClassExpression#superClass: Expression
 * extension function for create Expression -> TsNonNullExpressionImpl
 */
fun ClassExpression.tsNonNullExpression(block: TsNonNullExpression.() -> Unit): TsNonNullExpression {
    return TsNonNullExpressionImpl().apply(block)
}

/**
 * ClassExpression#superClass: Expression
 * extension function for create Expression -> TsAsExpressionImpl
 */
fun ClassExpression.tsAsExpression(block: TsAsExpression.() -> Unit): TsAsExpression {
    return TsAsExpressionImpl().apply(block)
}

/**
 * ClassExpression#superClass: Expression
 * extension function for create Expression -> TsSatisfiesExpressionImpl
 */
fun ClassExpression.tsSatisfiesExpression(block: TsSatisfiesExpression.() -> Unit): TsSatisfiesExpression {
    return TsSatisfiesExpressionImpl().apply(block)
}

/**
 * ClassExpression#superClass: Expression
 * extension function for create Expression -> TsInstantiationImpl
 */
fun ClassExpression.tsInstantiation(block: TsInstantiation.() -> Unit): TsInstantiation {
    return TsInstantiationImpl().apply(block)
}

/**
 * ClassExpression#superClass: Expression
 * extension function for create Expression -> PrivateNameImpl
 */
fun ClassExpression.privateName(block: PrivateName.() -> Unit): PrivateName {
    return PrivateNameImpl().apply(block)
}

/**
 * ClassExpression#superClass: Expression
 * extension function for create Expression -> OptionalChainingExpressionImpl
 */
fun ClassExpression.optionalChainingExpression(block: OptionalChainingExpression.() -> Unit): OptionalChainingExpression {
    return OptionalChainingExpressionImpl().apply(block)
}

/**
 * ClassExpression#superClass: Expression
 * extension function for create Expression -> InvalidImpl
 */
fun ClassExpression.invalid(block: Invalid.() -> Unit): Invalid {
    return InvalidImpl().apply(block)
}

/**
 * ClassExpression#typeParams: TsTypeParameterDeclaration
 * extension function for create TsTypeParameterDeclaration -> TsTypeParameterDeclarationImpl
 */
fun ClassExpression.tsTypeParameterDeclaration(block: TsTypeParameterDeclaration.() -> Unit): TsTypeParameterDeclaration {
    return TsTypeParameterDeclarationImpl().apply(block)
}

/**
 * ClassExpression#superTypeParams: TsTypeParameterInstantiation
 * extension function for create TsTypeParameterInstantiation -> TsTypeParameterInstantiationImpl
 */
fun ClassExpression.tsTypeParameterInstantiation(block: TsTypeParameterInstantiation.() -> Unit): TsTypeParameterInstantiation {
    return TsTypeParameterInstantiationImpl().apply(block)
}

/**
 * ClassExpression#implements: Array<TsExpressionWithTypeArguments>
 * extension function for create Array<TsExpressionWithTypeArguments> -> TsExpressionWithTypeArgumentsImpl
 */
fun ClassExpression.tsExpressionWithTypeArguments(block: TsExpressionWithTypeArguments.() -> Unit): TsExpressionWithTypeArguments {
    return TsExpressionWithTypeArgumentsImpl().apply(block)
}

fun ClassExpression.span(block: Span.() -> Unit): Span {
    return Span().apply(block)
}

/**
 * ClassExpression#decorators: Array<Decorator>
 * extension function for create Array<Decorator> -> DecoratorImpl
 */
fun ClassExpression.decorator(block: Decorator.() -> Unit): Decorator {
    return DecoratorImpl().apply(block)
}
