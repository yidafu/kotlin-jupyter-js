package dev.yidafu.swc.dsl

import dev.yidafu.swc.types.*

/**
 * ExportDefaultDeclaration#decl: DefaultDecl
 * extension function for create DefaultDecl -> ClassExpressionImpl
 */
fun ExportDefaultDeclaration.classExpression(block: ClassExpression.() -> Unit): ClassExpression {
    return ClassExpressionImpl().apply(block)
}

/**
 * ExportDefaultDeclaration#decl: DefaultDecl
 * extension function for create DefaultDecl -> FunctionExpressionImpl
 */
fun ExportDefaultDeclaration.functionExpression(block: FunctionExpression.() -> Unit): FunctionExpression {
    return FunctionExpressionImpl().apply(block)
}

/**
 * ExportDefaultDeclaration#decl: DefaultDecl
 * extension function for create DefaultDecl -> TsInterfaceDeclarationImpl
 */
fun ExportDefaultDeclaration.tsInterfaceDeclaration(block: TsInterfaceDeclaration.() -> Unit): TsInterfaceDeclaration {
    return TsInterfaceDeclarationImpl().apply(block)
}

fun ExportDefaultDeclaration.span(block: Span.() -> Unit): Span {
    return Span().apply(block)
}
