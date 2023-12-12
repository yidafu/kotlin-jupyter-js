package dev.yidafu.swc.dsl

import dev.yidafu.swc.types.*

/**
 * IfStatement#test: Expression
 * extension function for create Expression -> ThisExpressionImpl
 */
fun IfStatement.thisExpression(block: ThisExpression.() -> Unit): ThisExpression {
    return ThisExpressionImpl().apply(block)
}

/**
 * IfStatement#test: Expression
 * extension function for create Expression -> ArrayExpressionImpl
 */
fun IfStatement.arrayExpression(block: ArrayExpression.() -> Unit): ArrayExpression {
    return ArrayExpressionImpl().apply(block)
}

/**
 * IfStatement#test: Expression
 * extension function for create Expression -> ObjectExpressionImpl
 */
fun IfStatement.objectExpression(block: ObjectExpression.() -> Unit): ObjectExpression {
    return ObjectExpressionImpl().apply(block)
}

/**
 * IfStatement#test: Expression
 * extension function for create Expression -> FunctionExpressionImpl
 */
fun IfStatement.functionExpression(block: FunctionExpression.() -> Unit): FunctionExpression {
    return FunctionExpressionImpl().apply(block)
}

/**
 * IfStatement#test: Expression
 * extension function for create Expression -> UnaryExpressionImpl
 */
fun IfStatement.unaryExpression(block: UnaryExpression.() -> Unit): UnaryExpression {
    return UnaryExpressionImpl().apply(block)
}

/**
 * IfStatement#test: Expression
 * extension function for create Expression -> UpdateExpressionImpl
 */
fun IfStatement.updateExpression(block: UpdateExpression.() -> Unit): UpdateExpression {
    return UpdateExpressionImpl().apply(block)
}

/**
 * IfStatement#test: Expression
 * extension function for create Expression -> BinaryExpressionImpl
 */
fun IfStatement.binaryExpression(block: BinaryExpression.() -> Unit): BinaryExpression {
    return BinaryExpressionImpl().apply(block)
}

/**
 * IfStatement#test: Expression
 * extension function for create Expression -> AssignmentExpressionImpl
 */
fun IfStatement.assignmentExpression(block: AssignmentExpression.() -> Unit): AssignmentExpression {
    return AssignmentExpressionImpl().apply(block)
}

/**
 * IfStatement#test: Expression
 * extension function for create Expression -> MemberExpressionImpl
 */
fun IfStatement.memberExpression(block: MemberExpression.() -> Unit): MemberExpression {
    return MemberExpressionImpl().apply(block)
}

/**
 * IfStatement#test: Expression
 * extension function for create Expression -> SuperPropExpressionImpl
 */
fun IfStatement.superPropExpression(block: SuperPropExpression.() -> Unit): SuperPropExpression {
    return SuperPropExpressionImpl().apply(block)
}

/**
 * IfStatement#test: Expression
 * extension function for create Expression -> ConditionalExpressionImpl
 */
fun IfStatement.conditionalExpression(block: ConditionalExpression.() -> Unit): ConditionalExpression {
    return ConditionalExpressionImpl().apply(block)
}

/**
 * IfStatement#test: Expression
 * extension function for create Expression -> CallExpressionImpl
 */
fun IfStatement.callExpression(block: CallExpression.() -> Unit): CallExpression {
    return CallExpressionImpl().apply(block)
}

/**
 * IfStatement#test: Expression
 * extension function for create Expression -> NewExpressionImpl
 */
fun IfStatement.newExpression(block: NewExpression.() -> Unit): NewExpression {
    return NewExpressionImpl().apply(block)
}

/**
 * IfStatement#test: Expression
 * extension function for create Expression -> SequenceExpressionImpl
 */
fun IfStatement.sequenceExpression(block: SequenceExpression.() -> Unit): SequenceExpression {
    return SequenceExpressionImpl().apply(block)
}

/**
 * IfStatement#test: Expression
 * extension function for create Expression -> IdentifierImpl
 */
fun IfStatement.identifier(block: Identifier.() -> Unit): Identifier {
    return IdentifierImpl().apply(block)
}

/**
 * IfStatement#test: Expression
 * extension function for create Expression -> StringLiteralImpl
 */
fun IfStatement.stringLiteral(block: StringLiteral.() -> Unit): StringLiteral {
    return StringLiteralImpl().apply(block)
}

/**
 * IfStatement#test: Expression
 * extension function for create Expression -> BooleanLiteralImpl
 */
fun IfStatement.booleanLiteral(block: BooleanLiteral.() -> Unit): BooleanLiteral {
    return BooleanLiteralImpl().apply(block)
}

/**
 * IfStatement#test: Expression
 * extension function for create Expression -> NullLiteralImpl
 */
