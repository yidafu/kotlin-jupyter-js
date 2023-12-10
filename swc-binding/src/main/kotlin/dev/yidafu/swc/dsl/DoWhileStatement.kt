package dev.yidafu.swc.dsl

import dev.yidafu.swc.types.*

/**
 * DoWhileStatement#test: Expression
 * extension function for create Expression -> ThisExpressionImpl
 */
fun DoWhileStatement.thisExpression(block: ThisExpression.() -> Unit): ThisExpression {
    return ThisExpressionImpl().apply(block)
}

/**
 * DoWhileStatement#test: Expression
 * extension function for create Expression -> ArrayExpressionImpl
 */
fun DoWhileStatement.arrayExpression(block: ArrayExpression.() -> Unit): ArrayExpression {
    return ArrayExpressionImpl().apply(block)
}

/**
 * DoWhileStatement#test: Expression
 * extension function for create Expression -> ObjectExpressionImpl
 */
fun DoWhileStatement.objectExpression(block: ObjectExpression.() -> Unit): ObjectExpression {
    return ObjectExpressionImpl().apply(block)
}

/**
 * DoWhileStatement#test: Expression
 * extension function for create Expression -> FunctionExpressionImpl
 */
fun DoWhileStatement.functionExpression(block: FunctionExpression.() -> Unit): FunctionExpression {
    return FunctionExpressionImpl().apply(block)
}

/**
 * DoWhileStatement#test: Expression
 * extension function for create Expression -> UnaryExpressionImpl
 */
fun DoWhileStatement.unaryExpression(block: UnaryExpression.() -> Unit): UnaryExpression {
    return UnaryExpressionImpl().apply(block)
}

/**
 * DoWhileStatement#test: Expression
 * extension function for create Expression -> UpdateExpressionImpl
 */
fun DoWhileStatement.updateExpression(block: UpdateExpression.() -> Unit): UpdateExpression {
    return UpdateExpressionImpl().apply(block)
}

/**
 * DoWhileStatement#test: Expression
 * extension function for create Expression -> BinaryExpressionImpl
 */
fun DoWhileStatement.binaryExpression(block: BinaryExpression.() -> Unit): BinaryExpression {
    return BinaryExpressionImpl().apply(block)
}

/**
 * DoWhileStatement#test: Expression
 * extension function for create Expression -> AssignmentExpressionImpl
 */
fun DoWhileStatement.assignmentExpression(block: AssignmentExpression.() -> Unit): AssignmentExpression {
    return AssignmentExpressionImpl().apply(block)
}

/**
 * DoWhileStatement#test: Expression
 * extension function for create Expression -> MemberExpressionImpl
 */
fun DoWhileStatement.memberExpression(block: MemberExpression.() -> Unit): MemberExpression {
    return MemberExpressionImpl().apply(block)
}

/**
 * DoWhileStatement#test: Expression
 * extension function for create Expression -> SuperPropExpressionImpl
 */
fun DoWhileStatement.superPropExpression(block: SuperPropExpression.() -> Unit): SuperPropExpression {
    return SuperPropExpressionImpl().apply(block)
}

/**
 * DoWhileStatement#test: Expression
 * extension function for create Expression -> ConditionalExpressionImpl
 */
fun DoWhileStatement.conditionalExpression(block: ConditionalExpression.() -> Unit): ConditionalExpression {
    return ConditionalExpressionImpl().apply(block)
}

/**
 * DoWhileStatement#test: Expression
 * extension function for create Expression -> CallExpressionImpl
 */
fun DoWhileStatement.callExpression(block: CallExpression.() -> Unit): CallExpression {
    return CallExpressionImpl().apply(block)
}

/**
 * DoWhileStatement#test: Expression
 * extension function for create Expression -> NewExpressionImpl
 */
fun DoWhileStatement.newExpression(block: NewExpression.() -> Unit): NewExpression {
    return NewExpressionImpl().apply(block)
}

