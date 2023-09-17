package code.gaurav.creational.factory.abstracts;

public class Demo {
    public static void main(String[] args) {
        IFactory factory = GUI.createFactory("mac");

        Button button = factory.createButton();
        button.onclick();
        TextBox textBox = factory.showTextBox();
        textBox.rendorText();
    }
}
