plugins {
  java
  groovy
}

repositories {
  jcenter()
}

dependencies {

  // Use the latest Groovy version for Spock testing
  testImplementation("org.codehaus.groovy:groovy:2.5.11")
  testImplementation("org.slf4j:slf4j-api:1.7.30")

  // Use the awesome Spock testing and specification framework even with Java
  testImplementation("org.spockframework:spock-core:1.3-groovy-2.5")
  testImplementation("junit:junit:4.13")
  testRuntimeOnly("ch.qos.logback:logback-classic:1.2.3")
}

