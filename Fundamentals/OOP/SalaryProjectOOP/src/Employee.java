public class Employee {
    private int baseSalary;
    private int hourlyRate;

    // Build a constructor
    public Employee(int baseSalary, int hourlyRate) {
        setBaseSalary(baseSalary);
        setHourlyRate(hourlyRate);
    }

    public int calculateWage(int extraHours){
        return baseSalary + (hourlyRate * extraHours);
    }

    public int calculateWage(){
        return calculateWage(0);
    }

    private void setBaseSalary(int baseSalary){                                 // Setting methods that we don't need outside the class
        if (baseSalary <= 0)                                                    // to private reduces coupling and helps keep
            throw new IllegalArgumentException("Salary cannot be 0 or less");   // the code maintainable
        this.baseSalary = baseSalary;
    }

    private int getBaseSalary(){                         // These are very common methods in Java and are typically called
        return baseSalary;                              // getters and setters
    }

    private void setHourlyRate(int hourlyRate){
        if (hourlyRate <= 0)
            throw new IllegalArgumentException("Hourly rate cannot be 0 or less");
        this.hourlyRate = hourlyRate;
    }

    private int getHourlyRate(){
        return hourlyRate;
    }


}