fun IfStatement.nullLiteral(block: NullLiteral.() -> Unit): NullLiteral {
    return NullLiteralImpl().apply(block)
}

/**
 * IfStatement#test: Expression
 * extension function for create Expression -> NumericLiteralImpl
 */
fun IfStatement.numericLiteral(block: NumericLiteral.() -> Unit): NumericLiteral {
    return NumericLiteralImpl().apply(block)
}

/**
 * IfStatement#test: Expression
 * extension function for create Expression -> BigIntLiteralImpl
 */
fun IfStatement.bigIntLiteral(block: BigIntLiteral.() -> Unit): BigIntLiteral {
    return BigIntLiteralImpl().apply(block)
}

/**
 * IfStatement#test: Expression
 * extension function for create Expression -> RegExpLiteralImpl
 */
fun IfStatement.regExpLiteral(block: RegExpLiteral.() -> Unit): RegExpLiteral {
    return RegExpLiteralImpl().apply(block)
}

/**
 * IfStatement#test: Expression
 * extension function for create Expression -> JSXTextImpl
 */
fun IfStatement.jSXText(block: JSXText.() -> Unit): JSXText {
    return JSXTextImpl().apply(block)
}

/**
 * IfStatement#test: Expression
 * extension function for create Expression -> TemplateLiteralImpl
 */
fun IfStatement.templateLiteral(block: TemplateLiteral.() -> Unit): TemplateLiteral {
    return TemplateLiteralImpl().apply(block)
}

/**
 * IfStatement#test: Expression
 * extension function for create Expression -> TaggedTemplateExpressionImpl
 */
fun IfStatement.taggedTemplateExpression(block: TaggedTemplateExpression.() -> Unit): TaggedTemplateExpression {
    return TaggedTemplateExpressionImpl().apply(block)
}

/**
 * IfStatement#test: Expression
 * extension function for create Expression -> ArrowFunctionExpressionImpl
 */
fun IfStatement.arrowFunctionExpression(block: ArrowFunctionExpression.() -> Unit): ArrowFunctionExpression {
    return ArrowFunctionExpressionImpl().apply(block)
}

/**
 * IfStatement#test: Expression
 * extension function for create Expression -> ClassExpressionImpl
 */
fun IfStatement.classExpression(block: ClassExpression.() -> Unit): ClassExpression {
    return ClassExpressionImpl().apply(block)
}

/**
 * IfStatement#test: Expression
 * extension function for create Expression -> YieldExpressionImpl
 */
fun IfStatement.yieldExpression(block: YieldExpression.() -> Unit): YieldExpression {
    return YieldExpressionImpl().apply(block)
}

/**
 * IfStatement#test: Expression
 * extension function for create Expression -> MetaPropertyImpl
 */
fun IfStatement.metaProperty(block: MetaProperty.() -> Unit): MetaProperty {
    return MetaPropertyImpl().apply(block)
}

/**
 * IfStatement#test: Expression
 * extension function for create Expression -> AwaitExpressionImpl
 */
fun IfStatement.awaitExpression(block: AwaitExpression.() -> Unit): AwaitExpression {
    return AwaitExpressionImpl().apply(block)
}

/**
 * IfStatement#test: Expression
 * extension function for create Expression -> ParenthesisExpressionImpl
 */
fun IfStatement.parenthesisExpression(block: ParenthesisExpression.() -> Unit): ParenthesisExpression {
    return ParenthesisExpressionImpl().apply(block)
}

/**
 * IfStatement#test: Expression
 * extension function for create Expression -> JSXMemberExpressionImpl
 */
fun IfStatement.jSXMemberExpression(block: JSXMemberExpression.() -> Unit): JSXMemberExpression {
    return JSXMemberExpressionImpl().apply(block)
}

/**
 * IfStatement#test: Expression
 * extension function for create Expression -> JSXNamespacedNameImpl
 */
fun IfStatement.jSXNamespacedName(block: JSXNamespacedName.() -> Unit): JSXNamespacedName {
    return JSXNamespacedNameImpl().apply(block)
}

/**
 * IfStatement#test: Expression
 * extension function for create Expression -> JSXEmptyExpressionImpl
 */
fun IfStatement.jSXEmptyExpression(block: JSXEmptyExpression.() -> Unit): JSXEmptyExpression {
    return JSXEmptyExpressionImpl().apply(block)
}

/**
 * IfStatement#test: Expression
 * extension function for create Expression -> JSXElementImpl
 */
fun IfStatement.jSXElement(block: JSXElement.() -> Unit): JSXElement {
    return JSXElementImpl().apply(block)
}

/**
 * IfStatement#test: Expression
 * extension function for create Expression -> JSXFragmentImpl
 */
