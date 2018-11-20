import dependencies.Deps
import dependencies.Versions

plugins {
    id("com.android.library")
    kotlin("android")
    jacoco
    id("build-setting-helper")
}

val moduleName by extra<String> { "Kotpref" }

android {
    compileSdkVersion(Versions.targetSdk)

    defaultConfig {
        minSdkVersion(Versions.minSdk)
        targetSdkVersion(Versions.targetSdk)
        versionName = Versions.versionName

        consumerProguardFile(file("proguard-rules.pro"))
    }
    buildTypes {
        getByName("debug") {
            isTestCoverageEnabled = isCi
        }
        getByName("release") {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android.txt"), "proguard-rules.pro")
        }
    }
    sourceSets["main"].java.srcDir(file("src/main/kotlin"))

    testOptions {
        unitTests.isIncludeAndroidResources = true
    }
}

dependencies {
    compileOnly(Deps.Kotlin.stdlib)

    testImplementation(Deps.Kotlin.stdlib)
    testImplementation(Deps.junit)
    testImplementation(Deps.robolectric)
    testImplementation(Deps.AndroidX.test)
    testImplementation(Deps.assertj)
}

apply(from = "${project.rootDir}/gradle/publish/publish.gradle")
