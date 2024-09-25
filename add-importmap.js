var script = document.createElement('script')

script.type = 'importmap'
script.innerHTML = `
{
  "imports": {
    "react": "https://esm.sh/react@18.2.0",
    "react-dom": "https://esm.sh/react-dom@18.2.0/client",
    "echarts": "https://esm.sh/charts@5.4.3",
    "echarts-gl": "https://esm.sh/charts-gl@2.0.9"
  }
}
`

document.head.appendChild(script);