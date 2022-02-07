public class ArithmeticExpressions {
    public static void main(String[] args){
        int result = 10 + 1;
        int result1 = 10 - 1;
        int result2 = 10 * 5;
        int result3 = 10 / 2;
        double result4 = (double) 10 / (double) 3;
        System.out.println(result);
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);

        //Decrement and Increment
        int num = 5;
        num += 3;
        System.out.println(num);
        num -= 3;
        System.out.println(num);
        num ++;
        System.out.println(num);
        num --;
        System.out.println(num);


        // Modular provides the remainder when dividing
        int mod = 10 % 2;
        System.out.println(mod);
        int mod1 = 10 % 3;
        System.out.println(mod1);

    }
}
