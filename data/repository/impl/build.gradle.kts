plugins {
    id("moop.android.library")
    id("moop.android.hilt")
}

android {
    namespace = "soup.movie.data.repository.impl"
}

dependencies {
    implementation(project(":core:kotlin"))
    implementation(project(":core:logger"))
    implementation(project(":data:model"))
    implementation(project(":data:network:api"))
    implementation(project(":data:database:api"))
    implementation(project(":data:repository:api"))

    implementation(libs.kotlin.stdlib)
    implementation(libs.coroutines.core)
    implementation(libs.coroutines.android)

    implementation(libs.androidx.core)
}
