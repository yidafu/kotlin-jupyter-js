package dev.yidafu.swc.dsl

import dev.yidafu.swc.types.*

/**
 * ForStatement#body: Statement
 * extension function for create Statement -> VariableDeclarationImpl
 */
fun ForStatement.variableDeclaration(block: VariableDeclaration.() -> Unit): VariableDeclaration {
    return VariableDeclarationImpl().apply(block)
}

/**
 * ForStatement#update: Expression
 * extension function for create Expression -> ThisExpressionImpl
 */
fun ForStatement.thisExpression(block: ThisExpression.() -> Unit): ThisExpression {
    return ThisExpressionImpl().apply(block)
}

/**
 * ForStatement#update: Expression
 * extension function for create Expression -> ArrayExpressionImpl
 */
fun ForStatement.arrayExpression(block: ArrayExpression.() -> Unit): ArrayExpression {
    return ArrayExpressionImpl().apply(block)
}

/**
 * ForStatement#update: Expression
 * extension function for create Expression -> ObjectExpressionImpl
 */
fun ForStatement.objectExpression(block: ObjectExpression.() -> Unit): ObjectExpression {
    return ObjectExpressionImpl().apply(block)
}

/**
 * ForStatement#update: Expression
 * extension function for create Expression -> FunctionExpressionImpl
 */
fun ForStatement.functionExpression(block: FunctionExpression.() -> Unit): FunctionExpression {
    return FunctionExpressionImpl().apply(block)
}

/**
 * ForStatement#update: Expression
 * extension function for create Expression -> UnaryExpressionImpl
 */
fun ForStatement.unaryExpression(block: UnaryExpression.() -> Unit): UnaryExpression {
    return UnaryExpressionImpl().apply(block)
}

/**
 * ForStatement#update: Expression
 * extension function for create Expression -> UpdateExpressionImpl
 */
fun ForStatement.updateExpression(block: UpdateExpression.() -> Unit): UpdateExpression {
    return UpdateExpressionImpl().apply(block)
}

/**
 * ForStatement#update: Expression
 * extension function for create Expression -> BinaryExpressionImpl
 */
fun ForStatement.binaryExpression(block: BinaryExpression.() -> Unit): BinaryExpression {
    return BinaryExpressionImpl().apply(block)
}

/**
 * ForStatement#update: Expression
 * extension function for create Expression -> AssignmentExpressionImpl
 */
fun ForStatement.assignmentExpression(block: AssignmentExpression.() -> Unit): AssignmentExpression {
    return AssignmentExpressionImpl().apply(block)
}

/**
 * ForStatement#update: Expression
 * extension function for create Expression -> MemberExpressionImpl
 */
fun ForStatement.memberExpression(block: MemberExpression.() -> Unit): MemberExpression {
    return MemberExpressionImpl().apply(block)
}

/**
 * ForStatement#update: Expression
 * extension function for create Expression -> SuperPropExpressionImpl
 */
fun ForStatement.superPropExpression(block: SuperPropExpression.() -> Unit): SuperPropExpression {
    return SuperPropExpressionImpl().apply(block)
}

/**
 * ForStatement#update: Expression
 * extension function for create Expression -> ConditionalExpressionImpl
 */
fun ForStatement.conditionalExpression(block: ConditionalExpression.() -> Unit): ConditionalExpression {
    return ConditionalExpressionImpl().apply(block)
}

/**
 * ForStatement#update: Expression
 * extension function for create Expression -> CallExpressionImpl
 */
fun ForStatement.callExpression(block: CallExpression.() -> Unit): CallExpression {
    return CallExpressionImpl().apply(block)
}

/**
 * ForStatement#update: Expression
 * extension function for create Expression -> NewExpressionImpl
 */
fun ForStatement.newExpression(block: NewExpression.() -> Unit): NewExpression {
    return NewExpressionImpl().apply(block)
}

/**
 * ForStatement#update: Expression
 * extension function for create Expression -> SequenceExpressionImpl
 */
fun ForStatement.sequenceExpression(block: SequenceExpression.() -> Unit): SequenceExpression {
    return SequenceExpressionImpl().apply(block)
}

/**
 * ForStatement#update: Expression
 * extension function for create Expression -> IdentifierImpl
 */
fun ForStatement.identifier(block: Identifier.() -> Unit): Identifier {
    return IdentifierImpl().apply(block)
}

/**
 * ForStatement#update: Expression
 * extension function for create Expression -> StringLiteralImpl
 */
fun ForStatement.stringLiteral(block: StringLiteral.() -> Unit): StringLiteral {
    return StringLiteralImpl().apply(block)
}

/**
 * ForStatement#update: Expression
 * extension function for create Expression -> BooleanLiteralImpl
 */
