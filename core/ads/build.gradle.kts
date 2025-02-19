plugins {
    id("moop.android.library")
    id("moop.android.compose")
    id("moop.android.hilt")
}

android {
    namespace = "soup.movie.core.ads"
}

dependencies {
    implementation(project(":core:kotlin"))
    implementation(project(":core:logger"))

    implementation(libs.kotlin.stdlib)

    implementation(libs.compose.foundation)
    implementation(libs.compose.ui)

    implementation(libs.google.admob)

    implementation(libs.androidx.constraintlayout)
    implementation(libs.androidx.lifecycle.runtime)
}
