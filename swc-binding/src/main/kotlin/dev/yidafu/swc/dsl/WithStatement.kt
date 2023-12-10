package dev.yidafu.swc.dsl

import dev.yidafu.swc.types.*

/**
 * WithStatement#object: Expression
 * extension function for create Expression -> ThisExpressionImpl
 */
fun WithStatement.thisExpression(block: ThisExpression.() -> Unit): ThisExpression {
    return ThisExpressionImpl().apply(block)
}

/**
 * WithStatement#object: Expression
 * extension function for create Expression -> ArrayExpressionImpl
 */
fun WithStatement.arrayExpression(block: ArrayExpression.() -> Unit): ArrayExpression {
    return ArrayExpressionImpl().apply(block)
}

/**
 * WithStatement#object: Expression
 * extension function for create Expression -> ObjectExpressionImpl
 */
fun WithStatement.objectExpression(block: ObjectExpression.() -> Unit): ObjectExpression {
    return ObjectExpressionImpl().apply(block)
}

/**
 * WithStatement#object: Expression
 * extension function for create Expression -> FunctionExpressionImpl
 */
fun WithStatement.functionExpression(block: FunctionExpression.() -> Unit): FunctionExpression {
    return FunctionExpressionImpl().apply(block)
}

/**
 * WithStatement#object: Expression
 * extension function for create Expression -> UnaryExpressionImpl
 */
fun WithStatement.unaryExpression(block: UnaryExpression.() -> Unit): UnaryExpression {
    return UnaryExpressionImpl().apply(block)
}

/**
 * WithStatement#object: Expression
 * extension function for create Expression -> UpdateExpressionImpl
 */
fun WithStatement.updateExpression(block: UpdateExpression.() -> Unit): UpdateExpression {
    return UpdateExpressionImpl().apply(block)
}

/**
 * WithStatement#object: Expression
 * extension function for create Expression -> BinaryExpressionImpl
 */
fun WithStatement.binaryExpression(block: BinaryExpression.() -> Unit): BinaryExpression {
    return BinaryExpressionImpl().apply(block)
}

/**
 * WithStatement#object: Expression
 * extension function for create Expression -> AssignmentExpressionImpl
 */
fun WithStatement.assignmentExpression(block: AssignmentExpression.() -> Unit): AssignmentExpression {
    return AssignmentExpressionImpl().apply(block)
}

/**
 * WithStatement#object: Expression
 * extension function for create Expression -> MemberExpressionImpl
 */
fun WithStatement.memberExpression(block: MemberExpression.() -> Unit): MemberExpression {
    return MemberExpressionImpl().apply(block)
}

/**
 * WithStatement#object: Expression
 * extension function for create Expression -> SuperPropExpressionImpl
 */
fun WithStatement.superPropExpression(block: SuperPropExpression.() -> Unit): SuperPropExpression {
    return SuperPropExpressionImpl().apply(block)
}

/**
 * WithStatement#object: Expression
 * extension function for create Expression -> ConditionalExpressionImpl
 */
fun WithStatement.conditionalExpression(block: ConditionalExpression.() -> Unit): ConditionalExpression {
    return ConditionalExpressionImpl().apply(block)
}

/**
 * WithStatement#object: Expression
 * extension function for create Expression -> CallExpressionImpl
 */
fun WithStatement.callExpression(block: CallExpression.() -> Unit): CallExpression {
    return CallExpressionImpl().apply(block)
}

/**
 * WithStatement#object: Expression
 * extension function for create Expression -> NewExpressionImpl
 */
fun WithStatement.newExpression(block: NewExpression.() -> Unit): NewExpression {
    return NewExpressionImpl().apply(block)
}

/**
 * WithStatement#object: Expression
 * extension function for create Expression -> SequenceExpressionImpl
 */
fun WithStatement.sequenceExpression(block: SequenceExpression.() -> Unit): SequenceExpression {
    return SequenceExpressionImpl().apply(block)
}

/**
 * WithStatement#object: Expression
 * extension function for create Expression -> IdentifierImpl
 */
fun WithStatement.identifier(block: Identifier.() -> Unit): Identifier {
    return IdentifierImpl().apply(block)
}

/**
 * WithStatement#object: Expression
 * extension function for create Expression -> StringLiteralImpl
 */
fun WithStatement.stringLiteral(block: StringLiteral.() -> Unit): StringLiteral {
    return StringLiteralImpl().apply(block)
}

/**
 * WithStatement#object: Expression
 * extension function for create Expression -> BooleanLiteralImpl
 */
fun WithStatement.booleanLiteral(block: BooleanLiteral.() -> Unit): BooleanLiteral {
    return BooleanLiteralImpl().apply(block)
}

