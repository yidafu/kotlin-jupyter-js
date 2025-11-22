package dev.yidafu.jupyter.processor

import dev.yidafu.jupyter.LanguageType
import io.kotest.core.spec.style.ShouldSpec
import io.kotest.matchers.shouldBe
import io.kotest.matchers.string.shouldContain
import io.kotest.matchers.string.shouldNotContain
import io.mockk.every
import io.mockk.mockkStatic
import java.io.File

class DefaultJavaScriptProcessorTest :
    ShouldSpec({

        context("JavaScript processing") {
            should("process basic JavaScript code") {
                val notebook = getMockNotebook()
                val processor = DefaultJavaScriptProcessor(notebook)

                val result =
                    processor.process(
                        LanguageType.JS,
                        """
                        const x = 1;
                        const y = 2;
                        console.log(x + y);
                        """.trimIndent(),
                    )

                result.shouldContain("JsCodeResult")
                // 验证代码被正确包装
                result.shouldContain("\"\"\"")
                // 验证原始代码内容被保留
                result.shouldContain("x")
                result.shouldContain("y")
                result.shouldContain("console.log")
            }

            should("process JavaScript code with top-level await") {
                val notebook = getMockNotebook()
                val processor = DefaultJavaScriptProcessor(notebook)

                val result =
                    processor.process(
                        LanguageType.JS,
                        """
                        const data = await fetch('https://api.example.com/data');
                        console.log(data);
                        """.trimIndent(),
                    )

                result.shouldContain("JsCodeResult")
                // 验证 top-level await 被保留（ES2020 特性）
                result.shouldContain("await")
                result.shouldContain("fetch")
            }

            should("process JavaScript code with nullish coalescing") {
                val notebook = getMockNotebook()
                val processor = DefaultJavaScriptProcessor(notebook)

                val result =
                    processor.process(
                        LanguageType.JS,
                        """
                        const value = null ?? 'default';
                        const value2 = undefined ?? 'default2';
                        """.trimIndent(),
                    )

                result.shouldContain("JsCodeResult")
                // 验证 nullish coalescing 操作符被保留（ES2020 特性）
                result.shouldContain("??")
                result.shouldContain("null")
            }

            should("process empty JavaScript code") {
                val notebook = getMockNotebook()
                val processor = DefaultJavaScriptProcessor(notebook)

                val result = processor.process(LanguageType.JS, "")

                // 验证空代码也能正常处理并返回 JsCodeResult
                result.shouldContain("JsCodeResult")
                result.shouldContain("\"\"\"")
            }

            should("process JavaScript code with @jupyter import") {
                val notebook = getMockNotebook()
                val processor = DefaultJavaScriptProcessor(notebook)

                val result =
                    processor.process(
                        LanguageType.JS,
                        """
                        import { foo, bar } from '@jupyter';
                        console.log(foo, bar);
                        """.trimIndent(),
                    )

                result.shouldContain("JsCodeResult")
                // 验证 @jupyter 导入语句被移除
                result.shouldNotContain("import { foo, bar } from '@jupyter'")
                result.shouldNotContain("from '@jupyter'")
                // 验证 @jupyter 导入被替换为 const 声明
                result.shouldContain("const foo")
                result.shouldContain("const bar")
                // 验证原始代码逻辑被保留
                result.shouldContain("console.log")
            }

            should("recursive load local script") {
                val notebook = getMockNotebook()

                mockkStatic("kotlin.io.FilesKt__FileReadWriteKt")

                every { File("./local.js").readText() } returns
                    """
                    |import { bar } from './local-2.js';
                    |console.log('local.js', bar);
                    |const foo = "foo";
                    |export { bar, foo };
                    """.trimMargin()
                every { File("./local-2.js").readText() } returns
                    """
                    export const bar = "bar";
                    """.trimIndent()
                val processor = DefaultJavaScriptProcessor(notebook)

                val result =
                    processor.process(
                        LanguageType.JS,
                        """
                        import { bar } from './local.js';
                        console.log('main.js', bar);
                        """.trimIndent(),
                    )
                // 验证全局导入：应该包含 global_ 前缀的变量声明和 IIFE 模式
                result.shouldContain("const global_")
                result.shouldContain("(function")
                // 验证内联导入：应该包含 inline_ 前缀的变量声明
                result.shouldContain("const inline_")
                // 验证内联变量引用了全局变量
                result.shouldContain("inline_")
                result.shouldContain("global_")
                // 验证导出的变量被包含在结果中
                result.shouldContain("bar")
            }
        }

        context("TypeScript processing") {
            should("process basic TypeScript code") {
                val notebook = getMockNotebook()
                val processor = DefaultJavaScriptProcessor(notebook)

                val result =
                    processor.process(
                        LanguageType.TS,
                        """
                        const x: number = 1;
                        const y: string = "hello";
                        function add(a: number, b: number): number {
                            return a + b;
                        }
                        """.trimIndent(),
                    )

                result.shouldContain("JsCodeResult")
                // 验证 TypeScript 类型注解被移除
                result.shouldNotContain(": number")
                result.shouldNotContain(": string")
                // 验证变量和函数被正确转换（SWC 可能将 const 转换为 var）
                result.shouldContain("x = 1")
                result.shouldContain("y = \"hello\"")
                result.shouldContain("function add")
                result.shouldContain("return a + b")
            }

            should("process TypeScript code with interface") {
                val notebook = getMockNotebook()
                val processor = DefaultJavaScriptProcessor(notebook)

                val result =
                    processor.process(
                        LanguageType.TS,
                        """
                        interface Person {
                            name: string;
                            age: number;
                        }
                        const person: Person = { name: "John", age: 30 };
                        """.trimIndent(),
                    )

                result.shouldContain("JsCodeResult")
                // 验证接口声明被移除（TypeScript 特有语法）
                result.shouldNotContain("interface Person")
                result.shouldNotContain("interface")
                // 验证对象字面量被保留
                result.shouldContain("name")
                result.shouldContain("age")
                result.shouldContain("John")
            }
        }

        context("JSX processing") {
            should("process basic JSX code") {
                val notebook = getMockNotebook()
                val processor = DefaultJavaScriptProcessor(notebook)

                val result =
                    processor.process(
                        LanguageType.JSX,
                        """
                        const element = <div>Hello World</div>;
                        """.trimIndent(),
                    )

                result.shouldContain("JsxCodeResult")
                // 验证 JSX 语法被转换（不包含原始 JSX 语法）
                result.shouldNotContain("<div>")
                result.shouldNotContain("</div>")
                // 验证 JSX 被转换为 React.createElement 调用
                result.shouldContain("React.createElement")
                // 验证内容被保留
                result.shouldContain("Hello World")
            }

            should("process JSX code with default export") {
                val notebook = getMockNotebook()
                val processor = DefaultJavaScriptProcessor(notebook)

                val result =
                    processor.process(
                        LanguageType.JSX,
                        """
                        export default function App() {
                            return <div>Hello</div>;
                        }
                        """.trimIndent(),
                    )

                result.shouldContain("JsxCodeResult")
                // 验证默认导出被转换为特殊变量名
                result.shouldContain("__JupyterCellDefaultExportVariable__")
                // 验证函数名被保留
                result.shouldContain("App")
                // 验证原始 JSX 被转换
                result.shouldNotContain("<div>")
            }

            should("process JSX code with component") {
                val notebook = getMockNotebook()
                val processor = DefaultJavaScriptProcessor(notebook)

                val result =
                    processor.process(
                        LanguageType.JSX,
                        """
                        function Greeting({ name }) {
                            return <h1>Hello, {name}!</h1>;
                        }
                        """.trimIndent(),
                    )

                result.shouldContain("JsxCodeResult")
                // 验证函数声明被保留
                result.shouldContain("function Greeting")
                // 验证 JSX 语法被转换
                result.shouldNotContain("<h1>")
                result.shouldNotContain("</h1>")
                // 验证 JSX 表达式被转换
                result.shouldContain("name")
                result.shouldContain("Hello")
            }
        }

        context("TSX processing") {
            should("process basic TSX code") {
                val notebook = getMockNotebook()
                val processor = DefaultJavaScriptProcessor(notebook)

                val result =
                    processor.process(
                        LanguageType.TSX,
                        """
                        const element: JSX.Element = <div>Hello World</div>;
                        """.trimIndent(),
                    )

                result.shouldContain("JsxCodeResult")
                // 验证 TypeScript 类型注解被移除
                result.shouldNotContain(": JSX.Element")
                result.shouldNotContain("JSX.Element")
                // 验证 JSX 语法被转换
                result.shouldNotContain("<div>")
                result.shouldNotContain("</div>")
                // 验证内容被保留
                result.shouldContain("Hello World")
            }

            should("process TSX code with typed component") {
                val notebook = getMockNotebook()
                val processor = DefaultJavaScriptProcessor(notebook)

                val result =
                    processor.process(
                        LanguageType.TSX,
                        """
                        interface Props {
                            name: string;
                        }
                        function Greeting({ name }: Props): JSX.Element {
                            return <h1>Hello, {name}!</h1>;
                        }
                        """.trimIndent(),
                    )

                result.shouldContain("JsxCodeResult")
                // 验证函数声明被保留
                result.shouldContain("function Greeting")
                // 验证 TypeScript 类型注解被移除
                result.shouldNotContain(": Props")
                result.shouldNotContain(": JSX.Element")
                result.shouldNotContain("interface Props")
                // 验证 JSX 语法被转换
                result.shouldNotContain("<h1>")
                result.shouldNotContain("</h1>")
                // 验证内容被保留
                result.shouldContain("name")
                result.shouldContain("Hello")
            }
        }

        context("Kotlin processing") {
            should("return Kotlin code as-is") {
                val notebook = getMockNotebook()
                val processor = DefaultJavaScriptProcessor(notebook)

                val kotlinCode =
                    """
                    val x = 1
                    val y = 2
                    println(x + y)
                    """.trimIndent()

                val result = processor.process(LanguageType.Kotlin, kotlinCode)

                result shouldBe kotlinCode
            }
        }

        context("Template string escaping") {
            should("escape template string syntax in output") {
                val notebook = getMockNotebook()
                val processor = DefaultJavaScriptProcessor(notebook)

                val result =
                    processor.process(
                        LanguageType.JS,
                        """
                        const template = `Value: ${'$'}{x}`;
                        """.trimIndent(),
                    )

                result.shouldContain("JsCodeResult")
                // 验证模板字符串中的 ${} 在 Kotlin 字符串模板中被转义
                result.shouldContain("\${")
                // 验证原始内容被保留
                result.shouldContain("Value")
                result.shouldContain("x")
            }
        }
    })
