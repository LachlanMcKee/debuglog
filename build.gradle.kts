buildscript {
  extra["kotlin_plugin_id"] = "com.bnorm.debug.log.debuglog-plugin"
}

plugins {
  kotlin("jvm") version "1.4.21" apply false
  kotlin("multiplatform") version "1.4.21" apply false
  id("org.jetbrains.dokka") version "0.10.0" apply false
  id("com.gradle.plugin-publish") version "0.11.0" apply false
  id("com.github.gmazzo.buildconfig") version "2.0.2" apply false
  id("com.bnorm.power.kotlin-power-assert") version "0.6.1" apply false
}

allprojects {
  group = "com.bnorm.debug.log"
  version = "0.1.0-SNAPSHOT"
}

subprojects {
  repositories {
    mavenCentral()
    jcenter()
  }
}
