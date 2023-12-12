package dev.yidafu.swc.dsl

import dev.yidafu.swc.types.*

/**
 * WhileStatement#test: Expression
 * extension function for create Expression -> ThisExpressionImpl
 */
fun WhileStatement.thisExpression(block: ThisExpression.() -> Unit): ThisExpression {
    return ThisExpressionImpl().apply(block)
}

/**
 * WhileStatement#test: Expression
 * extension function for create Expression -> ArrayExpressionImpl
 */
fun WhileStatement.arrayExpression(block: ArrayExpression.() -> Unit): ArrayExpression {
    return ArrayExpressionImpl().apply(block)
}

/**
 * WhileStatement#test: Expression
 * extension function for create Expression -> ObjectExpressionImpl
 */
fun WhileStatement.objectExpression(block: ObjectExpression.() -> Unit): ObjectExpression {
    return ObjectExpressionImpl().apply(block)
}

/**
 * WhileStatement#test: Expression
 * extension function for create Expression -> FunctionExpressionImpl
 */
fun WhileStatement.functionExpression(block: FunctionExpression.() -> Unit): FunctionExpression {
    return FunctionExpressionImpl().apply(block)
}

/**
 * WhileStatement#test: Expression
 * extension function for create Expression -> UnaryExpressionImpl
 */
fun WhileStatement.unaryExpression(block: UnaryExpression.() -> Unit): UnaryExpression {
    return UnaryExpressionImpl().apply(block)
}

/**
 * WhileStatement#test: Expression
 * extension function for create Expression -> UpdateExpressionImpl
 */
fun WhileStatement.updateExpression(block: UpdateExpression.() -> Unit): UpdateExpression {
    return UpdateExpressionImpl().apply(block)
}

/**
 * WhileStatement#test: Expression
 * extension function for create Expression -> BinaryExpressionImpl
 */
fun WhileStatement.binaryExpression(block: BinaryExpression.() -> Unit): BinaryExpression {
    return BinaryExpressionImpl().apply(block)
}

/**
 * WhileStatement#test: Expression
 * extension function for create Expression -> AssignmentExpressionImpl
 */
fun WhileStatement.assignmentExpression(block: AssignmentExpression.() -> Unit): AssignmentExpression {
    return AssignmentExpressionImpl().apply(block)
}

/**
 * WhileStatement#test: Expression
 * extension function for create Expression -> MemberExpressionImpl
 */
fun WhileStatement.memberExpression(block: MemberExpression.() -> Unit): MemberExpression {
    return MemberExpressionImpl().apply(block)
}

/**
 * WhileStatement#test: Expression
 * extension function for create Expression -> SuperPropExpressionImpl
 */
fun WhileStatement.superPropExpression(block: SuperPropExpression.() -> Unit): SuperPropExpression {
    return SuperPropExpressionImpl().apply(block)
}

/**
 * WhileStatement#test: Expression
 * extension function for create Expression -> ConditionalExpressionImpl
 */
fun WhileStatement.conditionalExpression(block: ConditionalExpression.() -> Unit): ConditionalExpression {
    return ConditionalExpressionImpl().apply(block)
}

/**
 * WhileStatement#test: Expression
 * extension function for create Expression -> CallExpressionImpl
 */
fun WhileStatement.callExpression(block: CallExpression.() -> Unit): CallExpression {
    return CallExpressionImpl().apply(block)
}

/**
 * WhileStatement#test: Expression
 * extension function for create Expression -> NewExpressionImpl
 */
fun WhileStatement.newExpression(block: NewExpression.() -> Unit): NewExpression {
    return NewExpressionImpl().apply(block)
}

/**
 * WhileStatement#test: Expression
 * extension function for create Expression -> SequenceExpressionImpl
 */
fun WhileStatement.sequenceExpression(block: SequenceExpression.() -> Unit): SequenceExpression {
    return SequenceExpressionImpl().apply(block)
}

/**
 * WhileStatement#test: Expression
 * extension function for create Expression -> IdentifierImpl
 */
fun WhileStatement.identifier(block: Identifier.() -> Unit): Identifier {
    return IdentifierImpl().apply(block)
}

/**
 * WhileStatement#test: Expression
 * extension function for create Expression -> StringLiteralImpl
 */
fun WhileStatement.stringLiteral(block: StringLiteral.() -> Unit): StringLiteral {
    return StringLiteralImpl().apply(block)
}

/**
 * WhileStatement#test: Expression
 * extension function for create Expression -> BooleanLiteralImpl
 */
fun WhileStatement.booleanLiteral(block: BooleanLiteral.() -> Unit): BooleanLiteral {
    return BooleanLiteralImpl().apply(block)
}

/**
 * WhileStatement#test: Expression
 * extension function for create Expression -> NullLiteralImpl
 */
