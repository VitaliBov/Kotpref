import dependencies.Deps

include(
    ":sample",
    ":kotpref",
    ":initializer",
    ":enum-support",
    ":gson-support",
    ":livedata-support"
)

pluginManagement {
    repositories {
        google()
        jcenter()
        maven(url = "https://plugins.gradle.org/m2/")
    }
    resolutionStrategy {
        eachPlugin {
            when (requested.id.id) {
                "com.android.application", "com.android.library" -> useModule(Deps.androidGradlePlugin)
                "org.jetbrains.kotlin.android",
                "org.jetbrains.kotlin.android.extensions",
                "org.jetbrains.kotlin.kapt",
                "org.jetbrains.kotlin.jvm" -> {
                    useModule(Deps.Kotlin.gradlePlugin)
                }
            }
        }
    }
}
