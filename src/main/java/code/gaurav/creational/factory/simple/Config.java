package code.gaurav.creational.factory.simple;

public abstract class Config {
    public void rendorWindow(){
        Button button = createButton();
        button.rendor();
    }
    public abstract Button createButton();
}
