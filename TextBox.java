public class TextBox extends UIControl {
    // add extends UIControl to inherit 
    private String text;

    public TextBox(){
        System.out.println("TextBox");
    }

    public void setText(String text){
        this.text = text;
    }

    public void clear(){
        text = "";
    }
}
