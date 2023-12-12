package dev.yidafu.swc.dsl

import dev.yidafu.swc.types.*

/**
 * TryStatement#finalizer: BlockStatement
 * extension function for create BlockStatement -> BlockStatementImpl
 */
fun TryStatement.blockStatement(block: BlockStatement.() -> Unit): BlockStatement {
    return BlockStatementImpl().apply(block)
}

/**
 * TryStatement#handler: CatchClause
 * extension function for create CatchClause -> CatchClauseImpl
 */
fun TryStatement.catchClause(block: CatchClause.() -> Unit): CatchClause {
    return CatchClauseImpl().apply(block)
}

fun TryStatement.span(block: Span.() -> Unit): Span {
    return Span().apply(block)
}
