import java.util.Scanner;

public class WhileLoops {
    public static void main(String[] args){
// Similar to for loops but different int terms of syntax
        // While loops are handy when we don't know how many times we want to repeat something
        // In cases when we know how many loops we need, it is better to use a For loop as it's cleaner
        int i = 1;
        while (i <= 5) {
            System.out.println("Hello World " + i);
            i++;
        }
        Scanner scanner = new Scanner(System.in);
        String input = "";
        while (!input.equals ("quit")){
            System.out.print("Input: ");
            input = scanner.next().toLowerCase();
            System.out.println(input);
        }
    }
}