/**
 * DoWhileStatement#test: Expression
 * extension function for create Expression -> SequenceExpressionImpl
 */
fun DoWhileStatement.sequenceExpression(block: SequenceExpression.() -> Unit): SequenceExpression {
    return SequenceExpressionImpl().apply(block)
}

/**
 * DoWhileStatement#test: Expression
 * extension function for create Expression -> IdentifierImpl
 */
fun DoWhileStatement.identifier(block: Identifier.() -> Unit): Identifier {
    return IdentifierImpl().apply(block)
}

/**
 * DoWhileStatement#test: Expression
 * extension function for create Expression -> StringLiteralImpl
 */
fun DoWhileStatement.stringLiteral(block: StringLiteral.() -> Unit): StringLiteral {
    return StringLiteralImpl().apply(block)
}

/**
 * DoWhileStatement#test: Expression
 * extension function for create Expression -> BooleanLiteralImpl
 */
fun DoWhileStatement.booleanLiteral(block: BooleanLiteral.() -> Unit): BooleanLiteral {
    return BooleanLiteralImpl().apply(block)
}

/**
 * DoWhileStatement#test: Expression
 * extension function for create Expression -> NullLiteralImpl
 */
fun DoWhileStatement.nullLiteral(block: NullLiteral.() -> Unit): NullLiteral {
    return NullLiteralImpl().apply(block)
}

/**
 * DoWhileStatement#test: Expression
 * extension function for create Expression -> NumericLiteralImpl
 */
fun DoWhileStatement.numericLiteral(block: NumericLiteral.() -> Unit): NumericLiteral {
    return NumericLiteralImpl().apply(block)
}

/**
 * DoWhileStatement#test: Expression
 * extension function for create Expression -> BigIntLiteralImpl
 */
fun DoWhileStatement.bigIntLiteral(block: BigIntLiteral.() -> Unit): BigIntLiteral {
    return BigIntLiteralImpl().apply(block)
}

/**
 * DoWhileStatement#test: Expression
 * extension function for create Expression -> RegExpLiteralImpl
 */
fun DoWhileStatement.regExpLiteral(block: RegExpLiteral.() -> Unit): RegExpLiteral {
    return RegExpLiteralImpl().apply(block)
}

/**
 * DoWhileStatement#test: Expression
 * extension function for create Expression -> JSXTextImpl
 */
fun DoWhileStatement.jSXText(block: JSXText.() -> Unit): JSXText {
    return JSXTextImpl().apply(block)
}

/**
 * DoWhileStatement#test: Expression
 * extension function for create Expression -> TemplateLiteralImpl
 */
fun DoWhileStatement.templateLiteral(block: TemplateLiteral.() -> Unit): TemplateLiteral {
    return TemplateLiteralImpl().apply(block)
}

/**
 * DoWhileStatement#test: Expression
 * extension function for create Expression -> TaggedTemplateExpressionImpl
 */
fun DoWhileStatement.taggedTemplateExpression(block: TaggedTemplateExpression.() -> Unit): TaggedTemplateExpression {
    return TaggedTemplateExpressionImpl().apply(block)
}

/**
 * DoWhileStatement#test: Expression
 * extension function for create Expression -> ArrowFunctionExpressionImpl
 */
fun DoWhileStatement.arrowFunctionExpression(block: ArrowFunctionExpression.() -> Unit): ArrowFunctionExpression {
    return ArrowFunctionExpressionImpl().apply(block)
}

/**
 * DoWhileStatement#test: Expression
 * extension function for create Expression -> ClassExpressionImpl
 */
fun DoWhileStatement.classExpression(block: ClassExpression.() -> Unit): ClassExpression {
    return ClassExpressionImpl().apply(block)
}

/**
 * DoWhileStatement#test: Expression
 * extension function for create Expression -> YieldExpressionImpl
 */
fun DoWhileStatement.yieldExpression(block: YieldExpression.() -> Unit): YieldExpression {
    return YieldExpressionImpl().apply(block)
}

