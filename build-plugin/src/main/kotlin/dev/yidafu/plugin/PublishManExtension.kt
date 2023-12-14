package dev.yidafu.plugin

import org.gradle.api.provider.Property

interface PublishManExtension {
    val name: Property<String>
    val description: Property<String>
//    val publisher: Property<String>
//    val publisherEmail: Property<String>
//    val withDependencies: Property<Boolean>
}
