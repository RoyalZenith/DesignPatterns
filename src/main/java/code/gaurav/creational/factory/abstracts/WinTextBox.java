package code.gaurav.creational.factory.abstracts;

public class WinTextBox implements TextBox{

    @Override
    public TextBox rendorText() {
        System.out.println("Windows text box is empty");
        return new WinTextBox();
    }
}
