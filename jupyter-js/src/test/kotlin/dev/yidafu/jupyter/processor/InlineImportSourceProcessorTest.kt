package dev.yidafu.jupyter.processor

import dev.yidafu.jupyter.CircularDependencyException
import dev.yidafu.swc.generated.CallExpression
import dev.yidafu.swc.generated.ImportDeclaration
import dev.yidafu.swc.generated.Module
import dev.yidafu.swc.generated.VariableDeclaration
import io.kotest.assertions.throwables.shouldThrow
import io.kotest.core.spec.style.ShouldSpec
import io.kotest.matchers.shouldBe
import io.kotest.matchers.string.shouldContain
import io.kotest.matchers.types.beOfType
import io.mockk.every
import io.mockk.mockkStatic
import io.mockk.verify
import java.io.File
import java.io.FileNotFoundException
import java.net.URL

class InlineImportSourceProcessorTest :
    ShouldSpec({
        val processor = InlineImportSourceProcessor()

        context("InlineImportSourceProcessor") {
            should("correctly process local imports") {
                val absoluteJsContent = "export const foo = 'foo'"
                val localJsContent =
                    """
                |export const foo = 'foo';
                |export function bar() {
                |    return 'bar';
                |}
                |export class Foo {}
                |export const { a, b: c } = obj
                |export { foo as baz, bar }
                |export default Foo;
                    """.trimMargin()
                val local2MjsContent = "export const foo = 'foo'"

                val program =
                    processTestScript(
                        """
                        import * as foo from '/tmp/absolute.js';
                        import { bar } from './local.js';
                        import './local2.mjs';
                        """.trimIndent(),
                    )
                program shouldBe beOfType<Module>()
                if (program is Module) {
                    // import declaration
                    program.body?.get(0) shouldBe beOfType<ImportDeclaration>()
                }
                val notebook = getMockNotebook()
                val context = JavascriptProcessContext(DefaultJavaScriptProcessor(notebook))

                mockkStatic("kotlin.io.FilesKt__FileReadWriteKt")

                every { File("/tmp/absolute.js").readText() } returns absoluteJsContent
                every { File("./local.js").readText() } returns localJsContent
                every { File("./local2.mjs").readText() } returns local2MjsContent

                processor.process(program, context)

                if (program is Module) {
                    // iife
                    program.body?.get(0) shouldBe beOfType<VariableDeclaration>()

                    // 验证全局导入中包含内联代码
                    context.globalImports.size shouldBe 3
                    val globalCode = context.globalImports.joinToString("\n") { printTestVariableDeclaration(it) }
                    globalCode shouldContain "foo"
                    globalCode shouldContain "bar"
                    globalCode shouldContain "function bar()"
                    globalCode shouldContain "class Foo"
                }
            }

            should("correctly process remote inline imports") {
                val originSource = "http://example.com/script.js?inline"
                val remoteContent = "export const foo = 'foo';\nexport default function foo() {};"
                val program =
                    processTestScript(
                        """
                        import Foo, { foo, bar as baz } from "$originSource";
                        """.trimIndent(),
                    ) // Assume we have a mock Program object representing a module with remote inline imports
                if (program is Module) {
                    // import declaration
                    program.body?.get(0) shouldBe beOfType<ImportDeclaration>()
                }
                mockkStatic(URL::readBytes)
                every { URL(originSource).readBytes() } returns remoteContent.toByteArray()

                val notebook = getMockNotebook()
                val context = JavascriptProcessContext(DefaultJavaScriptProcessor(notebook))

                processor.process(program, context)

                verify(exactly = 1) { URL(originSource).readBytes() }

                if (program is Module) {
                    program.body?.get(0) shouldBe beOfType<VariableDeclaration>()

                    // 验证全局导入中包含远程内联代码
                    context.globalImports.size shouldBe 1
                    val globalCode = context.globalImports.joinToString("\n") { printTestVariableDeclaration(it) }
                    globalCode shouldContain "foo"
                    globalCode shouldContain "const foo = 'foo'"
                    globalCode shouldContain "function foo()"
                }
            }

            should("correctly process react jsx script") {
                val program =
                    processTestScript(
                        """
                        import { foo } from './local.jsx';
                        """.trimIndent(),
                    )
                program shouldBe beOfType<Module>()
                if (program is Module) {
                    // import declaration
                    program.body?.get(0) shouldBe beOfType<ImportDeclaration>()
                }
                val notebook = getMockNotebook()
                val context = JavascriptProcessContext(DefaultJavaScriptProcessor(notebook))

                mockkStatic("kotlin.io.FilesKt__FileReadWriteKt")
                every { File("./local.jsx").readText() } returns "export default function App() { return <h1>Title</h1>; }"
                processor.process(program, context)

                if (program is Module) {
                    // iife
                    program.body?.get(0) shouldBe beOfType<VariableDeclaration>()
                }
            }

            should("correctly process typescript script") {
                val program =
                    processTestScript(
                        """
                        import { foo } from './local.ts';
                        """.trimIndent(),
                    )
                program shouldBe beOfType<Module>()
                if (program is Module) {
                    // import declaration
                    program.body?.get(0) shouldBe beOfType<ImportDeclaration>()
                }
                val notebook = getMockNotebook()
                val context = JavascriptProcessContext(DefaultJavaScriptProcessor(notebook))

                mockkStatic("kotlin.io.FilesKt__FileReadWriteKt")
                every { File("./local.ts").readText() } returns "export const foo: string = 'foo';"
                processor.process(program, context)

                if (program is Module) {
                    // iife
                    program.body?.get(0) shouldBe beOfType<VariableDeclaration>()
                }
            }

            should("correctly process react tsx script") {
                val program =
                    processTestScript(
                        """
                        import { foo } from './local.tsx';
                        """.trimIndent(),
                    )
                program shouldBe beOfType<Module>()
                if (program is Module) {
                    // import declaration
                    program.body?.get(0) shouldBe beOfType<ImportDeclaration>()
                }
                val notebook = getMockNotebook()
                val context = JavascriptProcessContext(DefaultJavaScriptProcessor(notebook))

                mockkStatic("kotlin.io.FilesKt__FileReadWriteKt")
                every { File("./local.tsx").readText() } returns
                    "export default function App(): React.ReactElement { return <h1>Title</h1>; }"
                processor.process(program, context)

                if (program is Module) {
                    // iife
                    program.body?.get(0) shouldBe beOfType<VariableDeclaration>()
                }
            }
            should("throw IllegalStateException when import not .(j|t)sx?") {
                val program =
                    processTestScript(
                        """
                        import { foo } from './local.kt';
                        """.trimIndent(),
                    )
                program shouldBe beOfType<Module>()

                val notebook = getMockNotebook()
                val context = JavascriptProcessContext(DefaultJavaScriptProcessor(notebook))
                mockkStatic("kotlin.io.FilesKt__FileReadWriteKt")
                every { File("./local.kt").readText() } returns "val foo: String = \"Foo\""
                shouldThrow<IllegalStateException> {
                    processor.process(program, context)
                }
            }

            should("throw  CircularDependencyException when circular dependency occur") {
                val program =
                    processTestScript(
                        """
                        import { bar } from './local.js';
                        console.log('main.js', bar);
                        """.trimIndent(),
                    )
                val notebook = getMockNotebook()
                val context = JavascriptProcessContext(DefaultJavaScriptProcessor(notebook))

                mockkStatic("kotlin.io.FilesKt__FileReadWriteKt")

                every { File("./local.js").readText() } returns
                    """
                    import { bar } from './local-2.js';
                    console.log('local.js', bar);
                    const foo = "foo";
                    export { bar, foo };
                    """.trimIndent()
                every { File("./local-2.js").readText() } returns
                    """
                    import { foo } from "./local.js";
                    console.log("local-2.js", foo);
                    export const bar = "bar";
                    """.trimIndent()

                shouldThrow<CircularDependencyException> {
                    processor.process(program, context)
                }
            }

            should("correctly process default import") {
                val inlineContent =
                    """
                    export default class Foo {
                        constructor() {
                            this.name = 'Foo';
                        }
                    }
                    """.trimIndent()

                val program =
                    processTestScript(
                        """
                        import Foo from './default.js';
                        """.trimIndent(),
                    )
                val notebook = getMockNotebook()
                val context = JavascriptProcessContext(DefaultJavaScriptProcessor(notebook))

                mockkStatic("kotlin.io.FilesKt__FileReadWriteKt")
                every { File("./default.js").readText() } returns inlineContent

                processor.process(program, context)

                if (program is Module) {
                    program.body?.get(0) shouldBe beOfType<VariableDeclaration>()
                    // 应该生成 localVarName 和 default 的变量声明
                    program.body?.size shouldBe 2

                    // 验证全局导入中包含内联代码
                    context.globalImports.size shouldBe 1
                    val globalCode = context.globalImports.joinToString("\n") { printTestVariableDeclaration(it) }
                    globalCode shouldContain "Foo"
                    globalCode shouldContain "class Foo"
                    globalCode shouldContain "this.name = 'Foo'"
                }
            }

            should("correctly process named import with multiple specifiers") {
                val inlineContent =
                    """
                    export const foo = 'foo';
                    export const bar = 'bar';
                    export const baz = 'baz';
                    """.trimIndent()

                val program =
                    processTestScript(
                        """
                        import { foo, bar, baz } from './named.js';
                        """.trimIndent(),
                    )
                val notebook = getMockNotebook()
                val context = JavascriptProcessContext(DefaultJavaScriptProcessor(notebook))

                mockkStatic("kotlin.io.FilesKt__FileReadWriteKt")
                every { File("./named.js").readText() } returns inlineContent

                processor.process(program, context)

                if (program is Module) {
                    program.body?.get(0) shouldBe beOfType<VariableDeclaration>()
                    // 应该生成 localVarName 和三个命名导入的变量声明
                    program.body?.size shouldBe 4

                    // 验证全局导入中包含内联代码
                    context.globalImports.size shouldBe 1
                    val globalCode = context.globalImports.joinToString("\n") { printTestVariableDeclaration(it) }
                    globalCode shouldContain "foo"
                    globalCode shouldContain "bar"
                    globalCode shouldContain "baz"
                    globalCode shouldContain "const foo = 'foo'"
                    globalCode shouldContain "const bar = 'bar'"
                    globalCode shouldContain "const baz = 'baz'"
                }
            }

            should("correctly process namespace import") {
                val program =
                    processTestScript(
                        """
                        import * as utils from './utils.js';
                        """.trimIndent(),
                    )
                val notebook = getMockNotebook()
                val context = JavascriptProcessContext(DefaultJavaScriptProcessor(notebook))

                mockkStatic("kotlin.io.FilesKt__FileReadWriteKt")
                every { File("./utils.js").readText() } returns
                    """
                    export const foo = 'foo';
                    export function bar() { return 'bar'; }
                    """.trimIndent()

                processor.process(program, context)

                if (program is Module) {
                    program.body?.get(0) shouldBe beOfType<VariableDeclaration>()
                    // 应该生成 localVarName 和 namespace import 的变量声明
                    program.body?.size shouldBe 2
                }
            }

            should("correctly process mixed import (default + named)") {
                val program =
                    processTestScript(
                        """
                        import DefaultExport, { named1, named2 } from './mixed.js';
                        """.trimIndent(),
                    )
                val notebook = getMockNotebook()
                val context = JavascriptProcessContext(DefaultJavaScriptProcessor(notebook))

                mockkStatic("kotlin.io.FilesKt__FileReadWriteKt")
                every { File("./mixed.js").readText() } returns
                    """
                    export default 'default';
                    export const named1 = 'named1';
                    export const named2 = 'named2';
                    """.trimIndent()

                processor.process(program, context)

                if (program is Module) {
                    program.body?.get(0) shouldBe beOfType<VariableDeclaration>()
                    // 应该生成 localVarName、default 和两个 named 的变量声明
                    program.body?.size shouldBe 4
                }
            }

            should("skip remote URL without inline parameter") {
                val originSource = "http://example.com/script.js"
                val program =
                    processTestScript(
                        """
                        import { foo } from "$originSource";
                        """.trimIndent(),
                    )
                val notebook = getMockNotebook()
                val context = JavascriptProcessContext(DefaultJavaScriptProcessor(notebook))

                processor.process(program, context)

                if (program is Module) {
                    // 应该保持原样，不处理
                    program.body?.get(0) shouldBe beOfType<ImportDeclaration>()
                }
            }

            should("correctly process empty file") {
                val program =
                    processTestScript(
                        """
                        import { foo } from './empty.js';
                        """.trimIndent(),
                    )
                val notebook = getMockNotebook()
                val context = JavascriptProcessContext(DefaultJavaScriptProcessor(notebook))

                mockkStatic("kotlin.io.FilesKt__FileReadWriteKt")
                every { File("./empty.js").readText() } returns ""

                processor.process(program, context)

                if (program is Module) {
                    // 空文件不会被处理（因为 inlineContext.isEmpty()），应该保持原样
                    program.body?.get(0) shouldBe beOfType<ImportDeclaration>()
                }
            }

            should("correctly process export default function") {
                val inlineContent =
                    """
                    export default function Foo() {
                        return 'foo';
                    }
                    """.trimIndent()

                val program =
                    processTestScript(
                        """
                        import Foo from './default-fn.js';
                        """.trimIndent(),
                    )
                val notebook = getMockNotebook()
                val context = JavascriptProcessContext(DefaultJavaScriptProcessor(notebook))

                mockkStatic("kotlin.io.FilesKt__FileReadWriteKt")
                every { File("./default-fn.js").readText() } returns inlineContent

                processor.process(program, context)

                if (program is Module) {
                    program.body?.get(0) shouldBe beOfType<VariableDeclaration>()
                    // 验证 IIFE 被添加到全局导入
                    context.globalImports.size shouldBe 1
                    val globalCode = context.globalImports.joinToString("\n") { printTestVariableDeclaration(it) }
                    globalCode shouldContain "function Foo()"
                    globalCode shouldContain "return 'foo'"
                }
            }

            should("correctly process export default expression") {
                val program =
                    processTestScript(
                        """
                        import value from './default-expr.js';
                        """.trimIndent(),
                    )
                val notebook = getMockNotebook()
                val context = JavascriptProcessContext(DefaultJavaScriptProcessor(notebook))

                mockkStatic("kotlin.io.FilesKt__FileReadWriteKt")
                every { File("./default-expr.js").readText() } returns
                    """
                    export default 42;
                    """.trimIndent()

                processor.process(program, context)

                if (program is Module) {
                    program.body?.get(0) shouldBe beOfType<VariableDeclaration>()
                }
            }

            should("correctly process export named declaration") {
                val program =
                    processTestScript(
                        """
                        import { foo, bar } from './named-export.js';
                        """.trimIndent(),
                    )
                val notebook = getMockNotebook()
                val context = JavascriptProcessContext(DefaultJavaScriptProcessor(notebook))

                mockkStatic("kotlin.io.FilesKt__FileReadWriteKt")
                every { File("./named-export.js").readText() } returns
                    """
                    const foo = 'foo';
                    const bar = 'bar';
                    export { foo, bar };
                    """.trimIndent()

                processor.process(program, context)

                if (program is Module) {
                    program.body?.get(0) shouldBe beOfType<VariableDeclaration>()
                }
            }

            should("correctly process export with renamed specifiers") {
                val program =
                    processTestScript(
                        """
                        import { baz, qux } from './renamed-export.js';
                        """.trimIndent(),
                    )
                val notebook = getMockNotebook()
                val context = JavascriptProcessContext(DefaultJavaScriptProcessor(notebook))

                mockkStatic("kotlin.io.FilesKt__FileReadWriteKt")
                every { File("./renamed-export.js").readText() } returns
                    """
                    const foo = 'foo';
                    const bar = 'bar';
                    export { foo as baz, bar as qux };
                    """.trimIndent()

                processor.process(program, context)

                if (program is Module) {
                    program.body?.get(0) shouldBe beOfType<VariableDeclaration>()
                }
            }

            should("correctly process export class") {
                val inlineContent =
                    """
                    export class MyClass {
                        constructor(name) {
                            this.name = name;
                        }
                    }
                    """.trimIndent()

                val program =
                    processTestScript(
                        """
                        import { MyClass } from './class-export.js';
                        """.trimIndent(),
                    )
                val notebook = getMockNotebook()
                val context = JavascriptProcessContext(DefaultJavaScriptProcessor(notebook))

                mockkStatic("kotlin.io.FilesKt__FileReadWriteKt")
                every { File("./class-export.js").readText() } returns inlineContent

                processor.process(program, context)

                if (program is Module) {
                    program.body?.get(0) shouldBe beOfType<VariableDeclaration>()

                    // 验证全局导入中包含内联代码
                    context.globalImports.size shouldBe 1
                    val globalCode = context.globalImports.joinToString("\n") { printTestVariableDeclaration(it) }
                    globalCode shouldContain "class MyClass"
                    globalCode shouldContain "constructor(name)"
                    globalCode shouldContain "this.name = name"
                }
            }

            should("correctly process export function") {
                val inlineContent =
                    """
                    export function myFunction() {
                        return 'result';
                    }
                    """.trimIndent()

                val program =
                    processTestScript(
                        """
                        import { myFunction } from './function-export.js';
                        """.trimIndent(),
                    )
                val notebook = getMockNotebook()
                val context = JavascriptProcessContext(DefaultJavaScriptProcessor(notebook))

                mockkStatic("kotlin.io.FilesKt__FileReadWriteKt")
                every { File("./function-export.js").readText() } returns inlineContent

                processor.process(program, context)

                if (program is Module) {
                    program.body?.get(0) shouldBe beOfType<VariableDeclaration>()

                    // 验证全局导入中包含内联代码
                    context.globalImports.size shouldBe 1
                    val globalCode = context.globalImports.joinToString("\n") { printTestVariableDeclaration(it) }
                    globalCode shouldContain "function myFunction()"
                    globalCode shouldContain "return 'result'"
                }
            }

            should("handle duplicate imports correctly") {
                val program =
                    processTestScript(
                        """
                        import { foo } from './duplicate.js';
                        import { bar } from './duplicate.js';
                        """.trimIndent(),
                    )
                val notebook = getMockNotebook()
                val context = JavascriptProcessContext(DefaultJavaScriptProcessor(notebook))

                mockkStatic("kotlin.io.FilesKt__FileReadWriteKt")
                every { File("./duplicate.js").readText() } returns
                    """
                    export const foo = 'foo';
                    export const bar = 'bar';
                    """.trimIndent()

                processor.process(program, context)

                if (program is Module) {
                    // 应该只生成一个 IIFE，但有两个导入变量声明
                    program.body?.get(0) shouldBe beOfType<VariableDeclaration>()
                    // 验证全局导入只添加了一次
                    context.globalImports.size shouldBe 1
                }
            }

            should("correctly process object destructuring export") {
                val inlineContent =
                    """
                    const obj = { a: 1, b: 2 };
                    export const { a, b: c } = obj;
                    """.trimIndent()

                val program =
                    processTestScript(
                        """
                        import { a, c } from './destructure.js';
                        """.trimIndent(),
                    )
                val notebook = getMockNotebook()
                val context = JavascriptProcessContext(DefaultJavaScriptProcessor(notebook))

                mockkStatic("kotlin.io.FilesKt__FileReadWriteKt")
                every { File("./destructure.js").readText() } returns inlineContent

                processor.process(program, context)

                if (program is Module) {
                    program.body?.get(0) shouldBe beOfType<VariableDeclaration>()

                    // 验证全局导入中包含内联代码
                    context.globalImports.size shouldBe 1
                    val globalCode = context.globalImports.joinToString("\n") { printTestVariableDeclaration(it) }
                    // 代码可能被格式化，使用更灵活的断言
                    globalCode shouldContain "const obj"
                    globalCode shouldContain "a: 1"
                    globalCode shouldContain "b: 2"
                    globalCode shouldContain "const { a, b: c } = obj"
                }
            }

            should("skip TypeScript type declarations") {
                val program =
                    processTestScript(
                        """
                        import { MyType } from './types.ts';
                        """.trimIndent(),
                    )
                val notebook = getMockNotebook()
                val context = JavascriptProcessContext(DefaultJavaScriptProcessor(notebook))

                mockkStatic("kotlin.io.FilesKt__FileReadWriteKt")
                every { File("./types.ts").readText() } returns
                    """
                    export interface MyType {
                        name: string;
                    }
                    export type MyAlias = string;
                    export enum MyEnum {
                        VALUE1,
                        VALUE2
                    }
                    """.trimIndent()

                processor.process(program, context)

                if (program is Module) {
                    // TypeScript 类型声明应该被跳过，不生成导出赋值
                    program.body?.get(0) shouldBe beOfType<VariableDeclaration>()
                }
            }

            should("handle file not found gracefully") {
                val program =
                    processTestScript(
                        """
                        import { foo } from './notfound.js';
                        """.trimIndent(),
                    )
                val notebook = getMockNotebook()
                val context = JavascriptProcessContext(DefaultJavaScriptProcessor(notebook))

                mockkStatic("kotlin.io.FilesKt__FileReadWriteKt")
                every { File("./notfound.js").readText() } throws FileNotFoundException("File not found")

                shouldThrow<FileNotFoundException> {
                    processor.process(program, context)
                }
            }

            should("handle URL read failure gracefully") {
                val originSource = "http://example.com/script.js?inline"
                val program =
                    processTestScript(
                        """
                        import { foo } from "$originSource";
                        """.trimIndent(),
                    )
                val notebook = getMockNotebook()
                val context = JavascriptProcessContext(DefaultJavaScriptProcessor(notebook))

                mockkStatic(URL::readBytes)
                every { URL(originSource).readBytes() } throws Exception("Network error")

                shouldThrow<Exception> {
                    processor.process(program, context)
                }
            }

            should("correctly process relative path starting with dot") {
                val program =
                    processTestScript(
                        """
                        import { foo } from './relative.js';
                        """.trimIndent(),
                    )
                val notebook = getMockNotebook()
                val context = JavascriptProcessContext(DefaultJavaScriptProcessor(notebook))

                mockkStatic("kotlin.io.FilesKt__FileReadWriteKt")
                every { File("./relative.js").readText() } returns
                    """
                    export const foo = 'foo';
                    """.trimIndent()

                processor.process(program, context)

                if (program is Module) {
                    program.body?.get(0) shouldBe beOfType<VariableDeclaration>()
                }
            }

            should("correctly process absolute path starting with slash") {
                val program =
                    processTestScript(
                        """
                        import { foo } from '/absolute/path.js';
                        """.trimIndent(),
                    )
                val notebook = getMockNotebook()
                val context = JavascriptProcessContext(DefaultJavaScriptProcessor(notebook))

                mockkStatic("kotlin.io.FilesKt__FileReadWriteKt")
                every { File("/absolute/path.js").readText() } returns
                    """
                    export const foo = 'foo';
                    """.trimIndent()

                processor.process(program, context)

                if (program is Module) {
                    program.body?.get(0) shouldBe beOfType<VariableDeclaration>()
                }
            }

            should("correctly process remote URL with inline parameter") {
                val originSource = "https://example.com/script.js?inline&version=1.0"
                val remoteContent =
                    """
                    export const foo = 'foo';
                    """.trimIndent()

                val program =
                    processTestScript(
                        """
                        import { foo } from "$originSource";
                        """.trimIndent(),
                    )
                val notebook = getMockNotebook()
                val context = JavascriptProcessContext(DefaultJavaScriptProcessor(notebook))

                mockkStatic(URL::readBytes)
                every { URL(originSource).readBytes() } returns remoteContent.toByteArray()

                processor.process(program, context)

                if (program is Module) {
                    program.body?.get(0) shouldBe beOfType<VariableDeclaration>()

                    // 验证全局导入中包含远程内联代码
                    context.globalImports.size shouldBe 1
                    val globalCode = context.globalImports.joinToString("\n") { printTestVariableDeclaration(it) }
                    globalCode shouldContain "const foo = 'foo'"
                }
            }

            should("correctly generate IIFE structure") {
                val inlineContent =
                    """
                    export const foo = 'foo';
                    """.trimIndent()

                val program =
                    processTestScript(
                        """
                        import { foo } from './iife-test.js';
                        """.trimIndent(),
                    )
                val notebook = getMockNotebook()
                val context = JavascriptProcessContext(DefaultJavaScriptProcessor(notebook))

                mockkStatic("kotlin.io.FilesKt__FileReadWriteKt")
                every { File("./iife-test.js").readText() } returns inlineContent

                processor.process(program, context)

                // 验证 IIFE 被添加到全局导入
                context.globalImports.size shouldBe 1
                val iife = context.globalImports[0]
                iife shouldBe beOfType<VariableDeclaration>()

                // 验证 IIFE 结构：应该是 const varName = (function(exports = {}) { ... })()
                val declarator = iife.declarations?.get(0)
                if (declarator != null) {
                    declarator.init shouldBe beOfType<CallExpression>()
                }

                if (program is Module) {
                    // 验证生成的 IIFE 代码包含内联代码内容
                    val globalCode = context.globalImports.joinToString("\n") { printTestVariableDeclaration(it) }
                    globalCode shouldContain "function"
                    globalCode shouldContain "exports"
                    globalCode shouldContain "const foo = 'foo'"
                    globalCode shouldContain "exports.foo = foo"
                    globalCode shouldContain "return exports"
                }
            }

            should("verify inline code is completely included in IIFE") {
                val inlineContent =
                    $$"""
                const message = 'Hello from inline';
                export const value = 42;
                export function greet(name) {
                    return `${message}, ${name}!`;
                }
                export default class InlineClass {
                    constructor() {
                        this.value = value;
                    }
                }
                    """.trimIndent()

                val program =
                    processTestScript(
                        """
                        import InlineClass, { value, greet } from './complete-inline.js';
                        """.trimIndent(),
                    )
                val notebook = getMockNotebook()
                val context = JavascriptProcessContext(DefaultJavaScriptProcessor(notebook))

                mockkStatic("kotlin.io.FilesKt__FileReadWriteKt")
                every { File("./complete-inline.js").readText() } returns inlineContent

                processor.process(program, context)

                if (program is Module) {
                    // 验证全局导入中包含完整的内联代码
                    context.globalImports.size shouldBe 1
                    val globalCode = context.globalImports.joinToString("\n") { printTestVariableDeclaration(it) }

                    // 验证生成的代码包含所有内联代码的关键部分
                    globalCode shouldContain "const message = 'Hello from inline'"
                    globalCode shouldContain "const value = 42"
                    globalCode shouldContain "function greet(name)"
                    globalCode shouldContain "class InlineClass"
                    globalCode shouldContain "this.value = value"

                    // 验证导出语句被正确生成
                    globalCode shouldContain "exports.value = value"
                    globalCode shouldContain "exports.greet = greet"
                    globalCode shouldContain "exports.default"

                    // 验证生成的程序代码包含导入变量
                    val generatedCode = printTestProgram(program)
                    generatedCode shouldContain "value"
                    generatedCode shouldContain "greet"
                    generatedCode shouldContain "InlineClass"
                }
            }
        }
    })
