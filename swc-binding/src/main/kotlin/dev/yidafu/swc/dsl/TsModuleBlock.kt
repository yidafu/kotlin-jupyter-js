package dev.yidafu.swc.dsl

import dev.yidafu.swc.types.*

/**
 * TsModuleBlock#body: Array<ModuleItem>
 * extension function for create Array<ModuleItem> -> ImportDeclarationImpl
 */
fun TsModuleBlock.importDeclaration(block: ImportDeclaration.() -> Unit): ImportDeclaration {
    return ImportDeclarationImpl().apply(block)
}

/**
 * TsModuleBlock#body: Array<ModuleItem>
 * extension function for create Array<ModuleItem> -> ExportDeclarationImpl
 */
fun TsModuleBlock.exportDeclaration(block: ExportDeclaration.() -> Unit): ExportDeclaration {
    return ExportDeclarationImpl().apply(block)
}

/**
 * TsModuleBlock#body: Array<ModuleItem>
 * extension function for create Array<ModuleItem> -> ExportNamedDeclarationImpl
 */
fun TsModuleBlock.exportNamedDeclaration(block: ExportNamedDeclaration.() -> Unit): ExportNamedDeclaration {
    return ExportNamedDeclarationImpl().apply(block)
}

/**
 * TsModuleBlock#body: Array<ModuleItem>
 * extension function for create Array<ModuleItem> -> ExportDefaultDeclarationImpl
 */
fun TsModuleBlock.exportDefaultDeclaration(block: ExportDefaultDeclaration.() -> Unit): ExportDefaultDeclaration {
    return ExportDefaultDeclarationImpl().apply(block)
}

/**
 * TsModuleBlock#body: Array<ModuleItem>
 * extension function for create Array<ModuleItem> -> ExportDefaultExpressionImpl
 */
fun TsModuleBlock.exportDefaultExpression(block: ExportDefaultExpression.() -> Unit): ExportDefaultExpression {
    return ExportDefaultExpressionImpl().apply(block)
}

/**
 * TsModuleBlock#body: Array<ModuleItem>
 * extension function for create Array<ModuleItem> -> ExportAllDeclarationImpl
 */
fun TsModuleBlock.exportAllDeclaration(block: ExportAllDeclaration.() -> Unit): ExportAllDeclaration {
    return ExportAllDeclarationImpl().apply(block)
}

/**
 * TsModuleBlock#body: Array<ModuleItem>
 * extension function for create Array<ModuleItem> -> TsImportEqualsDeclarationImpl
 */
fun TsModuleBlock.tsImportEqualsDeclaration(block: TsImportEqualsDeclaration.() -> Unit): TsImportEqualsDeclaration {
    return TsImportEqualsDeclarationImpl().apply(block)
}

/**
 * TsModuleBlock#body: Array<ModuleItem>
 * extension function for create Array<ModuleItem> -> TsExportAssignmentImpl
 */
fun TsModuleBlock.tsExportAssignment(block: TsExportAssignment.() -> Unit): TsExportAssignment {
    return TsExportAssignmentImpl().apply(block)
}

/**
 * TsModuleBlock#body: Array<ModuleItem>
 * extension function for create Array<ModuleItem> -> TsNamespaceExportDeclarationImpl
 */
fun TsModuleBlock.tsNamespaceExportDeclaration(block: TsNamespaceExportDeclaration.() -> Unit): TsNamespaceExportDeclaration {
    return TsNamespaceExportDeclarationImpl().apply(block)
}

/**
 * TsModuleBlock#body: Array<ModuleItem>
 * extension function for create Array<ModuleItem> -> BlockStatementImpl
 */
fun TsModuleBlock.blockStatement(block: BlockStatement.() -> Unit): BlockStatement {
    return BlockStatementImpl().apply(block)
}

/**
 * TsModuleBlock#body: Array<ModuleItem>
 * extension function for create Array<ModuleItem> -> EmptyStatementImpl
 */
