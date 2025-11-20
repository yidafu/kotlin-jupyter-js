package dev.yidafu.jupyper.config

import dev.yidafu.jupyter.JavaScriptPackage

/**
 * JavaScript configuration DSL
 * Provides a friendly configuration API
 */
class JsConfigBuilder {
    private val mappings = mutableMapOf<String, JavaScriptPackage>()

    /**
     * Add dependency library (main method)
     */
    fun dependencies(
        libraryName: String,
        url: String,
    ) {
        mappings[libraryName] = JavaScriptPackage(url)
    }

    /**
     * Add dependency library (with extra dependencies)
     */
    fun dependencies(
        libraryName: String,
        mainUrl: String,
        extraUrls: List<String> = emptyList(),
    ) {
        mappings[libraryName] = JavaScriptPackage(mainUrl, extraUrls)
    }

    /**
     * Add dependency library (using JavaScriptPackage object)
     */
    fun dependencies(
        libraryName: String,
        packageConfig: JavaScriptPackage,
    ) {
        mappings[libraryName] = packageConfig
    }

    /**
     * dep is an alias for dependencies
     */
    fun dep(
        libraryName: String,
        url: String,
    ) = dependencies(libraryName, url)

    /**
     * dep is an alias for dependencies (with extra dependencies)
     */
    fun dep(
        libraryName: String,
        mainUrl: String,
        extraUrls: List<String> = emptyList(),
    ) = dependencies(libraryName, mainUrl, extraUrls)

    /**
     * dep is an alias for dependencies (using JavaScriptPackage object)
     */
    fun dep(
        libraryName: String,
        packageConfig: JavaScriptPackage,
    ) = dependencies(libraryName, packageConfig)

    /**
     * Apply configuration
     */
    internal fun apply() {
        mappings.forEach { (name, config) ->
            ConfigManager.setLibraryMapping(name, config)
        }
    }

    /**
     * Get current configuration
     */
    internal fun getMappings(): Map<String, JavaScriptPackage> = mappings.toMap()
}

/**
 * Configuration DSL entry function
 *
 * Usage example:
 * ```kotlin
 * jsConfig {
 *     dependencies("vue", "https://cdn.jsdelivr.net/npm/vue@3")
 *     dep("axios", "https://esm.sh/axios")  // dep is an alias for dependencies
 *     dep("lodash", "https://cdn.jsdelivr.net/npm/lodash-es@4.17.21/lodash.min.js")
 * }
 * ```
 */
fun jsConfig(block: JsConfigBuilder.() -> Unit) {
    val builder = JsConfigBuilder()
    builder.block()
    builder.apply()
}

/**
 * Get current configuration information
 */
fun getJsConfig(): Map<String, JavaScriptPackage> {
    return ConfigManager.getAllLibraryMappings()
}

/**
 * Check if library is configured
 */
fun hasJsLibrary(libraryName: String): Boolean {
    return ConfigManager.hasLibraryMapping(libraryName)
}

/**
 * Get configuration statistics
 */
fun getJsConfigStats(): ConfigStats {
    return ConfigManager.getConfigStats()
}
