import java.util.Arrays;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args){
        int[] myIntegers = getIntegers(5);
        int[] sorted = sortArray(myIntegers);
        printArray(sorted);
    }

    public static int[] getIntegers(int number){
        System.out.println("Enter " + number + " integer values. \r");
        int[] values = new int[number];

        for (int i = 0; i < values.length; i++){
            values[i] = scanner.nextInt();
        }
        return values;
    }

    public static int[] sortArray(int[] array){
        int[] sortedArray = Arrays.copyOf(array, array.length);
        int temp;
            for(int i = 0; i < array.length -1; i++) {
                if(array[i] < array[i + 1]) {
                    temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                }
            }
       return array;
    }

    public static void printArray(int[] array){
        System.out.println("The sorted list looks like this: " + Arrays.toString(array));
    }

}


