pluginManagement {
    repositories {
        google()
        gradlePluginPortal()
        mavenCentral()
        maven {
            url = uri("https://oss.sonatype.org/content/repositories/snapshots/")
        }
    }
}

rootProject.name = "KMM_Repro_GraphQL_Codegen_Crash"
include(":androidApp")
include(":shared")
