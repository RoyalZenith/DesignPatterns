package code.gaurav.structural.adaptor;

public class ICICIBank implements Banking{
    @Override
    public boolean transferMoney(int from, int to, int money) {
        System.out.println("ICICI Bank, Money transferred");
        return true;
    }

    @Override
    public int fetchBalance(int accNo) {

        System.out.println("ICICI Bank, Amount "+300);
        return 300;
    }

    @Override
    public int registerAccount(String name) {
        System.out.println("ICICI Bank, account created");
        return 13;
    }
}
