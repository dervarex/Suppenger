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
    mainClass = "com.dervarex.suppenger.desktop.Main"
}

dependencies {
    implementation(project(":shared"))
    implementation("org.projectlombok:lombok:1.18.48")
    annotationProcessor("org.projectlombok:lombok:1.18.48")
}
