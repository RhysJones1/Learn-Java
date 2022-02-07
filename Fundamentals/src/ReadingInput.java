import java.util.Scanner;

public class ReadingInput {
    public static void main(String[] args){

        // The Scanner class allows us to read input from the user.
        Scanner scanner = new Scanner(System.in);
        System.out.print("Age: ");                              // Notice we removed ln, so it prints all on one line
        byte age = scanner.nextByte();                          // There are methods to read not only bytes but all data types
        //System.out.println("You are " + age + " Years Old");

        // Let's use the Scanner class with Strings
        Scanner scanner1 = new Scanner(System.in);
        System.out.print("Name: ");                              // Notice we removed ln, so it prints all on one line
        String name = scanner1.nextLine().trim();                /* There are methods to read not only bytes but all
                                                                    data types. The .trim method allows us to trim
                                                                    any white space before and after in the event the
                                                                    user add unnecessary white space in their input
                                                                    */
        System.out.println("Your name is " + name + " and you are " + age + " years old");



    }

}
