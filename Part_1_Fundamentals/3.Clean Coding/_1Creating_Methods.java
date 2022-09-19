public class _1Creating_Methods {
    public static void main(String[] args) {
        greetUser("Abdulmejid");
        greetUser("Helwa");
        greetUser("Muhadi");
        greetUser("Abdulmejid", "Kedir");
        System.out.println(gString(" Capital HELWA"));

        // alternatively 

        String returnedString = gString(" Small Helwa");

        System.out.println(returnedString);
    }

    public static void greetUser(String name){
        System.out.println("Hello "+ name );
    }
    public static void greetUser(String firstName, String lastName){
        System.out.println("Hello "+ firstName +" "+ lastName );
    }

    public static String gString(String NAME){
        return "returned > String  Hello "+ NAME;
    }









}
