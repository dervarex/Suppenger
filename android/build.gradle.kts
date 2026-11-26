plugins {
    id("com.android.application")
    id("com.dervarex.unweird") version "v0.2.0"
}

android {
    namespace = "com.dervarex.suppenger.android"
    compileSdk = 36

    defaultConfig {
        applicationId = "com.dervarex.suppenger"
        minSdk = 26
        targetSdk = 36
        versionCode = 1
        versionName = "1.0"
    }
}

dependencies {
    implementation(project(":shared"))
}
