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
//    alias(libs.plugins.jvm)
    alias(libs.plugins.jupyter)
    alias(libs.plugins.ksp)
//    alias(libs.plugins.publisher)
    alias(libs.plugins.kotlin.serialization)
    id("org.jetbrains.kotlinx.kover") version "0.7.5"

    `maven-publish`
}

kotlinJupyter {
    addApiDependency()
    addScannerDependency()
}

group = "dev.yidafu.jupyter"
version = "0.7.0"

dependencies {
    implementation("org.jetbrains.dokka:kotlin-analysis-compiler:1.8.20")
    testImplementation(kotlin("test"))
    implementation(libs.slf4j.api)
    implementation(libs.kotlin.serialization.json)
//    implementation(project(":swc-binding"))
    implementation(libs.swc.binding)

    testImplementation("io.kotest:kotest-runner-junit5:5.8.0")
    testImplementation("io.kotest:kotest-assertions-core:5.8.0")
    testImplementation("io.kotest:kotest-property:5.8.0")
    testImplementation("io.kotest:kotest-assertions-json:5.8.0")

    // https://mvnrepository.com/artifact/io.mockk/mockk
    testImplementation("io.mockk:mockk:1.13.9")
}

repositories {
    maven("https://mirrors.cloud.tencent.com/nexus/repository/maven-public")
    maven("https://s01.oss.sonatype.org/content/groups/public/")
    mavenCentral()
}

publishMan {
    name.set("Kotlin Jupyter JS Support")
    description.set("Kotlin Jupyter JS Support")
}


tasks.withType<Test>().configureEach {
    useJUnitPlatform()
}

