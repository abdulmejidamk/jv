public class Main {
    public static void main(String[] args) {
//        var textbox = new TextBox();
//        textbox.setText("Hello");
//        System.out.println(textbox.toString());

//        var poin1 = new Point(1,2);
//        var poin2 = new Point(1,2);
//
//        /* now we override .equals method to compare the two objects
//            b/c .equals and == compare based on references
//            >>> but we need to compare using coordinates so we override the
//            method*/
//        System.out.println(poin1.equals(poin2));
//        System.out.println(poin1.equals(poin2));
//        System.out.println(poin1.hashCode());
//        System.out.println(poin2.hashCode());

        UIControl [] controls = new UIControl[]{new TextBox(), new CheckBox()};
       for(var control : controls){
           control.render();
       }



    }
}