package dev.yidafu.jupyter

import org.jetbrains.kotlinx.jupyter.api.VariableState
import kotlin.reflect.KProperty

class MockVariableState(
    override val property: KProperty<*>,
    override val scriptInstance: Any?,
    override val stringValue: String?,
    override val value: Result<Any?>,
) : VariableState
