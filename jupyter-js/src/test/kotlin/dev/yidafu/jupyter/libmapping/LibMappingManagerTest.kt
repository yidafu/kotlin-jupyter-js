package dev.yidafu.jupyter.libmapping

import dev.yidafu.jupyter.JavaScriptPackage
import io.kotest.core.spec.style.ShouldSpec
import io.kotest.matchers.booleans.shouldBeFalse
import io.kotest.matchers.booleans.shouldBeTrue
import io.kotest.matchers.comparables.shouldBeGreaterThan
import io.kotest.matchers.nulls.shouldBeNull
import io.kotest.matchers.nulls.shouldNotBeNull
import io.kotest.matchers.shouldBe
import io.kotest.matchers.shouldNotBe

class LibMappingManagerTest :
    ShouldSpec({
        beforeEach {
            // Clear runtime config before each test to ensure clean state
            LibMappingManager.clearRuntimeConfig()
        }

        context("getMapping") {
            should("return static config when runtime config is not set") {
                val mapping = LibMappingManager.getMapping("react")
                mapping.shouldNotBeNull()
                mapping?.mainSource shouldBe "https://esm.sh/react@18.2.0"
            }

            should("return runtime config when both static and runtime config exist") {
                val runtimeUrl = "https://custom-cdn.com/react@19.0.0"
                LibMappingManager.set("react", runtimeUrl)

                val mapping = LibMappingManager.getMapping("react")
                mapping.shouldNotBeNull()
                mapping?.mainSource shouldBe runtimeUrl
            }

            should("return null when library is not configured") {
                val mapping = LibMappingManager.getMapping("non-existent-library")
                mapping.shouldBeNull()
            }

            should("return config with extra dependencies from static config") {
                val mapping = LibMappingManager.getMapping("highcharts")
                mapping.shouldNotBeNull()
                mapping?.mainSource shouldBe "https://code.highcharts.com/es-modules/masters/highcharts.src.js"
                mapping?.extraSources.shouldNotBeNull()
                mapping?.extraSources?.size shouldBe 3
            }
        }

        context("getAll") {
            should("return all static configs when runtime config is empty") {
                val allMappings = LibMappingManager.getAll()
                allMappings.shouldNotBeNull()
                allMappings.isNotEmpty().shouldBeTrue()
                allMappings.containsKey("react").shouldBeTrue()
                allMappings.containsKey("lodash").shouldBeTrue()
            }

            should("include runtime configs in result") {
                val runtimeUrl = "https://custom-cdn.com/custom-lib@1.0.0"
                LibMappingManager.set("custom-lib", runtimeUrl)

                val allMappings = LibMappingManager.getAll()
                allMappings.containsKey("custom-lib").shouldBeTrue()
                allMappings["custom-lib"]?.mainSource shouldBe runtimeUrl
            }

            should("override static config with runtime config") {
                val staticMapping = LibMappingManager.getMapping("react")
                val runtimeUrl = "https://custom-cdn.com/react@19.0.0"
                LibMappingManager.set("react", runtimeUrl)

                val allMappings = LibMappingManager.getAll()
                allMappings["react"]?.mainSource shouldBe runtimeUrl
                allMappings["react"]?.mainSource shouldNotBe staticMapping?.mainSource
            }
        }

        context("set") {
            should("set simple library mapping with URL only") {
                val url = "https://cdn.example.com/library@1.0.0"
                LibMappingManager.set("test-lib", url)

                val mapping = LibMappingManager.getMapping("test-lib")
                mapping.shouldNotBeNull()
                mapping?.mainSource shouldBe url
                mapping?.extraSources.shouldBeNull()
            }

            should("set complex library mapping with extra dependencies") {
                val mainUrl = "https://cdn.example.com/library@1.0.0"
                val extraUrl1 = "https://cdn.example.com/library-plugin@1.0.0"
                val extraUrl2 = "https://cdn.example.com/library-utils@1.0.0"

                LibMappingManager.set(
                    "test-lib",
                    mainUrl,
                    listOf(extraUrl1, extraUrl2),
                )

                val mapping = LibMappingManager.getMapping("test-lib")
                mapping.shouldNotBeNull()
                mapping?.mainSource shouldBe mainUrl
                mapping?.extraSources.shouldNotBeNull()
                mapping?.extraSources?.size shouldBe 2
                mapping?.extraSources?.contains(extraUrl1)!!.shouldBeTrue()
                mapping?.extraSources?.contains(extraUrl2)!!.shouldBeTrue()
            }

            should("set library mapping using JavaScriptPackage object") {
                val packageConfig =
                    JavaScriptPackage(
                        "https://cdn.example.com/lib@2.0.0",
                        listOf("https://cdn.example.com/lib-extra@2.0.0"),
                    )

                LibMappingManager.set("test-lib", packageConfig)

                val mapping = LibMappingManager.getMapping("test-lib")
                mapping.shouldNotBeNull()
                mapping?.mainSource shouldBe packageConfig.mainSource
                mapping?.extraSources shouldBe packageConfig.extraSources
            }

            should("override existing runtime config") {
                val url1 = "https://cdn.example.com/lib@1.0.0"
                val url2 = "https://cdn.example.com/lib@2.0.0"

                LibMappingManager.set("test-lib", url1)
                LibMappingManager.set("test-lib", url2)

                val mapping = LibMappingManager.getMapping("test-lib")
                mapping?.mainSource shouldBe url2
            }
        }

        context("remove") {
            should("remove runtime config and fallback to static config") {
                val runtimeUrl = "https://custom-cdn.com/react@19.0.0"
                LibMappingManager.set("react", runtimeUrl)

                // Verify runtime config is set
                LibMappingManager.getMapping("react")?.mainSource shouldBe runtimeUrl

                // Remove runtime config
                LibMappingManager.remove("react")

                // Should fallback to static config
                val mapping = LibMappingManager.getMapping("react")
                mapping.shouldNotBeNull()
                mapping?.mainSource shouldBe "https://esm.sh/react@18.2.0"
            }

            should("remove non-existent library without error") {
                LibMappingManager.remove("non-existent-library")
                // Should not throw exception
            }

            should("remove library that only exists in runtime config") {
                val url = "https://cdn.example.com/temp-lib@1.0.0"
                LibMappingManager.set("temp-lib", url)
                LibMappingManager.has("temp-lib").shouldBeTrue()

                LibMappingManager.remove("temp-lib")
                LibMappingManager.has("temp-lib").shouldBeFalse()
            }
        }

        context("clearRuntimeConfig") {
            should("clear all runtime configs") {
                LibMappingManager.set("lib1", "https://cdn.example.com/lib1@1.0.0")
                LibMappingManager.set("lib2", "https://cdn.example.com/lib2@1.0.0")

                LibMappingManager.has("lib1").shouldBeTrue()
                LibMappingManager.has("lib2").shouldBeTrue()

                LibMappingManager.clearRuntimeConfig()

                // Runtime configs should be removed, but static configs should remain
                LibMappingManager.has("lib1").shouldBeFalse()
                LibMappingManager.has("lib2").shouldBeFalse()
                LibMappingManager.has("react").shouldBeTrue() // Static config
            }

            should("not affect static configs") {
                val staticMapping = LibMappingManager.getMapping("react")
                staticMapping.shouldNotBeNull()

                LibMappingManager.set("react", "https://custom-cdn.com/react@19.0.0")
                LibMappingManager.clearRuntimeConfig()

                // Should fallback to static config
                val mapping = LibMappingManager.getMapping("react")
                mapping?.mainSource shouldBe staticMapping?.mainSource
            }
        }

        context("has") {
            should("return true for static config") {
                LibMappingManager.has("react").shouldBeTrue()
                LibMappingManager.has("lodash").shouldBeTrue()
            }

            should("return true for runtime config") {
                LibMappingManager.set("custom-lib", "https://cdn.example.com/lib@1.0.0")
                LibMappingManager.has("custom-lib").shouldBeTrue()
            }

            should("return false for non-existent library") {
                LibMappingManager.has("non-existent-library").shouldBeFalse()
            }

            should("return true when library exists in runtime config even if removed from static") {
                LibMappingManager.set("temp-lib", "https://cdn.example.com/lib@1.0.0")
                LibMappingManager.has("temp-lib").shouldBeTrue()

                LibMappingManager.remove("temp-lib")
                LibMappingManager.has("temp-lib").shouldBeFalse()
            }
        }

        context("validateConfig") {
            should("return empty list for valid configs") {
                LibMappingManager.set("test-lib", "https://cdn.example.com/lib@1.0.0")
                val errors = LibMappingManager.validateConfig()
                errors.isEmpty().shouldBeTrue()
            }

            should("return errors for invalid configs with empty main source") {
                // Create a package with empty main source
                val invalidPackage = JavaScriptPackage("")
                LibMappingManager.set("invalid-lib", invalidPackage)

                val errors = LibMappingManager.validateConfig()
                errors.isNotEmpty().shouldBeTrue()
                errors.any { it.contains("invalid-lib") }.shouldBeTrue()
                errors.any { it.contains("cannot be empty") }.shouldBeTrue()
            }

            should("return errors for multiple invalid configs") {
                LibMappingManager.set("invalid-lib1", JavaScriptPackage(""))
                LibMappingManager.set("invalid-lib2", JavaScriptPackage(""))

                val errors = LibMappingManager.validateConfig()
                errors.size shouldBe 2
            }

            should("not validate static configs") {
                // Static configs are not validated, only runtime configs
                val errors = LibMappingManager.validateConfig()
                // Should be empty if no runtime configs with errors
                errors.isEmpty().shouldBeTrue()
            }
        }

        context("edge cases") {
            should("handle empty library name") {
                LibMappingManager.set("", "https://cdn.example.com/lib@1.0.0")
                val mapping = LibMappingManager.getMapping("")
                mapping.shouldNotBeNull()
            }

            should("handle special characters in library name") {
                val libName = "test-lib@1.0.0"
                LibMappingManager.set(libName, "https://cdn.example.com/lib@1.0.0")
                val mapping = LibMappingManager.getMapping(libName)
                mapping.shouldNotBeNull()
            }

            should("handle very long URLs") {
                val longUrl = "https://cdn.example.com/" + "a".repeat(1000) + "@1.0.0"
                LibMappingManager.set("test-lib", longUrl)
                val mapping = LibMappingManager.getMapping("test-lib")
                mapping?.mainSource shouldBe longUrl
            }

            should("handle multiple extra dependencies") {
                val extraUrls = (1..10).map { "https://cdn.example.com/extra$it@1.0.0" }
                LibMappingManager.set(
                    "test-lib",
                    "https://cdn.example.com/lib@1.0.0",
                    extraUrls,
                )

                val mapping = LibMappingManager.getMapping("test-lib")
                mapping?.extraSources?.size shouldBe 10
            }
        }
    })