fun ForStatement.booleanLiteral(block: BooleanLiteral.() -> Unit): BooleanLiteral {
    return BooleanLiteralImpl().apply(block)
}

/**
 * ForStatement#update: Expression
 * extension function for create Expression -> NullLiteralImpl
 */
fun ForStatement.nullLiteral(block: NullLiteral.() -> Unit): NullLiteral {
    return NullLiteralImpl().apply(block)
}

/**
 * ForStatement#update: Expression
 * extension function for create Expression -> NumericLiteralImpl
 */
fun ForStatement.numericLiteral(block: NumericLiteral.() -> Unit): NumericLiteral {
    return NumericLiteralImpl().apply(block)
}

/**
 * ForStatement#update: Expression
 * extension function for create Expression -> BigIntLiteralImpl
 */
fun ForStatement.bigIntLiteral(block: BigIntLiteral.() -> Unit): BigIntLiteral {
    return BigIntLiteralImpl().apply(block)
}

/**
 * ForStatement#update: Expression
 * extension function for create Expression -> RegExpLiteralImpl
 */
fun ForStatement.regExpLiteral(block: RegExpLiteral.() -> Unit): RegExpLiteral {
    return RegExpLiteralImpl().apply(block)
}

/**
 * ForStatement#update: Expression
 * extension function for create Expression -> JSXTextImpl
 */
fun ForStatement.jSXText(block: JSXText.() -> Unit): JSXText {
    return JSXTextImpl().apply(block)
}

/**
 * ForStatement#update: Expression
 * extension function for create Expression -> TemplateLiteralImpl
 */
fun ForStatement.templateLiteral(block: TemplateLiteral.() -> Unit): TemplateLiteral {
    return TemplateLiteralImpl().apply(block)
}

/**
 * ForStatement#update: Expression
 * extension function for create Expression -> TaggedTemplateExpressionImpl
 */
fun ForStatement.taggedTemplateExpression(block: TaggedTemplateExpression.() -> Unit): TaggedTemplateExpression {
    return TaggedTemplateExpressionImpl().apply(block)
}

/**
 * ForStatement#update: Expression
 * extension function for create Expression -> ArrowFunctionExpressionImpl
 */
fun ForStatement.arrowFunctionExpression(block: ArrowFunctionExpression.() -> Unit): ArrowFunctionExpression {
    return ArrowFunctionExpressionImpl().apply(block)
}

/**
 * ForStatement#update: Expression
 * extension function for create Expression -> ClassExpressionImpl
 */
fun ForStatement.classExpression(block: ClassExpression.() -> Unit): ClassExpression {
    return ClassExpressionImpl().apply(block)
}

/**
 * ForStatement#update: Expression
 * extension function for create Expression -> YieldExpressionImpl
 */
fun ForStatement.yieldExpression(block: YieldExpression.() -> Unit): YieldExpression {
    return YieldExpressionImpl().apply(block)
}

/**
 * ForStatement#update: Expression
 * extension function for create Expression -> MetaPropertyImpl
 */
fun ForStatement.metaProperty(block: MetaProperty.() -> Unit): MetaProperty {
    return MetaPropertyImpl().apply(block)
}

/**
 * ForStatement#update: Expression
 * extension function for create Expression -> AwaitExpressionImpl
 */
fun ForStatement.awaitExpression(block: AwaitExpression.() -> Unit): AwaitExpression {
    return AwaitExpressionImpl().apply(block)
}

/**
 * ForStatement#update: Expression
 * extension function for create Expression -> ParenthesisExpressionImpl
 */
fun ForStatement.parenthesisExpression(block: ParenthesisExpression.() -> Unit): ParenthesisExpression {
    return ParenthesisExpressionImpl().apply(block)
}

/**
 * ForStatement#update: Expression
 * extension function for create Expression -> JSXMemberExpressionImpl
 */
fun ForStatement.jSXMemberExpression(block: JSXMemberExpression.() -> Unit): JSXMemberExpression {
    return JSXMemberExpressionImpl().apply(block)
}

/**
 * ForStatement#update: Expression
 * extension function for create Expression -> JSXNamespacedNameImpl
 */
fun ForStatement.jSXNamespacedName(block: JSXNamespacedName.() -> Unit): JSXNamespacedName {
    return JSXNamespacedNameImpl().apply(block)
}

/**
 * ForStatement#update: Expression
 * extension function for create Expression -> JSXEmptyExpressionImpl
 */
fun ForStatement.jSXEmptyExpression(block: JSXEmptyExpression.() -> Unit): JSXEmptyExpression {
    return JSXEmptyExpressionImpl().apply(block)
}

