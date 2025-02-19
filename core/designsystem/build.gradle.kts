plugins {
    id("moop.android.library")
    id("moop.android.compose")
}

android {
    namespace = "soup.movie.core.designsystem"
}

dependencies {
    implementation(project(":core:kotlin"))

    implementation(libs.kotlin.stdlib)

    implementation(libs.compose.foundation)
    implementation(libs.compose.material)
    implementation(libs.compose.materialIconsExtended)
    implementation(libs.compose.ui)

    implementation(libs.androidx.window)
}
