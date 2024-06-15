plugins {
    alias(libs.plugins.android.application)
    id("com.google.gms.google-services")
}

android {
    namespace = "com.test.setupfragmentforsearchandformupload"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.test.setupfragmentforsearchandformupload"
        minSdk = 28
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
}

dependencies {

    implementation(libs.appcompat)
    implementation(libs.material)
    implementation(libs.activity)
    implementation(libs.constraintlayout)
    testImplementation(libs.junit)
    androidTestImplementation(libs.ext.junit)
    androidTestImplementation(libs.espresso.core)
    implementation("androidx.media3:media3-session:1.3.1")
    implementation("androidx.media:media:1.7.0")
    implementation("androidx.media3:media3-ui:1.3.1")
    implementation ("androidx.core:core:1.9.0")
    implementation ("com.squareup.picasso:picasso:2.71828")
    // https://mvnrepository.com/artifact/com.google.code.gson/gson
    implementation ("com.google.code.gson:gson:2.11.0")
    implementation(platform("com.google.firebase:firebase-bom:33.1.0"))
    implementation("com.google.firebase:firebase-database")
    implementation("com.google.firebase:firebase-storage")
    implementation ("com.google.firebase:firebase-analytics:20.0.0")
}