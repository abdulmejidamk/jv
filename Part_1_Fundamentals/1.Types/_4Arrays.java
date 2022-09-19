import java.util.Arrays;

public class _4Arrays {
    public static void main(String[] args) {
        // Arrays
        int [] numbers = new int[5];
        numbers[0] = 1;
        numbers[1] = 7;
        numbers[2] = 5;
        numbers[3] = 3;
        numbers[4] = 4;

        // System.out.println(numbers);

        // Printing Arrays: use Arrays Class

        System.out.println(Arrays.toString(numbers));

        // Printing Array Mambers using Loop
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i]+"   ");
        }
        
        // Sorting Array using Arrays Class method :- sort
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));
    }
}
