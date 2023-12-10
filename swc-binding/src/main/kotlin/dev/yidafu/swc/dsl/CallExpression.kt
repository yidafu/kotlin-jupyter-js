package dev.yidafu.swc.dsl

import dev.yidafu.swc.types.*

/**
 * CallExpression#callee: Union.U3<Super, Import, Expression>
 * extension function for create Union.U3<Super, Import, Expression> -> SuperImpl
 */
fun CallExpression.jsSuper(block: Super.() -> Unit): Super {
    return SuperImpl().apply(block)
}

/**
 * CallExpression#callee: Union.U3<Super, Import, Expression>
 * extension function for create Union.U3<Super, Import, Expression> -> ImportImpl
 */
fun CallExpression.import(block: Import.() -> Unit): Import {
    return ImportImpl().apply(block)
}

/**
 * CallExpression#callee: Union.U3<Super, Import, Expression>
 * extension function for create Union.U3<Super, Import, Expression> -> ThisExpressionImpl
 */
fun CallExpression.thisExpression(block: ThisExpression.() -> Unit): ThisExpression {
    return ThisExpressionImpl().apply(block)
}

/**
 * CallExpression#callee: Union.U3<Super, Import, Expression>
 * extension function for create Union.U3<Super, Import, Expression> -> ArrayExpressionImpl
 */
fun CallExpression.arrayExpression(block: ArrayExpression.() -> Unit): ArrayExpression {
    return ArrayExpressionImpl().apply(block)
}

/**
 * CallExpression#callee: Union.U3<Super, Import, Expression>
 * extension function for create Union.U3<Super, Import, Expression> -> ObjectExpressionImpl
 */
fun CallExpression.objectExpression(block: ObjectExpression.() -> Unit): ObjectExpression {
    return ObjectExpressionImpl().apply(block)
}

/**
 * CallExpression#callee: Union.U3<Super, Import, Expression>
 * extension function for create Union.U3<Super, Import, Expression> -> FunctionExpressionImpl
 */
fun CallExpression.functionExpression(block: FunctionExpression.() -> Unit): FunctionExpression {
    return FunctionExpressionImpl().apply(block)
}

/**
 * CallExpression#callee: Union.U3<Super, Import, Expression>
 * extension function for create Union.U3<Super, Import, Expression> -> UnaryExpressionImpl
 */
fun CallExpression.unaryExpression(block: UnaryExpression.() -> Unit): UnaryExpression {
    return UnaryExpressionImpl().apply(block)
}

/**
 * CallExpression#callee: Union.U3<Super, Import, Expression>
 * extension function for create Union.U3<Super, Import, Expression> -> UpdateExpressionImpl
 */
fun CallExpression.updateExpression(block: UpdateExpression.() -> Unit): UpdateExpression {
    return UpdateExpressionImpl().apply(block)
}

/**
 * CallExpression#callee: Union.U3<Super, Import, Expression>
 * extension function for create Union.U3<Super, Import, Expression> -> BinaryExpressionImpl
 */
fun CallExpression.binaryExpression(block: BinaryExpression.() -> Unit): BinaryExpression {
    return BinaryExpressionImpl().apply(block)
}

/**
 * CallExpression#callee: Union.U3<Super, Import, Expression>
 * extension function for create Union.U3<Super, Import, Expression> -> AssignmentExpressionImpl
 */
fun CallExpression.assignmentExpression(block: AssignmentExpression.() -> Unit): AssignmentExpression {
    return AssignmentExpressionImpl().apply(block)
}

/**
 * CallExpression#callee: Union.U3<Super, Import, Expression>
 * extension function for create Union.U3<Super, Import, Expression> -> MemberExpressionImpl
 */
fun CallExpression.memberExpression(block: MemberExpression.() -> Unit): MemberExpression {
    return MemberExpressionImpl().apply(block)
}

/**
 * CallExpression#callee: Union.U3<Super, Import, Expression>
 * extension function for create Union.U3<Super, Import, Expression> -> SuperPropExpressionImpl
 */
