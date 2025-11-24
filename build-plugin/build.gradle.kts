plugins {
    `java-gradle-plugin`
    `kotlin-dsl`
    alias(libs.plugins.ktlint)
}

kotlin {
    jvmToolchain(17)
}

gradlePlugin {
    plugins {
        create("yidafu-lib") {
            id = "dev.yidafu.library"
            implementationClass = "dev.yidafu.plugin.LibraryPlugin"
        }
    }
}

repositories {
//    maven { setUrl("https://maven.aliyun.com/repository/gradle-plugin") }
    maven { setUrl("https://mirrors.cloud.tencent.com/nexus/repository/maven-public") }
    mavenCentral()
    gradlePluginPortal()
}

dependencies {
    // https://mvnrepository.com/artifact/org.slf4j/slf4j-api

    api(libs.bundles.allGradlePlugins)
//    api(libs.plugin.kotlinJvm)
//    api(libs.plugin.ksp)
//    api(libs.plugin.jupyter)
}
