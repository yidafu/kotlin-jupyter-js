package dev.yidafu.plugin

import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.api.artifacts.VersionCatalogsExtension
import org.gradle.api.publish.PublishingExtension
import org.gradle.api.publish.maven.MavenPublication
import org.gradle.api.publish.maven.tasks.GenerateMavenPom
import org.gradle.jvm.tasks.Jar
import org.gradle.kotlin.dsl.*
import org.gradle.plugin.use.PluginDependency
import org.gradle.plugins.signing.SigningExtension
import org.jetbrains.dokka.gradle.DokkaTask
import java.net.URI

fun Project.getLibPlugin(name: String): PluginDependency {
    val catalogs = extensions.findByType<VersionCatalogsExtension>()
    val plugin = catalogs!!.find("libs").get().findPlugin(name)
    return plugin.get().get()
}

/**
 * plugin for library
 */
class LibraryPlugin : Plugin<Project> {
    companion object {
        const val PUBLICATION_NAME = "sonatype"
    }

    /**
     * Apply this plugin to the given target object.
     *
     * @param project The target object
     */
    override fun apply(project: Project) {
        with(project.plugins) {
            listOf(
                "jvm",
                "dokka",
                "signing",
                "mavenPublish",
                "ktlint",
            )
                .map { project.getLibPlugin(it) }
                .forEach {
                    apply(it.pluginId)
                }
        }
        project.extensions.create("publishMan", PublishManExtension::class)

        val dokkaJavadoc = project.tasks.findByName("dokkaJavadoc") as DokkaTask
        val dokkaJavadocJar = project.tasks.register<Jar>("dokkaJavadocJar") {
            dependsOn(dokkaJavadoc.path)
            from(dokkaJavadoc.outputDirectory)
            archiveClassifier.set("javadoc")
        }
        val kotlinSourcesJar = project.tasks.findByName("kotlinSourcesJar") as Jar

        val publishing = project.extensions.getByType<PublishingExtension>()
        publishing.repositories {
            maven {
                url = URI("https://s01.oss.sonatype.org/service/local/staging/deploy/maven2/")
                // 这里就是之前在issues.sonatype.org注册的账号
                credentials {
                    username = project.extra.get("sonatypeUsername") as String
                    password = project.extra.get("sonatypePassword") as String
                }
            }
        }

        publishing.publications {
            create<MavenPublication>(PUBLICATION_NAME) {
                pom {
//                    artifactId = "jupyter-js"
                    from(project.components["java"])
                    artifact(kotlinSourcesJar)
                    artifact(dokkaJavadocJar)

                    versionMapping {
                        usage("java-api") {
                            fromResolutionOf("runtimeClasspath")
                        }
                        usage("java-runtime") {
                            fromResolutionResult()
                        }
                    }

                    url.set("https://github.com/yidafu/kotlin-jupyter-js/")
//                properties.set(mapOf(
//                    "myProp" to "value",
//                    "prop.with.dots" to "anotherValue"
//                ))

                    licenses {
                        license {
                            name.set("The Apache License, Version 2.0")
                            url.set("http://www.apache.org/licenses/LICENSE-2.0.txt")
                        }
                    }
                    developers {
                        developer {
                            id.set("dovyih")
                            name.set("Dov Yih")
                            email.set("me@yidafu.dev")
                        }
                    }
                    scm {
                        connection.set("scm:git:git://github.com:yidafu/kotlin-jupyter-js.git")
                        developerConnection.set("scm:git:ssh://github.com:yidafu/kotlin-jupyter-js.git")
                        url.set("https://github.com:yidafu/kotlin-jupyter-js/")
                    }
                }
//                pom.withXml {
//                    val configurationNames = arrayOf("implementation", "api")
//                    val deps = configurationNames.map { configurationName ->
//                        project.configurations[configurationName].allDependencies.toList()
//                    }.flatten()
//                    if (deps.isNotEmpty()) {
//                        val dependenciesNode = asNode().appendNode("dependencies")
//                        deps.forEach {
//                            if (it.group != null) {
//                                val dependencyNode = dependenciesNode.appendNode("dependency")
//                                dependencyNode.appendNode("groupId", it.group)
//                                dependencyNode.appendNode("artifactId", it.name)
//                                dependencyNode.appendNode("version", it.version)
//                            }
//                        }
//                    }
//                }
            }
        }

        val signing = project.extensions.findByType<SigningExtension>()
        signing?.sign(publishing.publications[PUBLICATION_NAME])
        project.tasks.withType<GenerateMavenPom> {
            doFirst {
                val publishMan = this.project.extensions.findByType<PublishManExtension>()
                this.project.extensions.findByType(PublishingExtension::class)?.let { ext ->
                    println("pom name ${publishMan?.name?.getOrElse("")}")
                    ext.publications {
                        val publication = findByName(PUBLICATION_NAME) as MavenPublication
                        publication.pom {
                            name.set(publishMan?.name?.getOrElse(""))
                            description.set(publishMan?.description?.getOrElse(""))
                        }
                    }
                }
            }
        }
    }
}
