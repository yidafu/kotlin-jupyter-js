package dev.yidafu.swc.dsl

import dev.yidafu.swc.types.*

/**
 * ForInStatement#body: Statement
 * extension function for create Statement -> VariableDeclarationImpl
 */
fun ForInStatement.variableDeclaration(block: VariableDeclaration.() -> Unit): VariableDeclaration {
    return VariableDeclarationImpl().apply(block)
}

/**
 * ForInStatement#left: Union.U2<VariableDeclaration, Pattern>
 * extension function for create Union.U2<VariableDeclaration, Pattern> -> BindingIdentifierImpl
 */
fun ForInStatement.bindingIdentifier(block: BindingIdentifier.() -> Unit): BindingIdentifier {
    return BindingIdentifierImpl().apply(block)
}

/**
 * ForInStatement#left: Union.U2<VariableDeclaration, Pattern>
 * extension function for create Union.U2<VariableDeclaration, Pattern> -> ArrayPatternImpl
 */
fun ForInStatement.arrayPattern(block: ArrayPattern.() -> Unit): ArrayPattern {
    return ArrayPatternImpl().apply(block)
}

/**
 * ForInStatement#left: Union.U2<VariableDeclaration, Pattern>
 * extension function for create Union.U2<VariableDeclaration, Pattern> -> RestElementImpl
 */
fun ForInStatement.restElement(block: RestElement.() -> Unit): RestElement {
    return RestElementImpl().apply(block)
}

/**
 * ForInStatement#left: Union.U2<VariableDeclaration, Pattern>
 * extension function for create Union.U2<VariableDeclaration, Pattern> -> ObjectPatternImpl
 */
fun ForInStatement.objectPattern(block: ObjectPattern.() -> Unit): ObjectPattern {
    return ObjectPatternImpl().apply(block)
}

/**
 * ForInStatement#left: Union.U2<VariableDeclaration, Pattern>
 * extension function for create Union.U2<VariableDeclaration, Pattern> -> AssignmentPatternImpl
 */
fun ForInStatement.assignmentPattern(block: AssignmentPattern.() -> Unit): AssignmentPattern {
    return AssignmentPatternImpl().apply(block)
}

/**
 * ForInStatement#right: Expression
 * extension function for create Expression -> InvalidImpl
 */
fun ForInStatement.invalid(block: Invalid.() -> Unit): Invalid {
    return InvalidImpl().apply(block)
}

/**
 * ForInStatement#right: Expression
 * extension function for create Expression -> ThisExpressionImpl
 */
fun ForInStatement.thisExpression(block: ThisExpression.() -> Unit): ThisExpression {
    return ThisExpressionImpl().apply(block)
}

/**
 * ForInStatement#right: Expression
 * extension function for create Expression -> ArrayExpressionImpl
 */
fun ForInStatement.arrayExpression(block: ArrayExpression.() -> Unit): ArrayExpression {
    return ArrayExpressionImpl().apply(block)
}

/**
 * ForInStatement#right: Expression
 * extension function for create Expression -> ObjectExpressionImpl
 */
fun ForInStatement.objectExpression(block: ObjectExpression.() -> Unit): ObjectExpression {
    return ObjectExpressionImpl().apply(block)
}

/**
 * ForInStatement#right: Expression
 * extension function for create Expression -> FunctionExpressionImpl
 */
fun ForInStatement.functionExpression(block: FunctionExpression.() -> Unit): FunctionExpression {
    return FunctionExpressionImpl().apply(block)
}

/**
 * ForInStatement#right: Expression
 * extension function for create Expression -> UnaryExpressionImpl
 */
fun ForInStatement.unaryExpression(block: UnaryExpression.() -> Unit): UnaryExpression {
    return UnaryExpressionImpl().apply(block)
}

/**
 * ForInStatement#right: Expression
 * extension function for create Expression -> UpdateExpressionImpl
 */
fun ForInStatement.updateExpression(block: UpdateExpression.() -> Unit): UpdateExpression {
    return UpdateExpressionImpl().apply(block)
}

/**
 * ForInStatement#right: Expression
 * extension function for create Expression -> BinaryExpressionImpl
 */
