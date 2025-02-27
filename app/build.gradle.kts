plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.kotlin.android)
    id("com.google.gms.google-services")
}

android {
    namespace = "com.example.appadotejrtlrf"
    compileSdk = 35

    defaultConfig {
        applicationId = "com.example.appadotejrtlrf"
        minSdk = 24
        targetSdk = 35
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
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
    buildFeatures {
        viewBinding = true
    }
}

dependencies {
    // -- Dependencias Firebase --
    implementation(platform("com.google.firebase:firebase-bom:33.9.0")) // Firebase BoM
    implementation("com.google.firebase:firebase-analytics") // Analytics
    implementation("com.google.firebase:firebase-auth") // Autenticacao
    implementation("com.google.firebase:firebase-firestore") // Banco de dados
    implementation("com.google.firebase:firebase-storage") // Armazenamento de Imagens
    // -- Fim Dependencias Firebase --

    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)
    implementation(libs.androidx.activity)
    implementation(libs.androidx.constraintlayout)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
}