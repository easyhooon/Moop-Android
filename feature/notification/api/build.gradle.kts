plugins {
    id("moop.android.library")
}

android {
    namespace = "soup.movie.feature.notification"
}

dependencies {
    implementation(project(":core:logger"))
    implementation(project(":data:model"))

    implementation(libs.kotlin.stdlib)

    implementation(libs.androidx.core)
}
