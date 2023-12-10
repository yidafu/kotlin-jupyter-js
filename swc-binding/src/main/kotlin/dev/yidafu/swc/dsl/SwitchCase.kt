package dev.yidafu.swc.dsl

import dev.yidafu.swc.types.*

/**
 * SwitchCase#test: Expression
 * extension function for create Expression -> ThisExpressionImpl
 */
fun SwitchCase.thisExpression(block: ThisExpression.() -> Unit): ThisExpression {
    return ThisExpressionImpl().apply(block)
}

/**
 * SwitchCase#test: Expression
 * extension function for create Expression -> ArrayExpressionImpl
 */
fun SwitchCase.arrayExpression(block: ArrayExpression.() -> Unit): ArrayExpression {
    return ArrayExpressionImpl().apply(block)
}

/**
 * SwitchCase#test: Expression
 * extension function for create Expression -> ObjectExpressionImpl
 */
fun SwitchCase.objectExpression(block: ObjectExpression.() -> Unit): ObjectExpression {
    return ObjectExpressionImpl().apply(block)
}

/**
 * SwitchCase#test: Expression
 * extension function for create Expression -> FunctionExpressionImpl
 */
fun SwitchCase.functionExpression(block: FunctionExpression.() -> Unit): FunctionExpression {
    return FunctionExpressionImpl().apply(block)
}

/**
 * SwitchCase#test: Expression
 * extension function for create Expression -> UnaryExpressionImpl
 */
fun SwitchCase.unaryExpression(block: UnaryExpression.() -> Unit): UnaryExpression {
    return UnaryExpressionImpl().apply(block)
}

/**
 * SwitchCase#test: Expression
 * extension function for create Expression -> UpdateExpressionImpl
 */
fun SwitchCase.updateExpression(block: UpdateExpression.() -> Unit): UpdateExpression {
    return UpdateExpressionImpl().apply(block)
}

/**
 * SwitchCase#test: Expression
 * extension function for create Expression -> BinaryExpressionImpl
 */
fun SwitchCase.binaryExpression(block: BinaryExpression.() -> Unit): BinaryExpression {
    return BinaryExpressionImpl().apply(block)
}

/**
 * SwitchCase#test: Expression
 * extension function for create Expression -> AssignmentExpressionImpl
 */
fun SwitchCase.assignmentExpression(block: AssignmentExpression.() -> Unit): AssignmentExpression {
    return AssignmentExpressionImpl().apply(block)
}

/**
 * SwitchCase#test: Expression
 * extension function for create Expression -> MemberExpressionImpl
 */
fun SwitchCase.memberExpression(block: MemberExpression.() -> Unit): MemberExpression {
    return MemberExpressionImpl().apply(block)
}

/**
 * SwitchCase#test: Expression
 * extension function for create Expression -> SuperPropExpressionImpl
 */
fun SwitchCase.superPropExpression(block: SuperPropExpression.() -> Unit): SuperPropExpression {
    return SuperPropExpressionImpl().apply(block)
}

/**
 * SwitchCase#test: Expression
 * extension function for create Expression -> ConditionalExpressionImpl
 */
fun SwitchCase.conditionalExpression(block: ConditionalExpression.() -> Unit): ConditionalExpression {
    return ConditionalExpressionImpl().apply(block)
}

/**
 * SwitchCase#test: Expression
 * extension function for create Expression -> CallExpressionImpl
 */
fun SwitchCase.callExpression(block: CallExpression.() -> Unit): CallExpression {
    return CallExpressionImpl().apply(block)
}

/**
 * SwitchCase#test: Expression
 * extension function for create Expression -> NewExpressionImpl
 */
fun SwitchCase.newExpression(block: NewExpression.() -> Unit): NewExpression {
    return NewExpressionImpl().apply(block)
}

/**
 * SwitchCase#test: Expression
 * extension function for create Expression -> SequenceExpressionImpl
 */
fun SwitchCase.sequenceExpression(block: SequenceExpression.() -> Unit): SequenceExpression {
    return SequenceExpressionImpl().apply(block)
}

