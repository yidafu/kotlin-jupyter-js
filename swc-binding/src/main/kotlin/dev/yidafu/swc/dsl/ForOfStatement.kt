package dev.yidafu.swc.dsl

import dev.yidafu.swc.types.*

fun ForOfStatement.span(block: Span.() -> Unit): Span {
    return Span().apply(block)
}

/**
 * ForOfStatement#body: Statement
 * extension function for create Statement -> VariableDeclarationImpl
 */
fun ForOfStatement.variableDeclaration(block: VariableDeclaration.() -> Unit): VariableDeclaration {
    return VariableDeclarationImpl().apply(block)
}

/**
 * ForOfStatement#left: Union.U2<VariableDeclaration, Pattern>
 * extension function for create Union.U2<VariableDeclaration, Pattern> -> BindingIdentifierImpl
 */
fun ForOfStatement.bindingIdentifier(block: BindingIdentifier.() -> Unit): BindingIdentifier {
    return BindingIdentifierImpl().apply(block)
}

/**
 * ForOfStatement#left: Union.U2<VariableDeclaration, Pattern>
 * extension function for create Union.U2<VariableDeclaration, Pattern> -> ArrayPatternImpl
 */
fun ForOfStatement.arrayPattern(block: ArrayPattern.() -> Unit): ArrayPattern {
    return ArrayPatternImpl().apply(block)
}

/**
 * ForOfStatement#left: Union.U2<VariableDeclaration, Pattern>
 * extension function for create Union.U2<VariableDeclaration, Pattern> -> RestElementImpl
 */
fun ForOfStatement.restElement(block: RestElement.() -> Unit): RestElement {
    return RestElementImpl().apply(block)
}

/**
 * ForOfStatement#left: Union.U2<VariableDeclaration, Pattern>
 * extension function for create Union.U2<VariableDeclaration, Pattern> -> ObjectPatternImpl
 */
fun ForOfStatement.objectPattern(block: ObjectPattern.() -> Unit): ObjectPattern {
    return ObjectPatternImpl().apply(block)
}

/**
 * ForOfStatement#left: Union.U2<VariableDeclaration, Pattern>
 * extension function for create Union.U2<VariableDeclaration, Pattern> -> AssignmentPatternImpl
 */
fun ForOfStatement.assignmentPattern(block: AssignmentPattern.() -> Unit): AssignmentPattern {
    return AssignmentPatternImpl().apply(block)
}

/**
 * ForOfStatement#right: Expression
 * extension function for create Expression -> InvalidImpl
 */
fun ForOfStatement.invalid(block: Invalid.() -> Unit): Invalid {
    return InvalidImpl().apply(block)
}

/**
 * ForOfStatement#right: Expression
 * extension function for create Expression -> ThisExpressionImpl
 */
fun ForOfStatement.thisExpression(block: ThisExpression.() -> Unit): ThisExpression {
    return ThisExpressionImpl().apply(block)
}

/**
 * ForOfStatement#right: Expression
 * extension function for create Expression -> ArrayExpressionImpl
 */
fun ForOfStatement.arrayExpression(block: ArrayExpression.() -> Unit): ArrayExpression {
    return ArrayExpressionImpl().apply(block)
}

/**
 * ForOfStatement#right: Expression
 * extension function for create Expression -> ObjectExpressionImpl
 */
fun ForOfStatement.objectExpression(block: ObjectExpression.() -> Unit): ObjectExpression {
    return ObjectExpressionImpl().apply(block)
}

/**
 * ForOfStatement#right: Expression
 * extension function for create Expression -> FunctionExpressionImpl
 */
fun ForOfStatement.functionExpression(block: FunctionExpression.() -> Unit): FunctionExpression {
    return FunctionExpressionImpl().apply(block)
}

/**
 * ForOfStatement#right: Expression
 * extension function for create Expression -> UnaryExpressionImpl
 */
fun ForOfStatement.unaryExpression(block: UnaryExpression.() -> Unit): UnaryExpression {
    return UnaryExpressionImpl().apply(block)
}

/**
 * ForOfStatement#right: Expression
 * extension function for create Expression -> UpdateExpressionImpl
 */
fun ForOfStatement.updateExpression(block: UpdateExpression.() -> Unit): UpdateExpression {
    return UpdateExpressionImpl().apply(block)
}

