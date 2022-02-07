import java.util.Scanner;

public class DoWhileLoop {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String input = "";
        while (!input.equals ("quit")) {
            System.out.print("Input: ");
            input = scanner.next().toLowerCase();
            System.out.println(input);
        }

        // While loops are far more common however there are some cases when you need to use a do while loop
        // Do while loops are executed at least once
        do {
            System.out.print("Input: ");
            input = scanner.next().toLowerCase();
            System.out.println(input);
        } while (!input.equals("quit"));

    }
}