fun IfStatement.jSXFragment(block: JSXFragment.() -> Unit): JSXFragment {
    return JSXFragmentImpl().apply(block)
}

/**
 * IfStatement#test: Expression
 * extension function for create Expression -> TsTypeAssertionImpl
 */
fun IfStatement.tsTypeAssertion(block: TsTypeAssertion.() -> Unit): TsTypeAssertion {
    return TsTypeAssertionImpl().apply(block)
}

/**
 * IfStatement#test: Expression
 * extension function for create Expression -> TsConstAssertionImpl
 */
fun IfStatement.tsConstAssertion(block: TsConstAssertion.() -> Unit): TsConstAssertion {
    return TsConstAssertionImpl().apply(block)
}

/**
 * IfStatement#test: Expression
 * extension function for create Expression -> TsNonNullExpressionImpl
 */
fun IfStatement.tsNonNullExpression(block: TsNonNullExpression.() -> Unit): TsNonNullExpression {
    return TsNonNullExpressionImpl().apply(block)
}

/**
 * IfStatement#test: Expression
 * extension function for create Expression -> TsAsExpressionImpl
 */
fun IfStatement.tsAsExpression(block: TsAsExpression.() -> Unit): TsAsExpression {
    return TsAsExpressionImpl().apply(block)
}

/**
 * IfStatement#test: Expression
 * extension function for create Expression -> TsSatisfiesExpressionImpl
 */
fun IfStatement.tsSatisfiesExpression(block: TsSatisfiesExpression.() -> Unit): TsSatisfiesExpression {
    return TsSatisfiesExpressionImpl().apply(block)
}

/**
 * IfStatement#test: Expression
 * extension function for create Expression -> TsInstantiationImpl
 */
fun IfStatement.tsInstantiation(block: TsInstantiation.() -> Unit): TsInstantiation {
    return TsInstantiationImpl().apply(block)
}

/**
 * IfStatement#test: Expression
 * extension function for create Expression -> PrivateNameImpl
 */
fun IfStatement.privateName(block: PrivateName.() -> Unit): PrivateName {
    return PrivateNameImpl().apply(block)
}

/**
 * IfStatement#test: Expression
 * extension function for create Expression -> OptionalChainingExpressionImpl
 */
fun IfStatement.optionalChainingExpression(block: OptionalChainingExpression.() -> Unit): OptionalChainingExpression {
    return OptionalChainingExpressionImpl().apply(block)
}

/**
 * IfStatement#test: Expression
 * extension function for create Expression -> InvalidImpl
 */
fun IfStatement.invalid(block: Invalid.() -> Unit): Invalid {
    return InvalidImpl().apply(block)
}

/**
 * IfStatement#alternate: Statement
 * extension function for create Statement -> BlockStatementImpl
 */
fun IfStatement.blockStatement(block: BlockStatement.() -> Unit): BlockStatement {
    return BlockStatementImpl().apply(block)
}

/**
 * IfStatement#alternate: Statement
 * extension function for create Statement -> EmptyStatementImpl
 */
fun IfStatement.emptyStatement(block: EmptyStatement.() -> Unit): EmptyStatement {
    return EmptyStatementImpl().apply(block)
}

/**
 * IfStatement#alternate: Statement
 * extension function for create Statement -> DebuggerStatementImpl
 */
fun IfStatement.debuggerStatement(block: DebuggerStatement.() -> Unit): DebuggerStatement {
    return DebuggerStatementImpl().apply(block)
}

/**
 * IfStatement#alternate: Statement
 * extension function for create Statement -> WithStatementImpl
 */
fun IfStatement.withStatement(block: WithStatement.() -> Unit): WithStatement {
    return WithStatementImpl().apply(block)
}

/**
 * IfStatement#alternate: Statement
 * extension function for create Statement -> ReturnStatementImpl
 */
fun IfStatement.returnStatement(block: ReturnStatement.() -> Unit): ReturnStatement {
    return ReturnStatementImpl().apply(block)
}

/**
 * IfStatement#alternate: Statement
 * extension function for create Statement -> LabeledStatementImpl
 */
fun IfStatement.labeledStatement(block: LabeledStatement.() -> Unit): LabeledStatement {
    return LabeledStatementImpl().apply(block)
}

/**
 * IfStatement#alternate: Statement
 * extension function for create Statement -> BreakStatementImpl
 */
fun IfStatement.breakStatement(block: BreakStatement.() -> Unit): BreakStatement {
    return BreakStatementImpl().apply(block)
}

/**
 * IfStatement#alternate: Statement
 * extension function for create Statement -> ContinueStatementImpl
 */
