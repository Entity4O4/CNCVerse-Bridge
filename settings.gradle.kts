pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
        maven("https://packages.jetbrains.team/maven/p/cmp/dev")   
    }
}

dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
        maven("https://jitpack.io")
        maven("https://packages.jetbrains.team/maven/p/cmp/dev")   
        // de.femtopedia.dex2jar is on Maven Central
    }
}

rootProject.name = "CNCVerseStremioBridge"

include(":shared")
include(":androidApp")
include(":desktopApp")