/**
 * ForStatement#update: Expression
 * extension function for create Expression -> JSXElementImpl
 */
fun ForStatement.jSXElement(block: JSXElement.() -> Unit): JSXElement {
    return JSXElementImpl().apply(block)
}

/**
 * ForStatement#update: Expression
 * extension function for create Expression -> JSXFragmentImpl
 */
fun ForStatement.jSXFragment(block: JSXFragment.() -> Unit): JSXFragment {
    return JSXFragmentImpl().apply(block)
}

/**
 * ForStatement#update: Expression
 * extension function for create Expression -> TsTypeAssertionImpl
 */
fun ForStatement.tsTypeAssertion(block: TsTypeAssertion.() -> Unit): TsTypeAssertion {
    return TsTypeAssertionImpl().apply(block)
}

/**
 * ForStatement#update: Expression
 * extension function for create Expression -> TsConstAssertionImpl
 */
fun ForStatement.tsConstAssertion(block: TsConstAssertion.() -> Unit): TsConstAssertion {
    return TsConstAssertionImpl().apply(block)
}

/**
 * ForStatement#update: Expression
 * extension function for create Expression -> TsNonNullExpressionImpl
 */
fun ForStatement.tsNonNullExpression(block: TsNonNullExpression.() -> Unit): TsNonNullExpression {
    return TsNonNullExpressionImpl().apply(block)
}

/**
 * ForStatement#update: Expression
 * extension function for create Expression -> TsAsExpressionImpl
 */
fun ForStatement.tsAsExpression(block: TsAsExpression.() -> Unit): TsAsExpression {
    return TsAsExpressionImpl().apply(block)
}

/**
 * ForStatement#update: Expression
 * extension function for create Expression -> TsSatisfiesExpressionImpl
 */
fun ForStatement.tsSatisfiesExpression(block: TsSatisfiesExpression.() -> Unit): TsSatisfiesExpression {
    return TsSatisfiesExpressionImpl().apply(block)
}

/**
 * ForStatement#update: Expression
 * extension function for create Expression -> TsInstantiationImpl
 */
fun ForStatement.tsInstantiation(block: TsInstantiation.() -> Unit): TsInstantiation {
    return TsInstantiationImpl().apply(block)
}

/**
 * ForStatement#update: Expression
 * extension function for create Expression -> PrivateNameImpl
 */
fun ForStatement.privateName(block: PrivateName.() -> Unit): PrivateName {
    return PrivateNameImpl().apply(block)
}

/**
 * ForStatement#update: Expression
 * extension function for create Expression -> OptionalChainingExpressionImpl
 */
fun ForStatement.optionalChainingExpression(block: OptionalChainingExpression.() -> Unit): OptionalChainingExpression {
    return OptionalChainingExpressionImpl().apply(block)
}

/**
 * ForStatement#update: Expression
 * extension function for create Expression -> InvalidImpl
 */
fun ForStatement.invalid(block: Invalid.() -> Unit): Invalid {
    return InvalidImpl().apply(block)
}

/**
 * ForStatement#body: Statement
 * extension function for create Statement -> BlockStatementImpl
 */
fun ForStatement.blockStatement(block: BlockStatement.() -> Unit): BlockStatement {
    return BlockStatementImpl().apply(block)
}

/**
 * ForStatement#body: Statement
 * extension function for create Statement -> EmptyStatementImpl
 */
fun ForStatement.emptyStatement(block: EmptyStatement.() -> Unit): EmptyStatement {
    return EmptyStatementImpl().apply(block)
}

/**
 * ForStatement#body: Statement
 * extension function for create Statement -> DebuggerStatementImpl
 */
fun ForStatement.debuggerStatement(block: DebuggerStatement.() -> Unit): DebuggerStatement {
    return DebuggerStatementImpl().apply(block)
}

/**
 * ForStatement#body: Statement
 * extension function for create Statement -> WithStatementImpl
 */
fun ForStatement.withStatement(block: WithStatement.() -> Unit): WithStatement {
    return WithStatementImpl().apply(block)
}

/**
 * ForStatement#body: Statement
 * extension function for create Statement -> ReturnStatementImpl
 */
fun ForStatement.returnStatement(block: ReturnStatement.() -> Unit): ReturnStatement {
    return ReturnStatementImpl().apply(block)
}

/**
 * ForStatement#body: Statement
 * extension function for create Statement -> LabeledStatementImpl
 */
fun ForStatement.labeledStatement(block: LabeledStatement.() -> Unit): LabeledStatement {
    return LabeledStatementImpl().apply(block)
}

/**
 * ForStatement#body: Statement
 * extension function for create Statement -> BreakStatementImpl
 */
