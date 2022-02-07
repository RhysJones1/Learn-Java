public class SwitchStatements {
    public static void main(String[] args){
//        String role = "admin";
//        if (role == "admin")
//            System.out.println("You're an admin");
//        else if (role == "moderator")
//            System.out.println("You're a moderator");
//        else
//            System.out.println("you're a guest");

        // Let's try the above as a switch statement

        String role = "admin";
        switch (role){
            case "admin":
                System.out.println("You're an admin");
                break;
            case "moderator":
                System.out.println("You're a moderator");
                break;
            default:
                System.out.println("you're a guest");

        }

    }
}
