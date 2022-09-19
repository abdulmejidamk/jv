import java.util.Scanner;
public class _10Break_Continue {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);        
        String input ="";
      
        // break
        while (true){
            System.out.println("Input: ");
            input = scan.nextLine().toLowerCase();
                if(input.equals("pass"))
                    continue;
                if (input.equals("quit")) 
                    break;
                
            System.out.println(input);
        }
        
      scan.close();
       
    }
}