fun IfStatement.continueStatement(block: ContinueStatement.() -> Unit): ContinueStatement {
    return ContinueStatementImpl().apply(block)
}

/**
 * IfStatement#alternate: Statement
 * extension function for create Statement -> SwitchStatementImpl
 */
fun IfStatement.switchStatement(block: SwitchStatement.() -> Unit): SwitchStatement {
    return SwitchStatementImpl().apply(block)
}

/**
 * IfStatement#alternate: Statement
 * extension function for create Statement -> ThrowStatementImpl
 */
fun IfStatement.throwStatement(block: ThrowStatement.() -> Unit): ThrowStatement {
    return ThrowStatementImpl().apply(block)
}

/**
 * IfStatement#alternate: Statement
 * extension function for create Statement -> TryStatementImpl
 */
fun IfStatement.tryStatement(block: TryStatement.() -> Unit): TryStatement {
    return TryStatementImpl().apply(block)
}

/**
 * IfStatement#alternate: Statement
 * extension function for create Statement -> WhileStatementImpl
 */
fun IfStatement.whileStatement(block: WhileStatement.() -> Unit): WhileStatement {
    return WhileStatementImpl().apply(block)
}

/**
 * IfStatement#alternate: Statement
 * extension function for create Statement -> DoWhileStatementImpl
 */
fun IfStatement.doWhileStatement(block: DoWhileStatement.() -> Unit): DoWhileStatement {
    return DoWhileStatementImpl().apply(block)
}

/**
 * IfStatement#alternate: Statement
 * extension function for create Statement -> ForStatementImpl
 */
fun IfStatement.forStatement(block: ForStatement.() -> Unit): ForStatement {
    return ForStatementImpl().apply(block)
}

/**
 * IfStatement#alternate: Statement
 * extension function for create Statement -> ForInStatementImpl
 */
fun IfStatement.forInStatement(block: ForInStatement.() -> Unit): ForInStatement {
    return ForInStatementImpl().apply(block)
}

/**
 * IfStatement#alternate: Statement
 * extension function for create Statement -> ForOfStatementImpl
 */
fun IfStatement.forOfStatement(block: ForOfStatement.() -> Unit): ForOfStatement {
    return ForOfStatementImpl().apply(block)
}

/**
 * IfStatement#alternate: Statement
 * extension function for create Statement -> ClassDeclarationImpl
 */
fun IfStatement.classDeclaration(block: ClassDeclaration.() -> Unit): ClassDeclaration {
    return ClassDeclarationImpl().apply(block)
}

/**
 * IfStatement#alternate: Statement
 * extension function for create Statement -> FunctionDeclarationImpl
 */
fun IfStatement.functionDeclaration(block: FunctionDeclaration.() -> Unit): FunctionDeclaration {
    return FunctionDeclarationImpl().apply(block)
}

/**
 * IfStatement#alternate: Statement
 * extension function for create Statement -> VariableDeclarationImpl
 */
fun IfStatement.variableDeclaration(block: VariableDeclaration.() -> Unit): VariableDeclaration {
    return VariableDeclarationImpl().apply(block)
}

/**
 * IfStatement#alternate: Statement
 * extension function for create Statement -> TsInterfaceDeclarationImpl
 */
fun IfStatement.tsInterfaceDeclaration(block: TsInterfaceDeclaration.() -> Unit): TsInterfaceDeclaration {
    return TsInterfaceDeclarationImpl().apply(block)
}

/**
 * IfStatement#alternate: Statement
 * extension function for create Statement -> TsTypeAliasDeclarationImpl
 */
fun IfStatement.tsTypeAliasDeclaration(block: TsTypeAliasDeclaration.() -> Unit): TsTypeAliasDeclaration {
    return TsTypeAliasDeclarationImpl().apply(block)
}

/**
 * IfStatement#alternate: Statement
 * extension function for create Statement -> TsEnumDeclarationImpl
 */
fun IfStatement.tsEnumDeclaration(block: TsEnumDeclaration.() -> Unit): TsEnumDeclaration {
    return TsEnumDeclarationImpl().apply(block)
}

/**
 * IfStatement#alternate: Statement
 * extension function for create Statement -> TsModuleDeclarationImpl
 */
fun IfStatement.tsModuleDeclaration(block: TsModuleDeclaration.() -> Unit): TsModuleDeclaration {
    return TsModuleDeclarationImpl().apply(block)
}

/**
 * IfStatement#alternate: Statement
 * extension function for create Statement -> ExpressionStatementImpl
 */
fun IfStatement.expressionStatement(block: ExpressionStatement.() -> Unit): ExpressionStatement {
    return ExpressionStatementImpl().apply(block)
}

fun IfStatement.span(block: Span.() -> Unit): Span {
    return Span().apply(block)
}