fun WhileStatement.nullLiteral(block: NullLiteral.() -> Unit): NullLiteral {
    return NullLiteralImpl().apply(block)
}

/**
 * WhileStatement#test: Expression
 * extension function for create Expression -> NumericLiteralImpl
 */
fun WhileStatement.numericLiteral(block: NumericLiteral.() -> Unit): NumericLiteral {
    return NumericLiteralImpl().apply(block)
}

/**
 * WhileStatement#test: Expression
 * extension function for create Expression -> BigIntLiteralImpl
 */
fun WhileStatement.bigIntLiteral(block: BigIntLiteral.() -> Unit): BigIntLiteral {
    return BigIntLiteralImpl().apply(block)
}

/**
 * WhileStatement#test: Expression
 * extension function for create Expression -> RegExpLiteralImpl
 */
fun WhileStatement.regExpLiteral(block: RegExpLiteral.() -> Unit): RegExpLiteral {
    return RegExpLiteralImpl().apply(block)
}

/**
 * WhileStatement#test: Expression
 * extension function for create Expression -> JSXTextImpl
 */
fun WhileStatement.jSXText(block: JSXText.() -> Unit): JSXText {
    return JSXTextImpl().apply(block)
}

/**
 * WhileStatement#test: Expression
 * extension function for create Expression -> TemplateLiteralImpl
 */
fun WhileStatement.templateLiteral(block: TemplateLiteral.() -> Unit): TemplateLiteral {
    return TemplateLiteralImpl().apply(block)
}

/**
 * WhileStatement#test: Expression
 * extension function for create Expression -> TaggedTemplateExpressionImpl
 */
fun WhileStatement.taggedTemplateExpression(block: TaggedTemplateExpression.() -> Unit): TaggedTemplateExpression {
    return TaggedTemplateExpressionImpl().apply(block)
}

/**
 * WhileStatement#test: Expression
 * extension function for create Expression -> ArrowFunctionExpressionImpl
 */
fun WhileStatement.arrowFunctionExpression(block: ArrowFunctionExpression.() -> Unit): ArrowFunctionExpression {
    return ArrowFunctionExpressionImpl().apply(block)
}

/**
 * WhileStatement#test: Expression
 * extension function for create Expression -> ClassExpressionImpl
 */
fun WhileStatement.classExpression(block: ClassExpression.() -> Unit): ClassExpression {
    return ClassExpressionImpl().apply(block)
}

/**
 * WhileStatement#test: Expression
 * extension function for create Expression -> YieldExpressionImpl
 */
fun WhileStatement.yieldExpression(block: YieldExpression.() -> Unit): YieldExpression {
    return YieldExpressionImpl().apply(block)
}

/**
 * WhileStatement#test: Expression
 * extension function for create Expression -> MetaPropertyImpl
 */
fun WhileStatement.metaProperty(block: MetaProperty.() -> Unit): MetaProperty {
    return MetaPropertyImpl().apply(block)
}

/**
 * WhileStatement#test: Expression
 * extension function for create Expression -> AwaitExpressionImpl
 */
fun WhileStatement.awaitExpression(block: AwaitExpression.() -> Unit): AwaitExpression {
    return AwaitExpressionImpl().apply(block)
}

/**
 * WhileStatement#test: Expression
 * extension function for create Expression -> ParenthesisExpressionImpl
 */
fun WhileStatement.parenthesisExpression(block: ParenthesisExpression.() -> Unit): ParenthesisExpression {
    return ParenthesisExpressionImpl().apply(block)
}

/**
 * WhileStatement#test: Expression
 * extension function for create Expression -> JSXMemberExpressionImpl
 */
fun WhileStatement.jSXMemberExpression(block: JSXMemberExpression.() -> Unit): JSXMemberExpression {
    return JSXMemberExpressionImpl().apply(block)
}

/**
 * WhileStatement#test: Expression
 * extension function for create Expression -> JSXNamespacedNameImpl
 */
fun WhileStatement.jSXNamespacedName(block: JSXNamespacedName.() -> Unit): JSXNamespacedName {
    return JSXNamespacedNameImpl().apply(block)
}

/**
 * WhileStatement#test: Expression
 * extension function for create Expression -> JSXEmptyExpressionImpl
 */
fun WhileStatement.jSXEmptyExpression(block: JSXEmptyExpression.() -> Unit): JSXEmptyExpression {
    return JSXEmptyExpressionImpl().apply(block)
}

/**
 * WhileStatement#test: Expression
 * extension function for create Expression -> JSXElementImpl
 */
fun WhileStatement.jSXElement(block: JSXElement.() -> Unit): JSXElement {
    return JSXElementImpl().apply(block)
}

