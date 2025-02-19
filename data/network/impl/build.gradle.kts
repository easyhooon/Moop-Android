plugins {
    id("moop.android.library")
    id("moop.android.hilt")
    id("org.jetbrains.kotlin.plugin.serialization")
}

android {
    namespace = "soup.movie.data.network.impl"
}

dependencies {
    implementation(project(":core:kotlin"))
    implementation(project(":data:model"))
    implementation(project(":data:network:api"))

    implementation(libs.kotlin.stdlib)
    implementation(libs.kotlin.serialization)
    implementation(libs.coroutines.core)
    implementation(libs.coroutines.android)

    implementation(libs.androidx.core)

    implementation(libs.retrofit)
    implementation(libs.retrofit.serialization)
}
