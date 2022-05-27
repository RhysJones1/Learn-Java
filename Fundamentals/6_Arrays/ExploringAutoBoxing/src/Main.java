import java.util.ArrayList;

public class Main {

    // Handy when you want to use primative data types within your Array lists

    public static void main(String[] args){
        // Ways to overcome ArrayList for primitive types

        Integer integer = new Integer(54);
        ArrayList<Integer> intArrayList = new ArrayList<Integer>();
        for (int i = 0; i <=10; i++){
            intArrayList.add(Integer.valueOf(i));
        }

        for (int i = 0; i <=10; i++){
            System.out.println(i + "--> " + intArrayList.get(i).intValue());
        }
        // Faster way
        Integer myIntValue = 56; //Integer.valueOf(56); Boxing it under the hood
        int myInt = myIntValue;  // myInt.intValue();   Unboxing under the hood

        ArrayList<Double> myDoubles = new ArrayList<Double>();
        for (double dbl = 0.0; dbl <= 10.0; dbl+= 0.5){
            myDoubles.add(Double.valueOf(dbl));
        }

        for(int i = 0; i < myDoubles.size(); i++){
            double value = myDoubles.get(i).doubleValue();
            System.out.println(i + " -->" + value);
        }
    }




}