fun ForInStatement.binaryExpression(block: BinaryExpression.() -> Unit): BinaryExpression {
    return BinaryExpressionImpl().apply(block)
}

/**
 * ForInStatement#right: Expression
 * extension function for create Expression -> AssignmentExpressionImpl
 */
fun ForInStatement.assignmentExpression(block: AssignmentExpression.() -> Unit): AssignmentExpression {
    return AssignmentExpressionImpl().apply(block)
}

/**
 * ForInStatement#right: Expression
 * extension function for create Expression -> MemberExpressionImpl
 */
fun ForInStatement.memberExpression(block: MemberExpression.() -> Unit): MemberExpression {
    return MemberExpressionImpl().apply(block)
}

/**
 * ForInStatement#right: Expression
 * extension function for create Expression -> SuperPropExpressionImpl
 */
fun ForInStatement.superPropExpression(block: SuperPropExpression.() -> Unit): SuperPropExpression {
    return SuperPropExpressionImpl().apply(block)
}

/**
 * ForInStatement#right: Expression
 * extension function for create Expression -> ConditionalExpressionImpl
 */
fun ForInStatement.conditionalExpression(block: ConditionalExpression.() -> Unit): ConditionalExpression {
    return ConditionalExpressionImpl().apply(block)
}

/**
 * ForInStatement#right: Expression
 * extension function for create Expression -> CallExpressionImpl
 */
fun ForInStatement.callExpression(block: CallExpression.() -> Unit): CallExpression {
    return CallExpressionImpl().apply(block)
}

/**
 * ForInStatement#right: Expression
 * extension function for create Expression -> NewExpressionImpl
 */
fun ForInStatement.newExpression(block: NewExpression.() -> Unit): NewExpression {
    return NewExpressionImpl().apply(block)
}

/**
 * ForInStatement#right: Expression
 * extension function for create Expression -> SequenceExpressionImpl
 */
fun ForInStatement.sequenceExpression(block: SequenceExpression.() -> Unit): SequenceExpression {
    return SequenceExpressionImpl().apply(block)
}

/**
 * ForInStatement#right: Expression
 * extension function for create Expression -> IdentifierImpl
 */
fun ForInStatement.identifier(block: Identifier.() -> Unit): Identifier {
    return IdentifierImpl().apply(block)
}

/**
 * ForInStatement#right: Expression
 * extension function for create Expression -> StringLiteralImpl
 */
fun ForInStatement.stringLiteral(block: StringLiteral.() -> Unit): StringLiteral {
    return StringLiteralImpl().apply(block)
}

/**
 * ForInStatement#right: Expression
 * extension function for create Expression -> BooleanLiteralImpl
 */
fun ForInStatement.booleanLiteral(block: BooleanLiteral.() -> Unit): BooleanLiteral {
    return BooleanLiteralImpl().apply(block)
}

/**
 * ForInStatement#right: Expression
 * extension function for create Expression -> NullLiteralImpl
 */
fun ForInStatement.nullLiteral(block: NullLiteral.() -> Unit): NullLiteral {
    return NullLiteralImpl().apply(block)
}

/**
 * ForInStatement#right: Expression
 * extension function for create Expression -> NumericLiteralImpl
 */
fun ForInStatement.numericLiteral(block: NumericLiteral.() -> Unit): NumericLiteral {
    return NumericLiteralImpl().apply(block)
}

/**
 * ForInStatement#right: Expression
 * extension function for create Expression -> BigIntLiteralImpl
 */
fun ForInStatement.bigIntLiteral(block: BigIntLiteral.() -> Unit): BigIntLiteral {
    return BigIntLiteralImpl().apply(block)
}

/**
 * ForInStatement#right: Expression
 * extension function for create Expression -> RegExpLiteralImpl
 */
fun ForInStatement.regExpLiteral(block: RegExpLiteral.() -> Unit): RegExpLiteral {
    return RegExpLiteralImpl().apply(block)
}

/**
 * ForInStatement#right: Expression
 * extension function for create Expression -> JSXTextImpl
 */
fun ForInStatement.jSXText(block: JSXText.() -> Unit): JSXText {
    return JSXTextImpl().apply(block)
}