/**
 * DoWhileStatement#test: Expression
 * extension function for create Expression -> MetaPropertyImpl
 */
fun DoWhileStatement.metaProperty(block: MetaProperty.() -> Unit): MetaProperty {
    return MetaPropertyImpl().apply(block)
}

/**
 * DoWhileStatement#test: Expression
 * extension function for create Expression -> AwaitExpressionImpl
 */
fun DoWhileStatement.awaitExpression(block: AwaitExpression.() -> Unit): AwaitExpression {
    return AwaitExpressionImpl().apply(block)
}

/**
 * DoWhileStatement#test: Expression
 * extension function for create Expression -> ParenthesisExpressionImpl
 */
fun DoWhileStatement.parenthesisExpression(block: ParenthesisExpression.() -> Unit): ParenthesisExpression {
    return ParenthesisExpressionImpl().apply(block)
}

/**
 * DoWhileStatement#test: Expression
 * extension function for create Expression -> JSXMemberExpressionImpl
 */
fun DoWhileStatement.jSXMemberExpression(block: JSXMemberExpression.() -> Unit): JSXMemberExpression {
    return JSXMemberExpressionImpl().apply(block)
}

/**
 * DoWhileStatement#test: Expression
 * extension function for create Expression -> JSXNamespacedNameImpl
 */
fun DoWhileStatement.jSXNamespacedName(block: JSXNamespacedName.() -> Unit): JSXNamespacedName {
    return JSXNamespacedNameImpl().apply(block)
}

/**
 * DoWhileStatement#test: Expression
 * extension function for create Expression -> JSXEmptyExpressionImpl
 */
fun DoWhileStatement.jSXEmptyExpression(block: JSXEmptyExpression.() -> Unit): JSXEmptyExpression {
    return JSXEmptyExpressionImpl().apply(block)
}

/**
 * DoWhileStatement#test: Expression
 * extension function for create Expression -> JSXElementImpl
 */
fun DoWhileStatement.jSXElement(block: JSXElement.() -> Unit): JSXElement {
    return JSXElementImpl().apply(block)
}

/**
 * DoWhileStatement#test: Expression
 * extension function for create Expression -> JSXFragmentImpl
 */
fun DoWhileStatement.jSXFragment(block: JSXFragment.() -> Unit): JSXFragment {
    return JSXFragmentImpl().apply(block)
}

/**
 * DoWhileStatement#test: Expression
 * extension function for create Expression -> TsTypeAssertionImpl
 */
fun DoWhileStatement.tsTypeAssertion(block: TsTypeAssertion.() -> Unit): TsTypeAssertion {
    return TsTypeAssertionImpl().apply(block)
}

/**
 * DoWhileStatement#test: Expression
 * extension function for create Expression -> TsConstAssertionImpl
 */
fun DoWhileStatement.tsConstAssertion(block: TsConstAssertion.() -> Unit): TsConstAssertion {
    return TsConstAssertionImpl().apply(block)
}

/**
 * DoWhileStatement#test: Expression
 * extension function for create Expression -> TsNonNullExpressionImpl
 */
fun DoWhileStatement.tsNonNullExpression(block: TsNonNullExpression.() -> Unit): TsNonNullExpression {
    return TsNonNullExpressionImpl().apply(block)
}

/**
 * DoWhileStatement#test: Expression
 * extension function for create Expression -> TsAsExpressionImpl
 */
fun DoWhileStatement.tsAsExpression(block: TsAsExpression.() -> Unit): TsAsExpression {
    return TsAsExpressionImpl().apply(block)
}

/**
 * DoWhileStatement#test: Expression
 * extension function for create Expression -> TsSatisfiesExpressionImpl
 */
fun DoWhileStatement.tsSatisfiesExpression(block: TsSatisfiesExpression.() -> Unit): TsSatisfiesExpression {
    return TsSatisfiesExpressionImpl().apply(block)
}

/**
 * DoWhileStatement#test: Expression
 * extension function for create Expression -> TsInstantiationImpl
 */
