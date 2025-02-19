plugins {
    id("moop.android.library")
    id("moop.android.compose")
    id("moop.android.hilt")
}

android {
    namespace = "soup.movie.feature.detail"
}

dependencies {
    implementation(project(":core:ads"))
    implementation(project(":core:analytics:api"))
    implementation(project(":core:kotlin"))
    implementation(project(":core:designsystem"))
    implementation(project(":core:external"))
    implementation(project(":core:imageloading:api"))
    implementation(project(":core:logger"))
    implementation(project(":core:resources"))
    implementation(project(":data:repository:api"))
    implementation(project(":data:model"))
    implementation(project(":domain"))
    implementation(project(":feature:deeplink"))
    implementation(project(":feature:home"))

    implementation(libs.kotlin.stdlib)

    implementation(libs.androidx.activity.compose)
    implementation(libs.androidx.hilt.navigation.compose)
    implementation(libs.compose.foundation)
    implementation(libs.compose.material)
    implementation(libs.compose.ui)
    implementation(libs.compose.animation.graphics)
    implementation(libs.readmore.material)
    implementation(libs.materialmotion.compose.core)
    implementation(libs.photo.compose)

    testImplementation(projects.testing)
    androidTestImplementation(projects.testing)
}
