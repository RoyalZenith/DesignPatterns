package code.gaurav.creational.factory.abstracts;

public class MacButton implements Button{

    @Override
    public Button onclick() {
        System.out.println("Mac button gets created");
        return new MacButton();
    }
}
