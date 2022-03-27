plugins {
    kotlin("jvm") version "1.6.10"
}

group "com.daskju"
version "0.0.0"

repositories {
    mavenCentral()
    mavenCentral()
}

dependencies {
    implementation("org.apache.logging.log4j:log4j-api:2.17.2")
    implementation("org.apache.logging.log4j:log4j-core:2.17.2")
}