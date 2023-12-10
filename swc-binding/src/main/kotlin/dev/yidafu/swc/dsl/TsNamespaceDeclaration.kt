package dev.yidafu.swc.dsl

import dev.yidafu.swc.types.*

/**
 * TsNamespaceDeclaration#id: Identifier
 * extension function for create Identifier -> IdentifierImpl
 */
fun TsNamespaceDeclaration.identifier(block: Identifier.() -> Unit): Identifier {
    return IdentifierImpl().apply(block)
}

/**
 * TsNamespaceDeclaration#body: TsNamespaceBody
 * extension function for create TsNamespaceBody -> TsModuleBlockImpl
 */
fun TsNamespaceDeclaration.tsModuleBlock(block: TsModuleBlock.() -> Unit): TsModuleBlock {
    return TsModuleBlockImpl().apply(block)
}

fun TsNamespaceDeclaration.span(block: Span.() -> Unit): Span {
    return Span().apply(block)
}
