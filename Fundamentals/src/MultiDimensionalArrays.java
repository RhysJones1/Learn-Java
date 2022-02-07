import java.util.Arrays;

public class MultiDimensionalArrays {
    public static void main(String[] args){
    /* We can store a two dimensional array
     to store a matrix for 2 or cube for 3
     This is quite handy in data analytics
     */
        //2DArray
        int[][] numbers = new int [2] [3];      /* This creates a two dimensional array: 2 rows and 3 columns */
        numbers[0] [0] = 1;                             // Row 0 Column 0 set to one
        System.out.println(Arrays.toString(numbers));   // Notice that toString didn't work here? for 2DArrays we need to add something else
        System.out.println(Arrays.deepToString(numbers));

        //3DArray
        int[][][] numbers1 = new int [2][3][5];

        //2dArrayPreFilled
        int[][] numbers2 = { {1, 2, 3}, {4, 5, 6} };
        System.out.println(Arrays.deepToString(numbers2));
    }


}
