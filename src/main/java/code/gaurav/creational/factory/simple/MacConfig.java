package code.gaurav.creational.factory.simple;

public class MacConfig extends Config{

    @Override
    public Button createButton() {
        return new MacButton();
    }
}
