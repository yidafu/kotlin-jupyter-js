package dev.yidafu.swc.dsl

import dev.yidafu.swc.types.*

/**
 * ClassDeclaration#superClass: Expression
 * extension function for create Expression -> IdentifierImpl
 */
fun ClassDeclaration.identifier(block: Identifier.() -> Unit): Identifier {
    return IdentifierImpl().apply(block)
}

/**
 * ClassDeclaration#body: Array<ClassMember>
 * extension function for create Array<ClassMember> -> ConstructorImpl
 */
fun ClassDeclaration.constructor(block: Constructor.() -> Unit): Constructor {
    return ConstructorImpl().apply(block)
}

/**
 * ClassDeclaration#body: Array<ClassMember>
 * extension function for create Array<ClassMember> -> ClassMethodImpl
 */
fun ClassDeclaration.classMethod(block: ClassMethod.() -> Unit): ClassMethod {
    return ClassMethodImpl().apply(block)
}

/**
 * ClassDeclaration#body: Array<ClassMember>
 * extension function for create Array<ClassMember> -> PrivateMethodImpl
 */
fun ClassDeclaration.privateMethod(block: PrivateMethod.() -> Unit): PrivateMethod {
    return PrivateMethodImpl().apply(block)
}

/**
 * ClassDeclaration#body: Array<ClassMember>
 * extension function for create Array<ClassMember> -> ClassPropertyImpl
 */
fun ClassDeclaration.classProperty(block: ClassProperty.() -> Unit): ClassProperty {
    return ClassPropertyImpl().apply(block)
}

/**
 * ClassDeclaration#body: Array<ClassMember>
 * extension function for create Array<ClassMember> -> PrivatePropertyImpl
 */
fun ClassDeclaration.privateProperty(block: PrivateProperty.() -> Unit): PrivateProperty {
    return PrivatePropertyImpl().apply(block)
}

/**
 * ClassDeclaration#body: Array<ClassMember>
 * extension function for create Array<ClassMember> -> TsIndexSignatureImpl
 */
fun ClassDeclaration.tsIndexSignature(block: TsIndexSignature.() -> Unit): TsIndexSignature {
    return TsIndexSignatureImpl().apply(block)
}

/**
 * ClassDeclaration#body: Array<ClassMember>
 * extension function for create Array<ClassMember> -> EmptyStatementImpl
 */
fun ClassDeclaration.emptyStatement(block: EmptyStatement.() -> Unit): EmptyStatement {
    return EmptyStatementImpl().apply(block)
}

/**
 * ClassDeclaration#body: Array<ClassMember>
 * extension function for create Array<ClassMember> -> StaticBlockImpl
 */
fun ClassDeclaration.staticBlock(block: StaticBlock.() -> Unit): StaticBlock {
    return StaticBlockImpl().apply(block)
}

/**
 * ClassDeclaration#superClass: Expression
 * extension function for create Expression -> ThisExpressionImpl
 */
fun ClassDeclaration.thisExpression(block: ThisExpression.() -> Unit): ThisExpression {
    return ThisExpressionImpl().apply(block)
}

/**
 * ClassDeclaration#superClass: Expression
 * extension function for create Expression -> ArrayExpressionImpl
 */
fun ClassDeclaration.arrayExpression(block: ArrayExpression.() -> Unit): ArrayExpression {
    return ArrayExpressionImpl().apply(block)
}

/**
 * ClassDeclaration#superClass: Expression
 * extension function for create Expression -> ObjectExpressionImpl
 */
fun ClassDeclaration.objectExpression(block: ObjectExpression.() -> Unit): ObjectExpression {
    return ObjectExpressionImpl().apply(block)
}

/**
 * ClassDeclaration#superClass: Expression
 * extension function for create Expression -> FunctionExpressionImpl
 */
fun ClassDeclaration.functionExpression(block: FunctionExpression.() -> Unit): FunctionExpression {
    return FunctionExpressionImpl().apply(block)
}

/**
 * ClassDeclaration#superClass: Expression
 * extension function for create Expression -> UnaryExpressionImpl
 */
fun ClassDeclaration.unaryExpression(block: UnaryExpression.() -> Unit): UnaryExpression {
    return UnaryExpressionImpl().apply(block)
}

