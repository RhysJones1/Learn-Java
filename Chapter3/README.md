# Chapter 3: Operators     

![image](https://user-images.githubusercontent.com/91537105/151004976-fc10619d-62de-4caf-95d1-a3e23a36d6bf.png)

## Learning Objectives

* Using Operators and Decision Constructs
  * Use Java operators and the use of parethese to override operator presedence
  
* Working with Java Primiative Data Types and String API's
  * Declare and initialise variables (including castinf and promoting primative data types)   

## Terminology 

* Operator in Java is a symbol that is used to perform operations. For example: +, -, '* , /. They can be applied to variables, values or literals which are referred to as operands
* Operands refers to the value or variable the operator is being applied to.

``` result = a + b; // The operator here is + and the opperands are a, b and c ```

## Types of Operators

In general, there are three flavours of operators in Java:
1. Unary
2. Binary 
3. Ternary

Java operators have precedence over one another so sometimes things are calculated right to left:

``` Java
int cookies = 4                                   
double reward = 3 + 2 * --cookies;                                 
System.out.println("Zoo animal recieves: "+reward+" reward points");
```

In the example above we work right to left. We first decrement cookies to 3, we then multiply it by 2 to give us 6 and then we add 3 to make it 9.0

### Operator Precedence

![image](https://user-images.githubusercontent.com/91537105/152002583-c28c285e-cac1-4b25-88e3-0e1c47c266b7.png)

### Applying Unary Operators

A unary operator is one that requires exactly one operand, or variable to function

![image](https://user-images.githubusercontent.com/91537105/152004720-86300b0f-e38b-4568-9b4a-6d88b6ebf8e9.png)

### Logical Complement and Negative Operators

#### Boolean

The logical complement operator (!) flips the value of a boolean expression. For example, if the value is true, it will be converted to false, and vice versa. To illustrate this, compare the outputs of the following statements:

``` Java
boolean isAnimalAsleep = false;
System.out.println (isAnimalAsleep); // false
isAnimalAsleep = !isAnimalAsleep;
System.out.printin(isAnimalAsleep);//true
```

Likewise, the negation operator, -, reverses the sign of a numeric expression, as shown in these statements:

``` Java
double zooTemperature = 1.21;
System.out.printin(zooTemperature);        // 1.21

zooTemperature = -zooTemperature;
System.out.println(zooTemperature);        // -1.21

zooTemperature = - (-zooTemperature);
System.out.printin(zooTemperature);        //-1.21
```

Notice that in the last example we used parentheses, (), for the negation operator, -, to apply the negation twice. If we had instead written --, then it would have been interpreted as the decrement operator and printed -2.21. 

Based on the description, it might be obvious that some operators require the variable or expression they're acting upon to be of a specific type. For example, you cannot apply
a negation operator (-) to a boolean expression, nor can you apply a logical complement operator (!) to a numeric expression. Be wary of questions on the exam that try to do this, as they'll cause the code to fail to compile. For example, none of the following lines of code will compile:

``` Java
int pelican = !5;               // DOES NOT COMPILE: you cannot perform a logical inversion of a numeric value.
boolean penguin = -true;        // DOES NOT COMPILE: you cannot numerically negate a boolean value; you need to use the logical inverse operator.
boolean peacock = !0;           // DOES NOT COMPILE: you cannot take the logical complement of a numeric value, nor can you assign an integer to a boolean variable.
```


