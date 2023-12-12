package dev.yidafu.swc.dsl

import dev.yidafu.swc.types.*

/**
 * VariableDeclaration#declarations: Array<VariableDeclarator>
 * extension function for create Array<VariableDeclarator> -> VariableDeclaratorImpl
 */
fun VariableDeclaration.variableDeclarator(block: VariableDeclarator.() -> Unit): VariableDeclarator {
    return VariableDeclaratorImpl().apply(block)
}

fun VariableDeclaration.span(block: Span.() -> Unit): Span {
    return Span().apply(block)
}
