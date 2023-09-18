package code.gaurav.behavioural.strategy;

public class Demo {
    public static void main(String[] args) {
        Map mp = new Map(new Train());
        mp.showPath();
    }
}
