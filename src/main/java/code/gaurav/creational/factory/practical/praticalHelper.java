package code.gaurav.creational.factory.practical;

public class praticalHelper {

    public IFactory getFactory(String type) {
        if(type.equals("window")){
            return new WinFactory();
        }else if(type.equals("mac")){
            return new MacFactory();
        }
        return null;
    }
}
