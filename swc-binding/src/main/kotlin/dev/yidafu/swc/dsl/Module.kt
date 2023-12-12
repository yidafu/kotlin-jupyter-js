package dev.yidafu.swc.dsl

import dev.yidafu.swc.types.*

/**
 * Module#body: Array<ModuleItem>
 * extension function for create Array<ModuleItem> -> ImportDeclarationImpl
 */
fun Module.importDeclaration(block: ImportDeclaration.() -> Unit): ImportDeclaration {
    return ImportDeclarationImpl().apply(block)
}

/**
 * Module#body: Array<ModuleItem>
 * extension function for create Array<ModuleItem> -> ExportDeclarationImpl
 */
fun Module.exportDeclaration(block: ExportDeclaration.() -> Unit): ExportDeclaration {
    return ExportDeclarationImpl().apply(block)
}

/**
 * Module#body: Array<ModuleItem>
 * extension function for create Array<ModuleItem> -> ExportNamedDeclarationImpl
 */
fun Module.exportNamedDeclaration(block: ExportNamedDeclaration.() -> Unit): ExportNamedDeclaration {
    return ExportNamedDeclarationImpl().apply(block)
}

/**
 * Module#body: Array<ModuleItem>
 * extension function for create Array<ModuleItem> -> ExportDefaultDeclarationImpl
 */
fun Module.exportDefaultDeclaration(block: ExportDefaultDeclaration.() -> Unit): ExportDefaultDeclaration {
    return ExportDefaultDeclarationImpl().apply(block)
}

/**
 * Module#body: Array<ModuleItem>
 * extension function for create Array<ModuleItem> -> ExportDefaultExpressionImpl
 */
fun Module.exportDefaultExpression(block: ExportDefaultExpression.() -> Unit): ExportDefaultExpression {
    return ExportDefaultExpressionImpl().apply(block)
}

/**
 * Module#body: Array<ModuleItem>
 * extension function for create Array<ModuleItem> -> ExportAllDeclarationImpl
 */
fun Module.exportAllDeclaration(block: ExportAllDeclaration.() -> Unit): ExportAllDeclaration {
    return ExportAllDeclarationImpl().apply(block)
}

/**
 * Module#body: Array<ModuleItem>
 * extension function for create Array<ModuleItem> -> TsImportEqualsDeclarationImpl
 */
fun Module.tsImportEqualsDeclaration(block: TsImportEqualsDeclaration.() -> Unit): TsImportEqualsDeclaration {
    return TsImportEqualsDeclarationImpl().apply(block)
}

/**
 * Module#body: Array<ModuleItem>
 * extension function for create Array<ModuleItem> -> TsExportAssignmentImpl
 */
fun Module.tsExportAssignment(block: TsExportAssignment.() -> Unit): TsExportAssignment {
    return TsExportAssignmentImpl().apply(block)
}

/**
 * Module#body: Array<ModuleItem>
 * extension function for create Array<ModuleItem> -> TsNamespaceExportDeclarationImpl
 */
fun Module.tsNamespaceExportDeclaration(block: TsNamespaceExportDeclaration.() -> Unit): TsNamespaceExportDeclaration {
    return TsNamespaceExportDeclarationImpl().apply(block)
}

/**
 * Module#body: Array<ModuleItem>
 * extension function for create Array<ModuleItem> -> BlockStatementImpl
 */
fun Module.blockStatement(block: BlockStatement.() -> Unit): BlockStatement {
    return BlockStatementImpl().apply(block)
}

/**
 * Module#body: Array<ModuleItem>
 * extension function for create Array<ModuleItem> -> EmptyStatementImpl
 */
fun Module.emptyStatement(block: EmptyStatement.() -> Unit): EmptyStatement {
    return EmptyStatementImpl().apply(block)
}

/**
 * Module#body: Array<ModuleItem>
 * extension function for create Array<ModuleItem> -> DebuggerStatementImpl
 */
fun Module.debuggerStatement(block: DebuggerStatement.() -> Unit): DebuggerStatement {
    return DebuggerStatementImpl().apply(block)
}

/**
 * Module#body: Array<ModuleItem>
 * extension function for create Array<ModuleItem> -> WithStatementImpl
 */
fun Module.withStatement(block: WithStatement.() -> Unit): WithStatement {
    return WithStatementImpl().apply(block)
}

/**
 * Module#body: Array<ModuleItem>
 * extension function for create Array<ModuleItem> -> ReturnStatementImpl
 */
fun Module.returnStatement(block: ReturnStatement.() -> Unit): ReturnStatement {
    return ReturnStatementImpl().apply(block)
}

/**
 * Module#body: Array<ModuleItem>
 * extension function for create Array<ModuleItem> -> LabeledStatementImpl
 */
fun Module.labeledStatement(block: LabeledStatement.() -> Unit): LabeledStatement {
    return LabeledStatementImpl().apply(block)
}

/**
 * Module#body: Array<ModuleItem>
 * extension function for create Array<ModuleItem> -> BreakStatementImpl
 */
fun Module.breakStatement(block: BreakStatement.() -> Unit): BreakStatement {
    return BreakStatementImpl().apply(block)
}

/**
 * Module#body: Array<ModuleItem>
 * extension function for create Array<ModuleItem> -> ContinueStatementImpl
 */