/**
 * WithStatement#object: Expression
 * extension function for create Expression -> NullLiteralImpl
 */
fun WithStatement.nullLiteral(block: NullLiteral.() -> Unit): NullLiteral {
    return NullLiteralImpl().apply(block)
}

/**
 * WithStatement#object: Expression
 * extension function for create Expression -> NumericLiteralImpl
 */
fun WithStatement.numericLiteral(block: NumericLiteral.() -> Unit): NumericLiteral {
    return NumericLiteralImpl().apply(block)
}

/**
 * WithStatement#object: Expression
 * extension function for create Expression -> BigIntLiteralImpl
 */
fun WithStatement.bigIntLiteral(block: BigIntLiteral.() -> Unit): BigIntLiteral {
    return BigIntLiteralImpl().apply(block)
}

/**
 * WithStatement#object: Expression
 * extension function for create Expression -> RegExpLiteralImpl
 */
fun WithStatement.regExpLiteral(block: RegExpLiteral.() -> Unit): RegExpLiteral {
    return RegExpLiteralImpl().apply(block)
}

/**
 * WithStatement#object: Expression
 * extension function for create Expression -> JSXTextImpl
 */
fun WithStatement.jSXText(block: JSXText.() -> Unit): JSXText {
    return JSXTextImpl().apply(block)
}

/**
 * WithStatement#object: Expression
 * extension function for create Expression -> TemplateLiteralImpl
 */
fun WithStatement.templateLiteral(block: TemplateLiteral.() -> Unit): TemplateLiteral {
    return TemplateLiteralImpl().apply(block)
}

/**
 * WithStatement#object: Expression
 * extension function for create Expression -> TaggedTemplateExpressionImpl
 */
fun WithStatement.taggedTemplateExpression(block: TaggedTemplateExpression.() -> Unit): TaggedTemplateExpression {
    return TaggedTemplateExpressionImpl().apply(block)
}

/**
 * WithStatement#object: Expression
 * extension function for create Expression -> ArrowFunctionExpressionImpl
 */
fun WithStatement.arrowFunctionExpression(block: ArrowFunctionExpression.() -> Unit): ArrowFunctionExpression {
    return ArrowFunctionExpressionImpl().apply(block)
}

/**
 * WithStatement#object: Expression
 * extension function for create Expression -> ClassExpressionImpl
 */
fun WithStatement.classExpression(block: ClassExpression.() -> Unit): ClassExpression {
    return ClassExpressionImpl().apply(block)
}

/**
 * WithStatement#object: Expression
 * extension function for create Expression -> YieldExpressionImpl
 */
fun WithStatement.yieldExpression(block: YieldExpression.() -> Unit): YieldExpression {
    return YieldExpressionImpl().apply(block)
}

/**
 * WithStatement#object: Expression
 * extension function for create Expression -> MetaPropertyImpl
 */
fun WithStatement.metaProperty(block: MetaProperty.() -> Unit): MetaProperty {
    return MetaPropertyImpl().apply(block)
}

/**
 * WithStatement#object: Expression
 * extension function for create Expression -> AwaitExpressionImpl
 */
fun WithStatement.awaitExpression(block: AwaitExpression.() -> Unit): AwaitExpression {
    return AwaitExpressionImpl().apply(block)
}

/**
 * WithStatement#object: Expression
 * extension function for create Expression -> ParenthesisExpressionImpl
 */
fun WithStatement.parenthesisExpression(block: ParenthesisExpression.() -> Unit): ParenthesisExpression {
    return ParenthesisExpressionImpl().apply(block)
}

/**
 * WithStatement#object: Expression
 * extension function for create Expression -> JSXMemberExpressionImpl
 */
fun WithStatement.jSXMemberExpression(block: JSXMemberExpression.() -> Unit): JSXMemberExpression {
    return JSXMemberExpressionImpl().apply(block)
}

/**
 * WithStatement#object: Expression
 * extension function for create Expression -> JSXNamespacedNameImpl
 */
fun WithStatement.jSXNamespacedName(block: JSXNamespacedName.() -> Unit): JSXNamespacedName {
    return JSXNamespacedNameImpl().apply(block)
}

/**
 * WithStatement#object: Expression
 * extension function for create Expression -> JSXEmptyExpressionImpl
 */
fun WithStatement.jSXEmptyExpression(block: JSXEmptyExpression.() -> Unit): JSXEmptyExpression {
    return JSXEmptyExpressionImpl().apply(block)
}

/**
 * WithStatement#object: Expression
 * extension function for create Expression -> JSXElementImpl
 */
fun WithStatement.jSXElement(block: JSXElement.() -> Unit): JSXElement {
    return JSXElementImpl().apply(block)
}

