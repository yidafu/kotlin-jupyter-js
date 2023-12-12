package dev.yidafu.swc.dsl

import dev.yidafu.swc.types.*

/**
 * subtype of Class
 */
fun Class.classDeclaration(block: ClassDeclaration.() -> Unit): ClassDeclaration {
    return ClassDeclarationImpl().apply(block)
}

/**
 * Class#superClass: Expression
 * extension function for create Expression -> ClassExpressionImpl
 */
fun Class.classExpression(block: ClassExpression.() -> Unit): ClassExpression {
    return ClassExpressionImpl().apply(block)
}

/**
 * Class#body: Array<ClassMember>
 * extension function for create Array<ClassMember> -> ConstructorImpl
 */
fun Class.constructor(block: Constructor.() -> Unit): Constructor {
    return ConstructorImpl().apply(block)
}

/**
 * Class#body: Array<ClassMember>
 * extension function for create Array<ClassMember> -> ClassMethodImpl
 */
fun Class.classMethod(block: ClassMethod.() -> Unit): ClassMethod {
    return ClassMethodImpl().apply(block)
}

/**
 * Class#body: Array<ClassMember>
 * extension function for create Array<ClassMember> -> PrivateMethodImpl
 */
fun Class.privateMethod(block: PrivateMethod.() -> Unit): PrivateMethod {
    return PrivateMethodImpl().apply(block)
}

/**
 * Class#body: Array<ClassMember>
 * extension function for create Array<ClassMember> -> ClassPropertyImpl
 */
fun Class.classProperty(block: ClassProperty.() -> Unit): ClassProperty {
    return ClassPropertyImpl().apply(block)
}

/**
 * Class#body: Array<ClassMember>
 * extension function for create Array<ClassMember> -> PrivatePropertyImpl
 */
fun Class.privateProperty(block: PrivateProperty.() -> Unit): PrivateProperty {
    return PrivatePropertyImpl().apply(block)
}

/**
 * Class#body: Array<ClassMember>
 * extension function for create Array<ClassMember> -> TsIndexSignatureImpl
 */
fun Class.tsIndexSignature(block: TsIndexSignature.() -> Unit): TsIndexSignature {
    return TsIndexSignatureImpl().apply(block)
}

/**
 * Class#body: Array<ClassMember>
 * extension function for create Array<ClassMember> -> EmptyStatementImpl
 */
fun Class.emptyStatement(block: EmptyStatement.() -> Unit): EmptyStatement {
    return EmptyStatementImpl().apply(block)
}

/**
 * Class#body: Array<ClassMember>
 * extension function for create Array<ClassMember> -> StaticBlockImpl
 */
fun Class.staticBlock(block: StaticBlock.() -> Unit): StaticBlock {
    return StaticBlockImpl().apply(block)
}

/**
 * Class#superClass: Expression
 * extension function for create Expression -> ThisExpressionImpl
 */
fun Class.thisExpression(block: ThisExpression.() -> Unit): ThisExpression {
    return ThisExpressionImpl().apply(block)
}

/**
 * Class#superClass: Expression
 * extension function for create Expression -> ArrayExpressionImpl
 */
fun Class.arrayExpression(block: ArrayExpression.() -> Unit): ArrayExpression {
    return ArrayExpressionImpl().apply(block)
}

/**
 * Class#superClass: Expression
 * extension function for create Expression -> ObjectExpressionImpl
 */
fun Class.objectExpression(block: ObjectExpression.() -> Unit): ObjectExpression {
    return ObjectExpressionImpl().apply(block)
}

/**
 * Class#superClass: Expression
 * extension function for create Expression -> FunctionExpressionImpl
 */
fun Class.functionExpression(block: FunctionExpression.() -> Unit): FunctionExpression {
    return FunctionExpressionImpl().apply(block)
}

/**
 * Class#superClass: Expression
 * extension function for create Expression -> UnaryExpressionImpl
 */
