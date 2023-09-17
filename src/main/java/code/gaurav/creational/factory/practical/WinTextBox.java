package code.gaurav.creational.factory.practical;

public class WinTextBox implements TextBox {

    @Override
    public TextBox rendorText() {
        System.out.println("Windows text box is empty");
        return new WinTextBox();
    }
}
