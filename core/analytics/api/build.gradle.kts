plugins {
    id("moop.android.library")
}

android {
    namespace = "soup.movie.core.analytics"
}

dependencies {
    implementation(project(":core:kotlin"))
    implementation(libs.kotlin.stdlib)
}
