#!/bin/bash

# 启动 Jupyter Notebook 脚本
# 自动激活虚拟环境并启动 Jupyter

echo "🚀 启动 Kotlin Jupyter Notebook..."
echo "📍 工作目录: $(pwd)"
echo "🐍 激活虚拟环境..."

# 激活虚拟环境
source venv/bin/activate

echo "✅ 虚拟环境已激活"
echo "📦 Python 版本: $(python --version)"
echo "📦 pip 版本: $(pip --version | cut -d' ' -f2)"

echo ""
echo "🔧 可用的 Jupyter Kernels:"
jupyter kernelspec list

echo ""
echo "🌐 启动 Jupyter Notebook..."
echo "💡 提示: 在浏览器中打开显示的 URL 来访问 Jupyter"
echo "💡 提示: 按 Ctrl+C 停止服务器"
echo ""

# 启动 Jupyter Notebook
jupyter notebook
