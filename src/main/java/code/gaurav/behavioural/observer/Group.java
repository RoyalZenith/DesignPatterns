package code.gaurav.behavioural.observer;

import java.util.ArrayList;
import java.util.List;

public class Group implements Observer {
    private List<Observer> list = new ArrayList<>();

    public void subscribe(Observer observer){
        list.add(observer);
    }

    public void unsubscribe(Observer observer){
        list.remove(observer);
    }

    @Override
    public void notifyUser(String msg) {
        for(Observer ob:list){
            ob.notifyUser(msg);
        }
    }
}
