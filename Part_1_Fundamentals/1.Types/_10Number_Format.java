import java.text.NumberFormat;

public class _10Number_Format {
    public static void main(String[] args) {
        // NumberFormat is an abstract class it can't be instantiated


        // Dollar sign formating
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        
        String result = currency.format(1234567.891);
        System.out.println(result);

        // Percent instance

        NumberFormat percent = NumberFormat.getPercentInstance();
        String result2 = percent.format(0.2);
        System.out.println(result2);

        // Method chaining

        String result3 = NumberFormat.getPercentInstance().format(0.23);
        System.out.println(result3);
    }
}
