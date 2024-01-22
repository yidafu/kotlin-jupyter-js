#!/usr/bin/env zx
var ghpages = require('gh-pages');

await $`rm -fr ./dist`
await $`mkdir -p ./dist`
await $`cp -r jupyter-js/build/dokka/html dist/kt-docs`
await $`cp -r examples-html dist/examples`

await $`cp docs/theme.css dist/theme.css`
await $`cp docs/prism.js dist/prism.js`

const enMd = await $`npx markdown docs/how-kotlin-jupyter-work.md --stylesheet theme.css --flavor gfm --highlight`

function format(str) {
    return str
        .replaceAll('<body>', '<body><div class="markdown-body">')
        .replaceAll('</body>', '<script src="prism.js" ></script></div></body>')
        .replaceAll('<p>&lt;details&gt;', '<details>')
        .replaceAll('&lt;summary&gt;', '<summary>')
        .replaceAll('&lt;/summary&gt;', '</summary>')
        .replaceAll('&lt;/details&gt;\n\n</p>', '</details>')
        .replaceAll('&lt;code&gt;', '<code>')
        .replaceAll('&lt;/code&gt;', '</code>')
        .replaceAll('<br>', '')
}
await fs.writeFile(
    './dist/how-kotlin-jupyter-work.html',
    format(enMd.stdout.toString())
)
const cnMd = await $`npx markdown docs/how-kotlin-jupyter-work.zh-CN.md  --stylesheet theme.css --flavor gfm --highlight`

await fs.writeFile(
    './dist/how-kotlin-jupyter-work.zh-CN.html',
    format(cnMd.stdout.toString())
)


ghpages.publish('./dist', {
    repo: "https://github.com/yidafu/kotlin-jupyter-js.git",
}, function(err) {
    if (err) console.log(err)
    else console.log(chalk.green("updated github pages"))
});
