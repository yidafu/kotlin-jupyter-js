const puppeteer = require('puppeteer');

function sleep(ms) {
  return new Promise(resolve => {
    setTimeout(() => resolve(), ms)
  })
}
(async () => {
  const browser = await puppeteer.launch({
    headless:  false,
    defaultViewport: {width: 800, height: 2000}
  });
  const page = await browser.newPage();
  // await page.goto("http://localhost:3000/js-magic.html");
  page.goto("http://127.0.0.1:5500/js-magic.html");
  await sleep(4000)
  // await page.waitForSelector("#9e1bb8d3-fd8e-4656-8971-eaded9bdf263")
  await page.screenshot({ path: 'screenshot.png', fullPage: true });
  await browser.close();
})();

