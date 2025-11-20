package dev.yidafu.jupyper.processor

import dev.yidafu.jupyper.MockVariableState
import io.mockk.every
import io.mockk.mockk
import org.jetbrains.kotlinx.jupyter.api.Notebook
import kotlin.reflect.full.memberProperties

fun getMockNotebook(): Notebook {
    val notebookMock: Notebook = mockk(relaxed = true)

    every { notebookMock.variablesState } returns
        mapOf(
            "foo" to
                MockVariableState(
                    MockScriptInstance::class.memberProperties.first(),
                    MockScriptInstance,
                    "",
                    Result.success(MockScriptInstance.foo),
                ),
            "bar" to
                MockVariableState(
                    MockScriptInstance::class.memberProperties.elementAt(1),
                    MockScriptInstance,
                    "",
                    Result.success(MockScriptInstance.bar),
                ),
            "renderable" to
                MockVariableState(
                    MockScriptInstance::class.memberProperties.elementAt(3),
                    MockScriptInstance,
                    "",
                    Result.success(MockScriptInstance.renderable),
                ),
            "text" to
                MockVariableState(
                    MockScriptInstance::class.memberProperties.elementAt(3),
                    MockScriptInstance,
                    "",
                    Result.success(MockScriptInstance.text),
                ),
        )
    return notebookMock
}
