package code.gaurav.structural.adaptor;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PhonePe {
    private Banking banking;
    public PhonePe(Banking banking){
        this.banking = banking;
    }
}