fun CallExpression.superPropExpression(block: SuperPropExpression.() -> Unit): SuperPropExpression {
    return SuperPropExpressionImpl().apply(block)
}

/**
 * CallExpression#callee: Union.U3<Super, Import, Expression>
 * extension function for create Union.U3<Super, Import, Expression> -> ConditionalExpressionImpl
 */
fun CallExpression.conditionalExpression(block: ConditionalExpression.() -> Unit): ConditionalExpression {
    return ConditionalExpressionImpl().apply(block)
}

/**
 * CallExpression#callee: Union.U3<Super, Import, Expression>
 * extension function for create Union.U3<Super, Import, Expression> -> NewExpressionImpl
 */
fun CallExpression.newExpression(block: NewExpression.() -> Unit): NewExpression {
    return NewExpressionImpl().apply(block)
}

/**
 * CallExpression#callee: Union.U3<Super, Import, Expression>
 * extension function for create Union.U3<Super, Import, Expression> -> SequenceExpressionImpl
 */
fun CallExpression.sequenceExpression(block: SequenceExpression.() -> Unit): SequenceExpression {
    return SequenceExpressionImpl().apply(block)
}

/**
 * CallExpression#callee: Union.U3<Super, Import, Expression>
 * extension function for create Union.U3<Super, Import, Expression> -> IdentifierImpl
 */
fun CallExpression.identifier(block: Identifier.() -> Unit): Identifier {
    return IdentifierImpl().apply(block)
}

/**
 * CallExpression#callee: Union.U3<Super, Import, Expression>
 * extension function for create Union.U3<Super, Import, Expression> -> StringLiteralImpl
 */
fun CallExpression.stringLiteral(block: StringLiteral.() -> Unit): StringLiteral {
    return StringLiteralImpl().apply(block)
}

/**
 * CallExpression#callee: Union.U3<Super, Import, Expression>
 * extension function for create Union.U3<Super, Import, Expression> -> BooleanLiteralImpl
 */
fun CallExpression.booleanLiteral(block: BooleanLiteral.() -> Unit): BooleanLiteral {
    return BooleanLiteralImpl().apply(block)
}

/**
 * CallExpression#callee: Union.U3<Super, Import, Expression>
 * extension function for create Union.U3<Super, Import, Expression> -> NullLiteralImpl
 */
fun CallExpression.nullLiteral(block: NullLiteral.() -> Unit): NullLiteral {
    return NullLiteralImpl().apply(block)
}

/**
 * CallExpression#callee: Union.U3<Super, Import, Expression>
 * extension function for create Union.U3<Super, Import, Expression> -> NumericLiteralImpl
 */
fun CallExpression.numericLiteral(block: NumericLiteral.() -> Unit): NumericLiteral {
    return NumericLiteralImpl().apply(block)
}

/**
 * CallExpression#callee: Union.U3<Super, Import, Expression>
 * extension function for create Union.U3<Super, Import, Expression> -> BigIntLiteralImpl
 */
fun CallExpression.bigIntLiteral(block: BigIntLiteral.() -> Unit): BigIntLiteral {
    return BigIntLiteralImpl().apply(block)
}

/**
 * CallExpression#callee: Union.U3<Super, Import, Expression>
 * extension function for create Union.U3<Super, Import, Expression> -> RegExpLiteralImpl
 */
fun CallExpression.regExpLiteral(block: RegExpLiteral.() -> Unit): RegExpLiteral {
    return RegExpLiteralImpl().apply(block)
}

/**
 * CallExpression#callee: Union.U3<Super, Import, Expression>
 * extension function for create Union.U3<Super, Import, Expression> -> JSXTextImpl
 */
fun CallExpression.jSXText(block: JSXText.() -> Unit): JSXText {
    return JSXTextImpl().apply(block)
}

/**
 * CallExpression#callee: Union.U3<Super, Import, Expression>
 * extension function for create Union.U3<Super, Import, Expression> -> TemplateLiteralImpl
 */
