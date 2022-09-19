public class _9Math_Class {
    public static void main(String[] args) {
        
        System.out.println(Math.round(3.14));
        System.out.println(Math.round(3.54F));
        System.out.println(Math.ceil(3.5));
        System.out.println(Math.floor(6.02));
        System.out.println(Math.max(45, 5));

        // Random
        System.out.println(Math.random()); // Floating b/n 0 and 1
        System.out.println(Math.random()*100); // Floating b/n 0 and 100
        System.out.println((int)(Math.random()*100));
        System.out.println(Math.round(Math.random()*100));
    }
}
