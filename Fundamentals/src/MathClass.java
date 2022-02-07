public class MathClass {
    public static void main(String[] args){
        // The Math class allows us to perform arithmetic

        // Rounding
        int result = Math.round(1.1F);
        System.out.println(result);

        // Ceiling: This returns the smallest integer that is greater than or equal to the number provided
        int result1 = (int)Math.ceil(1.1F);
        System.out.println(result1);

        // Floor: This returns the largest integer that is smaller or equal to the number provided
        int result3 = (int)Math.floor(1.1F);
        System.out.println(result3);

        // Max: Returns the greater of two values
        int result4 = Math.max(1, 2);
        System.out.println(result4);

        // Min: Opposite to Max
        int result5 = Math.min(1, 2);
        System.out.println(result5);

        // Random: Random number between 0 and 1
        double result6 = Math.random();
        System.out.println(result6);

        // Random: Random number between 0 and 100
        double result7 = Math.random() * 100;
        System.out.println(result7);

        // What if we don't want the digits after the decimal point?
        int result8 = (int)Math.round(Math.random() * 100);         // We need to explicitly cast int otherwise we get a compilation error
        System.out.println(result8);                                // We know the highest number we have is 100 and therefore int will be fine



    }
}
