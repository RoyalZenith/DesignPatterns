package code.gaurav.behavioural.observer;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class User implements Observer{
    private double id;

    public User(double id){
        this.id =id;
    }

    @Override
    public void notifyUser(String msg) {
        System.out.println("User " +this.id + " Message received :" +msg);
    }
}
