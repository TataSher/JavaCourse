package bankerPack;

import java.util.ArrayList;

public class BankAccount {
    private String name ;
    private Integer balance;
    private ArrayList transactions = new ArrayList();

    public BankAccount (String name) {
        this.name = name;
        this.balance = 0;
        this.transactions = transactions;
    }
    ArrayList showTransactions () { return transactions; }
    Integer showBalance () {
        return balance;
    }
    String showName () {
        return name;
    }

    void deposit (Integer amount) {
      Transaction transaction = new Transaction(amount);
        transactions.add(transaction);
    }

    void withdrawal (Integer amount) {
        Transaction transaction = new Transaction(amount);
        transactions.add(transaction);
    }

    public String printStatement () {
        return "Account Holder: " + name +"\ndate| deposit | withdrawal | balance";
    }

}
