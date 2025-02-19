plugins {
    id("moop.android.library")
    id("moop.android.hilt")
}

android {
    namespace = "soup.movie.testing"
}

dependencies {
    implementation(project(":core:kotlin"))
    implementation(project(":data:model"))
    implementation(project(":data:repository:api"))

    implementation(libs.kotlin.stdlib)
    api(libs.coroutines.test)

    api(libs.dagger.hilt.testing)

    api(libs.test.junit)
    api(libs.androidx.test.core)
    api(libs.androidx.test.rules)
    api(libs.androidx.test.runner)
    api(libs.androidx.test.espresso)
}
