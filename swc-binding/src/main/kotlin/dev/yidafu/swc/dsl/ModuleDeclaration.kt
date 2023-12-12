package dev.yidafu.swc.dsl

import dev.yidafu.swc.types.*

/**
 * subtype of ModuleDeclaration
 */
fun ModuleDeclaration.importDeclaration(block: ImportDeclaration.() -> Unit): ImportDeclaration {
    return ImportDeclarationImpl().apply(block)
}

/**
 * subtype of ModuleDeclaration
 */
fun ModuleDeclaration.exportDeclaration(block: ExportDeclaration.() -> Unit): ExportDeclaration {
    return ExportDeclarationImpl().apply(block)
}

/**
 * subtype of ModuleDeclaration
 */
fun ModuleDeclaration.exportNamedDeclaration(block: ExportNamedDeclaration.() -> Unit): ExportNamedDeclaration {
    return ExportNamedDeclarationImpl().apply(block)
}

/**
 * subtype of ModuleDeclaration
 */
fun ModuleDeclaration.exportDefaultDeclaration(block: ExportDefaultDeclaration.() -> Unit): ExportDefaultDeclaration {
    return ExportDefaultDeclarationImpl().apply(block)
}

/**
 * subtype of ModuleDeclaration
 */
fun ModuleDeclaration.exportDefaultExpression(block: ExportDefaultExpression.() -> Unit): ExportDefaultExpression {
    return ExportDefaultExpressionImpl().apply(block)
}

/**
 * subtype of ModuleDeclaration
 */
fun ModuleDeclaration.exportAllDeclaration(block: ExportAllDeclaration.() -> Unit): ExportAllDeclaration {
    return ExportAllDeclarationImpl().apply(block)
}

/**
 * subtype of ModuleDeclaration
 */
fun ModuleDeclaration.tsImportEqualsDeclaration(block: TsImportEqualsDeclaration.() -> Unit): TsImportEqualsDeclaration {
    return TsImportEqualsDeclarationImpl().apply(block)
}

/**
 * subtype of ModuleDeclaration
 */
fun ModuleDeclaration.tsExportAssignment(block: TsExportAssignment.() -> Unit): TsExportAssignment {
    return TsExportAssignmentImpl().apply(block)
}

/**
 * subtype of ModuleDeclaration
 */
fun ModuleDeclaration.tsNamespaceExportDeclaration(block: TsNamespaceExportDeclaration.() -> Unit): TsNamespaceExportDeclaration {
    return TsNamespaceExportDeclarationImpl().apply(block)
}
