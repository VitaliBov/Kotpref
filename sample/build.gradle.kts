import dependencies.Deps
import dependencies.Versions

plugins {
    id("com.android.application")
    kotlin("android")
    kotlin("android.extensions")
}

android {
    compileSdkVersion(Versions.targetSdk)

    defaultConfig {
        applicationId = "com.chibatching.kotprefsample"
        minSdkVersion(Versions.minSdkWithSupportLibrary)
        targetSdkVersion(Versions.targetSdk)
        versionCode = 1
        versionName = "1.0"
        vectorDrawables.useSupportLibrary = true
    }
    buildTypes {
        getByName("debug") {
            isMinifyEnabled = false
        }
        getByName("release") {
            isMinifyEnabled = true
            proguardFiles(getDefaultProguardFile("proguard-android.txt"), "proguard-rules.pro")
        }
    }
    sourceSets["main"].java.srcDirs(file("src/main/kotlin"))
}

dependencies {
    implementation(Deps.AndroidX.appCompat)
    implementation(Deps.AndroidX.preference)
    implementation(Deps.Kotlin.stdlib)

    // core
    implementation(project(":kotpref"))

    // initializer
    implementation(project(":initializer"))

    // enum support
    implementation(project(":enum-support"))

    // gson support
    implementation(project(":gson-support"))
    implementation(Deps.gson)

    // LiveData support
    implementation(project(":livedata-support"))
    implementation(Deps.AndroidX.liveData)
    implementation(Deps.Kotlin.reflect)

    // For test
    testImplementation(Deps.junit)
    testImplementation(Deps.robolectric)
    testImplementation(Deps.assertj)
    testImplementation(Deps.Mockito.core)
    testImplementation(Deps.Mockito.kotlin) {
        exclude(group = "org.jetbrains.kotlin", module = "kotlin-stdlib")
    }
}

