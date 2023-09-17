package code.gaurav.creational.factory.abstracts;

public class WindowButton implements Button{
    @Override
    public Button onclick() {
        System.out.println("Window button gets created");
        return new WindowButton();
    }
}
