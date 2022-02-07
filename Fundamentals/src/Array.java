import java.util.Arrays;
public class Array {
    public static void main(String[] args){
        // An array simply stores a list of numbers or words in a list
        int[] numbers = new int[5];                     // Here we are declaring a list, we also specified the length of an array
        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;
        numbers[3] = 4;
        numbers[4] = 5;
        System.out.println(numbers);                    /* Notice when we try to print the array we get something different?
                                                        By default, Java returns the address of the object */

        // Using the Class Arrays we can use a method toString which allows us to print the array
        System.out.println(Arrays.toString(numbers));

        /* The above approach to initialising arrays
        is quite outdated and inefficient. There is
        a better approach if you know your array ahead of time
        */

        int[] numbers1 = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(numbers1));  // Same result but much cleaner and faster

        // Determine the lengths of the array using .length method
        System.out.println(numbers1.length);

        // Sort a list using Arrays.sort
        int[] sortednumbers = {6, 8, 1, 9, 3, 7};
        Arrays.sort(sortednumbers);
        System.out.println(Arrays.toString(sortednumbers));

        // Arrays have a fixed size, they are immutable

    }

}
