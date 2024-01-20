# kotlin-notebook-js

Jupyter Kotlin Kernel support `%js`/`%ts`/`%jsx`/`%tsx` line magics.

## Feature

+ import any variable from kotlin world
+ support **JavaScript** / **TypeScript** / **React**

## Support magic

+ `%js`
+ `%javacript`
+ `%jsx`
+ `%ts`
+ `%typescript`
+ `%tsx`


## Usage

### Import The Library First

```kt
USE {
    repositories {
         mavenCentral()
         
        maven("https://s01.oss.sonatype.org/content/groups/public/")
    }

    dependencies {
        implementation("dev.yidafu.jupyter:jupyter-js:0.4.0")
    }
}
```

> this project is not stable, so not support `%use` magic.

### JS Example

In JS world, you can import any variables from kotlin world, through the virtual package `@jupyter`.

You can call `getCellRoot()` to get a `div` element in output cell, and then do every thing you want to do.

#### first declare a variable in cell

```kt
// value define in kotlin world
val kNumber = 233
```

#### then, add a cell with `%js` magic

```js
%js
// using `kNumber` in js workd
import { kNumber } from '@jupyter'

getCellRoot().innerHTML = `<h1>${kNumber}</h1>`
```

##### screenshot

![image](https://github.com/yidafu/kotlin-jupyter-js/assets/22773923/cd1d84d3-7dcc-4f0f-8a3e-50300e4f7e4c)

## React Example

Just export your component function.

`%jsx`/`%tsx` magic will render your default export component function

```jsx
%jsx

import { foo } from "@jupyter";

export default function App() {
    return <h1>{foo}</h1>
}
```

### screenshot

![image](https://github.com/yidafu/kotlin-jupyter-js/assets/22773923/c8902c7e-813d-41b3-be6b-b0ee192e890b)

## Using NPM Library

You may want using npm package? fine, JupyterJs will transform js code into `<script type="module">`. this means you can import any script or package by http(s) link.

like this:

```js
%js
import _ from 'https://cdn.jsdelivr.net/npm/lodash-es@4.17.21/lodash.min.js';
```

**<https://esm.sh/> may help you**

Too long to Coding? JupyterJs also support import source replacement. JupyterJs will replace import source which [libs-mapping.json](jupyter-js/src/main/resources/libs-mapping.json) contains into http(s) link

so, you can coding like this:

```js
%js
import _ from 'lodash';
```

### builtin packages

see: [libs-mapping.json](jupyter-js/src/main/resources/libs-mapping.json)

+ react
+ react-dom
+ lodash
+ echarts
+ d3
+ highcharts
+ visjs

Adding your favorite pakcage, submit a PR/Issue.

### Echarts Example

see <https://echarts.apache.org/examples/en/editor.html?c=line-simple&lang=ts>

1. Defined Value in Kotlin Cell

```kt
val dataArray = arrayOf(150, 230, 224, 218, 135, 147, 260)
```

2. using it with `%ts` magic, render to char

```js
%ts
import { dataArray } from "@jupyter";
import * as echarts from 'echarts';

type EChartsOption = echarts.EChartsOption;

var chartDom = getCellRoot();
chartDom.style = "width:300px; height: 300px"
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
```

#### screenshot

![image](https://github.com/yidafu/kotlin-jupyter-js/assets/22773923/b5aa06d3-24dc-4e3e-a020-8bd7ac5b1bae)

full example see [examples/js-magic.ipynb](./examples/js-magic.ipynb)

## Article

[how kotlin jupyter js workd? (English Translation)](./docs/how-kotlin-jupyter-work.md) - [中文原文](./docs/how-kotlin-jupyter-work.zh-CN.md)

## TODO LIST

+ [x] swc binding for compile js code
+ [x] `%js`/`%ts`magics
+ [x] `%jsx`/`%tsx` magic
+ [x] import variable from Kotlin world. like this: `import { foo } from "@jupyter"`
+ [ ] js syntax highlight
+ [ ] etc...
