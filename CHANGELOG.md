# Changelog

All notable changes to kotlin-jupyter-js will be documented in this file.

The format is based on [Keep a Changelog](https://keepachangelog.com/en/1.0.0/),
and this project adheres to [Semantic Versioning](https://semver.org/spec/v2.0.0.html).

## [0.8.0] - 2025-11-24

### Added
- **Enhanced JSX Processing**: Improved JSX/TSX compilation and rendering pipeline with better React import detection
- **Comprehensive Test Suite**: Added extensive test coverage for JSX processing scenarios
- **SWC Binding Upgrade**: Upgraded SWC binding from v0.7.0 to v0.8.0 with updated configuration
- **Maven Publishing**: Added NMCP plugin for improved Maven Central publishing configuration
- **Library Mappings**: Updated library mappings for echarts, echarts-gl, and three.js

### Changed
- **React Import Handling**: Enhanced default export processing for JSX components with better identifier handling
- **JavaScript Compilation**: Refined compilation options for ES2020 target
- **Code Formatting**: Improved code formatting across test files

### Fixed
- **React CDN URL Support**: Fixed React import detection to support CDN URLs and avoid commented imports
- **JSX Component Processing**: Improved JSX component identifier handling and processing

---

## [0.7.0] - 2024-01-24

### Added
- **jsExport Function**: Introduced `jsExport()` function for exporting Kotlin variables to JavaScript
- **Test Coverage**: Added Kover action for comprehensive test coverage reporting
- **Enhanced Library Mappings**: Expanded built-in library mappings for popular NPM packages
- **GitHub Pages**: Updated documentation deployment to GitHub Pages

### Changed
- **Library Management**: Removed old SWC-binding implementation in favor of updated approach
- **Serialization**: Enhanced Pair/Triple support for JSON serialization
- **Documentation**: Improved Chinese documentation for Kotlin Jupyter integration

### Fixed
- **Linux Compatibility**: Fixed x64 Linux ELF header issues
- **Build Process**: Resolved build configuration problems

---

## [0.3.0] - 2023-12-17

### Added
- **JSX Transform Support**: Added JSX compilation and transformation capabilities
- **Kotlin Variable Import**: Enhanced ability to import variables from Kotlin world via `@jupyter` virtual package
- **Library Mapping Implementation**: Implemented LibsMapping to replace `@jupyter` imports with actual variable declarations
- **AST Utilities**: Added utility functions for AST tree parsing and manipulation
- **Test Coverage**: Expanded unit tests for SWC binding components

### Changed
- **SWC Binding Architecture**: Major refactoring of SWC binding with improved serialization
- **Parser Configuration**: Updated TsParserConfig and EsParserConfig serialization
- **Build System**: Enhanced build plugin configuration and publishing setup

### Fixed
- **Compilation Errors**: Fixed SWC compilation failures and improved exception handling
- **Serialization Issues**: Resolved serialize/deserialize problems for AST nodes
- **DLL Management**: Optimized DLL copying and synchronization operations

### Technical Details
- **AST Extensions**: Generated comprehensive AST extension functions in independent files
- **Boolean Type Support**: Added Booleanable serialize/deserialize capabilities

---

## [0.2.0] - 2023-12-04

### Added
- **Multi-Platform Support**: Added Linux ARM target support for SWC binding
- **Enhanced Build Configuration**: Improved build script and DLL loading system

### Changed
- **SWC Binding**: Updated build configuration for better cross-platform compatibility
- **Build System**: Enhanced build script for Linux ARM target

---

## [0.1.0] - 2023-12-14

### Added
- **Initial Release**: First stable version of kotlin-jupyter-js
- **Core JavaScript Magic Commands**: Basic support for executing JavaScript code in Jupyter notebooks
- **SWC Integration**: Initial integration with Speedy Web Compiler (SWC) for JavaScript/TypeScript compilation
- **Kotlin-Jupyter Integration**: Basic integration with Kotlin Jupyter Kernel
- **Build Plugin**: Developed Gradle plugin for building and publishing the library
- **Build System**: Initial Gradle build configuration with Kotlin Jupyter plugin

### Features
- **JavaScript Execution**: Ability to run JavaScript code within Jupyter notebooks using magic commands
- **Basic Type Support**: Support for fundamental JavaScript types and operations
- **Kotlin Variable Access**: Initial implementation of accessing Kotlin variables from JavaScript
- **Error Handling**: Basic error reporting for JavaScript compilation and execution errors

### Technical Foundation
- **AST Processing**: Initial Abstract Syntax Tree processing capabilities
- **Module System**: Basic module import and export functionality
- **Configuration**: Initial configuration system for library mappings
- **Testing**: Basic test infrastructure setup

---

*This changelog covers the evolution from v0.1.0 to v0.8.0, documenting the major features, improvements, and technical advancements of the kotlin-jupyter-js project based on actual git tagged releases.*