fun CallExpression.templateLiteral(block: TemplateLiteral.() -> Unit): TemplateLiteral {
    return TemplateLiteralImpl().apply(block)
}

/**
 * CallExpression#callee: Union.U3<Super, Import, Expression>
 * extension function for create Union.U3<Super, Import, Expression> -> TaggedTemplateExpressionImpl
 */
fun CallExpression.taggedTemplateExpression(block: TaggedTemplateExpression.() -> Unit): TaggedTemplateExpression {
    return TaggedTemplateExpressionImpl().apply(block)
}

/**
 * CallExpression#callee: Union.U3<Super, Import, Expression>
 * extension function for create Union.U3<Super, Import, Expression> -> ArrowFunctionExpressionImpl
 */
fun CallExpression.arrowFunctionExpression(block: ArrowFunctionExpression.() -> Unit): ArrowFunctionExpression {
    return ArrowFunctionExpressionImpl().apply(block)
}

/**
 * CallExpression#callee: Union.U3<Super, Import, Expression>
 * extension function for create Union.U3<Super, Import, Expression> -> ClassExpressionImpl
 */
fun CallExpression.classExpression(block: ClassExpression.() -> Unit): ClassExpression {
    return ClassExpressionImpl().apply(block)
}

/**
 * CallExpression#callee: Union.U3<Super, Import, Expression>
 * extension function for create Union.U3<Super, Import, Expression> -> YieldExpressionImpl
 */
fun CallExpression.yieldExpression(block: YieldExpression.() -> Unit): YieldExpression {
    return YieldExpressionImpl().apply(block)
}

/**
 * CallExpression#callee: Union.U3<Super, Import, Expression>
 * extension function for create Union.U3<Super, Import, Expression> -> MetaPropertyImpl
 */
fun CallExpression.metaProperty(block: MetaProperty.() -> Unit): MetaProperty {
    return MetaPropertyImpl().apply(block)
}

/**
 * CallExpression#callee: Union.U3<Super, Import, Expression>
 * extension function for create Union.U3<Super, Import, Expression> -> AwaitExpressionImpl
 */
fun CallExpression.awaitExpression(block: AwaitExpression.() -> Unit): AwaitExpression {
    return AwaitExpressionImpl().apply(block)
}

/**
 * CallExpression#callee: Union.U3<Super, Import, Expression>
 * extension function for create Union.U3<Super, Import, Expression> -> ParenthesisExpressionImpl
 */
fun CallExpression.parenthesisExpression(block: ParenthesisExpression.() -> Unit): ParenthesisExpression {
    return ParenthesisExpressionImpl().apply(block)
}

/**
 * CallExpression#callee: Union.U3<Super, Import, Expression>
 * extension function for create Union.U3<Super, Import, Expression> -> JSXMemberExpressionImpl
 */
fun CallExpression.jSXMemberExpression(block: JSXMemberExpression.() -> Unit): JSXMemberExpression {
    return JSXMemberExpressionImpl().apply(block)
}

/**
 * CallExpression#callee: Union.U3<Super, Import, Expression>
 * extension function for create Union.U3<Super, Import, Expression> -> JSXNamespacedNameImpl
 */
fun CallExpression.jSXNamespacedName(block: JSXNamespacedName.() -> Unit): JSXNamespacedName {
    return JSXNamespacedNameImpl().apply(block)
}

/**
 * CallExpression#callee: Union.U3<Super, Import, Expression>
 * extension function for create Union.U3<Super, Import, Expression> -> JSXEmptyExpressionImpl
 */
fun CallExpression.jSXEmptyExpression(block: JSXEmptyExpression.() -> Unit): JSXEmptyExpression {
    return JSXEmptyExpressionImpl().apply(block)
}

/**
 * CallExpression#callee: Union.U3<Super, Import, Expression>
 * extension function for create Union.U3<Super, Import, Expression> -> JSXElementImpl
 */
fun CallExpression.jSXElement(block: JSXElement.() -> Unit): JSXElement {
    return JSXElementImpl().apply(block)
}