fun TsModuleBlock.emptyStatement(block: EmptyStatement.() -> Unit): EmptyStatement {
    return EmptyStatementImpl().apply(block)
}

/**
 * TsModuleBlock#body: Array<ModuleItem>
 * extension function for create Array<ModuleItem> -> DebuggerStatementImpl
 */
fun TsModuleBlock.debuggerStatement(block: DebuggerStatement.() -> Unit): DebuggerStatement {
    return DebuggerStatementImpl().apply(block)
}

/**
 * TsModuleBlock#body: Array<ModuleItem>
 * extension function for create Array<ModuleItem> -> WithStatementImpl
 */
fun TsModuleBlock.withStatement(block: WithStatement.() -> Unit): WithStatement {
    return WithStatementImpl().apply(block)
}

/**
 * TsModuleBlock#body: Array<ModuleItem>
 * extension function for create Array<ModuleItem> -> ReturnStatementImpl
 */
fun TsModuleBlock.returnStatement(block: ReturnStatement.() -> Unit): ReturnStatement {
    return ReturnStatementImpl().apply(block)
}

/**
 * TsModuleBlock#body: Array<ModuleItem>
 * extension function for create Array<ModuleItem> -> LabeledStatementImpl
 */
fun TsModuleBlock.labeledStatement(block: LabeledStatement.() -> Unit): LabeledStatement {
    return LabeledStatementImpl().apply(block)
}

/**
 * TsModuleBlock#body: Array<ModuleItem>
 * extension function for create Array<ModuleItem> -> BreakStatementImpl
 */
fun TsModuleBlock.breakStatement(block: BreakStatement.() -> Unit): BreakStatement {
    return BreakStatementImpl().apply(block)
}

/**
 * TsModuleBlock#body: Array<ModuleItem>
 * extension function for create Array<ModuleItem> -> ContinueStatementImpl
 */
fun TsModuleBlock.continueStatement(block: ContinueStatement.() -> Unit): ContinueStatement {
    return ContinueStatementImpl().apply(block)
}

/**
 * TsModuleBlock#body: Array<ModuleItem>
 * extension function for create Array<ModuleItem> -> IfStatementImpl
 */
fun TsModuleBlock.ifStatement(block: IfStatement.() -> Unit): IfStatement {
    return IfStatementImpl().apply(block)
}

/**
 * TsModuleBlock#body: Array<ModuleItem>
 * extension function for create Array<ModuleItem> -> SwitchStatementImpl
 */
fun TsModuleBlock.switchStatement(block: SwitchStatement.() -> Unit): SwitchStatement {
    return SwitchStatementImpl().apply(block)
}

/**
 * TsModuleBlock#body: Array<ModuleItem>
 * extension function for create Array<ModuleItem> -> ThrowStatementImpl
 */
fun TsModuleBlock.throwStatement(block: ThrowStatement.() -> Unit): ThrowStatement {
    return ThrowStatementImpl().apply(block)
}

/**
 * TsModuleBlock#body: Array<ModuleItem>
 * extension function for create Array<ModuleItem> -> TryStatementImpl
 */
fun TsModuleBlock.tryStatement(block: TryStatement.() -> Unit): TryStatement {
    return TryStatementImpl().apply(block)
}

/**
 * TsModuleBlock#body: Array<ModuleItem>
 * extension function for create Array<ModuleItem> -> WhileStatementImpl
 */
fun TsModuleBlock.whileStatement(block: WhileStatement.() -> Unit): WhileStatement {
    return WhileStatementImpl().apply(block)
}

/**
 * TsModuleBlock#body: Array<ModuleItem>
 * extension function for create Array<ModuleItem> -> DoWhileStatementImpl
 */
fun TsModuleBlock.doWhileStatement(block: DoWhileStatement.() -> Unit): DoWhileStatement {
    return DoWhileStatementImpl().apply(block)
}

