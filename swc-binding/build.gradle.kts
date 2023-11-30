
import org.gradle.internal.jvm.Jvm
import java.io.ByteArrayOutputStream

plugins {
    id("dev.yidafu.library")
    id("maven-publish")
    signing
}

group = "dev.yidafu.swc"
version = "0.0.3"

dependencies {
    testImplementation(kotlin("test"))
    testImplementation(platform("org.junit:junit-bom:5.9.1"))
    testImplementation("org.junit.jupiter:junit-jupiter")

    implementation(libs.kotlin.serialization.json)
//    println(versionCatalogs.getVersion("kotlin-serialization-json"))
//    implementation(getVersion("kotlin-serialization-json"))
}

tasks.test {
    useJUnitPlatform()
}

val dokkaJavadocJar = tasks.register<Jar>("dokkaJavadocJar") {
    dependsOn(tasks.dokkaJavadoc)
    from(tasks.dokkaJavadoc.flatMap { it.outputDirectory })
    archiveClassifier.set("javadoc")
}

val ossrhUsername: String by project
val ossrhPassword: String by project

publishing {
    publications {
        create<MavenPublication>("mavenKotlin") {
            pom {
                artifactId = "swc-binding"
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

                name.set("SWC JVM Binding")
                description.set("swc jvm binding by kotlin")
                url.set("https://github.com/yidafu/kotlin-jupyter-js/tree/main/swc-binding#readme")
//                properties.set(mapOf(
//                    "myProp" to "value",
//                    "prop.with.dots" to "anotherValue"
//                ))
                distributionManagement {
                    relocation {
                        // New artifact coordinates
                        groupId.set("dev.yidafu.swc")
                        artifactId.set("swc-binding")
                        version.set("0.0.1")
                        message.set("groupId has been changed")
                    }
                }

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
                    connection.set("scm:git:git://github.com:yidafu/kotlin-notebook-js.git")
                    developerConnection.set("scm:git:ssh://github.com:yidafu/kotlin-notebook-js.git")
                    url.set("https://github.com/yidafu/kotlin-jupyter-js/tree/main/swc-binding#readme")
                }
            }
        }
    }

    repositories {
        maven {
            url = uri("https://s01.oss.sonatype.org/service/local/staging/deploy/maven2/")
            println(ossrhUsername + ossrhPassword)
            // 这里就是之前在issues.sonatype.org注册的账号
            credentials {
                username = ossrhUsername
                password = ossrhPassword
            }
        }
    }
}

signing {
    sign(publishing.publications["mavenKotlin"])
}

tasks.create("generateJniHeaders") {
    group = "build"
    dependsOn(tasks.getByName("compileKotlin"))

    val jniHeaderDirectory = file("jni")
    // For caching
    inputs.dir("src/main/kotlin")
    outputs.dir("src/main/generated/jni")

    doLast {
        println("generate jni")
        val javaHome = Jvm.current().javaHome
        val javap = javaHome.resolve("bin").walk().firstOrNull { it.name.startsWith("javap") }?.absolutePath ?: error("javap not found")
        val javac = javaHome.resolve("bin").walk().firstOrNull { it.name.startsWith("javac") }?.absolutePath ?: error("javac not found")
        val buildDir = file("build/classes/kotlin/main")
        val tmpDir = file("build/tmp/jni").apply { mkdirs() }

        val bodyExtractingRegex = """^.+\Rpublic \w* ?class ([^\s]+).*\{\R((?s:.+))\}\R$""".toRegex()
        val nativeMethodExtractingRegex = """.*\bnative\b.*""".toRegex()
        println(buildDir.absolutePath)
        buildDir.walkTopDown()
            .filter { "META" !in it.absolutePath }
            .forEach { file ->
                if (!file.isFile) return@forEach

                val output = ByteArrayOutputStream().use {
                    project.exec {
                        commandLine(javap, "-private", "-cp", buildDir.absolutePath, file.absolutePath)
                        standardOutput = it
                    }.assertNormalExitValue()
                    it.toString()
                }

                val (qualifiedName, methodInfo) = bodyExtractingRegex.find(output)?.destructured ?: return@forEach

                val lastDot = qualifiedName.lastIndexOf('.')
                val packageName = qualifiedName.substring(0, lastDot)
                val className = qualifiedName.substring(lastDot + 1, qualifiedName.length)

                val nativeMethods =
                    nativeMethodExtractingRegex.findAll(methodInfo).map { it.groups }.flatMap { it.asSequence().mapNotNull { group -> group?.value } }.toList()
                if (nativeMethods.isEmpty()) return@forEach

                val source = buildString {
                    appendln("package $packageName;")
                    appendln("public class $className {")
                    for (method in nativeMethods) {
                        if ("()" in method) {
                            appendln(method)
                        } else {
                            val updatedMethod = StringBuilder(method).apply {
                                var count = 0
                                var i = 0
                                while (i < length) {
                                    if (this[i] == ',' || this[i] == ')') {
                                        insert(i, " arg${count++}".also { i += it.length + 1 })
                                    } else {
                                        i++
                                    }
                                }
                            }
                            appendln(updatedMethod)
                        }
                    }
                    appendln("}")
                }
                val outputFile = tmpDir.resolve(packageName.replace(".", "/")).apply { mkdirs() }.resolve("$className.java").apply { delete() }.apply { createNewFile() }
                outputFile.writeText(source)
                project.exec {
                    commandLine(javac, "-h", jniHeaderDirectory.absolutePath, outputFile.absolutePath)
                }.assertNormalExitValue()
            }
    }
}
