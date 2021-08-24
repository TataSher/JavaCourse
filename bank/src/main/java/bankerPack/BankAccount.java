package bankerPack;

import java.util.ArrayList;

public class BankAccount {
    private String name;
    private Integer balance;
    private ArrayList transactions = new ArrayList();

    public BankAccount (String name) {
        this.name = name;
        this.balance = 0;
        this.transactions = transactions;
    }

    public String showName () {
        return name;
    }
    public Integer showBalance () {
        return balance;
    }

    public void deposit (Integer amount) {
      Transaction transaction = new Transaction(amount);
        transactions.add(transaction);
    }

    public String showTransactions () {
        return "date: 24-08-2021 deposit: 100$";
    }

    public String printStatement () {
        return "Account Holder: " + name +"\ndate| deposit | withdrawal | balance";
    }

}
