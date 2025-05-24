plugins {
    kotlin("jvm") version "2.0.10"
    kotlin("plugin.serialization") version "2.0.10"
    id("io.ktor.plugin") version "3.1.2"
}

application {
    mainClass.set("com.immortalidiot.MainKt")
}

repositories {
    mavenCentral()
}

val ktorVersion = "3.1.2"
val kotlinxSerializationVersion = "1.6.3"

dependencies {
    implementation("io.ktor:ktor-server-netty:$ktorVersion")
    implementation("io.ktor:ktor-server-core:$ktorVersion")
    implementation("io.ktor:ktor-server-content-negotiation:$ktorVersion")
    implementation("io.ktor:ktor-serialization-kotlinx-json:$ktorVersion")
    implementation("org.jetbrains.kotlinx:kotlinx-serialization-json:$kotlinxSerializationVersion")
}
