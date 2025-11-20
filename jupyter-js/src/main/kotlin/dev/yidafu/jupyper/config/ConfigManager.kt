package dev.yidafu.jupyper.config

import dev.yidafu.jupyter.JavaScriptPackage
import dev.yidafu.jupyter.LibsMapping
import org.slf4j.LoggerFactory
import java.util.concurrent.ConcurrentHashMap

/**
 * Dual-mode configuration manager
 * Supports static JSON configuration and runtime dynamic configuration
 */
object ConfigManager {
    private val log = LoggerFactory.getLogger(ConfigManager::class.java)

    // Runtime dynamic configuration storage (default injects all CommonLibraries)
    private val runtimeConfig: ConcurrentHashMap<String, JavaScriptPackage> =
        ConcurrentHashMap<String, JavaScriptPackage>().apply {
            putAll(CommonLibraries.getAllPresets())
            log.info("Runtime configuration initialized, loaded $size default libraries")
        }

    // Configuration change listeners
    private val configChangeListeners = mutableListOf<() -> Unit>()

    /**
     * Common library preset configurations
     */
    object CommonLibraries {
        // CDN URLs
        private const val JSDELIVR = "https://cdn.jsdelivr.net/npm"
        private const val ESM_SH = "https://esm.sh"
        private const val UNPKG = "https://unpkg.com"

