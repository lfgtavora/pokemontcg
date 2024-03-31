plugins {
    alias(libs.plugins.pokemontcg.android.library)
    alias(libs.plugins.jetbrainsKotlinAndroid)
    alias(libs.plugins.pokemontcg.android.hilt)
    id("kotlinx-serialization")
}

android {
    buildFeatures {
        buildConfig = true
    }
    namespace = "com.lfgtavora.pokemontcg.networking"
}

dependencies {

    implementation(libs.kotlinx.serialization.json)
    implementation(libs.okhttp.logging)
    implementation(libs.retrofit.core)
    implementation(libs.retrofit.kotlin.serialization)
}