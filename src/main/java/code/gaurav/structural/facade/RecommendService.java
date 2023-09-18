package code.gaurav.structural.facade;

import lombok.extern.apachecommons.CommonsLog;
import org.springframework.stereotype.Component;

@Component
public class RecommendService {
    public void recommend(){
        System.out.println("item recommended");
    }
}
