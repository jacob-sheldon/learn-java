# Maven

## Overview

Apache Maven is a software project management and comprehension tool that provides developers a complete build lifecycle framework. 

Based on the concept of a project object model (POM), Maven can **manage a project's build, reporting and documentation** from a central piece of information.

Maven provides developers ways to manage the following −

- Builds
- Documentation
- Reporting
- Dependencies
- SCMs
- Releases
- Distribution
- Mailing list

Maven plugins maintain much of the project management and build-related tasks.

| Item               | Default                       |
| ------------------ | ----------------------------- |
| source code        | ${basedir}/src/main/java      |
| Resources          | ${basedir}/src/main/resources |
| Tests              | ${basedir}/src/test           |
| Complied byte code | ${basedir}/target             |
| distributable JAR  | ${basedir}/target/classes     |

## POM

**POM stands for Project Object Model.**

It is an XML file that resides in the project's base directory as pom.xml.

The POM contains **information about the project and various configuration detail** used by Maven to build the project(s). POM also includes the **goals and plugins**. 

Some configurations can be specified in the POM file:

- project dependencies
- plugins
- goals
- build profiles
- project version
- developers
- mailing list

Projects notation in repository is **groupId:artifactId:version**.

```xml
<project xmlns = "http://maven.apache.org/POM/4.0.0"
   xmlns:xsi = "http://www.w3.org/2001/XMLSchema-instance"
   xsi:schemaLocation = "http://maven.apache.org/POM/4.0.0
   http://maven.apache.org/xsd/maven-4.0.0.xsd">
   <modelVersion>4.0.0</modelVersion>

   <groupId>com.companyname.project-group</groupId>
   <artifactId>project</artifactId>
   <version>1.0</version>
</project>
```

## SNAPSHOT

SNAPSHOT is a special version that *indicates a current development copy.* Unlike regular versions, Maven **checks for a new SNAPSHOT version in a remote repository for every build.**

##  Maven Commands

**Create project:** 

- `mvn archetype:generate`

- `mvn archetype:generate -DgroupId=com.companyname.bank -DartifactId=consumerBanking -DarchetypeArtifactId=maven-archetype-quickstart -DinteractiveMode=false`

**Build And Test**: `mvn clean package.  `   `mvn test`

**Project Document**:`mvn site`





## Reference

https://www.tutorialspoint.com/maven/maven_overview.htm