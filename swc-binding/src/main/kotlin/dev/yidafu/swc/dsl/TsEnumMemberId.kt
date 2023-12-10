package dev.yidafu.swc.dsl

import dev.yidafu.swc.types.*

/**
 * subtype of TsEnumMemberId
 */
fun TsEnumMemberId.identifier(block: Identifier.() -> Unit): Identifier {
    return IdentifierImpl().apply(block)
}

/**
 * subtype of TsEnumMemberId
 */
fun TsEnumMemberId.stringLiteral(block: StringLiteral.() -> Unit): StringLiteral {
    return StringLiteralImpl().apply(block)
}
