# Java Build Automation Tools

## Ant
In the beginning, Java used `Make` as the only build automation tool. However, a lot of conventions from C programs didn't fit in the Java ecosystem, so in time Ant took over as a better alternative.

**Apache Ant (Another Neat Tool) is a Java used for automating build processes for Java application.**

> Apache Ant is a Java library and command-line tool that help building software.

Ant build files are written in XML, and by convention, they're called *build.xml*. Different phases of a build process are called "targets".

**Ant doesn't impose any coding conventions or project structures**. Consequently, this means that **Ant requires developers to write all the commands by themselves**, while sometimes leads to **huge XML files** that are hard to maintain.

In the past years, Apache Ant had no build-in support for dependency management. Afterwards, Apache Ivy was developed as a sub-project of the Apache Ant, is a tool to manage project dependency.

## Gradle

Gradle is a dependency management and a build automation tool that was built upon the concepts of Ant and Maven.

**Gradle is that it's not using XML files**, unlike Ant or Maven.

Gradle's configuration file is by convention called *build.gradle* in Groovy, or *build.gradle.kts* in Kotlin.

# Reference

[Ant vs Maven vs Gradle](https://www.baeldung.com/ant-maven-gradle)