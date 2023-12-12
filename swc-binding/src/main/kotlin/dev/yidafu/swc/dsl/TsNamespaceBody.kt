package dev.yidafu.swc.dsl

import dev.yidafu.swc.types.*

/**
 * subtype of TsNamespaceBody
 */
fun TsNamespaceBody.tsModuleBlock(block: TsModuleBlock.() -> Unit): TsModuleBlock {
    return TsModuleBlockImpl().apply(block)
}

/**
 * subtype of TsNamespaceBody
 */
fun TsNamespaceBody.tsNamespaceDeclaration(block: TsNamespaceDeclaration.() -> Unit): TsNamespaceDeclaration {
    return TsNamespaceDeclarationImpl().apply(block)
}
