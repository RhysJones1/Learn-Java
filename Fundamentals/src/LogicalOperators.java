public class LogicalOperators {
    public static void main(String[] args){
        // There are times when we want to combine multiple boolean expressions
        // && Is used when you want to check whether two conditions are true
        int temperature = 22;
        boolean isWarm = temperature > 20 && temperature < 30;
        System.out.println(isWarm);

        // Or || returns true if one or the other is true
        boolean hasHighIncome = false;
        boolean hasGoodCredit = true;
        boolean isEligible = hasHighIncome || hasGoodCredit;
        System.out.println(isEligible);

        // Not operator: reverse a value
        boolean hasHighIncome1 = true;
        boolean hasGoodCredit1 = true;
        boolean hasCriminalRecord = false;
        boolean isEligible1 = (hasHighIncome1 || hasGoodCredit1) && !hasCriminalRecord;
        /* What we are saying here is, to be eligible for credit
        they must have either high income or good credit and
        not have a criminal record.
         */
        System.out.println(isEligible1);
    }
}