/**
 * ForInStatement#right: Expression
 * extension function for create Expression -> TemplateLiteralImpl
 */
fun ForInStatement.templateLiteral(block: TemplateLiteral.() -> Unit): TemplateLiteral {
    return TemplateLiteralImpl().apply(block)
}

/**
 * ForInStatement#right: Expression
 * extension function for create Expression -> TaggedTemplateExpressionImpl
 */
fun ForInStatement.taggedTemplateExpression(block: TaggedTemplateExpression.() -> Unit): TaggedTemplateExpression {
    return TaggedTemplateExpressionImpl().apply(block)
}

/**
 * ForInStatement#right: Expression
 * extension function for create Expression -> ArrowFunctionExpressionImpl
 */
fun ForInStatement.arrowFunctionExpression(block: ArrowFunctionExpression.() -> Unit): ArrowFunctionExpression {
    return ArrowFunctionExpressionImpl().apply(block)
}

/**
 * ForInStatement#right: Expression
 * extension function for create Expression -> ClassExpressionImpl
 */
fun ForInStatement.classExpression(block: ClassExpression.() -> Unit): ClassExpression {
    return ClassExpressionImpl().apply(block)
}

/**
 * ForInStatement#right: Expression
 * extension function for create Expression -> YieldExpressionImpl
 */
fun ForInStatement.yieldExpression(block: YieldExpression.() -> Unit): YieldExpression {
    return YieldExpressionImpl().apply(block)
}

/**
 * ForInStatement#right: Expression
 * extension function for create Expression -> MetaPropertyImpl
 */
fun ForInStatement.metaProperty(block: MetaProperty.() -> Unit): MetaProperty {
    return MetaPropertyImpl().apply(block)
}

/**
 * ForInStatement#right: Expression
 * extension function for create Expression -> AwaitExpressionImpl
 */
fun ForInStatement.awaitExpression(block: AwaitExpression.() -> Unit): AwaitExpression {
    return AwaitExpressionImpl().apply(block)
}

/**
 * ForInStatement#right: Expression
 * extension function for create Expression -> ParenthesisExpressionImpl
 */
fun ForInStatement.parenthesisExpression(block: ParenthesisExpression.() -> Unit): ParenthesisExpression {
    return ParenthesisExpressionImpl().apply(block)
}

/**
 * ForInStatement#right: Expression
 * extension function for create Expression -> JSXMemberExpressionImpl
 */
fun ForInStatement.jSXMemberExpression(block: JSXMemberExpression.() -> Unit): JSXMemberExpression {
    return JSXMemberExpressionImpl().apply(block)
}

/**
 * ForInStatement#right: Expression
 * extension function for create Expression -> JSXNamespacedNameImpl
 */
fun ForInStatement.jSXNamespacedName(block: JSXNamespacedName.() -> Unit): JSXNamespacedName {
    return JSXNamespacedNameImpl().apply(block)
}

/**
 * ForInStatement#right: Expression
 * extension function for create Expression -> JSXEmptyExpressionImpl
 */
fun ForInStatement.jSXEmptyExpression(block: JSXEmptyExpression.() -> Unit): JSXEmptyExpression {
    return JSXEmptyExpressionImpl().apply(block)
}

/**
 * ForInStatement#right: Expression
 * extension function for create Expression -> JSXElementImpl
 */
fun ForInStatement.jSXElement(block: JSXElement.() -> Unit): JSXElement {
    return JSXElementImpl().apply(block)
}

/**
 * ForInStatement#right: Expression
 * extension function for create Expression -> JSXFragmentImpl
 */
fun ForInStatement.jSXFragment(block: JSXFragment.() -> Unit): JSXFragment {
    return JSXFragmentImpl().apply(block)
}

/**
 * ForInStatement#right: Expression
 * extension function for create Expression -> TsTypeAssertionImpl
 */
fun ForInStatement.tsTypeAssertion(block: TsTypeAssertion.() -> Unit): TsTypeAssertion {
    return TsTypeAssertionImpl().apply(block)
}

/**
 * ForInStatement#right: Expression
 * extension function for create Expression -> TsConstAssertionImpl
 */
