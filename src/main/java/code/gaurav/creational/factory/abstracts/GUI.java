package code.gaurav.creational.factory.abstracts;

public class GUI {
    public static IFactory createFactory(String type){
        if(type.equals("window")){
            return new WinFactory();
        }else if(type.equals("mac")){
            return new MacFactory();
        }
        return new MacFactory();
    }
}