/**
 * ClassDeclaration#superClass: Expression
 * extension function for create Expression -> UpdateExpressionImpl
 */
fun ClassDeclaration.updateExpression(block: UpdateExpression.() -> Unit): UpdateExpression {
    return UpdateExpressionImpl().apply(block)
}

/**
 * ClassDeclaration#superClass: Expression
 * extension function for create Expression -> BinaryExpressionImpl
 */
fun ClassDeclaration.binaryExpression(block: BinaryExpression.() -> Unit): BinaryExpression {
    return BinaryExpressionImpl().apply(block)
}

/**
 * ClassDeclaration#superClass: Expression
 * extension function for create Expression -> AssignmentExpressionImpl
 */
fun ClassDeclaration.assignmentExpression(block: AssignmentExpression.() -> Unit): AssignmentExpression {
    return AssignmentExpressionImpl().apply(block)
}

/**
 * ClassDeclaration#superClass: Expression
 * extension function for create Expression -> MemberExpressionImpl
 */
fun ClassDeclaration.memberExpression(block: MemberExpression.() -> Unit): MemberExpression {
    return MemberExpressionImpl().apply(block)
}

/**
 * ClassDeclaration#superClass: Expression
 * extension function for create Expression -> SuperPropExpressionImpl
 */
fun ClassDeclaration.superPropExpression(block: SuperPropExpression.() -> Unit): SuperPropExpression {
    return SuperPropExpressionImpl().apply(block)
}

/**
 * ClassDeclaration#superClass: Expression
 * extension function for create Expression -> ConditionalExpressionImpl
 */
fun ClassDeclaration.conditionalExpression(block: ConditionalExpression.() -> Unit): ConditionalExpression {
    return ConditionalExpressionImpl().apply(block)
}

/**
 * ClassDeclaration#superClass: Expression
 * extension function for create Expression -> CallExpressionImpl
 */
fun ClassDeclaration.callExpression(block: CallExpression.() -> Unit): CallExpression {
    return CallExpressionImpl().apply(block)
}

/**
 * ClassDeclaration#superClass: Expression
 * extension function for create Expression -> NewExpressionImpl
 */
fun ClassDeclaration.newExpression(block: NewExpression.() -> Unit): NewExpression {
    return NewExpressionImpl().apply(block)
}

/**
 * ClassDeclaration#superClass: Expression
 * extension function for create Expression -> SequenceExpressionImpl
 */
fun ClassDeclaration.sequenceExpression(block: SequenceExpression.() -> Unit): SequenceExpression {
    return SequenceExpressionImpl().apply(block)
}

/**
 * ClassDeclaration#superClass: Expression
 * extension function for create Expression -> StringLiteralImpl
 */
fun ClassDeclaration.stringLiteral(block: StringLiteral.() -> Unit): StringLiteral {
    return StringLiteralImpl().apply(block)
}

/**
 * ClassDeclaration#superClass: Expression
 * extension function for create Expression -> BooleanLiteralImpl
 */
fun ClassDeclaration.booleanLiteral(block: BooleanLiteral.() -> Unit): BooleanLiteral {
    return BooleanLiteralImpl().apply(block)
}

/**
 * ClassDeclaration#superClass: Expression
 * extension function for create Expression -> NullLiteralImpl
 */
fun ClassDeclaration.nullLiteral(block: NullLiteral.() -> Unit): NullLiteral {
    return NullLiteralImpl().apply(block)
}

/**
 * ClassDeclaration#superClass: Expression
 * extension function for create Expression -> NumericLiteralImpl
 */
fun ClassDeclaration.numericLiteral(block: NumericLiteral.() -> Unit): NumericLiteral {
    return NumericLiteralImpl().apply(block)
}

/**
 * ClassDeclaration#superClass: Expression
 * extension function for create Expression -> BigIntLiteralImpl
 */
fun ClassDeclaration.bigIntLiteral(block: BigIntLiteral.() -> Unit): BigIntLiteral {
    return BigIntLiteralImpl().apply(block)
}

/**
 * ClassDeclaration#superClass: Expression
 * extension function for create Expression -> RegExpLiteralImpl
 */
fun ClassDeclaration.regExpLiteral(block: RegExpLiteral.() -> Unit): RegExpLiteral {
    return RegExpLiteralImpl().apply(block)
}

