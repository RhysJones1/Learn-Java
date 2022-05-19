public class VIPCustomer {
    private String name;
    private int creditLimit;
    private String emailAddress;

    public VIPCustomer() {
        this("Default name", "Default email address", 500);

    }

    public VIPCustomer(String name, String emailAddress) {
        this(name, emailAddress, 500);
    }

    public VIPCustomer(String name, String emailAddress,int creditLimit) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.emailAddress = emailAddress;
        System.out.println("New VIP Customer Created");
        System.out.println("*********************");
    }

    public String getName() {
        return name;
    }

    public int getCreditLimit() {
        return creditLimit;
    }

    public String getEmailAddress() {
        return emailAddress;
    }
}
