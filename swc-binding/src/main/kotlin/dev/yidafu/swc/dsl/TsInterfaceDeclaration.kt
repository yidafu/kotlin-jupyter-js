package dev.yidafu.swc.dsl

import dev.yidafu.swc.types.*

/**
 * TsInterfaceDeclaration#id: Identifier
 * extension function for create Identifier -> IdentifierImpl
 */
fun TsInterfaceDeclaration.identifier(block: Identifier.() -> Unit): Identifier {
    return IdentifierImpl().apply(block)
}

/**
 * TsInterfaceDeclaration#typeParams: TsTypeParameterDeclaration
 * extension function for create TsTypeParameterDeclaration -> TsTypeParameterDeclarationImpl
 */
fun TsInterfaceDeclaration.tsTypeParameterDeclaration(block: TsTypeParameterDeclaration.() -> Unit): TsTypeParameterDeclaration {
    return TsTypeParameterDeclarationImpl().apply(block)
}

/**
 * TsInterfaceDeclaration#extends: Array<TsExpressionWithTypeArguments>
 * extension function for create Array<TsExpressionWithTypeArguments> -> TsExpressionWithTypeArgumentsImpl
 */
fun TsInterfaceDeclaration.tsExpressionWithTypeArguments(block: TsExpressionWithTypeArguments.() -> Unit): TsExpressionWithTypeArguments {
    return TsExpressionWithTypeArgumentsImpl().apply(block)
}

/**
 * TsInterfaceDeclaration#body: TsInterfaceBody
 * extension function for create TsInterfaceBody -> TsInterfaceBodyImpl
 */
fun TsInterfaceDeclaration.tsInterfaceBody(block: TsInterfaceBody.() -> Unit): TsInterfaceBody {
    return TsInterfaceBodyImpl().apply(block)
}

fun TsInterfaceDeclaration.span(block: Span.() -> Unit): Span {
    return Span().apply(block)
}
