package code.gaurav.creational.singleton;

public class LazySingletonOne {
    private  static LazySingletonOne instance = null;
    private LazySingletonOne(){}

    public static LazySingletonOne getInstance(){
        if(instance==null){
            instance = new LazySingletonOne();
        }
        return instance;
    }

    //Cons : not a thread safe
}
