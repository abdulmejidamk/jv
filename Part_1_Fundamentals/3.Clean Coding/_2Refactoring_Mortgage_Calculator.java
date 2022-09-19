import java.util.Scanner;
import java.text.NumberFormat;

public class _2Refactoring_Mortgage_Calculator {
    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
       double mortgage;

    double Principal = readNumber("Principal: ", 1000, 1_000_000);
    float annualRate =(float) readNumber("Annual Interest Rate: " , 1, 30);
    byte period =(byte) readNumber("Years: " , 1, 30);     
                  mortgage = calculateMortgage(Principal, annualRate, period);
                  String MORTGAGE = NumberFormat.getCurrencyInstance().format(mortgage);
                  System.out.println("Mortgage: "+MORTGAGE);
    }

    public static double calculateMortgage(double Principal, float annualRate, byte period){
       final byte monthes_in_year = 12;
       final byte percent = 100;

        double number_of_payment = period * monthes_in_year;
       float monthlyRate = (annualRate / percent) / monthes_in_year;
       double mortgage = (Principal * monthlyRate * (Math.pow(1+monthlyRate, number_of_payment))) / (Math.pow(1+monthlyRate, number_of_payment)-1);

       return mortgage;
    }

    public static double readNumber(String prompt, double min, double max){
        Scanner scan = new Scanner(System.in);
        double value;
        while(true){
            System.out.print(prompt);
            value = scan.nextDouble();
            if(value >=min && value <=max)
            break;                       
            System.out.println("Enter A value Between "+min+" and "+ max);
        }
        return value;
    }
}
