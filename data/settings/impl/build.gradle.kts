plugins {
    id("moop.android.library")
    id("moop.android.hilt")
    id("org.jetbrains.kotlin.plugin.serialization")
}

android {
    namespace = "soup.movie.data.settings.impl"
}

dependencies {
    implementation(project(":core:kotlin"))
    implementation(project(":data:model"))
    implementation(project(":data:settings:api"))

    implementation(libs.kotlin.stdlib)
    implementation(libs.kotlin.serialization)
    implementation(libs.coroutines.core)

    implementation(libs.androidx.datastore.preferences)
}
