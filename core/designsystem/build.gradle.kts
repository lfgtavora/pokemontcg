plugins {
    alias(libs.plugins.pokemontcg.android.library)
    alias(libs.plugins.pokemontcg.android.library.compose)
}

android {
    namespace = "com.lfgtavora.pokemontcg.core.designsystem"

    defaultConfig {

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        consumerProguardFiles("consumer-rules.pro")
    }
}

dependencies {
    api(libs.androidx.compose.foundation)
    api(libs.androidx.compose.foundation.layout)
    api(libs.androidx.compose.material3)
    api(libs.androidx.compose.runtime)
    api(libs.androidx.compose.ui.util)
}