/**
 * CallExpression#callee: Union.U3<Super, Import, Expression>
 * extension function for create Union.U3<Super, Import, Expression> -> JSXFragmentImpl
 */
fun CallExpression.jSXFragment(block: JSXFragment.() -> Unit): JSXFragment {
    return JSXFragmentImpl().apply(block)
}

/**
 * CallExpression#callee: Union.U3<Super, Import, Expression>
 * extension function for create Union.U3<Super, Import, Expression> -> TsTypeAssertionImpl
 */
fun CallExpression.tsTypeAssertion(block: TsTypeAssertion.() -> Unit): TsTypeAssertion {
    return TsTypeAssertionImpl().apply(block)
}

/**
 * CallExpression#callee: Union.U3<Super, Import, Expression>
 * extension function for create Union.U3<Super, Import, Expression> -> TsConstAssertionImpl
 */
fun CallExpression.tsConstAssertion(block: TsConstAssertion.() -> Unit): TsConstAssertion {
    return TsConstAssertionImpl().apply(block)
}

/**
 * CallExpression#callee: Union.U3<Super, Import, Expression>
 * extension function for create Union.U3<Super, Import, Expression> -> TsNonNullExpressionImpl
 */
fun CallExpression.tsNonNullExpression(block: TsNonNullExpression.() -> Unit): TsNonNullExpression {
    return TsNonNullExpressionImpl().apply(block)
}

/**
 * CallExpression#callee: Union.U3<Super, Import, Expression>
 * extension function for create Union.U3<Super, Import, Expression> -> TsAsExpressionImpl
 */
fun CallExpression.tsAsExpression(block: TsAsExpression.() -> Unit): TsAsExpression {
    return TsAsExpressionImpl().apply(block)
}

/**
 * CallExpression#callee: Union.U3<Super, Import, Expression>
 * extension function for create Union.U3<Super, Import, Expression> -> TsSatisfiesExpressionImpl
 */
fun CallExpression.tsSatisfiesExpression(block: TsSatisfiesExpression.() -> Unit): TsSatisfiesExpression {
    return TsSatisfiesExpressionImpl().apply(block)
}

/**
 * CallExpression#callee: Union.U3<Super, Import, Expression>
 * extension function for create Union.U3<Super, Import, Expression> -> TsInstantiationImpl
 */
fun CallExpression.tsInstantiation(block: TsInstantiation.() -> Unit): TsInstantiation {
    return TsInstantiationImpl().apply(block)
}

/**
 * CallExpression#callee: Union.U3<Super, Import, Expression>
 * extension function for create Union.U3<Super, Import, Expression> -> PrivateNameImpl
 */
fun CallExpression.privateName(block: PrivateName.() -> Unit): PrivateName {
    return PrivateNameImpl().apply(block)
}

/**
 * CallExpression#callee: Union.U3<Super, Import, Expression>
 * extension function for create Union.U3<Super, Import, Expression> -> OptionalChainingExpressionImpl
 */
fun CallExpression.optionalChainingExpression(block: OptionalChainingExpression.() -> Unit): OptionalChainingExpression {
    return OptionalChainingExpressionImpl().apply(block)
}

/**
 * CallExpression#callee: Union.U3<Super, Import, Expression>
 * extension function for create Union.U3<Super, Import, Expression> -> InvalidImpl
 */
fun CallExpression.invalid(block: Invalid.() -> Unit): Invalid {
    return InvalidImpl().apply(block)
}

fun CallExpression.argument(block: Argument.() -> Unit): Argument {
    return Argument().apply(block)
}

/**
 * CallExpression#typeArguments: TsTypeParameterInstantiation
 * extension function for create TsTypeParameterInstantiation -> TsTypeParameterInstantiationImpl
 */
fun CallExpression.tsTypeParameterInstantiation(block: TsTypeParameterInstantiation.() -> Unit): TsTypeParameterInstantiation {
    return TsTypeParameterInstantiationImpl().apply(block)
}

fun CallExpression.span(block: Span.() -> Unit): Span {
    return Span().apply(block)
}
