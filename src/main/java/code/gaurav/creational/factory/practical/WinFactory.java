package code.gaurav.creational.factory.practical;

public class WinFactory implements IFactory {
    @Override
    public Button createButton() {
        return new WindowButton();
    }

    @Override
    public TextBox showTextBox() {
        return new WinTextBox();
    }
}
