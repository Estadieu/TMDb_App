// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    alias(libs.plugins.android.application) apply false
    alias(libs.plugins.kotlin.android) apply false

    // pour hilt
    id("com.google.dagger.hilt.android") version "2.52" apply false
    //pour room
    id("androidx.room") version "2.6.1" apply false

}