# Chapter 1

![image](https://user-images.githubusercontent.com/91537105/151004976-fc10619d-62de-4caf-95d1-a3e23a36d6bf.png)


**Source Code: 'Getting Started Chapter 1'**

We will cover the following topics:
* Java basics: They are covered in the exam so lets not lose any marks over the basics!! 
* Main() Method
* Package Declarations and Imports
* Ordering Elements in a Class
* Code formatting on the exam
* Exam Questions relating to Chapter 1 Topics

## Java Environment 

The main components of Java are:

* JDK (Java Development Kit) contains the basics you need to develop programs.  
  * It includes a compiler (Javac) which converts the code into machine code
  * Launcher: which creates the VM (Virtual machine) and executes the program
  * Other tools include the archiver (jar) which can package files together and API Docs (javadoc) for generating documentation.
* The diagram below outlines the basic flow however, in a nutshell, the javac program converts the code into machine code known as byte code. The JVM is then launched prior to running the program. The JVM knows how to run the program based on the O/S

![image](https://user-images.githubusercontent.com/91537105/150993144-403dedd6-dfb1-4b72-8e24-70d899233678.png)

When developing Java applications there are also common pieces of functionality and alogorithms that developers need. These are built in to make writing code more efficient. There is a large suite of API's which developers can ulitise and prevent reinventing the wheel. Examples would be when working with strings: sorting, building, spliting etc.

Developers also utilise IDE's (Integrated development environments) such as IntelliJ to make writing code easier and more efficient.

## Benefits of Java (Asked in the Exam)
* **Object orientated:** As apposed to procedural. Code is defined in Classes which can be used to instantiate objects
* **Encapsulation:** A branch of OOP, Java supports access modifiers to protect data from unintended access and modification
* **Platform Independent:** Java is interpreted meaning it gets converted to byte code. The key benefit here is that a Java program only needs to be compiled once rather than needing to be recompiled for every O/S "Write Once, Run Everywhere". When running Java programs on different O/S's the same Class file runs everywhere
* **Robust:** Known for preventing data leaks by running it's own memory and cleans itself which results in fewer errors in programs.
* **Simple**
* **Secure**: Java programs runs within the JVM, this creates a sandbox which makes it hard for Java programs to go rougue and do things to the computer it runs on 
* **Multithreaded**: Allows for the running of multiple pieces of code
* **Backword Compatibility**: Every effort is made to ensure that older programs work on later versions of Java

## Understanding the Java Class Structure

Classes are the building blocks of any Java program. Objects are instantiated on the back of creating classes and inherit information from them. An object is essentially an instance of a class. There can be many Classes within a program and many more objects. All of the objects represent the current state of your program.

![image](https://user-images.githubusercontent.com/91537105/151005553-7102d1e6-3fb6-4347-86c6-28b0cf30193e.png)

### Fields and Methods 

Classes have two primary elements:
* Methods often known as procedures and functions in other languages
* Fields: more often known as variables 

Fields represents the state of the program and Methods operate on the state. There are other building blocks such as interfaces however, for now this pretty much make up a Java Class.

At the most basic level, a Java class looks like this:

``` Java
public class Animal {
}
```



