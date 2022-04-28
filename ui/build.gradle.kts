import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

apply(plugin = "org.jetbrains.kotlin.jvm")

repositories {
    mavenCentral()
}

plugins {
    application
    `java-library`
    id("org.openjfx.javafxplugin") version "0.0.12"
}

java {
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(17))
    }
}

javafx {
    version = "12"
    modules = listOf("javafx.controls")
}

val compileKotlin: KotlinCompile by tasks
val compileJava: JavaCompile by tasks
compileKotlin.destinationDirectory.set(compileJava.destinationDirectory)

application {
    mainClass.set("xyz.lcdev.aidev.chess.ui.Main")
    mainModule.set("xyz.lcdev.aidev.chess.ui")
}

dependencies {
    implementation("com.github.mouse0w0:darculafx:1.0.0")
}
