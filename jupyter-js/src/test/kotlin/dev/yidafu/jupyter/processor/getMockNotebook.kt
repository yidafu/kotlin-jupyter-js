package dev.yidafu.jupyter.processor

import dev.yidafu.jupyter.MockVariableState
import io.mockk.every
import io.mockk.mockk
import org.jetbrains.kotlinx.jupyter.api.Notebook
import kotlin.reflect.full.memberProperties

fun getMockNotebook(): Notebook {
    val notebookMock: Notebook = mockk(relaxed = true)

    val properties = MockScriptInstance::class.memberProperties.associateBy { it.name }

    every { notebookMock.variablesState } returns
        mapOf(
            "foo" to
                MockVariableState(
                    properties["foo"]!!,
                    MockScriptInstance,
                    "",
                    Result.success(MockScriptInstance.foo),
                ),
            "bar" to
                MockVariableState(
                    properties["bar"]!!,
                    MockScriptInstance,
                    "",
                    Result.success(MockScriptInstance.bar),
                ),
            "renderable" to
                MockVariableState(
                    properties["renderable"]!!,
                    MockScriptInstance,
                    "",
                    Result.success(MockScriptInstance.renderable),
                ),
            "text" to
                MockVariableState(
                    properties["text"]!!,
                    MockScriptInstance,
                    "",
                    Result.success(MockScriptInstance.text),
                ),
            "png" to
                MockVariableState(
                    properties["png"]!!,
                    MockScriptInstance,
                    "",
                    Result.success(MockScriptInstance.png),
                ),
            "jsonResult" to
                MockVariableState(
                    properties["jsonResult"]!!,
                    MockScriptInstance,
                    "",
                    Result.success(MockScriptInstance.jsonResult),
                ),
            "numberInt" to
                MockVariableState(
                    properties["numberInt"]!!,
                    MockScriptInstance,
                    "",
                    Result.success(MockScriptInstance.numberInt),
                ),
            "numberDouble" to
                MockVariableState(
                    properties["numberDouble"]!!,
                    MockScriptInstance,
                    "",
                    Result.success(MockScriptInstance.numberDouble),
                ),
            "booleanValue" to
                MockVariableState(
                    properties["booleanValue"]!!,
                    MockScriptInstance,
                    "",
                    Result.success(MockScriptInstance.booleanValue),
                ),
            "listValue" to
                MockVariableState(
                    properties["listValue"]!!,
                    MockScriptInstance,
                    "",
                    Result.success(MockScriptInstance.listValue),
                ),
            "mapValue" to
                MockVariableState(
                    properties["mapValue"]!!,
                    MockScriptInstance,
                    "",
                    Result.success(MockScriptInstance.mapValue),
                ),
        )
    return notebookMock
}
