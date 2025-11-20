package dev.yidafu.jupyper

import dev.yidafu.jupyper.processor.ImportSourceMappingProcessor
import kotlinx.serialization.json.Json

/**
 * JavaScript library mapping table
 *
 * Loads JavaScript library mappings from static JSON configuration file (libs-mapping.json)
 * Provides mapping from library name to JavaScriptPackage for automatic import statement resolution in JavaScript code
 *
 * Configuration file location: resources/libs-mapping.json
 *
 * Configuration file format:
 * ```json
 * {
 *   "react": "https://esm.sh/react@18.2.0",
 *   "lodash": {
 *     "main": "https://cdn.jsdelivr.net/npm/lodash-es@4.17.21/lodash.min.js",
 *     "extra": []
 *   }
 * }
 * ```
 *
 * Note: Runtime configuration (via ConfigManager) has higher priority than static configuration
 */
object LibsMapping : Map<String, JavaScriptPackage> {
    /**
     * Lazy-loaded library mapping table
     * Loaded from JSON file on first access
     */
    private val mLibsMapping: Map<String, JavaScriptPackage> by lazy {
        getLibMapping()
    }

    /**
     * Reads content from resource file
     *
     * @param filepath Resource file path (relative to resources directory)
     * @return File content, returns empty string if file doesn't exist
     */
    internal fun getResourceFile(filepath: String): String {
        return ImportSourceMappingProcessor::class.java.classLoader.getResource(filepath)?.readText() ?: ""
    }

    /**
     * Gets configuration for specified library name
     *
     * @param key Library name (e.g., "react", "lodash")
     * @return JavaScriptPackage configuration, returns null if not found
     */
    override operator fun get(key: String): JavaScriptPackage? {
        return mLibsMapping[key]
    }

    /**
     * Loads library mapping table from JSON file
     *
     * @return Mapping table from library name to JavaScriptPackage
     */
    internal fun getLibMapping(): Map<String, JavaScriptPackage> {
        val libsMappingText = getResourceFile(LIBS_MAPPING_JSON_FILE_NAME)
        return if (libsMappingText.isNotEmpty()) {
            Json.decodeFromString<Map<String, JavaScriptPackage>>(libsMappingText)
        } else {
            emptyMap()
        }
    }

    override val entries: Set<Map.Entry<String, JavaScriptPackage>>
        get() = mLibsMapping.entries

    override val keys: Set<String>
        get() = mLibsMapping.keys

    override val size: Int
        get() = mLibsMapping.size

    override val values: Collection<JavaScriptPackage>
        get() = mLibsMapping.values

    override fun isEmpty(): Boolean = mLibsMapping.isEmpty()

    override fun containsValue(value: JavaScriptPackage): Boolean = mLibsMapping.containsValue(value)

    override fun containsKey(key: String): Boolean = mLibsMapping.containsKey(key)
}
