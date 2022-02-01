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

Java contains two types of data: primative and reference. We state our types mainly for memory purposes for example using int would mean that Java allocates 32bits in memory.

### Primative Data Types

Java has eight primative data types. These represent the building blocks to java objects, they are essentially values held in memory either numerical or character

![image](https://user-images.githubusercontent.com/91537105/151787663-ffb883da-9de1-4434-bb87-205b62244cb1.png)

Remember, String is not a primative data type, it's an object. Java does have built in support for Strings literals and operators but they are objects.

* The float and double types are used for floating-point (decimal) values.
* A float requires the letter f following the number so Java knows it is a float.
* The byte, short, int, and long types are used for numbers without decimal points. In mathematics, these are all referred to as integral values, but in Java, int and Integer refer to specific types.
* Each numeric type uses twice as many bits as the smaller similar type. For example, short uses twice as many bits as byte does. 
* All of the numeric types are signed in Java. This means that they reserve one of their bits to cover a negative range. For example, byte ranges from -128 to 127. You might be surprised that the range is not -128 to 128. Don't forget, O needs to be accounted for too in the range.
* Signed and Unsigned: signed means it shares its value over both positive and negative numbers whereas unsigned range is strictly postive. This measn that unsigned can reach a higher positive value than signed.
* You won't be asked about the exact sizes of most of these types, although you should know that a byte can hold a value from -128 to 127.

### Writing literals 

There are a few more things you should know about numeric primitives. When a number is present in the code, it is called a literal. By default, Java assumes you are defining an int value with a numeric literal.

In the following example, the number listed is bigger than what fits in an int.
``` Java
long max = 3123456789; // DOES NOT COMPILE 
                       // By default, Java is setting this to an int and therefore it is out of range
                       // The solution is to specify it is a Long by adding an L
```
Solution:
``` Java
long max = 3123456789L; // DOES COMPILE 
                       // Java knows it is a long
```
### Literals and Underscore Character

To make reading long numbers easier, you have include underscores:

``` Java
int million1 = 1000000
int million2 = 1_000_000;
                           // You can't add at the start and the end 
                           // The goal is to make your code readable
```
### Reference Types

Reference types refer to an object. Unlike primative types that hold their memory where the variable is located, references do not hold the value of the object they refer to. Instead a reference "points" to an object by storing the memory address where the object is located 

Examples:

``` Java 
java.util.Date today;         // the today variable is a reference of type Date and can only point to the Date object
String greeting;              // the greeting variable is areference of type String and can only point to the String object       
``` 
![image](https://user-images.githubusercontent.com/91537105/151806494-218c2aa4-ffad-4310-8373-32927caec257.png)

### Distinguishing between Primative and Reference Types

There are a few important differences you should know between primitives and reference types:
* First, reference types can be assigned null, which means they do not currently refer to an object. Primitive types will give you a compiler error if you attempt to assign them null.
* In this example, value cannot point to null because it is of type int:
``` Java
int value = null; //  DOES NOT COMPILE
String s = null;
```
* But what if you don't know the value of an int and want to assign it to null? In that case, you should use a numeric wrapper class, such as Integer, instead of int.
* Next, reference types can be used to call methods, assuming the reference is not null.
* Primitives do not have methods declared on them. 
* ```int bad = len. length(); // DOES NOT COMPILE```
* Remember all primative data types start with a lower case, reference types start with an upper.

### Identifiers

An identifier is a name of a variable, method, class, interface or package. The following rules apply to identifiers:
1. Must begin with a letter, a $ symbol or a _ symbol
2. Can include numbers but start with them
3. Cannot be a single underscore
4. Cannot use a reserved word
5. 

The following are examples of legal identifiers:
``` Java
long okidentifier;                     // All of these are legal
float $0K2Identifier;
boolean _also0K1d3ntfifier;
char __SStill0KbutKnotsonice$;

                                       // Illegal Examples

int 3DPointClass;                      // Can't start with a number
byte hollywood@vine;                   // Can't use the @ symbol
String *$coffee;                       // Can't use the * symbol
double public;                         // Reserved word
short _ ;                              // single underscore not allowed
```
### Coding Conventions 

The two most popular conventions to ensure readable and consistent code are:

1. camelCase: Capitalising the first letter of every word:
``` Thisismyclass or ThisIsMyClass which one do you prefer? ```
2. snake_case: ```this_is_my_class```

### Declaring Multiple Variables 

You can declare multiple variables on one line. For example:
``` Java
void sandFence() {
String s1, s2;
String s3 = "yes", s4 = "no";       // There are 4 variables here. You can declare as many variables as you want on the same line so long they are of the same type
}
```
Remember the difference between declared and initialised as its common questions in exams:

``` Java
void paintFence {
int i1, i2, i3 = 0;                 // 3 variables are declared however only one is initialised and that is i3. the ',' marks the next declaration.
}
```

As far as conventions are concerned one declaration per statement and line is the way forward.

### Creating Local Variables

A local variable is a variable that is declared within a constructor, method or initialiser block. They do not have a default value and need to be initialised before use.

``` Java
public int notValid() {
   int y = 10;
   int x;
   int reply = x + y;               // does not compile as he have yet to intialised x
   return reply;
}

public int valid() {
   int y = 10;
   int x;                           // x is declared
   x = 3;                           // x is initialised
   int reply = x + y;               // x is now initialised so this will compile
   return reply;
}
```
### Constructor or Method Parameters

Variables passed to a contructor or method are called constructor parameters or method parameters. These parameters are local variables that have been pre initialised. The rules around the two are the same.

### Instance and Class Variables

Variables that are not defined locally are either an instance variables or class variables.

Instance variables, also known as fields is a value defined within a specific instance of an object For example within a class Person, you could have a field called name of the type String. Each instance of that object will have a different value within that field ie a different name. Two instances could have the same value but changing one will not affect the other. 

Class variables on the other hand is one that is defined on the class level and shared among all instances of the class and can even be accessible to other classes. In the previous example above we could use a class variable to represent the list of people at the zoo today.

* You can tell its a class variable because it has the word static before it.
* You don't need to initialise them as they are given a default value 

### Introducing Var

From Java 10 onwards you have the ability to use the term Var instead of the data type in some certain situations. For example:

``` Java
public void whatTypeAmI() {
var name = "Hello";
var size = 7;
}
```

The formal name for this feature is local variable type inference and as the name suggests, can only be used in local variables. the second part type inference means that when assigning var, we are asking the compiler to make this decision for us. For example:

``` Java 
public void example() {
   var number = 7;         // Compiler assigns int as the type
   number = 5;             // No problem here and the variable will be changed to 5
   number = "five"         // Will not compile. The compiler has already assigned number to type int. Trying to assign the word five causes problems here
                           // as it would be the equivalent of trying to assign a word to the type int
}
```

Taking the example above, say we first declare a short for 7 and then byte for 5. Despite setting it to byte, it will remain a short, why? because short is larger then byte. Java has no problem promoting as there are no memory concerns. Java however does not allow demoting as this can cause memory loss. 

Note that when declaring vars, for it to compile successfully, you need to initialise the variable on the same line. You cannot assign null either to var as Java wouldn't know what data type to assign. The only way around this rule is if you declare it first and then assign null on a different line, this however would only work with String as primitive data types cannot be assigned null.

#### Review of var Rules

Here's a quick review of the var rules:
1. A var is used as a local variable in a constructor, method, or initializer block.
2. A var cannot be used in constructor parameters, method parameters, instance variables, or class variables.
3. A var is always initialized on the same line (or statement) where it is declared.
4. The value of a var can change, but the type cannot.
5. A var cannot be initialized with a null value without a type.
6. A var is not permitted in a multiple-variable declaration.
7. A var is a reserved type name but not a reserved word, meaning it can be used as an
identifier except as a class, interface, or enum name.

## Managing Variable Scope

In Java, variables are only accessible inside the region they are created. This is called scope.

Local variables can never have a scope larger than the method they are defined in however they can have a larger scope. The following example illustrates how scope works:

``` Java
public void eatIfHungry(boolean hungry) {
   if (hungry) {
      int bitesOfCheese = 1;
   } // bitesOfCheese goes out of scope here
   System.out.println(bitesOfCheese);           // DOES NOT COMPILE: the variable bitesOfCheese is declared within the if statement. 
}
```

In the above example, the variable hungry has a scope of the entire method, while the variable bitesOfCheese has a smaller scope as it is declared inside of the if statement. Looking where the curly braces lie tells you where the code block starts and ends and where the variables are declared. 

### Nesting Scope

Remember that blocks often contain other blocks, the smaller contained blocks can reference the larger blocks but not vice versa

``` Java
public void eatIfHungry(boolean hungry) {
   if (hungry) {
      int bitesOfCheese = 1;
      {
         var teenyBit = true;
         System.out.println(bitesOfCheese);     // This Compiles as a smaller block can reference a variable from a larger block
      }
   }
   System.out.println(bitesOfCheese);           // DOES NOT COMPILE: Larger blocks can't reference smaller blocks due to limiting scope
}
```
This is a very common question in exams so the following example is a little harder. The best approach to follow is 1: Identify the Blocks of code 2: Identify the Scope and where they start and end:

``` Java

public void eatMore(boolean hungry, int amountOfFood) {        // Variables hungry and amountOfFood are method paramters so they are available across the whole method
   int roomInBelly = 5;                                        // Declared at method level and therefore remains in scope throughout
   if (hungry) {
      var timeToEat = true;                                    // timeToEat is declared within the if statement and is only available between lines 4 - 10
      while (amountOfFood > 0) {
         amountEaten = 2;                                      // amountEaten is available between lines 6 -10
         roomInBelly = roomInBelly - amountEaten;
         amountOfFood = amountOfFood - amountEaten;
      }
   }
   System.out.println(amountOfFood);                           // This compiles as the variable amountOfFood is declared as a method parameter

}
```
## Applying Scope to Classes

So far we have only discussed scope in the context of local variables. Instance variables are more straightforward, they are available as soon as they are defined and last the entire lifetime of the object itself.

The rules around class aka static is even more straight forward, they go into scope when they are declared and stay in scope for the lifetime of the program. They have the term static before them for example ``` static int MAX_LENGTH = 5; ```

### Reviewing Scope

1. Local Variables: In scope from declaration to the end of the block
2. Instance Variables: In scope from declaration until the object is eligible for garbage collection
3. Class Variable: In scope from declaration until program ends

## Destroying Objects

JVM automatically takes care of removing objects and has a built in garbage collector which looks for objects that are no longer needed. All objecs are stores in your program memory heap also known as the free store which represents a large pool of unused memory allocated to the Java application. While memory has become less of an issue with modern computing eventually you will run out of memory if there isn't a process of removing unwanted or used objects. 

Eligible for garbage collection refers to an objects state of no longer being accessible in a program and therefore able to be garbage collected. Once it is eligible, it isn't necessarily discarded immediately, the developer has no control as to when the JVM wil perfrom the task other than knowing it is the JVM's responsibility to carry the task out.There are languages such as C where the developer must ensure garbage collection  is factored into their code otherwise a whole host of issues could occur such as security issues (think credit card details) or running out of memory. 

### Calling System.gc()

Java has the following built in method to help support garbage collection:

``` Java
public static void main(String[] args){
   System.gc();                           // It doesn't do much other then suggest to the JVM to begin garbage collection. It doesn't guarantee that the JVM garbage collection
}                                         // will kick in, in fact the JVM is entitled to ignore the request if it's busy doing something
```

The key thing to take away here is that garbage collection is not in the developers control and it's the JVM's responsibility to carry out this action. The other key thing we need to identify is when objects become eligble for garbage collection.

### Tracing Eligibility 

So, if we don't control it how does it work? The JVM monitors each object until it determines that the code no longer needs that memory. An object will remaind on the heap until it is no longer reachable. An object is no longer reachable when one of two siutaions occurs:

1. The object no longer has any references pointing to it
2. All references to the object have gone out of scope

## Summary

Summary
In this chapter, we described the building blocks of Java--most important, what a Java object is, how it is referenced and used, and how it is destroyed. 

* To begin with, constructors create Java objects. A constructor is a method matching the class name and omitting the return type. When an object is instantiated, fields and blocks of code are initialized first. Then the constructor is run.
* Primitive types are the basic building blocks of Java types. They are assembled into reference types.
* Reference types can have methods and be assigned to null.
* Numeric literals are allowed to contain underscores (_) as long as they do not start or end the literal and are not next to a decimal point (.)
* Declaring a variable involves stating the data type and giving the variable a name.
* Variables that represent fields in a class are automatically initialized to their corresponding 0, null, or false values during object instantiation.
* Local variables must be specifically initialized before they can be used.
* Identifiers may contain letters, numbers, $, or _. Identifiers may not begin with numbers. Local variables may use the var keyword instead of the actual type. When using var, the type is set once at compile time and does not change.
* Scope refers to that portion of code where a variable can be accessed. There are three kinds of variables in Java, depending on their scope: instance variables, class vari-
ables, and local variables.
  * Instance variables are the non-static fields of your class.
  * Class variables are the static fields within a class.
  * Local variables are declared within a constructor, method, or initializer block.
* Garbage collection is responsible for removing objects from memory when they can never be used again. An object becomes eligible for garbage collection when there are no more references to it or its references have all gone out of scope.

## Exam Tips

* Be able to recognize a constructor. A constructor has the same name as the class. It looks like a method without a return type.

* Be able to identify legal and illegal declarations and initialization.
  *  Multiple variables can be declared and initialized in the same statement when they share a type.
  *  Local variables require an explicit initialization; others use the default value for that type.
  *  Identifiers may contain letters, numbers, $, or_, although they may not begin with numbers.
  *  Also, you cannot define an identifier that is just a single underscore character _.
  *  Numeric literals may contain underscores between two digits, such as 1_000, but not in other places, such as -180_. 0_.
  *  Numeric literals can begin with 1-9, 0, ex, OX, ob, and OB, with the latter four indicating a change of numeric base.

* Be able to use var correctly. A var is used for a local variable inside a constructor, a method, or an initializer block.
  * It cannot be used for constructor parameters, method parameters, instance variables, or class variables.
  * A var is initialized on the same line where it is declared, and while it can change value, it cannot change type.
  * A var cannot be initialized with a null value without a type, nor can it be used in multiple variable declara tions.
  * Finally, var is not a reserved word in Java and can be used as a variable name.

* Be able to determine where variables go into and out of scope. All variables go into scope when they are declared.
  * Local variables go out of scope when the block they are declared in ends.
  * Instance variables go out of scope when the object is eligible for garbage collection.
  * Class variables remain in scope as long as the program is running.
  
* Know how to identify when an object is eligible for garbage collection. Draw a diagram to keep track of references and objects as you trace the code. When no arrows point to a box (object), it is eligible for garbage collection.

