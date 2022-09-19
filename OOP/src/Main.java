import java.util.Locale;

public class Main {
    public static void main(String[] args) {

       // creating objects
        TextBox textBox1 = new TextBox();
        // Alternatively using the word 'var;
        var textBox2 = new TextBox();

        textBox1.setText("Box-1");

        System.out.println(textBox1.text.toUpperCase());

        textBox2.setText("Box-2");

        System.out.println(textBox2.text);

    }
}