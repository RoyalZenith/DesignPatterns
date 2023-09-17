package code.gaurav.creational.factory.simple;

public class WindowsButton implements Button{

    @Override
    public void onclick() {
        System.out.println("Window button is clicked");
    }

    @Override
    public void rendor() {
        System.out.println("Window button is rendored");
    }
}
