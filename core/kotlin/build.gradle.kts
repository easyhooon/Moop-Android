plugins {
    id("moop.android.library")
    id("moop.android.hilt")
}

android {
    namespace = "soup.movie.common"
}

dependencies {
    implementation(libs.coroutines.android)
}