        /**
         * Visualization and chart libraries
         */
        val VISUALIZATION =
            mapOf(
                // ECharts - Powerful interactive chart library
                "echarts" to JavaScriptPackage("$JSDELIVR/echarts@5.4.3/dist/echarts.esm.min.js"),
                "echarts-gl" to JavaScriptPackage("https://cdn.jsdelivr.net/gh/yidafu/echarts-gl-esm@1.0.1/esm/echarts.js"),
                // D3.js - Data-driven visualization library
                "d3" to JavaScriptPackage("$JSDELIVR/d3@7/+esm"),
                // Chart.js - Simple and flexible chart library
                "chartjs" to JavaScriptPackage("$JSDELIVR/chart.js@4.2.1/dist/chart.min.js"),
                "chart.js" to JavaScriptPackage("$JSDELIVR/chart.js@4.2.1/dist/chart.min.js"),
                // Highcharts - Enterprise-grade chart library
                "highcharts" to
                    JavaScriptPackage(
                        "https://code.highcharts.com/es-modules/masters/highcharts.src.js",
                        listOf(
                            "https://code.highcharts.com/es-modules/masters/highcharts-more.src.js",
                            "https://code.highcharts.com/es-modules/masters/modules/exporting.src.js",
                            "https://code.highcharts.com/es-modules/masters/modules/export-data.src.js",
                        ),
                    ),
                // Plotly - Interactive scientific charts
                "plotly" to JavaScriptPackage("$JSDELIVR/plotly.js@2.27.0/dist/plotly.min.js"),
                // ApexCharts - Modern chart library
                "apexcharts" to JavaScriptPackage("$JSDELIVR/apexcharts@3.44.0/dist/apexcharts.esm.js"),
                // Vis.js - Network graphs and timelines
                "vis-data" to JavaScriptPackage("$ESM_SH/vis-data@7.1.9"),
                "vis-network" to JavaScriptPackage("$ESM_SH/vis-network@9.1.9"),
                "vis-timeline" to JavaScriptPackage("$ESM_SH/vis-timeline@7.7.3"),
                "vis-graph3d" to JavaScriptPackage("$ESM_SH/vis-graph3d@6.0.6"),
                // Three.js - 3D visualization
                "three" to JavaScriptPackage("$JSDELIVR/three@0.158.0/build/three.module.js"),
                // Leaflet - Map visualization
                "leaflet" to JavaScriptPackage("$UNPKG/leaflet@1.9.4/dist/leaflet-src.esm.js"),
                // Vega - Declarative visualization grammar
                "vega" to JavaScriptPackage("$JSDELIVR/vega@5.26.0/build/vega.module.js"),
                "vega-lite" to JavaScriptPackage("$JSDELIVR/vega-lite@5.16.0/build/vega-lite.module.js"),
                "vega-embed" to JavaScriptPackage("$JSDELIVR/vega-embed@6.24.0/build/vega-embed.module.js"),
                // More popular visualization libraries (based on real npm packages)
                // Observable Plot - Modern data visualization (Observable official)
                "observable-plot" to JavaScriptPackage("$JSDELIVR/@observablehq/plot@0.6.8/dist/plot.umd.js"),
                // Cytoscape.js - Graph theory and network analysis (MIT open source)
                "cytoscape" to JavaScriptPackage("$JSDELIVR/cytoscape@3.26.0/dist/cytoscape.min.js"),
                // Sigma.js - Network graph visualization (Graphology project)
                "sigma" to JavaScriptPackage("$JSDELIVR/sigma@2.3.1/dist/sigma.min.js"),
                // Mermaid - Charts and flowcharts (Mermaid official)
                "mermaid" to JavaScriptPackage("$JSDELIVR/mermaid@10.6.1/dist/mermaid.min.js"),
                // Dagre - Directed graph layout algorithm (Dagre official)
                "dagre" to JavaScriptPackage("$JSDELIVR/dagre@5.2.4/dist/dagre.min.js"),
                // WebCola - Constraint layout algorithm (WebCola official)
                "cola" to JavaScriptPackage("$JSDELIVR/webcola@3.4.0/WebCola/cola.min.js"),
                // ML-Matrix - Machine learning matrix operations (ML.js project)
                "ml-matrix" to JavaScriptPackage("$JSDELIVR/ml-matrix@6.10.4/lib/index.js"),
                // ML-Regression - Machine learning regression algorithms (ML.js project)
                "ml-regression" to JavaScriptPackage("$JSDELIVR/ml-regression@6.0.0/lib/index.js"),
                // Mapbox GL JS - Map visualization (Mapbox official)
                "mapbox-gl" to JavaScriptPackage("$JSDELIVR/mapbox-gl@2.15.0/dist/mapbox-gl.js"),
                // Deck.gl - Data visualization layer (Uber open source)
                "deck.gl" to JavaScriptPackage("$JSDELIVR/deck.gl@8.9.24/dist.min.js"),
                // GSAP - Professional animation library (GreenSock official)
                "gsap" to JavaScriptPackage("$JSDELIVR/gsap@3.12.2/dist/gsap.min.js"),
                // Anime.js - Lightweight animation library (Anime.js official)
                "anime" to JavaScriptPackage("$JSDELIVR/animejs@3.2.1/lib/anime.min.js"),
                // Lottie - Animation rendering library (Airbnb open source)
                "lottie-web" to JavaScriptPackage("$JSDELIVR/lottie-web@5.12.2/build/player/lottie.min.js"),
                // Particles.js - Particle system (Particles.js official)
                "particles.js" to JavaScriptPackage("$JSDELIVR/particles.js@2.0.0/particles.min.js"),
                // P5.js - Creative coding library (Processing Foundation)
                "p5" to JavaScriptPackage("$JSDELIVR/p5@1.7.0/lib/p5.min.js"),
                // AG Grid - Enterprise data grid (AG Grid official)
                "ag-grid" to JavaScriptPackage("$JSDELIVR/ag-grid-community@31.0.3/dist/ag-grid-community.min.js"),
                // Tabulator - Interactive data table (Tabulator official)
                "tabulator" to JavaScriptPackage("$JSDELIVR/tabulator-tables@5.5.2/dist/js/tabulator.min.js"),
                // DHTMLX Gantt - Gantt chart component (DHTMLX official)
                "gantt" to JavaScriptPackage("$JSDELIVR/dhtmlx-gantt@8.0.6/codebase/dhtmlxgantt.js"),
                // D3 Hierarchy - Hierarchical layout (D3 official)
                "d3-hierarchy" to JavaScriptPackage("$JSDELIVR/d3-hierarchy@3.1.2/dist/d3-hierarchy.min.js"),
                // D3 Treemap - Treemap layout (D3 official)
                "d3-treemap" to JavaScriptPackage("$JSDELIVR/d3-treemap@1.0.0/dist/d3-treemap.min.js"),
                // Heatmap.js - Heatmap library (Heatmap.js official)
                "heatmap.js" to JavaScriptPackage("$JSDELIVR/heatmap.js@2.0.5/build/heatmap.min.js"),
                // WordCloud2 - Word cloud generation (WordCloud2 official)
                "wordcloud" to JavaScriptPackage("$JSDELIVR/wordcloud@2.10.0/src/wordcloud2.js"),
                // D3 Sankey - Sankey diagram (D3 official)
                "d3-sankey" to JavaScriptPackage("$JSDELIVR/d3-sankey@0.12.3/dist/d3-sankey.min.js"),
                // D3 Force - Force-directed graph (D3 official)
                "d3-force" to JavaScriptPackage("$JSDELIVR/d3-force@3.0.0/dist/d3-force.min.js"),
                // Gauge.js - Gauge dashboard (Gauge.js official)
                "gauge.js" to JavaScriptPackage("$JSDELIVR/gauge.js@1.3.2/dist/gauge.min.js"),
                // ECharts GL - 3D chart extension (Apache ECharts official)
                "echarts-gl" to JavaScriptPackage("$JSDELIVR/echarts-gl@2.0.9/dist/echarts-gl.min.js"),
                // ECharts LiquidFill - Liquid fill chart (ECharts extension)
                "echarts-liquidfill" to JavaScriptPackage("$JSDELIVR/echarts-liquidfill@3.1.0/dist/echarts-liquidfill.min.js"),
                // Dagre D3 - Directed graph layout (Dagre D3 official)
                "dagre-d3" to JavaScriptPackage("$JSDELIVR/dagre-d3@5.2.4/dist/dagre-d3.min.js"),
                // TradingView Lightweight Charts - Financial charts (TradingView official)
                "lightweight-charts" to
                    JavaScriptPackage(
                        "$JSDELIVR/lightweight-charts@4.1.3/dist/lightweight-charts.standalone.production.js",
                    ),
                // Flowchart.js - Flowchart (Flowchart.js official)
                "flowchart.js" to JavaScriptPackage("$JSDELIVR/flowchart.js@1.11.4/dist/flowchart.min.js"),
                // JSPlumb - Flowchart connections (JSPlumb official)
                "jsplumb" to JavaScriptPackage("$JSDELIVR/jsplumb@2.15.6/dist/js/jsplumb.min.js"),
                // Chart.js plugin - Annotation plugin (Chart.js official)
                "chartjs-plugin-annotation" to
                    JavaScriptPackage(
                        "$JSDELIVR/chartjs-plugin-annotation@3.0.1/dist/chartjs-plugin-annotation.min.js",
                    ),
                // Chart.js plugin - Data labels (Chart.js community)
                "chartjs-plugin-datalabels" to
                    JavaScriptPackage(
                        "$JSDELIVR/chartjs-plugin-datalabels@2.2.0/dist/chartjs-plugin-datalabels.min.js",
                    ),
                // Chart.js adapter - Date handling (Chart.js official)
                "chartjs-adapter-date-fns" to
                    JavaScriptPackage(
                        "$JSDELIVR/chartjs-adapter-date-fns@3.0.0/dist/chartjs-adapter-date-fns.bundle.min.js",
                    ),
                // Globe.gl - 3D globe visualization (Globe.gl official)
                "globe.gl" to JavaScriptPackage("$JSDELIVR/globe.gl@2.28.0/dist/globe.gl.min.js"),
                // D3 core modules (D3 official)
                "d3-selection" to JavaScriptPackage("$JSDELIVR/d3-selection@3.0.0/dist/d3-selection.min.js"),
                "d3-scale" to JavaScriptPackage("$JSDELIVR/d3-scale@4.0.2/dist/d3-scale.min.js"),
                "d3-axis" to JavaScriptPackage("$JSDELIVR/d3-axis@3.0.1/dist/d3-axis.min.js"),
                "d3-shape" to JavaScriptPackage("$JSDELIVR/d3-shape@3.2.0/dist/d3-shape.min.js"),
                "d3-path" to JavaScriptPackage("$JSDELIVR/d3-path@3.1.0/dist/d3-path.min.js"),
                "d3-array" to JavaScriptPackage("$JSDELIVR/d3-array@3.2.4/dist/d3-array.min.js"),
                "d3-color" to JavaScriptPackage("$JSDELIVR/d3-color@3.1.0/dist/d3-color.min.js"),
                "d3-interpolate" to JavaScriptPackage("$JSDELIVR/d3-interpolate@3.0.1/dist/d3-interpolate.min.js"),
                "d3-ease" to JavaScriptPackage("$JSDELIVR/d3-ease@3.0.1/dist/d3-ease.min.js"),
                "d3-transition" to JavaScriptPackage("$JSDELIVR/d3-transition@3.0.1/dist/d3-transition.min.js"),
                "d3-zoom" to JavaScriptPackage("$JSDELIVR/d3-zoom@3.0.0/dist/d3-zoom.min.js"),
                "d3-brush" to JavaScriptPackage("$JSDELIVR/d3-brush@3.0.0/dist/d3-brush.min.js"),
                "d3-drag" to JavaScriptPackage("$JSDELIVR/d3-drag@3.0.0/dist/d3-drag.min.js"),
                "d3-dispatch" to JavaScriptPackage("$JSDELIVR/d3-dispatch@3.0.1/dist/d3-dispatch.min.js"),
                "d3-timer" to JavaScriptPackage("$JSDELIVR/d3-timer@3.0.1/dist/d3-timer.min.js"),
                "d3-format" to JavaScriptPackage("$JSDELIVR/d3-format@3.1.0/dist/d3-format.min.js"),
                "d3-time" to JavaScriptPackage("$JSDELIVR/d3-time@3.1.0/dist/d3-time.min.js"),
                "d3-time-format" to JavaScriptPackage("$JSDELIVR/d3-time-format@4.1.0/dist/d3-time-format.min.js"),
            )

