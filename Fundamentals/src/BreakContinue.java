import java.util.Scanner;

public class BreakContinue {
    public static void main(String[] args) {
        // Break and Continue statements are effective in ensuring that your code is running efficiently and not
        // executing any unnecessary code
        // Break terminates the loop
        // Continue returns to the start of the loop
        Scanner scanner = new Scanner(System.in);
        String input = "";
        while (true) {
            System.out.print("Input: ");
            input = scanner.next().toLowerCase();
            if (input.equals("pass"))
                continue;
            if (input.equals("quit"))
                break;
            System.out.println(input);
        }
    }
}


