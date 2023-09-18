package code.gaurav.structural.facade;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderImplmentation implements orderManager {
    @Autowired
    OrderProcessor orderProcessor;


    @Override
    public void createOrder() {
        //check in warehouse for availability
        //reduced the cnt from inventory
        //collect payment
        //track
        //--------------
        // if we maintain all of thing here this class becomes complex and difficult to handle
        // so create a facade class orderProcessor and do process the order there
        orderProcessor.process();
    }
}
