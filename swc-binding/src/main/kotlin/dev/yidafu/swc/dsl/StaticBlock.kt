package dev.yidafu.swc.dsl

import dev.yidafu.swc.types.*

/**
 * StaticBlock#body: BlockStatement
 * extension function for create BlockStatement -> BlockStatementImpl
 */
fun StaticBlock.blockStatement(block: BlockStatement.() -> Unit): BlockStatement {
    return BlockStatementImpl().apply(block)
}

fun StaticBlock.span(block: Span.() -> Unit): Span {
    return Span().apply(block)
}
