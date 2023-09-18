package code.gaurav.structural.facade;

import org.springframework.stereotype.Component;

@Component
public class Tracker {
    public void track(){
        System.out.println("tracking start");
    }
}
