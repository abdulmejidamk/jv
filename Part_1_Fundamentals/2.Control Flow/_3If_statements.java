public class _3If_statements {
    public static void main(String[] args) {
        
        int temp = 32;

        if (temp > 30) {
            System.out.println("it's hot");
            System.out.println("Drink Water!");
        }
        else if(temp > 20){
            System.out.println("Beautiful Day");
        }
        else{
            System.out.println("Cold Day");
        }

        // simplifying if statement

        int income = 20_000;
        boolean hasHighIncome = (income > 100_000);
        System.out.println(hasHighIncome);

    }
}