/**
 * SwitchCase#test: Expression
 * extension function for create Expression -> IdentifierImpl
 */
fun SwitchCase.identifier(block: Identifier.() -> Unit): Identifier {
    return IdentifierImpl().apply(block)
}

/**
 * SwitchCase#test: Expression
 * extension function for create Expression -> StringLiteralImpl
 */
fun SwitchCase.stringLiteral(block: StringLiteral.() -> Unit): StringLiteral {
    return StringLiteralImpl().apply(block)
}

/**
 * SwitchCase#test: Expression
 * extension function for create Expression -> BooleanLiteralImpl
 */
fun SwitchCase.booleanLiteral(block: BooleanLiteral.() -> Unit): BooleanLiteral {
    return BooleanLiteralImpl().apply(block)
}

/**
 * SwitchCase#test: Expression
 * extension function for create Expression -> NullLiteralImpl
 */
fun SwitchCase.nullLiteral(block: NullLiteral.() -> Unit): NullLiteral {
    return NullLiteralImpl().apply(block)
}

/**
 * SwitchCase#test: Expression
 * extension function for create Expression -> NumericLiteralImpl
 */
fun SwitchCase.numericLiteral(block: NumericLiteral.() -> Unit): NumericLiteral {
    return NumericLiteralImpl().apply(block)
}

/**
 * SwitchCase#test: Expression
 * extension function for create Expression -> BigIntLiteralImpl
 */
fun SwitchCase.bigIntLiteral(block: BigIntLiteral.() -> Unit): BigIntLiteral {
    return BigIntLiteralImpl().apply(block)
}

/**
 * SwitchCase#test: Expression
 * extension function for create Expression -> RegExpLiteralImpl
 */
fun SwitchCase.regExpLiteral(block: RegExpLiteral.() -> Unit): RegExpLiteral {
    return RegExpLiteralImpl().apply(block)
}

/**
 * SwitchCase#test: Expression
 * extension function for create Expression -> JSXTextImpl
 */
fun SwitchCase.jSXText(block: JSXText.() -> Unit): JSXText {
    return JSXTextImpl().apply(block)
}

/**
 * SwitchCase#test: Expression
 * extension function for create Expression -> TemplateLiteralImpl
 */
fun SwitchCase.templateLiteral(block: TemplateLiteral.() -> Unit): TemplateLiteral {
    return TemplateLiteralImpl().apply(block)
}

/**
 * SwitchCase#test: Expression
 * extension function for create Expression -> TaggedTemplateExpressionImpl
 */
fun SwitchCase.taggedTemplateExpression(block: TaggedTemplateExpression.() -> Unit): TaggedTemplateExpression {
    return TaggedTemplateExpressionImpl().apply(block)
}

/**
 * SwitchCase#test: Expression
 * extension function for create Expression -> ArrowFunctionExpressionImpl
 */
fun SwitchCase.arrowFunctionExpression(block: ArrowFunctionExpression.() -> Unit): ArrowFunctionExpression {
    return ArrowFunctionExpressionImpl().apply(block)
}

/**
 * SwitchCase#test: Expression
 * extension function for create Expression -> ClassExpressionImpl
 */
fun SwitchCase.classExpression(block: ClassExpression.() -> Unit): ClassExpression {
    return ClassExpressionImpl().apply(block)
}

/**
 * SwitchCase#test: Expression
 * extension function for create Expression -> YieldExpressionImpl
 */
fun SwitchCase.yieldExpression(block: YieldExpression.() -> Unit): YieldExpression {
    return YieldExpressionImpl().apply(block)
}

/**
 * SwitchCase#test: Expression
 * extension function for create Expression -> MetaPropertyImpl
 */
fun SwitchCase.metaProperty(block: MetaProperty.() -> Unit): MetaProperty {
    return MetaPropertyImpl().apply(block)
}

/**
 * SwitchCase#test: Expression
 * extension function for create Expression -> AwaitExpressionImpl
 */