fun Class.unaryExpression(block: UnaryExpression.() -> Unit): UnaryExpression {
    return UnaryExpressionImpl().apply(block)
}

/**
 * Class#superClass: Expression
 * extension function for create Expression -> UpdateExpressionImpl
 */
fun Class.updateExpression(block: UpdateExpression.() -> Unit): UpdateExpression {
    return UpdateExpressionImpl().apply(block)
}

/**
 * Class#superClass: Expression
 * extension function for create Expression -> BinaryExpressionImpl
 */
fun Class.binaryExpression(block: BinaryExpression.() -> Unit): BinaryExpression {
    return BinaryExpressionImpl().apply(block)
}

/**
 * Class#superClass: Expression
 * extension function for create Expression -> AssignmentExpressionImpl
 */
fun Class.assignmentExpression(block: AssignmentExpression.() -> Unit): AssignmentExpression {
    return AssignmentExpressionImpl().apply(block)
}

/**
 * Class#superClass: Expression
 * extension function for create Expression -> MemberExpressionImpl
 */
fun Class.memberExpression(block: MemberExpression.() -> Unit): MemberExpression {
    return MemberExpressionImpl().apply(block)
}

/**
 * Class#superClass: Expression
 * extension function for create Expression -> SuperPropExpressionImpl
 */
fun Class.superPropExpression(block: SuperPropExpression.() -> Unit): SuperPropExpression {
    return SuperPropExpressionImpl().apply(block)
}

/**
 * Class#superClass: Expression
 * extension function for create Expression -> ConditionalExpressionImpl
 */
fun Class.conditionalExpression(block: ConditionalExpression.() -> Unit): ConditionalExpression {
    return ConditionalExpressionImpl().apply(block)
}

/**
 * Class#superClass: Expression
 * extension function for create Expression -> CallExpressionImpl
 */
fun Class.callExpression(block: CallExpression.() -> Unit): CallExpression {
    return CallExpressionImpl().apply(block)
}

/**
 * Class#superClass: Expression
 * extension function for create Expression -> NewExpressionImpl
 */
fun Class.newExpression(block: NewExpression.() -> Unit): NewExpression {
    return NewExpressionImpl().apply(block)
}

/**
 * Class#superClass: Expression
 * extension function for create Expression -> SequenceExpressionImpl
 */
fun Class.sequenceExpression(block: SequenceExpression.() -> Unit): SequenceExpression {
    return SequenceExpressionImpl().apply(block)
}

/**
 * Class#superClass: Expression
 * extension function for create Expression -> IdentifierImpl
 */
fun Class.identifier(block: Identifier.() -> Unit): Identifier {
    return IdentifierImpl().apply(block)
}

/**
 * Class#superClass: Expression
 * extension function for create Expression -> StringLiteralImpl
 */
fun Class.stringLiteral(block: StringLiteral.() -> Unit): StringLiteral {
    return StringLiteralImpl().apply(block)
}

/**
 * Class#superClass: Expression
 * extension function for create Expression -> BooleanLiteralImpl
 */
fun Class.booleanLiteral(block: BooleanLiteral.() -> Unit): BooleanLiteral {
    return BooleanLiteralImpl().apply(block)
}

/**
 * Class#superClass: Expression
 * extension function for create Expression -> NullLiteralImpl
 */
fun Class.nullLiteral(block: NullLiteral.() -> Unit): NullLiteral {
    return NullLiteralImpl().apply(block)
}

/**
 * Class#superClass: Expression
 * extension function for create Expression -> NumericLiteralImpl
 */
fun Class.numericLiteral(block: NumericLiteral.() -> Unit): NumericLiteral {
    return NumericLiteralImpl().apply(block)
}

/**
 * Class#superClass: Expression
 * extension function for create Expression -> BigIntLiteralImpl
 */
fun Class.bigIntLiteral(block: BigIntLiteral.() -> Unit): BigIntLiteral {
    return BigIntLiteralImpl().apply(block)
}