/**
 * ForOfStatement#right: Expression
 * extension function for create Expression -> BinaryExpressionImpl
 */
fun ForOfStatement.binaryExpression(block: BinaryExpression.() -> Unit): BinaryExpression {
    return BinaryExpressionImpl().apply(block)
}

/**
 * ForOfStatement#right: Expression
 * extension function for create Expression -> AssignmentExpressionImpl
 */
fun ForOfStatement.assignmentExpression(block: AssignmentExpression.() -> Unit): AssignmentExpression {
    return AssignmentExpressionImpl().apply(block)
}

/**
 * ForOfStatement#right: Expression
 * extension function for create Expression -> MemberExpressionImpl
 */
fun ForOfStatement.memberExpression(block: MemberExpression.() -> Unit): MemberExpression {
    return MemberExpressionImpl().apply(block)
}

/**
 * ForOfStatement#right: Expression
 * extension function for create Expression -> SuperPropExpressionImpl
 */
fun ForOfStatement.superPropExpression(block: SuperPropExpression.() -> Unit): SuperPropExpression {
    return SuperPropExpressionImpl().apply(block)
}

/**
 * ForOfStatement#right: Expression
 * extension function for create Expression -> ConditionalExpressionImpl
 */
fun ForOfStatement.conditionalExpression(block: ConditionalExpression.() -> Unit): ConditionalExpression {
    return ConditionalExpressionImpl().apply(block)
}

/**
 * ForOfStatement#right: Expression
 * extension function for create Expression -> CallExpressionImpl
 */
fun ForOfStatement.callExpression(block: CallExpression.() -> Unit): CallExpression {
    return CallExpressionImpl().apply(block)
}

/**
 * ForOfStatement#right: Expression
 * extension function for create Expression -> NewExpressionImpl
 */
fun ForOfStatement.newExpression(block: NewExpression.() -> Unit): NewExpression {
    return NewExpressionImpl().apply(block)
}

/**
 * ForOfStatement#right: Expression
 * extension function for create Expression -> SequenceExpressionImpl
 */
fun ForOfStatement.sequenceExpression(block: SequenceExpression.() -> Unit): SequenceExpression {
    return SequenceExpressionImpl().apply(block)
}

/**
 * ForOfStatement#right: Expression
 * extension function for create Expression -> IdentifierImpl
 */
fun ForOfStatement.identifier(block: Identifier.() -> Unit): Identifier {
    return IdentifierImpl().apply(block)
}

/**
 * ForOfStatement#right: Expression
 * extension function for create Expression -> StringLiteralImpl
 */
fun ForOfStatement.stringLiteral(block: StringLiteral.() -> Unit): StringLiteral {
    return StringLiteralImpl().apply(block)
}

/**
 * ForOfStatement#right: Expression
 * extension function for create Expression -> BooleanLiteralImpl
 */
fun ForOfStatement.booleanLiteral(block: BooleanLiteral.() -> Unit): BooleanLiteral {
    return BooleanLiteralImpl().apply(block)
}

/**
 * ForOfStatement#right: Expression
 * extension function for create Expression -> NullLiteralImpl
 */
fun ForOfStatement.nullLiteral(block: NullLiteral.() -> Unit): NullLiteral {
    return NullLiteralImpl().apply(block)
}

/**
 * ForOfStatement#right: Expression
 * extension function for create Expression -> NumericLiteralImpl
 */
fun ForOfStatement.numericLiteral(block: NumericLiteral.() -> Unit): NumericLiteral {
    return NumericLiteralImpl().apply(block)
}

/**
 * ForOfStatement#right: Expression
 * extension function for create Expression -> BigIntLiteralImpl
 */
fun ForOfStatement.bigIntLiteral(block: BigIntLiteral.() -> Unit): BigIntLiteral {
    return BigIntLiteralImpl().apply(block)
}

/**
 * ForOfStatement#right: Expression
 * extension function for create Expression -> RegExpLiteralImpl
 */
fun ForOfStatement.regExpLiteral(block: RegExpLiteral.() -> Unit): RegExpLiteral {
    return RegExpLiteralImpl().apply(block)
}

/**
 * ForOfStatement#right: Expression
 * extension function for create Expression -> JSXTextImpl
 */