fun SwitchCase.awaitExpression(block: AwaitExpression.() -> Unit): AwaitExpression {
    return AwaitExpressionImpl().apply(block)
}

/**
 * SwitchCase#test: Expression
 * extension function for create Expression -> ParenthesisExpressionImpl
 */
fun SwitchCase.parenthesisExpression(block: ParenthesisExpression.() -> Unit): ParenthesisExpression {
    return ParenthesisExpressionImpl().apply(block)
}

/**
 * SwitchCase#test: Expression
 * extension function for create Expression -> JSXMemberExpressionImpl
 */
fun SwitchCase.jSXMemberExpression(block: JSXMemberExpression.() -> Unit): JSXMemberExpression {
    return JSXMemberExpressionImpl().apply(block)
}

/**
 * SwitchCase#test: Expression
 * extension function for create Expression -> JSXNamespacedNameImpl
 */
fun SwitchCase.jSXNamespacedName(block: JSXNamespacedName.() -> Unit): JSXNamespacedName {
    return JSXNamespacedNameImpl().apply(block)
}

/**
 * SwitchCase#test: Expression
 * extension function for create Expression -> JSXEmptyExpressionImpl
 */
fun SwitchCase.jSXEmptyExpression(block: JSXEmptyExpression.() -> Unit): JSXEmptyExpression {
    return JSXEmptyExpressionImpl().apply(block)
}

/**
 * SwitchCase#test: Expression
 * extension function for create Expression -> JSXElementImpl
 */
fun SwitchCase.jSXElement(block: JSXElement.() -> Unit): JSXElement {
    return JSXElementImpl().apply(block)
}

/**
 * SwitchCase#test: Expression
 * extension function for create Expression -> JSXFragmentImpl
 */
fun SwitchCase.jSXFragment(block: JSXFragment.() -> Unit): JSXFragment {
    return JSXFragmentImpl().apply(block)
}

/**
 * SwitchCase#test: Expression
 * extension function for create Expression -> TsTypeAssertionImpl
 */
fun SwitchCase.tsTypeAssertion(block: TsTypeAssertion.() -> Unit): TsTypeAssertion {
    return TsTypeAssertionImpl().apply(block)
}

/**
 * SwitchCase#test: Expression
 * extension function for create Expression -> TsConstAssertionImpl
 */
fun SwitchCase.tsConstAssertion(block: TsConstAssertion.() -> Unit): TsConstAssertion {
    return TsConstAssertionImpl().apply(block)
}

/**
 * SwitchCase#test: Expression
 * extension function for create Expression -> TsNonNullExpressionImpl
 */
fun SwitchCase.tsNonNullExpression(block: TsNonNullExpression.() -> Unit): TsNonNullExpression {
    return TsNonNullExpressionImpl().apply(block)
}

/**
 * SwitchCase#test: Expression
 * extension function for create Expression -> TsAsExpressionImpl
 */
fun SwitchCase.tsAsExpression(block: TsAsExpression.() -> Unit): TsAsExpression {
    return TsAsExpressionImpl().apply(block)
}

/**
 * SwitchCase#test: Expression
 * extension function for create Expression -> TsSatisfiesExpressionImpl
 */
fun SwitchCase.tsSatisfiesExpression(block: TsSatisfiesExpression.() -> Unit): TsSatisfiesExpression {
    return TsSatisfiesExpressionImpl().apply(block)
}

/**
 * SwitchCase#test: Expression
 * extension function for create Expression -> TsInstantiationImpl
 */
fun SwitchCase.tsInstantiation(block: TsInstantiation.() -> Unit): TsInstantiation {
    return TsInstantiationImpl().apply(block)
}

/**
 * SwitchCase#test: Expression
 * extension function for create Expression -> PrivateNameImpl
 */
fun SwitchCase.privateName(block: PrivateName.() -> Unit): PrivateName {
    return PrivateNameImpl().apply(block)
}

/**
 * SwitchCase#test: Expression
 * extension function for create Expression -> OptionalChainingExpressionImpl
 */