/**
 * WithStatement#object: Expression
 * extension function for create Expression -> JSXFragmentImpl
 */
fun WithStatement.jSXFragment(block: JSXFragment.() -> Unit): JSXFragment {
    return JSXFragmentImpl().apply(block)
}

/**
 * WithStatement#object: Expression
 * extension function for create Expression -> TsTypeAssertionImpl
 */
fun WithStatement.tsTypeAssertion(block: TsTypeAssertion.() -> Unit): TsTypeAssertion {
    return TsTypeAssertionImpl().apply(block)
}

/**
 * WithStatement#object: Expression
 * extension function for create Expression -> TsConstAssertionImpl
 */
fun WithStatement.tsConstAssertion(block: TsConstAssertion.() -> Unit): TsConstAssertion {
    return TsConstAssertionImpl().apply(block)
}

/**
 * WithStatement#object: Expression
 * extension function for create Expression -> TsNonNullExpressionImpl
 */
fun WithStatement.tsNonNullExpression(block: TsNonNullExpression.() -> Unit): TsNonNullExpression {
    return TsNonNullExpressionImpl().apply(block)
}

/**
 * WithStatement#object: Expression
 * extension function for create Expression -> TsAsExpressionImpl
 */
fun WithStatement.tsAsExpression(block: TsAsExpression.() -> Unit): TsAsExpression {
    return TsAsExpressionImpl().apply(block)
}

/**
 * WithStatement#object: Expression
 * extension function for create Expression -> TsSatisfiesExpressionImpl
 */
fun WithStatement.tsSatisfiesExpression(block: TsSatisfiesExpression.() -> Unit): TsSatisfiesExpression {
    return TsSatisfiesExpressionImpl().apply(block)
}

/**
 * WithStatement#object: Expression
 * extension function for create Expression -> TsInstantiationImpl
 */
fun WithStatement.tsInstantiation(block: TsInstantiation.() -> Unit): TsInstantiation {
    return TsInstantiationImpl().apply(block)
}

/**
 * WithStatement#object: Expression
 * extension function for create Expression -> PrivateNameImpl
 */
fun WithStatement.privateName(block: PrivateName.() -> Unit): PrivateName {
    return PrivateNameImpl().apply(block)
}

/**
 * WithStatement#object: Expression
 * extension function for create Expression -> OptionalChainingExpressionImpl
 */
fun WithStatement.optionalChainingExpression(block: OptionalChainingExpression.() -> Unit): OptionalChainingExpression {
    return OptionalChainingExpressionImpl().apply(block)
}

/**
 * WithStatement#object: Expression
 * extension function for create Expression -> InvalidImpl
 */
fun WithStatement.invalid(block: Invalid.() -> Unit): Invalid {
    return InvalidImpl().apply(block)
}

/**
 * WithStatement#body: Statement
 * extension function for create Statement -> BlockStatementImpl
 */
fun WithStatement.blockStatement(block: BlockStatement.() -> Unit): BlockStatement {
    return BlockStatementImpl().apply(block)
}

/**
 * WithStatement#body: Statement
 * extension function for create Statement -> EmptyStatementImpl
 */
fun WithStatement.emptyStatement(block: EmptyStatement.() -> Unit): EmptyStatement {
    return EmptyStatementImpl().apply(block)
}

/**
 * WithStatement#body: Statement
 * extension function for create Statement -> DebuggerStatementImpl
 */
fun WithStatement.debuggerStatement(block: DebuggerStatement.() -> Unit): DebuggerStatement {
    return DebuggerStatementImpl().apply(block)
}

/**
 * WithStatement#body: Statement
 * extension function for create Statement -> ReturnStatementImpl
 */
fun WithStatement.returnStatement(block: ReturnStatement.() -> Unit): ReturnStatement {
    return ReturnStatementImpl().apply(block)
}

/**
 * WithStatement#body: Statement
 * extension function for create Statement -> LabeledStatementImpl
 */
fun WithStatement.labeledStatement(block: LabeledStatement.() -> Unit): LabeledStatement {
    return LabeledStatementImpl().apply(block)
}

/**
 * WithStatement#body: Statement
 * extension function for create Statement -> BreakStatementImpl
 */
fun WithStatement.breakStatement(block: BreakStatement.() -> Unit): BreakStatement {
    return BreakStatementImpl().apply(block)
}

/**
 * WithStatement#body: Statement
 * extension function for create Statement -> ContinueStatementImpl
 */
fun WithStatement.continueStatement(block: ContinueStatement.() -> Unit): ContinueStatement {
    return ContinueStatementImpl().apply(block)
}

/**
 * WithStatement#body: Statement
 * extension function for create Statement -> IfStatementImpl
 */
