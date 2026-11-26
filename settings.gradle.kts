pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
        maven("https://jitpack.io")
    }
    // unweird's Gradle plugin is published on JitPack
    resolutionStrategy {
        eachPlugin {
            if (requested.id.id == "com.dervarex.unweird") {
                useModule("com.github.dervarex.unweird:unweird-gradle-plugin:${requested.version}")
            }
        }
    }
}

dependencyResolutionManagement {
    repositories {
        google()
        mavenCentral()
        maven("https://jitpack.io")
    }
}

rootProject.name = "Suppenger"

include("shared", "desktop", "android")
