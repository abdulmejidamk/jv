import java.text.NumberFormat;
import java.util.Scanner;

public class _12Mortgage_Calculator {
    public static void main(String[] args) {
       final byte monthes_in_year = 12;
       final byte percent = 100;
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter Principal: ");
        double Principal = scan.nextDouble();

        System.out.print("Enter Annual Interest Rate: ");
        float annualRate = scan.nextFloat();

        System.out.print("Enter Number of Years: ");
        byte period = scan.nextByte();

        float monthlyRate = (annualRate / percent) / monthes_in_year;
        double number_of_payment = period * monthes_in_year;

        double mortgage = (Principal * monthlyRate * (Math.pow(1+monthlyRate, number_of_payment))) / (Math.pow(1+monthlyRate, number_of_payment)-1);

        String MORTGAGE = NumberFormat.getCurrencyInstance().format(mortgage);


        System.out.println(MORTGAGE);
              
        scan.close();
    }
}
