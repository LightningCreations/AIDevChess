repositories {
    mavenCentral()
}

plugins {
    application
    kotlin("jvm") version "1.6.21"
}

dependencies {
    implementation("org.reflections:reflections:0.10.2")
}

application {
    mainClassName = "xyz.lcdev.aidev.chess.ui.MainKt"
}
