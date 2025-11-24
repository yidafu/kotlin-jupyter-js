package dev.yidafu.jupyter

import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.shouldBe
import io.kotest.matchers.string.shouldBeEmpty
import io.kotest.matchers.string.shouldNotContain

class JsMagicMatcherTest :
    FunSpec({

        context("Cases that do not match any js magic") {
            listOf(
                " var code = 1;",
                "%javascrip",
                "%jp",
                "%jsxx",
                "%%js",
                "abc%js",
                """ val foo ="string"; """,
                """
                USE {
                    addCodePreprocessor(dev.yidafu.jupyter.JavaScriptMagicCodeProcessor(this.notebook));
                }
                """.trimIndent(),
            ).forEach {
                test("\"$it\" should return Kotlin language type") {
                    JsMagicMatcher(it).match() shouldBe LanguageType.Kotlin
                }
            }
        }

        context("Cases matching a single magic command") {
            listOf(
                "%js\nvar code = 1;" to LanguageType.JS,
                " %javascript\n var code = 1;" to LanguageType.JS,
                "%jsx\nconst div = <Div></Div>" to LanguageType.JSX,
                "%ts\nvar code = 1;" to LanguageType.TS,
                " %typescript\n var code = 1;" to LanguageType.TS,
                " %tsx\nconst div = <Div></Div>" to LanguageType.TSX,
            ).forEach {
                test("\"${it.first}\" should match ${it.second}") {
                    val matcher = JsMagicMatcher(it.first)
                    matcher.match() shouldBe it.second

                    val str =
                        listOf("%jsx", "%javascript", "%js", "%tsx", "%typescript", "%ts").fold(it.first) { s, k ->
                            s.replace(k, "")
                        }

                    str shouldNotContain "%"
                    matcher.cleanSourceCode.trim() shouldBe str.trim()
                }
            }
        }

        context("Edge cases") {
            test("Empty string should return Kotlin") {
                val matcher = JsMagicMatcher("")
                matcher.match() shouldBe LanguageType.Kotlin
                matcher.cleanSourceCode.shouldBeEmpty()
            }

            test("String with only whitespace should return Kotlin") {
                val matcher = JsMagicMatcher("   \n\t  ")
                matcher.match() shouldBe LanguageType.Kotlin
                matcher.cleanSourceCode.trim().shouldBeEmpty()
            }

            test("Only magic command without code should return corresponding language type") {
                val matcher = JsMagicMatcher("%js\n")
                matcher.match() shouldBe LanguageType.JS
                matcher.cleanSourceCode.trim().shouldBeEmpty()
            }

            test("Only % symbol should return Kotlin") {
                val matcher = JsMagicMatcher("%")
                matcher.match() shouldBe LanguageType.Kotlin
                matcher.cleanSourceCode shouldBe "%"
            }
        }

        context("Cases with multiple magic commands") {
            test("Magic commands in the middle should not be recognized, only at the beginning") {
                val code = "%js\nvar x = 1;\n%ts\nvar y = 2;"
                val matcher = JsMagicMatcher(code)
                // Only recognize %js at the beginning, %ts in the middle should not be recognized
                matcher.match() shouldBe LanguageType.JS
                matcher.cleanSourceCode.trim() shouldBe "var x = 1;\n%ts\nvar y = 2;"
            }

            test("Magic command at the beginning should be recognized") {
                val code = "%js\nvar x = 1;\nvar y = 2;"
                val matcher = JsMagicMatcher(code)
                matcher.match() shouldBe LanguageType.JS
                matcher.cleanSourceCode.trim() shouldBe "var x = 1;\nvar y = 2;"
            }

            test("Magic-like strings in the middle should not be recognized") {
                val code = "var x = '%js';\nvar y = 2;"
                val matcher = JsMagicMatcher(code)
                matcher.match() shouldBe LanguageType.Kotlin
                matcher.cleanSourceCode shouldBe code
            }
        }

        context("Whitespace handling") {
            test("Magic command separated by tab should match") {
                val code = "%js\tvar code = 1;"
                val matcher = JsMagicMatcher(code)
                matcher.match() shouldBe LanguageType.JS
                matcher.cleanSourceCode.trim() shouldBe "var code = 1;"
            }

            test("Magic command separated by multiple whitespace characters should match") {
                val code = "  %js  \n  \t  var code = 1;"
                val matcher = JsMagicMatcher(code)
                matcher.match() shouldBe LanguageType.JS
                matcher.cleanSourceCode.trim() shouldBe "var code = 1;"
            }

            test("Magic command with whitespace before and after should be handled correctly") {
                val code = "\n\t%javascript\n\tvar code = 1;\n"
                val matcher = JsMagicMatcher(code)
                matcher.match() shouldBe LanguageType.JS
                matcher.cleanSourceCode.trim() shouldBe "var code = 1;"
            }
        }

        context("Multi-line code handling") {
            test("Multi-line JavaScript code should match correctly") {
                val code =
                    """
                    %js
                    function hello() {
                        console.log("Hello");
                        return "World";
                    }
                    hello();
                    """.trimIndent()
                val matcher = JsMagicMatcher(code)
                matcher.match() shouldBe LanguageType.JS
                val expected =
                    """
                    function hello() {
                        console.log("Hello");
                        return "World";
                    }
                    hello();
                    """.trimIndent()
                matcher.cleanSourceCode.trim() shouldBe expected.trim()
            }

            test("Multi-line JSX code should match correctly") {
                val code =
                    """
                    %jsx
                    const Component = () => {
                        return (
                            <div>
                                <h1>Hello</h1>
                                <p>World</p>
                            </div>
                        );
                    };
                    """.trimIndent()
                val matcher = JsMagicMatcher(code)
                matcher.match() shouldBe LanguageType.JSX
                val expected =
                    """
                    const Component = () => {
                        return (
                            <div>
                                <h1>Hello</h1>
                                <p>World</p>
                            </div>
                        );
                    };
                    """.trimIndent()
                matcher.cleanSourceCode.trim() shouldBe expected.trim()
            }

            test("Multi-line TypeScript code should match correctly") {
                val code =
                    """
                    %ts
                    interface User {
                        name: string;
                        age: number;
                    }
                    const user: User = { name: "John", age: 30 };
                    """.trimIndent()
                val matcher = JsMagicMatcher(code)
                matcher.match() shouldBe LanguageType.TS
                val expected =
                    """
                    interface User {
                        name: string;
                        age: number;
                    }
                    const user: User = { name: "John", age: 30 };
                    """.trimIndent()
                matcher.cleanSourceCode.trim() shouldBe expected.trim()
            }
        }

        context("Magic commands in the middle of code") {
            test("Magic commands in the middle should not be recognized") {
                val code = "var x = 1;\n%js\nvar y = 2;"
                val matcher = JsMagicMatcher(code)
                matcher.match() shouldBe LanguageType.Kotlin
                matcher.cleanSourceCode shouldBe code
            }

            test("Multiple magic commands in the middle should not be recognized") {
                val code = "var x = 1;\n%js\nvar y = 2;\n%ts\nvar z = 3;"
                val matcher = JsMagicMatcher(code)
                matcher.match() shouldBe LanguageType.Kotlin
                matcher.cleanSourceCode shouldBe code
            }

            test("Percent symbol in the middle should not be misidentified as magic command") {
                val code = "var x = 1;\nvar percent = 100%;\nvar y = 2;"
                val matcher = JsMagicMatcher(code)
                matcher.match() shouldBe LanguageType.Kotlin
                matcher.cleanSourceCode shouldBe code
            }
        }

        context("Special characters and edge cases") {
            test("String code containing % symbol should not be misidentified") {
                val code = "var str = \"100% complete\";"
                val matcher = JsMagicMatcher(code)
                matcher.match() shouldBe LanguageType.Kotlin
                matcher.cleanSourceCode shouldBe code
            }

            test("Comments containing % symbol should not be misidentified") {
                val code = "// This is 100% correct\nvar code = 1;"
                val matcher = JsMagicMatcher(code)
                matcher.match() shouldBe LanguageType.Kotlin
                matcher.cleanSourceCode shouldBe code
            }

            test("Incomplete javascript command should not match") {
                val code = "%javascri\nvar code = 1;"
                val matcher = JsMagicMatcher(code)
                matcher.match() shouldBe LanguageType.Kotlin
            }

            test("Incomplete typescript command should not match") {
                val code = "%typescrip\nvar code = 1;"
                val matcher = JsMagicMatcher(code)
                matcher.match() shouldBe LanguageType.Kotlin
            }

            test("Magic command followed immediately by non-whitespace character should not match") {
                val code = "%jsxvar code = 1;"
                val matcher = JsMagicMatcher(code)
                matcher.match() shouldBe LanguageType.Kotlin
            }

            test("Magic command followed immediately by other characters should not match") {
                val code = "%js.var code = 1;"
                val matcher = JsMagicMatcher(code)
                matcher.match() shouldBe LanguageType.Kotlin
            }
        }

        context("cleanSourceCode functionality tests") {
            test("Remove single magic command") {
                val code = "%js\nconsole.log('test');"
                val matcher = JsMagicMatcher(code)
                matcher.cleanSourceCode.trim() shouldBe "console.log('test');"
            }

            test("Remove magic command at the beginning, middle ones will not be removed") {
                val code = "%js\nvar x = 1;\n%ts\nvar y = 2;\n%jsx\nconst div = <div></div>;"
                val matcher = JsMagicMatcher(code)
                // Only remove %js at the beginning, %ts and %jsx in the middle will not be removed
                matcher.cleanSourceCode.trim() shouldBe "var x = 1;\n%ts\nvar y = 2;\n%jsx\nconst div = <div></div>;"
            }

            test("Remove full-form magic command at the beginning") {
                val code = "%javascript\nvar x = 1;\n%typescript\nvar y = 2;"
                val matcher = JsMagicMatcher(code)
                // Only remove %javascript at the beginning, %typescript in the middle will not be removed
                matcher.cleanSourceCode.trim() shouldBe "var x = 1;\n%typescript\nvar y = 2;"
            }

            test("Should return original code when no magic command exists") {
                val code = "var x = 1;\nvar y = 2;"
                val matcher = JsMagicMatcher(code)
                matcher.cleanSourceCode shouldBe code
            }
        }

        context("Case sensitivity tests") {
            test("Uppercase magic command should not match") {
                val code = "%JS\nvar code = 1;"
                val matcher = JsMagicMatcher(code)
                matcher.match() shouldBe LanguageType.Kotlin
            }

            test("Mixed case magic command should not match") {
                val code = "%Js\nvar code = 1;"
                val matcher = JsMagicMatcher(code)
                matcher.match() shouldBe LanguageType.Kotlin
            }

            test("Uppercase JAVASCRIPT should not match") {
                val code = "%JAVASCRIPT\nvar code = 1;"
                val matcher = JsMagicMatcher(code)
                matcher.match() shouldBe LanguageType.Kotlin
            }
        }
    })
