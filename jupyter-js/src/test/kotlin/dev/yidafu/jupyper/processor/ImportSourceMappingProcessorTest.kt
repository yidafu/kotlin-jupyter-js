package dev.yidafu.jupyper.processor

import dev.yidafu.swc.types.ImportDeclaration
import dev.yidafu.swc.types.Module
import io.kotest.core.spec.style.ShouldSpec
import io.kotest.matchers.nulls.shouldBeNull
import io.kotest.matchers.shouldBe
import io.mockk.mockk

class ImportSourceMappingProcessorTest : ShouldSpec({
    context("ImportSourceMappingProcessor") {
        should("process and replace import source with actual esm url") {
            val contextMock: JavascriptProcessContext = mockk(relaxed = true)
            val program =
                processTestScript(
                    """
                    |import { useState } from "react";
                    |import highcharts from "highcharts";
                    """.trimMargin(),
                )
            val processor = ImportSourceMappingProcessor()
            processor.process(program, contextMock)
            if (program is Module) {
                val react = program.body?.get(0)
                if (react is ImportDeclaration) {
                    react.source?.value shouldBe "https://esm.sh/react@18.2.0"
                }
                program.body?.size shouldBe 5
                val highcharts = program.body?.get(1)
                if (highcharts is ImportDeclaration) {
                    highcharts.source?.value shouldBe "https://code.highcharts.com/es-modules/masters/highcharts.src.js"
                }
                val highchartsExtra = program.body?.get(4)
                if (highchartsExtra is ImportDeclaration) {
                    highchartsExtra.source?.value shouldBe "https://code.highcharts.com/es-modules/masters/modules/export-data.src.js"
                    highchartsExtra.specifiers.shouldBeNull()
                }
            }
        }
    }
})
