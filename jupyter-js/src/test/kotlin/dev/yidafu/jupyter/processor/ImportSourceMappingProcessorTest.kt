package dev.yidafu.jupyter.processor

import dev.yidafu.jupyter.JavaScriptPackage
import dev.yidafu.jupyter.libmapping.LibMappingManager
import dev.yidafu.swc.generated.ImportDeclaration
import dev.yidafu.swc.generated.Module
import io.kotest.core.spec.style.ShouldSpec
import io.kotest.matchers.nulls.shouldBeNull
import io.kotest.matchers.nulls.shouldNotBeNull
import io.kotest.matchers.shouldBe
import io.kotest.matchers.shouldNotBe
import io.mockk.mockk

class ImportSourceMappingProcessorTest :
    ShouldSpec({
        beforeEach {
            // Clear runtime config before each test
            LibMappingManager.clearRuntimeConfig()
        }

        context("ImportSourceMappingProcessor - Static Configuration") {
            should("process and replace import source with static config from JSON") {
                val contextMock: JavascriptProcessContext = mockk(relaxed = true)
                val program =
                    processTestScript(
                        """
                    |import { useState } from "react";
                    |import React from "react";
                        """.trimMargin(),
                    )
                val processor = ImportSourceMappingProcessor()
                processor.process(program, contextMock)

                if (program is Module) {
                    val reactImport = program.body?.get(0)
                    if (reactImport is ImportDeclaration) {
                        reactImport.source?.value shouldBe "https://esm.sh/react@18.2.0"
                    }

                    val reactDefaultImport = program.body?.get(1)
                    if (reactDefaultImport is ImportDeclaration) {
                        reactDefaultImport.source?.value shouldBe "https://esm.sh/react@18.2.0"
                    }
                }
            }

            should("process import with extra dependencies from static config") {
                val contextMock: JavascriptProcessContext = mockk(relaxed = true)
                val program =
                    processTestScript(
                        """
                    |import highcharts from "highcharts";
                        """.trimMargin(),
                    )
                val processor = ImportSourceMappingProcessor()
                processor.process(program, contextMock)

                if (program is Module) {
                    val highcharts = program.body?.get(0)
                    if (highcharts is ImportDeclaration) {
                        highcharts.source?.value shouldBe "https://code.highcharts.com/es-modules/masters/highcharts.src.js"
                    }
                    // Should have extra dependencies added
                    program.body?.size shouldBe 4 // 1 original + 3 extra

                    // Check extra dependencies
                    val extra1 = program.body?.get(1)
                    if (extra1 is ImportDeclaration) {
                        extra1.source?.value shouldBe "https://code.highcharts.com/es-modules/masters/highcharts-more.src.js"
                        extra1.specifiers.shouldBeNull()
                    }

                    val extra2 = program.body?.get(2)
                    if (extra2 is ImportDeclaration) {
                        extra2.source?.value shouldBe "https://code.highcharts.com/es-modules/masters/modules/exporting.src.js"
                        extra2.specifiers.shouldBeNull()
                    }

                    val extra3 = program.body?.get(3)
                    if (extra3 is ImportDeclaration) {
                        extra3.source?.value shouldBe "https://code.highcharts.com/es-modules/masters/modules/export-data.src.js"
                        extra3.specifiers.shouldBeNull()
                    }
                }
            }

            should("not modify import source if library is not in mapping") {
                val contextMock: JavascriptProcessContext = mockk(relaxed = true)
                val originalSource = "./local-module.js"
                val program =
                    processTestScript(
                        """
                    |import { foo } from "$originalSource";
                        """.trimMargin(),
                    )
                val processor = ImportSourceMappingProcessor()
                processor.process(program, contextMock)

                if (program is Module) {
                    val importDecl = program.body?.get(0)
                    if (importDecl is ImportDeclaration) {
                        importDecl.source?.value shouldBe originalSource
                    }
                }
            }
        }

        context("ImportSourceMappingProcessor - Runtime Configuration") {
            should("use runtime config when available, overriding static config") {
                val contextMock: JavascriptProcessContext = mockk(relaxed = true)
                val runtimeUrl = "https://custom-cdn.com/react@19.0.0"

                // Set runtime config
                LibMappingManager.set("react", runtimeUrl)

                val program =
                    processTestScript(
                        """
                    |import { useState } from "react";
                        """.trimMargin(),
                    )
                val processor = ImportSourceMappingProcessor()
                processor.process(program, contextMock)

                if (program is Module) {
                    val reactImport = program.body?.get(0)
                    if (reactImport is ImportDeclaration) {
                        reactImport.source?.value shouldBe runtimeUrl
                    }
                }
            }

            should("use runtime config with extra dependencies") {
                val contextMock: JavascriptProcessContext = mockk(relaxed = true)
                val mainUrl = "https://custom-cdn.com/library@1.0.0"
                val extraUrl1 = "https://custom-cdn.com/library-plugin@1.0.0"
                val extraUrl2 = "https://custom-cdn.com/library-utils@1.0.0"

                // Set runtime config with extra dependencies
                LibMappingManager.set(
                    "custom-lib",
                    mainUrl,
                    listOf(extraUrl1, extraUrl2),
                )

                val program =
                    processTestScript(
                        """
                    |import { func } from "custom-lib";
                        """.trimMargin(),
                    )
                val processor = ImportSourceMappingProcessor()
                processor.process(program, contextMock)

                if (program is Module) {
                    val mainImport = program.body?.get(0)
                    if (mainImport is ImportDeclaration) {
                        mainImport.source?.value shouldBe mainUrl
                    }

                    program.body?.size shouldBe 3 // 1 original + 2 extra

                    val extra1 = program.body?.get(1)
                    if (extra1 is ImportDeclaration) {
                        extra1.source?.value shouldBe extraUrl1
                        extra1.specifiers.shouldBeNull()
                    }

                    val extra2 = program.body?.get(2)
                    if (extra2 is ImportDeclaration) {
                        extra2.source?.value shouldBe extraUrl2
                        extra2.specifiers.shouldBeNull()
                    }
                }
            }

            should("fallback to static config when runtime config is removed") {
                val contextMock: JavascriptProcessContext = mockk(relaxed = true)

                // Set and then remove runtime config
                LibMappingManager.set("react", "https://custom-cdn.com/react@19.0.0")
                LibMappingManager.remove("react")

                val program =
                    processTestScript(
                        """
                    |import { useState } from "react";
                        """.trimMargin(),
                    )
                val processor = ImportSourceMappingProcessor()
                processor.process(program, contextMock)

                if (program is Module) {
                    val reactImport = program.body?.get(0)
                    if (reactImport is ImportDeclaration) {
                        // Should use static config from JSON
                        reactImport.source?.value shouldBe "https://esm.sh/react@18.2.0"
                    }
                }
            }
        }

        context("ImportSourceMappingProcessor - Multiple Imports") {
            should("process multiple imports correctly") {
                val contextMock: JavascriptProcessContext = mockk(relaxed = true)
                val program =
                    processTestScript(
                        """
                    |import { useState, useEffect } from "react";
                    |import lodash from "lodash";
                    |import { map } from "lodash";
                        """.trimMargin(),
                    )
                val processor = ImportSourceMappingProcessor()
                processor.process(program, contextMock)

                if (program is Module) {
                    val reactImport = program.body?.get(0)
                    if (reactImport is ImportDeclaration) {
                        reactImport.source?.value shouldBe "https://esm.sh/react@18.2.0"
                    }

                    val lodashDefault = program.body?.get(1)
                    if (lodashDefault is ImportDeclaration) {
                        lodashDefault.source?.value?.trim() shouldBe "https://cdn.jsdelivr.net/npm/lodash-es@4.17.21/lodash.min.js"
                    }

                    val lodashNamed = program.body?.get(2)
                    if (lodashNamed is ImportDeclaration) {
                        lodashNamed.source?.value?.trim() shouldBe "https://cdn.jsdelivr.net/npm/lodash-es@4.17.21/lodash.min.js"
                    }
                }
            }

            should("process mixed mapped and unmapped imports") {
                val contextMock: JavascriptProcessContext = mockk(relaxed = true)
                val originalSource = "./local.js"
                val program =
                    processTestScript(
                        """
                    |import { useState } from "react";
                    |import { foo } from "$originalSource";
                    |import lodash from "lodash";
                        """.trimMargin(),
                    )
                val processor = ImportSourceMappingProcessor()
                processor.process(program, contextMock)

                if (program is Module) {
                    val reactImport = program.body?.get(0)
                    if (reactImport is ImportDeclaration) {
                        reactImport.source?.value shouldBe "https://esm.sh/react@18.2.0"
                    }

                    val localImport = program.body?.get(1)
                    if (localImport is ImportDeclaration) {
                        localImport.source?.value shouldBe originalSource
                    }

                    val lodashImport = program.body?.get(2)
                    if (lodashImport is ImportDeclaration) {
                        lodashImport.source?.value?.trim() shouldBe "https://cdn.jsdelivr.net/npm/lodash-es@4.17.21/lodash.min.js"
                    }
                }
            }
        }

        context("ImportSourceMappingProcessor - Edge Cases") {
            should("handle empty import source gracefully") {
                val contextMock: JavascriptProcessContext = mockk(relaxed = true)
                val program =
                    processTestScript(
                        """
                    |import {} from "react";
                        """.trimMargin(),
                    )
                val processor = ImportSourceMappingProcessor()
                processor.process(program, contextMock)

                if (program is Module) {
                    val importDecl = program.body?.get(0)
                    if (importDecl is ImportDeclaration) {
                        importDecl.source?.value shouldBe "https://esm.sh/react@18.2.0"
                    }
                }
            }

            should("handle namespace import") {
                val contextMock: JavascriptProcessContext = mockk(relaxed = true)
                val program =
                    processTestScript(
                        """
                    |import * as React from "react";
                        """.trimMargin(),
                    )
                val processor = ImportSourceMappingProcessor()
                processor.process(program, contextMock)

                if (program is Module) {
                    val importDecl = program.body?.get(0)
                    if (importDecl is ImportDeclaration) {
                        importDecl.source?.value shouldBe "https://esm.sh/react@18.2.0"
                        importDecl.specifiers.shouldNotBeNull()
                    }
                }
            }

            should("preserve import specifiers when replacing source") {
                val contextMock: JavascriptProcessContext = mockk(relaxed = true)
                val program =
                    processTestScript(
                        """
                    |import { useState, useEffect, useMemo } from "react";
                        """.trimMargin(),
                    )
                val processor = ImportSourceMappingProcessor()
                processor.process(program, contextMock)

                if (program is Module) {
                    val importDecl = program.body?.get(0)
                    if (importDecl is ImportDeclaration) {
                        importDecl.source?.value shouldBe "https://esm.sh/react@18.2.0"
                        importDecl.specifiers.shouldNotBeNull()
                        importDecl.specifiers?.size shouldBe 3
                    }
                }
            }

            should("handle import with empty source string") {
                val contextMock: JavascriptProcessContext = mockk(relaxed = true)
                val program =
                    processTestScript(
                        """
                    |import { useState } from "";
                        """.trimMargin(),
                    )
                val processor = ImportSourceMappingProcessor()
                processor.process(program, contextMock)

                if (program is Module) {
                    val importDecl = program.body?.get(0)
                    if (importDecl is ImportDeclaration) {
                        // Empty source should not be modified
                        importDecl.source?.value shouldBe ""
                    }
                }
            }

            should("handle import with null source") {
                val contextMock: JavascriptProcessContext = mockk(relaxed = true)
                val program =
                    processTestScript(
                        """
                    |import { useState } from "react";
                        """.trimMargin(),
                    )
                val processor = ImportSourceMappingProcessor()

                if (program is Module) {
                    val importDecl = program.body?.get(0)
                    if (importDecl is ImportDeclaration) {
                        // Temporarily set source to null to test null handling
                        val originalSource = importDecl.source
                        importDecl.source = null
                        processor.process(program, contextMock)
                        // Restore for cleanup
                        importDecl.source = originalSource
                    }
                }
            }

            should("handle library with empty extraSources list") {
                val contextMock: JavascriptProcessContext = mockk(relaxed = true)
                val mainUrl = "https://custom-cdn.com/library@1.0.0"

                // Set runtime config with empty extra dependencies
                LibMappingManager.set("custom-lib-empty", mainUrl, emptyList())

                val program =
                    processTestScript(
                        """
                    |import { func } from "custom-lib-empty";
                        """.trimMargin(),
                    )
                val processor = ImportSourceMappingProcessor()
                processor.process(program, contextMock)

                if (program is Module) {
                    val mainImport = program.body?.get(0)
                    if (mainImport is ImportDeclaration) {
                        mainImport.source?.value shouldBe mainUrl
                    }
                    // Should only have 1 import (no extra dependencies)
                    program.body?.size shouldBe 1
                }
            }

            should("handle non-ImportDeclaration module items") {
                val contextMock: JavascriptProcessContext = mockk(relaxed = true)
                val program =
                    processTestScript(
                        """
                    |const x = 1;
                    |import { useState } from "react";
                    |function foo() { return 42; }
                        """.trimMargin(),
                    )
                val processor = ImportSourceMappingProcessor()
                processor.process(program, contextMock)

                if (program is Module) {
                    // Should preserve non-import statements
                    program.body?.size shouldBe 3
                    val importDecl = program.body?.get(1)
                    if (importDecl is ImportDeclaration) {
                        importDecl.source?.value shouldBe "https://esm.sh/react@18.2.0"
                    }
                }
            }
        }
    })
