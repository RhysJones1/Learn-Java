public class Methods {
    public static void main(String[] args){
        greetUser("Rhys", "Jones");                            // Calling the method in the main() method
    }

    public static void greetUser(String firstName, String secondName) {             // Create a method
        System.out.println("Hello " + firstName + " " + secondName);
    }

}
