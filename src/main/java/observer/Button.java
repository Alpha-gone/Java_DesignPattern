package observer;

public class Button {
    private String name;
    private IButtonListener buttonListener;
    
    public Button(String name){
        this.name = name;
    }
    
    public void addListener(IButtonListener iButtonListener){
        this.buttonListener = iButtonListener;
    }
    
    public void click(String mesasge){
        buttonListener.clickEvent(mesasge);
    }
}
