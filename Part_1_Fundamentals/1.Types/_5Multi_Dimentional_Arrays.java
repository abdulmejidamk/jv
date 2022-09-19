import java.util.Arrays;

public class _5Multi_Dimentional_Arrays {
    public static void main(String[] args) {
        
        // 2-D for Matrix
        int [][] matrix = new int [2][3];
        matrix[0][0] = 1;
        matrix[0][1] = 2;
        matrix[0][2] = 3;
        matrix[1][0] = 4;
        matrix[1][1] = 5;
        matrix[1][2] = 6;

        // Printing Multi-Dimentional-Arrays
        System.out.println(Arrays.deepToString(matrix));

        // Printing Multi-Dimentional Arrays using loop

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matrix[i][j]+"  ");
            }
            System.out.println();
        }

    }
    
}