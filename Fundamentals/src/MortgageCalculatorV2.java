/*
V2 builds on the previous version where we have added some exception handling
in our previous version when a user enters an invalid number the system would
crash whereas in this version, due do a series of if and while loops the user
is directed until they enter a valid number
 */


import java.text.NumberFormat;
import java.util.Scanner;

public class MortgageCalculatorV2 {
    public static void main(String[] args){
        final byte PERCENT = 100;
        final byte MONTHS_IN_YEAR = 12;
        int principal = 0;
        float annualInterest = 0;
        byte period = 0;

        Scanner scanner = new Scanner(System.in);       // Initialise the Scanner Object

        // Principle
        while (true) {
            System.out.print("Principal (£1K - £1M): ");
            principal = scanner.nextInt();
            if (principal >= 1000 && principal <= 1_000_000)
                break;
            else;
            System.out.println("Enter a number between 1,000 and 1,000,000");
        }

        // Annual Interest
        while (true) {
            System.out.print("Annual Interest: ");
            annualInterest = scanner.nextFloat();
            if (annualInterest > 0 && annualInterest < 30)
                break;
            else;
            System.out.println("Please enter a number between 0 and 30");
        }

        // Period
        while (true) {
            System.out.print("Period (Years): ");
            period = scanner.nextByte();
            if (period >= 1 && period <= 30)
                break;
            else;
            System.out.println("Please enter a number between 1 and 30");
        }

        // Calculating monthly payment
        double monthlyInterest = annualInterest / PERCENT / MONTHS_IN_YEAR;
        int numberOfPayments = period * MONTHS_IN_YEAR;
        double mortgage = principal *
                (monthlyInterest * Math.pow(1 + monthlyInterest, numberOfPayments))
                / (Math.pow(1 + monthlyInterest, numberOfPayments) - 1) ;

        String monthlyPayment = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println("Your Monthly Mortgage Payment Is: " + monthlyPayment);

    }
}

/*
How can we improve this program? The next version, we will address the main issue with this
program which is readability and maintainability. The main() methods is getting quite big
so V3 will implement methods which will streamline the main method
 */