fun SwitchCase.optionalChainingExpression(block: OptionalChainingExpression.() -> Unit): OptionalChainingExpression {
    return OptionalChainingExpressionImpl().apply(block)
}

/**
 * SwitchCase#test: Expression
 * extension function for create Expression -> InvalidImpl
 */
fun SwitchCase.invalid(block: Invalid.() -> Unit): Invalid {
    return InvalidImpl().apply(block)
}

/**
 * SwitchCase#consequent: Array<Statement>
 * extension function for create Array<Statement> -> BlockStatementImpl
 */
fun SwitchCase.blockStatement(block: BlockStatement.() -> Unit): BlockStatement {
    return BlockStatementImpl().apply(block)
}

/**
 * SwitchCase#consequent: Array<Statement>
 * extension function for create Array<Statement> -> EmptyStatementImpl
 */
fun SwitchCase.emptyStatement(block: EmptyStatement.() -> Unit): EmptyStatement {
    return EmptyStatementImpl().apply(block)
}

/**
 * SwitchCase#consequent: Array<Statement>
 * extension function for create Array<Statement> -> DebuggerStatementImpl
 */
fun SwitchCase.debuggerStatement(block: DebuggerStatement.() -> Unit): DebuggerStatement {
    return DebuggerStatementImpl().apply(block)
}

/**
 * SwitchCase#consequent: Array<Statement>
 * extension function for create Array<Statement> -> WithStatementImpl
 */
fun SwitchCase.withStatement(block: WithStatement.() -> Unit): WithStatement {
    return WithStatementImpl().apply(block)
}

/**
 * SwitchCase#consequent: Array<Statement>
 * extension function for create Array<Statement> -> ReturnStatementImpl
 */
fun SwitchCase.returnStatement(block: ReturnStatement.() -> Unit): ReturnStatement {
    return ReturnStatementImpl().apply(block)
}

/**
 * SwitchCase#consequent: Array<Statement>
 * extension function for create Array<Statement> -> LabeledStatementImpl
 */
fun SwitchCase.labeledStatement(block: LabeledStatement.() -> Unit): LabeledStatement {
    return LabeledStatementImpl().apply(block)
}

/**
 * SwitchCase#consequent: Array<Statement>
 * extension function for create Array<Statement> -> BreakStatementImpl
 */
fun SwitchCase.breakStatement(block: BreakStatement.() -> Unit): BreakStatement {
    return BreakStatementImpl().apply(block)
}

/**
 * SwitchCase#consequent: Array<Statement>
 * extension function for create Array<Statement> -> ContinueStatementImpl
 */
fun SwitchCase.continueStatement(block: ContinueStatement.() -> Unit): ContinueStatement {
    return ContinueStatementImpl().apply(block)
}

/**
 * SwitchCase#consequent: Array<Statement>
 * extension function for create Array<Statement> -> IfStatementImpl
 */
fun SwitchCase.ifStatement(block: IfStatement.() -> Unit): IfStatement {
    return IfStatementImpl().apply(block)
}

/**
 * SwitchCase#consequent: Array<Statement>
 * extension function for create Array<Statement> -> SwitchStatementImpl
 */
fun SwitchCase.switchStatement(block: SwitchStatement.() -> Unit): SwitchStatement {
    return SwitchStatementImpl().apply(block)
}

/**
 * SwitchCase#consequent: Array<Statement>
 * extension function for create Array<Statement> -> ThrowStatementImpl
 */
fun SwitchCase.throwStatement(block: ThrowStatement.() -> Unit): ThrowStatement {
    return ThrowStatementImpl().apply(block)
}

/**
 * SwitchCase#consequent: Array<Statement>
 * extension function for create Array<Statement> -> TryStatementImpl
 */
fun SwitchCase.tryStatement(block: TryStatement.() -> Unit): TryStatement {
    return TryStatementImpl().apply(block)
}

/**
 * SwitchCase#consequent: Array<Statement>
 * extension function for create Array<Statement> -> WhileStatementImpl
 */