        /**
         * Utility libraries (based on real npm packages)
         */
        val UTILITIES =
            mapOf(
                // Lodash - Utility library (Lodash official)
                "lodash" to JavaScriptPackage("$JSDELIVR/lodash-es@4.17.21/lodash.min.js"),
                "lodash-es" to JavaScriptPackage("$JSDELIVR/lodash-es@4.17.21/lodash.min.js"),
                // Date and time handling
                "moment" to JavaScriptPackage("$JSDELIVR/moment@2.29.4/min/moment.min.js"),
                "dayjs" to JavaScriptPackage("$JSDELIVR/dayjs@1.11.10/dayjs.min.js"),
                "date-fns" to JavaScriptPackage("$JSDELIVR/date-fns@2.30.0/esm/index.js"),
                // Math and numerical computation
                "mathjs" to JavaScriptPackage("$ESM_SH/mathjs@12.2.0"),
                "numeric" to JavaScriptPackage("$JSDELIVR/numeric@1.2.6/numeric.js"),
                // Color handling
                "chroma-js" to JavaScriptPackage("$ESM_SH/chroma-js@2.4.2"),
                // UUID generation
                "uuid" to JavaScriptPackage("$ESM_SH/uuid@9.0.1"),
                // More popular utility libraries
                // Ramda - Functional programming utility library (Ramda official)
                "ramda" to JavaScriptPackage("$JSDELIVR/ramda@0.29.1/dist/ramda.min.js"),
                // Underscore.js - Utility library (Underscore.js official)
                "underscore" to JavaScriptPackage("$JSDELIVR/underscore@1.13.6/underscore-min.js"),
                // Immutable.js - Immutable data structures (Immutable.js official)
                "immutable" to JavaScriptPackage("$JSDELIVR/immutable@4.3.4/dist/immutable.min.js"),
                // RxJS - Reactive programming (RxJS official)
                "rxjs" to JavaScriptPackage("$JSDELIVR/rxjs@7.8.1/dist/bundles/rxjs.umd.min.js"),
                // Axios - HTTP client (Axios official)
                "axios" to JavaScriptPackage("$JSDELIVR/axios@1.6.2/dist/axios.min.js"),
                // Fetch API polyfill
                "whatwg-fetch" to JavaScriptPackage("$JSDELIVR/whatwg-fetch@3.6.20/dist/fetch.umd.js"),
                // Ky - Modern HTTP client (Ky official)
                "ky" to JavaScriptPackage("$JSDELIVR/ky@0.33.3/index.js"),
                // Data validation
                "joi" to JavaScriptPackage("$JSDELIVR/joi@17.11.0/dist/joi-browser.min.js"),
                "yup" to JavaScriptPackage("$JSDELIVR/yup@1.4.0/dist/yup.min.js"),
                "zod" to JavaScriptPackage("$JSDELIVR/zod@3.22.4/dist/index.umd.js"),
                // String processing
                "validator" to JavaScriptPackage("$JSDELIVR/validator@13.11.0/validator.min.js"),
                "string" to JavaScriptPackage("$JSDELIVR/string@3.3.3/lib/string.min.js"),
                // Array and object processing
                "array.prototype.flat" to JavaScriptPackage("$JSDELIVR/array.prototype.flat@1.3.1/index.js"),
                "object.assign" to JavaScriptPackage("$JSDELIVR/object.assign@4.1.4/index.js"),
                // Functional programming
                "fp-ts" to JavaScriptPackage("$JSDELIVR/fp-ts@2.16.5/dist/index.js"),
                "rambda" to JavaScriptPackage("$JSDELIVR/rambda@7.4.0/dist/rambda.umd.js"),
                // Utility functions
                "classnames" to JavaScriptPackage("$JSDELIVR/classnames@2.3.2/index.js"),
                "clsx" to JavaScriptPackage("$JSDELIVR/clsx@2.0.0/dist/index.js"),
                "nanoid" to JavaScriptPackage("$JSDELIVR/nanoid@5.0.4/index.browser.js"),
                "shortid" to JavaScriptPackage("$JSDELIVR/shortid@2.2.16/dist/shortid.min.js"),
                // File processing
                "file-saver" to JavaScriptPackage("$JSDELIVR/file-saver@2.0.5/dist/FileSaver.min.js"),
                "jszip" to JavaScriptPackage("$JSDELIVR/jszip@3.10.1/dist/jszip.min.js"),
                "papaparse" to JavaScriptPackage("$JSDELIVR/papaparse@5.4.1/papaparse.min.js"),
                // Encryption and security
                "crypto-js" to JavaScriptPackage("$JSDELIVR/crypto-js@4.2.0/crypto-js.js"),
                "js-sha256" to JavaScriptPackage("$JSDELIVR/js-sha256@0.11.0/src/sha256.js"),
                "js-md5" to JavaScriptPackage("$JSDELIVR/js-md5@0.8.3/src/md5.js"),
                // Regular expressions
                "xregexp" to JavaScriptPackage("$JSDELIVR/xregexp@5.1.1/build/xregexp-all.min.js"),
                // Random number generation
                "seedrandom" to JavaScriptPackage("$JSDELIVR/seedrandom@3.0.5/seedrandom.min.js"),
                // Performance monitoring
                "performance-now" to JavaScriptPackage("$JSDELIVR/performance-now@2.1.0/lib/performance-now.js"),
                // Browser detection
                "bowser" to JavaScriptPackage("$JSDELIVR/bowser@2.11.0/es5.js"),
                "ua-parser-js" to JavaScriptPackage("$JSDELIVR/ua-parser-js@1.0.37/dist/ua-parser.min.js"),
                // Local storage
                "localforage" to JavaScriptPackage("$JSDELIVR/localforage@1.10.0/dist/localforage.min.js"),
                "store" to JavaScriptPackage("$JSDELIVR/store@2.0.12/store.min.js"),
                // Deep copy
                "clone" to JavaScriptPackage("$JSDELIVR/clone@2.1.2/clone.js"),
                "deepmerge" to JavaScriptPackage("$JSDELIVR/deepmerge@4.3.1/dist/umd.js"),
                // Event handling
                "mitt" to JavaScriptPackage("$JSDELIVR/mitt@3.0.1/dist/mitt.umd.js"),
                "eventemitter3" to JavaScriptPackage("$JSDELIVR/eventemitter3@5.0.1/index.umd.js"),
                // Debounce and throttle
                "lodash.debounce" to JavaScriptPackage("$JSDELIVR/lodash.debounce@4.0.8/index.js"),
                "lodash.throttle" to JavaScriptPackage("$JSDELIVR/lodash.throttle@4.1.1/index.js"),
                // Type checking
                "is" to JavaScriptPackage("$JSDELIVR/is@0.20.0/index.js"),
                "kind-of" to JavaScriptPackage("$JSDELIVR/kind-of@6.0.3/index.js"),
                // Math utilities
                "decimal.js" to JavaScriptPackage("$JSDELIVR/decimal.js@10.4.3/decimal.min.js"),
                "big.js" to JavaScriptPackage("$JSDELIVR/big.js@6.2.1/big.min.js"),
                "bignumber.js" to JavaScriptPackage("$JSDELIVR/bignumber.js@9.1.2/bignumber.min.js"),
                // Statistical computation
                "simple-statistics" to JavaScriptPackage("$JSDELIVR/simple-statistics@7.8.3/dist/simple-statistics.min.js"),
                "ml-matrix" to JavaScriptPackage("$JSDELIVR/ml-matrix@6.10.4/lib/index.js"),
                // Text processing
                "marked" to JavaScriptPackage("$JSDELIVR/marked@9.1.6/marked.min.js"),
                "dompurify" to JavaScriptPackage("$JSDELIVR/dompurify@3.0.5/dist/purify.min.js"),
                "he" to JavaScriptPackage("$JSDELIVR/he@1.2.0/he.js"),
                // Internationalization
                "i18next" to JavaScriptPackage("$JSDELIVR/i18next@23.7.6/dist/umd/i18next.min.js"),
                "numeral" to JavaScriptPackage("$JSDELIVR/numeral@2.0.6/min/numeral.min.js"),
                // Utility functions
                "escape-html" to JavaScriptPackage("$JSDELIVR/escape-html@1.0.3/index.js"),
                "escape-string-regexp" to JavaScriptPackage("$JSDELIVR/escape-string-regexp@5.0.0/index.js"),
                "strip-ansi" to JavaScriptPackage("$JSDELIVR/strip-ansi@7.1.0/index.js"),
                "ansi-regex" to JavaScriptPackage("$JSDELIVR/ansi-regex@6.0.1/index.js"),
            )

