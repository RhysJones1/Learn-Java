public class ProceduralVersion {
    public static void main(String [] args){
        // Example of a procedural approach to programming
        int baseSalary = 50_000;
        int extraHours = 10;
        int hourlyRate = 20;

        int wage = calculateWage(baseSalary, extraHours, hourlyRate);
        System.out.println(wage);
    }

    public static int calculateWage(
            int baseSalary,
            int extraHours,
            int hourlyRate)
    {
        return baseSalary + (extraHours * hourlyRate);

    }

    /*
    What's wrong with this code?
    Nothing at the moment however as the program grows
    the main method will grow bigger and bigger and
    potentially become messy and hard to maintain
     */
}
