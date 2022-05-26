import java.util.Arrays;

public class Main {

    public static void main(String[] args){
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        reverseArray(array);
    }

    public static void reverseArray(int[] array){
        System.out.println("Array Before Reverse : " + Arrays.toString(array));
        int temp;
        for (int i = 0; i < array.length/2; i++){
            temp = array[i];
            array[i] = array[array.length -1 -i];
            array[array.length -1 -i] = temp;
        }
        System.out.println("Array After Reverse : " + Arrays.toString(array));
    }
}
