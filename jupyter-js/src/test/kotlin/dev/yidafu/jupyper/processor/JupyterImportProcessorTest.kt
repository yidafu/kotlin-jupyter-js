package dev.yidafu.jupyper.processor

import dev.yidafu.jupyper.MockVariableState
import dev.yidafu.swc.types.Module
import io.kotest.core.spec.style.ShouldSpec
import io.kotest.matchers.shouldBe
import io.mockk.every
import io.mockk.mockk
import io.mockk.verify
import org.jetbrains.kotlinx.jupyter.api.HTML
import org.jetbrains.kotlinx.jupyter.api.MimeTypedResult
import org.jetbrains.kotlinx.jupyter.api.Notebook
import org.jetbrains.kotlinx.jupyter.api.VariableState
import kotlin.reflect.KProperty
import kotlin.reflect.full.memberProperties



object MockScriptInstance {
    val foo: MimeTypedResult = HTML("<div></div>")
    val bar: String = "world"
}

class JupyterImportProcessorTest : ShouldSpec({

    context("JupyterImportProcessor") {
        should("process and replace import statements with Kotlin variables") {
            val notebookMock: Notebook = mockk(relaxed = true)
            val contextMock: JavascriptProcessContext = mockk(relaxed = true)


            every { notebookMock.variablesState } returns mapOf(
                "foo" to MockVariableState(
                    MockScriptInstance::class.memberProperties.first(),
                    MockScriptInstance,
                    "",
                    Result.success(MockScriptInstance.foo),
                ),
                "bar" to  MockVariableState(
                    MockScriptInstance::class.memberProperties.first(),
                    MockScriptInstance,
                    "",
                    Result.success(MockScriptInstance.bar),
                )
            )

            val program = processTestScript("import { foo, bar as renamedBar } from \"@jupyter\" ")

            val processor = JupyterImportProcessor(notebookMock)
            processor.process(program, contextMock)

            verify(exactly = 1) { contextMock.addKotlinValue("foo" to "\"<div></div>\"") }
            verify(exactly = 1) { contextMock.addKotlinValue("renamedBar" to "\"world\"") }

            if (program is Module) {
                program.body?.size shouldBe 0
            }

        }
    }
})