/**
 * ClassDeclaration#superClass: Expression
 * extension function for create Expression -> JSXTextImpl
 */
fun ClassDeclaration.jSXText(block: JSXText.() -> Unit): JSXText {
    return JSXTextImpl().apply(block)
}

/**
 * ClassDeclaration#superClass: Expression
 * extension function for create Expression -> TemplateLiteralImpl
 */
fun ClassDeclaration.templateLiteral(block: TemplateLiteral.() -> Unit): TemplateLiteral {
    return TemplateLiteralImpl().apply(block)
}

/**
 * ClassDeclaration#superClass: Expression
 * extension function for create Expression -> TaggedTemplateExpressionImpl
 */
fun ClassDeclaration.taggedTemplateExpression(block: TaggedTemplateExpression.() -> Unit): TaggedTemplateExpression {
    return TaggedTemplateExpressionImpl().apply(block)
}

/**
 * ClassDeclaration#superClass: Expression
 * extension function for create Expression -> ArrowFunctionExpressionImpl
 */
fun ClassDeclaration.arrowFunctionExpression(block: ArrowFunctionExpression.() -> Unit): ArrowFunctionExpression {
    return ArrowFunctionExpressionImpl().apply(block)
}

/**
 * ClassDeclaration#superClass: Expression
 * extension function for create Expression -> ClassExpressionImpl
 */
fun ClassDeclaration.classExpression(block: ClassExpression.() -> Unit): ClassExpression {
    return ClassExpressionImpl().apply(block)
}

/**
 * ClassDeclaration#superClass: Expression
 * extension function for create Expression -> YieldExpressionImpl
 */
fun ClassDeclaration.yieldExpression(block: YieldExpression.() -> Unit): YieldExpression {
    return YieldExpressionImpl().apply(block)
}

/**
 * ClassDeclaration#superClass: Expression
 * extension function for create Expression -> MetaPropertyImpl
 */
fun ClassDeclaration.metaProperty(block: MetaProperty.() -> Unit): MetaProperty {
    return MetaPropertyImpl().apply(block)
}

/**
 * ClassDeclaration#superClass: Expression
 * extension function for create Expression -> AwaitExpressionImpl
 */
fun ClassDeclaration.awaitExpression(block: AwaitExpression.() -> Unit): AwaitExpression {
    return AwaitExpressionImpl().apply(block)
}

/**
 * ClassDeclaration#superClass: Expression
 * extension function for create Expression -> ParenthesisExpressionImpl
 */
fun ClassDeclaration.parenthesisExpression(block: ParenthesisExpression.() -> Unit): ParenthesisExpression {
    return ParenthesisExpressionImpl().apply(block)
}

/**
 * ClassDeclaration#superClass: Expression
 * extension function for create Expression -> JSXMemberExpressionImpl
 */
fun ClassDeclaration.jSXMemberExpression(block: JSXMemberExpression.() -> Unit): JSXMemberExpression {
    return JSXMemberExpressionImpl().apply(block)
}

/**
 * ClassDeclaration#superClass: Expression
 * extension function for create Expression -> JSXNamespacedNameImpl
 */
fun ClassDeclaration.jSXNamespacedName(block: JSXNamespacedName.() -> Unit): JSXNamespacedName {
    return JSXNamespacedNameImpl().apply(block)
}

/**
 * ClassDeclaration#superClass: Expression
 * extension function for create Expression -> JSXEmptyExpressionImpl
 */
fun ClassDeclaration.jSXEmptyExpression(block: JSXEmptyExpression.() -> Unit): JSXEmptyExpression {
    return JSXEmptyExpressionImpl().apply(block)
}

/**
 * ClassDeclaration#superClass: Expression
 * extension function for create Expression -> JSXElementImpl
 */
fun ClassDeclaration.jSXElement(block: JSXElement.() -> Unit): JSXElement {
    return JSXElementImpl().apply(block)
}

/**
 * ClassDeclaration#superClass: Expression
 * extension function for create Expression -> JSXFragmentImpl
 */
fun ClassDeclaration.jSXFragment(block: JSXFragment.() -> Unit): JSXFragment {
    return JSXFragmentImpl().apply(block)
}

/**
 * ClassDeclaration#superClass: Expression
 * extension function for create Expression -> TsTypeAssertionImpl
 */
