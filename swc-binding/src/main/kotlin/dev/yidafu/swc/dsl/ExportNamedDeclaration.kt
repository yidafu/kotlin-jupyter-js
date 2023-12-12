package dev.yidafu.swc.dsl

import dev.yidafu.swc.types.*

/**
 * ExportNamedDeclaration#specifiers: Array<ExportSpecifier>
 * extension function for create Array<ExportSpecifier> -> ExportNamespaceSpecifierImpl
 */
fun ExportNamedDeclaration.exportNamespaceSpecifier(block: ExportNamespaceSpecifier.() -> Unit): ExportNamespaceSpecifier {
    return ExportNamespaceSpecifierImpl().apply(block)
}

/**
 * ExportNamedDeclaration#specifiers: Array<ExportSpecifier>
 * extension function for create Array<ExportSpecifier> -> ExportDefaultSpecifierImpl
 */
fun ExportNamedDeclaration.exportDefaultSpecifier(block: ExportDefaultSpecifier.() -> Unit): ExportDefaultSpecifier {
    return ExportDefaultSpecifierImpl().apply(block)
}

/**
 * ExportNamedDeclaration#specifiers: Array<ExportSpecifier>
 * extension function for create Array<ExportSpecifier> -> NamedExportSpecifierImpl
 */
fun ExportNamedDeclaration.namedExportSpecifier(block: NamedExportSpecifier.() -> Unit): NamedExportSpecifier {
    return NamedExportSpecifierImpl().apply(block)
}

/**
 * ExportNamedDeclaration#source: StringLiteral
 * extension function for create StringLiteral -> StringLiteralImpl
 */
fun ExportNamedDeclaration.stringLiteral(block: StringLiteral.() -> Unit): StringLiteral {
    return StringLiteralImpl().apply(block)
}

/**
 * ExportNamedDeclaration#asserts: ObjectExpression
 * extension function for create ObjectExpression -> ObjectExpressionImpl
 */
fun ExportNamedDeclaration.objectExpression(block: ObjectExpression.() -> Unit): ObjectExpression {
    return ObjectExpressionImpl().apply(block)
}

fun ExportNamedDeclaration.span(block: Span.() -> Unit): Span {
    return Span().apply(block)
}
