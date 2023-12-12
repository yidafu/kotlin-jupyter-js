package dev.yidafu.swc.dsl

import dev.yidafu.swc.types.*

/**
 * LabeledStatement#label: Identifier
 * extension function for create Identifier -> IdentifierImpl
 */
fun LabeledStatement.identifier(block: Identifier.() -> Unit): Identifier {
    return IdentifierImpl().apply(block)
}

/**
 * LabeledStatement#body: Statement
 * extension function for create Statement -> BlockStatementImpl
 */
fun LabeledStatement.blockStatement(block: BlockStatement.() -> Unit): BlockStatement {
    return BlockStatementImpl().apply(block)
}

/**
 * LabeledStatement#body: Statement
 * extension function for create Statement -> EmptyStatementImpl
 */
fun LabeledStatement.emptyStatement(block: EmptyStatement.() -> Unit): EmptyStatement {
    return EmptyStatementImpl().apply(block)
}

/**
 * LabeledStatement#body: Statement
 * extension function for create Statement -> DebuggerStatementImpl
 */
fun LabeledStatement.debuggerStatement(block: DebuggerStatement.() -> Unit): DebuggerStatement {
    return DebuggerStatementImpl().apply(block)
}

/**
 * LabeledStatement#body: Statement
 * extension function for create Statement -> WithStatementImpl
 */
fun LabeledStatement.withStatement(block: WithStatement.() -> Unit): WithStatement {
    return WithStatementImpl().apply(block)
}

/**
 * LabeledStatement#body: Statement
 * extension function for create Statement -> ReturnStatementImpl
 */
fun LabeledStatement.returnStatement(block: ReturnStatement.() -> Unit): ReturnStatement {
    return ReturnStatementImpl().apply(block)
}

/**
 * LabeledStatement#body: Statement
 * extension function for create Statement -> BreakStatementImpl
 */
fun LabeledStatement.breakStatement(block: BreakStatement.() -> Unit): BreakStatement {
    return BreakStatementImpl().apply(block)
}

/**
 * LabeledStatement#body: Statement
 * extension function for create Statement -> ContinueStatementImpl
 */
fun LabeledStatement.continueStatement(block: ContinueStatement.() -> Unit): ContinueStatement {
    return ContinueStatementImpl().apply(block)
}

/**
 * LabeledStatement#body: Statement
 * extension function for create Statement -> IfStatementImpl
 */
fun LabeledStatement.ifStatement(block: IfStatement.() -> Unit): IfStatement {
    return IfStatementImpl().apply(block)
}

/**
 * LabeledStatement#body: Statement
 * extension function for create Statement -> SwitchStatementImpl
 */
fun LabeledStatement.switchStatement(block: SwitchStatement.() -> Unit): SwitchStatement {
    return SwitchStatementImpl().apply(block)
}

/**
 * LabeledStatement#body: Statement
 * extension function for create Statement -> ThrowStatementImpl
 */
fun LabeledStatement.throwStatement(block: ThrowStatement.() -> Unit): ThrowStatement {
    return ThrowStatementImpl().apply(block)
}

/**
 * LabeledStatement#body: Statement
 * extension function for create Statement -> TryStatementImpl
 */
fun LabeledStatement.tryStatement(block: TryStatement.() -> Unit): TryStatement {
    return TryStatementImpl().apply(block)
}

/**
 * LabeledStatement#body: Statement
 * extension function for create Statement -> WhileStatementImpl
 */
fun LabeledStatement.whileStatement(block: WhileStatement.() -> Unit): WhileStatement {
    return WhileStatementImpl().apply(block)
}

/**
 * LabeledStatement#body: Statement
 * extension function for create Statement -> DoWhileStatementImpl
 */
fun LabeledStatement.doWhileStatement(block: DoWhileStatement.() -> Unit): DoWhileStatement {
    return DoWhileStatementImpl().apply(block)
}

/**
 * LabeledStatement#body: Statement
 * extension function for create Statement -> ForStatementImpl
 */
fun LabeledStatement.forStatement(block: ForStatement.() -> Unit): ForStatement {
    return ForStatementImpl().apply(block)
}

/**
 * LabeledStatement#body: Statement
 * extension function for create Statement -> ForInStatementImpl
 */
fun LabeledStatement.forInStatement(block: ForInStatement.() -> Unit): ForInStatement {
    return ForInStatementImpl().apply(block)
}

/**
 * LabeledStatement#body: Statement
 * extension function for create Statement -> ForOfStatementImpl
 */
fun LabeledStatement.forOfStatement(block: ForOfStatement.() -> Unit): ForOfStatement {
    return ForOfStatementImpl().apply(block)
}

/**
 * LabeledStatement#body: Statement
 * extension function for create Statement -> ClassDeclarationImpl
 */
fun LabeledStatement.classDeclaration(block: ClassDeclaration.() -> Unit): ClassDeclaration {
    return ClassDeclarationImpl().apply(block)
}

/**
 * LabeledStatement#body: Statement
 * extension function for create Statement -> FunctionDeclarationImpl
 */
fun LabeledStatement.functionDeclaration(block: FunctionDeclaration.() -> Unit): FunctionDeclaration {
    return FunctionDeclarationImpl().apply(block)
}

/**
 * LabeledStatement#body: Statement
 * extension function for create Statement -> VariableDeclarationImpl
 */
fun LabeledStatement.variableDeclaration(block: VariableDeclaration.() -> Unit): VariableDeclaration {
    return VariableDeclarationImpl().apply(block)
}

/**
 * LabeledStatement#body: Statement
 * extension function for create Statement -> TsInterfaceDeclarationImpl
 */
fun LabeledStatement.tsInterfaceDeclaration(block: TsInterfaceDeclaration.() -> Unit): TsInterfaceDeclaration {
    return TsInterfaceDeclarationImpl().apply(block)
}

/**
 * LabeledStatement#body: Statement
 * extension function for create Statement -> TsTypeAliasDeclarationImpl
 */
fun LabeledStatement.tsTypeAliasDeclaration(block: TsTypeAliasDeclaration.() -> Unit): TsTypeAliasDeclaration {
    return TsTypeAliasDeclarationImpl().apply(block)
}

/**
 * LabeledStatement#body: Statement
 * extension function for create Statement -> TsEnumDeclarationImpl
 */
fun LabeledStatement.tsEnumDeclaration(block: TsEnumDeclaration.() -> Unit): TsEnumDeclaration {
    return TsEnumDeclarationImpl().apply(block)
}

/**
 * LabeledStatement#body: Statement
 * extension function for create Statement -> TsModuleDeclarationImpl
 */
fun LabeledStatement.tsModuleDeclaration(block: TsModuleDeclaration.() -> Unit): TsModuleDeclaration {
    return TsModuleDeclarationImpl().apply(block)
}

/**
 * LabeledStatement#body: Statement
 * extension function for create Statement -> ExpressionStatementImpl
 */
fun LabeledStatement.expressionStatement(block: ExpressionStatement.() -> Unit): ExpressionStatement {
    return ExpressionStatementImpl().apply(block)
}

fun LabeledStatement.span(block: Span.() -> Unit): Span {
    return Span().apply(block)
}
