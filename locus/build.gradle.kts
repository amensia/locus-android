plugins {
    id("com.android.library")
    kotlin("android")
    id("maven-publish")
    id("kotlin-parcelize")
}

var group = "com.github.BirjuVachhani"

android {
    compileSdk = 31
    defaultConfig {
        minSdk = 16
        targetSdk = 31
    }
    buildTypes {
        getByName("release") {
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
        kotlinOptions {
            freeCompilerArgs = listOf("-Xjsr305=strict", "-progressive")
            jvmTarget = "1.8"
        }
//        jvmTarget = JavaVersion.VERSION_1_8.toString()
    }

    buildFeatures {
        buildConfig = false
    }

}

dependencies {
    compileOnly("androidx.appcompat:appcompat:1.4.0")
    compileOnly("com.google.android.material:material:1.5.0-alpha05")
    compileOnly("org.jetbrains.kotlin:kotlin-stdlib:1.5.31")
    compileOnly("com.google.android.gms:play-services-location:19.0.0")
    implementation("androidx.activity:activity-ktx:1.4.0")
}
