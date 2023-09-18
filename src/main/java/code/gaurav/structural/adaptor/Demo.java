package code.gaurav.structural.adaptor;

public class Demo {
    public static void main(String[] args) {
        // we are passing icici bank object, will pass yes bank object orderManager future if something bad happen with icici bank
        PhonePe phonePe = new PhonePe(new YesBank());
        // use phonepe object;
        phonePe.getBanking().fetchBalance(12);
        phonePe.getBanking().transferMoney(11,12,200);
        phonePe.getBanking().registerAccount("Gaurav");


    }
}
