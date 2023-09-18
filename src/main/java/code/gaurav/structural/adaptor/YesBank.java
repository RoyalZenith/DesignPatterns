package code.gaurav.structural.adaptor;

public class YesBank implements Banking{
    @Override
    public boolean transferMoney(int from, int to, int money) {
        System.out.println("Yes Bank, money transferred");
        return true;
    }

    @Override
    public int fetchBalance(int accNo) {

        System.out.println("Yes Bank, Amount: "+40);
        return 50000;
    }

    @Override
    public int registerAccount(String name) {

        System.out.println("Yes Bank, Account opened");
        return 12;
    }
}
