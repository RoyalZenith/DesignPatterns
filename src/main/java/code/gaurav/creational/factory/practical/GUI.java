package code.gaurav.creational.factory.practical;

public class GUI {
    public static IFactory createFactory(String type){
        // from abstract factory move if-else-if logic to helper class to make it practical factory.
        return new praticalHelper().getFactory(type);
    }
}
