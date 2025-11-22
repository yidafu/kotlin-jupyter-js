package dev.yidafu.jupyter

import dev.yidafu.jupyter.libmapping.LibsMapping
import dev.yidafu.jupyter.processor.ImportSourceMappingProcessor
import io.kotest.core.spec.style.ShouldSpec
import io.kotest.matchers.booleans.shouldBeFalse
import io.kotest.matchers.booleans.shouldBeTrue
import io.kotest.matchers.shouldBe
import kotlinx.serialization.json.Json

class LibsMappingTest :
    ShouldSpec({
        context("LibsMapping tests") {

            should("load and parse JSON mapping correctly") {
                val testJsonContent =
                    ImportSourceMappingProcessor::class.java.classLoader
                        .getResource(
                            LIBS_MAPPING_JSON_FILE_NAME,
                        )?.readText() ?: "" // 用实际的 JSON 内容替换这里，或从资源文件读取用于测试的数据
                val expectedMapping = Json.decodeFromString<Map<String, JavaScriptPackage>>(testJsonContent)

                val libsMapping = LibsMapping.default
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

            should("return empty map if mapping json is empty") {
                val libMapping = LibsMapping("not-exist-mapping.json")
                libMapping.size shouldBe 0
                libMapping.isEmpty().shouldBeTrue()
            }
        }
    })
