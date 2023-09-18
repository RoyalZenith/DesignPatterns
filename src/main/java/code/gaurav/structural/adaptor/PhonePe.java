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

    public void getBalance(int a){
        banking.fetchBalance(a);
    }
    public void createAccount(String name){
        banking.registerAccount(name);
    }
    public void transferMoney(int a, int b, int money){
        banking.transferMoney(a,b,money);
    }
}
