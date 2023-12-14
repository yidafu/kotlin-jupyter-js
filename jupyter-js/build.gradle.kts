

/*
 * This file was generated by the Gradle 'init' task.
 *
 * This generated file contains a sample Kotlin library project to get you started.
 * For more details take a look at the 'Building Java & JVM projects' chapter in the Gradle
 * User Manual available at https://docs.gradle.org/8.0.2/userguide/building_java_projects.html
 * This project uses @Incubating APIs which are subject to change.
 */

plugins {
    // Apply the org.jetbrains.kotlin.jvm Plugin to add support for Kotlin.
    id("dev.yidafu.library")
//    kotlin("jvm")
//    kotlin("jupyter.api")
//    id("org.jetbrains.kotlin.jupyter.api")
//    id("com.google.devtools.ksp")
//    id("org.jetbrains.kotlin.libs.publisher")
    kotlin("plugin.serialization") version "1.9.21"
    `maven-publish`
}

kotlinJupyter {
    addApiDependency()
    addScannerDependency()
}

group = "dev.yidafu.jupyter"
version = "0.0.2"

val dokkaJavadocJar = tasks.register<Jar>("dokkaJavadocJar") {
    dependsOn(tasks.dokkaJavadoc)
    from(tasks.dokkaJavadoc.flatMap { it.outputDirectory })
    archiveClassifier.set("javadoc")
}


val ossrhUsername: String by project
val ossrhPassword: String by project

println("ossrhUsername $ossrhUsername")
publishing {
    publications {
        create<MavenPublication>("mavenKotlin") {
            pom {
                artifactId = "jupyter-js"
                from(components["java"])
                artifact(tasks.kotlinSourcesJar)
                artifact(dokkaJavadocJar)

                versionMapping {
                    usage("java-api") {
                        fromResolutionOf("runtimeClasspath")
                    }
                    usage("java-runtime") {
                        fromResolutionResult()
                    }
                }

                name.set("Kotlin Jupyter JS Support")
                description.set("Kotlin Jupyter JS Support")
                url.set("https://gitlab.yidafu.net/kotlin/kotlin-notebook-js")
//                properties.set(mapOf(
//                    "myProp" to "value",
//                    "prop.with.dots" to "anotherValue"
//                ))
//                distributionManagement {
//                    relocation {
//                        // New artifact coordinates
//                        groupId.set("dev.yidafu.jupyter")
//                        artifactId.set("jupyter-js")
//                        version.set("0.0.1")
//                        message.set("groupId has been changed")
//                    }
//                }

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
//                scm {
//                    connection.set("scm:git:git://github.com:yidafu/loki-logger.git")
//                    developerConnection.set("scm:git:ssh://github.com:yidafu/loki-logger.git")
//                    url.set("https://github.com:yidafu/loki-logger/")
//                }
            }
        }
    }

    repositories {
        maven {
            url = uri("https://s01.oss.sonatype.org/service/local/staging/deploy/maven2/")
            // 这里就是之前在issues.sonatype.org注册的账号
            credentials {
                username = ossrhUsername
                password = ossrhPassword
            }
        }
    }
}


dependencies {
    implementation("org.jetbrains.dokka:kotlin-analysis-compiler:1.8.20")
    testImplementation(kotlin("test"))
    implementation("org.slf4j:slf4j-api:2.0.9")
    implementation(project(":swc-binding"))
    implementation(libs.kotlin.serialization.json)
//    implementation("dev.yidafu.swc:swc-binding:0.3.1")

}

repositories {
    mavenCentral()
}