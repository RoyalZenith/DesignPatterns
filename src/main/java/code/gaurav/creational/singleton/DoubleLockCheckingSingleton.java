package code.gaurav.creational.singleton;

public class DoubleLockCheckingSingleton {
    private static DoubleLockCheckingSingleton instance = null;
    private DoubleLockCheckingSingleton(){}

    public static DoubleLockCheckingSingleton getInstance(){
        if(instance == null){
            synchronized (DoubleLockCheckingSingleton.class){
                if(instance == null){
                    instance = new DoubleLockCheckingSingleton();
                }
            }
        }
        return instance;
    }

    //Pros = fast and thres safe
}