/**
 * Class#superClass: Expression
 * extension function for create Expression -> RegExpLiteralImpl
 */
fun Class.regExpLiteral(block: RegExpLiteral.() -> Unit): RegExpLiteral {
    return RegExpLiteralImpl().apply(block)
}

/**
 * Class#superClass: Expression
 * extension function for create Expression -> JSXTextImpl
 */
fun Class.jSXText(block: JSXText.() -> Unit): JSXText {
    return JSXTextImpl().apply(block)
}

/**
 * Class#superClass: Expression
 * extension function for create Expression -> TemplateLiteralImpl
 */
fun Class.templateLiteral(block: TemplateLiteral.() -> Unit): TemplateLiteral {
    return TemplateLiteralImpl().apply(block)
}

/**
 * Class#superClass: Expression
 * extension function for create Expression -> TaggedTemplateExpressionImpl
 */
fun Class.taggedTemplateExpression(block: TaggedTemplateExpression.() -> Unit): TaggedTemplateExpression {
    return TaggedTemplateExpressionImpl().apply(block)
}

/**
 * Class#superClass: Expression
 * extension function for create Expression -> ArrowFunctionExpressionImpl
 */
fun Class.arrowFunctionExpression(block: ArrowFunctionExpression.() -> Unit): ArrowFunctionExpression {
    return ArrowFunctionExpressionImpl().apply(block)
}

/**
 * Class#superClass: Expression
 * extension function for create Expression -> YieldExpressionImpl
 */
fun Class.yieldExpression(block: YieldExpression.() -> Unit): YieldExpression {
    return YieldExpressionImpl().apply(block)
}

/**
 * Class#superClass: Expression
 * extension function for create Expression -> MetaPropertyImpl
 */
fun Class.metaProperty(block: MetaProperty.() -> Unit): MetaProperty {
    return MetaPropertyImpl().apply(block)
}

/**
 * Class#superClass: Expression
 * extension function for create Expression -> AwaitExpressionImpl
 */
fun Class.awaitExpression(block: AwaitExpression.() -> Unit): AwaitExpression {
    return AwaitExpressionImpl().apply(block)
}

/**
 * Class#superClass: Expression
 * extension function for create Expression -> ParenthesisExpressionImpl
 */
fun Class.parenthesisExpression(block: ParenthesisExpression.() -> Unit): ParenthesisExpression {
    return ParenthesisExpressionImpl().apply(block)
}

/**
 * Class#superClass: Expression
 * extension function for create Expression -> JSXMemberExpressionImpl
 */
fun Class.jSXMemberExpression(block: JSXMemberExpression.() -> Unit): JSXMemberExpression {
    return JSXMemberExpressionImpl().apply(block)
}

/**
 * Class#superClass: Expression
 * extension function for create Expression -> JSXNamespacedNameImpl
 */
fun Class.jSXNamespacedName(block: JSXNamespacedName.() -> Unit): JSXNamespacedName {
    return JSXNamespacedNameImpl().apply(block)
}

/**
 * Class#superClass: Expression
 * extension function for create Expression -> JSXEmptyExpressionImpl
 */
fun Class.jSXEmptyExpression(block: JSXEmptyExpression.() -> Unit): JSXEmptyExpression {
    return JSXEmptyExpressionImpl().apply(block)
}

/**
 * Class#superClass: Expression
 * extension function for create Expression -> JSXElementImpl
 */
fun Class.jSXElement(block: JSXElement.() -> Unit): JSXElement {
    return JSXElementImpl().apply(block)
}

/**
 * Class#superClass: Expression
 * extension function for create Expression -> JSXFragmentImpl
 */
fun Class.jSXFragment(block: JSXFragment.() -> Unit): JSXFragment {
    return JSXFragmentImpl().apply(block)
}

/**
 * Class#superClass: Expression
 * extension function for create Expression -> TsTypeAssertionImpl
 */
