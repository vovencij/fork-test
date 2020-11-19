plugins {
  java
  groovy
}

repositories {
  jcenter()
}

dependencies {

  // Use the latest Groovy version for Spock testing
  testImplementation("org.codehaus.groovy:groovy-all:2.5.11")
  testImplementation("com.github.docker-java:docker-java-core:3.2.5")
  testImplementation("com.github.docker-java:docker-java-transport-httpclient5:3.2.5")

  // Use the awesome Spock testing and specification framework even with Java
  testImplementation("org.spockframework:spock-core:1.3-groovy-2.5")
  testImplementation("junit:junit:4.13")
  testRuntimeOnly("ch.qos.logback:logback-classic:1.2.3")
}