fun WithStatement.ifStatement(block: IfStatement.() -> Unit): IfStatement {
    return IfStatementImpl().apply(block)
}

/**
 * WithStatement#body: Statement
 * extension function for create Statement -> SwitchStatementImpl
 */
fun WithStatement.switchStatement(block: SwitchStatement.() -> Unit): SwitchStatement {
    return SwitchStatementImpl().apply(block)
}

/**
 * WithStatement#body: Statement
 * extension function for create Statement -> ThrowStatementImpl
 */
fun WithStatement.throwStatement(block: ThrowStatement.() -> Unit): ThrowStatement {
    return ThrowStatementImpl().apply(block)
}

/**
 * WithStatement#body: Statement
 * extension function for create Statement -> TryStatementImpl
 */
fun WithStatement.tryStatement(block: TryStatement.() -> Unit): TryStatement {
    return TryStatementImpl().apply(block)
}

/**
 * WithStatement#body: Statement
 * extension function for create Statement -> WhileStatementImpl
 */
fun WithStatement.whileStatement(block: WhileStatement.() -> Unit): WhileStatement {
    return WhileStatementImpl().apply(block)
}

/**
 * WithStatement#body: Statement
 * extension function for create Statement -> DoWhileStatementImpl
 */
fun WithStatement.doWhileStatement(block: DoWhileStatement.() -> Unit): DoWhileStatement {
    return DoWhileStatementImpl().apply(block)
}

/**
 * WithStatement#body: Statement
 * extension function for create Statement -> ForStatementImpl
 */
fun WithStatement.forStatement(block: ForStatement.() -> Unit): ForStatement {
    return ForStatementImpl().apply(block)
}

/**
 * WithStatement#body: Statement
 * extension function for create Statement -> ForInStatementImpl
 */
fun WithStatement.forInStatement(block: ForInStatement.() -> Unit): ForInStatement {
    return ForInStatementImpl().apply(block)
}

/**
 * WithStatement#body: Statement
 * extension function for create Statement -> ForOfStatementImpl
 */
fun WithStatement.forOfStatement(block: ForOfStatement.() -> Unit): ForOfStatement {
    return ForOfStatementImpl().apply(block)
}

/**
 * WithStatement#body: Statement
 * extension function for create Statement -> ClassDeclarationImpl
 */
fun WithStatement.classDeclaration(block: ClassDeclaration.() -> Unit): ClassDeclaration {
    return ClassDeclarationImpl().apply(block)
}

/**
 * WithStatement#body: Statement
 * extension function for create Statement -> FunctionDeclarationImpl
 */
fun WithStatement.functionDeclaration(block: FunctionDeclaration.() -> Unit): FunctionDeclaration {
    return FunctionDeclarationImpl().apply(block)
}

/**
 * WithStatement#body: Statement
 * extension function for create Statement -> VariableDeclarationImpl
 */
fun WithStatement.variableDeclaration(block: VariableDeclaration.() -> Unit): VariableDeclaration {
    return VariableDeclarationImpl().apply(block)
}

/**
 * WithStatement#body: Statement
 * extension function for create Statement -> TsInterfaceDeclarationImpl
 */
fun WithStatement.tsInterfaceDeclaration(block: TsInterfaceDeclaration.() -> Unit): TsInterfaceDeclaration {
    return TsInterfaceDeclarationImpl().apply(block)
}

/**
 * WithStatement#body: Statement
 * extension function for create Statement -> TsTypeAliasDeclarationImpl
 */
fun WithStatement.tsTypeAliasDeclaration(block: TsTypeAliasDeclaration.() -> Unit): TsTypeAliasDeclaration {
    return TsTypeAliasDeclarationImpl().apply(block)
}

/**
 * WithStatement#body: Statement
 * extension function for create Statement -> TsEnumDeclarationImpl
 */
fun WithStatement.tsEnumDeclaration(block: TsEnumDeclaration.() -> Unit): TsEnumDeclaration {
    return TsEnumDeclarationImpl().apply(block)
}

/**
 * WithStatement#body: Statement
 * extension function for create Statement -> TsModuleDeclarationImpl
 */
fun WithStatement.tsModuleDeclaration(block: TsModuleDeclaration.() -> Unit): TsModuleDeclaration {
    return TsModuleDeclarationImpl().apply(block)
}

/**
 * WithStatement#body: Statement
 * extension function for create Statement -> ExpressionStatementImpl
 */
fun WithStatement.expressionStatement(block: ExpressionStatement.() -> Unit): ExpressionStatement {
    return ExpressionStatementImpl().apply(block)
}

fun WithStatement.span(block: Span.() -> Unit): Span {
    return Span().apply(block)
}