fun ForOfStatement.jSXText(block: JSXText.() -> Unit): JSXText {
    return JSXTextImpl().apply(block)
}

/**
 * ForOfStatement#right: Expression
 * extension function for create Expression -> TemplateLiteralImpl
 */
fun ForOfStatement.templateLiteral(block: TemplateLiteral.() -> Unit): TemplateLiteral {
    return TemplateLiteralImpl().apply(block)
}

/**
 * ForOfStatement#right: Expression
 * extension function for create Expression -> TaggedTemplateExpressionImpl
 */
fun ForOfStatement.taggedTemplateExpression(block: TaggedTemplateExpression.() -> Unit): TaggedTemplateExpression {
    return TaggedTemplateExpressionImpl().apply(block)
}

/**
 * ForOfStatement#right: Expression
 * extension function for create Expression -> ArrowFunctionExpressionImpl
 */
fun ForOfStatement.arrowFunctionExpression(block: ArrowFunctionExpression.() -> Unit): ArrowFunctionExpression {
    return ArrowFunctionExpressionImpl().apply(block)
}

/**
 * ForOfStatement#right: Expression
 * extension function for create Expression -> ClassExpressionImpl
 */
fun ForOfStatement.classExpression(block: ClassExpression.() -> Unit): ClassExpression {
    return ClassExpressionImpl().apply(block)
}

/**
 * ForOfStatement#right: Expression
 * extension function for create Expression -> YieldExpressionImpl
 */
fun ForOfStatement.yieldExpression(block: YieldExpression.() -> Unit): YieldExpression {
    return YieldExpressionImpl().apply(block)
}

/**
 * ForOfStatement#right: Expression
 * extension function for create Expression -> MetaPropertyImpl
 */
fun ForOfStatement.metaProperty(block: MetaProperty.() -> Unit): MetaProperty {
    return MetaPropertyImpl().apply(block)
}

/**
 * ForOfStatement#right: Expression
 * extension function for create Expression -> AwaitExpressionImpl
 */
fun ForOfStatement.awaitExpression(block: AwaitExpression.() -> Unit): AwaitExpression {
    return AwaitExpressionImpl().apply(block)
}

/**
 * ForOfStatement#right: Expression
 * extension function for create Expression -> ParenthesisExpressionImpl
 */
fun ForOfStatement.parenthesisExpression(block: ParenthesisExpression.() -> Unit): ParenthesisExpression {
    return ParenthesisExpressionImpl().apply(block)
}

/**
 * ForOfStatement#right: Expression
 * extension function for create Expression -> JSXMemberExpressionImpl
 */
fun ForOfStatement.jSXMemberExpression(block: JSXMemberExpression.() -> Unit): JSXMemberExpression {
    return JSXMemberExpressionImpl().apply(block)
}

/**
 * ForOfStatement#right: Expression
 * extension function for create Expression -> JSXNamespacedNameImpl
 */
fun ForOfStatement.jSXNamespacedName(block: JSXNamespacedName.() -> Unit): JSXNamespacedName {
    return JSXNamespacedNameImpl().apply(block)
}

/**
 * ForOfStatement#right: Expression
 * extension function for create Expression -> JSXEmptyExpressionImpl
 */
fun ForOfStatement.jSXEmptyExpression(block: JSXEmptyExpression.() -> Unit): JSXEmptyExpression {
    return JSXEmptyExpressionImpl().apply(block)
}

/**
 * ForOfStatement#right: Expression
 * extension function for create Expression -> JSXElementImpl
 */
fun ForOfStatement.jSXElement(block: JSXElement.() -> Unit): JSXElement {
    return JSXElementImpl().apply(block)
}

/**
 * ForOfStatement#right: Expression
 * extension function for create Expression -> JSXFragmentImpl
 */
fun ForOfStatement.jSXFragment(block: JSXFragment.() -> Unit): JSXFragment {
    return JSXFragmentImpl().apply(block)
}

/**
 * ForOfStatement#right: Expression
 * extension function for create Expression -> TsTypeAssertionImpl
 */
fun ForOfStatement.tsTypeAssertion(block: TsTypeAssertion.() -> Unit): TsTypeAssertion {
    return TsTypeAssertionImpl().apply(block)
}

