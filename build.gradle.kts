plugins {
    id("java")
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation("io.github.bonigarcia:webdrivermanager:5.3.1")
    implementation("org.seleniumhq.selenium:selenium-java:4.8.1")
    implementation("org.testng:testng:7.1.0")
    implementation("com.github.javafaker:javafaker:1.0.2")
    implementation("ch.qos.logback:logback-classic:1.3.0-alpha8")

    testImplementation("org.junit.jupiter:junit-jupiter-api:5.7.1")
    testImplementation("org.junit.jupiter:junit-jupiter-engine:5.7.1")
    testImplementation("io.qameta.allure:allure-junit5:2.10.0")
    testImplementation("io.qameta.allure:allure-java-commons:2.24.0")
}

tasks.test {
    useJUnitPlatform()
    finalizedBy("allureReport")
}

tasks.register("allureReport") {
    dependsOn("test")
    doLast {
        exec {
            commandLine = listOf(
                    "allure",
                    "generate", // Команда для генерации отчетов
                    "build/allure-results", // Папка с результатами тестов
                    "-o", "build/allure-report" // Папка для сохранения сгенерированных отчетов
            )
        }
    }
}
