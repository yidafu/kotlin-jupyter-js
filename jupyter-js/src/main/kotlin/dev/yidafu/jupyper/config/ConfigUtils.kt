package dev.yidafu.jupyper.config

/**
 * Configuration utility class
 * Provides common configuration presets and utility functions
 */
object ConfigUtils {
    /**
     * Common CDN providers
     */
    object CDN {
        const val JSDELIVR = "https://cdn.jsdelivr.net/npm"
        const val ESM_SH = "https://esm.sh"
        const val UNPKG = "https://unpkg.com"
        const val SKYPACK = "https://cdn.skypack.dev"
    }

    /**
     * Preset common library configurations
     */
    fun setupCommonLibraries() {
        jsConfig {
            // Frontend frameworks
            dep("vue", "$CDN.JSDELIVR/vue@3/dist/vue.esm-browser.js")
            dep("react", "$CDN.JSDELIVR/react@18/umd/react.development.js")
            dep("angular", "$CDN.JSDELIVR/@angular/core@15/bundles/core.umd.js")

            // Utility libraries
            dep("lodash", "$CDN.JSDELIVR/lodash-es@4.17.21/lodash.min.js")
            dep("moment", "$CDN.JSDELIVR/moment@2.29.4/min/moment.min.js")
            dep("dayjs", "$CDN.JSDELIVR/dayjs@1.11.7/dayjs.min.js")

            // Chart libraries
            dep("echarts", "$CDN.JSDELIVR/echarts@5.4.3/dist/echarts.esm.min.js")
            dep("chartjs", "$CDN.JSDELIVR/chart.js@4.2.1/dist/chart.min.js")
            dep("d3", "$CDN.JSDELIVR/d3@7/+esm")

            // Network request libraries
            dep("axios", "$CDN.ESM_SH/axios")
            dep("fetch", "$CDN.ESM_SH/whatwg-fetch")
        }
    }

    /**
     * Setup development environment configuration
     */
    fun setupDevelopmentConfig() {
        jsConfig {
            // Development environment uses uncompressed versions
            dep("vue", "$CDN.JSDELIVR/vue@3/dist/vue.esm-browser.js")
            dep("react", "$CDN.JSDELIVR/react@18/umd/react.development.js")
            dep("lodash", "$CDN.JSDELIVR/lodash@4.17.21/lodash.js")
        }
    }

    /**
     * Setup production environment configuration
     */
    fun setupProductionConfig() {
        jsConfig {
            // Production environment uses compressed versions
            dep("vue", "$CDN.JSDELIVR/vue@3/dist/vue.esm-browser.prod.js")
            dep("react", "$CDN.JSDELIVR/react@18/umd/react.production.min.js")
            dep("lodash", "$CDN.JSDELIVR/lodash@4.17.21/lodash.min.js")
        }
    }

    /**
     * Automatically detect library name from URL
     */
    fun detectLibraryName(url: String): String? {
        return when {
            url.contains("vue") -> "vue"
            url.contains("react") -> "react"
            url.contains("angular") -> "angular"
            url.contains("lodash") -> "lodash"
            url.contains("moment") -> "moment"
            url.contains("dayjs") -> "dayjs"
            url.contains("echarts") -> "echarts"
            url.contains("chart.js") -> "chartjs"
            url.contains("d3") -> "d3"
            url.contains("axios") -> "axios"
            else -> null
        }
    }

    /**
     * Validate if URL is valid
     */
    fun isValidUrl(url: String): Boolean {
        return try {
            java.net.URL(url)
            true
        } catch (e: Exception) {
            false
        }
    }

    /**
     * Extract library version information
     */
    fun extractVersion(url: String): String? {
        val versionRegex = """@(\d+\.\d+\.\d+)""".toRegex()
        return versionRegex.find(url)?.groupValues?.get(1)
    }

    /**
     * Generate library mapping report
     */
    fun generateConfigReport(): String {
        val stats = ConfigManager.getConfigStats()
        val allConfigs = ConfigManager.getAllLibraryMappings()

        return buildString {
            appendLine("# JavaScript Library Configuration Report")
            appendLine()
            appendLine("## Statistics")
            appendLine("- Static config: ${stats.staticConfigCount}")
            appendLine("- Runtime config: ${stats.runtimeConfigCount}")
            appendLine("- Total config: ${stats.totalConfigCount}")
            appendLine()
            appendLine("## Library Mapping List")
            allConfigs.forEach { (name, config) ->
                appendLine("- **$name**: ${config.mainSource}")
                if (!config.extraSources.isNullOrEmpty()) {
                    config.extraSources!!.forEach { extra ->
                        appendLine("  - Extra dependency: $extra")
                    }
                }
            }
        }
    }

    /**
     * Export configuration as simple string format
     */
    fun exportConfigAsString(): String {
        val allConfigs = ConfigManager.getAllLibraryMappings()
        return allConfigs.entries.joinToString("\n") { (name, config) ->
            "Library: $name\n  Main: ${config.mainSource}\n  Extra: ${config.extraSources?.joinToString(", ") ?: "none"}"
        }
    }
}