/**
 * ForOfStatement#right: Expression
 * extension function for create Expression -> TsConstAssertionImpl
 */
fun ForOfStatement.tsConstAssertion(block: TsConstAssertion.() -> Unit): TsConstAssertion {
    return TsConstAssertionImpl().apply(block)
}

/**
 * ForOfStatement#right: Expression
 * extension function for create Expression -> TsNonNullExpressionImpl
 */
fun ForOfStatement.tsNonNullExpression(block: TsNonNullExpression.() -> Unit): TsNonNullExpression {
    return TsNonNullExpressionImpl().apply(block)
}

/**
 * ForOfStatement#right: Expression
 * extension function for create Expression -> TsAsExpressionImpl
 */
fun ForOfStatement.tsAsExpression(block: TsAsExpression.() -> Unit): TsAsExpression {
    return TsAsExpressionImpl().apply(block)
}

/**
 * ForOfStatement#right: Expression
 * extension function for create Expression -> TsSatisfiesExpressionImpl
 */
fun ForOfStatement.tsSatisfiesExpression(block: TsSatisfiesExpression.() -> Unit): TsSatisfiesExpression {
    return TsSatisfiesExpressionImpl().apply(block)
}

/**
 * ForOfStatement#right: Expression
 * extension function for create Expression -> TsInstantiationImpl
 */
fun ForOfStatement.tsInstantiation(block: TsInstantiation.() -> Unit): TsInstantiation {
    return TsInstantiationImpl().apply(block)
}

/**
 * ForOfStatement#right: Expression
 * extension function for create Expression -> PrivateNameImpl
 */
fun ForOfStatement.privateName(block: PrivateName.() -> Unit): PrivateName {
    return PrivateNameImpl().apply(block)
}

/**
 * ForOfStatement#right: Expression
 * extension function for create Expression -> OptionalChainingExpressionImpl
 */
fun ForOfStatement.optionalChainingExpression(block: OptionalChainingExpression.() -> Unit): OptionalChainingExpression {
    return OptionalChainingExpressionImpl().apply(block)
}

/**
 * ForOfStatement#body: Statement
 * extension function for create Statement -> BlockStatementImpl
 */
fun ForOfStatement.blockStatement(block: BlockStatement.() -> Unit): BlockStatement {
    return BlockStatementImpl().apply(block)
}

/**
 * ForOfStatement#body: Statement
 * extension function for create Statement -> EmptyStatementImpl
 */
fun ForOfStatement.emptyStatement(block: EmptyStatement.() -> Unit): EmptyStatement {
    return EmptyStatementImpl().apply(block)
}

/**
 * ForOfStatement#body: Statement
 * extension function for create Statement -> DebuggerStatementImpl
 */
fun ForOfStatement.debuggerStatement(block: DebuggerStatement.() -> Unit): DebuggerStatement {
    return DebuggerStatementImpl().apply(block)
}

/**
 * ForOfStatement#body: Statement
 * extension function for create Statement -> WithStatementImpl
 */
fun ForOfStatement.withStatement(block: WithStatement.() -> Unit): WithStatement {
    return WithStatementImpl().apply(block)
}

/**
 * ForOfStatement#body: Statement
 * extension function for create Statement -> ReturnStatementImpl
 */
fun ForOfStatement.returnStatement(block: ReturnStatement.() -> Unit): ReturnStatement {
    return ReturnStatementImpl().apply(block)
}

/**
 * ForOfStatement#body: Statement
 * extension function for create Statement -> LabeledStatementImpl
 */
fun ForOfStatement.labeledStatement(block: LabeledStatement.() -> Unit): LabeledStatement {
    return LabeledStatementImpl().apply(block)
}

/**
 * ForOfStatement#body: Statement
 * extension function for create Statement -> BreakStatementImpl
 */
fun ForOfStatement.breakStatement(block: BreakStatement.() -> Unit): BreakStatement {
    return BreakStatementImpl().apply(block)
}

/**
 * ForOfStatement#body: Statement
 * extension function for create Statement -> ContinueStatementImpl
 */
fun ForOfStatement.continueStatement(block: ContinueStatement.() -> Unit): ContinueStatement {
    return ContinueStatementImpl().apply(block)
}

