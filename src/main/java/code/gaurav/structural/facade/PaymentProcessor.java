package code.gaurav.structural.facade;

import org.springframework.stereotype.Component;

@Component
public class PaymentProcessor {
    public void pay(){
        System.out.println("Payment done");
    }
}
