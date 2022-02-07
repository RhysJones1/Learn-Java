public class Constants {
    public static void main(String[] args){
    // sometimes we don't want to change a variable in it's lifetime

        final float pi = 3.14F;         // adding final ensures that no one changed our variable
        //pi = 1;                       // This won't compile as we declared pi as final
    }
}
