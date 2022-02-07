public class Casting {
    public static void main(String[] args) {
        //Implicit Casting
        // byte > short > int > long > float > double
        short x = 1;
        int y = x + 2;
        System.out.println(y);
        /*
        When this code gets executed x gets converted to int.
        This is done automatically as there is no chance of data loss
        */

        // We can explicitly cast and force it: It can only happen with compatible types so you couldn't mix with string
        double a = 1.1;
        int b = (int)a + 2;     //We are converting a to int
        System.out.println(b);

        // Wrapper classes help us overcome some issues when dealing with strings and numbers
        // This is very important concept. When a user interacts with a UI, they are very often providing
        // data in strings so that's why it's handy to know how to convert
        String c = "1";
        int d = Integer.parseInt(c) + 2;
        System.out.println(d);

        String e = "1.2";
        double f = Double.parseDouble(e) + 2;
        System.out.println(f);

    }
}