/**
 * WhileStatement#test: Expression
 * extension function for create Expression -> JSXFragmentImpl
 */
fun WhileStatement.jSXFragment(block: JSXFragment.() -> Unit): JSXFragment {
    return JSXFragmentImpl().apply(block)
}

/**
 * WhileStatement#test: Expression
 * extension function for create Expression -> TsTypeAssertionImpl
 */
fun WhileStatement.tsTypeAssertion(block: TsTypeAssertion.() -> Unit): TsTypeAssertion {
    return TsTypeAssertionImpl().apply(block)
}

/**
 * WhileStatement#test: Expression
 * extension function for create Expression -> TsConstAssertionImpl
 */
fun WhileStatement.tsConstAssertion(block: TsConstAssertion.() -> Unit): TsConstAssertion {
    return TsConstAssertionImpl().apply(block)
}

/**
 * WhileStatement#test: Expression
 * extension function for create Expression -> TsNonNullExpressionImpl
 */
fun WhileStatement.tsNonNullExpression(block: TsNonNullExpression.() -> Unit): TsNonNullExpression {
    return TsNonNullExpressionImpl().apply(block)
}

/**
 * WhileStatement#test: Expression
 * extension function for create Expression -> TsAsExpressionImpl
 */
fun WhileStatement.tsAsExpression(block: TsAsExpression.() -> Unit): TsAsExpression {
    return TsAsExpressionImpl().apply(block)
}

/**
 * WhileStatement#test: Expression
 * extension function for create Expression -> TsSatisfiesExpressionImpl
 */
fun WhileStatement.tsSatisfiesExpression(block: TsSatisfiesExpression.() -> Unit): TsSatisfiesExpression {
    return TsSatisfiesExpressionImpl().apply(block)
}

/**
 * WhileStatement#test: Expression
 * extension function for create Expression -> TsInstantiationImpl
 */
fun WhileStatement.tsInstantiation(block: TsInstantiation.() -> Unit): TsInstantiation {
    return TsInstantiationImpl().apply(block)
}

/**
 * WhileStatement#test: Expression
 * extension function for create Expression -> PrivateNameImpl
 */
fun WhileStatement.privateName(block: PrivateName.() -> Unit): PrivateName {
    return PrivateNameImpl().apply(block)
}

/**
 * WhileStatement#test: Expression
 * extension function for create Expression -> OptionalChainingExpressionImpl
 */
fun WhileStatement.optionalChainingExpression(block: OptionalChainingExpression.() -> Unit): OptionalChainingExpression {
    return OptionalChainingExpressionImpl().apply(block)
}

/**
 * WhileStatement#test: Expression
 * extension function for create Expression -> InvalidImpl
 */
fun WhileStatement.invalid(block: Invalid.() -> Unit): Invalid {
    return InvalidImpl().apply(block)
}

/**
 * WhileStatement#body: Statement
 * extension function for create Statement -> BlockStatementImpl
 */
fun WhileStatement.blockStatement(block: BlockStatement.() -> Unit): BlockStatement {
    return BlockStatementImpl().apply(block)
}

/**
 * WhileStatement#body: Statement
 * extension function for create Statement -> EmptyStatementImpl
 */
fun WhileStatement.emptyStatement(block: EmptyStatement.() -> Unit): EmptyStatement {
    return EmptyStatementImpl().apply(block)
}

/**
 * WhileStatement#body: Statement
 * extension function for create Statement -> DebuggerStatementImpl
 */
fun WhileStatement.debuggerStatement(block: DebuggerStatement.() -> Unit): DebuggerStatement {
    return DebuggerStatementImpl().apply(block)
}

/**
 * WhileStatement#body: Statement
 * extension function for create Statement -> WithStatementImpl
 */
fun WhileStatement.withStatement(block: WithStatement.() -> Unit): WithStatement {
    return WithStatementImpl().apply(block)
}

/**
 * WhileStatement#body: Statement
 * extension function for create Statement -> ReturnStatementImpl
 */
fun WhileStatement.returnStatement(block: ReturnStatement.() -> Unit): ReturnStatement {
    return ReturnStatementImpl().apply(block)
}

/**
 * WhileStatement#body: Statement
 * extension function for create Statement -> LabeledStatementImpl
 */
fun WhileStatement.labeledStatement(block: LabeledStatement.() -> Unit): LabeledStatement {
    return LabeledStatementImpl().apply(block)
}

/**
 * WhileStatement#body: Statement
 * extension function for create Statement -> BreakStatementImpl
 */
fun WhileStatement.breakStatement(block: BreakStatement.() -> Unit): BreakStatement {
    return BreakStatementImpl().apply(block)
}

/**
 * WhileStatement#body: Statement
 * extension function for create Statement -> ContinueStatementImpl
 */
