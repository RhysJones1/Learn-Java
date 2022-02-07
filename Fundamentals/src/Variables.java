import java.util.Date;

public class Variables {
    // primitive types: There are 8 - byte, short, int, long, float, double, boolean, char
    public static void main(String[] args){
        byte myAge = 30;
        byte herAge= myAge;
        long viewsCount = 3123456789L;
        float price = 10.99F;
        char letter = 'A';
        boolean isEligible = false;
        System.out.println(myAge);
    // reference types: they refer to objects. We can call methods on them to manipulate
    // examples are: Strings, Arrays, Classes, Interface
        Date now = new Date();
            System.out.println(now);

    }


}
