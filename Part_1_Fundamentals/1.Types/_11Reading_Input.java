import java.util.Scanner;

public class _11Reading_Input {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // System.out.print("Age: ");
        // byte age = scan.nextByte();
        // System.out.println("Your Age is: "+age);
    
        
        // Trim method 

        System.out.println("Enter your Name: ");
        String g = scan.nextLine().trim();
        System.out.println(g);
        scan.close();
        
    }
}
