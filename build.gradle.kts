plugins {
    // Поддержка запуска из командной строки
    application
    id("com.github.ben-manes.versions") version "0.51.0"
}

repositories {
    // Подключаем автоматическая работа с репозиторием Maven Central
    mavenCentral()
}

// Для плагина application указываем главный класс приложения
application {
    // Входная точка
    mainClass.set("io.hexlet.example.App")
}

dependencies {
    // https://mvnrepository.com/artifact/org.apache.commons/commons-lang3
    implementation("org.apache.commons:commons-lang3:3.16.0")
}