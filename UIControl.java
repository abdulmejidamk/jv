public class UIControl {
    private boolean isEnabled = true;

    public UIControl(){
        System.out.println("UIControl");
    }
    public void enable(){
        isEnabled = true;
    }

    public void disable(){
        isEnabled = false;
    }

    // we need a getter to read the value of the field isEnabled 
    // b/c it is private field

    public boolean isEnabled(){
        return isEnabled;
    }
}
