package code.gaurav.creational.factory.practical;

public class MacButton implements Button {

    @Override
    public Button onclick() {
        System.out.println("Mac button gets created");
        return new MacButton();
    }
}
