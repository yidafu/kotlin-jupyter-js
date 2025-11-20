package dev.yidafu.jupyper

import org.jetbrains.kotlinx.jupyter.api.*
import org.jetbrains.kotlinx.jupyter.testkit.JupyterReplTestCase
import org.jetbrains.kotlinx.jupyter.testkit.ReplProvider
import kotlin.test.Test
import kotlin.test.assertContains
import kotlin.test.assertNotNull

class JavaScriptMagicIntegrationTest : JupyterReplTestCase(
    ReplProvider.withDefaultClasspathResolution(),
) {

    @Test
    fun `should correctly execute simple JavaScript code`() {

        withLibrary(KotlinKernelJsMagicSupport()) {
            val result = exec(
                """
                %js
                const greeting = "Hello, World!";
                console.log(greeting);
                """.trimIndent(),
            ) as MimeTypedResult

            assertNotNull(result)
            val html = result[MimeTypes.HTML] as String
            assertContains(html, "Hello, World!")
        }
    }

    @Test
    fun `should handle JavaScript variables`() {
        withLibrary(KotlinKernelJsMagicSupport()) {
            val result = exec(
                """
                %js
                let x = 10;
                let y = 20;
                let sum = x + y;
                console.log("Sum: " + sum);
                """.trimIndent(),
            ) as MimeTypedResult

            val html = result[MimeTypes.HTML] as String
            assertContains(html, "Sum:")
        }
    }

    @Test
    fun `should execute TypeScript code with type annotations`() {
        withLibrary(KotlinKernelJsMagicSupport()) {
            val result = exec(
                """
                %ts
                function add(a: number, b: number): number {
                    return a + b;
                }
                const result = add(5, 3);
                console.log(result);
                """.trimIndent(),
            ) as MimeTypedResult

            val html = result[MimeTypes.HTML] as String
            assertContains(html, "8")
        }
    }

    @Test
    fun `should handle JavaScript arrays and objects`() {
        withLibrary(KotlinKernelJsMagicSupport()) {
            val result = exec(
                """
                %js
                const users = [
                    { name: "Alice", age: 30 },
                    { name: "Bob", age: 25 }
                ];
                users.forEach(user => console.log(user.name, user.age));
                """.trimIndent(),
            ) as MimeTypedResult

            val html = result[MimeTypes.HTML] as String
            assertContains(html, "Alice")
            assertContains(html, "Bob")
        }
    }

    @Test
    fun `should handle asynchronous JavaScript code`() {
        withLibrary(KotlinKernelJsMagicSupport()) {
            val result = exec(
                """
                %js
                async function fetchData() {
                    return new Promise(resolve => {
                        setTimeout(() => resolve("Data loaded"), 100);
                    });
                }
                
                const data = await fetchData();
                console.log(data);
                """.trimIndent(),
            ) as MimeTypedResult

            val html = result[MimeTypes.HTML] as String
            assertContains(html, "Data loaded")
        }
    }

    @Test
    fun `should render JSX elements`() {
        withLibrary(KotlinKernelJsMagicSupport()) {
            val result = exec(
                """
                %jsx
                import { useState } from "react";
                
                function Counter() {
                    const [count, setCount] = useState(0);
                    return (
                        <div>
                            <button onClick={() => setCount(count + 1)}>Increment</button>
                            <span>Count: {count}</span>
                        </div>
                    );
                }
                """.trimIndent(),
            ) as MimeTypedResult

            val html = result[MimeTypes.HTML] as String
            assertContains(html, "React.createElement")
        }
    }

    @Test
    fun `should handle shared context across multiple cells`() {
        withLibrary(KotlinKernelJsMagicSupport()) {
            // First cell - define Kotlin variable
            exec(""" val message = "Hello from Kotlin!" """)

            // Second cell - use in JavaScript
            val result = exec(
                """
                %js
                import { message } from "@jupyter";
                console.log(message);
                """.trimIndent(),
            ) as MimeTypedResult

            val html = result[MimeTypes.HTML] as String
            assertContains(html, "Hello from Kotlin!")
        }
    }

    @Test
    fun `should handle complex data structures from Kotlin`() {
        withLibrary(KotlinKernelJsMagicSupport()) {
            exec(
                """
                val data = mapOf(
                    "users" to listOf(
                        mapOf("name" to "Alice", "score" to 95),
                        mapOf("name" to "Bob", "score" to 87)
                    ),
                    "total" to 182
                )
                """.trimIndent(),
            )

            val result = exec(
                """
                %js
                import { data } from "@jupyter";
                console.log(JSON.stringify(data, null, 2));
                """.trimIndent(),
            ) as MimeTypedResult

            val html = result[MimeTypes.HTML] as String
            assertContains(html, "Alice")
            assertContains(html, "95")
        }
    }

    @Test
    fun `should execute TypeScript code with User and Product interfaces`() {
        withLibrary(KotlinKernelJsMagicSupport()) {
            val result = exec(
                """
                %ts
                
                // TypeScript basic type definitions
                interface User {
                    name: string;
                    age: number;
                    email: string;
                    isActive: boolean;
                }
                
                interface Product {
                    id: number;
                    name: string;
                    price: number;
                }
                
                // Create instances using interfaces
                const user: User = {
                    name: "Alice",
                    age: 30,
                    email: "alice@example.com",
                    isActive: true
                };
                
                const product: Product = {
                    id: 1,
                    name: "Laptop",
                    price: 999.99
                };
                
                console.log("User:", user.name, user.age);
                console.log("Product:", product.name, product.price);
                """.trimIndent(),
            ) as MimeTypedResult

            assertNotNull(result)
            val html = result[MimeTypes.HTML] as String
            assertContains(html, "Alice")
            assertContains(html, "30")
            assertContains(html, "Laptop")
            assertContains(html, "999.99")
        }
    }
}
