package code.gaurav.structural.adaptor;

public interface Banking {
    boolean transferMoney(int from, int to, int money);
    int fetchBalance(int accNo);

    int registerAccount(String name);


}
