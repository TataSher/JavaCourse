package bankerPack;

import java.util.ArrayList;

public class BankAccount {
    private int balance = 0;
    private String name ;
    private ArrayList transactions = new ArrayList();

    public BankAccount (String name) {
        this.name = name;
        this.balance = 0;
        this.transactions = transactions;
        this.balance = balance;
    }
    ArrayList getTransactions () { return transactions; }
    int showBalance () {
        return balance;
    }
    String showName () {
        return name;
    }

    void deposit (int amount) {
      Transaction transaction = new Transaction(amount);
        transactions.add(transaction);
        setBalance(transaction.showAmount());
    }

    void withdrawal (int amount) {
        Transaction transaction = new Transaction(-Math.abs(amount));
        transactions.add(transaction);
        setBalance(transaction.showAmount());
    }


    public String printStatement () {
        Statement statement = new Statement(this);
        return statement.print();
    }

    public void setBalance(int amount) {
        balance += amount;
    }

    public int getBalance() {
        return balance;
    }

}
