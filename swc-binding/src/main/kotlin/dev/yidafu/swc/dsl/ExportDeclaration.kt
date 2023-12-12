package dev.yidafu.swc.dsl

import dev.yidafu.swc.types.*

/**
 * ExportDeclaration#declaration: Declaration
 * extension function for create Declaration -> ClassDeclarationImpl
 */
fun ExportDeclaration.classDeclaration(block: ClassDeclaration.() -> Unit): ClassDeclaration {
    return ClassDeclarationImpl().apply(block)
}

/**
 * ExportDeclaration#declaration: Declaration
 * extension function for create Declaration -> FunctionDeclarationImpl
 */
fun ExportDeclaration.functionDeclaration(block: FunctionDeclaration.() -> Unit): FunctionDeclaration {
    return FunctionDeclarationImpl().apply(block)
}

/**
 * ExportDeclaration#declaration: Declaration
 * extension function for create Declaration -> VariableDeclarationImpl
 */
fun ExportDeclaration.variableDeclaration(block: VariableDeclaration.() -> Unit): VariableDeclaration {
    return VariableDeclarationImpl().apply(block)
}

/**
 * ExportDeclaration#declaration: Declaration
 * extension function for create Declaration -> TsInterfaceDeclarationImpl
 */
fun ExportDeclaration.tsInterfaceDeclaration(block: TsInterfaceDeclaration.() -> Unit): TsInterfaceDeclaration {
    return TsInterfaceDeclarationImpl().apply(block)
}

/**
 * ExportDeclaration#declaration: Declaration
 * extension function for create Declaration -> TsTypeAliasDeclarationImpl
 */
fun ExportDeclaration.tsTypeAliasDeclaration(block: TsTypeAliasDeclaration.() -> Unit): TsTypeAliasDeclaration {
    return TsTypeAliasDeclarationImpl().apply(block)
}

/**
 * ExportDeclaration#declaration: Declaration
 * extension function for create Declaration -> TsEnumDeclarationImpl
 */
fun ExportDeclaration.tsEnumDeclaration(block: TsEnumDeclaration.() -> Unit): TsEnumDeclaration {
    return TsEnumDeclarationImpl().apply(block)
}

/**
 * ExportDeclaration#declaration: Declaration
 * extension function for create Declaration -> TsModuleDeclarationImpl
 */
fun ExportDeclaration.tsModuleDeclaration(block: TsModuleDeclaration.() -> Unit): TsModuleDeclaration {
    return TsModuleDeclarationImpl().apply(block)
}

fun ExportDeclaration.span(block: Span.() -> Unit): Span {
    return Span().apply(block)
}
