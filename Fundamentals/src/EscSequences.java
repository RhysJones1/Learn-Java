public class EscSequences {
    public static void main(String[] args){
        // There are times we want to include special characters in our strings such as \ 2 * "" etc
        // Overcoming extra double quotes
        // String message = "Hello "Rhys";              //This wouldn't compile. Java thinks we are missing a double quote
        String message = "Hello Rhys";
        System.out.println(message);
        String message1 = "Hello \"Rhys\"";             // Using \ we can wrap an extra set of quotes in our string
        System.out.println(message1);

        // Overcoming using a backslash: What if we wanted to include a Windows directory in our code? Win dir's include \
        String cDrive = "c:\\Windows\\...";
        System.out.println(cDrive);                     // Notice we used two backslashes either side but only one is printed on each side

        // Adding new lines to our string \n
        String message2 = "Hello\nMy\nName\nIs\nRhys";  // Using \n allows us to print the string on a new line
        System.out.println(message2);

        // Adding a new tab to our Strings
        String message3 = "We\t can\t add\t tabs\t to\t our\t strings"; // Using \t allows us to add tabs to out strings
        System.out.println(message3);
    }
}
