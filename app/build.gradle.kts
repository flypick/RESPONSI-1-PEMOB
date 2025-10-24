plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.kotlin.android)
}

android {
    namespace = "com.unsoed.responis1mobileh1d023037"
    compileSdk = 36

    defaultConfig {
        applicationId = "com.unsoed.responis1mobileh1d023037"
        minSdk = 24
        targetSdk = 36
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    // Di dalam android { ... }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
    kotlinOptions {
        jvmTarget = "17"
    }

    buildFeatures {
        viewBinding = true
    }
}

dependencies {
    // Gunakan versi dari version catalog jika ada (libs. ...)
    // Jika tidak, gunakan versi stabil secara langsung

    // CORE & UI
    implementation("androidx.core:core-ktx:1.17.0")
    implementation("androidx.appcompat:appcompat:1.7.1")
    implementation("com.google.android.material:material:1.13.0") // Hapus versi 1.12.0 dan gunakan satu versi ini saja
    implementation("androidx.constraintlayout:constraintlayout:2.2.1")
    implementation("androidx.activity:activity-ktx:1.11.0") // Gunakan activity-ktx versi 1.11.0 agar seragam
    implementation("androidx.lifecycle:lifecycle-viewmodel-ktx:2.9.4")
    implementation("androidx.databinding:viewbinding:8.13.0") // Sesuaikan dengan versi AGP Anda

    // RETROFIT (Ganti ke versi stabil 2.9.0)
    implementation("com.squareup.retrofit2:retrofit:2.9.0")
    implementation("com.squareup.retrofit2:converter-gson:2.9.0")
    implementation("com.squareup.okhttp3:logging-interceptor:4.12.0") // Versi yang kompatibel dengan Retrofit 2.9.0

    // GLIDE (Ganti ke versi stabil 4.16.0)
    implementation("com.github.bumptech.glide:glide:4.16.0")

    // TESTING (Biarkan seperti semula)
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.3.0")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.7.0")
}

