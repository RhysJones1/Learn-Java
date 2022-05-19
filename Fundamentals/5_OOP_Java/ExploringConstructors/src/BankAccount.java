public class BankAccount {
    private String accountNumber;
    private double balance;
    private String customerName;
    private String emailAddress;
    private String phoneNumber;

    public BankAccount() {
        this("Default name", "Default address", "Default phone", "56789", 2.50);
        System.out.println("Empty constructor called");
    }

    public BankAccount(String customerName, String emailAddress, String phoneNumber) {
        this(customerName, emailAddress, phoneNumber, "9999", 100.55);

    }

    public BankAccount(String customerName, String emailAddress, String phoneNumber,
                       String accountNumber, double balance){
        this.customerName = customerName;
        this.emailAddress = emailAddress;
        this.phoneNumber = phoneNumber;
        this.accountNumber = accountNumber;
        this.balance = balance;
        System.out.println("New Customer Created");
        System.out.println("*********************");
    }

    public void depositFunds(double depositAmount){
        this.balance += depositAmount;
        System.out.println("You have deposited £" + depositAmount +
                " Remaining balance is: " + this.balance);
    }

    public void withdrawFunds(double withdrawalAmount){
        if (this.balance - withdrawalAmount < 0){
            System.out.println("Only " + balance + " available. Withdrawal not processed");
        } else {
            this.balance -= withdrawalAmount;
            System.out.println("Withdrawal of " + withdrawalAmount +
                    " processed. Remaining balance is: " + this.balance);
        }
    }

    public void setAccountNumber(String accountNumber)
    {
        this.accountNumber = accountNumber;
    }
    public void setBalance(double balance){
        this.balance = balance;
    }
    public void setCustomerName(String customerName){
        this.customerName = customerName;
    }
    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }
    public void setEmailAddress(String emailAddress){
        this.emailAddress = emailAddress;
    }

    public String getAccountNumber() {
        return accountNumber;
    }
    public double getBalance() {
        return balance;
    }
    public String getCustomerName() {
        return customerName;
    }
    public String getEmailAddress() {
        return emailAddress;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }
}
