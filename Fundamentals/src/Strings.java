import java.util.Locale;

public class Strings {
    public static void main(String[] args){
        // Basic String
        String message = "  Hello World";
        System.out.println(message);

        // Concatenate a String
        String message1 = message + "!!  ";
        System.out.println(message1);

        // String is a class so there are methods and functions to call on
        System.out.println(message1.endsWith("!!"));                    // endsWith method checks if the string ends with something
        System.out.println(message1.startsWith("G"));                   // startsWith does the opposite
        System.out.println(message1.length());                          // length tells us how many characters are in the string
                                                                        // these methods are really handy when it comes to password creation
                                                                        // or usernames
        System.out.println(message1.indexOf("H"));                      // indexOf gives the index of the first character we pass
        System.out.println(message1.indexOf("Swansea"));                // -1 is passed if the string doesn't include it
        System.out.println(message1.replace("!", "*")); // .replace replaces 1 or more characters
        System.out.println(message1);                                   // Notice when we reprint message1 it doesn't include *?
                                                                        // Strings are immutable, we can't mutate them. So how what did .replace do?
                                                                        // It returned a new string
        System.out.println(message1.toLowerCase(Locale.ROOT));          // returns a new string, all of which are lower case
        System.out.println(message1.toUpperCase(Locale.ROOT));          // Does the opposite
        System.out.println(message1.trim());                            // Removes empty space at the start and end
        System.out.println("There are loads more String Methods, " +
                          "but this gives a idea on what you can do " +
                          "(pretty much anything!)");


    }

}
