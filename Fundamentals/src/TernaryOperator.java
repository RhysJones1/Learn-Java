public class TernaryOperator {
    public static void main(String[] args){
        int income = 120_000;
        String className = income > 100_000 ? "First" : "Economy";
        // Part 1 is out condition
        // If true the left is returned otherwise the right is returned
        System.out.println(className);

    }
}
