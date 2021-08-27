package bankerPack;

import java.util.ArrayList;

public class BankAccount {
    private float balance = 0;
    private String name ;
    private ArrayList transactions = new ArrayList();

    public BankAccount (String name) {
        this.name = name;
        this.balance = 0;
        this.transactions = transactions;
        this.balance = balance;
    }
    ArrayList getTransactions () { return transactions; }

    String getName () { return name; }

    void deposit (float amount) {
        Transaction transaction = new Transaction(amount);
        transactions.add(transaction);
        setBalance(transaction.getAmount());
    }

    void withdrawal (float amount) {
        if (balance <= amount) {
            throw new ArithmeticException("Insufficient Funds");
        }
        Transaction transaction = new Transaction(-Math.abs(amount));
        transactions.add(transaction);
        setBalance(transaction.getAmount());
    }


    public String printStatement () {
        Statement statement = new Statement(this);
        return statement.print();
    }

    public void setBalance(float amount) {
        balance += amount;
    }

    public float getBalance() {
        return balance;
    }

}
