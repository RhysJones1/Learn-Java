/*
V3 will address the main issue with this program which is readability
and maintainability. The main() methods is getting quite big so V3
will implement methods which will streamline the main method
 */

import java.text.NumberFormat;
import java.util.Scanner;

public class MortgageCalculatorV3 {
    final static byte PERCENT = 100;
    final static byte MONTHS_IN_YEAR = 12;

    /*
    main() method: As you can see, the main() has been reduced from around 50 lines of code
    down to 6 which is far more readable.
     */
    public static void main(String[] args) {
        int principal = (int) readNumber("Principal: ", 1000, 1_000_000);
        float annualInterest = (float)readNumber("Annual Interest Rate: ", 1, 30);
        byte years = (byte)readNumber("Period (Years): ", 1, 30);

        printMortgage(principal, annualInterest, years);
        printPaymentSchedule(principal, annualInterest, years);
    }

    // This method prints our monthly mortgage payment
    private static void printMortgage(int principal, float annualInterest, byte years) {
        double mortgage = calculateMortgage(principal, annualInterest, years);
        String monthlyPayment = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println();
        System.out.println("MORTGAGE");
        System.out.println("--------");
        System.out.println("Your Monthly Mortgage Payment Is: " + monthlyPayment);
    }

    // This method prints our payment schedule
    private static void printPaymentSchedule(int principal, float annualInterest, byte years) {
        System.out.println();
        System.out.println("PAYMENT SCHEDULE");
        System.out.println("----------------");
        for (short month = 1; month <= years * MONTHS_IN_YEAR; month++){
            double balance = paymentSchedule(principal, annualInterest, years, month);
            System.out.println(NumberFormat.getCurrencyInstance().format(balance));
        }
    }

    /*
    This method controls exception handling. Rather than having 3 while loops
    as we had in v2 we only have 1. Same as the previous version, the loop
    will repeat until the user enters a valid value
     */
    public static double readNumber(String prompt, double min, double max){
        Scanner scanner = new Scanner(System.in);
        double value;
        while (true) {
            System.out.print(prompt);
            value = scanner.nextFloat();
            if (value >= min && value <= max)
                break;
            else ;
            System.out.println("Please enter a value between " + min + " and " + max);
        }
        return value;
    }

    /*
    This method includes all the necessary calculations to calculate our mortgage
     */
    public static double calculateMortgage(
            int principal,
            float annualInterest,
            byte years
    ) {

        double monthlyInterest = annualInterest / PERCENT / MONTHS_IN_YEAR;
        short numberOfPayments = (short)(years * MONTHS_IN_YEAR);

        double mortgage = principal *
                (monthlyInterest * Math.pow(1 + monthlyInterest, numberOfPayments))
                / (Math.pow(1 + monthlyInterest, numberOfPayments) - 1);
        return mortgage;
    }

    // This method calculates the payment schedule
    public static double paymentSchedule(
            int principal,
            float annualInterest,
            byte years,
            short numberOfPaymentsMade) {

        float monthlyInterest = annualInterest / PERCENT / MONTHS_IN_YEAR;
        float numberOfPayments = years * MONTHS_IN_YEAR;

        double balance = principal
                * (Math.pow(1 + monthlyInterest, numberOfPayments) - Math.pow(1 + monthlyInterest, numberOfPaymentsMade))
                / (Math.pow(1 + monthlyInterest, numberOfPayments) - 1);

        return balance;

    }
/*
How can we improve this code?
It's very procedural. It has a load of unrelated methods that call each other
and they are all a part of the main class. We don't have encapsulation, 
we don't have abstraction.

The next version will be around refactoring towards an object orientated design.
*/

}