fun ForInStatement.tsConstAssertion(block: TsConstAssertion.() -> Unit): TsConstAssertion {
    return TsConstAssertionImpl().apply(block)
}

/**
 * ForInStatement#right: Expression
 * extension function for create Expression -> TsNonNullExpressionImpl
 */
fun ForInStatement.tsNonNullExpression(block: TsNonNullExpression.() -> Unit): TsNonNullExpression {
    return TsNonNullExpressionImpl().apply(block)
}

/**
 * ForInStatement#right: Expression
 * extension function for create Expression -> TsAsExpressionImpl
 */
fun ForInStatement.tsAsExpression(block: TsAsExpression.() -> Unit): TsAsExpression {
    return TsAsExpressionImpl().apply(block)
}

/**
 * ForInStatement#right: Expression
 * extension function for create Expression -> TsSatisfiesExpressionImpl
 */
fun ForInStatement.tsSatisfiesExpression(block: TsSatisfiesExpression.() -> Unit): TsSatisfiesExpression {
    return TsSatisfiesExpressionImpl().apply(block)
}

/**
 * ForInStatement#right: Expression
 * extension function for create Expression -> TsInstantiationImpl
 */
fun ForInStatement.tsInstantiation(block: TsInstantiation.() -> Unit): TsInstantiation {
    return TsInstantiationImpl().apply(block)
}

/**
 * ForInStatement#right: Expression
 * extension function for create Expression -> PrivateNameImpl
 */
fun ForInStatement.privateName(block: PrivateName.() -> Unit): PrivateName {
    return PrivateNameImpl().apply(block)
}

/**
 * ForInStatement#right: Expression
 * extension function for create Expression -> OptionalChainingExpressionImpl
 */
fun ForInStatement.optionalChainingExpression(block: OptionalChainingExpression.() -> Unit): OptionalChainingExpression {
    return OptionalChainingExpressionImpl().apply(block)
}

/**
 * ForInStatement#body: Statement
 * extension function for create Statement -> BlockStatementImpl
 */
fun ForInStatement.blockStatement(block: BlockStatement.() -> Unit): BlockStatement {
    return BlockStatementImpl().apply(block)
}

/**
 * ForInStatement#body: Statement
 * extension function for create Statement -> EmptyStatementImpl
 */
fun ForInStatement.emptyStatement(block: EmptyStatement.() -> Unit): EmptyStatement {
    return EmptyStatementImpl().apply(block)
}

/**
 * ForInStatement#body: Statement
 * extension function for create Statement -> DebuggerStatementImpl
 */
fun ForInStatement.debuggerStatement(block: DebuggerStatement.() -> Unit): DebuggerStatement {
    return DebuggerStatementImpl().apply(block)
}

/**
 * ForInStatement#body: Statement
 * extension function for create Statement -> WithStatementImpl
 */
fun ForInStatement.withStatement(block: WithStatement.() -> Unit): WithStatement {
    return WithStatementImpl().apply(block)
}

/**
 * ForInStatement#body: Statement
 * extension function for create Statement -> ReturnStatementImpl
 */
fun ForInStatement.returnStatement(block: ReturnStatement.() -> Unit): ReturnStatement {
    return ReturnStatementImpl().apply(block)
}

/**
 * ForInStatement#body: Statement
 * extension function for create Statement -> LabeledStatementImpl
 */
fun ForInStatement.labeledStatement(block: LabeledStatement.() -> Unit): LabeledStatement {
    return LabeledStatementImpl().apply(block)
}

/**
 * ForInStatement#body: Statement
 * extension function for create Statement -> BreakStatementImpl
 */
fun ForInStatement.breakStatement(block: BreakStatement.() -> Unit): BreakStatement {
    return BreakStatementImpl().apply(block)
}

/**
 * ForInStatement#body: Statement
 * extension function for create Statement -> ContinueStatementImpl
 */
fun ForInStatement.continueStatement(block: ContinueStatement.() -> Unit): ContinueStatement {
    return ContinueStatementImpl().apply(block)
}

/**
 * ForInStatement#body: Statement
 * extension function for create Statement -> IfStatementImpl
 */
