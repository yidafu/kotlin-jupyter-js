package dev.yidafu.jupyter.processor

import dev.yidafu.jupyter.CircularDependencyException
import dev.yidafu.swc.generated.*
import io.kotest.assertions.throwables.shouldThrow
import io.kotest.core.spec.style.ShouldSpec
import io.kotest.matchers.shouldBe
import io.kotest.matchers.types.beOfType
import io.mockk.*
import java.io.File
import java.net.URL

class InlineImportSourceProcessorTest : ShouldSpec({
    val processor = InlineImportSourceProcessor()

    context("InlineImportSourceProcessor") {
        should("return true when mock file ext function") {
            mockkStatic("kotlin.io.FilesKt__UtilsKt")
            mockkStatic("kotlin.io.FilesKt__FileReadWriteKt")
            every { File("abc").endsWith(any<String>()) } returns true
            every { File("parent.js").readText() } returns ""
            println(File("parent.js").readText())
            println(File("abc").endsWith("abc"))
        }

        should("correctly process local imports") {
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

            every { File("/tmp/absolute.js").readText() } returns "export const foo = 'foo'"
            every { File("./local.js").readText() } returns
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
            every { File("./local2.mjs").readText() } returns "export const foo = 'foo'"

            processor.process(program, context)

            if (program is Module) {
                // iife
                program.body?.get(0) shouldBe beOfType<VariableDeclaration>()
            }
        }

        should("correctly process remote inline imports") {
            val originSource = "http://example.com/script.js?inline"
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
            every { URL(originSource).readBytes() } returns
                "export const foo = 'foo';\nexport default function foo() {};".toByteArray()

            val notebook = getMockNotebook()
            val context = JavascriptProcessContext(DefaultJavaScriptProcessor(notebook))

            processor.process(program, context)

            verify(exactly = 1) { URL(originSource).readText() }

            if (program is Module) {
                program.body?.get(0) shouldBe beOfType<VariableDeclaration>()
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
            every { File("./local.tsx").readText() } returns "export default function App(): React.ReactElement { return <h1>Title</h1>; }"
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
    }
})
