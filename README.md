# Java-SE-11-Certification: 1Z0-819 Exam Notes and Source Code

## Welcome!

![image](https://user-images.githubusercontent.com/91537105/150771565-bda91800-eaf5-40e6-b00b-311e9f3775b5.png)

## How to use this repository?

This repository will contain all my notes to help me prepare for the exam. I will also include source code which will be organised in folders. I'm really just using this for my benefit and to help me track all of my work however If you stumble across it and you find it helpful then that's fine with me! 👌

## How am I preparing?

To prepare for the certification, I using two modes of study:
* Udemy Course by Tim Buchulka (Part 1 and 2): https://www.udemy.com/course/java-se-11-developer-1z0-819-ocp-course-part-1/learn/quiz/4768370#overview
* OCP Oracle Certified Professional Java SE 11 Developer Complete Study Guide: https://www.amazon.co.uk/gp/product/1119619130/ref=ppx_od_dt_b_asin_title_s00?ie=UTF8&psc=1
* The above book also comes with 4 practice exams and electronic flash cards which I will use. While the book is aimed at the previous exam approach where there were two exams instead of one, the content is still relevant to the single exam. 
* This study approach has worked well in the past as I find sometimes, the Udemy courses don't go into as much depth in certain areas as I would like so having the book gives me the opportunity to review areas that i'm struggling with.  

## My Notes

Initially, my plan was to keep my notes in one readme file, until the book came which is the size of a house! 😲 Instead, I will create separate documents and will split them per chapter!

## Am I using the right version of Java?

The certification covers Java SE 11. If you want to know whaat version you are running, open your command prompt:
* java -version
* javac - version
* Both should start with an 11

## Compiling and Running a Program on cmd

Before diving into the chapters a quick note on compiling and running code. Throughout the book it asks you to compile and run your program via command line. So here's a few reminder points:

* Make sure you have installed the Java 11 SDK and added it to the path: 

```
set path=%path%;C:\Program Files\Java\jdkENTER_VERSION_HERE\bin
```
* Now, you can use Javac and Java to complile and run your program:

```
(c) Microsoft Corporation. All rights reserved.

C:\Users\rhysj>cd Programming\Java SE 11\Zoo

C:\Users\rhysj\Programming\Java SE 11\Zoo>dir
 
 Directory of C:\Users\rhysj\Programming\Java SE 11\Zoo

26/01/2022  10:17    <DIR>          .
26/01/2022  10:17    <DIR>          ..
26/01/2022  10:30    <DIR>          .idea
26/01/2022  10:17    <DIR>          out
26/01/2022  10:30    <DIR>          src
26/01/2022  10:13               433 Zoo.iml
               1 File(s)            433 bytes
               5 Dir(s)  383,500,382,208 bytes free

C:\Users\rhysj\Programming\Java SE 11\Zoo>cd src

C:\Users\rhysj\Programming\Java SE 11\Zoo\src>dir
 Volume in drive C is Windows
 Volume Serial Number is 8683-D649

 Directory of C:\Users\rhysj\Programming\Java SE 11\Zoo\src

26/01/2022  10:30    <DIR>          .
26/01/2022  10:30    <DIR>          ..
26/01/2022  10:30               487 Zoo.class
26/01/2022  10:30               214 Zoo.java
               2 File(s)            701 bytes
               2 Dir(s)  383,500,382,208 bytes free

C:\Users\rhysj\Programming\Java SE 11\Zoo\src>javac Zoo.java

C:\Users\rhysj\Programming\Java SE 11\Zoo\src>java Zoo
Hello World!
I have compiled and run my code through the command line!
```
