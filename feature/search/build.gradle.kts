plugins {
    id("moop.android.library")
    id("moop.android.compose")
    id("moop.android.hilt")
}

android {
    namespace = "soup.movie.feature.search"
}

dependencies {
    implementation(project(":core:analytics:api"))
    implementation(project(":core:kotlin"))
    implementation(project(":core:designsystem"))
    implementation(project(":core:resources"))
    implementation(project(":data:repository:api"))
    implementation(project(":data:model"))
    implementation(project(":feature:home"))

    implementation(libs.compose.foundation)
    implementation(libs.compose.material)
    implementation(libs.compose.ui)

    implementation(libs.androidx.lifecycle.viewmodel.ktx)

    testImplementation(project(":testing"))
    androidTestImplementation(project(":testing"))
}
