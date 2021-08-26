package bankerPack;

import java.util.ArrayList;

public class BankAccount {
    private Integer balance = 0;
    private String name ;
    private ArrayList transactions = new ArrayList();

    public BankAccount (String name) {
        this.name = name;
        this.balance = 0;
        this.transactions = transactions;
        this.balance = balance;
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
        Statement statement = new Statement(this);
        return statement.print();
    }

    public void addBalance(Integer amount) {
        balance += amount;
    }

    public Integer showFinalBalance() {
        return balance;
    }

}
