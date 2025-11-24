# Kotlin Jupyter JS Examples

This directory contains various examples and test files for Kotlin Jupyter JS, focusing on **getting data from Kotlin and rendering it in JavaScript**.

## 🔧 Local Debug Version

**Current Version**: 0.8.0 (Local debug version)

### Setup Steps

1. **Build local version**:
   ```bash
   # Run in project root directory
   ./gradlew publishToMavenLocal
   ```
   
   **Note**: If you encounter signature errors, the project is configured to disable signing and should build normally.

2. **Verify local version**:
   ```bash
   # Check Maven local repository
   ls ~/.m2/repository/dev/yidafu/jupyter/jupyter-js/0.8.0/
   ```
   
   You should see the following files:
   - `jupyter-js-0.8.0.jar`
   - `jupyter-js-0.8.0-sources.jar`
   - `jupyter-js-0.8.0-javadoc.jar`
   - `jupyter-js-0.8.0.pom`
   - `jupyter-js-0.8.0.module`

3. **Use local version**:
   - All example files are configured to use `USE` blocks with `mavenLocal()` repository
   - This prioritizes loading from Maven local repository (`~/.m2/repository`)
   - Falls back to `mavenCentral()` if not found locally
   - Ensure Maven local repository contains the latest built version
   - Configuration example:
     ```kotlin
     USE {
         repositories {
             mavenLocal()
             mavenCentral()
         }
         dependencies {
             implementation("dev.yidafu.jupyter:jupyter-js:0.8.0")
         }
     }
     ```

## 🚀 Quick Start

### Method 1: Use Startup Script (Recommended)

```bash
./start_jupyter.sh
```

### Method 2: Manual Start

```bash
# Activate virtual environment
source venv/bin/activate

# Start Jupyter Notebook
jupyter notebook
```

## 📁 Example Files

The examples are organized by difficulty level, progressing from basic to advanced:

### Learning Path (Progressive Difficulty)

1. **`01-basic-data-rendering.ipynb`** ⭐☆☆☆☆
   - Basic data types and simple HTML rendering
   - Learn `jsExport()` and `import from '@jupyter'`
   - DOM manipulation basics

2. **`02-table-data-rendering.ipynb`** ⭐☆☆☆☆
   - Structured data and table display
   - Data classes and collections
   - HTML table rendering with styling

3. **`03-chartjs-basic-charts.ipynb`** ⭐⭐☆☆☆
   - Chart.js statistical charts
   - Bar charts, line charts, pie charts
   - Library configuration with `jsConfig`

4. **`04-echarts-advanced-charts.ipynb`** ⭐⭐⭐☆☆
   - ECharts rich visualizations
   - Combination charts, radar charts, gauge charts
   - Interactive features and data drill-down

5. **`05-d3-custom-visualization.ipynb`** ⭐⭐⭐⭐☆
   - D3.js custom visualizations
   - Data binding and transformations
   - Custom SVG rendering with animations

6. **`06-react-component-rendering.ipynb`** ⭐⭐⭐⭐☆
   - React component-based rendering
   - Component state management
   - Interactive UI components

7. **`07-multi-chart-dashboard.ipynb`** ⭐⭐⭐⭐⭐
   - Multi-chart dashboard
   - Combining multiple visualization libraries
   - Responsive layouts and data integration

### Core Concept

All examples follow the same data flow pattern:

```
Kotlin generates data → jsExport() → JavaScript import → Rendering
```

Each example focuses on **getting data from Kotlin and rendering it in JavaScript**.

## 🔧 Environment Information

- **Python Version**: 3.14.0
- **Jupyter Notebook**: 7.4.7
- **Kotlin Kernel**: 0.15.0.598
- **Kotlin Jupyter JS**: 0.8.0 (Local debug version)
- **Virtual Environment**: `venv/`

## 🐛 Debug Mode

### Debug Features
- ✅ JavaScript magic commands (`%js`, `%javascript`)
- ✅ TypeScript support (`%ts`, `%typescript`)
- ✅ JSX/TSX component rendering (`%jsx`, `%tsx`)
- ✅ Data exchange (`jsExport`, `import from '@jupyter'`)
- ✅ External library configuration (`jsConfig` DSL)
- ✅ Console.log redirection

### Debug Notes
- Local debug version requires manual build and publish
- Ensure Maven local repository contains the latest built version
- Enable verbose logging during debugging
- Clean up debug code after testing

## 🎯 Key Features

### Console.log Redirection
JavaScript `console.log` output is displayed in both:
- Browser developer console
- Dedicated log area below Jupyter cells

### Supported Magic Commands
- `%js` - JavaScript code
- `%javascript` - JavaScript code (alias)
- `%ts` - TypeScript code
- `%typescript` - TypeScript code (alias)
- `%jsx` - JSX code
- `%tsx` - TSX code

### Data Exchange
- Use `jsExport()` to export Kotlin variables to JavaScript
- Use `import { variable } from '@jupyter'` to import Kotlin variables in JS

## 🛠️ Development

If you need to modify or extend functionality, please refer to the main project documentation.

### Local Development Workflow

1. **Modify code**: Edit source code in project root directory
2. **Build local version**: Run `./gradlew publishToMavenLocal`
3. **Test examples**: Run relevant examples in `examples/` directory
4. **Verify functionality**: Ensure all features work correctly
5. **Commit changes**: Submit code after testing

### Debugging Tips

- Use browser developer tools to check JavaScript errors
- Check Jupyter console output
- Verify version in Maven local repository
- Use `console.log` for JavaScript debugging

## 📝 Notes

- Ensure virtual environment is activated before running examples
- Some examples may require network connection to load external libraries
- If you encounter issues, check browser console error messages
- **Debug mode**: All examples are configured to use `USE` blocks with `mavenLocal()` to prioritize loading from local Maven repository
- **Version management**: Ensure Maven local repository contains the latest built version, run `./gradlew publishToMavenLocal` to update local version
- **Repository configuration**: Use `mavenLocal()` to prioritize local builds, `mavenCentral()` as fallback repository
