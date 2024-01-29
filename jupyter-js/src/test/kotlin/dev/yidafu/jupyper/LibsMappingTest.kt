package dev.yidafu.jupyper

import dev.yidafu.jupyper.processor.ImportSourceMappingProcessor
import io.kotest.core.spec.style.FunSpec
import io.kotest.core.spec.style.ShouldSpec
import io.kotest.matchers.booleans.shouldBeFalse
import io.kotest.matchers.shouldBe
import io.mockk.every
import io.mockk.mockkObject
import io.mockk.mockkStatic
import kotlinx.serialization.json.Json
import java.io.ByteArrayInputStream
import java.io.InputStream
import kotlin.test.assertNotNull

//class LibsMappingTest : FunSpec({
//    test("get esm url") {
//        assertNotNull(LibsMapping["react"])
//        assertNotNull(LibsMapping["react-dom"])
//        assertNotNull(LibsMapping["echarts"])
//    }
//})


class LibsMappingTest : ShouldSpec({
    context("LibsMapping tests") {


//        should("return empty map when resource file is empty or not found") {
//            mockkObject(LibsMapping)
//            every { LibsMapping.getResourceFile(any(String::class)) } returns  ""
//            every { LibsMapping.size } answers { callOriginal() }
//
//            LibsMapping.size.shouldBe(0)
//        }

        should("load and parse JSON mapping correctly") {
            val testJsonContent = ImportSourceMappingProcessor::class.java.classLoader.getResource(LIBS_MAPPING_JSON_FILE_NAME)?.readText() ?: "" // 用实际的 JSON 内容替换这里，或从资源文件读取用于测试的数据
            val expectedMapping = Json.decodeFromString<Map<String, JavaScriptPackage>>(testJsonContent)

            val libsMapping = LibsMapping
            libsMapping.size shouldBe expectedMapping.size
            libsMapping.values.size shouldBe expectedMapping.values.size
            libsMapping.keys.size shouldBe expectedMapping.keys.size
            libsMapping.isEmpty().shouldBeFalse()
            libsMapping.containsValue(expectedMapping["echarts"]!!)

            libsMapping.entries.forEach { (key, value) ->
                libsMapping[key] shouldBe value
                value shouldBe expectedMapping[key]
            }
        }

    }
})