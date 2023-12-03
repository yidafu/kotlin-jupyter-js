package dev.yidafu.swc

import kotlinx.serialization.Serializable

@Serializable
data class TransformOutput(val code: String, val msg: String? = null)
