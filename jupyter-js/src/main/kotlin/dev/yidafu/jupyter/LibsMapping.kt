package dev.yidafu.jupyter

import dev.yidafu.jupyter.processor.ImportSourceMappingProcessor
import kotlinx.serialization.json.Json

class LibsMapping(
    private val mappingPath: String,
) : Map<String, JavaScriptPackage> {
    private val mLibsMapping: Map<String, JavaScriptPackage> by lazy {
        getLibMapping()
    }

    internal fun getResourceFile(filepath: String): String {
        return ImportSourceMappingProcessor::class.java.classLoader.getResource(filepath)?.readText() ?: ""
    }

    override operator fun get(key: String): JavaScriptPackage? {
        return mLibsMapping[key]
    }

    internal fun getLibMapping(): Map<String, JavaScriptPackage> {
        val libsMappingText = getResourceFile(mappingPath)
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

    companion object {
        val default = LibsMapping(LIBS_MAPPING_JSON_FILE_NAME)
    }
}
