package dev.yidafu.swc.dsl

import dev.yidafu.swc.types.*

/**
 * subtype of TsUnionOrIntersectionType
 */
fun TsUnionOrIntersectionType.tsUnionType(block: TsUnionType.() -> Unit): TsUnionType {
    return TsUnionTypeImpl().apply(block)
}

/**
 * subtype of TsUnionOrIntersectionType
 */
fun TsUnionOrIntersectionType.tsIntersectionType(block: TsIntersectionType.() -> Unit): TsIntersectionType {
    return TsIntersectionTypeImpl().apply(block)
}
