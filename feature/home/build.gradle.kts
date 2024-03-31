plugins {
    alias(libs.plugins.pokemontcg.android.feature)
    alias(libs.plugins.pokemontcg.android.library.compose)
}

android {
    namespace = "com.lfgtavora.pokemontcg.feature.home"
}

dependencies {
    //testImplementation(projects.core.testing)
}