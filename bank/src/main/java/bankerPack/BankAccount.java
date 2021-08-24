package bankerPack;

public class BankAccount {
    private String name;
    private Integer balance;

    public BankAccount (String name) {
        this.name = name;
        this.balance = 0;
    }

    public String showName () {
        return name;
    }
    public Integer showBalance () {
        return balance;
    }

}
