# Kotlin Jupyter Js 如何实现？

## 缘起

工作上需要了解盲水印，而这涉及傅里叶变换。我对傅里叶变换一窍不通，想着通过 Kotlin Jupyter 来一步一步用代码来演示傅里叶变换，辅助理解。然而 Kotlin Jupyter 里没有找到 3D 曲面的展示库，像 lets-plot 似乎只支持 2D 图表。

经过尝试，在 Kotlin Jupyter 只能使用 JS 实现 3D 曲面的展示。而 Kotlin Jupyter 里使用 JS 比较繁琐。你需要先将 kotlin 变量转为 JSON 字符串，在`HTML()`方法写要执行 html 代码，容器标签和`<script>`标签，

代码如下：

```kt
// convert to JSON
var dataList = "[" + bList.map { "[${it.first}, ${it.second}, ${it.third}]" }.joinToString(",\n") + "]";

// render to html
HTML("""
<div id="chartDom" style="width: 600px; height: 600px;"> </div>
<script type="module">
import { init } from "https://unpkg.com/echarts@5.4.3/dist/echarts.esm.min.js"
import "https://unpkg.com/echarts-gl@2.0.9/dist/echarts-gl.min.js"

var chartDom = document.getElementById('chartDom');
var myChart = echarts.init(chartDom);
myChart.setOption({
  // echart option
})
</script>
""")
```

## Don't Repeat Yourself

可以看到上面的例子有好几处模板代码。

+ kotlin 转 Json
+ 创建容器`<div>`标签
+ 创建`<script>`标签

像 `ipython` 就支持`%js`直接写js，cell 执行前会拦截有`%js`标记的代码，转为`<script />`标签插入的输出 cell。

