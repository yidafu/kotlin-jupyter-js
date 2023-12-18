/*
 * This Kotlin source file was generated by the Gradle 'init' task.
 */
package dev.yidafu.jupyper

import kotlinx.serialization.encodeToString
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.buildJsonObject
import org.jetbrains.kotlinx.jupyter.api.JSON
import org.jetbrains.kotlinx.jupyter.api.MimeTypedResult
import org.jetbrains.kotlinx.jupyter.api.MimeTypes
import org.jetbrains.kotlinx.jupyter.api.htmlResult
import org.jetbrains.kotlinx.jupyter.testkit.JupyterReplTestCase
import org.jetbrains.kotlinx.jupyter.testkit.ReplProvider
import kotlin.test.Test
import kotlin.test.assertContains
import kotlin.test.assertIs
import kotlin.test.assertTrue

class KotlinKernelJsSupportTest : JupyterReplTestCase(
    ReplProvider.withDefaultClasspathResolution(),
) {

    @Test
    fun `test Randable result`() {
        println(Json.encodeToString(htmlResult("<div>TEXT</div>").toJson()))
        println(Json.encodeToString(htmlResult("<div>TEXT</div>", true).toJson()))
        println(Json.encodeToString(JSON(buildJsonObject { }).toJson()))
    }

    @Test
    fun `import variable from kotlin world`() {
        exec(
            """
            USE {
                addCodePreprocessor(dev.yidafu.jupyper.JavaScriptMagicCodeProcessor(this.notebook));
            }
            """.trimIndent(),
        )
        exec(""" val foo = "string" """)
        val result = exec(
            """
            %js
            import { foo } from "@jupyter";

            var b = 345

            console.log(b)
        """.trimIndent(),
        )

        assertIs<MimeTypedResult>(result)
        (result[MimeTypes.HTML] as String).contains("const foo = \"string\";")
    }

    @Test
    fun `execute jsx code`() {
        exec(
            """
            USE {
                addCodePreprocessor(dev.yidafu.jupyper.JavaScriptMagicCodeProcessor(this.notebook));
            }
            """.trimIndent(),
        )
        exec(""" val foo = "string" """)

        val result = exec(
            """
            %jsx
            
            import { foo, bar } from "@jupyter";

            export default function App() {
                return <div>{foo}</div>
            }
            """.trimIndent(),
        ) as MimeTypedResult
        val html = (result[MimeTypes.HTML] as String)
        assertContains(html, "React.createElement")
        assertContains(html, "const bar = null")
    }

    @Test
    fun `execute ts code`() {
        exec(
            """
            USE {
                addCodePreprocessor(dev.yidafu.jupyper.JavaScriptMagicCodeProcessor(this.notebook));
            }
            """.trimIndent(),
        )
        val result = exec(
            """
            %ts
            const n: number = 123;
            const s: string = "foo";
            interface IUser {
                name: string
                id: number
            }
            const user: IUser = { name: "jupyter", id: 1 };
            
            console.log(n, s, user)
            """.trimIndent(),
        ) as MimeTypedResult
        val html = result[MimeTypes.HTML] as String
        assertTrue(!html.contains("User"))
        assertTrue(!html.contains("number"))
    }

    @Test
    fun `execute tsx code`() {
        exec(
            """
            USE {
                addCodePreprocessor(dev.yidafu.jupyper.JavaScriptMagicCodeProcessor(this.notebook));
            }
            """.trimIndent(),
        )
        exec(""" val foo = "string" """)

        val result = exec(
            """
            %tsx
            import { foo, bar } from "@jupyter";
            interface IChildProps {
                text: string;
            }
            function Child(props: IChildProps) {
                return <div>{props.text}</div>
            }
            export default function App() {
                return <Child text={foo} />
            }
            """.trimIndent(),
        ) as MimeTypedResult
        val html = (result[MimeTypes.HTML] as String)
        println(html)
        assertContains(html, "React.createElement")
        assertTrue(!html.contains("IChildProps"))
    }

    @Test
    fun `import source mapping`() {
        exec(
            """
            USE {
                addCodePreprocessor(dev.yidafu.jupyper.JavaScriptMagicCodeProcessor(this.notebook));
            }
            """.trimIndent(),
        )
        val result = exec(
            """
            %tsx
            // ts will auto tree shaking
            import * as echarts from "echarts";
            import * as graph3d from "vis-graph3d";
            console.log(echarts, graph3d)
            """.trimIndent(),
        ) as MimeTypedResult

        val html = (result[MimeTypes.HTML] as String)
        println(html)
        assertContains(html, LibsMapping["echarts"]!!.mainSource)
        assertContains(html, LibsMapping["vis-graph3d"]!!.mainSource)
    }

    @Test
    fun `echarts example`() {
        exec(
            """
            USE {
                addCodePreprocessor(dev.yidafu.jupyper.JavaScriptMagicCodeProcessor(this.notebook));
            }
            """.trimIndent(),
        )
        exec(""" val dataArray = arrayOf(150, 230, 224, 218, 135, 147, 260) """)
        val result = exec(
            """
            %tsx
            // you can import any variable from kotlin world, through virtual package "@jupyter"
            import { dataArray } from "@jupyter";

            import * as echarts from 'echarts';

            type EChartsOption = echarts.EChartsOption;

            var chartDom = getCellRoot();
            var myChart = echarts.init(chartDom);
            var option: EChartsOption;

            option = {
              xAxis: {
                type: 'category',
                data: ['Mon', 'Tue', 'Wed', 'Thu', 'Fri', 'Sat', 'Sun']
              },
              yAxis: {
                type: 'value'
              },
              series: [
                {
                  data: dataArray,
                  type: 'line'
                }
              ]
            };

            option && myChart.setOption(option);
        """.trimIndent(),
        ) as MimeTypedResult

        val html = (result[MimeTypes.HTML] as String)
        println(html)
    }

    @Test
    fun `import d3 package`() {
        exec(
            """
            USE {
                addCodePreprocessor(dev.yidafu.jupyper.JavaScriptMagicCodeProcessor(this.notebook));
            }
            """.trimIndent(),
        )
        val result = exec(
            """
            %js

            import highcharts from "highcharts";
            """
        ) as MimeTypedResult
        val html = (result[MimeTypes.HTML] as String)
        assertTrue(html.contains("import highcharts from \"https://code.highcharts.com/es-modules/masters/highcharts.src.js\";"))
        assertTrue(html.contains("https://code.highcharts.com/es-modules/masters/modules/export-data.src.js"))
    }
}
