plugins {
    id("moop.android.library")
    id("moop.android.hilt")
}

android {
    namespace = "soup.movie.feature.notification.impl"
}

dependencies {
    implementation(project(":core:logger"))
    implementation(project(":core:resources"))
    implementation(project(":data:model"))
    implementation(project(":feature:navigator:api"))
    implementation(project(":feature:notification:api"))

    implementation(libs.kotlin.stdlib)
}