fun Class.tsTypeAssertion(block: TsTypeAssertion.() -> Unit): TsTypeAssertion {
    return TsTypeAssertionImpl().apply(block)
}

/**
 * Class#superClass: Expression
 * extension function for create Expression -> TsConstAssertionImpl
 */
fun Class.tsConstAssertion(block: TsConstAssertion.() -> Unit): TsConstAssertion {
    return TsConstAssertionImpl().apply(block)
}

/**
 * Class#superClass: Expression
 * extension function for create Expression -> TsNonNullExpressionImpl
 */
fun Class.tsNonNullExpression(block: TsNonNullExpression.() -> Unit): TsNonNullExpression {
    return TsNonNullExpressionImpl().apply(block)
}

/**
 * Class#superClass: Expression
 * extension function for create Expression -> TsAsExpressionImpl
 */
fun Class.tsAsExpression(block: TsAsExpression.() -> Unit): TsAsExpression {
    return TsAsExpressionImpl().apply(block)
}

/**
 * Class#superClass: Expression
 * extension function for create Expression -> TsSatisfiesExpressionImpl
 */
fun Class.tsSatisfiesExpression(block: TsSatisfiesExpression.() -> Unit): TsSatisfiesExpression {
    return TsSatisfiesExpressionImpl().apply(block)
}

/**
 * Class#superClass: Expression
 * extension function for create Expression -> TsInstantiationImpl
 */
fun Class.tsInstantiation(block: TsInstantiation.() -> Unit): TsInstantiation {
    return TsInstantiationImpl().apply(block)
}

/**
 * Class#superClass: Expression
 * extension function for create Expression -> PrivateNameImpl
 */
fun Class.privateName(block: PrivateName.() -> Unit): PrivateName {
    return PrivateNameImpl().apply(block)
}

/**
 * Class#superClass: Expression
 * extension function for create Expression -> OptionalChainingExpressionImpl
 */
fun Class.optionalChainingExpression(block: OptionalChainingExpression.() -> Unit): OptionalChainingExpression {
    return OptionalChainingExpressionImpl().apply(block)
}

/**
 * Class#superClass: Expression
 * extension function for create Expression -> InvalidImpl
 */
fun Class.invalid(block: Invalid.() -> Unit): Invalid {
    return InvalidImpl().apply(block)
}

/**
 * Class#typeParams: TsTypeParameterDeclaration
 * extension function for create TsTypeParameterDeclaration -> TsTypeParameterDeclarationImpl
 */
fun Class.tsTypeParameterDeclaration(block: TsTypeParameterDeclaration.() -> Unit): TsTypeParameterDeclaration {
    return TsTypeParameterDeclarationImpl().apply(block)
}

/**
 * Class#superTypeParams: TsTypeParameterInstantiation
 * extension function for create TsTypeParameterInstantiation -> TsTypeParameterInstantiationImpl
 */
fun Class.tsTypeParameterInstantiation(block: TsTypeParameterInstantiation.() -> Unit): TsTypeParameterInstantiation {
    return TsTypeParameterInstantiationImpl().apply(block)
}

/**
 * Class#implements: Array<TsExpressionWithTypeArguments>
 * extension function for create Array<TsExpressionWithTypeArguments> -> TsExpressionWithTypeArgumentsImpl
 */
fun Class.tsExpressionWithTypeArguments(block: TsExpressionWithTypeArguments.() -> Unit): TsExpressionWithTypeArguments {
    return TsExpressionWithTypeArgumentsImpl().apply(block)
}

fun Class.span(block: Span.() -> Unit): Span {
    return Span().apply(block)
}

/**
 * Class#decorators: Array<Decorator>
 * extension function for create Array<Decorator> -> DecoratorImpl
 */
fun Class.decorator(block: Decorator.() -> Unit): Decorator {
    return DecoratorImpl().apply(block)
}
