plugins {
    application
    id("com.dervarex.unweird") version "v0.2.0"
}

java {
    toolchain {
        languageVersion = JavaLanguageVersion.of(21)
    }
}

application {
    mainClass = "com.example.suppenger.desktop.Main"
}

dependencies {
    implementation(project(":shared"))
}
