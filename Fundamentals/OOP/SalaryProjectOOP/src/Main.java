public class Main {
    public static void main(String [] args){
        var employee = new Employee(
                50_000, 20);
        int wage = employee.calculateWage();
        System.out.println(wage);


        //var browser = new Browser();
    }
}


    /*
    Encapsulation: bundle the data and methods that operate
    on the data in a single unit or object
     */

    /*
    Abstraction: Reduce complexity by hiding unnecessary details
     */

    /*
    Coupling: How much a class is dependent on or coupled
    with another class. The more Classes are coupled the more issues
    can occur when changes are made. Reducing coupling reduces the impact of changes
     */

    /*
    Method Overloading: Creating different implementations but with different parameters
     */

    /*
    We are going to take the ProceduralExample Class
    and improve it with the first principle of
    OOP: Encapsulation

    We have variables set within the main method,
    and we also call them as arguments in the
    calculateWage method. Encapsulation can be used
    to bundle these together into a single unit
     */
