public class _2Strings {
    public static void main(String[] args) {
        // Strings

        String message = "Hello";
        String name = "  Abdulmejid";

        System.out.println(message+" World");

        System.out.println(message.endsWith("d"));
        System.out.println(message.startsWith("f"));
        System.out.println(message.length());
        System.out.println(message.indexOf('H'));
        System.out.println(message.indexOf('r'));
        System.out.println(message.replace('l', 'a'));
        System.out.println(message);
        System.out.println(message.toLowerCase());
        System.out.println(message.toUpperCase());
        System.out.println(name.trim());

    }
}
