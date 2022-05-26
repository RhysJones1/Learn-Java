import java.util.Arrays;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args){
        int[] myArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}; // You can initialise like this
        int[] anotherArray = new int[10];                // Or like this
        anotherArray[0] = 50;
        anotherArray[2] = 100;
        System.out.println(Arrays.toString(myArray));
        System.out.println(Arrays.toString(anotherArray));
        System.out.println("anotherArray Index 0 = " + anotherArray[0]);

        // Another way to declare an Array through a for loop
        int[] oneMoreArray = new int[10];
        for (int i = 0; i < oneMoreArray.length; i++){
            oneMoreArray[i] = i * 10;
        }
        printArray(oneMoreArray);

        // Input Array
        int[] myIntegers = getIntegers(5);
        for (int i = 0; i< myIntegers.length; i++){
            System.out.println("Element " + i + ", typed value was " + myIntegers[i]);
        }

        System.out.println("The average is: " + getAverage(myIntegers));
    }

    public static int[] getIntegers(int number){
        System.out.println("Enter " + number + " integer values. \r");
        int[] values = new int[number];

        for (int i = 0; i < values.length; i++){
            values[i] = scanner.nextInt();
        }
        return values;
    }

    public static double getAverage(int[] array){
        int sum = 0;
        for (int i = 0; i < array.length; i++){
            sum += array[i];
        }
        return(double) sum / (double)array.length;
    }

    // you can also print an array through a method
    public static void printArray(int[] array){
        for (int i = 0; i < array.length; i++){
            System.out.println("Element " + i + ", value is " + array[i]);
        }
        System.out.println("The full list looks like this: " + Arrays.toString(array));
    }
}
