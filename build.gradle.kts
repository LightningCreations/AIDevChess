repositories {
    mavenCentral()
}

plugins {
    application
    kotlin("jvm") version "1.6.21"
    id("org.openjfx.javafxplugin") version "0.0.12"
}

dependencies {
    implementation("org.reflections:reflections:0.10.2")
}

javafx {
    version = "12"
    modules = listOf("javafx.controls")
}

application {
    mainClassName = "xyz.lcdev.aidev.chess.ui.MainKt"
}
