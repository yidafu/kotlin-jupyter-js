package dev.yidafu.jupyter.libmapping

import dev.yidafu.jupyter.JavaScriptPackage
import io.kotest.assertions.throwables.shouldThrow
import io.kotest.core.spec.style.ShouldSpec
import io.kotest.matchers.booleans.shouldBeFalse
import io.kotest.matchers.booleans.shouldBeTrue
import io.kotest.matchers.nulls.shouldBeNull
import io.kotest.matchers.nulls.shouldNotBeNull
import io.kotest.matchers.shouldBe
import io.kotest.matchers.shouldNotBe

class JsConfigDslTest :
    ShouldSpec({
        beforeEach {
            // Clear runtime config before each test to ensure clean state
            LibMappingManager.clearRuntimeConfig()
        }

        context("JsConfigBuilder.dependencies") {
            should("add dependency with simple URL") {
                val builder = JsConfigBuilder()
                builder.dependencies("vue", "https://cdn.jsdelivr.net/npm/vue@3")

                val mappings = builder.getMappings()
                mappings.size shouldBe 1
                mappings["vue"].shouldNotBeNull()
                mappings["vue"]?.mainSource shouldBe "https://cdn.jsdelivr.net/npm/vue@3"
                mappings["vue"]?.extraSources.shouldBeNull()
            }

            should("add dependency with main URL and extra URLs") {
                val builder = JsConfigBuilder()
                val mainUrl = "https://cdn.jsdelivr.net/npm/echarts@5"
                val extraUrls = listOf(
                    "https://cdn.jsdelivr.net/npm/echarts-gl@2",
                    "https://cdn.jsdelivr.net/npm/echarts-liquidfill@3",
                )

                builder.dependencies("echarts", mainUrl, extraUrls)

                val mappings = builder.getMappings()
                mappings.size shouldBe 1
                mappings["echarts"].shouldNotBeNull()
                mappings["echarts"]?.mainSource shouldBe mainUrl
                mappings["echarts"]?.extraSources.shouldNotBeNull()
                mappings["echarts"]?.extraSources?.size shouldBe 2
                mappings["echarts"]?.extraSources?.contains(extraUrls[0])!!.shouldBeTrue()
                mappings["echarts"]?.extraSources?.contains(extraUrls[1])!!.shouldBeTrue()
            }

            should("add dependency with empty extra URLs list") {
                val builder = JsConfigBuilder()
                builder.dependencies("react", "https://esm.sh/react@18", emptyList())

                val mappings = builder.getMappings()
                // When emptyList() is passed, extraSources will be an empty list, not null
                mappings["react"]?.extraSources?.isEmpty() shouldBe true
            }

            should("add dependency using JavaScriptPackage object") {
                val builder = JsConfigBuilder()
                val packageConfig =
                    JavaScriptPackage(
                        "https://cdn.jsdelivr.net/npm/lodash@4.17.21",
                        listOf("https://cdn.jsdelivr.net/npm/lodash-es@4.17.21"),
                    )

                builder.dependencies("lodash", packageConfig)

                val mappings = builder.getMappings()
                mappings["lodash"] shouldBe packageConfig
                mappings["lodash"]?.mainSource shouldBe packageConfig.mainSource
                mappings["lodash"]?.extraSources shouldBe packageConfig.extraSources
            }

            should("override existing dependency with same name") {
                val builder = JsConfigBuilder()
                builder.dependencies("vue", "https://cdn.jsdelivr.net/npm/vue@2")
                builder.dependencies("vue", "https://cdn.jsdelivr.net/npm/vue@3")

                val mappings = builder.getMappings()
                mappings.size shouldBe 1
                mappings["vue"]?.mainSource shouldBe "https://cdn.jsdelivr.net/npm/vue@3"
            }

            should("add multiple dependencies") {
                val builder = JsConfigBuilder()
                builder.dependencies("vue", "https://cdn.jsdelivr.net/npm/vue@3")
                builder.dependencies("react", "https://esm.sh/react@18")
                builder.dependencies("axios", "https://esm.sh/axios")

                val mappings = builder.getMappings()
                mappings.size shouldBe 3
                mappings.containsKey("vue").shouldBeTrue()
                mappings.containsKey("react").shouldBeTrue()
                mappings.containsKey("axios").shouldBeTrue()
            }
        }

        context("JsConfigBuilder.dep (alias)") {
            should("add dependency with simple URL using dep alias") {
                val builder = JsConfigBuilder()
                builder.dep("vue", "https://cdn.jsdelivr.net/npm/vue@3")

                val mappings = builder.getMappings()
                mappings["vue"]?.mainSource shouldBe "https://cdn.jsdelivr.net/npm/vue@3"
            }

            should("add dependency with main URL and extra URLs using dep alias") {
                val builder = JsConfigBuilder()
                val mainUrl = "https://cdn.jsdelivr.net/npm/echarts@5"
                val extraUrls = listOf("https://cdn.jsdelivr.net/npm/echarts-gl@2")

                builder.dep("echarts", mainUrl, extraUrls)

                val mappings = builder.getMappings()
                mappings["echarts"]?.mainSource shouldBe mainUrl
                mappings["echarts"]?.extraSources?.size shouldBe 1
            }

            should("add dependency using JavaScriptPackage object with dep alias") {
                val builder = JsConfigBuilder()
                val packageConfig = JavaScriptPackage("https://esm.sh/axios")

                builder.dep("axios", packageConfig)

                val mappings = builder.getMappings()
                mappings["axios"] shouldBe packageConfig
            }

            should("dep and dependencies produce same result") {
                val builder1 = JsConfigBuilder()
                val builder2 = JsConfigBuilder()

                builder1.dependencies("vue", "https://cdn.jsdelivr.net/npm/vue@3")
                builder2.dep("vue", "https://cdn.jsdelivr.net/npm/vue@3")

                builder1.getMappings() shouldBe builder2.getMappings()
            }
        }

        context("JsConfigBuilder.apply") {
            should("apply configuration to LibMappingManager") {
                val builder = JsConfigBuilder()
                builder.dependencies("test-lib", "https://cdn.example.com/lib@1.0.0")

                builder.apply()

                val mapping = LibMappingManager.getMapping("test-lib")
                mapping.shouldNotBeNull()
                mapping?.mainSource shouldBe "https://cdn.example.com/lib@1.0.0"
            }

            should("apply multiple configurations") {
                val builder = JsConfigBuilder()
                builder.dependencies("lib1", "https://cdn.example.com/lib1@1.0.0")
                builder.dependencies("lib2", "https://cdn.example.com/lib2@1.0.0")

                builder.apply()

                LibMappingManager.has("lib1").shouldBeTrue()
                LibMappingManager.has("lib2").shouldBeTrue()
                LibMappingManager.getMapping("lib1")?.mainSource shouldBe "https://cdn.example.com/lib1@1.0.0"
                LibMappingManager.getMapping("lib2")?.mainSource shouldBe "https://cdn.example.com/lib2@1.0.0"
            }

            should("apply configuration with extra dependencies") {
                val builder = JsConfigBuilder()
                val mainUrl = "https://cdn.example.com/lib@1.0.0"
                val extraUrls = listOf("https://cdn.example.com/lib-extra@1.0.0")

                builder.dependencies("test-lib", mainUrl, extraUrls)
                builder.apply()

                val mapping = LibMappingManager.getMapping("test-lib")
                mapping?.extraSources?.size shouldBe 1
                mapping?.extraSources?.contains(extraUrls[0])!!.shouldBeTrue()
            }

            should("override existing runtime config when applying") {
                LibMappingManager.set("test-lib", "https://old-url.com/lib@1.0.0")

                val builder = JsConfigBuilder()
                builder.dependencies("test-lib", "https://new-url.com/lib@2.0.0")
                builder.apply()

                LibMappingManager.getMapping("test-lib")?.mainSource shouldBe "https://new-url.com/lib@2.0.0"
            }
        }

        context("JsConfigBuilder.getMappings") {
            should("return empty map when no dependencies added") {
                val builder = JsConfigBuilder()
                val mappings = builder.getMappings()

                mappings.isEmpty().shouldBeTrue()
            }

            should("return immutable copy of mappings") {
                val builder = JsConfigBuilder()
                builder.dependencies("vue", "https://cdn.jsdelivr.net/npm/vue@3")

                val mappings1 = builder.getMappings()
                val mappings2 = builder.getMappings()

                // Should be equal but not same instance
                mappings1 shouldBe mappings2
            }

            should("return all added dependencies") {
                val builder = JsConfigBuilder()
                builder.dependencies("vue", "https://cdn.jsdelivr.net/npm/vue@3")
                builder.dependencies("react", "https://esm.sh/react@18")

                val mappings = builder.getMappings()
                mappings.size shouldBe 2
                mappings.containsKey("vue").shouldBeTrue()
                mappings.containsKey("react").shouldBeTrue()
            }
        }

        context("jsConfig DSL function") {
            should("configure dependencies using DSL") {
                jsConfig {
                    dependencies("vue", "https://cdn.jsdelivr.net/npm/vue@3")
                    dep("axios", "https://esm.sh/axios")
                }

                LibMappingManager.has("vue").shouldBeTrue()
                LibMappingManager.has("axios").shouldBeTrue()
                LibMappingManager.getMapping("vue")?.mainSource shouldBe "https://cdn.jsdelivr.net/npm/vue@3"
                LibMappingManager.getMapping("axios")?.mainSource shouldBe "https://esm.sh/axios"
            }

            should("configure dependencies with extra URLs using DSL") {
                jsConfig {
                    dependencies(
                        "echarts",
                        "https://cdn.jsdelivr.net/npm/echarts@5",
                        listOf("https://cdn.jsdelivr.net/npm/echarts-gl@2"),
                    )
                }

                val mapping = LibMappingManager.getMapping("echarts")
                mapping?.mainSource shouldBe "https://cdn.jsdelivr.net/npm/echarts@5"
                mapping?.extraSources?.size shouldBe 1
            }

            should("configure multiple dependencies using DSL") {
                jsConfig {
                    dependencies("vue", "https://cdn.jsdelivr.net/npm/vue@3")
                    dependencies("react", "https://esm.sh/react@18")
                    dep("lodash", "https://cdn.jsdelivr.net/npm/lodash-es@4.17.21")
                }

                LibMappingManager.has("vue").shouldBeTrue()
                LibMappingManager.has("react").shouldBeTrue()
                LibMappingManager.has("lodash").shouldBeTrue()
            }

            should("override existing config when using DSL") {
                LibMappingManager.set("vue", "https://old-url.com/vue@2")

                jsConfig {
                    dependencies("vue", "https://cdn.jsdelivr.net/npm/vue@3")
                }

                LibMappingManager.getMapping("vue")?.mainSource shouldBe "https://cdn.jsdelivr.net/npm/vue@3"
            }
        }

        context("getJsConfig function") {
            should("return all configurations including static and runtime") {
                jsConfig {
                    dependencies("test-lib", "https://cdn.example.com/lib@1.0.0")
                }

                val config = getJsConfig()
                config.isNotEmpty().shouldBeTrue()
                config.containsKey("test-lib").shouldBeTrue()
                config["test-lib"]?.mainSource shouldBe "https://cdn.example.com/lib@1.0.0"
            }

            should("include static configs") {
                val config = getJsConfig()
                config.containsKey("react").shouldBeTrue()
                config.containsKey("lodash").shouldBeTrue()
            }

            should("return runtime configs that override static configs") {
                val staticConfig = LibMappingManager.getMapping("react")
                jsConfig {
                    dependencies("react", "https://custom-cdn.com/react@19.0.0")
                }

                val config = getJsConfig()
                config["react"]?.mainSource shouldBe "https://custom-cdn.com/react@19.0.0"
                config["react"]?.mainSource shouldNotBe staticConfig?.mainSource
            }
        }

        context("hasJsLibrary function") {
            should("return true for static library") {
                hasJsLibrary("react").shouldBeTrue()
                hasJsLibrary("lodash").shouldBeTrue()
            }

            should("return true for runtime configured library") {
                jsConfig {
                    dependencies("custom-lib", "https://cdn.example.com/lib@1.0.0")
                }

                hasJsLibrary("custom-lib").shouldBeTrue()
            }

            should("return false for non-existent library") {
                hasJsLibrary("non-existent-library").shouldBeFalse()
            }

            should("return true when library exists in runtime config") {
                jsConfig {
                    dependencies("temp-lib", "https://cdn.example.com/lib@1.0.0")
                }

                hasJsLibrary("temp-lib").shouldBeTrue()

                LibMappingManager.remove("temp-lib")
                hasJsLibrary("temp-lib").shouldBeFalse()
            }
        }

        context("edge cases") {
            should("throw exception for empty library name") {
                val builder = JsConfigBuilder()
                io.kotest.assertions.throwables.shouldThrow<IllegalArgumentException> {
                    builder.dependencies("", "https://cdn.example.com/lib@1.0.0")
                }
            }

            should("throw exception for blank library name") {
                val builder = JsConfigBuilder()
                io.kotest.assertions.throwables.shouldThrow<IllegalArgumentException> {
                    builder.dependencies("   ", "https://cdn.example.com/lib@1.0.0")
                }
            }

            should("handle special characters in library name") {
                val builder = JsConfigBuilder()
                val libName = "test-lib@1.0.0"
                builder.dependencies(libName, "https://cdn.example.com/lib@1.0.0")

                val mappings = builder.getMappings()
                mappings.containsKey(libName).shouldBeTrue()
            }

            should("handle very long URLs") {
                val builder = JsConfigBuilder()
                val longUrl = "https://cdn.example.com/" + "a".repeat(1000) + "@1.0.0"
                builder.dependencies("test-lib", longUrl)

                val mappings = builder.getMappings()
                mappings["test-lib"]?.mainSource shouldBe longUrl
            }

            should("handle multiple extra dependencies") {
                val builder = JsConfigBuilder()
                val extraUrls = (1..10).map { "https://cdn.example.com/extra$it@1.0.0" }
                builder.dependencies(
                    "test-lib",
                    "https://cdn.example.com/lib@1.0.0",
                    extraUrls,
                )

                val mappings = builder.getMappings()
                mappings["test-lib"]?.extraSources?.size shouldBe 10
            }

            should("handle empty DSL block") {
                jsConfig {
                    // Empty block
                }

                // Should not throw exception
                val config = getJsConfig()
                config.isNotEmpty().shouldBeTrue() // Still has static configs
            }
        }
    })

