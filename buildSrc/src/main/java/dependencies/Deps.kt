package dependencies

object Deps {

    val androidGradlePlugin = "com.android.tools.build:gradle:${Versions.androidGradlePlugin}"

    val junit = "junit:junit:${Versions.junit}"
    val robolectric = "org.robolectric:robolectric:${Versions.robolectric}"
    val assertj = "org.assertj:assertj-core:${Versions.assertj}"

    val gson = "com.google.code.gson:gson:${Versions.gson}"

    object Kotlin {
        val stdlib = "org.jetbrains.kotlin:kotlin-stdlib:${Versions.kotlin}"
        val reflect = "org.jetbrains.kotlin:kotlin-reflect:${Versions.kotlin}"
        val gradlePlugin = "org.jetbrains.kotlin:kotlin-gradle-plugin:${Versions.kotlin}"
    }

    object AndroidX {
        val appCompat = "androidx.appcompat:appcompat:${Versions.AndroidX.appCompat}"
        val preference = "androidx.preference:preference:${Versions.AndroidX.preference}"
        val test = "androidx.test:core:${Versions.AndroidX.test}"
        val liveData = "androidx.lifecycle:lifecycle-livedata:${Versions.AndroidX.liveData}"
    }

    object Mockito {
        val core = "org.mockito:mockito-core:${Versions.mockito}"
        val kotlin = "com.nhaarman:mockito-kotlin-kt1.1:${Versions.mockitoKotlin}"
    }
}
