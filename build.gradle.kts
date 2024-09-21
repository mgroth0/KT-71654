plugins {
    kotlin("multiplatform") version  "2.0.20"
}

repositories {
    mavenCentral()
}

kotlin {
    macosArm64 {
        binaries.sharedLib()
    }
}