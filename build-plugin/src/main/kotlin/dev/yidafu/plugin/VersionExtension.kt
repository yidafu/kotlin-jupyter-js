package dev.yidafu.plugin

import org.gradle.api.Project
import org.gradle.api.artifacts.VersionCatalog
import org.gradle.api.artifacts.VersionCatalogsExtension
import org.gradle.api.provider.Provider
import org.gradle.kotlin.dsl.getByType
import org.gradle.plugin.use.PluginDependency

class VersionExtension(private val project: Project, private val catalogName: String) {
    private val catalog by lazy {
        val catalogs = project.extensions.getByType<VersionCatalogsExtension>()
        catalogs.named(catalogName)
    }

    fun getVersion(name: String): Provider<PluginDependency> {
        return catalog.findPlugin(name).get()
    }
}

fun Project.getVersion(name: String): Provider<PluginDependency> {
    val catalogs = project.extensions.getByType<VersionExtension>()
    return catalogs.getVersion(name)
}

//val Project.defaultVersionCatalog = versionC