package dev.yidafu.swc.dsl

import dev.yidafu.swc.types.*

/**
 * ImportDeclaration#specifiers: Array<ImportSpecifier>
 * extension function for create Array<ImportSpecifier> -> NamedImportSpecifierImpl
 */
fun ImportDeclaration.namedImportSpecifier(block: NamedImportSpecifier.() -> Unit): NamedImportSpecifier {
    return NamedImportSpecifierImpl().apply(block)
}

/**
 * ImportDeclaration#specifiers: Array<ImportSpecifier>
 * extension function for create Array<ImportSpecifier> -> ImportDefaultSpecifierImpl
 */
fun ImportDeclaration.importDefaultSpecifier(block: ImportDefaultSpecifier.() -> Unit): ImportDefaultSpecifier {
    return ImportDefaultSpecifierImpl().apply(block)
}

/**
 * ImportDeclaration#specifiers: Array<ImportSpecifier>
 * extension function for create Array<ImportSpecifier> -> ImportNamespaceSpecifierImpl
 */
fun ImportDeclaration.importNamespaceSpecifier(block: ImportNamespaceSpecifier.() -> Unit): ImportNamespaceSpecifier {
    return ImportNamespaceSpecifierImpl().apply(block)
}

/**
 * ImportDeclaration#source: StringLiteral
 * extension function for create StringLiteral -> StringLiteralImpl
 */
fun ImportDeclaration.stringLiteral(block: StringLiteral.() -> Unit): StringLiteral {
    return StringLiteralImpl().apply(block)
}

/**
 * ImportDeclaration#asserts: ObjectExpression
 * extension function for create ObjectExpression -> ObjectExpressionImpl
 */
fun ImportDeclaration.objectExpression(block: ObjectExpression.() -> Unit): ObjectExpression {
    return ObjectExpressionImpl().apply(block)
}

fun ImportDeclaration.span(block: Span.() -> Unit): Span {
    return Span().apply(block)
}