fun ForInStatement.ifStatement(block: IfStatement.() -> Unit): IfStatement {
    return IfStatementImpl().apply(block)
}

/**
 * ForInStatement#body: Statement
 * extension function for create Statement -> SwitchStatementImpl
 */
fun ForInStatement.switchStatement(block: SwitchStatement.() -> Unit): SwitchStatement {
    return SwitchStatementImpl().apply(block)
}

/**
 * ForInStatement#body: Statement
 * extension function for create Statement -> ThrowStatementImpl
 */
fun ForInStatement.throwStatement(block: ThrowStatement.() -> Unit): ThrowStatement {
    return ThrowStatementImpl().apply(block)
}

/**
 * ForInStatement#body: Statement
 * extension function for create Statement -> TryStatementImpl
 */
fun ForInStatement.tryStatement(block: TryStatement.() -> Unit): TryStatement {
    return TryStatementImpl().apply(block)
}

/**
 * ForInStatement#body: Statement
 * extension function for create Statement -> WhileStatementImpl
 */
fun ForInStatement.whileStatement(block: WhileStatement.() -> Unit): WhileStatement {
    return WhileStatementImpl().apply(block)
}

/**
 * ForInStatement#body: Statement
 * extension function for create Statement -> DoWhileStatementImpl
 */
fun ForInStatement.doWhileStatement(block: DoWhileStatement.() -> Unit): DoWhileStatement {
    return DoWhileStatementImpl().apply(block)
}

/**
 * ForInStatement#body: Statement
 * extension function for create Statement -> ForStatementImpl
 */
fun ForInStatement.forStatement(block: ForStatement.() -> Unit): ForStatement {
    return ForStatementImpl().apply(block)
}

/**
 * ForInStatement#body: Statement
 * extension function for create Statement -> ForOfStatementImpl
 */
fun ForInStatement.forOfStatement(block: ForOfStatement.() -> Unit): ForOfStatement {
    return ForOfStatementImpl().apply(block)
}

/**
 * ForInStatement#body: Statement
 * extension function for create Statement -> ClassDeclarationImpl
 */
fun ForInStatement.classDeclaration(block: ClassDeclaration.() -> Unit): ClassDeclaration {
    return ClassDeclarationImpl().apply(block)
}

/**
 * ForInStatement#body: Statement
 * extension function for create Statement -> FunctionDeclarationImpl
 */
fun ForInStatement.functionDeclaration(block: FunctionDeclaration.() -> Unit): FunctionDeclaration {
    return FunctionDeclarationImpl().apply(block)
}

/**
 * ForInStatement#body: Statement
 * extension function for create Statement -> TsInterfaceDeclarationImpl
 */
fun ForInStatement.tsInterfaceDeclaration(block: TsInterfaceDeclaration.() -> Unit): TsInterfaceDeclaration {
    return TsInterfaceDeclarationImpl().apply(block)
}

/**
 * ForInStatement#body: Statement
 * extension function for create Statement -> TsTypeAliasDeclarationImpl
 */
fun ForInStatement.tsTypeAliasDeclaration(block: TsTypeAliasDeclaration.() -> Unit): TsTypeAliasDeclaration {
    return TsTypeAliasDeclarationImpl().apply(block)
}

/**
 * ForInStatement#body: Statement
 * extension function for create Statement -> TsEnumDeclarationImpl
 */
fun ForInStatement.tsEnumDeclaration(block: TsEnumDeclaration.() -> Unit): TsEnumDeclaration {
    return TsEnumDeclarationImpl().apply(block)
}

/**
 * ForInStatement#body: Statement
 * extension function for create Statement -> TsModuleDeclarationImpl
 */
fun ForInStatement.tsModuleDeclaration(block: TsModuleDeclaration.() -> Unit): TsModuleDeclaration {
    return TsModuleDeclarationImpl().apply(block)
}

/**
 * ForInStatement#body: Statement
 * extension function for create Statement -> ExpressionStatementImpl
 */
fun ForInStatement.expressionStatement(block: ExpressionStatement.() -> Unit): ExpressionStatement {
    return ExpressionStatementImpl().apply(block)
}

fun ForInStatement.span(block: Span.() -> Unit): Span {
    return Span().apply(block)
}