fun ForStatement.breakStatement(block: BreakStatement.() -> Unit): BreakStatement {
    return BreakStatementImpl().apply(block)
}

/**
 * ForStatement#body: Statement
 * extension function for create Statement -> ContinueStatementImpl
 */
fun ForStatement.continueStatement(block: ContinueStatement.() -> Unit): ContinueStatement {
    return ContinueStatementImpl().apply(block)
}

/**
 * ForStatement#body: Statement
 * extension function for create Statement -> IfStatementImpl
 */
fun ForStatement.ifStatement(block: IfStatement.() -> Unit): IfStatement {
    return IfStatementImpl().apply(block)
}

/**
 * ForStatement#body: Statement
 * extension function for create Statement -> SwitchStatementImpl
 */
fun ForStatement.switchStatement(block: SwitchStatement.() -> Unit): SwitchStatement {
    return SwitchStatementImpl().apply(block)
}

/**
 * ForStatement#body: Statement
 * extension function for create Statement -> ThrowStatementImpl
 */
fun ForStatement.throwStatement(block: ThrowStatement.() -> Unit): ThrowStatement {
    return ThrowStatementImpl().apply(block)
}

/**
 * ForStatement#body: Statement
 * extension function for create Statement -> TryStatementImpl
 */
fun ForStatement.tryStatement(block: TryStatement.() -> Unit): TryStatement {
    return TryStatementImpl().apply(block)
}

/**
 * ForStatement#body: Statement
 * extension function for create Statement -> WhileStatementImpl
 */
fun ForStatement.whileStatement(block: WhileStatement.() -> Unit): WhileStatement {
    return WhileStatementImpl().apply(block)
}

/**
 * ForStatement#body: Statement
 * extension function for create Statement -> DoWhileStatementImpl
 */
fun ForStatement.doWhileStatement(block: DoWhileStatement.() -> Unit): DoWhileStatement {
    return DoWhileStatementImpl().apply(block)
}

/**
 * ForStatement#body: Statement
 * extension function for create Statement -> ForInStatementImpl
 */
fun ForStatement.forInStatement(block: ForInStatement.() -> Unit): ForInStatement {
    return ForInStatementImpl().apply(block)
}

/**
 * ForStatement#body: Statement
 * extension function for create Statement -> ForOfStatementImpl
 */
fun ForStatement.forOfStatement(block: ForOfStatement.() -> Unit): ForOfStatement {
    return ForOfStatementImpl().apply(block)
}

/**
 * ForStatement#body: Statement
 * extension function for create Statement -> ClassDeclarationImpl
 */
fun ForStatement.classDeclaration(block: ClassDeclaration.() -> Unit): ClassDeclaration {
    return ClassDeclarationImpl().apply(block)
}

/**
 * ForStatement#body: Statement
 * extension function for create Statement -> FunctionDeclarationImpl
 */
fun ForStatement.functionDeclaration(block: FunctionDeclaration.() -> Unit): FunctionDeclaration {
    return FunctionDeclarationImpl().apply(block)
}

/**
 * ForStatement#body: Statement
 * extension function for create Statement -> TsInterfaceDeclarationImpl
 */
fun ForStatement.tsInterfaceDeclaration(block: TsInterfaceDeclaration.() -> Unit): TsInterfaceDeclaration {
    return TsInterfaceDeclarationImpl().apply(block)
}

/**
 * ForStatement#body: Statement
 * extension function for create Statement -> TsTypeAliasDeclarationImpl
 */
fun ForStatement.tsTypeAliasDeclaration(block: TsTypeAliasDeclaration.() -> Unit): TsTypeAliasDeclaration {
    return TsTypeAliasDeclarationImpl().apply(block)
}

/**
 * ForStatement#body: Statement
 * extension function for create Statement -> TsEnumDeclarationImpl
 */
fun ForStatement.tsEnumDeclaration(block: TsEnumDeclaration.() -> Unit): TsEnumDeclaration {
    return TsEnumDeclarationImpl().apply(block)
}

/**
 * ForStatement#body: Statement
 * extension function for create Statement -> TsModuleDeclarationImpl
 */
fun ForStatement.tsModuleDeclaration(block: TsModuleDeclaration.() -> Unit): TsModuleDeclaration {
    return TsModuleDeclarationImpl().apply(block)
}

/**
 * ForStatement#body: Statement
 * extension function for create Statement -> ExpressionStatementImpl
 */
fun ForStatement.expressionStatement(block: ExpressionStatement.() -> Unit): ExpressionStatement {
    return ExpressionStatementImpl().apply(block)
}

fun ForStatement.span(block: Span.() -> Unit): Span {
    return Span().apply(block)
}
