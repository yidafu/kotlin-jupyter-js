package dev.yidafu.swc.dsl

import dev.yidafu.swc.types.*

/**
 * TsEnumDeclaration#id: Identifier
 * extension function for create Identifier -> IdentifierImpl
 */
fun TsEnumDeclaration.identifier(block: Identifier.() -> Unit): Identifier {
    return IdentifierImpl().apply(block)
}

/**
 * TsEnumDeclaration#members: Array<TsEnumMember>
 * extension function for create Array<TsEnumMember> -> TsEnumMemberImpl
 */
fun TsEnumDeclaration.tsEnumMember(block: TsEnumMember.() -> Unit): TsEnumMember {
    return TsEnumMemberImpl().apply(block)
}

fun TsEnumDeclaration.span(block: Span.() -> Unit): Span {
    return Span().apply(block)
}
