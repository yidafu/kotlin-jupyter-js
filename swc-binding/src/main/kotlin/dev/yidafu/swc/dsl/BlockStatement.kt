package dev.yidafu.swc.dsl

import dev.yidafu.swc.types.*

/**
 * BlockStatement#stmts: Array<Statement>
 * extension function for create Array<Statement> -> EmptyStatementImpl
 */
fun BlockStatement.emptyStatement(block: EmptyStatement.() -> Unit): EmptyStatement {
    return EmptyStatementImpl().apply(block)
}

/**
 * BlockStatement#stmts: Array<Statement>
 * extension function for create Array<Statement> -> DebuggerStatementImpl
 */
fun BlockStatement.debuggerStatement(block: DebuggerStatement.() -> Unit): DebuggerStatement {
    return DebuggerStatementImpl().apply(block)
}

/**
 * BlockStatement#stmts: Array<Statement>
 * extension function for create Array<Statement> -> WithStatementImpl
 */
fun BlockStatement.withStatement(block: WithStatement.() -> Unit): WithStatement {
    return WithStatementImpl().apply(block)
}

/**
 * BlockStatement#stmts: Array<Statement>
 * extension function for create Array<Statement> -> ReturnStatementImpl
 */
fun BlockStatement.returnStatement(block: ReturnStatement.() -> Unit): ReturnStatement {
    return ReturnStatementImpl().apply(block)
}

/**
 * BlockStatement#stmts: Array<Statement>
 * extension function for create Array<Statement> -> LabeledStatementImpl
 */
fun BlockStatement.labeledStatement(block: LabeledStatement.() -> Unit): LabeledStatement {
    return LabeledStatementImpl().apply(block)
}

/**
 * BlockStatement#stmts: Array<Statement>
 * extension function for create Array<Statement> -> BreakStatementImpl
 */
fun BlockStatement.breakStatement(block: BreakStatement.() -> Unit): BreakStatement {
    return BreakStatementImpl().apply(block)
}

/**
 * BlockStatement#stmts: Array<Statement>
 * extension function for create Array<Statement> -> ContinueStatementImpl
 */
fun BlockStatement.continueStatement(block: ContinueStatement.() -> Unit): ContinueStatement {
    return ContinueStatementImpl().apply(block)
}

/**
 * BlockStatement#stmts: Array<Statement>
 * extension function for create Array<Statement> -> IfStatementImpl
 */
fun BlockStatement.ifStatement(block: IfStatement.() -> Unit): IfStatement {
    return IfStatementImpl().apply(block)
}

/**
 * BlockStatement#stmts: Array<Statement>
 * extension function for create Array<Statement> -> SwitchStatementImpl
 */
fun BlockStatement.switchStatement(block: SwitchStatement.() -> Unit): SwitchStatement {
    return SwitchStatementImpl().apply(block)
}

/**
 * BlockStatement#stmts: Array<Statement>
 * extension function for create Array<Statement> -> ThrowStatementImpl
 */
fun BlockStatement.throwStatement(block: ThrowStatement.() -> Unit): ThrowStatement {
    return ThrowStatementImpl().apply(block)
}

/**
 * BlockStatement#stmts: Array<Statement>
 * extension function for create Array<Statement> -> TryStatementImpl
 */
fun BlockStatement.tryStatement(block: TryStatement.() -> Unit): TryStatement {
    return TryStatementImpl().apply(block)
}

/**
 * BlockStatement#stmts: Array<Statement>
 * extension function for create Array<Statement> -> WhileStatementImpl
 */
fun BlockStatement.whileStatement(block: WhileStatement.() -> Unit): WhileStatement {
    return WhileStatementImpl().apply(block)
}

/**
 * BlockStatement#stmts: Array<Statement>
 * extension function for create Array<Statement> -> DoWhileStatementImpl
 */
fun BlockStatement.doWhileStatement(block: DoWhileStatement.() -> Unit): DoWhileStatement {
    return DoWhileStatementImpl().apply(block)
}

/**
 * BlockStatement#stmts: Array<Statement>
 * extension function for create Array<Statement> -> ForStatementImpl
 */
fun BlockStatement.forStatement(block: ForStatement.() -> Unit): ForStatement {
    return ForStatementImpl().apply(block)
}

/**
 * BlockStatement#stmts: Array<Statement>
 * extension function for create Array<Statement> -> ForInStatementImpl
 */
fun BlockStatement.forInStatement(block: ForInStatement.() -> Unit): ForInStatement {
    return ForInStatementImpl().apply(block)
}

/**
 * BlockStatement#stmts: Array<Statement>
 * extension function for create Array<Statement> -> ForOfStatementImpl
 */
fun BlockStatement.forOfStatement(block: ForOfStatement.() -> Unit): ForOfStatement {
    return ForOfStatementImpl().apply(block)
}

/**
 * BlockStatement#stmts: Array<Statement>
 * extension function for create Array<Statement> -> ClassDeclarationImpl
 */
fun BlockStatement.classDeclaration(block: ClassDeclaration.() -> Unit): ClassDeclaration {
    return ClassDeclarationImpl().apply(block)
}

/**
 * BlockStatement#stmts: Array<Statement>
 * extension function for create Array<Statement> -> FunctionDeclarationImpl
 */
fun BlockStatement.functionDeclaration(block: FunctionDeclaration.() -> Unit): FunctionDeclaration {
    return FunctionDeclarationImpl().apply(block)
}

/**
 * BlockStatement#stmts: Array<Statement>
 * extension function for create Array<Statement> -> VariableDeclarationImpl
 */
fun BlockStatement.variableDeclaration(block: VariableDeclaration.() -> Unit): VariableDeclaration {
    return VariableDeclarationImpl().apply(block)
}

/**
 * BlockStatement#stmts: Array<Statement>
 * extension function for create Array<Statement> -> TsInterfaceDeclarationImpl
 */
fun BlockStatement.tsInterfaceDeclaration(block: TsInterfaceDeclaration.() -> Unit): TsInterfaceDeclaration {
    return TsInterfaceDeclarationImpl().apply(block)
}

/**
 * BlockStatement#stmts: Array<Statement>
 * extension function for create Array<Statement> -> TsTypeAliasDeclarationImpl
 */
fun BlockStatement.tsTypeAliasDeclaration(block: TsTypeAliasDeclaration.() -> Unit): TsTypeAliasDeclaration {
    return TsTypeAliasDeclarationImpl().apply(block)
}

/**
 * BlockStatement#stmts: Array<Statement>
 * extension function for create Array<Statement> -> TsEnumDeclarationImpl
 */
fun BlockStatement.tsEnumDeclaration(block: TsEnumDeclaration.() -> Unit): TsEnumDeclaration {
    return TsEnumDeclarationImpl().apply(block)
}

/**
 * BlockStatement#stmts: Array<Statement>
 * extension function for create Array<Statement> -> TsModuleDeclarationImpl
 */
fun BlockStatement.tsModuleDeclaration(block: TsModuleDeclaration.() -> Unit): TsModuleDeclaration {
    return TsModuleDeclarationImpl().apply(block)
}

/**
 * BlockStatement#stmts: Array<Statement>
 * extension function for create Array<Statement> -> ExpressionStatementImpl
 */
fun BlockStatement.expressionStatement(block: ExpressionStatement.() -> Unit): ExpressionStatement {
    return ExpressionStatementImpl().apply(block)
}

fun BlockStatement.span(block: Span.() -> Unit): Span {
    return Span().apply(block)
}
