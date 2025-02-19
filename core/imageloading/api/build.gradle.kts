plugins {
    id("moop.android.library")
    id("moop.android.compose")
}

android {
    namespace = "soup.movie.core.imageloading"
}

dependencies {
    implementation(project(":core:kotlin"))

    implementation(libs.kotlin.stdlib)

    implementation(libs.compose.foundation)
    implementation(libs.coil.compose)
}
