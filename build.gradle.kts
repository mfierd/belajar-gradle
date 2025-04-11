plugins {
    id("java")
}

group = "org.fierd"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.10.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")
}

tasks.test {
    useJUnitPlatform()
}

tasks.register("greetingTask") {
    doLast {
        val username = if (project.hasProperty("username")) project.property("username") else "Tanpa Nama"
        println("Halo, $username! Welcome to Gradle World!")
    }
}

// agak berbeda dengan yg ada pada module pelajaran karena saya memakai versi Kotlin,
// sedangkan pada tutorial sepertinya menggunakan groovy
// saya menggunakan proprety "username" karena sepertinya ada yg bertabrakan jika menggunakan "name"