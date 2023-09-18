package code.gaurav.structural.facade;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class WareHouse {

    @Autowired
    private Inventory inventory;
    @Autowired
    private RecommendService recommendService;
    public void check(){
        inventory.available();
        recommendService.recommend();


    }
}
