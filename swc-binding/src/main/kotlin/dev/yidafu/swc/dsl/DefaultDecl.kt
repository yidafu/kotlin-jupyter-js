package dev.yidafu.swc.dsl

import dev.yidafu.swc.types.*

/**
 * subtype of DefaultDecl
 */
fun DefaultDecl.classExpression(block: ClassExpression.() -> Unit): ClassExpression {
    return ClassExpressionImpl().apply(block)
}

/**
 * subtype of DefaultDecl
 */
fun DefaultDecl.functionExpression(block: FunctionExpression.() -> Unit): FunctionExpression {
    return FunctionExpressionImpl().apply(block)
}

/**
 * subtype of DefaultDecl
 */
fun DefaultDecl.tsInterfaceDeclaration(block: TsInterfaceDeclaration.() -> Unit): TsInterfaceDeclaration {
    return TsInterfaceDeclarationImpl().apply(block)
}
