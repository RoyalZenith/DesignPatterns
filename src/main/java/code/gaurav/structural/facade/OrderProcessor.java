package code.gaurav.structural.facade;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class OrderProcessor{

    @Autowired
    private WareHouse wareHouse;
    @Autowired
    private PaymentProcessor paymentProcessor;
    @Autowired
    private Tracker tracker;

    public void process(){
        wareHouse.check();
        paymentProcessor.pay();
        tracker.track();

    }

}
