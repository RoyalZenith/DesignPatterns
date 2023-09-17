package code.gaurav.creational.factory.simple;

public class WindowConfig extends Config{
    @Override
    public Button createButton() {
        return new WindowsButton();
    }
}
