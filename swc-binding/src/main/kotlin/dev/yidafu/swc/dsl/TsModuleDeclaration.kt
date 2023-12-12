package dev.yidafu.swc.dsl

import dev.yidafu.swc.types.*

/**
 * TsModuleDeclaration#id: TsModuleName
 * extension function for create TsModuleName -> IdentifierImpl
 */
fun TsModuleDeclaration.identifier(block: Identifier.() -> Unit): Identifier {
    return IdentifierImpl().apply(block)
}

/**
 * TsModuleDeclaration#id: TsModuleName
 * extension function for create TsModuleName -> StringLiteralImpl
 */
fun TsModuleDeclaration.stringLiteral(block: StringLiteral.() -> Unit): StringLiteral {
    return StringLiteralImpl().apply(block)
}

/**
 * TsModuleDeclaration#body: TsNamespaceBody
 * extension function for create TsNamespaceBody -> TsModuleBlockImpl
 */
fun TsModuleDeclaration.tsModuleBlock(block: TsModuleBlock.() -> Unit): TsModuleBlock {
    return TsModuleBlockImpl().apply(block)
}

/**
 * TsModuleDeclaration#body: TsNamespaceBody
 * extension function for create TsNamespaceBody -> TsNamespaceDeclarationImpl
 */
fun TsModuleDeclaration.tsNamespaceDeclaration(block: TsNamespaceDeclaration.() -> Unit): TsNamespaceDeclaration {
    return TsNamespaceDeclarationImpl().apply(block)
}

fun TsModuleDeclaration.span(block: Span.() -> Unit): Span {
    return Span().apply(block)
}
