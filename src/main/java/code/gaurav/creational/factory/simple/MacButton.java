package code.gaurav.creational.factory.simple;

public class MacButton implements Button {
    @Override
    public void onclick() {
        System.out.println("Mac button is clicked");
    }

    @Override
    public void rendor() {

        System.out.println("Mac button is rendored");
    }
}
