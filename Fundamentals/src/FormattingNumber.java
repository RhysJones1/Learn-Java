import java.text.NumberFormat;

public class FormattingNumber {
    public static void main(String[] args){
    /* Very often when working with numbers we need to format them as currency values
    for example 209995 > £209,995 the latter is much be readable
     */

        // Get convert a number to a currency
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        String result = currency.format(1234567.891);
        System.out.println(result);

        // How about percentages?
        NumberFormat percent = NumberFormat.getPercentInstance();
        String result1 = percent.format(0.1);
        System.out.println(result1);

        // Can we improve the above code?
        String result2 = NumberFormat.getPercentInstance().format(0.1); // This is known as method chaining
        System.out.println(result2);                                           // Same result, less code 👍


    }
}
