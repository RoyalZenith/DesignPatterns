package code.gaurav.creational.factory.practical;

public class WindowButton implements Button {
    @Override
    public Button onclick() {
        System.out.println("Window button gets created");
        return new WindowButton();
    }
}