fun ClassDeclaration.tsTypeAssertion(block: TsTypeAssertion.() -> Unit): TsTypeAssertion {
    return TsTypeAssertionImpl().apply(block)
}

/**
 * ClassDeclaration#superClass: Expression
 * extension function for create Expression -> TsConstAssertionImpl
 */
fun ClassDeclaration.tsConstAssertion(block: TsConstAssertion.() -> Unit): TsConstAssertion {
    return TsConstAssertionImpl().apply(block)
}

/**
 * ClassDeclaration#superClass: Expression
 * extension function for create Expression -> TsNonNullExpressionImpl
 */
fun ClassDeclaration.tsNonNullExpression(block: TsNonNullExpression.() -> Unit): TsNonNullExpression {
    return TsNonNullExpressionImpl().apply(block)
}

/**
 * ClassDeclaration#superClass: Expression
 * extension function for create Expression -> TsAsExpressionImpl
 */
fun ClassDeclaration.tsAsExpression(block: TsAsExpression.() -> Unit): TsAsExpression {
    return TsAsExpressionImpl().apply(block)
}

/**
 * ClassDeclaration#superClass: Expression
 * extension function for create Expression -> TsSatisfiesExpressionImpl
 */
fun ClassDeclaration.tsSatisfiesExpression(block: TsSatisfiesExpression.() -> Unit): TsSatisfiesExpression {
    return TsSatisfiesExpressionImpl().apply(block)
}

/**
 * ClassDeclaration#superClass: Expression
 * extension function for create Expression -> TsInstantiationImpl
 */
fun ClassDeclaration.tsInstantiation(block: TsInstantiation.() -> Unit): TsInstantiation {
    return TsInstantiationImpl().apply(block)
}

/**
 * ClassDeclaration#superClass: Expression
 * extension function for create Expression -> PrivateNameImpl
 */
fun ClassDeclaration.privateName(block: PrivateName.() -> Unit): PrivateName {
    return PrivateNameImpl().apply(block)
}

/**
 * ClassDeclaration#superClass: Expression
 * extension function for create Expression -> OptionalChainingExpressionImpl
 */
fun ClassDeclaration.optionalChainingExpression(block: OptionalChainingExpression.() -> Unit): OptionalChainingExpression {
    return OptionalChainingExpressionImpl().apply(block)
}

/**
 * ClassDeclaration#superClass: Expression
 * extension function for create Expression -> InvalidImpl
 */
fun ClassDeclaration.invalid(block: Invalid.() -> Unit): Invalid {
    return InvalidImpl().apply(block)
}

/**
 * ClassDeclaration#typeParams: TsTypeParameterDeclaration
 * extension function for create TsTypeParameterDeclaration -> TsTypeParameterDeclarationImpl
 */
fun ClassDeclaration.tsTypeParameterDeclaration(block: TsTypeParameterDeclaration.() -> Unit): TsTypeParameterDeclaration {
    return TsTypeParameterDeclarationImpl().apply(block)
}

/**
 * ClassDeclaration#superTypeParams: TsTypeParameterInstantiation
 * extension function for create TsTypeParameterInstantiation -> TsTypeParameterInstantiationImpl
 */
fun ClassDeclaration.tsTypeParameterInstantiation(block: TsTypeParameterInstantiation.() -> Unit): TsTypeParameterInstantiation {
    return TsTypeParameterInstantiationImpl().apply(block)
}

/**
 * ClassDeclaration#implements: Array<TsExpressionWithTypeArguments>
 * extension function for create Array<TsExpressionWithTypeArguments> -> TsExpressionWithTypeArgumentsImpl
 */
fun ClassDeclaration.tsExpressionWithTypeArguments(block: TsExpressionWithTypeArguments.() -> Unit): TsExpressionWithTypeArguments {
    return TsExpressionWithTypeArgumentsImpl().apply(block)
}

fun ClassDeclaration.span(block: Span.() -> Unit): Span {
    return Span().apply(block)
}

/**
 * ClassDeclaration#decorators: Array<Decorator>
 * extension function for create Array<Decorator> -> DecoratorImpl
 */
fun ClassDeclaration.decorator(block: Decorator.() -> Unit): Decorator {
    return DecoratorImpl().apply(block)
}
