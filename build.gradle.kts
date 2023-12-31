plugins {
    id("java")
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation(group = "io.github.bonigarcia", name = "webdrivermanager", version = "5.3.1")
    implementation(group = "org.seleniumhq.selenium", name = "selenium-java", version = "4.8.1")
    implementation(group = "org.testng", name = "testng", version = "7.1.0")
    implementation("com.github.javafaker:javafaker:1.0.2")
    implementation(group = "ch.qos.logback", name = "logback-classic", version = "1.3.0-alpha8")
}

tasks.test {
    useJUnitPlatform()
}