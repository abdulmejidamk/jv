public class _8Casting {
    public static void main(String[] args) {

        
        // Any variable stored in short should also be stored in int, b/c int has bigger size, so this should work

        // Implicit Casting (Automatic Conversion)
        // byte > short > int > long > float > double
        short x = 1;
        int y = x + 2;
        System.out.println(y);

        //Explicit casting

        int g = 4;
        double h = 3.2;

        System.out.println((int)h+g); // should give : 3+4 =7 

        String num = "3.21868";
        System.out.println(Float.parseFloat(num) + 2);
        /*
         Integer.parseInt()
         Short.parseShort()
         Double.parseDouble()
         .
         .
         .
         .
         */




    }
}
