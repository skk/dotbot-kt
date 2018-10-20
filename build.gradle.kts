import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "1.2.71"
    id("org.jmailen.kotlinter") version "1.20.1"
}

group = "stevenknight"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}


dependencies {
    compile(kotlin("stdlib-jdk8"))
    compile(group = "com.xenomachina", name = "kotlin-argparser", version = "2.0.7")
}


tasks.withType<KotlinCompile> {
    kotlinOptions.jvmTarget = "1.8"
}