fun Module.continueStatement(block: ContinueStatement.() -> Unit): ContinueStatement {
    return ContinueStatementImpl().apply(block)
}

/**
 * Module#body: Array<ModuleItem>
 * extension function for create Array<ModuleItem> -> IfStatementImpl
 */
fun Module.ifStatement(block: IfStatement.() -> Unit): IfStatement {
    return IfStatementImpl().apply(block)
}

/**
 * Module#body: Array<ModuleItem>
 * extension function for create Array<ModuleItem> -> SwitchStatementImpl
 */
fun Module.switchStatement(block: SwitchStatement.() -> Unit): SwitchStatement {
    return SwitchStatementImpl().apply(block)
}

/**
 * Module#body: Array<ModuleItem>
 * extension function for create Array<ModuleItem> -> ThrowStatementImpl
 */
fun Module.throwStatement(block: ThrowStatement.() -> Unit): ThrowStatement {
    return ThrowStatementImpl().apply(block)
}

/**
 * Module#body: Array<ModuleItem>
 * extension function for create Array<ModuleItem> -> TryStatementImpl
 */
fun Module.tryStatement(block: TryStatement.() -> Unit): TryStatement {
    return TryStatementImpl().apply(block)
}

/**
 * Module#body: Array<ModuleItem>
 * extension function for create Array<ModuleItem> -> WhileStatementImpl
 */
fun Module.whileStatement(block: WhileStatement.() -> Unit): WhileStatement {
    return WhileStatementImpl().apply(block)
}

/**
 * Module#body: Array<ModuleItem>
 * extension function for create Array<ModuleItem> -> DoWhileStatementImpl
 */
fun Module.doWhileStatement(block: DoWhileStatement.() -> Unit): DoWhileStatement {
    return DoWhileStatementImpl().apply(block)
}

/**
 * Module#body: Array<ModuleItem>
 * extension function for create Array<ModuleItem> -> ForStatementImpl
 */
fun Module.forStatement(block: ForStatement.() -> Unit): ForStatement {
    return ForStatementImpl().apply(block)
}

/**
 * Module#body: Array<ModuleItem>
 * extension function for create Array<ModuleItem> -> ForInStatementImpl
 */
fun Module.forInStatement(block: ForInStatement.() -> Unit): ForInStatement {
    return ForInStatementImpl().apply(block)
}

/**
 * Module#body: Array<ModuleItem>
 * extension function for create Array<ModuleItem> -> ForOfStatementImpl
 */
fun Module.forOfStatement(block: ForOfStatement.() -> Unit): ForOfStatement {
    return ForOfStatementImpl().apply(block)
}

/**
 * Module#body: Array<ModuleItem>
 * extension function for create Array<ModuleItem> -> ClassDeclarationImpl
 */
fun Module.classDeclaration(block: ClassDeclaration.() -> Unit): ClassDeclaration {
    return ClassDeclarationImpl().apply(block)
}

/**
 * Module#body: Array<ModuleItem>
 * extension function for create Array<ModuleItem> -> FunctionDeclarationImpl
 */
fun Module.functionDeclaration(block: FunctionDeclaration.() -> Unit): FunctionDeclaration {
    return FunctionDeclarationImpl().apply(block)
}

/**
 * Module#body: Array<ModuleItem>
 * extension function for create Array<ModuleItem> -> VariableDeclarationImpl
 */
fun Module.variableDeclaration(block: VariableDeclaration.() -> Unit): VariableDeclaration {
    return VariableDeclarationImpl().apply(block)
}

/**
 * Module#body: Array<ModuleItem>
 * extension function for create Array<ModuleItem> -> TsInterfaceDeclarationImpl
 */
fun Module.tsInterfaceDeclaration(block: TsInterfaceDeclaration.() -> Unit): TsInterfaceDeclaration {
    return TsInterfaceDeclarationImpl().apply(block)
}

/**
 * Module#body: Array<ModuleItem>
 * extension function for create Array<ModuleItem> -> TsTypeAliasDeclarationImpl
 */
fun Module.tsTypeAliasDeclaration(block: TsTypeAliasDeclaration.() -> Unit): TsTypeAliasDeclaration {
    return TsTypeAliasDeclarationImpl().apply(block)
}

/**
 * Module#body: Array<ModuleItem>
 * extension function for create Array<ModuleItem> -> TsEnumDeclarationImpl
 */
fun Module.tsEnumDeclaration(block: TsEnumDeclaration.() -> Unit): TsEnumDeclaration {
    return TsEnumDeclarationImpl().apply(block)
}

/**
 * Module#body: Array<ModuleItem>
 * extension function for create Array<ModuleItem> -> TsModuleDeclarationImpl
 */
fun Module.tsModuleDeclaration(block: TsModuleDeclaration.() -> Unit): TsModuleDeclaration {
    return TsModuleDeclarationImpl().apply(block)
}

/**
 * Module#body: Array<ModuleItem>
 * extension function for create Array<ModuleItem> -> ExpressionStatementImpl
 */
fun Module.expressionStatement(block: ExpressionStatement.() -> Unit): ExpressionStatement {
    return ExpressionStatementImpl().apply(block)
}

fun Module.span(block: Span.() -> Unit): Span {
    return Span().apply(block)
}
