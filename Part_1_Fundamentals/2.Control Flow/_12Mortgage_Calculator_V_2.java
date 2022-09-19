import java.util.Scanner;
import java.text.NumberFormat;
public class _12Mortgage_Calculator_V_2 {
    public static void main(String[] args) {
       final byte monthes_in_year = 12;
       final byte percent = 100;
       double Principal;
       float annualRate;
       byte period;
       float monthlyRate;
       double number_of_payment;
       double mortgage;

        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.print("Enter Principal: ");
               Principal = scan.nextDouble();
            if(Principal >=1000 && Principal <= 1_000_000)
                break;
            System.out.println("Enter Avalue Between 1000 and 1_000_000");
        }

        while (true) {
            System.out.print("Enter Annual Interest Rate: ");
            annualRate = scan.nextFloat();    
            if(annualRate >= 1 && annualRate <= 30){
                monthlyRate = (annualRate / percent) / monthes_in_year;
                break;
            }
            System.out.println("Enter A value Between 1 and 30");
        }

        while(true){
            System.out.print("Enter Number of Years: ");
            period = scan.nextByte();
            if(period >=1 && period <=30){
                number_of_payment = period * monthes_in_year;
                break;
            }
            System.out.println("Enter A value Between 1 and 30");
        }

          
         mortgage = (Principal * monthlyRate * (Math.pow(1+monthlyRate, number_of_payment))) / (Math.pow(1+monthlyRate, number_of_payment)-1);

        String MORTGAGE = NumberFormat.getCurrencyInstance().format(mortgage);


        System.out.println("Mortgage: "+MORTGAGE);
              
        scan.close();
    }
}
