import java.text.NumberFormat;
import java.util.Scanner;

public class MortgageCalculatorProj {
    public static void main(String[] args){
        final byte PERCENT = 100;
        final byte MONTHS_IN_YEAR = 12;

        Scanner scanner = new Scanner(System.in);       // Initialise the Scanner Object

        // Principle
        System.out.print("Principal: " );
        int principal = scanner.nextInt();

        // Annual Interest
        System.out.print("Annual Interest: ");
        float annualInterest = scanner.nextFloat();

        // Period
        System.out.print("Period (Years): ");
        byte period = scanner.nextByte();

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

