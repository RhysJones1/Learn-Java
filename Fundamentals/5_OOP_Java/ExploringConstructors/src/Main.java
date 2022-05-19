public class Main {

    public static void main(String[] args){
        BankAccount firstCustomer = new BankAccount("Rhys Jones", "test.test@test.com",
                "07777777777", "291789546", 1000);

            System.out.println("Your name is: " + firstCustomer.getCustomerName());
            System.out.println("Your account number is: " + firstCustomer.getAccountNumber());
            System.out.println("Your email address is: " + firstCustomer.getEmailAddress());
            System.out.println("Your phone numbers is: " + firstCustomer.getPhoneNumber());
            System.out.println("Your balance is: £" + firstCustomer.getBalance());
            System.out.println();

            firstCustomer.depositFunds(100.20);
            firstCustomer.withdrawFunds(100.20);
            System.out.println("");
        BankAccount secondAccount = new BankAccount("John", "john.john.com", "12345");
        System.out.println(secondAccount.getAccountNumber() + " name " + secondAccount.getCustomerName());
        System.out.println();
        System.out.println("***********************");
        VIPCustomer importantCustomer  = new VIPCustomer("Rhys", "test.test@test.com", 10000);
        System.out.println(importantCustomer.getName());
        System.out.println(importantCustomer.getEmailAddress());
        System.out.println(importantCustomer.getCreditLimit());
    }
}