        /**
         * Frontend frameworks
         */
        val FRAMEWORKS =
            mapOf(
                // React ecosystem
                "react" to JavaScriptPackage("$ESM_SH/react@18.2.0"),
                "react-dom" to JavaScriptPackage("$ESM_SH/react-dom@18.2.0/client"),
            )

        /**
         * Network request libraries
         */
        val NETWORK =
            mapOf(
                "axios" to JavaScriptPackage("$ESM_SH/axios@1.6.2"),
                "fetch" to JavaScriptPackage("$ESM_SH/whatwg-fetch@3.6.19"),
                "ky" to JavaScriptPackage("$ESM_SH/ky@1.1.3"),
            )

        /**
         * Data processing libraries
         */
        val DATA_PROCESSING =
            mapOf(
                // Ramda - Functional programming
                "ramda" to JavaScriptPackage("$ESM_SH/ramda@0.29.1"),
                // RxJS - Reactive programming
                "rxjs" to JavaScriptPackage("$ESM_SH/rxjs@7.8.1"),
                // Immutable.js - Immutable data structures
                "immutable" to JavaScriptPackage("$ESM_SH/immutable@4.3.4"),
            )

        /**
         * All preset libraries
         */
        fun getAllPresets(): Map<String, JavaScriptPackage> {
            return VISUALIZATION + UTILITIES + FRAMEWORKS + NETWORK + DATA_PROCESSING
        }
    }

