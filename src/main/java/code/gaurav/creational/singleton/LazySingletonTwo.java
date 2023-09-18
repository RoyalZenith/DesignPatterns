package code.gaurav.creational.singleton;

public class LazySingletonTwo {
    private LazySingletonTwo instance = null;
    private LazySingletonTwo(){}

    public synchronized LazySingletonTwo getInstance(){
        if(instance==null){
            instance = new LazySingletonTwo();
        }
        return instance;
    }

    // Pros: thread safe
    // Cons : slow orderManager performance
}
