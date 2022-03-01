/*
Learn Programming Academy's Java 1Z0-815 Certification Exam Course
Section 3: Working with Java Primitive Data Types and String APIs
Topic: Declare and Initialize Variables
Sub-Topic: Initializing Primitive Data Variables to literals
*/

public class Foo2 {
    public static void main(String[] args) {

        // You can set all of the numeric primitive data variables to a literal number
        // from 0 to 127.
        byte b = 127;
        char c = 127;
        short s = 127;
        int i = 127;
        long l = 127;
        float f = 127;
        double d = 127;

        // boolean can only be set to true or false
        boolean isTrue = false;

        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println("s = " + s);
        System.out.println("i = " + i);
        System.out.println("l = " + l);
        System.out.println("f = " + f);
        System.out.println("d = " + d);
        System.out.println("isTrue = " + isTrue);
        /*
         Notice that we are adding suffixes here at the end of the literal
         * this is to ensure we force the variable to be assigned to that
         * specific type. For instance if we don't include f for float
         * it will revert to double by default
        */
        long l2 = 127L;
        long l3 = 127L;
        System.out.println("l2 = " + l2);
        System.out.println("l2 = " + l3);

        float f2 = 127f;
        float f3 = 127F;
        System.out.println("f2 = " + f2);
        System.out.println("f3 = " + f3);

        double d2 = 127d;
        double d3 = 127D;
        System.out.println("d2 = " + d2);
        System.out.println("d3 = " + d3);
        /* Examples which would not compile: */
//        byte b8 = 0b_00000001;  // Cannot have underscore directly after 0b
//        char c8 = 0x_007F;  // Cannot have underscore directly after 0x
//        int i8 = 1000000_;  // Underscore cannot be at end of literal
//        long d8 = 1000000_L; // Underscore cannot be prior to suffix  (L/l,F/f,D/d)
//        float f8 = _1000.000000; // Underscore cannot be at start of literal
//        double l8 = 1.0000000_e10; // Underscore cannot prefix exponential in literal
//
//        // You can't assign null to a primative type either:
//        byte b9 = null;
//        char c9 = null;
//        short s9 = null;
//        int i9 = null;
//        long l9 = null;
//        float f9 = null;
//        double d9 = null;
//
//        boolean aBoolean = 0;
//        boolean bBoolean = null;

        }
}