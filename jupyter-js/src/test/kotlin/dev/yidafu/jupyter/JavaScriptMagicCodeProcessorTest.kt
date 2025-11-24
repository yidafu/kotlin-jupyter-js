package dev.yidafu.jupyter

import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.string.shouldContain
import io.kotest.matchers.string.shouldNotContain
import io.mockk.mockk
import io.mockk.mockkClass
import org.jetbrains.kotlinx.jupyter.api.KotlinKernelHost
import org.jetbrains.kotlinx.jupyter.api.Notebook
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class JavaScriptMagicCodeProcessorTest :
    FunSpec({

        val notebook = mockkClass(Notebook::class)

        context("accepts method tests") {
            listOf(
                "%js\nvar code = 1;",
                "%javascript\nvar code = 1;",
                "%ts\nvar code: number = 1;",
                "%typescript\nvar code: number = 1;",
                "%jsx\nconst div = <div>Hello</div>;",
                "%tsx\nconst div = <div>Hello</div>;",
                " %js\n var code = 1;",
            ).forEach { code ->
                test("should accept magic command: ${code.take(10)}...") {
                    val processor = JavaScriptMagicCodeProcessor(notebook)
                    assertTrue(processor.accepts(code))
                }
            }

            listOf(
                "var code = 1;",
                "%javascrip",
                "%jp",
                "%jsxx",
                "%tsxx",
                """
                var x = 1;
                %js
                var y = 2;
                """.trimIndent(),
                "",
                "   \n\t  ",
                "var str = \"100% complete\";",
                "%JS\nvar code = 1;",
                "%JAVASCRIPT\nvar code = 1;",
            ).forEach { code ->
                test("should not accept: ${code.take(20)}...") {
                    val processor = JavaScriptMagicCodeProcessor(notebook)
                    assertFalse(processor.accepts(code))
                }
            }
        }

        context("process method tests") {
            listOf(
                "%js\nconsole.log(\"Hello\");" to null,
                "%ts\nconst x: number = 42;" to "number",
                "%jsx\nconst div = <div>Hello</div>;" to "React.createElement",
                "%tsx\nconst Component: React.FC = () => <div>Hello</div>;" to null,
            ).forEach { (code, expectedContent) ->
                test("should process ${code.take(5)} code successfully") {
                    val processor = JavaScriptMagicCodeProcessor(notebook)
                    val host = mockk<KotlinKernelHost>(relaxed = true)

                    val result = processor.process(code, host)
                    val outputCode = result.code
                    assertTrue(outputCode.isNotEmpty())
                    if (expectedContent != null) {
                        if (expectedContent == "number") {
                            outputCode shouldNotContain expectedContent
                        } else {
                            outputCode shouldContain expectedContent
                        }
                    }
                }
            }

            test("should remove magic command from code before processing") {
                val processor = JavaScriptMagicCodeProcessor(notebook)
                val host = mockk<KotlinKernelHost>(relaxed = true)

                val code =
                    """
                    %js
                    var x = 1;
                    """.trimIndent()

                val result = processor.process(code, host)

                val outputCode = result.code
                // Magic command should be removed, code should not contain %js
                assertFalse(outputCode.contains("%js"))
            }

            test("should handle processing errors gracefully") {
                val processor = JavaScriptMagicCodeProcessor(notebook)
                val host = mockk<KotlinKernelHost>(relaxed = true)

                // Create code that might cause processing error
                val code =
                    """
                    %js
                    invalid javascript syntax {{
                    """.trimIndent()

                val result = processor.process(code, host)

                val outputCode = result.code
                println("output code $outputCode")
                // Should return error HTML format or valid code
                assertTrue(outputCode.isNotEmpty())
                outputCode shouldContain "org.jetbrains.kotlinx.jupyter.api.HTML("
                outputCode shouldContain "<code>Error:"
            }

            test("should process code with only magic command or leading whitespace") {
                val processor = JavaScriptMagicCodeProcessor(notebook)
                val host = mockk<KotlinKernelHost>(relaxed = true)

                listOf(
                    "%js\n",
                    " %js\n var x = 1;",
                ).forEach { code ->
                    val result = processor.process(code, host)
                    val outputCode = result.code
                    assertTrue(outputCode.isNotEmpty())
                }
            }
        }
    })
