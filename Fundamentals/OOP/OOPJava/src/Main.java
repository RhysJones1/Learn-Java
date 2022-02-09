import java.util.Locale;

public class Main {
    public static void main(String[] args){

        // Create a text object
        var textBox1 = new TextBox();
        textBox1.setText("Box 1");
        System.out.println(textBox1.text.toUpperCase(Locale.ROOT));

        // Create another text object
        var textBox2 = new TextBox();
        textBox2.setText("Box 2");
        System.out.println(textBox2.text);
    }
}

/*
Memory Allocation: What's happening under the hood when we create new Java Objects?
You have different areas where memory is stored

1: First you have the heap. This is where objects are stored
2: Stack: This is where your short terms things get stored such as short-lived variables
 and primitives as well as variables that store references to objects on the heap



 */
