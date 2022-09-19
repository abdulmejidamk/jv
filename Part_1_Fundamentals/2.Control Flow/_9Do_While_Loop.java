import java.util.Scanner;

public class _9Do_While_Loop {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);        
    String input ="";
      
        do {
            System.out.println("Input: ");
            input = scan.nextLine().toLowerCase();
            System.out.println(input);
        } while (!input.equals("quit"));
    scan.close();
    }
}
