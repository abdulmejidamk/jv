import java.util.Scanner;

public class _6Excercise {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter number: ");
        int number = scan.nextInt();

        if (number % 5 == 0 && number % 3 == 0)
        System.out.println("FizBuz");
        else if(number % 5 == 0)
        System.out.println("Fiz");
        else if (number % 3 == 0 )
        System.out.println("Buz");
        else
        System.out.println(number);



        // Alternatively
        if (number % 5 == 0){
            if(number % 3 == 0)
                System.out.println("FizBuz");
            else
                System.out.println("Fiz");
        }
        else if (number % 3 == 0 )
            System.out.println("Buz");
        else
        System.out.println(number);
        scan.close();
    }
}
