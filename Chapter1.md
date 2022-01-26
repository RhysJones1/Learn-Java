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
class is a key word meaning you can't define a variable with the word class. Public is an access modifier which tells us whether the class can be used elsewhere or in one place (private)

Let's stick with the above class and build on it by adding a field within the class:

``` Java
public class Animal{
 String name;

}
```

Here we have added a field called name of the type String. Let's add a method:

``` Java
public class Animal{
 String name;
 public String getName(){
  return name;
  }
  public void setName(String newName){
   name = newName;
  
 }

}
```
While the above is very basic, there are some key fundamentals here which regardless of how complex your program becomes they remain applicable:

* Methods can be called and change the state of the program. Sometimes these changes are stored as variables
* public is the access modifer which tells us that this method can be called from other classes
* We define the return type which in this case is of the type String
* In some cases, we don't want to return anything and in these situations, we use 'void' which returns no value
* Within the second method, in brackets we have specified that information is required when calling the method (getName) and this is known as a parameter. 
* The method name and parameter types is known as the method signature 
* The method declaration goes further and includes additonal information such as the return type.
* The file name must match the name of the class. In this case our file name would need to be called Animal.java otherwise, it won't compile. We also need a main() Method to complile which is covered next.

## main() Method

A Jave program begins execution with its main() Method, without it your code won't work. The main() method in effect is the gateway between the JVM and your program, the main() methods lets the JVM call your code. At the most basic level a main method looks like this:

``` Java
public class Zoo {
 public static void main(String[] args){
 }
}
```

The code doesn't do much here other than declare the entry point for your program to work.

Terminology of the main() Method:
* public: We've covered this but to clarify this is our access modifier and declares the method level of exposure. As it's public this means anywhere in the program
* static: binds a method to it's class so it can be called by just the class name. So with Zoo, we can call Zoo.main() rather than create an object. As we've discussed already, without the main() method when you try and run the program, the computer will say no!
* void: specifies the return type in this case void returns no data.
  * It's good practice to use void for methods that change the state of an object. With main() we are changing the program from start to finish
* main() parameter list: args hints that this list contains values that were read in arguments when the JVM started. [] represents an array

## Passing Parameters to a Java Program

You can send data to your programs main methods by doing the following:

``` Java
public class Zoo{
 public static void main(String[] args){
  System.out.println(args[0]);
  System.out.println(args[1]);
 }

}
```
At cmd:
```
javac Zoo.java
java Zoo London Bristol
```
Output:
```
London
Bristol
```

## Package Declarations and Imports

Java has thousands of built in classes which are stored in packages. In order to use one of the built in classes, you need to tell the program, otherwise you get an error:

``` Java
public class ImportExample {
 public static void main(String[] args){
  Random r = new Random(); // DOES NOT COMPILE: Missing an import therefore the program doesn't know where to look
  System.out.println(r.nextInt(10));
 }
}
```
Let's add the import:
``` Java
import java.util.Random; // Imports the random class
public class ImportExample {
 public static void main(String[] args){
  Random r = new Random(); 
  System.out.println(r.nextInt(10));
 }
}
```
Now the code runs, we have a simple program that prints a random number between 0-9. The import statement tells compiler which package to look in to find the class.

## Wildcards

Classes in the same package are often imported together, you can use this shortcut by writing:

``` Java
import java.util.*; // Imports the random class amongst other things
public class ImportExample {
 public static void main(String[] args){
  Random r = new Random(); 
  System.out.println(r.nextInt(10));
 }
}
```
Here the * is the wildcard that matches all the classes in the package and makes them all available. If the program uses another class within java.util such as Scanner, then no further imports would be required.

Check with your team to see if there are coding conventions when it comes to importing packages.

## Redundant Imports

There are some imports that are done automatically, notice that we've used System in the above code and it hasn't raised an error. This is because of an automatic import called ```import java.lang.*``` You can add it to the top of your code but you don't need to, hense why we call it redundant. Another time something is considered redundant is when we import a package twice for example ```import java.util*``` and then adding ```import java.util.Random```

Here's another example of correctly using imports:

``` Java
import java.nio.file.*; // Option 1: wildcard import
// Option 2: Import both classes explicitly
// import java.nio.file.Files;
//import java.nio.file.Paths;
public class InputImports{
 public void read(Files files){
  Paths.get("name");
 }

}
```

## Naming Conflicts

There are instances where you want to import a Class that can be found in multiple places. Take the Date class as an example, this can be found in ``` import java.util.Date``` and ``` import java.sql.Date```. We could also use ``` import java.util.*``` as we have seen above. The problem comes in this situation below:

``` Java
import java.util.*;
import java.slq.*;
public class Conflicts {
 Date date;
  // some more code

}
```
The following will return a compiler error ```error: reference to Date is ambiguous```. In this example we would simple remove java.sql.* and the issue would be resolved, but what if we need to import a class from this package? To overcome this we outline java.util explicitly:

``` Java
import java.util.Date;
import java.slq.*;
public class Conflicts {
 Date date;
  // some more code

}
```

If you import a package explicitly, this takes precedence over wildcards. So our first import above takes precedence over our second import as it includes a wildcard.

In our example above, if we were to explicitly import the two like: ```import java.util.Date;``` and ```import java.slq.Date;``` We will be back to square one and recieve the same error message ```error: reference to Date is ambiguous```.

If you really needed the two, then you can import one and use the others fully qualified Class name to show it's special. For example:

``` Java
import java.util.Date;
public class Conflicts {
 Date date;
 java.sql.Date sqlDate;

}
```
Or, you could import neither and add java.util.date within the code:

``` Java
public class Conflicts {
 java.util.Date date
 java.sql.Date sqlDate;

}
```

## Creating a New Package

You can also import your own package. Take a look at the source code 'Getting started' which shows lots of examples of importing your own packages.