    /**
     * Get library mapping configuration
     * Priority: runtime config > static config
     */
    fun getLibraryMapping(libraryName: String): JavaScriptPackage? {
        return runtimeConfig[libraryName] ?: LibsMapping.default[libraryName]
    }

    /**
     * Get all library mapping configurations
     */
    fun getAllLibraryMappings(): Map<String, JavaScriptPackage> {
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
    fun setLibraryMapping(
        libraryName: String,
        packageConfig: JavaScriptPackage,
    ) {
        log.info("Set runtime library mapping: $libraryName -> ${packageConfig.mainSource}")
        runtimeConfig[libraryName] = packageConfig
        notifyConfigChanged()
    }

    /**
     * Set simple library mapping (URL only)
     */
    fun setLibraryMapping(
        libraryName: String,
        url: String,
    ) {
        val packageConfig = JavaScriptPackage(url)
        setLibraryMapping(libraryName, packageConfig)
    }

    /**
     * Set complex library mapping (URL + extra dependencies)
     */
    fun setLibraryMapping(
        libraryName: String,
        mainUrl: String,
        extraUrls: List<String> = emptyList(),
    ) {
        val packageConfig = JavaScriptPackage(mainUrl, extraUrls)
        setLibraryMapping(libraryName, packageConfig)
    }

    /**
     * Remove runtime library mapping
     */
    fun removeLibraryMapping(libraryName: String) {
        log.info("Remove runtime library mapping: $libraryName")
        runtimeConfig.remove(libraryName)
        notifyConfigChanged()
    }

    /**
     * Clear all runtime configuration
     */
    fun clearRuntimeConfig() {
        log.info("Clear all runtime configuration")
        runtimeConfig.clear()
        notifyConfigChanged()
    }

    /**
     * Check if library is configured
     */
    fun hasLibraryMapping(libraryName: String): Boolean {
        return runtimeConfig.containsKey(libraryName) || LibsMapping.default.containsKey(libraryName)
    }

    /**
     * Get configuration statistics
     */
    fun getConfigStats(): ConfigStats {
        return ConfigStats(
            staticConfigCount = LibsMapping.default.size,
            runtimeConfigCount = runtimeConfig.size,
            totalConfigCount = LibsMapping.default.size + runtimeConfig.size,
        )
    }

    /**
     * Add configuration change listener
     */
    fun addConfigChangeListener(listener: () -> Unit) {
        configChangeListeners.add(listener)
    }

    /**
     * Remove configuration change listener
     */
    fun removeConfigChangeListener(listener: () -> Unit) {
        configChangeListeners.remove(listener)
    }

    /**
     * Notify configuration change
     */
    private fun notifyConfigChanged() {
        configChangeListeners.forEach { it() }
    }

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

/**
 * Configuration statistics
 */
data class ConfigStats(
    val staticConfigCount: Int,
    val runtimeConfigCount: Int,
    val totalConfigCount: Int,
)
