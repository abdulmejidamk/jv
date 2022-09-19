public class TextBox extends UIControl {
    // add extends UIControl to inherit
    private String text;

    public TextBox(){
       System.out.println("TextBox");
    }

    @Override
    public void render() {
        System.out.println("Render TextBox");
    }

    @Override
    public String toString(){
        return text;
    }

    public void setText(String text){
        this.text = text;
    }

    public void clear(){
        text = "";
    }
}
