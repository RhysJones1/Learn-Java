# Chapter 2: Java Building Blocks     

![image](https://user-images.githubusercontent.com/91537105/151004976-fc10619d-62de-4caf-95d1-a3e23a36d6bf.png)

## Learning Objectives

* Creating Objects
* Understanding Data Types
    * Primative
    * Reference
    * Distinguishing between the two
* Declaring Variables 
* Initialising Variables 
* Managing Variable Scope
* Destroying Objects

## Creating Objects 

As we have seen already, objects are instances of a Class. Here we will discuss: constructors, object fields, instance initialisers, and the order in which values are initialised.

To create an instance, you simply add new in front of the class name, for example:

``` Java
Zoo animals = new Zoo();
```

Here, we start with Zoo which declares the type so i this case we are creating an object from the type Zoo. Then we have a variable name where we used animals this provides a program to store a reference to that object. Then we finish by writing new Zoo() which creates the object. Remember that Zoo() represents a special type method known as a constructor. 

* Note: The name of the constructor matches the name of the class and there is no return type. Things like this may come up on the exam. For example:

``` Java
public class Chick {
   public void Chick() {} // This is not a constructor
// When you see a method name starting with a capital and stating a return type it is not a contructor
}
```

The purpose of a contructor is to initialise fields. You can either do this at class level or within the constructor. For example:

``` Java
public class Chicken {
   int numEggs = 12;       //Initialise on the line under class
   String name;
   public Chicken() {
      name = "Duke";       // Initialise in the constructor
                           // Both approaches are valid
   }

}
```

In a lot of cases, you don't have to code a constructor, this will be done by default. However in chapter 8, you wil see that there are instances when you may want to. 

### Reading and Writing Member Fields 

It's possible to read and write instance variables directly from the caller. For example:

``` Java 
public class Swan {
   int numberEggs;                           // Instance Variable
   public static void main(String[] args){
      Swan mother = new Swan();
      mother.numberEggs = 1;                 // Set/Write variable  
      System.out.println(mother.numberEggs); // Read/Getting variable
   }
}
```

In this example above, he "caller" is the main() method which could be in the same class or another class

You can also also read/write already initialised fields. For example:

``` Java
public class Name {
   String first = "Rhys";           // Write/Setting variable
   String last = "Jones";           // Write/Setting variable
   String full = first + last;      // Both Writing and Reading variable
   }
```

### Executing Instance Initialiser Blocks

Key thing to note her eis the balanced parentheses problem where for every opening bracket, there needs to be a closing bracket. 

### Order of initialisation

When writing code, it's important to consider the order of initialisation which dictates the order in which methods, constructors or blocks are called when an instance of a class is created.

For now, the key rules are:

* Fields and instance initialiser blocks are run in the order in which they appear in the file
* The constructoer runs after all the fields and initialiser blocks have run

Here's an example:

``` Java
public class Chick {
   private String name = "Fluffy"               // 3: Java first initialises it to "Fluffy"
   { System.out.println("Setting Field"); }     // 4: Next it executes this print statement within the instance intitialiser 
   public Chick() {
   name = "Tiny";                               // 5: Next the program turns to the constructor and changes name to "Tiny"
   System.out.println("Setting Constructor");   // 6: The program then executes the following print statement 
   }
   public static void main(String[] args) {     // 1: We start with the main() method as that's where a Java program starts
   Chick chick = new Chick();                   // 2: We call the construcotr of Chick and creates the new object
   System.out.println(chick.name);              // 7: Finally, the constructor is done and the program moves back into the main method and executes the print statement
   }
}

Output:

setting field
setting constructor
Tiny

```

## Data Types