/**
 * ForOfStatement#body: Statement
 * extension function for create Statement -> IfStatementImpl
 */
fun ForOfStatement.ifStatement(block: IfStatement.() -> Unit): IfStatement {
    return IfStatementImpl().apply(block)
}

/**
 * ForOfStatement#body: Statement
 * extension function for create Statement -> SwitchStatementImpl
 */
fun ForOfStatement.switchStatement(block: SwitchStatement.() -> Unit): SwitchStatement {
    return SwitchStatementImpl().apply(block)
}

/**
 * ForOfStatement#body: Statement
 * extension function for create Statement -> ThrowStatementImpl
 */
fun ForOfStatement.throwStatement(block: ThrowStatement.() -> Unit): ThrowStatement {
    return ThrowStatementImpl().apply(block)
}

/**
 * ForOfStatement#body: Statement
 * extension function for create Statement -> TryStatementImpl
 */
fun ForOfStatement.tryStatement(block: TryStatement.() -> Unit): TryStatement {
    return TryStatementImpl().apply(block)
}

/**
 * ForOfStatement#body: Statement
 * extension function for create Statement -> WhileStatementImpl
 */
fun ForOfStatement.whileStatement(block: WhileStatement.() -> Unit): WhileStatement {
    return WhileStatementImpl().apply(block)
}

/**
 * ForOfStatement#body: Statement
 * extension function for create Statement -> DoWhileStatementImpl
 */
fun ForOfStatement.doWhileStatement(block: DoWhileStatement.() -> Unit): DoWhileStatement {
    return DoWhileStatementImpl().apply(block)
}

/**
 * ForOfStatement#body: Statement
 * extension function for create Statement -> ForStatementImpl
 */
fun ForOfStatement.forStatement(block: ForStatement.() -> Unit): ForStatement {
    return ForStatementImpl().apply(block)
}

/**
 * ForOfStatement#body: Statement
 * extension function for create Statement -> ForInStatementImpl
 */
fun ForOfStatement.forInStatement(block: ForInStatement.() -> Unit): ForInStatement {
    return ForInStatementImpl().apply(block)
}

/**
 * ForOfStatement#body: Statement
 * extension function for create Statement -> ClassDeclarationImpl
 */
fun ForOfStatement.classDeclaration(block: ClassDeclaration.() -> Unit): ClassDeclaration {
    return ClassDeclarationImpl().apply(block)
}

/**
 * ForOfStatement#body: Statement
 * extension function for create Statement -> FunctionDeclarationImpl
 */
fun ForOfStatement.functionDeclaration(block: FunctionDeclaration.() -> Unit): FunctionDeclaration {
    return FunctionDeclarationImpl().apply(block)
}

/**
 * ForOfStatement#body: Statement
 * extension function for create Statement -> TsInterfaceDeclarationImpl
 */
fun ForOfStatement.tsInterfaceDeclaration(block: TsInterfaceDeclaration.() -> Unit): TsInterfaceDeclaration {
    return TsInterfaceDeclarationImpl().apply(block)
}

/**
 * ForOfStatement#body: Statement
 * extension function for create Statement -> TsTypeAliasDeclarationImpl
 */
fun ForOfStatement.tsTypeAliasDeclaration(block: TsTypeAliasDeclaration.() -> Unit): TsTypeAliasDeclaration {
    return TsTypeAliasDeclarationImpl().apply(block)
}

/**
 * ForOfStatement#body: Statement
 * extension function for create Statement -> TsEnumDeclarationImpl
 */
fun ForOfStatement.tsEnumDeclaration(block: TsEnumDeclaration.() -> Unit): TsEnumDeclaration {
    return TsEnumDeclarationImpl().apply(block)
}

/**
 * ForOfStatement#body: Statement
 * extension function for create Statement -> TsModuleDeclarationImpl
 */
fun ForOfStatement.tsModuleDeclaration(block: TsModuleDeclaration.() -> Unit): TsModuleDeclaration {
    return TsModuleDeclarationImpl().apply(block)
}

/**
 * ForOfStatement#body: Statement
 * extension function for create Statement -> ExpressionStatementImpl
 */
fun ForOfStatement.expressionStatement(block: ExpressionStatement.() -> Unit): ExpressionStatement {
    return ExpressionStatementImpl().apply(block)
}
