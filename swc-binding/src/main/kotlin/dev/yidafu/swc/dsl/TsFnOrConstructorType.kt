package dev.yidafu.swc.dsl

import dev.yidafu.swc.types.*

/**
 * subtype of TsFnOrConstructorType
 */
fun TsFnOrConstructorType.tsFunctionType(block: TsFunctionType.() -> Unit): TsFunctionType {
    return TsFunctionTypeImpl().apply(block)
}

/**
 * subtype of TsFnOrConstructorType
 */
fun TsFnOrConstructorType.tsConstructorType(block: TsConstructorType.() -> Unit): TsConstructorType {
    return TsConstructorTypeImpl().apply(block)
}