在  Kotlin Jupyter 我们也通过自定义 line magic，来生成这些模版代码。Kotlin Jupyter 已经提供给了相关的钩子（[kotlin-jupyter/docs/libaries.md](https://github.com/Kotlin/kotlin-jupyter/blob/master/docs/libraries.md)），我们需要做的就是写一个`CodePreprocessor`拦截，含有`%js`的代码，转为`HTML`函数调用。

比如下面的：

```js
%js
var hello = "hellow jupyter js"

console.log(hello)
```

需要转换为：

```kotlin
HTML("""
<script type="module">
var hello = "hellow jupyter js"

console.log(hello)
</script>
""")
```

## One More Thing

但是还有更重要的一件事。我们在 Kotlin Jupyter 里写 JS 的目的是为了可视化 Kotlin 的数据，仅仅只是转换代码没有实用价值。我们需要能在 JS 里使用 Kotlin 的变量。

那我们如何在 JS 里使用 kotlin 的数据呢？我的想法是就是虚拟 import。定义`@jupyter`为虚拟 package，我们可以从这里 `import` Kotlin 的变量，编译时替换成真实的 kotlin 变量

假设，第一个 cell 定义了一个 Kotlin 变量

```kt
val foo = "bar";
```

后面的cell，直接 import 这个变量然后使用即可

```js
%js
import { foo } from '@jupyter';

console.log('variable from kotlin', foo)
```

实际的编译结果：

```html
<script type="module">
const foo = "foo"

console.log('variable from kotlin', foo)
</script>
```

到这里，解决的问题变成了变量从 Kotlin 世界到 JS 世界的转换。对于任意的 Kotlin 变量可以转为 JSON 吗？

根据源码 [VariableState.kt#L11](https://github.com/Kotlin/kotlin-jupyter/blob/94794065fd0a616b757a8cabf4574bb63344facb/jupyter-lib/api/src/main/kotlin/org/jetbrains/kotlinx/jupyter/api/VariableState.kt#L11) 可知：所有的 Kotlin 变量都 Kernel 被保存成`Any`。显然我们是无法将`Any`转为 JSON 字符串。

如果对于我们可以缩小支持转类型范围，将 Any 类型的值转为 JSON 就是可以做到。

下面两种场景是比较简单的：

1. 基本类型/Array/Collection/Map
2. 使用了 `Renderable`/`DisplayResult` 接口

根据 [Kotlin/kotlinx.serialization#296](https://github.com/Kotlin/kotlinx.serialization/issues/296) 的讨论，在`Any?`实现`toJsonElement`方法就可以做到将任意的`Collection`,`Map`,`Array`,`String`,`Boolean`,`Number` 转为 JSON。这已经足够能够支持大多数场景了。

下面的函数就能够递归的将基础类型转为`JsonElement`,然后将`JsonElement`转为字符串就很方便了。

```kt
fun Any?.toJsonElement(): JsonElement = when(this) {
    null -> JsonNull
    is Collection<*> -> toJsonElement() // call Collection<*>.toJsonElement()
    is String -> JsonPrimitive(this) // end of recursive
    // ... ignore Map<*, *> Array<*>, other primary type
    else -> {
      throw IllegalStateException("Can't serialize unknown type: $this")
    }
}

fun Collection<*>.toJsonElement(): JsonElement {
    return JsonArray(this.map {
      it.toJsonElement() // recursively transform value to JsonElement 
    })
}
```

完整代码：[AnyToJsonElement.kt#L5](https://github.com/yidafu/kotlin-jupyter-js/blob/50fb7d30cc15d9554e5062986aafe06922470fbf/jupyter-js/src/main/kotlin/dev/yidafu/jupyper/AnyToJsonElement.kt#L5)

但是，这种方式不支持类，对于类的支持需要另一种方式。实现`DisplayResult`或者`Renderable` 接口。因为`DisplayResult`有 `toJSon` 方法的，通过这个方法就能获取到可以 import 的 json 对象。

Kotlin Jupyter JS 变量会判断是否是`DisplayResult` `Renderable` 类型，调用`toJson`方法就能后获取到该变量的 JSON 数据。

```kt
when (value) {
  is DisplayResult -> {
    value.toJson()
  }
  is Renderable -> {
    value.render(notebook).toJson()
  }
  // other case
}
```

## From JavaScript To JavaScript

上面提到虚拟 import，需要 import 语句能够被编译成变量声明。我们可以通过正则表达式来将替换 import 语句替换成变量声明，但这不是处理代码的好方式。最好能够将 JS 代码转换成 AST，再操作 AST 进行代码变换。

Kotlin 里并没有一个好的工具了来编译 JS。常见的 JS 编译工具，比如：babel 都是 JS 写的，很难在 JVM 里使用。但是，感谢最近几年前端工具链的锈化，现在已经有了`SWC`,`OXC`等 Rust 写的 JS 编译器。可以通过`JNI` 绑定`SWC`的动态库来实现 JVM 里编译 JS。Kotlin也可以“原生”支持编译`JS`。

社区似乎没有现成 `swc` 的 binding。不过，写一个 binding 总比写一个JS 编译器简单。

我实现了 SWC 的 JVM binding [swc-binding](https://central.sonatype.com/artifact/dev.yidafu.swc/swc-binding)。基于官方 node binding 改了改，将 `napi-rs` 换成了 `jni`。还支持 DSL 的方式描述 AST。

有了 SWC 以后，那我们不光可以支持 `js`，`ts`/`jsx`/`tsx` 也可支持了。

参考下面的流程图：

[![](https://mermaid.ink/img/pako:eNp9Ut9r20AM_lfEPceGrdsKoeyh7KGwFQYtDBr34Xonx5f4TkanWwgh__sUe0uTNsxgkHT6Pv36dsaRRzM3TWp72rjOssDtY5NAv1umTUY-c6CqPtSQqbBDOGCr6it8J-lDmvImW9Oua-gk9sCYSy-HtHPCXF6WbIfuL2KxnoCrMmxF66yRE_bPU-5IPAZe_Z9MDnMmfotcZRgYh3_PJxR54xb6w-p3hJeQfEjLdwW08481eBR0cjondDYfqKNdBgfEkGgc6thGky70BjdVBVc1CNuUW-I4cs10KVI4gc2iTzguURu7RKD4TzVE8qHdnuWfFL5c9nOtewhJjigQggfR0PK_9b7U8EsPM0yrHGffBOng7vH-B7QlOQmUxrOfXASTnwwzMxE52uBVVbtDrDHSYcTGzNX02FqVQ6OC22uqLUIP2-TMXLjgzJTBW8Fvwao0opm3ts8aHWx6Inr10Qchvp-UOwp4_wdJ4ue5?type=png)](https://mermaid.live/edit#pako:eNp9Ut9r20AM_lfEPceGrdsKoeyh7KGwFQYtDBr34Xonx5f4TkanWwgh__sUe0uTNsxgkHT6Pv36dsaRRzM3TWp72rjOssDtY5NAv1umTUY-c6CqPtSQqbBDOGCr6it8J-lDmvImW9Oua-gk9sCYSy-HtHPCXF6WbIfuL2KxnoCrMmxF66yRE_bPU-5IPAZe_Z9MDnMmfotcZRgYh3_PJxR54xb6w-p3hJeQfEjLdwW08481eBR0cjondDYfqKNdBgfEkGgc6thGky70BjdVBVc1CNuUW-I4cs10KVI4gc2iTzguURu7RKD4TzVE8qHdnuWfFL5c9nOtewhJjigQggfR0PK_9b7U8EsPM0yrHGffBOng7vH-B7QlOQmUxrOfXASTnwwzMxE52uBVVbtDrDHSYcTGzNX02FqVQ6OC22uqLUIP2-TMXLjgzJTBW8Fvwao0opm3ts8aHWx6Inr10Qchvp-UOwp4_wdJ4ue5)

如果给 Kotlin Kernel 的代码里包含`%js` magic，`JavaScriptMagicCodeProcessor`就会将 JS 代码处理成 `HTML(""" $jsCode """")` 调用以便于能够被 Kotlin Jypyter 正确渲染。

`JavaScriptMagicCodeProcessor`处理流程如下

第一步，会将 `jsx`/`ts`/`tsx` 转换为正常的 JS，如果是 JS 不会特殊处理

第二步，操作 AST。这一步是 Kotlin Jupyter JS 的核心逻辑，主要做一些代码转换的工作。

1. 将`import { * } from '@jupyter';` 变量声明语句
2. 将 `jsx`/`tsx` 的默认导出修改为变量声明
3. 其它操作

第三步，AST 转回代码

最后将 JS 代码包装的成 HTML 结果返回。

### React (Jsx to Js)

对于 React, Jupyter 会将默认导出转换变量声明

比如，下面的例子：
```js
export function App() {
  return <span>React</span>
}
```

会被转换成
```
const __JupyterCellDefaultExportVariable__ = function App() {
  return <span>React</span>
}
const root = createRoot(cellElement);
root.render(React.createElement($JSX_DEFAULT_EXPORT_VARIABLE_NAME))
```

## 尾声

至此，kotlin Jupyter 支持 `%js` magic 的思路就梳理清楚了。

Echart 的例子截图：

![](./echars-example.png)

实际例子，可以看一下[examples/js-magic.ipynb](https://github.com/yidafu/kotlin-jupyter-js/blob/main/examples/js-magic.ipynb)

欢迎大家试用，反馈问题。

