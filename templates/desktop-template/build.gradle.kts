import org.jetbrains.compose.compose

plugins {
    kotlin("jvm") version "1.4.0"
    id("org.jetbrains.compose") version (System.getenv("COMPOSE_TEMPLATE_COMPOSE_VERSION") ?: "0.1.0-dev85")
    application
}

repositories {
    jcenter()
    maven("https://maven.pkg.jetbrains.space/public/p/compose/dev")
}

dependencies {
    implementation(compose.desktop.all)
}

application {
    mainClassName = "MainKt"
}