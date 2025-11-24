package dev.yidafu.jupyter.libmapping

import dev.yidafu.jupyter.JavaScriptPackage
import dev.yidafu.jupyter.libmapping.LibsMapping
import org.slf4j.LoggerFactory
import java.util.concurrent.ConcurrentHashMap

/**
 * Library mapping manager
 * Supports static JSON configuration and runtime dynamic configuration
 */
object LibMappingManager {
    private val log = LoggerFactory.getLogger(LibMappingManager::class.java)

    // Runtime dynamic configuration storage
    private val runtimeConfig: ConcurrentHashMap<String, JavaScriptPackage> =
        ConcurrentHashMap<String, JavaScriptPackage>().apply {
            log.info("Runtime configuration initialized")
        }

    /**
     * Get library mapping configuration
     * Priority: runtime config > static config
     */
    fun getMapping(libraryName: String): JavaScriptPackage? = runtimeConfig[libraryName] ?: LibsMapping.default[libraryName]

    /**
     * Get all library mapping configurations
     */
    fun getAll(): Map<String, JavaScriptPackage> {
        val allConfig = mutableMapOf<String, JavaScriptPackage>()
        // Add static config first
        allConfig.putAll(LibsMapping.default)
        // Then add runtime config (will override static config)
        allConfig.putAll(runtimeConfig)
        return allConfig
    }

    /**
     * Set runtime library mapping
     */
    fun set(
        libraryName: String,
        packageConfig: JavaScriptPackage,
    ) {
        log.info("Set runtime library mapping: $libraryName -> ${packageConfig.mainSource}")
        runtimeConfig[libraryName] = packageConfig
    }

    /**
     * Set simple library mapping (URL only)
     */
    fun set(
        libraryName: String,
        url: String,
    ) {
        val packageConfig = JavaScriptPackage(url)
        set(libraryName, packageConfig)
    }

    /**
     * Set complex library mapping (URL + extra dependencies)
     */
    fun set(
        libraryName: String,
        mainUrl: String,
        extraUrls: List<String> = emptyList(),
    ) {
        val packageConfig = JavaScriptPackage(mainUrl, extraUrls)
        set(libraryName, packageConfig)
    }

    /**
     * Remove runtime library mapping
     */
    fun remove(libraryName: String) {
        log.info("Remove runtime library mapping: $libraryName")
        runtimeConfig.remove(libraryName)
    }

    /**
     * Clear all runtime configuration
     */
    fun clearRuntimeConfig() {
        log.info("Clear all runtime configuration")
        runtimeConfig.clear()
    }

    /**
     * Check if library is configured
     */
    fun has(libraryName: String): Boolean = runtimeConfig.containsKey(libraryName) || LibsMapping.default.containsKey(libraryName)

    /**
     * Validate configuration validity
     */
    fun validateConfig(): List<String> {
        val errors = mutableListOf<String>()

        // Validate runtime configuration
        runtimeConfig.forEach { (name, config) ->
            try {
                if (config.mainSource.isBlank()) {
                    errors.add("Library '$name' main URL cannot be empty")
                }
            } catch (e: Exception) {
                errors.add("Library '$name' configuration is invalid: ${e.message}")
            }
        }

        return errors
    }
}