/**
 * TsModuleBlock#body: Array<ModuleItem>
 * extension function for create Array<ModuleItem> -> ForStatementImpl
 */
fun TsModuleBlock.forStatement(block: ForStatement.() -> Unit): ForStatement {
    return ForStatementImpl().apply(block)
}

/**
 * TsModuleBlock#body: Array<ModuleItem>
 * extension function for create Array<ModuleItem> -> ForInStatementImpl
 */
fun TsModuleBlock.forInStatement(block: ForInStatement.() -> Unit): ForInStatement {
    return ForInStatementImpl().apply(block)
}

/**
 * TsModuleBlock#body: Array<ModuleItem>
 * extension function for create Array<ModuleItem> -> ForOfStatementImpl
 */
fun TsModuleBlock.forOfStatement(block: ForOfStatement.() -> Unit): ForOfStatement {
    return ForOfStatementImpl().apply(block)
}

/**
 * TsModuleBlock#body: Array<ModuleItem>
 * extension function for create Array<ModuleItem> -> ClassDeclarationImpl
 */
fun TsModuleBlock.classDeclaration(block: ClassDeclaration.() -> Unit): ClassDeclaration {
    return ClassDeclarationImpl().apply(block)
}

/**
 * TsModuleBlock#body: Array<ModuleItem>
 * extension function for create Array<ModuleItem> -> FunctionDeclarationImpl
 */
fun TsModuleBlock.functionDeclaration(block: FunctionDeclaration.() -> Unit): FunctionDeclaration {
    return FunctionDeclarationImpl().apply(block)
}

/**
 * TsModuleBlock#body: Array<ModuleItem>
 * extension function for create Array<ModuleItem> -> VariableDeclarationImpl
 */
fun TsModuleBlock.variableDeclaration(block: VariableDeclaration.() -> Unit): VariableDeclaration {
    return VariableDeclarationImpl().apply(block)
}

/**
 * TsModuleBlock#body: Array<ModuleItem>
 * extension function for create Array<ModuleItem> -> TsInterfaceDeclarationImpl
 */
fun TsModuleBlock.tsInterfaceDeclaration(block: TsInterfaceDeclaration.() -> Unit): TsInterfaceDeclaration {
    return TsInterfaceDeclarationImpl().apply(block)
}

/**
 * TsModuleBlock#body: Array<ModuleItem>
 * extension function for create Array<ModuleItem> -> TsTypeAliasDeclarationImpl
 */
fun TsModuleBlock.tsTypeAliasDeclaration(block: TsTypeAliasDeclaration.() -> Unit): TsTypeAliasDeclaration {
    return TsTypeAliasDeclarationImpl().apply(block)
}

/**
 * TsModuleBlock#body: Array<ModuleItem>
 * extension function for create Array<ModuleItem> -> TsEnumDeclarationImpl
 */
fun TsModuleBlock.tsEnumDeclaration(block: TsEnumDeclaration.() -> Unit): TsEnumDeclaration {
    return TsEnumDeclarationImpl().apply(block)
}

/**
 * TsModuleBlock#body: Array<ModuleItem>
 * extension function for create Array<ModuleItem> -> TsModuleDeclarationImpl
 */
fun TsModuleBlock.tsModuleDeclaration(block: TsModuleDeclaration.() -> Unit): TsModuleDeclaration {
    return TsModuleDeclarationImpl().apply(block)
}

/**
 * TsModuleBlock#body: Array<ModuleItem>
 * extension function for create Array<ModuleItem> -> ExpressionStatementImpl
 */
fun TsModuleBlock.expressionStatement(block: ExpressionStatement.() -> Unit): ExpressionStatement {
    return ExpressionStatementImpl().apply(block)
}

fun TsModuleBlock.span(block: Span.() -> Unit): Span {
    return Span().apply(block)
}
