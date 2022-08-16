# What is Java
## Why to Learn java
  - Object Oriented
  - Platform Independent
  - Simple
  - Secure
  - Architecture-neutral
  - Portable
  - Robust
## Hello, Java
    public class MyFirstJavaProgram {
        /* This is my first java program.
        * This will print 'Hello World' as the output
        */

        public static void main(String []args) {
            System.out.println("Hello World"); // prints Hello World
        }
    }
## History Of Java

- James Gosling initialed Java in 1991, Named Oak.
- Sun released Java 1.0 at 1995. It promised Java is guaranteed to be **Write Once, Run Anywhere.**

## Environment Setup

### Windows
- Download JavaSE in [This Page](https://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html)
- Run .exe file and complete installation
- Setup Environment Variable (Assuming you have installed java in _c:\Program Files\java\jdk_ directory)
  - Right click on 'My computer' and select 'Properties'
  - Click the 'Environment variables' button under the 'Advanced' tab
  - Now, alter the 'path' variable. If the path is 'C:\WINDOWS\SYSTEM32',
    it should be changed to 'C:\WINDOWS\SYSTEM32;c:\Program Files\java\jdk\bin'.

## Basic Syntax

### Several important concepts
- Object
- Class
- Method
- Instance Variable

### Name Rules
- Case Sensitively - 'hello' is different with 'Hello'
- Class Name - First letter should be uppercase, the first letter of other words in class name also should be Upper case
- Method Name - First letter should be lower case, the first letter of other words in method name should be upper case.
- Program File Name - The file name should equal to public class name in the file, if there is no public class, the file name can be anything.
- public static void main(String args[]) - Java program entry point, can't be changed.

### Modifiers
- Access Modifiers - default, public, protected and private
- Non-access Modifiers - final, abstract, strictfp

### Variables, Arrays, Enums, Keywords, Inheritance, Interfaces

### Java OO
- Polymorphism
- Inheritance
- Encapsulation
- Abstraction
- Classes
- Objects
- Instance
- Method
- Message Passing