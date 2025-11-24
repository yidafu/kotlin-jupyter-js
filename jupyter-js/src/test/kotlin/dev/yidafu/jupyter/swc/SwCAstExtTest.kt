package dev.yidafu.jupyter.swc

import dev.yidafu.jupyter.processor.processTestScript
import dev.yidafu.swc.generated.*
import io.kotest.core.spec.style.ShouldSpec
import io.kotest.matchers.nulls.shouldBeNull
import io.kotest.matchers.shouldBe

class SwCAstExtTest :
    ShouldSpec({
        context("ModuleExportName?.getValue() tests") {
            should("should return correct value for Identifier type ModuleExportName") {
                // Parse code with export statement using Identifier as export name
                val program =
                    processTestScript(
                        """
                        export { foo };
                        """.trimIndent(),
                    )

                if (program is Module) {
                    val exportDecl =
                        program.body?.firstOrNull { it is ExportNamedDeclaration } as? ExportNamedDeclaration
                    val specifier =
                        exportDecl?.specifiers?.firstOrNull { it is NamedExportSpecifier } as? NamedExportSpecifier

                    val moduleExportName: ModuleExportName? = specifier?.orig
                    val value = moduleExportName.getValue()

                    value shouldBe "foo"
                }
            }

            should("should return correct value for StringLiteral type ModuleExportName") {
                // Parse code with export statement using StringLiteral as export name
                // export { foo as "bar" } - here "bar" is StringLiteral
                val program =
                    processTestScript(
                        """
                        const foo = "test";
                        export { foo as "bar" };
                        """.trimIndent(),
                    )

                if (program is Module) {
                    val exportDecl =
                        program.body?.firstOrNull { it is ExportNamedDeclaration } as? ExportNamedDeclaration
                    val specifier =
                        exportDecl?.specifiers?.firstOrNull { it is NamedExportSpecifier } as? NamedExportSpecifier

                    // exported field should be StringLiteral type
                    val moduleExportName: ModuleExportName? = specifier?.exported
                    val value = moduleExportName.getValue()

                    value shouldBe "bar"
                }
            }

            should("should return null for null ModuleExportName") {
                val moduleExportName: ModuleExportName? = null
                val value = moduleExportName.getValue()

                value.shouldBeNull()
            }

            should("should return correct value for Identifier type orig field") {
                val program =
                    processTestScript(
                        """
                        const foo = "test";
                        export { foo };
                        """.trimIndent(),
                    )

                if (program is Module) {
                    val exportDecl =
                        program.body?.firstOrNull { it is ExportNamedDeclaration } as? ExportNamedDeclaration
                    val specifier =
                        exportDecl?.specifiers?.firstOrNull { it is NamedExportSpecifier } as? NamedExportSpecifier

                    val origValue = specifier?.orig?.getValue()
                    origValue shouldBe "foo"
                }
            }

            should("should return correct value for StringLiteral type exported field") {
                val program =
                    processTestScript(
                        """
                        const foo = "test";
                        export { foo as "renamed" };
                        """.trimIndent(),
                    )

                if (program is Module) {
                    val exportDecl =
                        program.body?.firstOrNull { it is ExportNamedDeclaration } as? ExportNamedDeclaration
                    val specifier =
                        exportDecl?.specifiers?.firstOrNull { it is NamedExportSpecifier } as? NamedExportSpecifier

                    // exported should be StringLiteral
                    val exportedValue = specifier?.exported?.getValue()
                    exportedValue shouldBe "renamed"
                }
            }

            should("should handle multiple exports including StringLiteral type") {
                val program =
                    processTestScript(
                        """
                        const a = 1;
                        const b = 2;
                        export { a, b as "two" };
                        """.trimIndent(),
                    )

                if (program is Module) {
                    val exportDecl =
                        program.body?.firstOrNull { it is ExportNamedDeclaration } as? ExportNamedDeclaration
                    val specifiers =
                        exportDecl?.specifiers?.filterIsInstance<NamedExportSpecifier>() ?: emptyList()

                    // First export: a (Identifier)
                    val firstSpecifier = specifiers.firstOrNull { it.orig?.getValue() == "a" }
                    firstSpecifier?.orig?.getValue() shouldBe "a"

                    // Second export: b as "two" (orig is Identifier, exported is StringLiteral)
                    val secondSpecifier = specifiers.firstOrNull { it.orig?.getValue() == "b" }
                    secondSpecifier?.orig?.getValue() shouldBe "b"
                    secondSpecifier?.exported?.getValue() shouldBe "two"
                }
            }
        }
    })
