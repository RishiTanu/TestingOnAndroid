// Top-level build file where you can add configuration options common to all sub-projects/modules.
buildscript {
    dependencies {
        classpath(libs.jetpack.navigation.safe.args.gradle.plugin)
        classpath(libs.hilt.gradle.plugin)
    }
    repositories {
        google()
    }
}


plugins {
    alias(libs.plugins.android.application) apply false
    alias(libs.plugins.jetbrains.kotlin.android) apply false
}