package code.gaurav.creational.singleton;

public class EagerSingleton {
    //eagar initalization
    private static final EagerSingleton instance = new EagerSingleton();
    private EagerSingleton(){}

    public EagerSingleton getInstance(){
        return instance;
    }

    // Pros : It is thread safe.
    // Cons : it will increase app startup time as it will initialize on start up.

}
