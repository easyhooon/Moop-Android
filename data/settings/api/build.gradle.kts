plugins {
    id("kotlin")
}

dependencies {
    implementation(project(":data:model"))
    implementation(libs.kotlin.stdlib)
    implementation(libs.coroutines.core)
}
