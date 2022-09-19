import java.util.Scanner;

public class _8While_loops {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = "";
        while(!input.equals("quit")){
            System.out.println("Enter name:");
            input = scan.nextLine().toLowerCase();
            System.out.println(input);
        }
        scan.close();
    }
}
