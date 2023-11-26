package dev.yidafu.plugin

import org.gradle.api.Plugin
import org.gradle.api.Project

/**
 * plugin for library
 */
class LibraryPlugin : Plugin<Project> {
    /**
     * Apply this plugin to the given target object.
     *
     * @param project The target object
     */
    override fun apply(project: Project) {
        with(project.plugins) {
            apply("org.jetbrains.kotlin.jvm")
            apply("com.google.devtools.ksp")
            println("apply plugin jupyter api")
            apply("org.jetbrains.kotlin.jupyter.api")
            apply("org.jetbrains.kotlin.libs.publisher")
            apply("org.jetbrains.dokka")
            apply("org.jlleitschuh.gradle.ktlint")
        }
    }
}
