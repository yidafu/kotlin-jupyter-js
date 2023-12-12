package dev.yidafu.swc.dsl

import dev.yidafu.swc.types.*

fun TerserMangleOptions.terserManglePropertiesOptions(block: TerserManglePropertiesOptions.() -> Unit): TerserManglePropertiesOptions {
    return TerserManglePropertiesOptions().apply(block)
}
