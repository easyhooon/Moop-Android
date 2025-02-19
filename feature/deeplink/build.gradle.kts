plugins {
    id("moop.android.library")
}

android {
    namespace = "soup.movie.feature.deeplink"
}

dependencies {
    implementation(project(":core:logger"))

    implementation(libs.kotlin.stdlib)

    implementation(platform(libs.firebase.bom))
    implementation(libs.firebase.dynamiclinks)

    implementation(libs.kakao.share)
}
