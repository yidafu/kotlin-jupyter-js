@file:Suppress("ktlint:standard:filename")

package dev.yidafu.jupyper

/**
 * JSX default export variable name
 *
 * In JSX/TSX code, default exported components are assigned to this variable name
 * Then rendered via React.createElement()
 */
internal const val JSX_DEFAULT_EXPORT_VARIABLE_NAME = "__JupyterCellDefaultExportVariable__"

/**
 * Jupyter virtual package import specifier
 *
 * When using `import { varName } from '@jupyter'` in JavaScript code,
 * this identifier is recognized and replaced with variables exported from Kotlin
 */
internal const val JUPYTER_IMPORT_SPECIFIER_SOURCE_NAME = "@jupyter"

/**
 * Library mapping JSON file name
 *
 * Static configuration file path: resources/libs-mapping.json
 * Contains mapping from JavaScript library names to CDN URLs
 */
internal const val LIBS_MAPPING_JSON_FILE_NAME = "libs-mapping.json"
