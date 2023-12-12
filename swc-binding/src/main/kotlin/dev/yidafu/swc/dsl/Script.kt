package dev.yidafu.swc.dsl

import dev.yidafu.swc.types.*

/**
 * Script#body: Array<Statement>
 * extension function for create Array<Statement> -> BlockStatementImpl
 */
fun Script.blockStatement(block: BlockStatement.() -> Unit): BlockStatement {
    return BlockStatementImpl().apply(block)
}

/**
 * Script#body: Array<Statement>
 * extension function for create Array<Statement> -> EmptyStatementImpl
 */
fun Script.emptyStatement(block: EmptyStatement.() -> Unit): EmptyStatement {
    return EmptyStatementImpl().apply(block)
}

/**
 * Script#body: Array<Statement>
 * extension function for create Array<Statement> -> DebuggerStatementImpl
 */
fun Script.debuggerStatement(block: DebuggerStatement.() -> Unit): DebuggerStatement {
    return DebuggerStatementImpl().apply(block)
}

/**
 * Script#body: Array<Statement>
 * extension function for create Array<Statement> -> WithStatementImpl
 */
fun Script.withStatement(block: WithStatement.() -> Unit): WithStatement {
    return WithStatementImpl().apply(block)
}

/**
 * Script#body: Array<Statement>
 * extension function for create Array<Statement> -> ReturnStatementImpl
 */
fun Script.returnStatement(block: ReturnStatement.() -> Unit): ReturnStatement {
    return ReturnStatementImpl().apply(block)
}

/**
 * Script#body: Array<Statement>
 * extension function for create Array<Statement> -> LabeledStatementImpl
 */
fun Script.labeledStatement(block: LabeledStatement.() -> Unit): LabeledStatement {
    return LabeledStatementImpl().apply(block)
}

/**
 * Script#body: Array<Statement>
 * extension function for create Array<Statement> -> BreakStatementImpl
 */
fun Script.breakStatement(block: BreakStatement.() -> Unit): BreakStatement {
    return BreakStatementImpl().apply(block)
}

/**
 * Script#body: Array<Statement>
 * extension function for create Array<Statement> -> ContinueStatementImpl
 */
fun Script.continueStatement(block: ContinueStatement.() -> Unit): ContinueStatement {
    return ContinueStatementImpl().apply(block)
}

/**
 * Script#body: Array<Statement>
 * extension function for create Array<Statement> -> IfStatementImpl
 */
fun Script.ifStatement(block: IfStatement.() -> Unit): IfStatement {
    return IfStatementImpl().apply(block)
}

/**
 * Script#body: Array<Statement>
 * extension function for create Array<Statement> -> SwitchStatementImpl
 */
fun Script.switchStatement(block: SwitchStatement.() -> Unit): SwitchStatement {
    return SwitchStatementImpl().apply(block)
}

/**
 * Script#body: Array<Statement>
 * extension function for create Array<Statement> -> ThrowStatementImpl
 */
fun Script.throwStatement(block: ThrowStatement.() -> Unit): ThrowStatement {
    return ThrowStatementImpl().apply(block)
}

/**
 * Script#body: Array<Statement>
 * extension function for create Array<Statement> -> TryStatementImpl
 */
fun Script.tryStatement(block: TryStatement.() -> Unit): TryStatement {
    return TryStatementImpl().apply(block)
}

/**
 * Script#body: Array<Statement>
 * extension function for create Array<Statement> -> WhileStatementImpl
 */
fun Script.whileStatement(block: WhileStatement.() -> Unit): WhileStatement {
    return WhileStatementImpl().apply(block)
}

/**
 * Script#body: Array<Statement>
 * extension function for create Array<Statement> -> DoWhileStatementImpl
 */
fun Script.doWhileStatement(block: DoWhileStatement.() -> Unit): DoWhileStatement {
    return DoWhileStatementImpl().apply(block)
}

/**
 * Script#body: Array<Statement>
 * extension function for create Array<Statement> -> ForStatementImpl
 */
fun Script.forStatement(block: ForStatement.() -> Unit): ForStatement {
    return ForStatementImpl().apply(block)
}

/**
 * Script#body: Array<Statement>
 * extension function for create Array<Statement> -> ForInStatementImpl
 */
fun Script.forInStatement(block: ForInStatement.() -> Unit): ForInStatement {
    return ForInStatementImpl().apply(block)
}

/**
 * Script#body: Array<Statement>
 * extension function for create Array<Statement> -> ForOfStatementImpl
 */
fun Script.forOfStatement(block: ForOfStatement.() -> Unit): ForOfStatement {
    return ForOfStatementImpl().apply(block)
}

/**
 * Script#body: Array<Statement>
 * extension function for create Array<Statement> -> ClassDeclarationImpl
 */
fun Script.classDeclaration(block: ClassDeclaration.() -> Unit): ClassDeclaration {
    return ClassDeclarationImpl().apply(block)
}

/**
 * Script#body: Array<Statement>
 * extension function for create Array<Statement> -> FunctionDeclarationImpl
 */
fun Script.functionDeclaration(block: FunctionDeclaration.() -> Unit): FunctionDeclaration {
    return FunctionDeclarationImpl().apply(block)
}

/**
 * Script#body: Array<Statement>
 * extension function for create Array<Statement> -> VariableDeclarationImpl
 */
fun Script.variableDeclaration(block: VariableDeclaration.() -> Unit): VariableDeclaration {
    return VariableDeclarationImpl().apply(block)
}

/**
 * Script#body: Array<Statement>
 * extension function for create Array<Statement> -> TsInterfaceDeclarationImpl
 */
fun Script.tsInterfaceDeclaration(block: TsInterfaceDeclaration.() -> Unit): TsInterfaceDeclaration {
    return TsInterfaceDeclarationImpl().apply(block)
}

/**
 * Script#body: Array<Statement>
 * extension function for create Array<Statement> -> TsTypeAliasDeclarationImpl
 */
fun Script.tsTypeAliasDeclaration(block: TsTypeAliasDeclaration.() -> Unit): TsTypeAliasDeclaration {
    return TsTypeAliasDeclarationImpl().apply(block)
}

/**
 * Script#body: Array<Statement>
 * extension function for create Array<Statement> -> TsEnumDeclarationImpl
 */
fun Script.tsEnumDeclaration(block: TsEnumDeclaration.() -> Unit): TsEnumDeclaration {
    return TsEnumDeclarationImpl().apply(block)
}

/**
 * Script#body: Array<Statement>
 * extension function for create Array<Statement> -> TsModuleDeclarationImpl
 */
fun Script.tsModuleDeclaration(block: TsModuleDeclaration.() -> Unit): TsModuleDeclaration {
    return TsModuleDeclarationImpl().apply(block)
}

/**
 * Script#body: Array<Statement>
 * extension function for create Array<Statement> -> ExpressionStatementImpl
 */
fun Script.expressionStatement(block: ExpressionStatement.() -> Unit): ExpressionStatement {
    return ExpressionStatementImpl().apply(block)
}

fun Script.span(block: Span.() -> Unit): Span {
    return Span().apply(block)
}
