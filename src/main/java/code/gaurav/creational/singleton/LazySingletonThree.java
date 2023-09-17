package code.gaurav.creational.singleton;

public class LazySingletonThree {
    private static LazySingletonThree instance = null;
    private LazySingletonThree(){}

    public static LazySingletonThree getInstance(){
        synchronized (LazySingletonThree.class){
            if(instance==null){
                instance = new LazySingletonThree();
            }
        }
        return instance;
    }
}
