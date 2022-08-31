# JNDI

## What is JNDI

The Java Naming and Directory Interface (JNDI) is an application programming interface (API) that **provides naming and directory functionality** to applications written using the Java programming language.

It is defined to be **independent of any specific directory service implementation**.

**JNDI is included in the Java SE Platform.**

- Naming service - provides a mechanism to name objects and to retrieve objects by name.

## Architecture

The JNDI architecture consists of an API and a service provider interface (SPI). 

Java applications use the JNDI API to access various naming and directory services.

The SPI enables a variety of naming and directory services to be plugged in transparently, thereby allowing the Java application using the JNDI API to access its services.

![JNDI Architecture](jndiarch.gif)

- LDAP: Lightweight Directory Access Protocol.
- CORBA - Common Object Request Broker Architecture
- RMI - Java Remote Method Invocation Registry
- DNS - Domain Name Service 



## References

[ORACLE](https://docs.oracle.com/javase/tutorial/jndi/overview/index.html)

