plugins {
    java
    id("org.springframework.boot") version "3.1.5"
    id("io.spring.dependency-management") version "1.1.3"
}

group = "io.amplicode"
version = "0.0.1-SNAPSHOT"

java {
    sourceCompatibility = JavaVersion.VERSION_17
}

repositories {
    mavenCentral()
}

extra["springCloudVersion"] = "2022.0.4"
dependencies {
    implementation("org.springframework.boot:spring-boot-starter")
    testImplementation("org.springframework.boot:spring-boot-starter-test")
    implementation("org.springframework.boot:spring-boot-starter-data-jpa")
    runtimeOnly("org.postgresql:postgresql")
    implementation("org.springframework.boot:spring-boot-starter-data-mongodb")
    implementation("org.springframework.boot:spring-boot-starter-security")
    implementation("org.springframework.boot:spring-boot-starter-web")
    implementation("org.springframework.cloud:spring-cloud-starter-config")
    implementation("org.springframework.cloud:spring-cloud-config-server")
    implementation("org.springframework.boot:spring-boot-starter-actuator")
    implementation("io.micrometer:micrometer-tracing")
    implementation("io.micrometer:micrometer-tracing-bridge-brave")
    implementation("io.zipkin.reporter2:zipkin-reporter-brave")
    implementation("org.springframework.cloud:spring-cloud-stream")
    implementation("org.springframework.cloud:spring-cloud-starter-stream-kafka")
    implementation("org.springframework.boot:spring-boot-starter-oauth2-resource-server")
    implementation("org.springframework.boot:spring-boot-starter-oauth2-authorization-server")
    implementation("org.springframework.security:spring-security-ldap")
    implementation("org.liquibase:liquibase-core")
    implementation("org.flywaydb:flyway-core")
    compileOnly("org.projectlombok:lombok:1.18.24")
    annotationProcessor("org.projectlombok:lombok:1.18.24")
    compileOnly("org.mapstruct:mapstruct:1.5.3.Final")
    annotationProcessor("org.mapstruct:mapstruct-processor:1.5.3.Final")
    annotationProcessor("org.projectlombok:lombok-mapstruct-binding:0.2.0")
    implementation("org.modelmapper:modelmapper:3.1.1")
    implementation("org.springframework.data:spring-data-envers")
    implementation("io.hypersistence:hypersistence-utils-hibernate-60:3.1.1")
    implementation("com.blazebit:blaze-persistence-core-api-jakarta:1.6.9")
    runtimeOnly("com.blazebit:blaze-persistence-core-impl-jakarta:1.6.9")
    implementation("com.blazebit:blaze-persistence-entity-view-api-jakarta:1.6.9")
    runtimeOnly("com.blazebit:blaze-persistence-entity-view-impl-jakarta:1.6.9")
    runtimeOnly("com.blazebit:blaze-persistence-entity-view-processor-jakarta:1.6.9")
    runtimeOnly("com.blazebit:blaze-persistence-integration-hibernate-6.2:1.6.9")
    runtimeOnly("com.blazebit:blaze-persistence-integration-entity-view-spring-6.0:1.6.9")
    implementation("com.blazebit:blaze-persistence-integration-spring-data-3.1:1.6.9")
    testImplementation("org.springframework.security:spring-security-test")
}

tasks.withType<Test> {
    useJUnitPlatform()
}
dependencyManagement {
    imports {
        mavenBom("org.springframework.cloud:spring-cloud-dependencies:${property("springCloudVersion")}")
    }
}