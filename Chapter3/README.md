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

### Increment and Decrement Operators

Increment and decrement operators, +* and -, respectively, can be applied to numeric variables and have a high order of precedence, as compared to binary operators. In other words, they often get applied first in an expression.

Increment and decrement operators require special care because the order in which they are attached to their associated variable can make a difference in how an expression is processed. If the operator is placed before the operand, referred to as the pre-increment operator and the pre-decrement operator, then the operator is applied first and the value returned is the new vale of the expression. Alternatively, if the operator is placed after the operand, referred to as the post-increment operator and the post-decrement operator, then the original value of the expression is returned, with operator applied after the value is returned.

The following code snippet illustrates this distinction:

``` Java
int parkAttendance = 0;
System.out.printin(parkAttendance);      // 0
System.out.println(++parkAttendance);    // 1
System.out.println(parkAttendance);      // 1
System.out.println(parkAttendance--);    // 1
System.out.println(parkAttendance);      // 0
```
The first pre-increment operator updates the value for parkAttendance and outputs the new value of 1. The next post-decrement operator also updates the value of parkAttendance but outputs the value before the decrement occurs.

## Working with Binary Arthmetic Operators

Binary operators take two parameters, the most common kind of operator in the Java language. They can perform mathematical operations on variables, create logical expressions and perform basic variable assignments. Binary operators are often combined in complex expressions with other binary binary operators, therefore operator precedence is very important.

![image](https://user-images.githubusercontent.com/91537105/152154090-7275821b-0264-4f8f-9a59-5084a37c1fb5.png)

### Arithmetic Operators

Refer to mathematical operators (+, -, * , %)

Remember BIDMAS in relation brackets

### Numeric Promotion

As we we saw in Chapter 2, "Java Building Blocks," each primitive numeric type has a bit-length. For example, long takes up more space than an int, which in turn takes up more space than a short, and so on.

#### Numeric Promotion Rules

1. If two values have different data types, Java will automatically promote one of the values to the larger of the two data types.
2. If one of the values is integral and the other is floating-point, Java will automatically promote the integral value to the floating-point value's data type.
3. Smaller data types, namely, byte, short, and char, are first promoted to int any time they're used with a Java binary arithmetic operator, even if neither of the operands is int.
4. After all promotion has occurred and the operands have the same data type, the resulting value will have the same data type as its promoted operands.

The last two rules are the ones most people have trouble with and the ones likely to trip you up on the exam. For the third rule, note that unary operators are excluded from this rule. For example, applying ++ to a short value results in a short value.

Let's tackle some examples for illustrative purposes:

What is the data type of × * y?
``` Java
int x = 1;
long y = 33;
var z = x * y;
```

If we follow the first rule, since one of the values is long and the other is int and since long is larger than int, then the int value is promoted to a long, and the resulting
value is long.

What is the data type of x + y?
```
double x = 39.21;
float y = 2.1;
var z = x + y;
```

This is actually a trick question, as this code will not compile! As you may remember from Chapter 2, floating-point literals are assumed to be double, unless postfixed with
an f, as in 2.1f. If the value of y was set properly to 2.1f, then the promotion would be similar to the previous example, with both operands being promoted to a double, and the result would be a double value.

What is the data type of x * y? 
```
short x = 10;
short y = 3;
var z = x * y;
```

On the last line, we must apply the third rule, namely, that x and y will both be promoted to int before the binary multiplication operation, resulting in an output of type
int. If you were to try to assign the value to a short variable without casting, the code would not compile. Pay close attention to the fact that the resulting output is not a
short, as we'll come back to this example in the upcoming "Assigning Values" section.

What is the data type of w * x / y?
```
short w = 14;
float x = 13;
double y = 30;
var z = w * x / y;
```

In this case, we must apply all of the rules. First, w will automatically be promoted to int solely because it is a short and it is being used in an arithmetic binary operation. The promoted w value will then be automatically promoted to a float so that it can be multiplied with x. The result of w * × will then be automatically promoted to a double so that it can be divided by y, resulting in a double value.

When working arithmetic operators in Java, you should always be aware of the data type of variables, intermediate values, and resulting values. You should apply operator precedence and parentheses and work outward, promoting data types along the way. In the next section, we'll discuss the intricacies of assigning these values to variables of a particular type.