fun DoWhileStatement.tsInstantiation(block: TsInstantiation.() -> Unit): TsInstantiation {
    return TsInstantiationImpl().apply(block)
}

/**
 * DoWhileStatement#test: Expression
 * extension function for create Expression -> PrivateNameImpl
 */
fun DoWhileStatement.privateName(block: PrivateName.() -> Unit): PrivateName {
    return PrivateNameImpl().apply(block)
}

/**
 * DoWhileStatement#test: Expression
 * extension function for create Expression -> OptionalChainingExpressionImpl
 */
fun DoWhileStatement.optionalChainingExpression(block: OptionalChainingExpression.() -> Unit): OptionalChainingExpression {
    return OptionalChainingExpressionImpl().apply(block)
}

/**
 * DoWhileStatement#test: Expression
 * extension function for create Expression -> InvalidImpl
 */
fun DoWhileStatement.invalid(block: Invalid.() -> Unit): Invalid {
    return InvalidImpl().apply(block)
}

/**
 * DoWhileStatement#body: Statement
 * extension function for create Statement -> BlockStatementImpl
 */
fun DoWhileStatement.blockStatement(block: BlockStatement.() -> Unit): BlockStatement {
    return BlockStatementImpl().apply(block)
}

/**
 * DoWhileStatement#body: Statement
 * extension function for create Statement -> EmptyStatementImpl
 */
fun DoWhileStatement.emptyStatement(block: EmptyStatement.() -> Unit): EmptyStatement {
    return EmptyStatementImpl().apply(block)
}

/**
 * DoWhileStatement#body: Statement
 * extension function for create Statement -> DebuggerStatementImpl
 */
fun DoWhileStatement.debuggerStatement(block: DebuggerStatement.() -> Unit): DebuggerStatement {
    return DebuggerStatementImpl().apply(block)
}

/**
 * DoWhileStatement#body: Statement
 * extension function for create Statement -> WithStatementImpl
 */
fun DoWhileStatement.withStatement(block: WithStatement.() -> Unit): WithStatement {
    return WithStatementImpl().apply(block)
}

/**
 * DoWhileStatement#body: Statement
 * extension function for create Statement -> ReturnStatementImpl
 */
fun DoWhileStatement.returnStatement(block: ReturnStatement.() -> Unit): ReturnStatement {
    return ReturnStatementImpl().apply(block)
}

/**
 * DoWhileStatement#body: Statement
 * extension function for create Statement -> LabeledStatementImpl
 */
fun DoWhileStatement.labeledStatement(block: LabeledStatement.() -> Unit): LabeledStatement {
    return LabeledStatementImpl().apply(block)
}

/**
 * DoWhileStatement#body: Statement
 * extension function for create Statement -> BreakStatementImpl
 */
fun DoWhileStatement.breakStatement(block: BreakStatement.() -> Unit): BreakStatement {
    return BreakStatementImpl().apply(block)
}

/**
 * DoWhileStatement#body: Statement
 * extension function for create Statement -> ContinueStatementImpl
 */
fun DoWhileStatement.continueStatement(block: ContinueStatement.() -> Unit): ContinueStatement {
    return ContinueStatementImpl().apply(block)
}

/**
 * DoWhileStatement#body: Statement
 * extension function for create Statement -> IfStatementImpl
 */
fun DoWhileStatement.ifStatement(block: IfStatement.() -> Unit): IfStatement {
    return IfStatementImpl().apply(block)
}

/**
 * DoWhileStatement#body: Statement
 * extension function for create Statement -> SwitchStatementImpl
 */
fun DoWhileStatement.switchStatement(block: SwitchStatement.() -> Unit): SwitchStatement {
    return SwitchStatementImpl().apply(block)
}

/**
 * DoWhileStatement#body: Statement
 * extension function for create Statement -> ThrowStatementImpl
 */
fun DoWhileStatement.throwStatement(block: ThrowStatement.() -> Unit): ThrowStatement {
    return ThrowStatementImpl().apply(block)
}

