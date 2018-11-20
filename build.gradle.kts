import dependencies.Deps
import dependencies.Versions

val versionName by extra<String> { Versions.versionName }
val groupName by extra<String> { "com.chibatching.kotpref" }

buildscript {
    repositories {
        jcenter()
        google()
    }
    dependencies {
        classpath("com.jfrog.bintray.gradle:gradle-bintray-plugin:1.8.4")
        classpath("com.github.dcendents:android-maven-gradle-plugin:2.1")
        classpath("org.jetbrains.dokka:dokka-android-gradle-plugin:0.9.17")
    }
}

allprojects {
    repositories {
        jcenter()
        google()
    }
}

tasks.create("replaceVersionInReadme") {
    doLast {
        ant.withGroovyBuilder {
            "replaceregexp"(
                "match" to "com\\.chibatching\\.kotpref:(.+):([0-9\\.]+)",
                "replace" to "com.chibatching.kotpref:\\1:${Versions.versionName}",
                "flags" to "g"
            ) {
                "fileset"("dir" to project.projectDir, "includes" to "README.md")
            }
        }
        ant.withGroovyBuilder {
            "replaceregexp"(
                "match" to "android\\.arch\\.lifecycle:livedata:([0-9\\.]+)",
                "replace" to "android.arch.lifecycle:livedata:${Versions.AndroidX.liveData}",
                "flags" to "g"
            ) {
                "fileset"("dir" to project.projectDir, "includes" to "README.md")
            }
        }
        ant.withGroovyBuilder {
            "replaceregexp"(
                "match" to "com\\.google\\.code\\.gson:gson:([0-9\\.]+)",
                "replace" to "com.google.code.gson:gson:${Versions.gson}",
                "flags" to "g"
            ) {
                "fileset"("dir" to project.projectDir, "includes" to "README.md")
            }
        }
        ant.withGroovyBuilder {
            "replaceregexp"(
                "match" to "org\\.jetbrains\\.kotlin:kotlin-reflect:([0-9\\.]+)",
                "replace" to "org.jetbrains.kotlin:kotlin-reflect:${Versions.kotlin}",
                "flags" to "g"
            ) {
                "fileset"("dir" to project.projectDir, "includes" to "README.md")
            }
        }
        ant.withGroovyBuilder {
            "replaceregexp"(
                "match" to "kotlin-([0-9\\.]+)-blue\\.svg",
                "replace" to "kotlin-${Versions.kotlin}-blue.svg",
                "flags" to "g"
            ) {
                "fileset"("dir" to project.projectDir, "includes" to "README.md")
            }
        }
    }
}
