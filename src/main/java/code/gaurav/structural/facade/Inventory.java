package code.gaurav.structural.facade;

import org.springframework.stereotype.Component;

@Component
public class Inventory {
    public void available(){
        System.out.println("yes, item available");
    }
}