/**
 * DoWhileStatement#body: Statement
 * extension function for create Statement -> TryStatementImpl
 */
fun DoWhileStatement.tryStatement(block: TryStatement.() -> Unit): TryStatement {
    return TryStatementImpl().apply(block)
}

/**
 * DoWhileStatement#body: Statement
 * extension function for create Statement -> WhileStatementImpl
 */
fun DoWhileStatement.whileStatement(block: WhileStatement.() -> Unit): WhileStatement {
    return WhileStatementImpl().apply(block)
}

/**
 * DoWhileStatement#body: Statement
 * extension function for create Statement -> ForStatementImpl
 */
fun DoWhileStatement.forStatement(block: ForStatement.() -> Unit): ForStatement {
    return ForStatementImpl().apply(block)
}

/**
 * DoWhileStatement#body: Statement
 * extension function for create Statement -> ForInStatementImpl
 */
fun DoWhileStatement.forInStatement(block: ForInStatement.() -> Unit): ForInStatement {
    return ForInStatementImpl().apply(block)
}

/**
 * DoWhileStatement#body: Statement
 * extension function for create Statement -> ForOfStatementImpl
 */
fun DoWhileStatement.forOfStatement(block: ForOfStatement.() -> Unit): ForOfStatement {
    return ForOfStatementImpl().apply(block)
}

/**
 * DoWhileStatement#body: Statement
 * extension function for create Statement -> ClassDeclarationImpl
 */
fun DoWhileStatement.classDeclaration(block: ClassDeclaration.() -> Unit): ClassDeclaration {
    return ClassDeclarationImpl().apply(block)
}

/**
 * DoWhileStatement#body: Statement
 * extension function for create Statement -> FunctionDeclarationImpl
 */
fun DoWhileStatement.functionDeclaration(block: FunctionDeclaration.() -> Unit): FunctionDeclaration {
    return FunctionDeclarationImpl().apply(block)
}

/**
 * DoWhileStatement#body: Statement
 * extension function for create Statement -> VariableDeclarationImpl
 */
fun DoWhileStatement.variableDeclaration(block: VariableDeclaration.() -> Unit): VariableDeclaration {
    return VariableDeclarationImpl().apply(block)
}

/**
 * DoWhileStatement#body: Statement
 * extension function for create Statement -> TsInterfaceDeclarationImpl
 */
fun DoWhileStatement.tsInterfaceDeclaration(block: TsInterfaceDeclaration.() -> Unit): TsInterfaceDeclaration {
    return TsInterfaceDeclarationImpl().apply(block)
}

/**
 * DoWhileStatement#body: Statement
 * extension function for create Statement -> TsTypeAliasDeclarationImpl
 */
fun DoWhileStatement.tsTypeAliasDeclaration(block: TsTypeAliasDeclaration.() -> Unit): TsTypeAliasDeclaration {
    return TsTypeAliasDeclarationImpl().apply(block)
}

/**
 * DoWhileStatement#body: Statement
 * extension function for create Statement -> TsEnumDeclarationImpl
 */
fun DoWhileStatement.tsEnumDeclaration(block: TsEnumDeclaration.() -> Unit): TsEnumDeclaration {
    return TsEnumDeclarationImpl().apply(block)
}

/**
 * DoWhileStatement#body: Statement
 * extension function for create Statement -> TsModuleDeclarationImpl
 */
fun DoWhileStatement.tsModuleDeclaration(block: TsModuleDeclaration.() -> Unit): TsModuleDeclaration {
    return TsModuleDeclarationImpl().apply(block)
}

/**
 * DoWhileStatement#body: Statement
 * extension function for create Statement -> ExpressionStatementImpl
 */
fun DoWhileStatement.expressionStatement(block: ExpressionStatement.() -> Unit): ExpressionStatement {
    return ExpressionStatementImpl().apply(block)
}

fun DoWhileStatement.span(block: Span.() -> Unit): Span {
    return Span().apply(block)
}
