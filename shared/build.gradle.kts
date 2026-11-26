// Screens and everything else both apps share.
plugins {
    `java-library`
    id("com.dervarex.unweird") version "v0.2.0"
}

java {
    toolchain {
        languageVersion = JavaLanguageVersion.of(21)
    }
}

dependencies {
    implementation("org.projectlombok:lombok:1.18.48")
    annotationProcessor("org.projectlombok:lombok:1.18.48")
}