fun WhileStatement.continueStatement(block: ContinueStatement.() -> Unit): ContinueStatement {
    return ContinueStatementImpl().apply(block)
}

/**
 * WhileStatement#body: Statement
 * extension function for create Statement -> IfStatementImpl
 */
fun WhileStatement.ifStatement(block: IfStatement.() -> Unit): IfStatement {
    return IfStatementImpl().apply(block)
}

/**
 * WhileStatement#body: Statement
 * extension function for create Statement -> SwitchStatementImpl
 */
fun WhileStatement.switchStatement(block: SwitchStatement.() -> Unit): SwitchStatement {
    return SwitchStatementImpl().apply(block)
}

/**
 * WhileStatement#body: Statement
 * extension function for create Statement -> ThrowStatementImpl
 */
fun WhileStatement.throwStatement(block: ThrowStatement.() -> Unit): ThrowStatement {
    return ThrowStatementImpl().apply(block)
}

/**
 * WhileStatement#body: Statement
 * extension function for create Statement -> TryStatementImpl
 */
fun WhileStatement.tryStatement(block: TryStatement.() -> Unit): TryStatement {
    return TryStatementImpl().apply(block)
}

/**
 * WhileStatement#body: Statement
 * extension function for create Statement -> DoWhileStatementImpl
 */
fun WhileStatement.doWhileStatement(block: DoWhileStatement.() -> Unit): DoWhileStatement {
    return DoWhileStatementImpl().apply(block)
}

/**
 * WhileStatement#body: Statement
 * extension function for create Statement -> ForStatementImpl
 */
fun WhileStatement.forStatement(block: ForStatement.() -> Unit): ForStatement {
    return ForStatementImpl().apply(block)
}

/**
 * WhileStatement#body: Statement
 * extension function for create Statement -> ForInStatementImpl
 */
fun WhileStatement.forInStatement(block: ForInStatement.() -> Unit): ForInStatement {
    return ForInStatementImpl().apply(block)
}

/**
 * WhileStatement#body: Statement
 * extension function for create Statement -> ForOfStatementImpl
 */
fun WhileStatement.forOfStatement(block: ForOfStatement.() -> Unit): ForOfStatement {
    return ForOfStatementImpl().apply(block)
}

/**
 * WhileStatement#body: Statement
 * extension function for create Statement -> ClassDeclarationImpl
 */
fun WhileStatement.classDeclaration(block: ClassDeclaration.() -> Unit): ClassDeclaration {
    return ClassDeclarationImpl().apply(block)
}

/**
 * WhileStatement#body: Statement
 * extension function for create Statement -> FunctionDeclarationImpl
 */
fun WhileStatement.functionDeclaration(block: FunctionDeclaration.() -> Unit): FunctionDeclaration {
    return FunctionDeclarationImpl().apply(block)
}

/**
 * WhileStatement#body: Statement
 * extension function for create Statement -> VariableDeclarationImpl
 */
fun WhileStatement.variableDeclaration(block: VariableDeclaration.() -> Unit): VariableDeclaration {
    return VariableDeclarationImpl().apply(block)
}

/**
 * WhileStatement#body: Statement
 * extension function for create Statement -> TsInterfaceDeclarationImpl
 */
fun WhileStatement.tsInterfaceDeclaration(block: TsInterfaceDeclaration.() -> Unit): TsInterfaceDeclaration {
    return TsInterfaceDeclarationImpl().apply(block)
}

/**
 * WhileStatement#body: Statement
 * extension function for create Statement -> TsTypeAliasDeclarationImpl
 */
fun WhileStatement.tsTypeAliasDeclaration(block: TsTypeAliasDeclaration.() -> Unit): TsTypeAliasDeclaration {
    return TsTypeAliasDeclarationImpl().apply(block)
}

/**
 * WhileStatement#body: Statement
 * extension function for create Statement -> TsEnumDeclarationImpl
 */
fun WhileStatement.tsEnumDeclaration(block: TsEnumDeclaration.() -> Unit): TsEnumDeclaration {
    return TsEnumDeclarationImpl().apply(block)
}

/**
 * WhileStatement#body: Statement
 * extension function for create Statement -> TsModuleDeclarationImpl
 */
fun WhileStatement.tsModuleDeclaration(block: TsModuleDeclaration.() -> Unit): TsModuleDeclaration {
    return TsModuleDeclarationImpl().apply(block)
}

/**
 * WhileStatement#body: Statement
 * extension function for create Statement -> ExpressionStatementImpl
 */
fun WhileStatement.expressionStatement(block: ExpressionStatement.() -> Unit): ExpressionStatement {
    return ExpressionStatementImpl().apply(block)
}

fun WhileStatement.span(block: Span.() -> Unit): Span {
    return Span().apply(block)
}
