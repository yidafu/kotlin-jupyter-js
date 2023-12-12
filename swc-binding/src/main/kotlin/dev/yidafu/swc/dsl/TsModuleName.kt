package dev.yidafu.swc.dsl

import dev.yidafu.swc.types.*

/**
 * subtype of TsModuleName
 */
fun TsModuleName.identifier(block: Identifier.() -> Unit): Identifier {
    return IdentifierImpl().apply(block)
}

/**
 * subtype of TsModuleName
 */
fun TsModuleName.stringLiteral(block: StringLiteral.() -> Unit): StringLiteral {
    return StringLiteralImpl().apply(block)
}
