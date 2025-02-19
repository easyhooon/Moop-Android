plugins {
    id("moop.android.buildconfig")
}

android {
    namespace = "soup.movie.buildconfig"

    defaultConfig {
        buildConfigField("int", "VERSION_CODE", "Integer.valueOf(0)")
        buildConfigField("String", "VERSION_NAME", "String.valueOf(\"0\")")
        buildConfigField("String", "API_BASE_URL", "String.valueOf(\"stub\")")
    }
    buildFeatures {
        buildConfig = true
    }
}
