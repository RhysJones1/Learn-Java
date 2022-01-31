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
   int numEggs = 12; //Initialise on the line under class
   String name;
   public Chicken() {
      name = "Duke"; // Initialise in the constructor
   // Both approaches are valid
   }

}
```

In a lot of cases, you don't have to code a constructor, this will be done by default. However in chapter 8, you wil see that there are instances when you may want to. 

### Reading and Writing Member Fields 

