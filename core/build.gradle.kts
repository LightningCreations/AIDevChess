import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

apply(plugin = "org.jetbrains.kotlin.jvm")

repositories {
    mavenCentral()
}

plugins {
    `java-library`
    id("org.javamodularity.moduleplugin") version "1.8.10" apply false
}

java {
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(18))
    }
}

val compileKotlin: KotlinCompile by tasks
val compileJava: JavaCompile by tasks
compileKotlin.destinationDirectory.set(compileJava.destinationDirectory)

dependencies {
    implementation("org.reflections:reflections:0.10.2")
}
