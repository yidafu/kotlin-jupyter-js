package dev.yidafu.jupyter.libmapping

import dev.yidafu.jupyter.JavaScriptPackage
import dev.yidafu.jupyter.errors.ErrorFactory

/**
 * Throw configuration error
 * IllegalArgumentException will be converted to ConfigurationError by ErrorFactory.fromException
 */
private fun throwConfigurationError(
    configKey: String,
    message: String,
    configValue: String? = null,
): Nothing {
    // Throw IllegalArgumentException which ErrorFactory.fromException will convert to ConfigurationError
    throw IllegalArgumentException(message)
}

/**
 * JavaScript configuration DSL
 * Provides a friendly configuration API
 */
class JsConfigBuilder {
    private val mappings = mutableMapOf<String, JavaScriptPackage>()

    /**
     * Validate library name
     */
    private fun validateLibraryName(libraryName: String) {
        if (libraryName.isBlank()) {
            throwConfigurationError(
                configKey = "libraryName",
                message = "Library name cannot be empty or blank",
            )
        }
    }

    /**
     * Validate URL
     */
    private fun validateUrl(
        url: String,
        paramName: String = "url",
    ) {
        if (url.isBlank()) {
            throwConfigurationError(
                configKey = paramName,
                message = "URL cannot be empty or blank",
                configValue = url,
            )
        }
    }

    /**
     * Add dependency library (main method)
     */
    fun dependencies(
        libraryName: String,
        url: String,
    ) {
        validateLibraryName(libraryName)
        validateUrl(url, "url")
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
        validateLibraryName(libraryName)
        validateUrl(mainUrl, "mainUrl")
        extraUrls.forEachIndexed { index, url ->
            if (url.isBlank()) {
                throwConfigurationError(
                    configKey = "extraUrls[$index]",
                    message = "Extra URL at index $index cannot be empty or blank",
                    configValue = url,
                )
            }
        }
        mappings[libraryName] = JavaScriptPackage(mainUrl, extraUrls)
    }

    /**
     * Add dependency library (using JavaScriptPackage object)
     */
    fun dependencies(
        libraryName: String,
        packageConfig: JavaScriptPackage,
    ) {
        validateLibraryName(libraryName)
        validateUrl(packageConfig.mainSource, "packageConfig.mainSource")
        packageConfig.extraSources?.forEachIndexed { index, url ->
            if (url.isBlank()) {
                throwConfigurationError(
                    configKey = "packageConfig.extraSources[$index]",
                    message = "Extra URL at index $index cannot be empty or blank",
                    configValue = url,
                )
            }
        }
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
            LibMappingManager.set(name, config)
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
fun getJsConfig(): Map<String, JavaScriptPackage> = LibMappingManager.getAll()

/**
 * Check if library is configured
 */
fun hasJsLibrary(libraryName: String): Boolean {
    if (libraryName.isBlank()) {
        throwConfigurationError(
            configKey = "libraryName",
            message = "Library name cannot be empty or blank",
        )
    }
    return LibMappingManager.has(libraryName)
}
