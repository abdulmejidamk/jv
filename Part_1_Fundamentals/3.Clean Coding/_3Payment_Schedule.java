import java.util.Scanner;
import java.text.NumberFormat;

public class _3Payment_Schedule {
    final static byte monthes_in_year = 12;
    final static byte percent = 100;
    public static void main(String[] args) {
    //    Scanner scan = new Scanner(System.in);
       double mortgage;

    double Principal = readNumber("Principal: ", 1000, 1_000_000);
    float annualRate =(float) readNumber("Annual Interest Rate: " , 1, 30);
    byte period =(byte) readNumber("Years: " , 1, 30);     
                
    mortgage = calculateMortgage(Principal, annualRate, period);
    String MORTGAGE = NumberFormat.getCurrencyInstance().format(mortgage);
            
    viewInfo(MORTGAGE);

        for (short i = 1; i <= period * monthes_in_year; i++) {
            double balance = calculateBalalce(Principal, annualRate, period, i);
            System.out.println(NumberFormat.getCurrencyInstance().format(balance)); 
        } 
    }

private static void viewInfo(String MORTGAGE) {
        System.out.println("\nMORTGAGE");
          System.out.println("--------");
          System.out.println("Monthly Payment: "+MORTGAGE);
         
      System.out.println("\nPAYMENT SCHEDULE");
      System.out.println("------------------");
    }

  public static double calculateBalalce(double Principal, float annualRate, byte period, short number_of_payments_made){
          double number_of_payment = period * monthes_in_year;
          float monthlyRate = (annualRate / percent) / monthes_in_year;
      
          double balance = Principal *
                          (Math.pow(1+monthlyRate, number_of_payment) - Math.pow(1+monthlyRate, number_of_payments_made)) / (Math.pow (1+monthlyRate, number_of_payment)-1) ; 
    return balance;
  }
    
public static double calculateMortgage(double Principal, float annualRate, byte period){
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
