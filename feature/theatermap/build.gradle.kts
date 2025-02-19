plugins {
    id("moop.android.library")
    id("moop.android.compose")
    id("moop.android.hilt")
}

android {
    namespace = "soup.movie.feature.theatermap"
}

dependencies {
    implementation(project(":core:kotlin"))
    implementation(project(":core:designsystem"))
    implementation(project(":core:external"))
    implementation(project(":core:logger"))
    implementation(project(":core:resources"))
    implementation(project(":data:repository:api"))
    implementation(project(":data:model"))

    implementation(libs.androidx.fragment)

    implementation(libs.androidx.activity.compose)
    implementation(libs.compose.foundation)
    implementation(libs.compose.material)
    implementation(libs.compose.ui)
    implementation(libs.accompanist.drawablepainter)

    implementation(libs.navermap.compose)

    testImplementation(project(":testing"))
    androidTestImplementation(project(":testing"))
}
