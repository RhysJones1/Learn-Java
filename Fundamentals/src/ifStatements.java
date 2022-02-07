public class ifStatements {
    public static void main(String[] args){
        int temperature = 19;

        if (temperature > 30) {
            System.out.println("It's a hot day");
            System.out.println("Drink plenty of water");
        }
        else if (temperature >= 20 & temperature <= 30){
            System.out.println("It's a nice day");

        } else {
            System.out.println("It's cold");
        }

        // Simplifying If Statements
        int income = 120_000;
        boolean hasHighIncome = (income > 100_000);
        System.out.println(hasHighIncome);
        }
}
