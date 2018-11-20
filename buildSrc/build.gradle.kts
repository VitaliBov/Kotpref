plugins {
    `kotlin-dsl`
    `java-gradle-plugin`
}

gradlePlugin {
    plugins {
        register("build-setting-helper-plugin") {
            id = "build-setting-helper"
            implementationClass = "plugin.BuildSettingHelperPlugin"
        }
    }
}

repositories {
    google()
    jcenter()
}
