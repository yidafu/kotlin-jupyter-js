package dev.yidafu.swc.dsl

import dev.yidafu.swc.types.*

/**
 * subtype of ModuleExportName
 */
fun ModuleExportName.identifier(block: Identifier.() -> Unit): Identifier {
    return IdentifierImpl().apply(block)
}

/**
 * subtype of ModuleExportName
 */
fun ModuleExportName.stringLiteral(block: StringLiteral.() -> Unit): StringLiteral {
    return StringLiteralImpl().apply(block)
}