fun SwitchCase.whileStatement(block: WhileStatement.() -> Unit): WhileStatement {
    return WhileStatementImpl().apply(block)
}

/**
 * SwitchCase#consequent: Array<Statement>
 * extension function for create Array<Statement> -> DoWhileStatementImpl
 */
fun SwitchCase.doWhileStatement(block: DoWhileStatement.() -> Unit): DoWhileStatement {
    return DoWhileStatementImpl().apply(block)
}

/**
 * SwitchCase#consequent: Array<Statement>
 * extension function for create Array<Statement> -> ForStatementImpl
 */
fun SwitchCase.forStatement(block: ForStatement.() -> Unit): ForStatement {
    return ForStatementImpl().apply(block)
}

/**
 * SwitchCase#consequent: Array<Statement>
 * extension function for create Array<Statement> -> ForInStatementImpl
 */
fun SwitchCase.forInStatement(block: ForInStatement.() -> Unit): ForInStatement {
    return ForInStatementImpl().apply(block)
}

/**
 * SwitchCase#consequent: Array<Statement>
 * extension function for create Array<Statement> -> ForOfStatementImpl
 */
fun SwitchCase.forOfStatement(block: ForOfStatement.() -> Unit): ForOfStatement {
    return ForOfStatementImpl().apply(block)
}

/**
 * SwitchCase#consequent: Array<Statement>
 * extension function for create Array<Statement> -> ClassDeclarationImpl
 */
fun SwitchCase.classDeclaration(block: ClassDeclaration.() -> Unit): ClassDeclaration {
    return ClassDeclarationImpl().apply(block)
}

/**
 * SwitchCase#consequent: Array<Statement>
 * extension function for create Array<Statement> -> FunctionDeclarationImpl
 */
fun SwitchCase.functionDeclaration(block: FunctionDeclaration.() -> Unit): FunctionDeclaration {
    return FunctionDeclarationImpl().apply(block)
}

/**
 * SwitchCase#consequent: Array<Statement>
 * extension function for create Array<Statement> -> VariableDeclarationImpl
 */
fun SwitchCase.variableDeclaration(block: VariableDeclaration.() -> Unit): VariableDeclaration {
    return VariableDeclarationImpl().apply(block)
}

/**
 * SwitchCase#consequent: Array<Statement>
 * extension function for create Array<Statement> -> TsInterfaceDeclarationImpl
 */
fun SwitchCase.tsInterfaceDeclaration(block: TsInterfaceDeclaration.() -> Unit): TsInterfaceDeclaration {
    return TsInterfaceDeclarationImpl().apply(block)
}

/**
 * SwitchCase#consequent: Array<Statement>
 * extension function for create Array<Statement> -> TsTypeAliasDeclarationImpl
 */
fun SwitchCase.tsTypeAliasDeclaration(block: TsTypeAliasDeclaration.() -> Unit): TsTypeAliasDeclaration {
    return TsTypeAliasDeclarationImpl().apply(block)
}

/**
 * SwitchCase#consequent: Array<Statement>
 * extension function for create Array<Statement> -> TsEnumDeclarationImpl
 */
fun SwitchCase.tsEnumDeclaration(block: TsEnumDeclaration.() -> Unit): TsEnumDeclaration {
    return TsEnumDeclarationImpl().apply(block)
}

/**
 * SwitchCase#consequent: Array<Statement>
 * extension function for create Array<Statement> -> TsModuleDeclarationImpl
 */
fun SwitchCase.tsModuleDeclaration(block: TsModuleDeclaration.() -> Unit): TsModuleDeclaration {
    return TsModuleDeclarationImpl().apply(block)
}

/**
 * SwitchCase#consequent: Array<Statement>
 * extension function for create Array<Statement> -> ExpressionStatementImpl
 */
fun SwitchCase.expressionStatement(block: ExpressionStatement.() -> Unit): ExpressionStatement {
    return ExpressionStatementImpl().apply(block)
}

fun SwitchCase.span(block: Span.() -> Unit): Span {
    return Span().apply(block)
}
