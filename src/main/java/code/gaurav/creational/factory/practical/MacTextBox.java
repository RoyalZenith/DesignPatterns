package code.gaurav.creational.factory.practical;

public class MacTextBox implements TextBox {
    @Override
    public TextBox rendorText() {
        System.out.println("Mac text box is full with love");
        return new MacTextBox();
    }
}
