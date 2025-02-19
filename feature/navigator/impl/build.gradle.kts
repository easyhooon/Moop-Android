plugins {
    id("moop.android.library")
    id("moop.android.hilt")
}

android {
    namespace = "soup.movie.feature.navigator.impl"
}

dependencies {
    implementation(project(":core:logger"))
    implementation(project(":feature:navigator:api"))

    implementation(libs.kotlin.stdlib)
}
